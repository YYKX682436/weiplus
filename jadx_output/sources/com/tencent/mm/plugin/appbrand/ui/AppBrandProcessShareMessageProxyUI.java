package com.tencent.mm.plugin.appbrand.ui;

@db5.a(7)
/* loaded from: classes9.dex */
public class AppBrandProcessShareMessageProxyUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f89399d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.ui.t6 f89400e;

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        java.lang.String str2;
        int i17;
        android.os.Bundle bundle2;
        boolean z17;
        super.onCreate(bundle);
        boolean z18 = false;
        overridePendingTransition(0, 0);
        com.tencent.mm.ui.v9.e(getWindow());
        com.tencent.mm.ui.v9.c(getWindow(), false);
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        if (getIntent() == null) {
            finish();
            return;
        }
        java.lang.String stringExtra = getIntent().getStringExtra("key_dialog_touser");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            java.util.HashMap hashMap = (java.util.HashMap) getIntent().getSerializableExtra("key_dialog_params");
            boolean a17 = c01.od.a(hashMap.get("is_video"), false);
            int b17 = c01.od.b(hashMap.get("type"), 1);
            java.lang.String c17 = c01.od.c(hashMap.get(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE), "");
            java.lang.String c18 = c01.od.c(hashMap.get("img_url"), null);
            if (b17 == 2 || b17 == 3) {
                int b18 = c01.od.b(hashMap.get("pkg_type"), 0);
                int b19 = c01.od.b(hashMap.get("pkg_version"), 0);
                java.lang.String c19 = c01.od.c(hashMap.get(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID), null);
                java.lang.String c27 = c01.od.c(hashMap.get("cache_key"), null);
                java.lang.String c28 = c01.od.c(hashMap.get(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH), null);
                java.lang.String c29 = c01.od.c(hashMap.get("delay_load_img_path"), null);
                java.lang.String c37 = c01.od.c(hashMap.get("nickname"), "");
                boolean a18 = c01.od.a(hashMap.get("is_dynamic"), false);
                int b27 = c01.od.b(hashMap.get("biz"), 2);
                if (ot0.o.b(b27)) {
                    java.lang.String c38 = c01.od.c(hashMap.get("tail_lang"), "");
                    str = c18;
                    java.lang.String c39 = c01.od.c(hashMap.get("icon_url"), "");
                    str2 = "pkg_version";
                    bundle2 = new android.os.Bundle();
                    i17 = b19;
                    bundle2.putInt("key_biz", b27);
                    bundle2.putString("key_footer_text_default", c37);
                    bundle2.putString("key_footer_text", ot0.o.a(b27, c38, getContext()));
                    bundle2.putString("key_footer_icon", c39);
                } else {
                    str = c18;
                    str2 = "pkg_version";
                    i17 = b19;
                    if (a17) {
                        bundle2 = new android.os.Bundle();
                        bundle2.putBoolean("is_video", true);
                        java.lang.String c47 = c01.od.c(hashMap.get("footer_icon"), "");
                        java.lang.String c48 = c01.od.c(hashMap.get("footer_text"), "");
                        bundle2.putString("key_footer_icon", c47);
                        bundle2.putString("key_footer_text", c48);
                    } else {
                        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandProcessShareMessageProxyUI", "fake native share msg biz invalidate, biz: %d.", java.lang.Integer.valueOf(b27));
                        bundle2 = null;
                    }
                }
                android.view.View wi6 = ((ij1.j) ((k01.u0) i95.n0.c(k01.u0.class))).wi(this, bundle2, false, null);
                java.lang.String a19 = ik1.i0.a(this);
                android.os.Bundle bundle3 = new android.os.Bundle();
                bundle3.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID, c19);
                bundle3.putString("msg_id", java.lang.String.format("%d-%d", java.lang.Integer.valueOf(b18), java.lang.Integer.valueOf(i17)));
                bundle3.putInt("msg_pkg_type", b18);
                bundle3.putInt(str2, i17);
                bundle3.putString("image_url", str);
                bundle3.putBoolean("is_dynamic_page", a18);
                bundle3.putString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, c17);
                bundle3.putString("cache_key", c27);
                bundle3.putString("msg_path", c28);
                bundle3.putString("delay_load_img_path", c29);
                if (a17) {
                    java.lang.String c49 = c01.od.c(hashMap.get("video_path"), "");
                    java.lang.String c57 = c01.od.c(hashMap.get("video_thumb_path"), "");
                    z17 = true;
                    bundle3.putBoolean("is_video", true);
                    bundle3.putString("video_path", c49);
                    bundle3.putString("video_thumb_path", c57);
                } else {
                    z17 = true;
                }
                com.tencent.mm.plugin.appbrand.ui.w6 w6Var = new com.tencent.mm.plugin.appbrand.ui.w6(this, this);
                w6Var.f90308h = new com.tencent.mm.plugin.appbrand.ui.o6(this, a19, wi6);
                ((ij1.j) ((k01.u0) i95.n0.c(k01.u0.class))).Ri(a19, wi6, bundle3, new com.tencent.mm.plugin.appbrand.ui.p6(this, w6Var));
                this.f89400e = new com.tencent.mm.plugin.appbrand.ui.t6(this);
                o25.q1 q1Var = (o25.q1) i95.n0.c(o25.q1.class);
                java.lang.String string = getResources().getString(com.tencent.mm.R.string.a4x);
                com.tencent.mm.plugin.appbrand.ui.q6 q6Var = new com.tencent.mm.plugin.appbrand.ui.q6(this, w6Var);
                ((r35.k1) q1Var).getClass();
                r35.i1 i1Var = new r35.i1(this);
                i1Var.l(stringExtra);
                i1Var.c(wi6);
                i1Var.g(java.lang.Boolean.TRUE);
                i1Var.h(false);
                i1Var.f369137d = string;
                i1Var.a(q6Var);
                com.tencent.mm.ui.widget.dialog.j0 j0Var = i1Var.f369136c;
                this.f89399d = j0Var;
                j0Var.setOnDismissListener(new com.tencent.mm.plugin.appbrand.ui.r6(this, a19, wi6));
                this.f89399d.setOnKeyListener(new com.tencent.mm.plugin.appbrand.ui.s6(this, w6Var));
                this.f89399d.show();
            } else {
                z17 = true;
            }
            z18 = z17;
        }
        if (z18) {
            return;
        }
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        supportRequestWindowFeature(1);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f89399d;
        if (j0Var == null || !j0Var.isShowing()) {
            return;
        }
        this.f89399d.dismiss();
        this.f89399d = null;
        this.f89400e = null;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void setMMOrientation() {
        int intExtra = getIntent().getIntExtra("orientation", -1);
        if (intExtra != -1) {
            setRequestedOrientation(intExtra);
        }
    }
}
