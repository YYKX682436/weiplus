package com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.p1728x5c28046;

@db5.a(m123858x6ac9171 = 19)
/* renamed from: com.tencent.mm.plugin.gallery.ui.emoji.EmojiAlbumPreviewUI */
/* loaded from: classes10.dex */
public class ActivityC15662x9c49ac73 extends com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd {

    /* renamed from: u2, reason: collision with root package name */
    public java.lang.String f220173u2;

    public static int f8(java.util.ArrayList arrayList, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) arrayList.get(i17);
        if (abstractC15633xee433078.mo63659xfb85f7b0() == 2) {
            return 3;
        }
        return "image/gif".equals(abstractC15633xee433078.f219971p) ? 4 : 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd
    public void J7() {
        if (android.text.TextUtils.isEmpty(this.f220173u2)) {
            return;
        }
        java.util.ArrayList y76 = y7();
        int i17 = 0;
        int size = y76 != null ? y76.size() : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (y76 != null) {
            int i18 = 0;
            while (i17 < y76.size()) {
                int f86 = f8(y76, i17);
                i17++;
                arrayList.add(new or.a(i17, 1, f86));
                if (i18 == 0) {
                    i18 = f86;
                }
            }
            i17 = i18;
        }
        or.d.b(this.f220173u2, 5, 1, java.lang.Integer.valueOf(i17), or.c.a("clk_close_button", this.f220173u2, java.lang.Integer.valueOf(size), or.c.d(arrayList)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd
    public void M7(int i17, android.view.View view, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 E = this.f220061m.E(i17);
        if (E == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(E.f219963e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EmojiAlbumPreviewUI", "item is null or path is null");
            return;
        }
        int z17 = i17 - this.f220061m.z();
        if (this.f220061m.J() != 0) {
            if (E.mo63659xfb85f7b0() != ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) this.f220061m.f328664g.get(0)).mo63659xfb85f7b0()) {
                if (!android.text.TextUtils.isEmpty(this.f220173u2)) {
                    or.d.b(this.f220173u2, 5, 1, null, or.c.b("warning_pup_win", this.f220173u2, null, null, 2));
                }
                db5.e1.s(this, "", i65.a.r(this, com.p314xaae8f345.mm.R.C30867xcad56011.obe));
                return;
            }
            if (E.mo63659xfb85f7b0() == 2 && !this.f220061m.f328664g.contains(E)) {
                if (!android.text.TextUtils.isEmpty(this.f220173u2)) {
                    or.d.b(this.f220173u2, 5, 1, null, or.c.b("warning_pup_win", this.f220173u2, null, null, 4));
                }
                db5.e1.s(this, "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.obk, 1));
                return;
            }
        }
        t23.p0.p(this.f220061m.f328663f);
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.p1728x5c28046.ActivityC15663xcb3c0b07.class);
        intent.putExtra("query_source_type", this.E1);
        intent.putExtra("preview_all", true);
        intent.putExtra("preview_position", z17);
        intent.putStringArrayListExtra("preview_image_list", this.f220061m.K());
        intent.putParcelableArrayListExtra("preview_media_item_list", this.f220061m.f328664g);
        intent.putExtra("max_select_count", this.Q);
        intent.putExtra("key_force_hide_edit_image_button", true);
        intent.putExtra("key_force_hide_edit_video_button", true);
        intent.putExtra("album_video_max_duration", 9999);
        intent.putExtra("select_type_tag", this.J1);
        intent.putExtra("key_from_scene", getIntent().getIntExtra("key_from_scene", 0));
        if (!android.text.TextUtils.isEmpty(this.f220173u2)) {
            intent.putExtra("addstickers_sessionid", this.f220173u2);
        }
        H7(z17, true);
        startActivityForResult(intent, 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd
    public boolean N7() {
        java.util.ArrayList y76 = y7();
        if (y76 != null && !y76.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int size = y76.size();
            int[] iArr = new int[size];
            for (int i17 = 0; i17 < y76.size(); i17++) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) y76.get(i17);
                java.lang.String str = abstractC15633xee433078.f219963e;
                if (str != null) {
                    arrayList.add(str);
                    if (abstractC15633xee433078.mo63659xfb85f7b0() == 2) {
                        iArr[i17] = 2;
                    } else if ("image/gif".equals(abstractC15633xee433078.f219971p)) {
                        iArr[i17] = 1;
                    } else {
                        iArr[i17] = 0;
                    }
                }
            }
            if (!arrayList.isEmpty() && size != 0) {
                if (!android.text.TextUtils.isEmpty(this.f220173u2)) {
                    int size2 = y76.size();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    int i18 = 0;
                    int i19 = 0;
                    while (i18 < y76.size()) {
                        int f86 = f8(y76, i18);
                        i18++;
                        arrayList2.add(new or.a(i18, 1, f86));
                        if (i19 == 0) {
                            i19 = f86;
                        }
                    }
                    or.d.b(this.f220173u2, 5, 1, java.lang.Integer.valueOf(i19), or.c.a("clk_next_button", this.f220173u2, java.lang.Integer.valueOf(size2), or.c.d(arrayList2)));
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("media_path_list", arrayList);
                intent.putExtra("media_type_list", iArr);
                intent.setClassName(this, "com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity");
                intent.putExtra("query_source_type", this.E1);
                if (!android.text.TextUtils.isEmpty(this.f220173u2)) {
                    intent.putExtra("addstickers_sessionid", this.f220173u2);
                }
                intent.putExtra("key_from_scene", getIntent().getIntExtra("key_from_scene", 0));
                startActivityForResult(intent, 4387);
                overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, com.p314xaae8f345.mm.R.C30854x2dc211.f559262q);
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd
    public void a8(int i17) {
        java.lang.String string;
        i33.g gVar = (i33.g) pf5.z.f435481a.a(this).a(i33.g.class);
        if (i17 == 0 || this.Q <= 1) {
            string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572035ww);
        } else {
            string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572035ww) + "(" + i17 + ")";
        }
        gVar.Y0(string);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd
    public void c8(int i17) {
        super.c8(i17);
        e33.e2 e2Var = this.f220054h2;
        if (e2Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.ActivityC13339x8f3095f9 activityC13339x8f3095f9 = ((e22.h1) e2Var).f328194a;
            if (activityC13339x8f3095f9.X6().m20352xe06bcb0d() == 0) {
                activityC13339x8f3095f9.e7();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        a8(this.f220061m.J());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd
    public e33.b0 o7(boolean z17, e33.i2 i2Var) {
        f33.e eVar = new f33.e(z17, this, i2Var, this.f220173u2);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f220049f;
        eVar.D = true;
        c1163xf1deaba4.P(eVar.F);
        return eVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.f220173u2 = getIntent().getStringExtra("addstickers_sessionid");
        super.onCreate(bundle);
    }
}
