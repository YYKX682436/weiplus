package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes.dex */
public final class bz extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5461xeac2e5f8 f215468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iz f215469e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bz(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5461xeac2e5f8 c5461xeac2e5f8, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iz izVar) {
        super(0);
        this.f215468d = c5461xeac2e5f8;
        this.f215469e = izVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5461xeac2e5f8 c5461xeac2e5f8 = this.f215468d;
        if (c5461xeac2e5f8.f135800g.f89902a == 1) {
            java.util.Iterator it = this.f215469e.f216307g.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                }
                java.lang.Long a17 = ((so2.j0) it.next()).a();
                if (a17 != null && a17.longValue() == c5461xeac2e5f8.f135800g.f89903b) {
                    break;
                }
                i17++;
            }
            bu2.q qVar = bu2.q.f106089a;
            long j17 = this.f215468d.f135800g.f89903b;
            synchronized (qVar) {
                pm0.v.c0(bu2.q.f106090b, new bu2.p(j17));
            }
            if (i17 != -1) {
                this.f215469e.f216307g.remove(i17);
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f215469e.f216308h;
                if (c22848x6ddd90cf == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("continueWatchAdapter");
                    throw null;
                }
                c22848x6ddd90cf.m8155x27702c4(i17);
                this.f215469e.O6();
            }
        }
        return jz5.f0.f384359a;
    }
}
