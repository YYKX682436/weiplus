package r2;

/* loaded from: classes14.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r2.o f450237d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f450238e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r2.o oVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(1);
        this.f450237d = oVar;
        this.f450238e = h0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        u1.r1 owner = (u1.r1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 c1059xa8272988 = owner instanceof p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 ? (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988) owner : null;
        r2.o view = this.f450237d;
        if (c1059xa8272988 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
            c1059xa8272988.m7028xd5058f8b().removeView(view);
            p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(c1059xa8272988.m7028xd5058f8b().m7107xccf1f269()).remove(c1059xa8272988.m7028xd5058f8b().m7106x1f0026e9().remove(view));
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.s(view, 0);
        }
        this.f450238e.f391656d = view.m161340xfb86a31b();
        view.m161349xaf4b3f9(null);
        return jz5.f0.f384359a;
    }
}
