package sf4;

/* loaded from: classes4.dex */
public final class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 f489030d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f489031e;

    public j1(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502, int i17) {
        this.f489030d = c18497x85806502;
        this.f489031e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502 = this.f489030d;
        int i17 = c18497x85806502.f253635u;
        if (i17 == -1 || i17 >= c18497x85806502.f253642z.size()) {
            return;
        }
        int size = ((java.util.ArrayList) c18497x85806502.f253642z.get(c18497x85806502.f253635u)).size();
        int i18 = this.f489031e;
        if (i18 < size) {
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502.f253618l1;
            int i27 = c18497x85806502.f253635u;
            c18497x85806502.f253642z.size();
            ((java.util.ArrayList) c18497x85806502.f253642z.get(c18497x85806502.f253635u)).size();
            java.util.Objects.toString(c18497x85806502.f253629p);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = c18497x85806502.f253629p;
            if (c1163xf1deaba4 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(c1163xf1deaba4, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$setCurrentHItem$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                c1163xf1deaba4.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$setCurrentHItem$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            }
        }
    }
}
