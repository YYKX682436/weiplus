package gd1;

/* loaded from: classes7.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f352050d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gd1.b0 f352051e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, gd1.b0 b0Var) {
        super(3);
        this.f352050d = lVar;
        this.f352051e = b0Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        byte[] bArr = (byte[]) obj;
        java.util.List techs = (java.util.List) obj2;
        java.util.List list = (java.util.List) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(techs, "techs");
        gd1.b0 b0Var = this.f352051e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f352050d;
        if (list != null) {
            list.toString();
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (true) {
                int i17 = 0;
                if (!it.hasNext()) {
                    break;
                }
                android.nfc.NdefMessage ndefMessage = (android.nfc.NdefMessage) it.next();
                java.util.Objects.toString(ndefMessage);
                android.nfc.NdefRecord[] records = ndefMessage.getRecords();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(records, "getRecords(...)");
                java.util.ArrayList arrayList2 = new java.util.ArrayList(records.length);
                int length = records.length;
                while (i17 < length) {
                    android.nfc.NdefRecord ndefRecord = records[i17];
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ndefRecord);
                    java.util.Objects.toString(ndefRecord);
                    jz5.l lVar2 = new jz5.l("tnf", java.lang.Short.valueOf(ndefRecord.getTnf()));
                    byte[] encode = android.util.Base64.encode(ndefRecord.getType(), 2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encode, "encode(...)");
                    java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UTF_8, "UTF_8");
                    java.util.Iterator it6 = it;
                    jz5.l lVar3 = new jz5.l("type", new java.lang.String(encode, UTF_8));
                    byte[] encode2 = android.util.Base64.encode(ndefRecord.getId(), 2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encode2, "encode(...)");
                    java.nio.charset.Charset UTF_82 = java.nio.charset.StandardCharsets.UTF_8;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UTF_82, "UTF_8");
                    java.util.Map k17 = kz5.c1.k(lVar2, lVar3, new jz5.l(dm.i4.f66865x76d1ec5a, new java.lang.String(encode2, UTF_82)));
                    k17.toString();
                    arrayList2.add(new jz5.l(k17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.e(ndefRecord.getPayload())));
                    i17++;
                    it = it6;
                }
                java.util.Iterator it7 = it;
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
                java.util.Iterator it8 = arrayList2.iterator();
                while (it8.hasNext()) {
                    arrayList3.add((java.util.Map) ((jz5.l) it8.next()).f384366d);
                }
                java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
                java.util.Iterator it9 = arrayList2.iterator();
                while (it9.hasNext()) {
                    arrayList4.add((java.nio.ByteBuffer) ((jz5.l) it9.next()).f384367e);
                }
                jz5.l lVar4 = new jz5.l(arrayList3, arrayList4);
                lVar4.m141639x9616526c();
                arrayList.add(lVar4);
                it = it7;
            }
            jz5.l[] lVarArr = new jz5.l[1];
            java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it10 = arrayList.iterator();
            while (it10.hasNext()) {
                arrayList5.add((java.util.List) ((jz5.l) it10.next()).f384366d);
            }
            lVarArr[0] = new jz5.l("messages", arrayList5);
            java.util.Map l17 = kz5.c1.l(lVarArr);
            java.util.Iterator it11 = arrayList.iterator();
            int i18 = 0;
            while (it11.hasNext()) {
                java.lang.Object next = it11.next();
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                int i27 = 0;
                for (java.lang.Object obj4 : (java.lang.Iterable) ((jz5.l) next).f384367e) {
                    int i28 = i27 + 1;
                    if (i27 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    l17.put("payload-" + i18 + '-' + i27, (java.nio.ByteBuffer) obj4);
                    i27 = i28;
                }
                i18 = i19;
            }
            l17.toString();
            java.util.HashMap hashMap = new java.util.HashMap(l17);
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3.FAIL_SIZE_EXCEED_LIMIT == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.d(lVar.mo50357xcd94f799(), hashMap, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3) lVar.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3.class))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiStartNFCDiscovery", "invoke, convert NativeBuffer fail");
            } else {
                gd1.f fVar = (gd1.f) ((jz5.n) b0Var.f352016g).mo141623x754a37bb();
                fVar.v(lVar);
                fVar.u(bArr, techs, hashMap);
            }
        } else {
            gd1.f fVar2 = (gd1.f) ((jz5.n) b0Var.f352016g).mo141623x754a37bb();
            fVar2.v(lVar);
            fVar2.u(bArr, techs, null);
        }
        return jz5.f0.f384359a;
    }
}
