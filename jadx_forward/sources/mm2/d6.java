package mm2;

/* loaded from: classes3.dex */
public final class d6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f410492d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm2.f6 f410493e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f410494f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(mm2.f6 f6Var, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f410493e = f6Var;
        this.f410494f = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mm2.d6(this.f410493e, this.f410494f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mm2.d6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f410492d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
            mm2.f6 f6Var = this.f410493e;
            long j17 = ((mm2.e1) f6Var.m147920xbba4bfc0(mm2.e1.class)).f410516m;
            long m75942xfb822ef2 = ((mm2.e1) f6Var.m147920xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
            int i18 = this.f410494f;
            java.lang.String str = ((mm2.c1) f6Var.m147920xbba4bfc0(mm2.c1.class)).f410385o;
            this.f410492d = 1;
            ((b92.d1) zbVar).getClass();
            obj = st2.g3.f493859a.q(j17, m75942xfb822ef2, i18, str, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        r45.nd2 nd2Var = (r45.nd2) obj;
        r45.cp1 cp1Var = new r45.cp1();
        byte[] g17 = (nd2Var == null || (m75934xbce7f2f = nd2Var.m75934xbce7f2f(1)) == null) ? null : m75934xbce7f2f.g();
        if (g17 != null) {
            try {
                cp1Var.mo11468x92b714fd(g17);
                return cp1Var;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
        }
        return null;
    }
}
