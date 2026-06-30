package av2;

/* loaded from: classes2.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fc2.a f95733d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ av2.c f95734e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1643x4b88b2d8.AbstractActivityC15139x91efb0f1 f95735f;

    public b(fc2.a aVar, av2.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1643x4b88b2d8.AbstractActivityC15139x91efb0f1 abstractActivityC15139x91efb0f1) {
        this.f95733d = aVar;
        this.f95734e = cVar;
        this.f95735f = abstractActivityC15139x91efb0f1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fc2.a aVar = this.f95733d;
        int i17 = ((fc2.t) aVar).f342518d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1643x4b88b2d8.AbstractActivityC15139x91efb0f1 abstractActivityC15139x91efb0f1 = this.f95735f;
        av2.c cVar = this.f95734e;
        if ((i17 == 6 && cVar.f95737h == 0) || ((fc2.t) aVar).f342518d == 0) {
            if (cVar.f95737h != ((fc2.t) aVar).f342525k && abstractActivityC15139x91efb0f1.g7()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHomeSlideProfileUI", "selected change, feed: " + ((fc2.t) aVar).f342525k);
                cVar.f95737h = ((fc2.t) aVar).f342525k;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(((fc2.t) aVar).f342525k);
                if (h17 != null) {
                    abstractActivityC15139x91efb0f1.d7(h17);
                    return;
                }
                return;
            }
            return;
        }
        if (((fc2.t) aVar).f342518d == 5 && ((fc2.t) aVar).f342525k == cVar.f95737h && !abstractActivityC15139x91efb0f1.f211358u) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHomeSlideProfileUI", "try update Biz");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h18 = bu2.j.f106067a.h(((fc2.t) aVar).f342525k);
            if (h18 != null) {
                r45.xk m59211x37f6d02b = h18.m59211x37f6d02b();
                boolean z17 = false;
                if (m59211x37f6d02b != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = abstractActivityC15139x91efb0f1.f211357t;
                    if (m59211x37f6d02b.mo516x5c5a33d4(c14994x9b99c079 != null ? c14994x9b99c079.m59211x37f6d02b() : null)) {
                        z17 = true;
                    }
                }
                if (z17) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHomeSlideProfileUI", "real update Biz");
                abstractActivityC15139x91efb0f1.d7(h18);
            }
        }
    }
}
