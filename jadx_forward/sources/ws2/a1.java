package ws2;

/* loaded from: classes3.dex */
public final class a1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f530531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f530532e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ws2.k1 f530533f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f530534g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(android.content.Context context, ws2.k1 k1Var, android.content.Intent intent, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f530532e = context;
        this.f530533f = k1Var;
        this.f530534g = intent;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ws2.a1(this.f530532e, this.f530533f, this.f530534g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ws2.a1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object b17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f530531d;
        boolean z17 = true;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                zl2.f fVar = zl2.f.f555286a;
                android.content.Context context = this.f530532e;
                java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eat);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                java.lang.String a17 = n25.a.a();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getMessageChannelIdUse(...)");
                this.f530531d = 1;
                b17 = fVar.b(context, 21, string, false, true, a17, 20000L, "finderreplayfloatpermission", this);
                if (b17 == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                b17 = obj;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v0 v0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v0) b17;
            boolean z18 = v0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t0;
            ws2.k1 k1Var = this.f530533f;
            if (z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayService", "requestPermissionToStartMiniUI ShowWarningAlert positive");
                android.content.Intent intent = this.f530534g;
                ws2.u0 u0Var = ws2.k1.f530599r;
                k1Var.r(intent);
            } else {
                if (!(v0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.s0)) {
                    z17 = v0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.r0;
                }
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayService", "requestPermissionToStartMiniUI result:" + v0Var + ",release replay!");
                    pm0.v.X(new ws2.y0(k1Var));
                } else if (v0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayService", "requestPermissionToStartMiniUI time out");
                    pm0.v.X(new ws2.z0(k1Var));
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveReplayService", "requestPermissionToStartMiniUI " + th6.getMessage());
        }
        return jz5.f0.f384359a;
    }
}
