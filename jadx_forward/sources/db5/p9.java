package db5;

/* loaded from: classes8.dex */
public class p9 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21535xbb7029d1 f310005d;

    public p9(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21535xbb7029d1 c21535xbb7029d1) {
        this.f310005d = c21535xbb7029d1;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/VoiceSearchEditText$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21535xbb7029d1 c21535xbb7029d1 = this.f310005d;
        if (c21535xbb7029d1.getCompoundDrawables()[2] == null) {
            yj0.a.i(false, this, "com/tencent/mm/ui/base/VoiceSearchEditText$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (motionEvent.getAction() != 1) {
            yj0.a.i(true, this, "com/tencent/mm/ui/base/VoiceSearchEditText$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
        c21535xbb7029d1.f279263m = true;
        if (c21535xbb7029d1.f279260g && c21535xbb7029d1.f279261h && c21535xbb7029d1.getText().toString().equals("")) {
            if (motionEvent.getX() <= ((c21535xbb7029d1.getWidth() - c21535xbb7029d1.getPaddingRight()) - c21535xbb7029d1.f279257d.getIntrinsicWidth()) - i65.a.b(c21535xbb7029d1.f279262i, 25)) {
                c21535xbb7029d1.requestFocus();
                if (c21535xbb7029d1.getContext() instanceof android.app.Activity) {
                    com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf.m78475x7b383410((android.app.Activity) c21535xbb7029d1.getContext());
                }
                android.view.View.OnClickListener onClickListener = c21535xbb7029d1.f279259f;
                if (onClickListener != null) {
                    onClickListener.onClick(null);
                }
            } else if (c21535xbb7029d1.f279259f != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceSearchEditText", "user clicked voice button");
                if (c21535xbb7029d1.getContext() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                    ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) c21535xbb7029d1.getContext()).mo53060x36654fab(c21535xbb7029d1);
                }
                c21535xbb7029d1.f279259f.onClick(c21535xbb7029d1);
                yj0.a.i(true, this, "com/tencent/mm/ui/base/VoiceSearchEditText$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return true;
            }
        } else if (c21535xbb7029d1.getText().toString().length() <= 0) {
            android.view.View.OnClickListener onClickListener2 = c21535xbb7029d1.f279259f;
            if (onClickListener2 != null) {
                onClickListener2.onClick(null);
            }
        } else if (motionEvent.getX() > ((c21535xbb7029d1.getWidth() - c21535xbb7029d1.getPaddingRight()) - c21535xbb7029d1.f279258e.getIntrinsicWidth()) - i65.a.b(c21535xbb7029d1.f279262i, 25)) {
            c21535xbb7029d1.setText("");
            c21535xbb7029d1.getClass();
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21535xbb7029d1.a(c21535xbb7029d1);
        } else if (!c21535xbb7029d1.isFocused()) {
            c21535xbb7029d1.requestFocus();
            if (c21535xbb7029d1.getContext() instanceof android.app.Activity) {
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf.m78475x7b383410((android.app.Activity) c21535xbb7029d1.getContext());
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/base/VoiceSearchEditText$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
