package fn5;

/* loaded from: classes14.dex */
public final class c0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f346182d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.util.Pair f346183e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f346184f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(android.util.Pair pair, fn5.n0 n0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f346183e = pair;
        this.f346184f = n0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new fn5.c0(this.f346183e, this.f346184f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((fn5.c0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f346182d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            android.util.Pair pair = this.f346183e;
            boolean isEmpty = ((java.util.ArrayList) pair.second).isEmpty();
            fn5.n0 n0Var = this.f346184f;
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
                java.lang.Object first = pair.first;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(first, "first");
                n0Var.getClass();
                java.util.ArrayList arrayList = n0Var.f346267t;
                arrayList.clear();
                arrayList.addAll((java.util.ArrayList) first);
                java.lang.Object second = pair.second;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(second, "second");
                this.f346182d = 1;
                if (fn5.n0.N6(n0Var, (java.util.ArrayList) second, this) == aVar) {
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
