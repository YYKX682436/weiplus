package x71;

@j95.b(m140513x1e06fd29 = {c42.l.class})
/* loaded from: classes7.dex */
public class p extends i95.w implements x71.n {
    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginAi", "Plugin ai onAccountInitialized [%d]", java.lang.Integer.valueOf(hashCode()));
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginAi", "Plugin ai onAccountRelease [%d]", java.lang.Integer.valueOf(hashCode()));
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        gm0.j1.p().a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginAi", "Plugin ai execute IAiService [%d]", java.lang.Integer.valueOf(hashCode()));
    }

    /* renamed from: toString */
    public java.lang.String m175130x9616526c() {
        return "plugin-ai";
    }
}
