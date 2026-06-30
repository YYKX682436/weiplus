package s1;

/* loaded from: classes14.dex */
public final class o0 implements s1.g2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s1.q0 f483581a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f483582b;

    public o0(s1.q0 q0Var, java.lang.Object obj) {
        this.f483581a = q0Var;
        this.f483582b = obj;
    }

    public void a(int i17, long j17) {
        s1.q0 q0Var = this.f483581a;
        u1.w wVar = (u1.w) ((java.util.LinkedHashMap) q0Var.f483601h).get(this.f483582b);
        if (wVar == null || !wVar.x()) {
            return;
        }
        int i18 = wVar.r().f423385f;
        if (i17 < 0 || i17 >= i18) {
            throw new java.lang.IndexOutOfBoundsException("Index (" + i17 + ") is out of bound of [0, " + i18 + ')');
        }
        if (!(!wVar.A)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        u1.w wVar2 = q0Var.f483594a;
        wVar2.f505226q = true;
        u1.r1 a17 = u1.q0.a(wVar);
        u1.w layoutNode = (u1.w) wVar.r().f423383d[i17];
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutNode, "layoutNode");
        u1.d1 d1Var = ((p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988) a17).f91989J;
        d1Var.f(layoutNode, j17);
        d1Var.b(false);
        wVar2.f505226q = false;
    }
}
