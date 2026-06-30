package rv0;

/* loaded from: classes5.dex */
public final class u3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f481807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481808e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f481809f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(rv0.n1 n1Var, ex0.a0 a0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f481808e = n1Var;
        this.f481809f = a0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rv0.u3(this.f481808e, this.f481809f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rv0.u3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f481807d;
        rv0.n1 n1Var = this.f481808e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            gx0.bf p76 = n1Var.p7();
            this.f481807d = 1;
            if (gx0.bf.d7(p76, null, null, false, this, 7, null) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        ex0.r n17 = this.f481809f.n();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (n17 == null) {
            return f0Var;
        }
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p894x8438d441.C10943x503f3e16 r76 = n1Var.r7();
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID = n17.f338701b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        bx0.h hVar = r76.timelineLayoutCalc;
        android.graphics.Rect b17 = hVar != null ? hVar.b(segmentID, false) : null;
        if (b17 == null) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            return f0Var;
        }
        double m47441x185482f6 = n1Var.r7().m47441x185482f6() + n1Var.r7().m47432x1e87e5ec().f328577a;
        double d17 = b17.right;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = n17.f338700a;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a A = d17 >= m47441x185482f6 ? c4190xd8dd3713.A() : c4190xd8dd3713.B().m34007xde00a612().sub(new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a(1L));
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p894x8438d441.C10943x503f3e16 r77 = n1Var.r7();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(A);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817.l(r77, A, false, 2, null);
        gx0.bf.q7(n1Var.p7(), A, true, 0L, 4, null);
        return f0Var;
    }
}
