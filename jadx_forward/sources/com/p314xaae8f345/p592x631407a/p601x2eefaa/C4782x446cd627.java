package com.p314xaae8f345.p592x631407a.p601x2eefaa;

/* renamed from: com.tencent.midas.data.APMidasAnalyzeParams */
/* loaded from: classes13.dex */
public class C4782x446cd627 {

    /* renamed from: com.tencent.midas.data.APMidasAnalyzeParams$SingletonHolder */
    /* loaded from: classes13.dex */
    public static class SingletonHolder {

        /* renamed from: instance */
        private static com.p314xaae8f345.p592x631407a.p601x2eefaa.C4782x446cd627 f20534x21169495 = new com.p314xaae8f345.p592x631407a.p601x2eefaa.C4782x446cd627();

        private SingletonHolder() {
        }
    }

    /* renamed from: AnalyzeCommParams */
    private void m41825x6a3065fe(com.p314xaae8f345.p592x631407a.api.p594x414ef28f.AbstractC4741xef9abf3 abstractC4741xef9abf3) {
        try {
            com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d m41839xa6eb780b = com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.m41839xa6eb780b();
            m41839xa6eb780b.m41897x54ed85d5(abstractC4741xef9abf3.f20183xa3aefc97);
            m41839xa6eb780b.m41898x1c101c07(abstractC4741xef9abf3.f20184xc3c3c505);
            m41839xa6eb780b.m41899x65f36cf3(abstractC4741xef9abf3.f20185xb4b4e3b5);
            m41839xa6eb780b.m41917x7ffb700f(abstractC4741xef9abf3.f20193x243a3e51);
            m41839xa6eb780b.m41918x6ee5052e(abstractC4741xef9abf3.f20194xfea94af0);
            m41839xa6eb780b.m41901x68435f8(abstractC4741xef9abf3.f134673pf);
            m41839xa6eb780b.m41902x53858d47(abstractC4741xef9abf3.f20186x659cc89);
            m41839xa6eb780b.m41923x2ecb48e9(abstractC4741xef9abf3.f20195xd67ef1e7);
            m41839xa6eb780b.m41886x5041feac(abstractC4741xef9abf3.f20182xc04d5cf1.f20209xe006446e);
            m41839xa6eb780b.m41911x2099e3cb(abstractC4741xef9abf3.f20190xc84d8cc9);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("AnalyzeCommParams", e17.toString());
        }
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p592x631407a.p601x2eefaa.C4782x446cd627 m41826x9cf0d20b() {
        return com.p314xaae8f345.p592x631407a.p601x2eefaa.C4782x446cd627.SingletonHolder.f20534x21169495;
    }

    /* renamed from: AnalyzeParams */
    public void m41827x59ca49d2(com.p314xaae8f345.p592x631407a.api.p594x414ef28f.AbstractC4741xef9abf3 abstractC4741xef9abf3) {
        if (abstractC4741xef9abf3 != null) {
            m41825x6a3065fe(abstractC4741xef9abf3);
            m41828xfb095cd9(abstractC4741xef9abf3);
        }
    }

    /* renamed from: setSaveType */
    public void m41828xfb095cd9(com.p314xaae8f345.p592x631407a.api.p594x414ef28f.AbstractC4741xef9abf3 abstractC4741xef9abf3) {
        com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d m41839xa6eb780b = com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.m41839xa6eb780b();
        try {
            if (abstractC4741xef9abf3 instanceof com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4743x7dd68fb2) {
                if (abstractC4741xef9abf3.f20175x80d559ed.equals("qb")) {
                    m41839xa6eb780b.m41912xfb095cd9(3);
                } else {
                    m41839xa6eb780b.m41912xfb095cd9(0);
                }
            } else if (abstractC4741xef9abf3 instanceof com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4744x18108f84) {
                m41839xa6eb780b.m41912xfb095cd9(1);
            } else if (abstractC4741xef9abf3 instanceof com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4745x1f8b011a) {
                m41839xa6eb780b.m41912xfb095cd9(4);
            } else if (abstractC4741xef9abf3 instanceof com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4748x6578e190) {
                m41839xa6eb780b.m41912xfb095cd9(5);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("setSaveType", e17.toString());
        }
    }
}
