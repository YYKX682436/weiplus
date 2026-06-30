package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderGalleryUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderGalleryUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI {

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.gallery.i f109273u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.gallery.d f109274v;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f109272t = "Finder.FinderGalleryUI";

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f109275w = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.j4(this));

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f109276x = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.i4(this));

    public final com.tencent.mm.plugin.finder.gallery.d c7() {
        com.tencent.mm.plugin.finder.gallery.d dVar = this.f109274v;
        if (dVar != null) {
            return dVar;
        }
        kotlin.jvm.internal.o.o("galleryConfig");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.aji;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        c7().h(this, i17, i18, intent, com.tencent.mm.plugin.finder.gallery.c.f111355d);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f109274v != null) {
            c7().j();
        }
        super.onBackPressed();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.FinderGalleryUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.finder.gallery.i0 i0Var;
        com.tencent.mm.plugin.finder.gallery.i iVar = this.f109273u;
        if (iVar == null) {
            kotlin.jvm.internal.o.o("galleryCore");
            throw null;
        }
        if (iVar.f111379i >= 0) {
            ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
            mv2.f0.f331561a.t(iVar.f111381k);
        }
        com.tencent.mm.plugin.finder.gallery.b0 b0Var = com.tencent.mm.plugin.finder.gallery.b0.f111350a;
        com.tencent.mm.plugin.finder.gallery.j0 j0Var = (com.tencent.mm.plugin.finder.gallery.j0) kz5.n0.a0(iVar.f111376f, iVar.f111377g.getCurrentItem());
        int i17 = (j0Var == null || (i0Var = j0Var.f111386d) == null) ? 0 : i0Var.f111383a;
        com.tencent.mm.autogen.mmdata.rpt.FinderPickerDataReportStruct finderPickerDataReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderPickerDataReportStruct();
        finderPickerDataReportStruct.q(com.tencent.mm.plugin.finder.gallery.b0.f111351b);
        finderPickerDataReportStruct.f57492e = com.tencent.mm.plugin.finder.gallery.b0.f111352c;
        finderPickerDataReportStruct.f57493f = 3L;
        finderPickerDataReportStruct.p(b0Var.a(i17));
        finderPickerDataReportStruct.f57495h = b0Var.b(i17);
        finderPickerDataReportStruct.s("");
        finderPickerDataReportStruct.r(java.lang.String.valueOf(c01.id.c()));
        finderPickerDataReportStruct.k();
        b0Var.h(finderPickerDataReportStruct);
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
            return;
        }
        removeOptionMenu(3);
    }
}
