package com.tencent.kinda.framework.widget.tools;

/* loaded from: classes9.dex */
public class KindaTouchDelegate extends android.view.TouchDelegate {
    private boolean delegateTargeted;
    private java.util.ArrayList<com.tencent.kinda.framework.widget.tools.KindaTouchDelegate.DelegateInfo> delegates;
    private int slop;
    private com.tencent.kinda.framework.widget.tools.KindaTouchDelegate.DelegateInfo targetInfo;

    /* loaded from: classes9.dex */
    public class DelegateInfo {
        android.graphics.Rect bounds;
        android.graphics.Rect slopBounds;
        android.view.View view;

        public DelegateInfo() {
        }
    }

    public KindaTouchDelegate(android.graphics.Rect rect, android.view.View view) {
        super(rect, view);
        java.util.ArrayList<com.tencent.kinda.framework.widget.tools.KindaTouchDelegate.DelegateInfo> arrayList = new java.util.ArrayList<>();
        this.delegates = arrayList;
        this.targetInfo = null;
        arrayList.clear();
        this.slop = android.view.ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        addDelegate(rect, view);
    }

    public void addDelegate(android.graphics.Rect rect, android.view.View view) {
        com.tencent.kinda.framework.widget.tools.KindaTouchDelegate.DelegateInfo delegateInfo = new com.tencent.kinda.framework.widget.tools.KindaTouchDelegate.DelegateInfo();
        delegateInfo.view = view;
        delegateInfo.bounds = rect;
        android.graphics.Rect rect2 = new android.graphics.Rect(rect);
        delegateInfo.slopBounds = rect2;
        int i17 = this.slop;
        rect2.inset(-i17, -i17);
        for (int i18 = 0; i18 < this.delegates.size(); i18++) {
            if (this.delegates.get(i18).view == delegateInfo.view) {
                this.delegates.set(i18, delegateInfo);
                return;
            }
        }
        this.delegates.add(0, delegateInfo);
    }

    @Override // android.view.TouchDelegate
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z17;
        com.tencent.kinda.framework.widget.tools.KindaTouchDelegate.DelegateInfo delegateInfo;
        int x17 = (int) motionEvent.getX();
        int y17 = (int) motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        boolean z18 = true;
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                if (actionMasked == 3) {
                    z17 = this.delegateTargeted;
                    this.delegateTargeted = false;
                    this.targetInfo = null;
                } else if (actionMasked != 5 && actionMasked != 6) {
                    z17 = false;
                }
            }
            boolean z19 = this.delegateTargeted;
            if (z19) {
                com.tencent.kinda.framework.widget.tools.KindaTouchDelegate.DelegateInfo delegateInfo2 = this.targetInfo;
                if (delegateInfo2 == null) {
                    return false;
                }
                z18 = delegateInfo2.slopBounds.contains(x17, y17);
            }
            z17 = z19;
        } else {
            this.delegateTargeted = false;
            this.targetInfo = null;
            java.util.Iterator<com.tencent.kinda.framework.widget.tools.KindaTouchDelegate.DelegateInfo> it = this.delegates.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.tencent.kinda.framework.widget.tools.KindaTouchDelegate.DelegateInfo next = it.next();
                if (next.bounds.contains(x17, y17)) {
                    this.targetInfo = next;
                    this.delegateTargeted = true;
                    break;
                }
            }
            z17 = this.delegateTargeted;
        }
        if (!z17 || (delegateInfo = this.targetInfo) == null) {
            return false;
        }
        if (z18) {
            motionEvent.setLocation(delegateInfo.view.getWidth() / 2, this.targetInfo.view.getHeight() / 2);
        } else {
            int i17 = this.slop;
            motionEvent.setLocation(-(i17 * 2), -(i17 * 2));
        }
        return this.targetInfo.view.dispatchTouchEvent(motionEvent);
    }
}
