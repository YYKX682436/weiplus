package cm1;

/* loaded from: classes14.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f124831d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124832e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124833f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f124834g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.bd f124835h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f124836i;

    public h(long j17, java.lang.String str, java.lang.String str2, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.bd bdVar, android.content.Context context) {
        this.f124831d = j17;
        this.f124832e = str;
        this.f124833f = str2;
        this.f124834g = i17;
        this.f124835h = bdVar;
        this.f124836i = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cm1.f fVar = cm1.t.f124851c;
        long j17 = this.f124831d;
        boolean z17 = false;
        if (fVar != null && fVar.f124820f == j17) {
            z17 = true;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WMPFVoip.WMPFVoipCallInManager", "[enterWxaVoipCallingPage] callingInstanceId is not match");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[enterWxaVoipCallingPage] appId=");
        java.lang.String str = this.f124832e;
        sb6.append(str);
        sb6.append("  enterPath=");
        java.lang.String str2 = this.f124833f;
        sb6.append(str2);
        sb6.append(" versionType=");
        int i17 = this.f124834g;
        sb6.append(i17);
        sb6.append(" callingInstanceId=");
        sb6.append(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WMPFVoip.WMPFVoipCallInManager", sb6.toString());
        l81.b1 b1Var = new l81.b1();
        b1Var.f398547b = str;
        b1Var.f398549c = i17;
        b1Var.f398555f = str2;
        b1Var.X = k91.b1.f387075f;
        b1Var.f398565k = 1225;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.bd bdVar = this.f124835h;
        if (bdVar != null) {
            b1Var.L = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.dd(bdVar);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(this.f124836i, b1Var);
        cm1.t.f124849a.d();
    }
}
