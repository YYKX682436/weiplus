package oa4;

/* loaded from: classes4.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f425385d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f425386e;

    public b(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, java.lang.String str) {
        this.f425385d = c19792x256d2725;
        this.f425386e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e first;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.model.upload.SnsCoverUploadHelper$uploadFinderVideoCover$1");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f425385d;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c19792x256d2725.m76802x2dd01666();
        if (m76802x2dd01666 != null && (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) != null && (first = m76962x74cd162e.getFirst()) != null) {
            java.lang.String str = first.m76623xd93f812f() + first.m76624x4c9b7dca();
            java.lang.String str2 = this.f425386e;
            java.lang.String c17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.c(str2);
            com.p314xaae8f345.mm.vfs.w6.h(c17);
            n11.a b17 = n11.a.b();
            o11.f fVar = new o11.f();
            fVar.f423615f = c17;
            fVar.f423611b = true;
            b17.d(str, fVar.a(), new oa4.a(c17, str2, c19792x256d2725, str));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.upload.SnsCoverUploadHelper$uploadFinderVideoCover$1");
    }
}
