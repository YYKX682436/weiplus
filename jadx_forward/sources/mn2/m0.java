package mn2;

/* loaded from: classes10.dex */
public final class m0 implements ek4.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mn2.q0 f411582a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c50.z0 f411583b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f411584c;

    public m0(mn2.q0 q0Var, c50.z0 z0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079) {
        this.f411582a = q0Var;
        this.f411583b = z0Var;
        this.f411584c = c14994x9b99c079;
    }

    @Override // ek4.w
    public void b(int i17, dn.o oVar) {
        mn2.q0 q0Var = this.f411582a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(q0Var.f411625a, "startPreloadDownloadTask ret=" + i17 + ' ' + oVar);
        if (i17 != 0) {
            java.lang.String str = oVar != null ? oVar.f69601xaca5bdda : null;
            if (str == null) {
                str = "";
            }
            mn2.q0.b(this.f411583b, this.f411584c, q0Var, str, -22);
        }
    }
}
