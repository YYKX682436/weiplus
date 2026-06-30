package qf2;

/* loaded from: classes.dex */
public final class v3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f444153d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f444153d = hVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qf2.v3(this.f444153d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        qf2.v3 v3Var = (qf2.v3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        v3Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.m02 m02Var = (r45.m02) ((xg2.i) this.f444153d).f535926b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VoiceRoomController", "modifyCityShow success");
        java.util.LinkedList m75941xfb821914 = m02Var.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getRet_list(...)");
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            boolean z17 = false;
            if (((r45.ix0) obj2).m75939xb282bd08(0) == 21) {
                z17 = true;
            }
            if (z17) {
                break;
            }
        }
        r45.ix0 ix0Var = (r45.ix0) obj2;
        if (ix0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VoiceRoomController", "modifyCityShow result: " + ix0Var.m75939xb282bd08(1) + " msg: " + ix0Var.m75945x2fec8307(2));
        }
        return jz5.f0.f384359a;
    }
}
