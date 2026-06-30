package h93;

/* loaded from: classes11.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h93.k f361233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f361234e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h93.k kVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f361233d = kVar;
        this.f361234e = h0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new h93.g(this.f361233d, this.f361234e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        h93.g gVar = (h93.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        gVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        jz5.l lVar;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        h93.k kVar = this.f361233d;
        kVar.f361244g.clear();
        no.a aVar2 = kVar.f361243f;
        aVar2.f420231a.clear();
        aVar2.f420232b.clear();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f361234e;
        java.util.List<com.p314xaae8f345.mm.p2621x8fb0427b.d4> list = (java.util.List) h0Var.f391656d;
        if (list != null) {
            for (com.p314xaae8f345.mm.p2621x8fb0427b.d4 d4Var : list) {
                java.lang.String field_labelName = d4Var.f66586x7661fe9a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_labelName, "field_labelName");
                java.lang.Integer num = new java.lang.Integer(d4Var.f66585x70ce48ca);
                aVar2.getClass();
                java.util.LinkedHashMap linkedHashMap = aVar2.f420231a;
                if (linkedHashMap.containsKey(field_labelName)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BiMap", "try to rebind key(exist)-value! exist bind: " + ((java.lang.Object) field_labelName) + '-' + linkedHashMap.get(field_labelName) + ", but want to rebind with: " + ((java.lang.Object) field_labelName) + '-' + num);
                } else {
                    java.util.LinkedHashMap linkedHashMap2 = aVar2.f420232b;
                    if (linkedHashMap2.containsKey(num)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BiMap", "try to rebind key-value(exist)! exist bind: " + linkedHashMap2.get(num) + '-' + num + ", but want to rebind with: " + ((java.lang.Object) field_labelName) + '-' + num);
                    } else {
                        linkedHashMap.put(field_labelName, num);
                        linkedHashMap2.put(num, field_labelName);
                    }
                }
                if (d4Var.f66584x284d1882) {
                    kVar.f361244g.add(d4Var);
                }
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("load allContactLabels: ");
        java.util.List list2 = (java.util.List) h0Var.f391656d;
        sb6.append(list2 != null ? new java.lang.Integer(list2.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LabelStateUIC", sb6.toString());
        java.util.Set keySet = aVar2.f420232b.keySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet, "<get-keys>(...)");
        java.util.ArrayList arrayList = kVar.f361242e;
        if (!arrayList.isEmpty()) {
            h93.f fVar = new h93.f(keySet);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arrayList, "<this>");
            kz5.h0.z(arrayList, fVar, false);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) aVar2.f420232b.get(new java.lang.Integer(((java.lang.Number) it.next()).intValue()));
            if (str == null) {
                lVar = null;
            } else {
                java.lang.Integer num2 = (java.lang.Integer) kVar.f361241d.get(str);
                if (num2 == null) {
                    num2 = new java.lang.Integer(0);
                }
                lVar = new jz5.l(str, new java.lang.Integer(num2.intValue()));
            }
            if (lVar != null) {
                arrayList2.add(lVar);
            }
        }
        jz5.l[] lVarArr = (jz5.l[]) arrayList2.toArray(new jz5.l[0]);
        kVar.f361241d = kz5.c1.i((jz5.l[]) java.util.Arrays.copyOf(lVarArr, lVarArr.length));
        java.util.ArrayList O6 = kVar.O6();
        for (java.lang.Class cls : h93.k.f361240q) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = kVar.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((h93.c) pf5.z.f435481a.a(activity).a(cls)).T6(O6);
        }
        kVar.f361245h.mo152xb9724478();
        return jz5.f0.f384359a;
    }
}
