package dt;

/* loaded from: classes9.dex */
public class n5 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public n5() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361 c5990xd50ae361 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361) abstractC20979x809547d1;
        com.p314xaae8f345.mm.app.w7 w7Var = com.p314xaae8f345.mm.app.w7.f135429f;
        java.util.Iterator it = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(c5990xd50ae361.f136285g.f88895a.split(",")).iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            boolean a17 = w11.t1.a(str);
            am.mt mtVar = c5990xd50ae361.f136285g;
            if (a17) {
                w11.r1 a18 = w11.s1.a(str);
                a18.e(mtVar.f88896b);
                a18.h(mtVar.f88897c);
                a18.f523664f = mtVar.f88898d;
                a18.b();
            } else {
                w11.r1 a19 = w11.s1.a(str);
                a19.g(str);
                a19.e(mtVar.f88896b);
                a19.h(mtVar.f88897c);
                a19.f523664f = mtVar.f88898d;
                a19.f523667i = 4;
                a19.a().a();
            }
        }
        return false;
    }
}
