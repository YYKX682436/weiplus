package yx2;

/* loaded from: classes15.dex */
public final class t implements zy2.a6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1676x2ef9413f.C15433xbefc23a9 f549408a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v94.h f549409b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f549410c;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1676x2ef9413f.C15433xbefc23a9 c15433xbefc23a9, v94.h hVar, boolean z17) {
        this.f549408a = c15433xbefc23a9;
        this.f549409b = hVar;
        this.f549410c = z17;
    }

    @Override // zy2.a6
    public final void a(java.lang.Object obj, int i17, int i18) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1676x2ef9413f.C15433xbefc23a9 c15433xbefc23a9 = this.f549408a;
        str = c15433xbefc23a9.TAG;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "updateFinderObject errType" + i17 + " errCode:" + i18);
        boolean z17 = obj instanceof com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725;
        v94.h hVar = this.f549409b;
        if (!z17) {
            if (!(((ee0.h4) ((fe0.d4) i95.n0.c(fe0.d4.class))).wi() && i17 == 4) && ((ee0.h4) ((fe0.d4) i95.n0.c(fe0.d4.class))).wi()) {
                return;
            }
            str2 = c15433xbefc23a9.TAG;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "updateFinderObject to block");
            fe0.g4 Ni = ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Ni();
            java.lang.String m70536x6bf53a6c = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x1) hVar).m70536x6bf53a6c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m70536x6bf53a6c, "getUserName(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.a2) Ni).y0(m70536x6bf53a6c);
            return;
        }
        fe0.g4 Ni2 = ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Ni();
        java.lang.String m70536x6bf53a6c2 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x1) hVar).m70536x6bf53a6c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m70536x6bf53a6c2, "getUserName(...)");
        java.lang.Long u07 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x1) hVar).u0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u07, "getSnsObjId(...)");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj;
        ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.a2) Ni2).b1(m70536x6bf53a6c2, u07.longValue(), c19792x256d2725);
        if (this.f549410c) {
            c15433xbefc23a9.m62914x7411ecea(c19792x256d2725);
        }
    }
}
