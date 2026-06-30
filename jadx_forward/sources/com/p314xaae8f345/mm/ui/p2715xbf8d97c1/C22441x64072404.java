package com.p314xaae8f345.mm.ui.p2715xbf8d97c1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/ui/matrix/MatrixOpenGLLeakResultUI;", "Lcom/tencent/mm/ui/matrix/MatrixBaseLeakResultUI;", "<init>", "()V", "nh5/s", "nh5/c0", "plugin-performance_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.matrix.MatrixOpenGLLeakResultUI */
/* loaded from: classes.dex */
public final class C22441x64072404 extends com.tencent.mm.ui.matrix.MatrixBaseLeakResultUI {

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f290646g = jz5.h.b(new nh5.d0(this));

    /* renamed from: getLayoutId */
    public int m80773x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bxa;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: onCreate */
    public void m80774x3e5a77bb(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54450xbf7c1df6("OpenGL Leak");
        oh5.l lVar = (oh5.l) oh5.l.f427038g.remove(java.lang.Integer.valueOf(getIntent().getIntExtra("KEY_COUNTER", 0)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MatrixOpenGLLeakResultUI", "helper = " + lVar);
        jz5.g gVar = this.f290646g;
        java.lang.Object mo141623x754a37bb = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) mo141623x754a37bb).mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(mo55332x76847179()));
        if (lVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MatrixOpenGLLeakResultUI", "list = " + lVar.d());
            java.lang.Object mo141623x754a37bb2 = ((jz5.n) gVar).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
            ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) mo141623x754a37bb2).mo7960x6cab2c8d(new nh5.s(lVar.d()));
        }
    }
}
