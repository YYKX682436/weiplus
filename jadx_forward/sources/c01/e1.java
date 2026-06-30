package c01;

/* loaded from: classes11.dex */
public final class e1 implements qk.s6 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f118648d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f118649e;

    @Override // qk.s6
    public java.lang.String Hg() {
        return c01.d1.f118630d.Hg();
    }

    @Override // qk.s6
    public void U6(int i17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizTeenModeServiceProxy", "reportTeenModeToast not implemented in non-MM process");
    }

    public final void a() {
        if (this.f118649e) {
            return;
        }
        java.lang.String str = gm0.m.i() + "_biz_teen_mode_mmkv";
        this.f118648d = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N(str, 2, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTeenModeServiceProxy", "initBizTeenModeServiceProxy key: %s", str);
        this.f118649e = true;
    }

    @Override // qk.s6
    public void da(dm.h1 h1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizTeenModeServiceProxy", "reportRemoveBizContact not implemented in non-MM process");
    }

    @Override // qk.s6
    public boolean g0() {
        a();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = this.f118648d;
        boolean z17 = o4Var != null ? o4Var.getBoolean("is_teen_mode", false) : false;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = this.f118648d;
        int i17 = o4Var2 != null ? o4Var2.getInt("biz_teen_mode_acct_option", -1) : -1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTeenModeServiceProxy", "isBizTeenModeDenyAll isTeenMode: %b, bizTeenModeAcctOption: %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        return z17 && i17 == 2;
    }

    @Override // qk.s6
    public boolean hh() {
        a();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = this.f118648d;
        boolean z17 = o4Var != null ? o4Var.getBoolean("is_teen_mode", false) : false;
        if (!z17) {
            return true;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = this.f118648d;
        int i17 = o4Var2 != null ? o4Var2.getInt("biz_teen_mode_acct_option", -1) : -1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTeenModeServiceProxy", "isBizTeenModeAllowAll isTeenMode: %b, bizTeenModeAcctOption: %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        return !z17 || i17 == 1;
    }

    @Override // qk.s6
    /* renamed from: isTeenMode */
    public boolean mo13794x74219ae7() {
        a();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = this.f118648d;
        if (o4Var != null) {
            return o4Var.getBoolean("is_teen_mode", false);
        }
        return false;
    }

    @Override // qk.s6
    public boolean pb(java.lang.String url, java.lang.String host) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        return c01.d1.f118630d.pb(url, host);
    }

    @Override // qk.s6
    public void s2(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizTeenModeServiceProxy", "reportTeenModeToast not implemented in non-MM process");
    }
}
