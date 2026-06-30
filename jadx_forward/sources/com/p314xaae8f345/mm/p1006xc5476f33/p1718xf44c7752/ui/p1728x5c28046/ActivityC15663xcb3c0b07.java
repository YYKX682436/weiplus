package com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.p1728x5c28046;

@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.gallery.ui.emoji.EmojiImagePreviewUI */
/* loaded from: classes10.dex */
public class ActivityC15663xcb3c0b07 extends com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 {

    /* renamed from: n2, reason: collision with root package name */
    public static final /* synthetic */ int f220174n2 = 0;

    /* renamed from: l2, reason: collision with root package name */
    public java.lang.String f220175l2;

    /* renamed from: m2, reason: collision with root package name */
    public f33.b f220176m2 = f33.b.ENABLED;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561
    public void E7(java.lang.String str) {
        this.f220135v.setVisibility(8);
        this.f220136w.setVisibility(8);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561
    public void K7(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078) {
    }

    public final void L7(android.view.View view) {
        super.o7(view);
        java.util.ArrayList arrayList = this.f220125n;
        X6((arrayList == null || arrayList.isEmpty()) ? false : true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561
    public java.lang.String e7() {
        int size = this.f220125n.size();
        if (size == 0 || this.A <= 1) {
            return getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572035ww);
        }
        return getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572035ww) + "(" + size + ")";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561
    public void n7(int i17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 a76 = a7();
        if (a76 == null) {
            return;
        }
        boolean isEmpty = this.f220125n.isEmpty();
        f33.b bVar = f33.b.ENABLED;
        if (isEmpty || a76.mo63659xfb85f7b0() != 1 || this.f220125n.size() < this.A || this.f220125n.contains(a76)) {
            if (!this.f220125n.isEmpty() && ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) this.f220125n.get(0)).mo63659xfb85f7b0() != a76.mo63659xfb85f7b0()) {
                this.f220176m2 = f33.b.DISABLED_BY_MIXED_TYPE;
            } else if (this.f220125n.isEmpty() || ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) this.f220125n.get(0)).mo63659xfb85f7b0() != 2 || a76.mo63659xfb85f7b0() != 2 || this.f220125n.contains(a76)) {
                this.f220176m2 = bVar;
            } else {
                this.f220176m2 = f33.b.DISABLED_BY_VIDEO_LIMIT;
            }
        } else if (this.A < 9) {
            this.f220176m2 = f33.b.DISABLED_BY_CUSTOM_LIMIT;
        } else {
            this.f220176m2 = f33.b.DISABLED_BY_LIMIT;
        }
        if (this.f220176m2 != bVar) {
            this.D.setAlpha(0.5f);
            this.F.setAlpha(0.5f);
        } else {
            this.D.setAlpha(1.0f);
            this.F.setAlpha(1.0f);
        }
        java.util.ArrayList arrayList = this.f220125n;
        X6((arrayList == null || arrayList.isEmpty()) ? false : true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561
    public void o7(android.view.View view) {
        java.lang.String string;
        int i17;
        if (this.f220176m2 == f33.b.ENABLED) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 a76 = a7();
            if (a76 == null) {
                return;
            }
            if (!"image/gif".equals(a76.f219971p)) {
                L7(view);
                return;
            }
            ck5.c cVar = new ck5.c(a76.f219963e);
            cVar.f124083b = ip.c.b();
            int c17 = ip.c.c();
            cVar.f124084c = c17;
            cVar.f124085d = c17;
            cVar.a(new f33.a(this, view));
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        int ordinal = this.f220176m2.ordinal();
        if (ordinal != 1) {
            i17 = 2;
            if (ordinal == 2) {
                string = mo55332x76847179.getString(com.p314xaae8f345.mm.R.C30867xcad56011.obe);
            } else if (ordinal == 3) {
                string = mo55332x76847179.getString(com.p314xaae8f345.mm.R.C30867xcad56011.obk, 1);
                i17 = 4;
            } else if (ordinal != 4) {
                i17 = 0;
                string = "";
            } else {
                string = mo55332x76847179.getString(com.p314xaae8f345.mm.R.C30867xcad56011.obf, java.lang.Integer.valueOf(this.A));
            }
        } else {
            string = mo55332x76847179.getString(com.p314xaae8f345.mm.R.C30867xcad56011.obi, java.lang.Integer.valueOf(this.A));
            i17 = 1;
        }
        if (android.text.TextUtils.isEmpty(string)) {
            return;
        }
        if (!android.text.TextUtils.isEmpty(this.f220175l2)) {
            or.d.b(this.f220175l2, 5, 1, null, or.c.b("warning_pup_win", this.f220175l2, null, null, java.lang.Integer.valueOf(i17)));
        }
        db5.e1.s(mo55332x76847179, "", string);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiImagePreviewUI", "onActivityResult, resultCode: " + i18);
        if (i18 == -1) {
            setResult(-1, new android.content.Intent());
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("addstickers_sessionid");
        this.f220175l2 = stringExtra;
        if (!android.text.TextUtils.isEmpty(stringExtra) && !android.text.TextUtils.isEmpty(this.f220175l2)) {
            java.util.ArrayList arrayList = this.f220125n;
            int size = arrayList != null ? arrayList.size() : 0;
            java.lang.String sessionId = this.f220175l2;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(size);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
            or.d.b(this.f220175l2, 5, 1, null, or.c.c("clk_preview", sessionId, valueOf, null, null, 24, null));
        }
        java.util.ArrayList arrayList2 = this.f220125n;
        X6((arrayList2 == null || arrayList2.isEmpty()) ? false : true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561
    public boolean p7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiImagePreviewUI", "onSendItemClick");
        java.util.ArrayList arrayList = this.f220125n;
        if (arrayList != null && !arrayList.isEmpty() && !android.text.TextUtils.isEmpty(this.f220175l2)) {
            int size = this.f220125n.size();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int i17 = 0;
            int i18 = 0;
            while (i17 < this.f220125n.size()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) this.f220125n.get(i17);
                int i19 = abstractC15633xee433078.mo63659xfb85f7b0() == 2 ? 3 : "image/gif".equals(abstractC15633xee433078.f219971p) ? 4 : 1;
                i17++;
                arrayList2.add(new or.a(i17, 1, i19));
                if (i18 == 0) {
                    i18 = i19;
                }
            }
            or.d.b(this.f220175l2, 5, 1, java.lang.Integer.valueOf(i18), or.c.a("clk_next_button", this.f220175l2, java.lang.Integer.valueOf(size), or.c.d(arrayList2)));
        }
        java.util.ArrayList arrayList3 = this.f220125n;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            int[] iArr = new int[this.f220125n.size()];
            for (int i27 = 0; i27 < this.f220125n.size(); i27++) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee4330782 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) this.f220125n.get(i27);
                arrayList4.add(abstractC15633xee4330782.f219963e);
                if (abstractC15633xee4330782.mo63659xfb85f7b0() == 2) {
                    iArr[i27] = 2;
                } else if ("image/gif".equals(abstractC15633xee4330782.f219971p)) {
                    iArr[i27] = 1;
                } else {
                    iArr[i27] = 0;
                }
            }
            if (arrayList4.isEmpty()) {
                return true;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("media_path_list", arrayList4);
            intent.putExtra("media_type_list", iArr);
            intent.setClassName(this, "com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity");
            intent.putExtra("query_source_type", getIntent().getIntExtra("query_source_type", 0));
            intent.putExtra("key_from_scene", getIntent().getIntExtra("key_from_scene", 0));
            if (!android.text.TextUtils.isEmpty(this.f220175l2)) {
                intent.putExtra("addstickers_sessionid", this.f220175l2);
            }
            startActivityForResult(intent, 4387);
        }
        return true;
    }
}
