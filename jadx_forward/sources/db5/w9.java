package db5;

/* loaded from: classes11.dex */
public final class w9 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21536x74125e7f f310098d;

    public w9(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21536x74125e7f c21536x74125e7f) {
        this.f310098d = c21536x74125e7f;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        em.t1 m79303x3759ea4f;
        em.t1 m79303x3759ea4f2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/WeAgreementCheckBox$initListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 1) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21536x74125e7f c21536x74125e7f = this.f310098d;
            m79303x3759ea4f = c21536x74125e7f.m79303x3759ea4f();
            android.widget.TextView b17 = m79303x3759ea4f.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getTvText(...)");
            if (!c21536x74125e7f.c(b17, motionEvent)) {
                m79303x3759ea4f2 = c21536x74125e7f.m79303x3759ea4f();
                m79303x3759ea4f2.a().toggle();
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/ui/base/WeAgreementCheckBox$initListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
