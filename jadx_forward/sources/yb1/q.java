package yb1;

/* loaded from: classes7.dex */
public final class q implements m3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.C12063xb16c5aa3 f542207a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f542208b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f542209c;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.C12063xb16c5aa3 c12063xb16c5aa3, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f542207a = c12063xb16c5aa3;
        this.f542208b = lVar;
        this.f542209c = i17;
    }

    @Override // m3.a
    /* renamed from: accept */
    public void mo3938xab27b508(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean isEmpty = list.isEmpty();
        jc1.d dVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.C12063xb16c5aa3.f161818o;
        if (isEmpty) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.C12063xb16c5aa3.H(this.f542207a, this.f542208b, this.f542209c, dVar, null, 8, null);
            return;
        }
        java.lang.String str = ((xs.g1) kz5.n0.X(list)).f537786c;
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGenRedPackageCover", "[-] img path '" + str + "' does not exist.");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.C12063xb16c5aa3.H(this.f542207a, this.f542208b, this.f542209c, dVar, null, 8, null);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.g(str)) {
            str = ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).Ai(str, 11);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.C12063xb16c5aa3 c12063xb16c5aa3 = this.f542207a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f542208b;
        java.lang.String D = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.C12063xb16c5aa3.D(c12063xb16c5aa3, lVar, str);
        if (D == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.C12063xb16c5aa3.H(this.f542207a, this.f542208b, this.f542209c, dVar, null, 8, null);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.C12063xb16c5aa3.E(c12063xb16c5aa3, lVar, this.f542209c, kz5.b1.e(new jz5.l(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, D)));
        }
    }
}
