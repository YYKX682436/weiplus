package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db;

/* renamed from: com.tencent.kinda.framework.widget.tools.KindaTouchDelegate */
/* loaded from: classes9.dex */
public class C3373xd6442bb7 extends android.view.TouchDelegate {

    /* renamed from: delegateTargeted */
    private boolean f13389x90b94a95;

    /* renamed from: delegates */
    private java.util.ArrayList<com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3373xd6442bb7.DelegateInfo> f13390xe9e5d38e;

    /* renamed from: slop */
    private int f13391x35e9fa;

    /* renamed from: targetInfo */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3373xd6442bb7.DelegateInfo f13392x1cfc19df;

    /* renamed from: com.tencent.kinda.framework.widget.tools.KindaTouchDelegate$DelegateInfo */
    /* loaded from: classes9.dex */
    public class DelegateInfo {

        /* renamed from: bounds */
        android.graphics.Rect f13393xad8df6b5;

        /* renamed from: slopBounds */
        android.graphics.Rect f13394xf02be94f;

        /* renamed from: view */
        android.view.View f13396x373aa5;

        public DelegateInfo() {
        }
    }

    public C3373xd6442bb7(android.graphics.Rect rect, android.view.View view) {
        super(rect, view);
        java.util.ArrayList<com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3373xd6442bb7.DelegateInfo> arrayList = new java.util.ArrayList<>();
        this.f13390xe9e5d38e = arrayList;
        this.f13392x1cfc19df = null;
        arrayList.clear();
        this.f13391x35e9fa = android.view.ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        m27351xf6c38946(rect, view);
    }

    /* renamed from: addDelegate */
    public void m27351xf6c38946(android.graphics.Rect rect, android.view.View view) {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3373xd6442bb7.DelegateInfo delegateInfo = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3373xd6442bb7.DelegateInfo();
        delegateInfo.f13396x373aa5 = view;
        delegateInfo.f13393xad8df6b5 = rect;
        android.graphics.Rect rect2 = new android.graphics.Rect(rect);
        delegateInfo.f13394xf02be94f = rect2;
        int i17 = this.f13391x35e9fa;
        rect2.inset(-i17, -i17);
        for (int i18 = 0; i18 < this.f13390xe9e5d38e.size(); i18++) {
            if (this.f13390xe9e5d38e.get(i18).f13396x373aa5 == delegateInfo.f13396x373aa5) {
                this.f13390xe9e5d38e.set(i18, delegateInfo);
                return;
            }
        }
        this.f13390xe9e5d38e.add(0, delegateInfo);
    }

    @Override // android.view.TouchDelegate
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z17;
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3373xd6442bb7.DelegateInfo delegateInfo;
        int x17 = (int) motionEvent.getX();
        int y17 = (int) motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        boolean z18 = true;
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                if (actionMasked == 3) {
                    z17 = this.f13389x90b94a95;
                    this.f13389x90b94a95 = false;
                    this.f13392x1cfc19df = null;
                } else if (actionMasked != 5 && actionMasked != 6) {
                    z17 = false;
                }
            }
            boolean z19 = this.f13389x90b94a95;
            if (z19) {
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3373xd6442bb7.DelegateInfo delegateInfo2 = this.f13392x1cfc19df;
                if (delegateInfo2 == null) {
                    return false;
                }
                z18 = delegateInfo2.f13394xf02be94f.contains(x17, y17);
            }
            z17 = z19;
        } else {
            this.f13389x90b94a95 = false;
            this.f13392x1cfc19df = null;
            java.util.Iterator<com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3373xd6442bb7.DelegateInfo> it = this.f13390xe9e5d38e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3373xd6442bb7.DelegateInfo next = it.next();
                if (next.f13393xad8df6b5.contains(x17, y17)) {
                    this.f13392x1cfc19df = next;
                    this.f13389x90b94a95 = true;
                    break;
                }
            }
            z17 = this.f13389x90b94a95;
        }
        if (!z17 || (delegateInfo = this.f13392x1cfc19df) == null) {
            return false;
        }
        if (z18) {
            motionEvent.setLocation(delegateInfo.f13396x373aa5.getWidth() / 2, this.f13392x1cfc19df.f13396x373aa5.getHeight() / 2);
        } else {
            int i17 = this.f13391x35e9fa;
            motionEvent.setLocation(-(i17 * 2), -(i17 * 2));
        }
        return this.f13392x1cfc19df.f13396x373aa5.dispatchTouchEvent(motionEvent);
    }
}
