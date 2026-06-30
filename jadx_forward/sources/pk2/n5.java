package pk2;

/* loaded from: classes3.dex */
public final class n5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f437568d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ boolean f437569e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pk2.q5 f437570f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437571g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(pk2.q5 q5Var, pk2.o9 o9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f437570f = q5Var;
        this.f437571g = o9Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        pk2.n5 n5Var = new pk2.n5(this.f437570f, this.f437571g, interfaceC29045xdcb5ca57);
        n5Var.f437569e = ((java.lang.Boolean) obj).booleanValue();
        return n5Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pk2.n5) mo148xaf65a0fc(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()), (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        long j17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f437568d;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            return obj;
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        boolean z17 = this.f437569e;
        pk2.q5 q5Var = this.f437570f;
        qk2.f.f(q5Var, false, 1, null);
        this.f437568d = 1;
        q5Var.getClass();
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
        rVar.k();
        v65.n nVar = new v65.n(rVar);
        pk2.o9 o9Var = this.f437571g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o9Var.f437605a, "switchDesignedGift isEnable:" + z17);
        long j18 = ((mm2.c1) o9Var.c(mm2.c1.class)).f410399q;
        if (z17) {
            java.util.regex.Pattern pattern = pm0.v.f438335a;
            j17 = 4294967296L | j18;
        } else {
            java.util.regex.Pattern pattern2 = pm0.v.f438335a;
            j17 = (-4294967297L) & j18;
        }
        ((mm2.c1) o9Var.c(mm2.c1.class)).q8(j17);
        pk2.p5 p5Var = new pk2.p5(o9Var, nVar, j18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2.f197173a.e("DesignedGift", (int) ((mm2.c1) o9Var.c(mm2.c1.class)).f410399q);
        dk2.xf f17 = o9Var.f();
        if (f17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(o9Var.f437605a, "switchDesignedGift finderLiveAssistant is null, abort");
            ((mm2.c1) o9Var.c(mm2.c1.class)).q8(j18);
            nVar.a(java.lang.Boolean.FALSE);
        } else {
            dk2.xf.h(f17, ((mm2.e1) o9Var.c(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) o9Var.c(mm2.e1.class)).f410516m, j17, 4294967296L, 0, p5Var, 16, null);
        }
        java.lang.Object j19 = rVar.j();
        return j19 == aVar ? aVar : j19;
    }
}
