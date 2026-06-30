package r2;

/* loaded from: classes14.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r2.o f450233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u1.w f450234e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f450235f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r2.o oVar, u1.w wVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(1);
        this.f450233d = oVar;
        this.f450234e = wVar;
        this.f450235f = h0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        u1.r1 owner = (u1.r1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 c1059xa8272988 = owner instanceof p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 ? (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988) owner : null;
        r2.o view = this.f450233d;
        if (c1059xa8272988 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
            u1.w layoutNode = this.f450234e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutNode, "layoutNode");
            c1059xa8272988.m7028xd5058f8b().m7106x1f0026e9().put(view, layoutNode);
            c1059xa8272988.m7028xd5058f8b().addView(view);
            c1059xa8272988.m7028xd5058f8b().m7107xccf1f269().put(layoutNode, view);
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.s(view, 1);
            n3.l1.l(view, new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.o(layoutNode, c1059xa8272988, c1059xa8272988));
        }
        java.lang.Object obj2 = this.f450235f.f391656d;
        if (obj2 != null) {
            view.m161349xaf4b3f9((android.view.View) obj2);
        }
        return jz5.f0.f384359a;
    }
}
