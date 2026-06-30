package if2;

/* loaded from: classes3.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qs5.o f372670d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e f372671e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(qs5.o oVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e) {
        super(0);
        this.f372670d = oVar;
        this.f372671e = c14197x319b1b9e;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        java.lang.String str2;
        qs5.o oVar = qs5.o.f447984d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = this.f372671e;
        qs5.o mode = this.f372670d;
        if (mode == oVar) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e.f35780x233c02ec.getClass();
            str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e.TAG;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55722x36e113fb + c14197x319b1b9e.hashCode() + " mode invalid, skip initController");
        } else if (c14197x319b1b9e.m56802x4383f7da()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e.f35780x233c02ec.getClass();
            str = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e.TAG;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55722x36e113fb + c14197x319b1b9e.hashCode() + " hasInitialized, skip initController");
        } else {
            if2.z zVar = if2.z.f372686a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(if2.z.f372687b);
            java.util.Map map = if2.z.f372688c;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) map).entrySet()) {
                if (((java.util.List) entry.getValue()).contains(mode)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            arrayList.addAll(linkedHashMap.keySet());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mode, "mode");
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            qs5.o oVar2 = qs5.o.f447985e;
            linkedHashMap2.put(yf2.c.class, kz5.b0.c(oVar2));
            java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
            linkedHashMap3.put(yf2.z.class, kz5.b0.c(oVar2));
            linkedHashMap3.put(df2.yp.class, kz5.b0.c(oVar2));
            linkedHashMap2.putAll(linkedHashMap3);
            java.util.LinkedHashMap linkedHashMap4 = new java.util.LinkedHashMap();
            linkedHashMap4.put(yf2.i2.class, kz5.b0.c(oVar2));
            linkedHashMap4.put(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.u70.class, kz5.b0.c(oVar2));
            linkedHashMap2.putAll(linkedHashMap4);
            linkedHashMap2.put(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5.class, kz5.b0.c(oVar2));
            linkedHashMap2.put(yf2.m1.class, kz5.b0.c(oVar2));
            linkedHashMap2.put(yf2.o.class, kz5.b0.c(oVar2));
            linkedHashMap2.put(yf2.s0.class, kz5.b0.c(oVar2));
            linkedHashMap2.put(yf2.t1.class, kz5.b0.c(oVar2));
            linkedHashMap2.put(yf2.z0.class, kz5.c0.i(oVar2, qs5.o.f447987g, qs5.o.f447986f));
            linkedHashMap2.put(yf2.g0.class, kz5.b0.c(oVar2));
            linkedHashMap2.put(df2.jx.class, kz5.b0.c(oVar2));
            linkedHashMap2.put(df2.fi.class, kz5.b0.c(oVar2));
            linkedHashMap2.put(df2.wi.class, kz5.b0.c(oVar2));
            linkedHashMap2.put(yf2.q.class, kz5.b0.c(oVar2));
            java.util.LinkedHashMap linkedHashMap5 = new java.util.LinkedHashMap();
            for (java.util.Map.Entry entry2 : linkedHashMap2.entrySet()) {
                if (((java.util.List) entry2.getValue()).contains(mode)) {
                    linkedHashMap5.put(entry2.getKey(), entry2.getValue());
                }
            }
            arrayList.addAll(kz5.n0.S0(linkedHashMap5.keySet()));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.Class cls = (java.lang.Class) it.next();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e.f35780x233c02ec.getClass();
                c14197x319b1b9e.m56799x73a45721().add((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703) new p012xc85e97e9.p093xedfae76a.j1(c14197x319b1b9e.getViewModel(), new if2.a0(c14197x319b1b9e)).b(c14197x319b1b9e.m56800xb5884f29(cls), cls));
            }
            java.util.Iterator<T> it6 = c14197x319b1b9e.m56799x73a45721().iterator();
            while (it6.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703) it6.next()).mo8997x8001c97e();
            }
        }
        return jz5.f0.f384359a;
    }
}
