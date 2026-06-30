package nr2;

/* loaded from: classes8.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f420806d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nr2.u0 f420807e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f420808f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f420809g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f420810h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f420811i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f420812m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f420813n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f420814o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(nr2.u0 u0Var, android.view.View view, int i17, long j17, java.lang.String str, boolean z17, boolean z18, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f420807e = u0Var;
        this.f420808f = view;
        this.f420809g = i17;
        this.f420810h = j17;
        this.f420811i = str;
        this.f420812m = z17;
        this.f420813n = z18;
        this.f420814o = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new nr2.o0(this.f420807e, this.f420808f, this.f420809g, this.f420810h, this.f420811i, this.f420812m, this.f420813n, this.f420814o, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((nr2.o0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object Q6;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f420806d;
        android.view.View view = this.f420808f;
        nr2.u0 u0Var = this.f420807e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPaidCollectionPayUIC", "doPay");
            android.content.Context context = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            int i18 = this.f420809g;
            long j17 = this.f420810h;
            java.lang.String str = this.f420811i;
            java.lang.String str2 = this.f420814o;
            if (str2 == null) {
                str2 = u0Var.f420846d;
            }
            java.lang.String str3 = str2;
            this.f420806d = 1;
            u0Var.getClass();
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.ra.class))).V6();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPaidCollectionPayUIC", "#orderAndPay authorFinderUsername: " + str + " price: " + i18 + " requestId:" + uuid + " commentScene:" + V6.m75939xb282bd08(5) + " sourceFeedId:" + str3);
            Q6 = this.f420812m ? u0Var.Q6(V6, i18, j17, str, uuid, str3, this) : this.f420813n ? u0Var.R6(V6, i18, j17, str, uuid, str3, this) : new nr2.k0(false, "unknown paidCollection type", "", -1);
            if (Q6 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            Q6 = obj;
        }
        nr2.k0 k0Var = (nr2.k0) Q6;
        if (k0Var.f420779a) {
            u0Var.f420848f = true;
            android.app.Activity context2 = u0Var.m80379x76847179();
            nr2.n0 n0Var = nr2.n0.f420804d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
            az2.f fVar = new az2.f();
            fVar.f97661c = 0L;
            new java.lang.ref.WeakReference(context2);
            az2.q qVar = new az2.q();
            qVar.f97683d = n0Var;
            qVar.f97685a = new java.lang.ref.WeakReference(context2);
            fVar.f97660b = qVar;
            u0Var.f420847e = fVar;
            az2.f fVar2 = u0Var.f420847e;
            if (fVar2 != null) {
                fVar2.a();
            }
            cu2.g0 g0Var = cu2.g0.f303937a;
            cu2.g0.f303938b.put(java.lang.Long.valueOf(this.f420810h), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
        } else {
            u0Var.f420848f = false;
            if (view.getContext() != null && k0Var.f420782d != 0) {
                android.content.Context context3 = view.getContext();
                int i19 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context3);
                e4Var.f293309c = view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lq7);
                e4Var.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
                e4Var.c();
            }
        }
        return jz5.f0.f384359a;
    }
}
