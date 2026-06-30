package sm2;

/* loaded from: classes3.dex */
public final class j4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f491051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f491052e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f491053f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(java.util.LinkedList linkedList, sm2.o4 o4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f491052e = linkedList;
        this.f491053f = o4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sm2.j4(this.f491052e, this.f491053f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((sm2.j4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f491051d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f491051d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(15000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.util.LinkedList<km2.q> linkedList = this.f491052e;
        sm2.o4 o4Var = this.f491053f;
        for (km2.q qVar : linkedList) {
            java.util.ArrayList arrayList = zn0.x.f555947a.f555948a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrayList, "getRemoteUserConfigList(...)");
            synchronized (arrayList) {
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((zn0.v) obj2).f555939d, qVar.f390703a)) {
                        break;
                    }
                }
            }
            if (obj2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o4Var.f491143f, "startCloseLinkCheck, start close link mic, id: " + qVar.f390703a);
                sm2.o4.H(o4Var, qVar, 1, true, true, null, 16, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
