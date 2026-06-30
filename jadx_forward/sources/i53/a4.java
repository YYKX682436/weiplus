package i53;

/* loaded from: classes8.dex */
public class a4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f370050d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 f370051e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f370052f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i53.d4 f370053g;

    public a4(i53.d4 d4Var, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046, android.os.Bundle bundle) {
        this.f370053g = d4Var;
        this.f370050d = context;
        this.f370051e = c16991x15ced046;
        this.f370052f = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.ActivityC15913x621c3a4c activityC15913x621c3a4c = this.f370053g.f370094d;
        int i18 = activityC15913x621c3a4c.f221630u;
        android.os.Bundle bundle = this.f370052f;
        bundle.putInt("game_haowan_source_scene_id", i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046 = this.f370051e;
        j53.d.e(c16991x15ced046, bundle);
        if (!c16991x15ced046.f237193d.booleanValue()) {
            db5.t7.m123882x26a183b(activityC15913x621c3a4c.f221617e, com.p314xaae8f345.mm.R.C30867xcad56011.fpy, 1).show();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Haowan.GameVideoEditorProxyUI", "video remux error");
            return;
        }
        j53.d.g(activityC15913x621c3a4c.f221626q, c16991x15ced046);
        j53.d.f(activityC15913x621c3a4c.f221627r, c16991x15ced046);
        int i19 = activityC15913x621c3a4c.f221618f;
        android.content.Context context = this.f370050d;
        if (i19 != 2) {
            boolean booleanValue = ((java.lang.Boolean) c16991x15ced046.a().b("KEY_VIDEO_IS_EDITED_BOOLEAN", java.lang.Boolean.TRUE)).booleanValue();
            if (activityC15913x621c3a4c.f221628s && booleanValue) {
                java.lang.String str = c16991x15ced046.f237194e;
                java.lang.String b17 = q75.c.b("mp4");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.ActionAfterVideoEdited", "auto save video :%s", b17);
                com.p314xaae8f345.mm.vfs.w6.c(str, b17);
                q75.c.f(b17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            }
            java.lang.String a17 = j53.d.a(c16991x15ced046);
            if (a17 == null) {
                activityC15913x621c3a4c.finish();
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_video_info", a17);
            android.app.Activity activity = (android.app.Activity) context;
            activity.setResult(-1, intent);
            activity.finish();
            return;
        }
        r45.vh4 vh4Var = new r45.vh4();
        vh4Var.f469768e = false;
        vh4Var.f469767d = false;
        java.lang.String q17 = com.p314xaae8f345.mm.vfs.w6.q(c16991x15ced046.f237194e);
        java.lang.String str2 = c16991x15ced046.f237194e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16527xe4fc886 c16527xe4fc886 = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16527xe4fc886(true, str2, c16991x15ced046.f237195f, q17, com.p314xaae8f345.mm.vfs.w6.p(str2), (int) (c16991x15ced046.f237196g.longValue() / 1000), vh4Var);
        if (c16991x15ced046.f237197h.booleanValue()) {
            c16527xe4fc886.f230340e = true;
            i17 = 0;
            c16527xe4fc886.f230339d = false;
            c16527xe4fc886.f230348p = c16991x15ced046.f237195f;
        } else {
            i17 = 0;
        }
        int i27 = bundle.getInt("key_selected_item", i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameVideoEditorProxyUI", "hy: generated video, selected item is %d", java.lang.Integer.valueOf(i27));
        android.util.SparseArray sparseArray = activityC15913x621c3a4c.f221622m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.api.C15698x77f8a9c2 c15698x77f8a9c2 = sparseArray == null ? null : (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.api.C15698x77f8a9c2) sparseArray.get(i27);
        android.content.Intent intent2 = new android.content.Intent();
        if (c15698x77f8a9c2 != null && c15698x77f8a9c2.f220229f) {
            intent2.putExtra("key_ext_url", activityC15913x621c3a4c.O6(null, j53.d.a(c16991x15ced046)));
        }
        intent2.putExtra("key_req_result", c16527xe4fc886);
        intent2.putExtra("key_selected_item", i27);
        android.app.Activity activity2 = (android.app.Activity) context;
        activity2.setResult(-1, intent2);
        activity2.finish();
    }
}
