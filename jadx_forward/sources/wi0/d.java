package wi0;

/* loaded from: classes4.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f527672d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.C24220xddc1739a f527673e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f527674f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.C24220xddc1739a c24220xddc1739a, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f527673e = c24220xddc1739a;
        this.f527674f = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new wi0.d(this.f527673e, this.f527674f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((wi0.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.C24220xddc1739a c24220xddc1739a = this.f527673e;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f527672d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        yz5.l lVar = this.f527674f;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.b("", c01.z1.r());
                java.lang.String m89583x51f8f5b0 = c24220xddc1739a.m89583x51f8f5b0();
                java.lang.String m89586x7525eefd = c24220xddc1739a.m89586x7525eefd();
                java.lang.String m89584x75e04be9 = c24220xddc1739a.m89584x75e04be9();
                boolean m89585xae00a2fd = c24220xddc1739a.m89585xae00a2fd();
                this.f527672d = 1;
                obj = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new xi0.e(m89583x51f8f5b0, m89586x7525eefd, m89584x75e04be9, m89585xae00a2fd, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.C24221xdd94b496((java.lang.String) obj))));
            return f0Var;
        } catch (java.lang.Exception e17) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(e17))));
            return f0Var;
        }
    }
}
