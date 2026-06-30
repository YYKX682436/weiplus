package rv0;

/* loaded from: classes5.dex */
public final class h2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f481562d;

    /* renamed from: e, reason: collision with root package name */
    public int f481563e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481564f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(rv0.n1 n1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f481564f = n1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rv0.h2(this.f481564f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rv0.h2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        ex0.a0 s76;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f481563e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        boolean z17 = false;
        rv0.n1 n1Var = this.f481564f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            s76 = n1Var.s7();
            if (s76 == null) {
                wt0.a.a("No focused segment!!!!", n1Var.m158345xefc66565());
                return f0Var;
            }
            gx0.bf p76 = n1Var.p7();
            this.f481562d = s76;
            this.f481563e = 1;
            if (gx0.bf.t7(p76, false, this, 1, null) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return f0Var;
            }
            s76 = (ex0.a0) this.f481562d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        ex0.r n17 = s76.n();
        if (n17 == null) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("TimelineViewModel", "toggleFocusedSegmentContentRotationMode: focusedSegmentVM == null");
        } else {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = n17.f338700a;
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = c4190xd8dd3713 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 ? (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) c4190xd8dd3713 : null;
            if (c4181x2248e1a3 == null) {
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("TimelineViewModel", "toggleFocusedSegmentContentRotationMode: clipSegment == null");
            } else {
                sg.b bVar = sg.b.None;
                com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4181x2248e1a3.D();
                int ordinal = (D != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.a1(c4181x2248e1a3, D) : bVar).ordinal();
                if (ordinal == 0) {
                    bVar = sg.b.CCW90;
                } else if (ordinal == 1) {
                    bVar = sg.b.CW180;
                } else if (ordinal == 2) {
                    bVar = sg.b.CW90;
                } else if (ordinal != 3) {
                    throw new jz5.j();
                }
                com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D2 = c4181x2248e1a3.D();
                if (D2 != null) {
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.P0(c4181x2248e1a3, bVar, D2);
                }
                java.util.EnumSet of6 = java.util.EnumSet.of(cx0.d.f306041d);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(of6, "of(...)");
                s76.J(of6, null);
                z17 = true;
            }
        }
        if (z17) {
            yy0.m7 m7Var = (yy0.m7) n1Var.R6().O6();
            p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.x3(m7Var, null), 3, null);
            gx0.kh q76 = n1Var.q7();
            java.lang.String string = n1Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lmf);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            q76.r7(string, null);
            gx0.bf p77 = n1Var.p7();
            this.f481562d = null;
            this.f481563e = 2;
            if (gx0.bf.d7(p77, null, null, false, this, 7, null) == aVar) {
                return aVar;
            }
        }
        return f0Var;
    }
}
