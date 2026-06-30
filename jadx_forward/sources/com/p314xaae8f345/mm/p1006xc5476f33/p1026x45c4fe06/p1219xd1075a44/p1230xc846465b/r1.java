package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b;

/* loaded from: classes7.dex */
public class r1 extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f173576e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f173577f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean f173578g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.AbstractC12805xabdd4ef7 f173579h;

    public r1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.AbstractC12805xabdd4ef7 abstractC12805xabdd4ef7, boolean z17) {
        this.f173579h = abstractC12805xabdd4ef7;
        this.f173578g = true;
        this.f173578g = z17;
    }

    @Override // wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "MicroMsg.BaseAppBrandRecentView";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.AbstractC12805xabdd4ef7 abstractC12805xabdd4ef7;
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4> list;
        synchronized (this.f173579h.f173447l2) {
            abstractC12805xabdd4ef7 = this.f173579h;
            abstractC12805xabdd4ef7.f173448m2 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.i0 i0Var = abstractC12805xabdd4ef7.f173451p2;
        if (i0Var != null) {
            int mo53644x50b42d13 = abstractC12805xabdd4ef7.mo53644x50b42d13();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.k1) i0Var).getClass();
            list = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b6.class)).t0(mo53644x50b42d13);
        } else {
            list = null;
        }
        ((java.util.ArrayList) this.f173576e).clear();
        ((java.util.ArrayList) this.f173577f).clear();
        if (list != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 mo52197x7520bed6 = this.f173579h.m53622x9e8ccd54() != null ? this.f173579h.m53622x9e8ccd54().mo52197x7520bed6() : null;
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4 : list) {
                if (mo52197x7520bed6 == null || !c11714x918fd2e4.f157894d.equals(mo52197x7520bed6.f157894d) || c11714x918fd2e4.f157896f != mo52197x7520bed6.f157896f) {
                    if (((java.util.ArrayList) this.f173576e).size() < this.f173579h.mo53647x8c6e4d5c()) {
                        ((java.util.ArrayList) this.f173576e).add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.x(c11714x918fd2e4));
                    }
                    if (this.f173579h.f173444i2) {
                        ((java.util.ArrayList) this.f173577f).add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.x(c11714x918fd2e4));
                    }
                    java.lang.String str = c11714x918fd2e4.f157894d;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.l0 l0Var = this.f173579h.f173446k2;
                }
            }
        }
        this.f173579h.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseAppBrandRecentView", "[UpdateAppBrandRecentDataTask] type:%s preview size:%s, data size: %d, mType: %s", this.f173579h.mo53649xfb85f7b0(), java.lang.Integer.valueOf(((java.util.ArrayList) this.f173579h.f173441f2).size()), java.lang.Integer.valueOf(((java.util.ArrayList) this.f173579h.f173445j2).size()), this.f173579h.f173446k2);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.q1(this));
    }
}
