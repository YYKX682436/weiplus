package sf4;

/* loaded from: classes4.dex */
public final class e2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sf4.f2 f488992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f488993e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f488994f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f488995g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(sf4.f2 f2Var, java.lang.String str, int i17, int i18) {
        super(0);
        this.f488992d = f2Var;
        this.f488993e = str;
        this.f488994f = i17;
        this.f488995g = i18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        sf4.f2 f2Var = this.f488992d;
        if4.h hVar = f2Var.f489008f;
        if (hVar != null) {
            f2Var.f489006d = ef4.k0.f333992a.b(hVar);
        }
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        com.p314xaae8f345.mm.p947xba6de98f.l3 Di = t21.o2.Di();
        java.lang.String str = this.f488993e;
        int i17 = this.f488994f;
        int i18 = this.f488995g;
        int p17 = Di.p(str, i17, i18, 0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestVideoData ");
        sb6.append(str);
        sb6.append(' ');
        sb6.append(i17);
        sb6.append(' ');
        sb6.append(i18);
        sb6.append(' ');
        nf4.o oVar = f2Var.f489006d;
        sb6.append(oVar != null ? java.lang.Integer.valueOf(oVar.f66549x799e9d9e) : null);
        sb6.append(", ret:");
        sb6.append(p17);
        sb6.append(" this:");
        sb6.append(f2Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayProxy", sb6.toString());
        return jz5.f0.f384359a;
    }
}
