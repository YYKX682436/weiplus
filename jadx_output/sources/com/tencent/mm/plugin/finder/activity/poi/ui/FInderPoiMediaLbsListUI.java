package com.tencent.mm.plugin.finder.activity.poi.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/activity/poi/ui/FInderPoiMediaLbsListUI;", "Lcom/tencent/mm/plugin/finder/activity/poi/ui/FinderPoiNormalLbsListUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FInderPoiMediaLbsListUI extends com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI {
    public static final /* synthetic */ int T = 0;
    public boolean R;
    public java.lang.String Q = "";
    public ka2.f S = ka2.f.f306029e;

    @Override // com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI
    /* renamed from: e7, reason: from getter */
    public ka2.f getS() {
        return this.S;
    }

    @Override // com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI
    public ka2.f g7() {
        return ka2.f.f306029e;
    }

    @Override // com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI
    public ha2.a h7() {
        return new ha2.a(new r45.hd1(), 7, false, null, null, (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) getIntent().getParcelableExtra("key_media_item"), false, 92, null);
    }

    @Override // com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI
    public java.lang.String i7() {
        if (this.R) {
            java.lang.String string = getContext().getResources().getString(com.tencent.mm.R.string.nyq);
            kotlin.jvm.internal.o.d(string);
            return string;
        }
        java.lang.String string2 = getContext().getResources().getString(com.tencent.mm.R.string.nyp);
        kotlin.jvm.internal.o.d(string2);
        return string2;
    }

    @Override // com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI
    public ka2.f j7() {
        return ka2.f.f306029e;
    }

    @Override // com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI
    public void k7() {
        super.k7();
        java.lang.String stringExtra = getIntent().getStringExtra("key_media_path");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.Q = stringExtra;
        boolean booleanExtra = getIntent().getBooleanExtra("key_is_video", false);
        this.R = booleanExtra;
        jz5.l f17 = booleanExtra ? hc2.l.f(this.Q) : hc2.l.c(this.Q);
        ka2.d dVar = this.L;
        if (f17 != null) {
            r45.gd1 gd1Var = new r45.gd1();
            gd1Var.set(1, java.lang.Float.valueOf((float) ((java.lang.Number) f17.f302833d).doubleValue()));
            gd1Var.set(0, java.lang.Float.valueOf((float) ((java.lang.Number) f17.f302834e).doubleValue()));
            dVar.f306022g = gd1Var;
        }
        dVar.f306017b.add(h7());
    }

    @Override // com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI
    public void l7() {
        super.l7();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.qvz);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/poi/ui/FInderPoiMediaLbsListUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/activity/poi/ui/FInderPoiMediaLbsListUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.uqs);
        if (findViewById2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/activity/poi/ui/FInderPoiMediaLbsListUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/activity/poi/ui/FInderPoiMediaLbsListUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setOnClickListener(new ka2.a(this));
        }
    }

    @Override // com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI
    public void o7(ka2.f fVar) {
        kotlin.jvm.internal.o.g(fVar, "<set-?>");
        this.S = fVar;
    }

    @Override // com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        hideVKB();
        p7();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity
    public boolean onClickDialogSpaceOnHalfScreenMode() {
        p7();
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI.n7(this, null, false, false, true, this.S, this.R ? 4 : 2, 7, null);
    }

    public final void p7() {
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(getContext());
        java.lang.String string = getContext().getResources().getString(com.tencent.mm.R.string.nyn);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        u1Var.g(string);
        u1Var.a(true);
        u1Var.j(getContext().getResources().getString(com.tencent.mm.R.string.f490347sg));
        u1Var.m(com.tencent.mm.R.string.f490008ib);
        u1Var.k(getContext().getResources().getColor(com.tencent.mm.R.color.Link_100));
        u1Var.l(new ka2.b(this));
        u1Var.q(false);
    }
}
