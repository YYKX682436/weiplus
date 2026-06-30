package gx0;

/* loaded from: classes5.dex */
public final class k6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f358149d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f358150e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(gx0.w8 w8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358150e = w8Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.k6(this.f358150e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.k6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0056. Please report as an issue. */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f358149d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            if (this.f358150e.f358648r != gx0.y4.f358739m) {
                gx0.w8 w8Var = this.f358150e;
                java.lang.String b17 = j65.q.b(w8Var.m80379x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.lli);
                this.f358149d = 1;
                if (w8Var.A6(b17, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                }
                if (i17 != 3) {
                    if (i17 == 4) {
                        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                    }
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                gx0.w8.o7(this.f358150e);
                return f0Var;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        switch (this.f358150e.f358648r.ordinal()) {
            case 0:
                gx0.w8 w8Var2 = this.f358150e;
                w8Var2.getClass();
                w8Var2.J7(gx0.y4.f358734e);
                w8Var2.f358650t = p3325xe03a0797.p3326xc267989b.l.d(w8Var2.mo144225x95f74600(), null, null, new gx0.d5(w8Var2, null), 3, null);
                return f0Var;
            case 1:
                return f0Var;
            case 2:
                gx0.w8.o7(this.f358150e);
                return f0Var;
            case 3:
            case 5:
            case 7:
                p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f358150e.f358650t;
                if (r2Var != null) {
                    gx0.w8 w8Var3 = this.f358150e;
                    this.f358149d = 3;
                    if (gx0.w8.g7(w8Var3, r2Var, "initializeTimelineAndStartupPlayback", this) == aVar) {
                        return aVar;
                    }
                }
                gx0.w8.o7(this.f358150e);
                return f0Var;
            case 4:
                gx0.w8 w8Var4 = this.f358150e;
                this.f358149d = 2;
                return w8Var4.E4(this) == aVar ? aVar : f0Var;
            case 6:
                return f0Var;
            case 8:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MovieComp.MainComposingUIC", "initializeTimelineAndStartupPlayback >> but state is " + this.f358150e.f358648r);
                gx0.w8 w8Var5 = this.f358150e;
                this.f358149d = 4;
                return w8Var5.E4(this) == aVar ? aVar : f0Var;
            default:
                return f0Var;
        }
    }
}
