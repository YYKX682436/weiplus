package wc5;

/* loaded from: classes4.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f526187d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wc5.c0 f526188e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(wc5.c0 c0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f526188e = c0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        wc5.y yVar = new wc5.y(this.f526188e, interfaceC29045xdcb5ca57);
        yVar.f526187d = obj;
        return yVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((wc5.y) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object m143895xf1229813;
        java.lang.String j76;
        com.p314xaae8f345.mm.p2621x8fb0427b.s8 s8Var;
        java.util.ArrayList h17;
        kz5.p0 p0Var = kz5.p0.f395529d;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        wc5.c0 c0Var = this.f526188e;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            java.util.List list = wc5.c0.f526072h;
            j76 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) c0Var.T6()).j7();
            s8Var = com.p314xaae8f345.mm.p2621x8fb0427b.s8.f276847a;
            h17 = s8Var.h(j76);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (h17.isEmpty()) {
            return p0Var;
        }
        java.util.ArrayList g17 = s8Var.g(j76, 500, 0);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = g17.iterator();
        while (it.hasNext()) {
            java.lang.String str = ((com.p314xaae8f345.mm.api.C4988x89c61bdd) it.next()).f134741i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getCropLabelId(...)");
            java.util.List f07 = r26.n0.f0(str, new java.lang.String[]{"#"}, false, 0, 6, null);
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : f07) {
                if (((java.lang.String) obj2).length() > 0) {
                    arrayList.add(obj2);
                }
            }
            for (java.lang.String str2 : arrayList) {
                java.lang.Integer num = (java.lang.Integer) linkedHashMap.get(str2);
                linkedHashMap.put(str2, new java.lang.Integer((num != null ? num.intValue() : 0) + 1));
            }
        }
        java.util.List K0 = kz5.n0.K0(kz5.n0.F0(linkedHashMap.entrySet(), new wc5.x()), 10);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(K0, 10));
        java.util.Iterator it6 = K0.iterator();
        while (it6.hasNext()) {
            arrayList2.add((java.lang.String) ((java.util.Map.Entry) it6.next()).getKey());
        }
        int d17 = kz5.b1.d(kz5.d0.q(h17, 10));
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(d17);
        for (java.lang.Object obj3 : h17) {
            linkedHashMap2.put(((aq.a) obj3).f94359a, obj3);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it7 = arrayList2.iterator();
        while (it7.hasNext()) {
            aq.a aVar2 = (aq.a) linkedHashMap2.get((java.lang.String) it7.next());
            if (aVar2 != null) {
                arrayList3.add(aVar2);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryPersonRecommendUIC", "fetchPersonCropItems: allCrop=" + h17.size() + ", recImages=" + g17.size() + ", labelGroups=" + linkedHashMap.size() + ", result=" + arrayList3.size());
        m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(arrayList3);
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 == null) {
            return m143895xf1229813;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MsgHistoryGalleryPersonRecommendUIC", m143898xd4a2fc34, "fetchPersonCropItems failed", new java.lang.Object[0]);
        return p0Var;
    }
}
