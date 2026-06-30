package m;

/* loaded from: classes16.dex */
public final class c extends qz5.l implements yz5.p {
    public int L;
    public final /* synthetic */ we0.u0 M;
    public final /* synthetic */ java.util.Map N;
    public final /* synthetic */ android.content.Context P;
    public final /* synthetic */ android.os.Bundle Q;
    public final /* synthetic */ android.os.ResultReceiver R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(we0.u0 u0Var, java.util.Map map, android.content.Context context, android.os.Bundle bundle, android.os.ResultReceiver resultReceiver, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.M = u0Var;
        this.N = map;
        this.P = context;
        this.Q = bundle;
        this.R = resultReceiver;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new m.c(this.M, this.N, this.P, this.Q, this.R, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((m.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.L;
        we0.u0 u0Var = this.M;
        try {
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(u0Var.f526702d, "openFlutterPublishPage: launch failed, err=" + th6.getMessage());
            android.os.ResultReceiver resultReceiver = this.R;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            }
        }
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.util.Map map = this.N;
            this.L = 1;
            obj = we0.u0.a(u0Var, map, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        android.content.Context context = this.P;
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 b17 = we0.u0.b(u0Var);
        android.os.Bundle bundle = this.Q;
        this.L = 2;
        if (pi0.l1.v((pi0.l1) obj, context, b17, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2275xd2ae381c.ActivityC18678x2dd96834.class, null, bundle, this, 8, null) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
