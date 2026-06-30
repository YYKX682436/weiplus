package com.tencent.mm.plugin.fav.ui;

@db5.a(8192)
/* loaded from: classes12.dex */
public class FavSelectUI extends com.tencent.mm.plugin.fav.ui.FavBaseUI {
    public java.lang.String S;
    public java.lang.String T;
    public com.tencent.mm.plugin.fav.ui.adapter.c U = null;
    public final java.util.Set V = new java.util.HashSet();
    public final o72.b3 W = new o72.b3(true, true);
    public final android.view.View.OnClickListener X = new com.tencent.mm.plugin.fav.ui.w5(this);

    @Override // com.tencent.mm.plugin.fav.ui.FavBaseUI
    public boolean V6() {
        return ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().getCount() > 0;
    }

    @Override // com.tencent.mm.plugin.fav.ui.FavBaseUI
    public void a7() {
    }

    @Override // com.tencent.mm.plugin.fav.ui.FavBaseUI
    public void c7() {
    }

    @Override // com.tencent.mm.plugin.fav.ui.FavBaseUI
    public com.tencent.mm.plugin.fav.ui.adapter.b d7() {
        if (this.U == null) {
            this.U = new com.tencent.mm.plugin.fav.ui.adapter.c(getContext(), this.f100281v, false);
        }
        return this.U;
    }

    @Override // com.tencent.mm.plugin.fav.ui.FavBaseUI
    public java.util.Set e7() {
        return this.V;
    }

    @Override // com.tencent.mm.plugin.fav.ui.FavBaseUI
    public o72.i4 f7() {
        return this.W;
    }

    @Override // com.tencent.mm.plugin.fav.ui.FavBaseUI
    public android.view.View.OnClickListener g7() {
        return this.X;
    }

    @Override // com.tencent.mm.plugin.fav.ui.FavBaseUI
    public java.lang.String h7() {
        return i65.a.r(this, com.tencent.mm.R.string.cct);
    }

    @Override // com.tencent.mm.plugin.fav.ui.FavBaseUI
    public void l7() {
    }

    @Override // com.tencent.mm.plugin.fav.ui.FavBaseUI
    public void m7() {
        this.f100272m.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.favorites_regular, com.tencent.mm.R.color.f478520a84));
        this.f100271i.setText(com.tencent.mm.R.string.ca7);
    }

    @Override // com.tencent.mm.plugin.fav.ui.FavBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 0 && -1 == i18) {
            finish();
        } else {
            super.onActivityResult(i17, i18, intent);
        }
    }

    @Override // com.tencent.mm.plugin.fav.ui.FavBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.T = getIntent().getStringExtra("key_to_user");
        java.lang.String stringExtra = getIntent().getStringExtra("key_fav_item_id");
        this.S = stringExtra;
        java.util.Set set = this.V;
        if (stringExtra != null) {
            for (java.lang.String str : stringExtra.split(",")) {
                int P = com.tencent.mm.sdk.platformtools.t8.P(str, Integer.MAX_VALUE);
                if (Integer.MAX_VALUE != P) {
                    ((java.util.HashSet) set).add(java.lang.Integer.valueOf(P));
                }
            }
        }
        ((java.util.HashSet) set).remove(3);
        super.onCreate(bundle);
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = this.U;
        cVar.f100475f = set;
        o72.b3 b3Var = this.W;
        b3Var.f343310a = false;
        b3Var.f343311b = false;
        cVar.f100476g = b3Var;
        this.f100276q.post(new com.tencent.mm.plugin.fav.ui.q5(this));
        if (!this.F) {
            addIconOptionMenu(0, com.tencent.mm.R.raw.actionbar_icon_dark_search, new com.tencent.mm.plugin.fav.ui.r5(this));
        }
        setMMTitle(com.tencent.mm.R.string.cct);
        setBackBtn(new com.tencent.mm.plugin.fav.ui.s5(this));
        ((qg5.j2) ((ct.y2) i95.n0.c(ct.y2.class))).getClass();
        fk5.y.f263683d.getClass();
        fk5.y.f263684e = false;
    }

    @Override // com.tencent.mm.plugin.fav.ui.FavBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((qg5.j2) ((ct.y2) i95.n0.c(ct.y2.class))).getClass();
        fk5.y.f263683d.getClass();
        fk5.y.f263684e = true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        int i18;
        s82.g gVar = (s82.g) view.getTag();
        if (gVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavSelectUI", "on item click, holder is null");
            return;
        }
        o72.r2 r2Var = gVar.f404774a;
        if (r2Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavSelectUI", "on item click, info is null");
            return;
        }
        o72.v2.e(r2Var.field_localId, 1, 1, i17 - this.f100270h.getHeaderViewsCount(), 0, -1, -1, -1);
        if (r2Var.field_type == 19 && com.tencent.mm.plugin.fav.ui.b0.b(r2Var.field_favProto.I)) {
            com.tencent.mm.ui.widget.snackbar.j.c(getString(com.tencent.mm.R.string.f489703c), null, this, null, null);
            return;
        }
        if (r2Var.field_type == 5 && o72.j3.a(r2Var.field_favProto.f370968m)) {
            com.tencent.mm.ui.widget.snackbar.j.c(getString(com.tencent.mm.R.string.f489707g), null, this, null, null);
            return;
        }
        int i19 = r2Var.field_type;
        if (i19 == 3) {
            com.tencent.mm.ui.widget.snackbar.j.c(getString(com.tencent.mm.R.string.f489706f), null, this, null, null);
            return;
        }
        if (i19 == 8 && c01.e2.G(this.T)) {
            com.tencent.mm.ui.widget.snackbar.j.c(getString(com.tencent.mm.R.string.f489704d), null, this, null, null);
            return;
        }
        if (r2Var.field_type == 8 && new o72.b3().a(r2Var, true, true)) {
            com.tencent.mm.ui.widget.snackbar.j.c(getString(com.tencent.mm.R.string.f489705e), null, this, null, null);
            return;
        }
        long i27 = ip.c.i();
        if (r2Var.field_type == 18) {
            i27 = ip.c.h();
            i18 = com.tencent.mm.R.string.c_t;
        } else {
            i18 = com.tencent.mm.R.string.c_u;
        }
        long j18 = r2Var.field_datatotalsize;
        com.tencent.mars.xlog.Log.i("MicroMsg.FavSelectUI", "fav total size:%s, limitSize:%s", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(i27));
        if (j18 > i27) {
            com.tencent.mm.ui.widget.snackbar.j.c(getString(i18, com.tencent.mm.sdk.platformtools.t8.f0(i27)), null, this, null, null);
            return;
        }
        ((x82.l0) ((o72.w4) i95.n0.c(o72.w4.class))).Ai(getContext(), this.T, gVar.f404774a, com.tencent.mm.R.string.f490551ya, true, new com.tencent.mm.plugin.fav.ui.v5(this, gVar));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        com.tencent.mm.plugin.fav.ui.da daVar = (com.tencent.mm.plugin.fav.ui.da) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.fav.ui.da.class);
        java.lang.String toUser = this.T;
        java.lang.String blockStr = this.S;
        daVar.getClass();
        kotlin.jvm.internal.o.g(toUser, "toUser");
        kotlin.jvm.internal.o.g(blockStr, "blockStr");
        daVar.f100593x = true;
        daVar.f100591v = toUser;
        daVar.f100592w = blockStr;
        o72.i4 i4Var = daVar.f100594y;
        o72.b3 b3Var = (o72.b3) i4Var;
        b3Var.f343312c = true;
        b3Var.f343313d = true;
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = daVar.f100583n;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("mResultAdapter");
            throw null;
        }
        cVar.f100476g = i4Var;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(blockStr);
        java.util.HashSet hashSet = daVar.f100595z;
        if (!K0) {
            java.lang.String str = daVar.f100592w;
            kotlin.jvm.internal.o.d(str);
            for (java.lang.String str2 : (java.lang.String[]) new r26.t(",").g(str, 0).toArray(new java.lang.String[0])) {
                int P = com.tencent.mm.sdk.platformtools.t8.P(str2, Integer.MAX_VALUE);
                if (Integer.MAX_VALUE != P) {
                    hashSet.add(java.lang.Integer.valueOf(P));
                }
            }
        }
        com.tencent.mm.plugin.fav.ui.adapter.c cVar2 = daVar.f100583n;
        if (cVar2 == null) {
            kotlin.jvm.internal.o.o("mResultAdapter");
            throw null;
        }
        cVar2.f100475f = hashSet;
        cVar2.f100476g = i4Var;
    }
}
