package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff;

/* loaded from: classes7.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f169736d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12340xb447464a f169737e;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.j jVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12340xb447464a c12340xb447464a) {
        this.f169736d = o6Var;
        this.f169737e = c12340xb447464a;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.a(this.f169736d);
        if (a17 == null) {
            return;
        }
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.C12565x722467e8 c12565x722467e8 : this.f169737e.f165941f) {
            od1.c cVar = new od1.c();
            cVar.f426135a = "loadPackage";
            long j17 = c12565x722467e8.f169574v;
            cVar.f426136b = j17;
            cVar.f426137c = j17 + c12565x722467e8.f169567o;
            java.lang.String str = c12565x722467e8.f169564i;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            cVar.b(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1, str);
            int i17 = c12565x722467e8.f169572t;
            if (i17 > 0) {
                cVar.b("size", java.lang.Integer.valueOf(i17));
            } else {
                cVar.b("size", java.lang.Integer.valueOf(c12565x722467e8.f169571s));
            }
            try {
                cVar.a(a17.f169677p.C0());
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
