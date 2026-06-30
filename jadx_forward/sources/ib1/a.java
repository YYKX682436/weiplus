package ib1;

/* loaded from: classes7.dex */
public class a implements ob1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f371569a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f371570b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ib1.b f371571c;

    public a(ib1.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f371571c = bVar;
        this.f371569a = lVar;
        this.f371570b = i17;
    }

    @Override // ob1.d
    public void a(ob1.m mVar) {
        int i17 = mVar.f425571a;
        ib1.b bVar = this.f371571c;
        int i18 = this.f371570b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f371569a;
        if (i17 != 0) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", java.lang.Integer.valueOf(mVar.f425571a));
            lVar.a(i18, bVar.q(mVar.f425572b, mVar.f425573c, hashMap));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.a(93);
            return;
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("errCode", 0);
        bVar.getClass();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        hashMap2.put("errno", 0);
        lVar.a(i18, bVar.t("ok", hashMap2));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.a(92);
    }
}
