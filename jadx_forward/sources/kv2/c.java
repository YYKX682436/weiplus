package kv2;

/* loaded from: classes10.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f394186d;

    /* renamed from: e, reason: collision with root package name */
    public int f394187e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f394188f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f394189g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f394190h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.ref.WeakReference weakReference, long j17, long j18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f394188f = weakReference;
        this.f394189g = j17;
        this.f394190h = j18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new kv2.c(this.f394188f, this.f394189g, this.f394190h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((kv2.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f394187e;
        long j17 = this.f394189g;
        java.lang.ref.WeakReference weakReference = this.f394188f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 e17 = kv2.h.f394195a.e(weakReference);
            qk.j8 j8Var = (qk.j8) i95.n0.c(qk.j8.class);
            java.lang.String valueOf = java.lang.String.valueOf(j17);
            java.lang.String valueOf2 = java.lang.String.valueOf(j17);
            this.f394186d = e17;
            this.f394187e = 1;
            rk4.l4 l4Var = (rk4.l4) j8Var;
            l4Var.getClass();
            java.lang.Object c17 = p3325xe03a0797.p3326xc267989b.a4.c(5000L, new rk4.k4(l4Var, valueOf, valueOf2, null), this);
            if (c17 == aVar) {
                return aVar;
            }
            u3Var = e17;
            obj = c17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u3Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) this.f394186d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        bw5.lp0 lp0Var = (bw5.lp0) obj;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (lp0Var == null) {
            kv2.h.f394195a.f(weakReference, com.p314xaae8f345.mm.R.C30867xcad56011.lg7);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingFinderMentionRouter", "tingItem is null");
            return f0Var;
        }
        bw5.v70 d17 = lp0Var.d();
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d17 != null ? d17.m13170xcc16feb8() : null, java.lang.String.valueOf(j17))) {
            kv2.h.f394195a.f(weakReference, com.p314xaae8f345.mm.R.C30867xcad56011.lg7);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("listenId not equal, listenId:");
            sb6.append(j17);
            sb6.append(", tingItemId:");
            bw5.v70 d18 = lp0Var.d();
            sb6.append(d18 != null ? d18.m13170xcc16feb8() : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingFinderMentionRouter", sb6.toString());
            return f0Var;
        }
        o40.e eVar = (o40.e) i95.n0.c(o40.e.class);
        eVar.getClass();
        bw5.x40 x40Var = new bw5.x40();
        x40Var.f116489f = lp0Var.d();
        x40Var.f116492i[3] = true;
        android.content.Context context = (android.app.Activity) weakReference.get();
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        byte[] mo14344x5f01b1f6 = x40Var.mo14344x5f01b1f6();
        java.util.Map l17 = kz5.c1.l(new jz5.l("needLoadMore", java.lang.Boolean.FALSE));
        long j18 = this.f394190h;
        if (j18 != 0) {
            l17.put("refCommentId", new java.lang.Long(j18));
        }
        ((wy2.g) eVar).Bi(context, mo14344x5f01b1f6, l17);
        return f0Var;
    }
}
