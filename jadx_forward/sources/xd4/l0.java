package xd4;

/* loaded from: classes4.dex */
public final class l0 implements x25.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f535199a;

    /* renamed from: b, reason: collision with root package name */
    public final int f535200b;

    /* renamed from: c, reason: collision with root package name */
    public final int f535201c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f535202d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f535203e;

    /* renamed from: f, reason: collision with root package name */
    public int f535204f;

    /* renamed from: g, reason: collision with root package name */
    public int f535205g;

    /* renamed from: h, reason: collision with root package name */
    public int f535206h;

    /* renamed from: i, reason: collision with root package name */
    public int f535207i;

    /* renamed from: j, reason: collision with root package name */
    public int f535208j;

    /* renamed from: k, reason: collision with root package name */
    public int f535209k;

    /* renamed from: l, reason: collision with root package name */
    public int f535210l;

    /* renamed from: m, reason: collision with root package name */
    public int f535211m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f535212n;

    public l0(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3) {
        this.f535199a = str;
        this.f535200b = i17;
        this.f535201c = i18;
        this.f535202d = str2;
        this.f535203e = str3;
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkState", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
        if (!this.f535212n) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkState", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
        } else {
            java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("Already reported");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkState", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
            throw illegalStateException;
        }
    }

    public final java.util.Map b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toMap", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
        jz5.l[] lVarArr = new jz5.l[13];
        java.lang.String str = this.f535199a;
        if (str == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("snsvideourl", str);
        lVarArr[1] = new jz5.l("sns_player_type", java.lang.Integer.valueOf(this.f535200b));
        lVarArr[2] = new jz5.l("sns_scene", java.lang.Integer.valueOf(this.f535201c));
        java.lang.String str2 = this.f535202d;
        if (str2 == null) {
            str2 = "";
        }
        lVarArr[3] = new jz5.l("sns_feed_id", str2);
        java.lang.String str3 = this.f535203e;
        lVarArr[4] = new jz5.l("sessionid_sns", str3 != null ? str3 : "");
        lVarArr[5] = new jz5.l("play_clk_pv", java.lang.Integer.valueOf(this.f535204f));
        lVarArr[6] = new jz5.l("pause_clk_pv", java.lang.Integer.valueOf(this.f535205g));
        lVarArr[7] = new jz5.l("expand_clk_pv", java.lang.Integer.valueOf(this.f535206h));
        lVarArr[8] = new jz5.l("collapse_clk_pv", java.lang.Integer.valueOf(this.f535207i));
        lVarArr[9] = new jz5.l("clk_show_panle_pv", java.lang.Integer.valueOf(this.f535208j));
        lVarArr[10] = new jz5.l("clk_hide_panle_pv", java.lang.Integer.valueOf(this.f535209k));
        lVarArr[11] = new jz5.l("speedup_clk_pv", java.lang.Integer.valueOf(this.f535210l));
        lVarArr[12] = new jz5.l("processbar_drag_pv", java.lang.Integer.valueOf(this.f535211m));
        java.util.Map k17 = kz5.c1.k(lVarArr);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toMap", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
        return k17;
    }

    /* renamed from: equals */
    public boolean m175376xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
            return true;
        }
        if (!(obj instanceof xd4.l0)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
            return false;
        }
        xd4.l0 l0Var = (xd4.l0) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f535199a, l0Var.f535199a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
            return false;
        }
        if (this.f535200b != l0Var.f535200b) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
            return false;
        }
        if (this.f535201c != l0Var.f535201c) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f535202d, l0Var.f535202d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
            return false;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f535203e, l0Var.f535203e);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
        return b17;
    }

    /* renamed from: hashCode */
    public int m175377x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
        java.lang.String str = this.f535199a;
        int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + java.lang.Integer.hashCode(this.f535200b)) * 31) + java.lang.Integer.hashCode(this.f535201c)) * 31;
        java.lang.String str2 = this.f535202d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f535203e;
        int hashCode3 = hashCode2 + (str3 != null ? str3.hashCode() : 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
        return hashCode3;
    }

    /* renamed from: toString */
    public java.lang.String m175378x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
        java.lang.String str = "SnsVideoControlPanelReporter(" + b() + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
        return str;
    }
}
