package qb2;

/* loaded from: classes10.dex */
public final class h0 implements wn.b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f442750a;

    /* renamed from: b, reason: collision with root package name */
    public final int f442751b;

    /* renamed from: c, reason: collision with root package name */
    public final int f442752c;

    public h0(java.lang.String finderDefaultUsername, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderDefaultUsername, "finderDefaultUsername");
        this.f442750a = finderDefaultUsername;
        this.f442751b = i17;
        this.f442752c = i18;
    }

    @Override // wn.b
    public java.util.List a(int i17) {
        l75.n0 c17 = c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.storage.FinderConversationStorage");
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t80) c17).P0(this.f442750a, i17, 60, kz5.n0.R0(d()), this.f442752c);
    }

    @Override // wn.b
    public java.util.List b() {
        l75.n0 c17 = c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.storage.FinderConversationStorage");
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t80) c17).P0(this.f442750a, 0, 15, kz5.n0.R0(d()), this.f442752c);
    }

    @Override // wn.b
    public l75.n0 c() {
        return ((c61.l7) i95.n0.c(c61.l7.class)).Kj();
    }

    public final java.util.ArrayList d() {
        java.util.ArrayList arrayList = new java.util.ArrayList(2);
        int i17 = this.f442751b;
        int i18 = this.f442752c;
        if (i18 == 2) {
            if (i17 == 1) {
                arrayList.add(2);
                l75.n0 c17 = c();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.storage.FinderConversationStorage");
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t80) c17).J0(i18, this.f442750a) > 0) {
                    arrayList.add(100);
                }
            } else if (i17 == 2) {
                arrayList.add(1);
            } else if (i17 == 3) {
                arrayList.add(3);
            }
        } else if (i17 == 1) {
            arrayList.add(2);
            arrayList.add(200);
        } else if (i17 != 3) {
            arrayList.add(1);
        } else {
            arrayList.add(3);
        }
        return arrayList;
    }
}
