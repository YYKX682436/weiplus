package oh3;

/* loaded from: classes8.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f426972d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oh3.q f426973e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426974f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(oh3.q qVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f426973e = qVar;
        this.f426974f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new oh3.m(this.f426973e, this.f426974f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((oh3.m) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f426972d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            mh3.a aVar2 = new mh3.a(kz5.c0.i(new java.lang.Integer(1), new java.lang.Integer(3)));
            this.f426972d = 1;
            obj = rm0.h.b(aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (((com.p314xaae8f345.mm.p944x882e457a.f) obj).b()) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            oh3.q qVar = this.f426973e;
            qVar.f426988h = currentTimeMillis;
            r45.vt vtVar = qVar.f426989i;
            boolean z17 = vtVar.f470044d != 0;
            qVar.Ai(vtVar);
            boolean z18 = vtVar.f470044d != 0;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[doInit] source=");
            java.lang.String str = this.f426974f;
            sb6.append(str);
            sb6.append(", ");
            sb6.append(qVar.Bi(vtVar));
            sb6.append(" openEntrance=[");
            sb6.append(z17);
            sb6.append(" => ");
            sb6.append(z18);
            sb6.append(']');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PluginMMEcFeatureService", sb6.toString());
            java.util.Iterator it = qVar.f426990m.iterator();
            while (it.hasNext()) {
                ((p90.i) it.next()).a();
            }
            qVar.wi().n(str);
        }
        return jz5.f0.f384359a;
    }
}
