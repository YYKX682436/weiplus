package sf4;

/* loaded from: classes4.dex */
public final class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f489052d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 f489053e;

    public k1(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502) {
        this.f489052d = i17;
        this.f489053e = c18497x85806502;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502.f253618l1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502 = this.f489053e;
        c18497x85806502.f253642z.size();
        int size = c18497x85806502.f253642z.size();
        int i18 = this.f489052d;
        if (i18 < size) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18493x6cdc7fd6 c18493x6cdc7fd6 = c18497x85806502.f253640y;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c18493x6cdc7fd6, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$setCurrentVItem$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            c18493x6cdc7fd6.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c18493x6cdc7fd6, "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$setCurrentVItem$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        }
    }
}
