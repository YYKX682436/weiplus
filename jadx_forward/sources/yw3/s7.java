package yw3;

/* loaded from: classes.dex */
public final class s7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f548418d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f548418d = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yw3.s7(this.f548418d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yw3.s7 s7Var = (yw3.s7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        s7Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        try {
            java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(this.f548418d, "msg", null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
            java.util.ArrayList arrayList = new java.util.ArrayList(d17.size());
            for (java.util.Map.Entry entry : d17.entrySet()) {
                arrayList.add(((java.lang.String) entry.getKey()) + '[' + ((java.lang.String) entry.getValue()) + ']');
            }
            java.lang.String g07 = kz5.n0.g0(arrayList, "\n", null, null, 0, null, null, 62, null);
            java.lang.String format = java.lang.String.format("MMXmlParser_" + c01.id.c() + ".txt", java.util.Arrays.copyOf(new java.lang.Object[0], 0));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            xs.i1 i1Var = (xs.i1) i95.n0.c(xs.i1.class);
            byte[] bytes = g07.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            ((zc0.h) i1Var).aj(format, bytes, true);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Repairer.RepairerXmlToJSONDemo", e17, "mm_xml_parser", new java.lang.Object[0]);
        }
        return jz5.f0.f384359a;
    }
}
