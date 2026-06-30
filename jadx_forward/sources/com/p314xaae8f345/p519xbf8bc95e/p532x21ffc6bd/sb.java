package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class sb implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.se {
    private static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eg b(byte[] bArr) {
        return (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eg) com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35881x450f6f3b(new java.lang.String(bArr), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eg.class, new java.lang.Object[0]);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.se
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.el a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.el elVar, java.lang.String str) {
        return elVar;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.se
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30 a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.el elVar) {
        com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p505x3228a6e2.AbstractC4283x51b62b3f c4287xaaf3c961;
        com.tencent.mapsdk.internal.el.c.d dVar;
        if (!(elVar instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eg) || !elVar.c()) {
            return null;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eg egVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eg) elVar;
        if (egVar.f130780a.f130781a.f130782a.f130789a.f130795a.f130792c.equals("hexagon")) {
            c4287xaaf3c961 = new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p505x3228a6e2.C4285x4594ab42();
        } else {
            c4287xaaf3c961 = egVar.f130780a.f130781a.f130782a.f130789a.f130795a.f130792c.equals("grid") ? new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p505x3228a6e2.C4287xaaf3c961() : null;
        }
        if (c4287xaaf3c961 == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.mapsdk.internal.el.a.C30897a.AbstractC30898a abstractC30898a : egVar.f130780a.f130827c.f130829b) {
            if (abstractC30898a instanceof com.tencent.mapsdk.internal.el.a.C30897a.e) {
                arrayList.addAll(((com.tencent.mapsdk.internal.el.a.C30897a.e) abstractC30898a).f130843c);
            }
        }
        com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p505x3228a6e2.AbstractC4283x51b62b3f m35625x64212b1 = c4287xaaf3c961.m35625x64212b1((com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d[]) arrayList.toArray(new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d[0]));
        int size = egVar.f130780a.f130781a.f130782a.f130789a.f130795a.f130793d.f130859b.size();
        int[] iArr = new int[size];
        for (int i17 = 0; i17 < size; i17++) {
            iArr[i17] = egVar.f130780a.f130781a.f130782a.f130789a.f130795a.f130793d.f130859b.get(i17).intValue();
        }
        double[] dArr = new double[egVar.f130780a.f130781a.f130782a.f130789a.f130795a.f130793d.f130858a.size()];
        for (int i18 = 0; i18 < size; i18++) {
            dArr[i18] = egVar.f130780a.f130781a.f130782a.f130789a.f130795a.f130793d.f130858a.get(i18).doubleValue();
        }
        m35625x64212b1.m35607xaf3ebd70(iArr, dArr);
        m35625x64212b1.m35630x35e001(egVar.f130780a.f130781a.f130782a.f130789a.f130795a.f130791b);
        m35625x64212b1.gap(egVar.f130780a.f130781a.f130782a.f130789a.f130795a.f130790a);
        m35625x64212b1.m35628x31f41294(egVar.f130780a.f130781a.f130783b.f130787d.get(0).doubleValue(), egVar.f130780a.f130781a.f130783b.f130787d.get(1).doubleValue());
        com.tencent.mapsdk.internal.eg.a.C30887a.C30888a c30888a = egVar.f130780a.f130781a.f130783b;
        m35625x64212b1.m35629xab28dcc(c30888a.f130785b, c30888a.f130784a);
        com.tencent.mapsdk.internal.eg.a.C30887a.C30888a c30888a2 = egVar.f130780a.f130781a.f130783b;
        m35625x64212b1.m35632x61c4912a(c30888a2.f130853k, c30888a2.f130852j);
        m35625x64212b1.mo35601xd4677478(egVar.f130780a.f130781a.f130783b.f130849g);
        m35625x64212b1.mo35583x5f34bbe2(egVar.f130780a.f130781a.f130783b.f130848f);
        m35625x64212b1.m35608x61e1d734(egVar.f130780a.f130781a.f130783b.f130786c);
        m35625x64212b1.mo35596xb477f80b((float) egVar.f130780a.f130781a.f130783b.f130851i);
        m35625x64212b1.mo35600x73b66312(!egVar.f130780a.f130781a.f130783b.f130850h);
        com.tencent.mapsdk.internal.eg.a.C30887a c30887a = egVar.f130780a.f130781a;
        if (c30887a.f130783b.f130788e && (dVar = c30887a.f130782a.f130789a.f130795a.f130794e) != null) {
            m35625x64212b1.m35626x7716ded3((int) (dVar.f130857c * 1000.0d));
        } else {
            m35625x64212b1.m35626x7716ded3(0);
        }
        return m35625x64212b1;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.se
    public final /* synthetic */ com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.el a(byte[] bArr) {
        return (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eg) com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35881x450f6f3b(new java.lang.String(bArr), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eg.class, new java.lang.Object[0]);
    }
}
