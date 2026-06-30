package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public final class a5 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.b6 {

    /* renamed from: a, reason: collision with root package name */
    public final m81.b f156950a;

    /* renamed from: b, reason: collision with root package name */
    public final int f156951b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f156952c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.z4 f156953d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f156954e;

    /* renamed from: f, reason: collision with root package name */
    public long f156955f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f156956g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f156957h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f156958i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f156959j = 0;

    /* renamed from: k, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.C12565x722467e8 f156960k;

    public a5(m81.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y4 y4Var) {
        this.f156950a = bVar;
        this.f156951b = k91.l3.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.w0.b(bVar.f406221l, 0)) ? 776 : 368;
        java.lang.String[] split = bVar.f406221l.split(java.util.regex.Pattern.quote("$"));
        this.f156952c = (split == null ? -1 : split.length) == 2;
    }

    public final void a(int i17) {
        b(this.f156951b, i17);
    }

    public final void b(int i17, int i18) {
        if (this.f156954e == null) {
            this.f156954e = new java.util.ArrayList();
        }
        this.f156954e.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(i17, i18, 1));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:1|(1:3)|4|(1:202)(1:8)|9|(6:(1:95)(1:14)|15|(1:94)(1:20)|(1:93)(1:25)|26|(4:65|(2:(1:68)(1:86)|69)(2:87|(2:(1:90)(1:92)|91))|(2:(1:72)(1:74)|73)|(1:(2:(1:78)(1:80)|79)(1:(2:(1:83)(1:85)|84))))(1:(1:(1:(4:(1:33)(1:42)|34|(1:36)|(1:(1:39)(1:(1:41)))))(4:(1:44)(1:53)|45|(1:47)|(1:(1:50)(1:(1:52)))))(4:(1:55)(1:64)|56|(1:58)|(1:(1:61)(1:(1:63))))))|(1:201)(3:(2:199|107)|106|107)|(3:195|196|(12:198|113|(9:118|119|120|121|122|123|124|125|(4:(1:183)(8:130|(1:132)(2:173|(1:175)(2:176|(1:178)(2:179|(1:181)(1:182))))|133|(1:135)|136|(1:138)(1:172)|139|(1:141))|(6:143|(1:145)(2:161|(1:163)(2:164|(1:166)(1:167)))|146|(1:148)|149|(1:151))(2:168|(1:170)(1:171))|152|(1:159)(2:156|157))(1:184))|193|119|120|121|122|123|124|125|(0)(0)))|(1:194)(1:112)|113|(10:115|118|119|120|121|122|123|124|125|(0)(0))|193|119|120|121|122|123|124|125|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0182, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v r22) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a5.c(com.tencent.mm.pluginsdk.res.downloader.model.v):void");
    }

    public void d(boolean z17) {
        m81.b bVar = this.f156950a;
        int i17 = 0;
        if (bVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p8) {
            this.f156953d = "@LibraryAppId".equals(bVar.f406221l) ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.z4.LIB_INCREMENTAL_UPDATE : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.z4.INCREMENTAL_UPDATE;
            m81.b bVar2 = this.f156950a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.C12565x722467e8 c12565x722467e8 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.C12565x722467e8(bVar2.f406221l, ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p8) bVar2).f157256q, ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p8) bVar2).f157257r);
            this.f156960k = c12565x722467e8;
            c12565x722467e8.b();
        } else if ("@LibraryAppId".equals(bVar.f406221l)) {
            this.f156953d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.z4.LIB_UPDATE;
        } else {
            boolean b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.b(this.f156950a.f406223n);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.z4 z4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.z4.DOWNLOAD;
            if (b17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 b18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v3.b(this.f156950a.f406221l, 1);
                if (b18 != null) {
                    z4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.z4.UPDATE;
                }
                this.f156953d = z4Var;
                m81.b bVar3 = this.f156950a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.C12565x722467e8 c12565x722467e82 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.C12565x722467e8(bVar3.f406221l, b18 == null ? 0 : b18.f33456x1c82a56c, bVar3.f406222m);
                this.f156960k = c12565x722467e82;
                c12565x722467e82.b();
            } else {
                m81.b bVar4 = this.f156950a;
                if (bVar4 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.m8) {
                    java.lang.String str = bVar4.f406221l;
                    int i18 = bVar4.f406223n;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.C12565x722467e8 c12565x722467e83 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.C12565x722467e8(str, 0, 0);
                    c12565x722467e83.f169563h = i18 + 1;
                    this.f156960k = c12565x722467e83;
                    c12565x722467e83.b();
                }
                this.f156953d = z4Var;
            }
        }
        int ordinal = this.f156953d.ordinal();
        if (ordinal == 0) {
            i17 = 1;
        } else if (ordinal == 1) {
            i17 = 10;
        } else if (ordinal == 2) {
            i17 = 20;
        } else if (ordinal == 3) {
            i17 = 35;
        } else if (ordinal == 4) {
            i17 = 46;
        }
        a(i17);
        this.f156955f = android.os.SystemClock.elapsedRealtime();
        if (this.f156950a.f406224o != null) {
            this.f156960k.G = this.f156950a.f406224o.f472332f;
            this.f156960k.H = this.f156950a.f406224o.f472331e ? 1 : 0;
            this.f156960k.I = this.f156950a.f406224o.f472333g;
        }
    }
}
