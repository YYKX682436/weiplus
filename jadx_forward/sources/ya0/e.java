package ya0;

/* loaded from: classes.dex */
public class e extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public e() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd) abstractC20979x809547d1;
        am.r2 r2Var = c5255x5f3208fd.f135586g;
        if (r2Var.f89292a != 96) {
            return false;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(r2Var.f89293b);
        am.r2 r2Var2 = c5255x5f3208fd.f135586g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginNotification", " ringtone update coming. subtype: %d, file path: %s, file version: %d", valueOf, r2Var2.f89294c, java.lang.Integer.valueOf(r2Var2.f89295d));
        int i17 = r2Var2.f89293b;
        if (i17 != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PluginNotification", "sub type can't be handled!, subtype:%d", java.lang.Integer.valueOf(i17));
            return false;
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(r2Var2.f89294c);
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PluginNotification", "file not exits :%s", r2Var2.f89294c);
            return false;
        }
        java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(r2Var2.f89294c);
        if (android.text.TextUtils.isEmpty(p17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PluginNotification", "current_file_md5 is empty");
            return false;
        }
        if (!p17.equals(r2Var2.f89297f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PluginNotification", "md5 is diff, current md5:%s, original md5:%s", p17, r2Var2.f89297f);
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginNotification", "md5 is same, current md5:%s, original md5:%s", p17, r2Var2.f89297f);
        mo3.g.Ai(r2Var2.f89294c);
        return true;
    }
}
