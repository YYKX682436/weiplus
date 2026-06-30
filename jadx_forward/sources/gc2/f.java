package gc2;

/* loaded from: classes10.dex */
public final class f implements gc2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea f351939a;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea c13728x20aad6ea) {
        this.f351939a = c13728x20aad6ea;
    }

    @Override // gc2.c
    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea c13728x20aad6ea = this.f351939a;
        int i18 = c13728x20aad6ea.f186843m2;
        c13728x20aad6ea.getClass();
        boolean z17 = (i18 == -1 && i17 == 0) ? false : true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRecyclerView", "onPageSelected position:" + i17 + ", currentItem:" + c13728x20aad6ea.f186843m2 + ", needNotify:" + z17);
        if (c13728x20aad6ea.f186843m2 != i17) {
            c13728x20aad6ea.f186843m2 = i17;
            gc2.c cVar = c13728x20aad6ea.f186841k2;
            if (cVar == null || !z17 || cVar == null) {
                return;
            }
            cVar.a(recyclerView, i17);
        }
    }

    @Override // gc2.c
    public void b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRecyclerView", "onPageScrollStateChanged state = " + i17);
        gc2.c cVar = this.f351939a.f186841k2;
        if (cVar != null) {
            cVar.b(recyclerView, i17);
        }
    }

    @Override // gc2.c
    public void c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, float f17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        gc2.c cVar = this.f351939a.f186841k2;
        if (cVar != null) {
            cVar.c(recyclerView, i17, f17, i18);
        }
    }
}
