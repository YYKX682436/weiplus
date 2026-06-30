package com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86;

/* renamed from: com.tencent.wechat.aff.emoticon.ZIDL__QyxtUAHB */
/* loaded from: classes15.dex */
class C27286x971ece1 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.f f298166a;

    /* renamed from: ZIDL_A */
    public void m112577x9db8edf9(byte[] bArr, int i17, int i18) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.f fVar = this.f298166a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q2) fVar).getClass();
        if (((com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.s) com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.v.f298208c.a().f298210a.get(java.lang.Integer.valueOf(r26.q0.a(str)))) != null) {
            r26.q0.a(str);
        }
    }

    /* renamed from: ZIDL_B */
    public void m112578x9db8edfa(byte[] bArr) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.f fVar = this.f298166a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q2) fVar).getClass();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.s sVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.s) com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.v.f298208c.a().f298210a.get(java.lang.Integer.valueOf(r26.q0.a(str)));
        if (sVar != null) {
            r26.q0.a(str);
            synchronized (sVar) {
                java.util.Iterator it = ((java.util.ArrayList) sVar.f298205j).iterator();
                while (it.hasNext()) {
                    ((yz5.l) it.next()).mo146xb9724478(com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.o.f298190d);
                }
                ((java.util.ArrayList) sVar.f298205j).clear();
            }
        }
    }

    /* renamed from: ZIDL_C */
    public void m112579x9db8edfb(byte[] bArr) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.f fVar = this.f298166a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q2) fVar).getClass();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.s sVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.s) com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.v.f298208c.a().f298210a.get(java.lang.Integer.valueOf(r26.q0.a(str)));
        if (sVar != null) {
            r26.q0.a(str);
            synchronized (sVar) {
                java.util.Iterator it = ((java.util.ArrayList) sVar.f298205j).iterator();
                while (it.hasNext()) {
                    ((yz5.l) it.next()).mo146xb9724478(com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.o.f298191e);
                }
                ((java.util.ArrayList) sVar.f298205j).clear();
            }
        }
    }

    /* renamed from: ZIDL_D */
    public void m112580x9db8edfc(byte[] bArr, int i17, boolean z17) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.f fVar = this.f298166a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        bw5.ia iaVar = i17 != 1 ? i17 != 2 ? i17 != 3 ? null : bw5.ia.EmoticonDesignerListDataType_IPSet : bw5.ia.EmoticonDesignerListDataType_SingleEmoji : bw5.ia.EmoticonDesignerListDataType_StorePack;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q2) fVar).getClass();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.s sVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.s) com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.v.f298208c.a().f298210a.get(java.lang.Integer.valueOf(r26.q0.a(str)));
        if (sVar != null) {
            sVar.f298204i.put(iaVar, java.lang.Boolean.valueOf(z17));
            int i18 = iaVar == null ? -1 : com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.p.f298193a[iaVar.ordinal()];
            if (i18 != -1) {
                if (i18 == 1) {
                    java.util.ArrayList arrayList = sVar.f298198c;
                    int size = arrayList.size();
                    java.util.ArrayList arrayList2 = sVar.f298201f;
                    arrayList2.clear();
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.w wVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.w.f298212b;
                    java.util.ArrayList c17 = wVar.c(sVar.f298196a);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getStorePackList(...)");
                    arrayList2.addAll(kz5.n0.R(c17, size));
                    arrayList.clear();
                    arrayList.addAll(wVar.c(sVar.f298196a));
                } else if (i18 == 2) {
                    java.util.ArrayList arrayList3 = sVar.f298199d;
                    int size2 = arrayList3.size();
                    java.util.ArrayList arrayList4 = sVar.f298202g;
                    arrayList4.clear();
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.w wVar2 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.w.f298212b;
                    java.util.ArrayList a17 = wVar2.a(sVar.f298196a);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getEmojiInfoList(...)");
                    arrayList4.addAll(kz5.n0.R(a17, size2));
                    arrayList3.clear();
                    arrayList3.addAll(wVar2.a(sVar.f298196a));
                } else {
                    if (i18 != 3) {
                        throw new jz5.j();
                    }
                    java.util.ArrayList arrayList5 = sVar.f298200e;
                    int size3 = arrayList5.size();
                    java.util.ArrayList arrayList6 = sVar.f298203h;
                    arrayList6.clear();
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.w wVar3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.w.f298212b;
                    java.util.ArrayList b17 = wVar3.b(sVar.f298196a);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getIpSetList(...)");
                    arrayList6.addAll(kz5.n0.R(b17, size3));
                    arrayList5.clear();
                    arrayList5.addAll(wVar3.b(sVar.f298196a));
                }
            }
            yz5.l lVar = sVar.f298206k;
            if (lVar != null) {
                lVar.mo146xb9724478(com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.o.f298190d);
            }
            sVar.f298206k = null;
        }
    }

    /* renamed from: ZIDL_E */
    public void m112581x9db8edfd(byte[] bArr, int i17) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.f fVar = this.f298166a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q2) fVar).getClass();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.s sVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.s) com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.v.f298208c.a().f298210a.get(java.lang.Integer.valueOf(r26.q0.a(str)));
        if (sVar != null) {
            yz5.l lVar = sVar.f298206k;
            if (lVar != null) {
                lVar.mo146xb9724478(com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.o.f298191e);
            }
            sVar.f298206k = null;
        }
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131
    /* renamed from: attachStub */
    public void mo73242x8aebc093(java.lang.Object obj) {
        this.f298166a = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.f) obj;
    }
}
