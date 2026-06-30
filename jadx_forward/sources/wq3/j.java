package wq3;

/* loaded from: classes15.dex */
public class j {

    /* renamed from: b, reason: collision with root package name */
    public wq3.t f530082b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.List f530083c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f530084d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f530085e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f530087g;

    /* renamed from: h, reason: collision with root package name */
    public r45.gm0 f530088h;

    /* renamed from: i, reason: collision with root package name */
    public r45.d5 f530089i;

    /* renamed from: j, reason: collision with root package name */
    public r45.ek5 f530090j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f530091k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f530092l;

    /* renamed from: m, reason: collision with root package name */
    public int f530093m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.Map f530094n;

    /* renamed from: p, reason: collision with root package name */
    public java.util.LinkedList f530096p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.LinkedList f530097q;

    /* renamed from: r, reason: collision with root package name */
    public wq3.l f530098r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.s f530099s;

    /* renamed from: a, reason: collision with root package name */
    public wq3.k f530081a = null;

    /* renamed from: f, reason: collision with root package name */
    public int f530086f = 1;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f530095o = new java.util.HashMap();

    /* renamed from: t, reason: collision with root package name */
    public java.util.Map f530100t = null;

    public static java.lang.String m(java.util.Map map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(map.entrySet());
        java.util.Collections.sort(arrayList, new wq3.i());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            sb6.append((java.lang.String) entry.getKey());
            sb6.append(":");
            sb6.append((java.lang.String) entry.getValue());
            sb6.append(";");
        }
        sb6.deleteCharAt(sb6.lastIndexOf(";"));
        return sb6.toString();
    }

    public boolean a() {
        java.util.Map map;
        int i17;
        xq3.c cVar;
        int i18 = this.f530086f;
        if (((i18 <= 0 || this.f530082b == null || i18 > g() || (cVar = this.f530082b.f530132e) == null || cVar.f537605t == null) ? false : true) && (map = this.f530095o) != null) {
            int size = ((java.util.HashMap) map).size();
            int i19 = this.f530093m;
            if (size == i19) {
                if (i19 > 0) {
                    if (this.f530098r != null && (i17 = this.f530086f) > 0 && i17 <= g()) {
                        return true;
                    }
                } else if (i19 == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean b() {
        if (a() && this.f530089i != null) {
            return ((d().f234878b & 1) > 0) || this.f530088h != null;
        }
        return false;
    }

    public void c() {
        this.f530082b = null;
        java.util.List list = this.f530083c;
        if (list != null) {
            list.clear();
            this.f530083c = null;
        }
        this.f530084d = null;
        this.f530085e = null;
        this.f530086f = 1;
        this.f530087g = null;
        this.f530088h = null;
        this.f530090j = null;
        this.f530091k = null;
        this.f530093m = 0;
        this.f530098r = null;
        java.util.Map map = this.f530094n;
        if (map != null) {
            map.clear();
            this.f530094n = null;
        }
        java.util.Map map2 = this.f530095o;
        if (map2 != null) {
            ((java.util.HashMap) map2).clear();
        }
        java.util.LinkedList linkedList = this.f530096p;
        if (linkedList != null) {
            linkedList.clear();
            this.f530096p = null;
        }
        java.util.Map map3 = this.f530100t;
        if (map3 != null) {
            map3.clear();
            this.f530100t = null;
        }
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.s d() {
        if (this.f530099s == null) {
            this.f530099s = new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.s(0, 0);
        }
        return this.f530099s;
    }

    public java.lang.String e() {
        wq3.l lVar = this.f530098r;
        return (lVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lVar.f537632f)) ? this.f530091k : this.f530098r.f537632f;
    }

    public int f() {
        java.util.Map map = this.f530100t;
        int i17 = 0;
        if (map != null && map.size() > 0) {
            for (java.util.LinkedList linkedList : this.f530100t.values()) {
                if (linkedList != null && linkedList.size() > 0) {
                    java.util.Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        i17 += ((r45.we0) it.next()).f470616e;
                    }
                }
            }
        }
        return i17;
    }

    public int g() {
        int i17;
        int i18 = this.f530082b.f530130c;
        wq3.l lVar = this.f530098r;
        return (lVar == null || i18 <= (i17 = lVar.f537634h)) ? i18 : i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r45.ek5 h() {
        /*
            r4 = this;
            r45.ek5 r0 = r4.f530090j
            if (r0 == 0) goto L5
            return r0
        L5:
            wq3.k r0 = r4.f530081a
            if (r0 != 0) goto L13
            vq3.e r0 = vq3.e.wi()
            wq3.k r0 = r0.Bi()
            r4.f530081a = r0
        L13:
            wq3.k r0 = r4.f530081a
            java.util.List r0 = r0.f530101a
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L2b
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r3 = r0.size()
            if (r3 < r2) goto L2b
            r3 = 0
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            goto L2c
        L2b:
            r0 = r1
        L2c:
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            if (r3 != 0) goto L3e
            r45.ek5 r1 = new r45.ek5
            r1.<init>()
            r4.f530090j = r1
            r1.f455116e = r0
            r1.f455115d = r2
            return r1
        L3e:
            r45.d5 r0 = r4.f530089i
            if (r0 == 0) goto L57
            java.lang.String r3 = r0.f453655h
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r3)
            if (r3 != 0) goto L57
            r45.ek5 r1 = new r45.ek5
            r1.<init>()
            r4.f530090j = r1
            java.lang.String r0 = r0.f453655h
            r1.f455116e = r0
            r1.f455115d = r2
        L57:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wq3.j.h():r45.ek5");
    }

    public java.util.LinkedList i() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.ku5 ku5Var = new r45.ku5();
        ku5Var.f460501f = this.f530086f;
        wq3.t tVar = this.f530082b;
        ku5Var.f460499d = tVar.f530128a;
        ku5Var.f460502g = tVar.f530136i;
        ku5Var.f460500e = this.f530087g;
        linkedList.add(ku5Var);
        return linkedList;
    }

    public java.lang.String j() {
        xq3.n nVar = this.f530082b.f530133f;
        if (nVar != null) {
            return nVar.f537641g;
        }
        return null;
    }

    public java.lang.String k() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f530082b.a())) {
            return null;
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.o.m(this.f530082b.a());
    }

    public java.lang.String l() {
        xq3.k kVar;
        wq3.t tVar = this.f530082b;
        xq3.c cVar = tVar.f530132e;
        return (cVar == null || (kVar = cVar.f537609x) == null) ? !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tVar.f530136i) ? this.f530082b.f530136i : this.f530085e : kVar.f537629e;
    }

    public r45.a76 n() {
        r45.a76 a76Var = new r45.a76();
        a76Var.f451341m = this.f530084d;
        a76Var.f451335d = 1;
        a76Var.f451336e = new java.util.LinkedList();
        r45.nd5 nd5Var = new r45.nd5();
        nd5Var.f462814f = this.f530086f;
        wq3.t tVar = this.f530082b;
        nd5Var.f462817i = tVar.f530128a;
        xq3.c cVar = tVar.f530132e;
        nd5Var.f462821p = cVar.f537592d;
        wq3.l lVar = this.f530098r;
        if (lVar != null) {
            nd5Var.f462815g = lVar.f530102i;
        } else {
            nd5Var.f462815g = cVar.f537595g;
        }
        nd5Var.f462818m = tVar.f530136i;
        nd5Var.f462819n = this.f530087g;
        nd5Var.f462820o = tVar.f530129b;
        nd5Var.f462812d = this.f530093m;
        nd5Var.f462813e = new java.util.LinkedList();
        java.util.Map map = this.f530095o;
        for (java.lang.String str : ((java.util.HashMap) map).keySet()) {
            java.lang.String str2 = (java.lang.String) ((java.util.HashMap) map).get(str);
            r45.c44 c44Var = new r45.c44();
            c44Var.f452801d = str;
            c44Var.f452802e = str2;
            nd5Var.f462813e.add(c44Var);
        }
        nd5Var.f462827v = new java.util.LinkedList();
        nd5Var.f462826u = 0;
        java.util.Map map2 = this.f530100t;
        if (map2 != null && ((java.util.HashMap) map2).size() > 0) {
            for (java.util.LinkedList linkedList : ((java.util.HashMap) this.f530100t).values()) {
                nd5Var.f462827v.addAll(linkedList);
                nd5Var.f462826u += linkedList.size();
            }
        }
        a76Var.f451336e.add(nd5Var);
        a76Var.f451339h = new java.util.LinkedList();
        a76Var.f451340i = 1;
        r45.ek5 h17 = h();
        this.f530090j = h17;
        if (h17 != null) {
            a76Var.f451339h.add(h17);
        } else {
            r45.ek5 ek5Var = new r45.ek5();
            this.f530090j = ek5Var;
            ek5Var.f455115d = 0;
            a76Var.f451339h.add(ek5Var);
        }
        a76Var.f451338g = this.f530089i;
        a76Var.f451337f = this.f530088h;
        return a76Var;
    }

    public int o() {
        int i17;
        int i18;
        r45.gm0 gm0Var;
        int i19 = 0;
        if (!((d().f234878b & 1) > 0) && (gm0Var = this.f530088h) != null) {
            i19 = 0 + gm0Var.f456895e;
        }
        wq3.l lVar = this.f530098r;
        if (lVar != null) {
            i17 = lVar.f530102i;
            i18 = this.f530086f;
        } else {
            i17 = this.f530082b.f530132e.f537595g;
            i18 = this.f530086f;
        }
        return (i19 + (i17 * i18)) - f();
    }

    public java.lang.String p() {
        ot0.q qVar = new ot0.q();
        qVar.f430187f = this.f530082b.f530132e.f537592d;
        qVar.f430191g = q();
        qVar.f430199i = 13;
        qVar.f430207k = l();
        qVar.f430267z = this.f530082b.a();
        wq3.t tVar = this.f530082b;
        qVar.f430200i0 = tVar.f530129b;
        qVar.f430204j0 = r(tVar);
        return ot0.q.u(qVar, null, null);
    }

    public java.lang.String q() {
        return wq3.h.b(r0.f537596h, this.f530082b.f530132e.f537608w);
    }

    public java.lang.String r(wq3.t tVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<mallProductInfo><type>");
        sb6.append(tVar.f530129b);
        sb6.append("</type><id>");
        sb6.append(tVar.f530128a);
        sb6.append("</id><version>");
        sb6.append(tVar.f530132e.f537606u);
        sb6.append("</version><name>");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(tVar.f530132e.f537592d));
        sb6.append("</name><highPrice>");
        sb6.append(tVar.f530132e.f537595g);
        sb6.append("</highPrice><lowPrice>");
        sb6.append(tVar.f530132e.f537596h);
        sb6.append("</lowPrice><originPrice>");
        sb6.append(tVar.f530132e.f537594f);
        sb6.append("</originPrice><sourceUrl>");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f530082b.f530136i));
        sb6.append("</sourceUrl>");
        if (tVar.f530132e.f537597i != null) {
            sb6.append("<imgCount>");
            sb6.append(tVar.f530132e.f537597i.size());
            sb6.append("</imgCount><imgList>");
            java.util.Iterator it = tVar.f530132e.f537597i.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                sb6.append("<imgUrl>");
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(str));
                sb6.append("</imgUrl>");
            }
            sb6.append("</imgList>");
        }
        sb6.append("<shareInfo><shareUrl>");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(l()));
        sb6.append("</shareUrl><shareThumbUrl>");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(tVar.a()));
        sb6.append("</shareThumbUrl></shareInfo>");
        if (this.f530082b.f530133f != null) {
            sb6.append("<sellerInfo><appID>");
            sb6.append(tVar.f530133f.f537638d);
            sb6.append("</appID><appName>");
            sb6.append(tVar.f530133f.f537639e);
            sb6.append("</appName><usrName>");
            sb6.append(tVar.f530133f.f537641g);
            sb6.append("</usrName></sellerInfo>");
        }
        sb6.append("</mallProductInfo>");
        return sb6.toString();
    }

    public void s(android.content.Intent intent) {
        r45.d5 d5Var = new r45.d5();
        java.lang.String stringExtra = intent.getStringExtra("userName");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        d5Var.f453655h = stringExtra;
        java.lang.String stringExtra2 = intent.getStringExtra("telNumber");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        d5Var.f453656i = stringExtra2;
        java.lang.String stringExtra3 = intent.getStringExtra("addressPostalCode");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        d5Var.f453657m = stringExtra3;
        java.lang.String stringExtra4 = intent.getStringExtra("proviceFirstStageName");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        d5Var.f453652e = stringExtra4;
        java.lang.String stringExtra5 = intent.getStringExtra("addressCitySecondStageName");
        if (stringExtra5 == null) {
            stringExtra5 = "";
        }
        d5Var.f453653f = stringExtra5;
        java.lang.String stringExtra6 = intent.getStringExtra("addressCountiesThirdStageName");
        if (stringExtra6 == null) {
            stringExtra6 = "";
        }
        d5Var.f453651d = stringExtra6;
        java.lang.String stringExtra7 = intent.getStringExtra("addressDetailInfo");
        d5Var.f453654g = stringExtra7 != null ? stringExtra7 : "";
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d5Var.f453655h) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d5Var.f453656i)) {
            return;
        }
        this.f530089i = d5Var;
    }

    public void t(int i17) {
        java.util.LinkedList linkedList = this.f530096p;
        if (linkedList != null && i17 < linkedList.size() && i17 >= 0) {
            this.f530088h = (r45.gm0) this.f530096p.get(i17);
        }
    }

    public void u(wq3.t tVar, java.util.List list) {
        xq3.j jVar;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        c();
        this.f530082b = tVar;
        this.f530083c = list;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tVar.f530136i)) {
            this.f530082b.f530136i = this.f530085e;
        }
        java.util.LinkedList linkedList3 = this.f530082b.f530134g;
        this.f530094n = new java.util.HashMap();
        if (linkedList3 != null && linkedList3.size() > 0) {
            int size = linkedList3.size();
            for (int i17 = 0; i17 < size; i17++) {
                xq3.l lVar = (xq3.l) linkedList3.get(i17);
                java.lang.String[] split = lVar.f537630d.split(";");
                if (split != null && split.length > 0) {
                    int length = split.length;
                    int i18 = (-1) >>> (32 - length);
                    for (int i19 = 1; i19 <= i18; i19++) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        for (int i27 = 0; i27 < length; i27++) {
                            if (((i19 << (31 - i27)) >> 31) == -1) {
                                sb6.append(split[i27]);
                                sb6.append(";");
                            }
                        }
                        sb6.deleteCharAt(sb6.lastIndexOf(";"));
                        wq3.l lVar2 = (wq3.l) ((java.util.HashMap) this.f530094n).get(sb6.toString());
                        if (lVar2 != null) {
                            int i28 = lVar2.f530102i;
                            int i29 = lVar.f537631e;
                            if (i28 < i29) {
                                lVar2.f530102i = i29;
                            }
                            if (lVar2.f530103m > i29) {
                                lVar2.f530103m = i29;
                            }
                            lVar2.f537634h += lVar.f537634h;
                        } else {
                            wq3.l lVar3 = new wq3.l();
                            int i37 = lVar.f537631e;
                            lVar3.f530102i = i37;
                            lVar3.f530103m = i37;
                            lVar3.f537634h = lVar.f537634h;
                            lVar3.f537633g = lVar.f537633g;
                            lVar3.f537632f = lVar.f537632f;
                            ((java.util.HashMap) this.f530094n).put(sb6.toString(), lVar3);
                        }
                    }
                }
            }
            v();
        }
        xq3.c cVar = this.f530082b.f530132e;
        if (cVar != null && (linkedList2 = cVar.f537605t) != null) {
            this.f530093m = linkedList2.size();
        }
        xq3.c cVar2 = this.f530082b.f530132e;
        if (cVar2 != null && (linkedList = cVar2.f537597i) != null && linkedList.size() > 0) {
            this.f530091k = (java.lang.String) this.f530082b.f530132e.f537597i.get(0);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f530082b.a())) {
            y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.o oVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.o(this.f530082b.a());
            ((x60.e) fVar).getClass();
            x51.w0.d(oVar);
            k();
        }
        wq3.t tVar2 = this.f530082b;
        xq3.f fVar2 = tVar2.f530135h;
        int i38 = (fVar2 == null || (jVar = fVar2.f537614d) == null) ? 0 : jVar.f537625d;
        xq3.n nVar = tVar2.f530133f;
        this.f530099s = new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.s(i38, nVar != null ? nVar.f537642h : 0);
    }

    public void v() {
        java.util.Map map = this.f530095o;
        if (map == null) {
            return;
        }
        java.util.Iterator it = this.f530082b.f530132e.f537605t.iterator();
        while (it.hasNext()) {
            xq3.m mVar = (xq3.m) it.next();
            java.util.Iterator it6 = mVar.f537637f.iterator();
            while (it6.hasNext()) {
                xq3.h hVar = (xq3.h) it6.next();
                java.lang.String str = mVar.f537635d;
                java.lang.String str2 = hVar.f537620d;
                boolean z17 = false;
                if (map != null && this.f530094n != null) {
                    java.util.HashMap hashMap = (java.util.HashMap) map;
                    if (hashMap.containsKey(str)) {
                        java.lang.String str3 = (java.lang.String) hashMap.get(str);
                        hashMap.put(str, str2);
                        java.lang.String m17 = m(map);
                        hashMap.put(str, str3);
                        wq3.l lVar = (wq3.l) this.f530094n.get(m17);
                        if (lVar != null) {
                            if (lVar.f537634h <= 0) {
                            }
                            z17 = true;
                        }
                    } else {
                        hashMap.put(str, str2);
                        java.lang.String m18 = m(map);
                        hashMap.remove(str);
                        wq3.l lVar2 = (wq3.l) this.f530094n.get(m18);
                        if (lVar2 != null) {
                            if (lVar2.f537634h <= 0) {
                            }
                            z17 = true;
                        }
                    }
                }
                hVar.f537622f = z17;
            }
        }
    }
}
