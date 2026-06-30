package eg2;

/* loaded from: classes3.dex */
public final class a1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f334064d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eg2.b1 f334065e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(eg2.b1 b1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f334065e = b1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new eg2.a1(this.f334065e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((eg2.a1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        eg2.x0 x0Var;
        boolean z17;
        eg2.t0 t0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f334064d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        eg2.b1 b1Var = this.f334065e;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                this.f334064d = 1;
                obj = eg2.b1.f(b1Var, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            x0Var = (eg2.x0) obj;
            z17 = b1Var.f334110b.get();
            t0Var = b1Var.f334076k;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FinderLiveHDTaskProcessor", e17, "task error", new java.lang.Object[0]);
            boolean z18 = b1Var.f334110b.get();
            eg2.o oVar = (eg2.o) b1Var.f334076k;
            if (z18) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = oVar.f334137a.f334143n;
                if (u3Var != null) {
                    u3Var.dismiss();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderCoverHDTaskPlugin", "HD task cancelled");
            } else {
                oVar.a(e17);
            }
        }
        if (z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = ((eg2.o) t0Var).f334137a.f334143n;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderCoverHDTaskPlugin", "HD task cancelled");
            return f0Var;
        }
        if (x0Var instanceof eg2.w0) {
            ((eg2.o) t0Var).b(((eg2.w0) x0Var).f334176a);
        } else if (x0Var instanceof eg2.v0) {
            eg2.o oVar2 = (eg2.o) t0Var;
            oVar2.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderCoverHDTaskPlugin", "HD task: no need to enhance");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var3 = oVar2.f334137a.f334143n;
            if (u3Var3 != null) {
                u3Var3.dismiss();
            }
        } else if (x0Var instanceof eg2.u0) {
            ((eg2.o) t0Var).a(null);
        }
        return f0Var;
    }
}
