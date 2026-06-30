package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes8.dex */
public class o1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.C19641xd487040e f272445d;

    public o1(com.p314xaae8f345.mm.p2470x93e71c27.ui.C19641xd487040e c19641xd487040e) {
        this.f272445d = c19641xd487040e;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/MMPhoneNumberEditText$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19641xd487040e c19641xd487040e = this.f272445d;
        if (c19641xd487040e.getCompoundDrawables()[2] == null) {
            yj0.a.i(false, this, "com/tencent/mm/pluginsdk/ui/MMPhoneNumberEditText$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (motionEvent.getAction() == 1 && motionEvent.getX() > (c19641xd487040e.getWidth() - c19641xd487040e.getPaddingRight()) - c19641xd487040e.f271310d.getIntrinsicWidth()) {
            if (c19641xd487040e.isFocused()) {
                c19641xd487040e.setText("");
                c19641xd487040e.setCompoundDrawablesWithIntrinsicBounds(c19641xd487040e.getCompoundDrawables()[0], c19641xd487040e.getCompoundDrawables()[1], (android.graphics.drawable.Drawable) null, c19641xd487040e.getCompoundDrawables()[3]);
            } else {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.r1 r1Var = c19641xd487040e.f271311e;
                if (r1Var != null) {
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9 c19645x574159e9 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9) r1Var;
                    if (c19641xd487040e.f271312f) {
                        db5.e1.j(c19645x574159e9.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.fwc, 0, com.p314xaae8f345.mm.R.C30867xcad56011.fwb, com.p314xaae8f345.mm.R.C30867xcad56011.fwa, new com.p314xaae8f345.mm.p2470x93e71c27.ui.d2(c19645x574159e9, c19641xd487040e), null);
                    } else {
                        c19641xd487040e.setText("");
                        com.p314xaae8f345.mm.p2470x93e71c27.ui.h2 h2Var = c19645x574159e9.f271342m;
                        if (h2Var != null) {
                            h2Var.mo67648x3dcbea6f();
                        }
                    }
                }
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/pluginsdk/ui/MMPhoneNumberEditText$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
