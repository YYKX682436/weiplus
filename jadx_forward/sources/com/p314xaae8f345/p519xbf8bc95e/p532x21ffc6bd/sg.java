package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class sg implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.se {
    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.se
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.el a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.el elVar, java.lang.String str) {
        return elVar;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.se
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.el a(byte[] bArr) {
        return (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.el) com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35881x450f6f3b(new java.lang.String(bArr), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.en.class, new java.lang.Object[0]);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.se
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30 a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.el elVar) {
        com.tencent.mapsdk.internal.el.c.d dVar;
        if (!(elVar instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.en) || !elVar.c()) {
            return null;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.en enVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.en) elVar;
        com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p508x2f6ed16c.C4296xde694d2e c4296xde694d2e = new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p508x2f6ed16c.C4296xde694d2e();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.mapsdk.internal.el.a.C30897a.AbstractC30898a abstractC30898a : enVar.f130875a.f130827c.f130829b) {
            if (abstractC30898a instanceof com.tencent.mapsdk.internal.el.a.C30897a.e) {
                arrayList.addAll(((com.tencent.mapsdk.internal.el.a.C30897a.e) abstractC30898a).f130843c);
            }
        }
        c4296xde694d2e.m35736x93e9161(arrayList);
        int size = enVar.f130875a.f130876a.f130877a.f130884a.f130888a.f130886b.f130859b.size();
        int[] iArr = new int[size];
        for (int i17 = 0; i17 < size; i17++) {
            iArr[i17] = enVar.f130875a.f130876a.f130877a.f130884a.f130888a.f130886b.f130859b.get(i17).intValue();
        }
        float[] fArr = new float[enVar.f130875a.f130876a.f130877a.f130884a.f130888a.f130886b.f130858a.size()];
        for (int i18 = 0; i18 < size; i18++) {
            fArr[i18] = enVar.f130875a.f130876a.f130877a.f130884a.f130888a.f130886b.f130858a.get(i18).floatValue();
        }
        c4296xde694d2e.m35728x557f730(iArr, fArr);
        c4296xde694d2e.m35732xc80e6c92(enVar.f130875a.f130876a.f130877a.f130884a.f130888a.f130885a);
        c4296xde694d2e.m35735x25bfb969(enVar.f130875a.f130876a.f130878b.f130882d.get(1).floatValue());
        com.tencent.mapsdk.internal.en.a.C30904a.C30905a c30905a = enVar.f130875a.f130876a.f130878b;
        c4296xde694d2e.m35734xab28dcc((float) c30905a.f130880b, (float) c30905a.f130879a);
        com.tencent.mapsdk.internal.en.a.C30904a.C30905a c30905a2 = enVar.f130875a.f130876a.f130878b;
        c4296xde694d2e.m35737x61c4912a(c30905a2.f130853k, c30905a2.f130852j);
        c4296xde694d2e.mo35601xd4677478(enVar.f130875a.f130876a.f130878b.f130849g);
        c4296xde694d2e.mo35583x5f34bbe2(enVar.f130875a.f130876a.f130878b.f130848f);
        c4296xde694d2e.m35718x61e1d734(enVar.f130875a.f130876a.f130878b.f130881c);
        c4296xde694d2e.mo35596xb477f80b((float) enVar.f130875a.f130876a.f130878b.f130851i);
        c4296xde694d2e.mo35600x73b66312(!enVar.f130875a.f130876a.f130878b.f130850h);
        com.tencent.mapsdk.internal.en.a.C30904a c30904a = enVar.f130875a.f130876a;
        if (c30904a.f130878b.f130883e && (dVar = c30904a.f130877a.f130884a.f130888a.f130887c) != null) {
            c4296xde694d2e.m35733x7716ded3((int) (dVar.f130857c * 1000.0d));
        } else {
            c4296xde694d2e.m35733x7716ded3(0);
        }
        return c4296xde694d2e;
    }
}
