package il2;

/* loaded from: classes.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f373582d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f373583e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f373584f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f373582d = hVar;
        this.f373583e = i17;
        this.f373584f = h0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new il2.e(this.f373582d, interfaceC29045xdcb5ca57, this.f373583e, this.f373584f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        il2.e eVar = (il2.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        eVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.fs1 fs1Var = (r45.fs1) ((xg2.i) this.f373582d).f535926b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getLiveExtraInfo succes : ");
        java.util.LinkedList m75941xfb821914 = fs1Var.m75941xfb821914(1);
        sb6.append(m75941xfb821914 != null ? new java.lang.Integer(m75941xfb821914.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRestrictConsumePlugin", sb6.toString());
        java.util.LinkedList m75941xfb8219142 = fs1Var.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getGet_resp_list(...)");
        java.util.Iterator it = m75941xfb8219142.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((r45.mn3) obj2).m75939xb282bd08(0) == this.f373583e) {
                break;
            }
        }
        r45.mn3 mn3Var = (r45.mn3) obj2;
        if (mn3Var != null) {
            java.lang.Object newInstance = r45.ns1.class.getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = (com.p314xaae8f345.mm.p2495xc50a8b8b.f) newInstance;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = mn3Var.m75934xbce7f2f(2);
            byte[] g17 = m75934xbce7f2f != null ? m75934xbce7f2f.g() : null;
            if (g17 != null) {
                try {
                    fVar.mo11468x92b714fd(g17);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                }
            }
            this.f373584f.f391656d = newInstance;
        }
        return jz5.f0.f384359a;
    }
}
