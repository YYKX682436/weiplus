package gc5;

/* loaded from: classes8.dex */
public class b extends com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4 implements gc5.c {

    /* renamed from: x, reason: collision with root package name */
    public static final java.util.Set f351999x;

    /* renamed from: y, reason: collision with root package name */
    public static boolean f352000y;

    /* renamed from: z, reason: collision with root package name */
    public static long f352001z;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f352002v;

    /* renamed from: w, reason: collision with root package name */
    public int f352003w;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        f351999x = hashSet;
        hashSet.add("app_type");
        hashSet.add("app_media_id");
        hashSet.add("app_msg_id");
        hashSet.add("app_show_share");
        hashSet.add(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
        hashSet.add("msg_talker");
        f352000y = false;
        f352001z = 0L;
    }

    public b(dp1.x xVar) {
        super(xVar);
        this.f352002v = "";
        this.f352003w = 0;
    }

    public static boolean t0(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (m17.a()) {
            return m17.f294799a.F(m17.f294800b);
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void H() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FilesFloatBall.FilesPageFloatBallHelper", "onReceivedBallInfoRemovedEvent, filePath:%s", this.f352002v);
        n0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void I() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FilesFloatBall.FilesPageFloatBallHelper", "onReceivedFinishWhenSwitchBallEvent, filePath:%s", this.f352002v);
        this.f174779u = false;
        dp1.x xVar = this.f174772n;
        if (xVar == null || xVar.mo50327x19263085() == null) {
            return;
        }
        xVar.mo50327x19263085().finish();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public boolean n() {
        return true;
    }

    public void u0(java.lang.String str, java.lang.String str2, int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FilesFloatBall.FilesPageFloatBallHelper", "onCreate, filePath:%s fileExt:%s sence:%s", str, str2, java.lang.Integer.valueOf(i17));
        this.f352002v = str;
        this.f352003w = i17;
        b(4, qp1.n.c(str));
        Q(1);
        t().f174619f = 4;
        t().f174618e = this.f352003w;
        g();
        android.os.Bundle bundle = this.f174665d.G;
        if (bundle != null) {
            bundle.putString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, str);
            if (!z17) {
                this.f174665d.G.putBoolean("ifAppAttachDownloadUI", false);
                this.f174665d.G.putString("fileExt", str2);
                this.f174665d.G.putInt("sence", java.lang.Integer.valueOf(i17).intValue());
                g();
                return;
            }
            dp1.x xVar = this.f174772n;
            if (xVar.mo54480x1e885992() != null) {
                qp1.m.c(xVar.mo54480x1e885992(), this.f174665d.G, f351999x);
                this.f174665d.G.putBoolean("ifAppAttachDownloadUI", true);
                g();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public boolean v() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f352002v) || com.p314xaae8f345.mm.vfs.w6.j(this.f352002v);
    }

    public void v0(java.lang.String str, java.lang.String str2) {
        java.lang.Boolean bool = qp1.w.f447288a;
        java.lang.Integer b17 = qp1.a0.b(str);
        if (b17 == null) {
            b17 = qp1.a0.b(com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a);
        }
        this.f174665d.f174593u = b17.intValue();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f174665d.f174596x)) {
            this.f174665d.f174596x = str2;
        }
        g();
    }
}
