package df2;

/* loaded from: classes.dex */
public final class mh extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f312312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.oh f312313e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, df2.oh ohVar) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312312d = hVar;
        this.f312313e = ohVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.mh(this.f312312d, interfaceC29045xdcb5ca57, this.f312313e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        df2.mh mhVar = (df2.mh) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        mhVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.util.LinkedList m75941xfb821914 = ((r45.ls1) ((xg2.i) this.f312312d).f535926b).m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getFloat_msgs(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            df2.oh ohVar = this.f312313e;
            if (!hasNext) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ohVar.f312500m, "getFloatMsgConfig: success,floatMsgConfig privilegeConfigListSize=" + arrayList.size());
                ((mm2.j2) ohVar.m56788xbba4bfc0(mm2.j2.class)).f410703r = arrayList;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ohVar.f312500m, "getFloatMsgConfig: success");
                return jz5.f0.f384359a;
            }
            java.lang.Object next = it.next();
            int m75939xb282bd08 = ((r45.o84) next).m75939xb282bd08(0);
            ohVar.getClass();
            if (m75939xb282bd08 == 1 || m75939xb282bd08 == 2 || m75939xb282bd08 == 3) {
                arrayList.add(next);
            }
        }
    }
}
