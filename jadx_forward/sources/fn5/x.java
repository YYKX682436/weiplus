package fn5;

/* loaded from: classes14.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f346302d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f346303e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f346304f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(java.util.ArrayList arrayList, fn5.n0 n0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f346303e = arrayList;
        this.f346304f = n0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new fn5.x(this.f346303e, this.f346304f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((fn5.x) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f346302d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.util.ArrayList arrayList = this.f346303e;
            boolean isEmpty = arrayList.isEmpty();
            fn5.n0 n0Var = this.f346304f;
            if (isEmpty) {
                n0Var.f346256f.mo523x53d8522f(fn5.o0.f346278f);
                int size = n0Var.f346264q.size();
                fn5.p0 p0Var = (fn5.p0) n0Var.f346262o.mo3195x754a37bb();
                int size2 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p0Var != null ? p0Var.name() : null, "PERSON") ? n0Var.f346265r.size() : 0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryReportProvider", "reportSearchIfDone >> " + size + ", " + aq.o.f94453a + ", " + size2);
                if (!aq.o.f94453a) {
                    f65.o.f341452h = size;
                    f65.o oVar = f65.o.f341445a;
                    oVar.d(size2);
                    oVar.c(size > 0 ? 56 : 57);
                }
            } else {
                this.f346302d = 1;
                if (fn5.n0.N6(n0Var, arrayList, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
