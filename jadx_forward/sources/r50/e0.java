package r50;

/* loaded from: classes5.dex */
public final class e0 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.w2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r50.j0 f474108a;

    public e0(r50.j0 j0Var) {
        this.f474108a = j0Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.w2
    public void a() {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.w2
    public void b(int i17) {
        r50.j0 j0Var = this.f474108a;
        android.text.Editable text = j0Var.W6().e().getText();
        if (text == null || r26.n0.N(text)) {
            j0Var.W6().j().c(i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.w2
    public void c(float f17, float f18) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.w2
    public void d() {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.w2
    public void e(float f17, float f18) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.w2
    public void f() {
        this.f474108a.m161890x7b383410();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.w2
    /* renamed from: onHide */
    public void mo75913xc39a57c1() {
        r50.j0 j0Var = this.f474108a;
        j0Var.W6().k().setVisibility(8);
        if (com.p314xaae8f345.mm.p2470x93e71c27.ui.C19651x7fe9d32.f271353y.a() == 2) {
            android.view.View m17 = j0Var.W6().m();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m17, arrayList.toArray(), "com/tencent/mm/feature/forward/uic/ForwardMsgPreviewKeyboardUIC$onCreate$1$1$6", "onHide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(m17, "com/tencent/mm/feature/forward/uic/ForwardMsgPreviewKeyboardUIC$onCreate$1$1$6", "onHide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.w2
    /* renamed from: onShow */
    public void mo75914xc39f557c() {
        r50.j0 j0Var = this.f474108a;
        j0Var.W6().k().setVisibility(0);
        ct.f3 f3Var = (ct.f3) i95.n0.c(ct.f3.class);
        android.widget.FrameLayout k17 = j0Var.W6().k();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getSpeechInputContainer(...)");
        ((x90.m) f3Var).getClass();
        b31.l.f99146a.h(k17, 4, "");
        if (com.p314xaae8f345.mm.p2470x93e71c27.ui.C19651x7fe9d32.f271353y.a() == 2) {
            android.view.View m17 = j0Var.W6().m();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m17, arrayList.toArray(), "com/tencent/mm/feature/forward/uic/ForwardMsgPreviewKeyboardUIC$onCreate$1$1$6", "onShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(m17, "com/tencent/mm/feature/forward/uic/ForwardMsgPreviewKeyboardUIC$onCreate$1$1$6", "onShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
