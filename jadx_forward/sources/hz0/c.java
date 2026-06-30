package hz0;

/* loaded from: classes4.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f367779d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hz0.d f367780e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.sns.p923x5525d53f.C11020xf79d3099 f367781f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String str, hz0.d dVar, com.p314xaae8f345.mm.p916x4268f0dc.sns.p923x5525d53f.C11020xf79d3099 c11020xf79d3099) {
        super(1);
        this.f367779d = str;
        this.f367780e = dVar;
        this.f367781f = c11020xf79d3099;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        dm.ib dbInfo = (dm.ib) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dbInfo, "dbInfo");
        java.lang.String str = dbInfo.f67027xae81df62;
        java.lang.String str2 = this.f367779d;
        com.p314xaae8f345.mm.vfs.w6.c(str2, str);
        com.p314xaae8f345.mm.vfs.w6.h(str2);
        hz0.d dVar = this.f367780e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(dVar.f367786e, "successCallback: copy from " + str2 + " to " + str);
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p923x5525d53f.C11020xf79d3099 c11020xf79d3099 = this.f367781f;
        java.lang.String str3 = dVar.f367782a;
        com.p314xaae8f345.p457x3304c6.p464xb32913b4.C4041xf31b2ebc c4041xf31b2ebc = dVar.f367783b;
        boolean i17 = com.p314xaae8f345.mm.p916x4268f0dc.sns.p923x5525d53f.C11020xf79d3099.i(c11020xf79d3099, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7534x97f3504d, 0, str3, c4041xf31b2ebc);
        az0.rc.i("3003", dVar.f367784c, null, false, 300, 12, null);
        boolean z17 = !(z65.c.a() || com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c);
        if (i17) {
            dw3.c0 c0Var = dw3.c0.f325715a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            c0Var.v(true, "", str, z17, false, true);
        }
        c4041xf31b2ebc.f129537a.remove(dVar);
        yz5.l lVar = dVar.f367785d;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.TRUE);
        }
        return jz5.f0.f384359a;
    }
}
