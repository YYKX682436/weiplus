package td4;

/* loaded from: classes2.dex */
public final class h extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f499216d;

    /* renamed from: e, reason: collision with root package name */
    public final int f499217e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f499218f;

    public h(int i17, int i18, int i19, boolean z17, java.util.Set mIgnoreItemViewTypeSet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mIgnoreItemViewTypeSet, "mIgnoreItemViewTypeSet");
        this.f499216d = i17;
        this.f499217e = i18;
        this.f499218f = mIgnoreItemViewTypeSet;
        new android.graphics.drawable.ColorDrawable(i19);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        int i17;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemOffsets", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerGridItemDecoration");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        if (parent.mo7946xf939df19() != null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = parent.mo7946xf939df19();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7946xf939df19);
            i17 = mo7946xf939df19.mo1894x7e414b06();
        } else {
            i17 = 0;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        int b17 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) layoutParams).b();
        if (b17 < 0 || i17 <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemOffsets", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerGridItemDecoration");
            return;
        }
        if (parent.mo7946xf939df19() != null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = parent.mo7946xf939df19();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7946xf939df192);
            i18 = mo7946xf939df192.mo863xcdaf1228(b17);
        } else {
            i18 = -1;
        }
        if (i18 == -1 || this.f499218f.contains(java.lang.Integer.valueOf(i18))) {
            outRect.set(0, 0, 0, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemOffsets", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerGridItemDecoration");
            return;
        }
        int i19 = this.f499216d;
        int i27 = this.f499217e;
        outRect.set(i19 / 2, i27 / 2, i19 / 2, i27 / 2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemOffsets", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerGridItemDecoration");
    }
}
