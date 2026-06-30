package gc0;

/* loaded from: classes5.dex */
public final class u1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 f351828d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f351829e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gc0.p2 f351830f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f351831g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gc0.b0 f351832h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f351833i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 c21475x81dbaa18, java.util.List list, gc0.p2 p2Var, boolean z17, gc0.b0 b0Var, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f351828d = c21475x81dbaa18;
        this.f351829e = list;
        this.f351830f = p2Var;
        this.f351831g = z17;
        this.f351832h = b0Var;
        this.f351833i = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gc0.u1(this.f351828d, this.f351829e, this.f351830f, this.f351831g, this.f351832h, this.f351833i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        gc0.u1 u1Var = (gc0.u1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        u1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        boolean z17;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 c21475x81dbaa18 = this.f351828d;
        android.content.Context context = c21475x81dbaa18.getContext();
        java.util.Iterator it = this.f351829e.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            z17 = this.f351831g;
            if (!hasNext) {
                break;
            }
            r45.kl5 kl5Var = (r45.kl5) it.next();
            java.lang.String m75945x2fec8307 = kl5Var.m75945x2fec8307(1);
            if (m75945x2fec8307 != null && (true ^ r26.n0.N(m75945x2fec8307))) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
                android.view.View O6 = gc0.p2.O6(this.f351830f, context, m75945x2fec8307);
                if (O6 != null) {
                    gc0.p2 p2Var = this.f351830f;
                    O6.setOnClickListener(new gc0.t1(this.f351833i, m75945x2fec8307, p2Var, kl5Var, O6));
                    c21475x81dbaa18.addView(O6);
                    p2Var.f351781m.a(kl5Var, O6, 2, this.f351832h.f351632a);
                }
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecommendRemarkUIC", "initRecommendRemark phone:" + m75945x2fec8307 + " phonenotshow for reachPhoneLimit:" + z17);
                }
            }
        }
        if (c21475x81dbaa18.getChildCount() <= 0 || z17) {
            c21475x81dbaa18.setVisibility(8);
        } else {
            c21475x81dbaa18.setVisibility(0);
        }
        return jz5.f0.f384359a;
    }
}
