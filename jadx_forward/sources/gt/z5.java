package gt;

/* loaded from: classes9.dex */
public class z5 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public z5() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6187xa3de110b c6187xa3de110b = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6187xa3de110b) abstractC20979x809547d1;
        if (!gm0.j1.a()) {
            return false;
        }
        boolean booleanValue = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ui().z0(k91.o1.a(c6187xa3de110b.f136445g.f89386a), "true")).booleanValue();
        am.rz rzVar = c6187xa3de110b.f136445g;
        if (booleanValue == rzVar.f89387b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreAppBrand", "update with same value, appId:%s", rzVar.f89386a);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ui().P2(k91.o1.a(rzVar.f89386a), java.lang.Boolean.toString(rzVar.f89387b));
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5165x4ba90390 c5165x4ba90390 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5165x4ba90390();
            java.lang.String str = rzVar.f89386a;
            am.v vVar = c5165x4ba90390.f135515g;
            vVar.f89682a = str;
            vVar.f89683b = rzVar.f89387b;
            c5165x4ba90390.e();
        }
        return true;
    }
}
