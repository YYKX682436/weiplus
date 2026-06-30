package i53;

/* loaded from: classes8.dex */
public class d4 extends ut3.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.ActivityC15913x621c3a4c f370094d;

    public d4(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.ActivityC15913x621c3a4c activityC15913x621c3a4c) {
        this.f370094d = activityC15913x621c3a4c;
    }

    @Override // ut3.e, ut3.d
    public boolean c5(android.content.Context context, android.os.Bundle bundle, ut3.c cVar) {
        android.util.SparseArray sparseArray;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.ActivityC15913x621c3a4c activityC15913x621c3a4c = this.f370094d;
        bundle.putInt("key_video_from", activityC15913x621c3a4c.f221618f);
        bundle.putString("key_raw_video_path", activityC15913x621c3a4c.f221621i);
        bundle.putInt("key_raw_video_duration", activityC15913x621c3a4c.f221625p.a());
        bundle.putInt("key_raw_video_size", (int) com.p314xaae8f345.mm.vfs.w6.k(activityC15913x621c3a4c.f221621i));
        bundle.putInt("key_game_haowan_flag", 10);
        bundle.putInt("game_haowan_source_scene_id", activityC15913x621c3a4c.f221630u);
        if (activityC15913x621c3a4c.f221618f == 2 && (sparseArray = activityC15913x621c3a4c.f221622m) != null) {
            if (sparseArray.size() > 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameVideoEditorProxyUI", "hy: more than 1 share options and need to show actionsheet");
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = activityC15913x621c3a4c.f221624o;
                if (k0Var != null) {
                    k0Var.u();
                }
                activityC15913x621c3a4c.f221624o = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, false);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = activityC15913x621c3a4c.f221624o;
                k0Var2.f293405n = new i53.b4(this);
                k0Var2.f293414s = new i53.c4(this, bundle, cVar);
                k0Var2.v();
                return true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.api.C15698x77f8a9c2 c15698x77f8a9c2 = activityC15913x621c3a4c.f221623n;
            if (c15698x77f8a9c2 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameVideoEditorProxyUI", "hy: only 1 option. use default, dafault id is %d", java.lang.Integer.valueOf(c15698x77f8a9c2.f220227d));
                bundle.putInt("key_selected_item", activityC15913x621c3a4c.f221623n.f220227d);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Haowan.GameVideoEditorProxyUI", "hy: no default option!");
            }
        }
        return false;
    }

    @Override // ut3.d
    public void k3(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046, android.os.Bundle bundle) {
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putAll(bundle);
        p95.a.a(new i53.a4(this, context, c16991x15ced046, bundle2));
    }
}
