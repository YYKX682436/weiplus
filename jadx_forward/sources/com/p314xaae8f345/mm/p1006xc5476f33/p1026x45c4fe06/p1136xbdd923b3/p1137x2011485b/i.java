package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b;

/* loaded from: classes7.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f165822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.f1 f165823e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.m f165824f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.C12319xdc45d1ef f165825g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p3325xe03a0797.p3326xc267989b.f1 f1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.m mVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.C12319xdc45d1ef c12319xdc45d1ef, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f165823e = f1Var;
        this.f165824f = mVar;
        this.f165825g = c12319xdc45d1ef;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.i(this.f165823e, this.f165824f, this.f165825g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.util.List c17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 c11667xc7e59dd6;
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f165822d;
        p3325xe03a0797.p3326xc267989b.f1 f1Var = this.f165823e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ((p3325xe03a0797.p3326xc267989b.c3) f1Var).mo143976x68ac462();
            this.f165822d = 1;
            if (f1Var.k(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return obj;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.c cVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.c) this.f165824f.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.i0 version = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.i0) f1Var.f();
        java.lang.String str3 = this.f165825g.f165779h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 c12566x87f2d8b7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7) cVar.f418448a.b(cVar, ng1.c.f418447c[0]);
        r45.y50 getUrlCgiCommRequestSource = (r45.y50) ((jz5.n) cVar.f165797g).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(version, "version");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getUrlCgiCommRequestSource, "getUrlCgiCommRequestSource");
        this.f165822d = 2;
        boolean z17 = str3 == null || str3.length() == 0;
        java.lang.String str4 = version.f334819a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 c11829x68027553 = version.f334821c;
        if (z17) {
            c17 = kz5.b0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33446xd388c2f8);
            str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33446xd388c2f8;
            str2 = "moduleList";
        } else {
            java.util.List moduleList = c11829x68027553.f158985o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(moduleList, "moduleList");
            str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33446xd388c2f8;
            str2 = "moduleList";
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11830xcf46aa1f c11830xcf46aa1f = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11830xcf46aa1f) ph1.i0.b(moduleList, str3, "WAMagicBrushFrameLaunchPkgFetcher for appId:" + str4, false, 4, null);
            java.lang.String str5 = c11830xcf46aa1f != null ? c11830xcf46aa1f.f158997d : null;
            if (str5 == null) {
                str5 = str;
            }
            c17 = kz5.b0.c(str5);
        }
        java.util.Map b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.g8.f166161a.b(c11829x68027553, str4, true);
        ng1.t tVar = new ng1.t(version, version.f334820b, c11829x68027553);
        java.util.Iterator it = ((android.util.ArrayMap) b17).entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c11667xc7e59dd6 = tVar.f418482a;
            if (!hasNext) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.String moduleName = (java.lang.String) entry.getKey();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11831x52cc1bc5 c11831x52cc1bc5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11831x52cc1bc5) entry.getValue();
            boolean b18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, moduleName);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 c11829x680275532 = tVar.f418483b;
            if (b18) {
                c11667xc7e59dd6.f156905md5 = c11831x52cc1bc5.f159008e;
                c11667xc7e59dd6.f33453xc73e777a = true;
                c11667xc7e59dd6.f33456x1c82a56c = c11829x680275532.f158977d;
            } else {
                java.util.LinkedList linkedList = c11667xc7e59dd6.f156935g;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e c11656xaf63146e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e();
                java.util.List list = c11829x680275532.f158985o;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, str2);
                java.util.Iterator it6 = list.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it6.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(moduleName, ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11830xcf46aa1f) obj2).f158997d)) {
                        break;
                    }
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11830xcf46aa1f c11830xcf46aa1f2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11830xcf46aa1f) obj2;
                c11656xaf63146e.f33454x337a8b = moduleName;
                c11656xaf63146e.f156905md5 = c11831x52cc1bc5.f159008e;
                c11656xaf63146e.f33453xc73e777a = c11830xcf46aa1f2.f158999f;
                c11656xaf63146e.f33452xc97d4efe = c11830xcf46aa1f2.f159001h;
                c11656xaf63146e.f33456x1c82a56c = c11829x680275532.f158977d;
                linkedList.add(c11656xaf63146e);
            }
            java.util.List list2 = c11831x52cc1bc5.f159010g;
            if (!(list2 == null || list2.isEmpty())) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11670x2ef26cc7 c11670x2ef26cc7 = c11667xc7e59dd6.f156937i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11670x2ef26cc7);
                java.util.List b19 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.r4.b(c11831x52cc1bc5.f159010g);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moduleName, "moduleName");
                if (b19 != null && !b19.isEmpty()) {
                    c11670x2ef26cc7.f156939d.put(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.kb(moduleName), b19);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11670x2ef26cc7 c11670x2ef26cc72 = c11667xc7e59dd6.f156937i;
        if (c11670x2ef26cc72 != null) {
            c11670x2ef26cc72.e();
        }
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
        rVar.k();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.u3.f166745a.a(version.f334819a, version.f334821c, version.f334820b, c17, b17, c12566x87f2d8b7, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.a0(tVar, rVar), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.b0.f165793d, (r34 & 256) != 0 ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p3.f166420d : new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.c0(rVar), false, getUrlCgiCommRequestSource, (r34 & 2048) != 0 ? null : null, (r34 & 4096) != 0 ? null : null, (r34 & 8192) != 0 ? null : null, (r34 & 16384) != 0 ? null : null);
        java.lang.Object j17 = rVar.j();
        pz5.a aVar2 = pz5.a.f440719d;
        return j17 == aVar ? aVar : j17;
    }
}
