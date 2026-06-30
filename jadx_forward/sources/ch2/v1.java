package ch2;

/* loaded from: classes10.dex */
public final class v1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f123014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f123015e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f123016f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(long j17, ch2.o2 o2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f123015e = j17;
        this.f123016f = o2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ch2.v1(this.f123015e, this.f123016f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ch2.v1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 T;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f123014d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            long j17 = this.f123015e;
            this.f123014d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(j17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.util.List list = this.f123016f.H;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "access$getSeiInfoList$p(...)");
        ch2.o2 o2Var = this.f123016f;
        synchronized (list) {
            java.util.List list2 = o2Var.H;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "access$getSeiInfoList$p(...)");
            r45.fa4 f76 = o2Var.f7(list2);
            tn0.w0 Q6 = o2Var.Q6();
            if (Q6 != null && (T = Q6.T()) != null) {
                T.mo30315x1a3ef952(f76.mo14344x5f01b1f6(), 1);
            }
            o2Var.H.clear();
            o2Var.G = false;
        }
        return jz5.f0.f384359a;
    }
}
