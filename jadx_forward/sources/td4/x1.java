package td4;

/* loaded from: classes4.dex */
public final class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9 f499284d;

    public x1(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9 activityC18377xa17a84b9) {
        this.f499284d = activityC18377xa17a84b9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$showLoadingMoreFooter$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9 activityC18377xa17a84b9 = this.f499284d;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9.Z6(activityC18377xa17a84b9)) {
            td4.g0 a76 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9.a7(activityC18377xa17a84b9);
            a76.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showLoadingView", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            if ((!a76.N().isEmpty()) && a76.P().d((td4.f2) kz5.n0.i0(a76.N()))) {
                yz5.a aVar = a76.f499211t;
                if (aVar != null) {
                    aVar.mo152xb9724478();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showLoadingView", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            } else {
                if (!a76.N().isEmpty()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isDataLoadAll", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase");
                    td4.h0 y17 = a76.y();
                    y17.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMAllPageDataLoadFinish", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
                    boolean z17 = y17.f499223e;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMAllPageDataLoadFinish", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDataLoadAll", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase");
                    if (!z17) {
                        java.util.List N = a76.N();
                        a76.P().getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createSnsPickerLoadingInfo", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226();
                        c17933xe8d1b226.m70443x6e018feb(-4);
                        c17933xe8d1b226.m70467x4e3c7448(-4);
                        r45.jj4 jj4Var = new r45.jj4();
                        jj4Var.f459388d = "-4";
                        td4.f2 f2Var = new td4.f2(c17933xe8d1b226, jj4Var);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createSnsPickerLoadingInfo", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
                        N.add(f2Var);
                        a76.m8149x8b456734(a76.N().size() - 1);
                        yz5.a aVar2 = a76.f499211t;
                        if (aVar2 != null) {
                            aVar2.mo152xb9724478();
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showLoadingView", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showLoadingView", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$showLoadingMoreFooter$1");
    }
}
