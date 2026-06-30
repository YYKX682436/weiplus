package td4;

/* loaded from: classes4.dex */
public final class l0 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o {

    /* renamed from: c, reason: collision with root package name */
    public final int f499231c;

    /* renamed from: d, reason: collision with root package name */
    public final td4.k0 f499232d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f499233e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f499234f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f499235g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f499236h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f499237i;

    public l0(int i17, td4.k0 k0Var, java.lang.String mUserName, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mUserName, "mUserName");
        this.f499231c = i17;
        this.f499232d = k0Var;
        this.f499233e = mUserName;
        this.f499234f = z17;
        this.f499235g = new java.util.LinkedList();
        this.f499236h = "";
        this.f499237i = "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x01cb, code lost:
    
        if (r1.moveToFirst() != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01cd, code lost:
    
        r3 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226();
        r3.mo9015xbf5d97fd(r1);
        r5.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01dc, code lost:
    
        if (r1.moveToNext() != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01de, code lost:
    
        r1.close();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsPicForCountByUserName", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00b8, code lost:
    
        if (r4.moveToFirst() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00ba, code lost:
    
        r6 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226();
        r6.mo9015xbf5d97fd(r4);
        r5.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00c9, code lost:
    
        if (r4.moveToNext() != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00cb, code lost:
    
        r4.close();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsListForCountByUserName", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0295 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0253 A[SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List b() {
        /*
            Method dump skipped, instructions count: 931
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: td4.l0.b():java.util.List");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o
    public void c(java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("publicNotify", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        td4.k0 k0Var = this.f499232d;
        if (k0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLoadDataFinish", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$initSnsAlbumAdapterHelper$1");
            td4.g0 g0Var = ((td4.z) k0Var).f499288a;
            g0Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateAdapterData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateByDataSetChange", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            if (list.isEmpty()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateByDataSetChange", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            } else {
                g0Var.R();
                int size = g0Var.N().size();
                g0Var.N().addAll(list);
                g0Var.m8153xd399a4d9(size, g0Var.N().size() - size);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateByDataSetChange", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateAdapterData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMLoadDataFinishCallback", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            td4.k kVar = g0Var.f499207p;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMLoadDataFinishCallback", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            if (kVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLoadDataFinish", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initPickerAdapter$2");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAlbumPickerUI", "Adapter onLoadDataFinish callback to UI ，list count = " + list.size());
                boolean isEmpty = list.isEmpty();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9 activityC18377xa17a84b9 = ((td4.i1) kVar).f499226a;
                if (!isEmpty || com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9.a7(activityC18377xa17a84b9).mo1894x7e414b06() > 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9.Y6(activityC18377xa17a84b9).setVisibility(0);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMStateDataTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                    android.widget.TextView g76 = activityC18377xa17a84b9.g7();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMStateDataTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                    g76.setVisibility(8);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9.Y6(activityC18377xa17a84b9).setVisibility(4);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMStateDataTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                    android.widget.TextView g77 = activityC18377xa17a84b9.g7();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMStateDataTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                    g77.setVisibility(0);
                    if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9.Z6(activityC18377xa17a84b9)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMStateDataTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                        android.widget.TextView g78 = activityC18377xa17a84b9.g7();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMStateDataTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                        g78.setText(activityC18377xa17a84b9.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j98));
                    }
                }
                if (list.isEmpty() && com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9.Z6(activityC18377xa17a84b9)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9.X6(activityC18377xa17a84b9);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLoadDataFinish", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initPickerAdapter$2");
            }
            if (!td4.g0.L(g0Var).isEmpty()) {
                long j17 = ((td4.f2) kz5.n0.i0(td4.g0.L(g0Var))).a().f68891x29d1292e;
            }
            g0Var.x();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLoadDataFinish", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$initSnsAlbumAdapterHelper$1");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("publicNotify", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
    }

    public final boolean d(td4.f2 info) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isLoadingInfo", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        boolean z17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(info.b().f459388d, "-4") && info.a().m70357x3fdd41df() == -4 && info.a().m70373x5384133c() == -4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isLoadingInfo", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
        return z17;
    }

    public final boolean e(td4.f2 info) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isTimeInfo", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        boolean z17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(info.b().f459388d, "-1") && info.a().m70357x3fdd41df() == -1 && info.a().m70373x5384133c() == -1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isTimeInfo", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
        return z17;
    }
}
