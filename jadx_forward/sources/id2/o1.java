package id2;

/* loaded from: classes.dex */
public final class o1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f372233d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f372234e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f372235f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f372236g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(id2.v1 v1Var, android.widget.TextView textView, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f372235f = v1Var;
        this.f372236g = textView;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        id2.o1 o1Var = new id2.o1(this.f372235f, this.f372236g, interfaceC29045xdcb5ca57);
        o1Var.f372234e = obj;
        return o1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((id2.o1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        p3325xe03a0797.p3326xc267989b.y0 y0Var2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f372233d;
        id2.v1 v1Var = this.f372235f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var3 = (p3325xe03a0797.p3326xc267989b.y0) this.f372234e;
            this.f372234e = y0Var3;
            this.f372233d = 1;
            java.lang.Object P6 = id2.v1.P6(v1Var, this);
            if (P6 == aVar) {
                return aVar;
            }
            y0Var = y0Var3;
            obj = P6;
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3325xe03a0797.p3326xc267989b.y0 y0Var4 = (p3325xe03a0797.p3326xc267989b.y0) this.f372234e;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                y0Var2 = y0Var4;
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                p3325xe03a0797.p3326xc267989b.l.d(y0Var2, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new id2.n1((jz5.l) obj, this.f372236g, v1Var, null), 2, null);
                return jz5.f0.f384359a;
            }
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f372234e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        r45.mf2 mf2Var = (r45.mf2) obj;
        if (mf2Var != null) {
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = v1Var.m158354x19263085();
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = mf2Var.m75934xbce7f2f(2);
            byte[] g17 = m75934xbce7f2f != null ? m75934xbce7f2f.g() : null;
            if (g17 == null) {
                g17 = new byte[0];
            }
            java.lang.String str = v1Var.G;
            this.f372234e = y0Var;
            this.f372233d = 2;
            obj = ((c61.l7) b6Var).Mk(m158354x19263085, g17, str, this);
            if (obj == aVar) {
                return aVar;
            }
            y0Var2 = y0Var;
            p3325xe03a0797.p3326xc267989b.p0 p0Var2 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(y0Var2, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new id2.n1((jz5.l) obj, this.f372236g, v1Var, null), 2, null);
        }
        return jz5.f0.f384359a;
    }
}
