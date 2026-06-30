package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class sc implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.se {
    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.se
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.el a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.el elVar, java.lang.String str) {
        return elVar;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.se
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.el a(byte[] bArr) {
        return (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.el) com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35881x450f6f3b(new java.lang.String(bArr), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eh.class, new java.lang.Object[0]);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.se
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30 a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.el elVar) {
        if (!(elVar instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eh) || !elVar.c()) {
            return null;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eh ehVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eh) elVar;
        com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.od.C4298x4900643b c4298x4900643b = new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.od.C4298x4900643b();
        if (ehVar.f130796a.f130827c.f130829b != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.tencent.mapsdk.internal.el.a.C30897a.AbstractC30898a abstractC30898a : ehVar.f130796a.f130827c.f130829b) {
                if (abstractC30898a instanceof com.tencent.mapsdk.internal.el.a.C30897a.b) {
                    com.tencent.mapsdk.internal.el.a.C30897a.b bVar = (com.tencent.mapsdk.internal.el.a.C30897a.b) abstractC30898a;
                    arrayList.add(new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4288x259a94b(bVar.f130832c.get(0), bVar.f130832c.get(1)));
                }
            }
            c4298x4900643b.m35740x2eefaa(arrayList);
        }
        com.tencent.mapsdk.internal.el.c.e eVar = ehVar.f130796a.f130797a.f130798a.f130806a.f130813a.f130809c;
        if (eVar != null) {
            int size = eVar.f130859b.size();
            int[] iArr = new int[size];
            for (int i17 = 0; i17 < size; i17++) {
                iArr[i17] = ehVar.f130796a.f130797a.f130798a.f130806a.f130813a.f130809c.f130859b.get(i17).intValue();
            }
            c4298x4900643b.m35751x557f730(iArr);
        }
        c4298x4900643b.m35757x6be2dc6(ehVar.f130796a.f130797a.f130798a.f130806a.f130813a.f130807a);
        c4298x4900643b.m35754xc80e6a21((float) (ehVar.f130796a.f130797a.f130798a.f130806a.f130813a.f130808b * 90.0d));
        com.tencent.mapsdk.internal.eh.a.C30891a.C30892a c30892a = ehVar.f130796a.f130797a.f130799b;
        c4298x4900643b.m35758x61c4912a(c30892a.f130853k, c30892a.f130852j);
        c4298x4900643b.mo35601xd4677478(ehVar.f130796a.f130797a.f130799b.f130849g);
        c4298x4900643b.mo35583x5f34bbe2(ehVar.f130796a.f130797a.f130799b.f130848f);
        c4298x4900643b.m35741x61e1d734(ehVar.f130796a.f130797a.f130799b.f130800a);
        c4298x4900643b.mo35596xb477f80b((float) ehVar.f130796a.f130797a.f130799b.f130851i);
        c4298x4900643b.mo35600x73b66312(!ehVar.f130796a.f130797a.f130799b.f130850h);
        com.tencent.mapsdk.internal.eh.a.C30891a.C30892a c30892a2 = ehVar.f130796a.f130797a.f130799b;
        if (c30892a2.f130801b) {
            c4298x4900643b.m35755x7716ded3((int) (c30892a2.f130802c.f130805c * 1000.0d));
            c4298x4900643b.m35756xb20de26((int) (ehVar.f130796a.f130797a.f130799b.f130802c.f130803a * 1000.0d));
            c4298x4900643b.m35739x3cb9b102(ehVar.f130796a.f130797a.f130799b.f130802c.f130804b);
        } else {
            c4298x4900643b.m35755x7716ded3(0);
        }
        return c4298x4900643b;
    }
}
