package p60;

@j95.b
/* loaded from: classes7.dex */
public final class u extends i95.w implements p60.x {

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f433732g = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("PluginGameLive");

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f433733d = jz5.h.b(p60.t.f433731d);

    /* renamed from: e, reason: collision with root package name */
    public boolean f433734e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f433735f;

    public final p60.j Ai() {
        p60.i iVar = p60.j.f433693e;
        int i17 = f433732g.getInt("gameLiveCurrentState_", 0);
        iVar.getClass();
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? p60.j.f433694f : p60.j.f433698m : p60.j.f433697i : p60.j.f433696h : p60.j.f433695g;
    }

    public java.lang.Boolean Bi(java.lang.String appId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f433732g;
        boolean z17 = false;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(o4Var.getString("onLiveAppId", null), appId) && o4Var.getInt("onLiveVersionType", 0) == i17 && Di()) {
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }

    public final boolean Di() {
        Ui(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() ? ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).fk() : f433732g.getBoolean("isLiving", false));
        return this.f433734e;
    }

    public final void Ni() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginGameLive", Zi("resetState"));
        Vi("");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f433732g;
        o4Var.putInt("onLiveVersionType", 0);
        o4Var.putBoolean("isPushing", false);
        o4Var.putBoolean("disableMicInfo", false);
        o4Var.putBoolean("disableLiveInfo", false);
        Ri(p60.j.f433694f);
        p60.r rVar = p60.s.f433725e;
        o4Var.putInt("gameLivePrepareScene", 0);
        Di();
    }

    public final void Ri(p60.j jVar) {
        if (jVar != null) {
            f433732g.putInt("gameLiveCurrentState_", jVar.f433700d);
        }
    }

    public final void Ui(boolean z17) {
        this.f433734e = z17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginGameLive", Zi("zbql:update isLiving: " + z17));
            f433732g.putBoolean("isLiving", z17);
        }
    }

    public final void Vi(java.lang.String str) {
        f433732g.putString("onLiveAppId", str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            Ui(((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).fk());
        }
    }

    public final java.lang.String Zi(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(" [appId:");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f433732g;
        sb6.append(o4Var.getString("onLiveAppId", null));
        sb6.append(" versionType:");
        sb6.append(o4Var.getInt("onLiveVersionType", 0));
        sb6.append(']');
        return sb6.toString();
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginGameLive", "onAccountInitialized");
            Ni();
            this.f433735f = f433732g.getBoolean("onLivingStatusForCrashCheck", false);
        }
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginGameLive", "onAccountRelease");
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final java.lang.String wi() {
        return f433732g.getString("appbrandPackageName", "");
    }
}
