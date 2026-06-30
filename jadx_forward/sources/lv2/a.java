package lv2;

/* loaded from: classes10.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f403028d;

    /* renamed from: e, reason: collision with root package name */
    public int f403029e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.ic0 f403030f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f403031g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dm.pd f403032h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(bw5.ic0 ic0Var, java.lang.ref.WeakReference weakReference, dm.pd pdVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f403030f = ic0Var;
        this.f403031g = weakReference;
        this.f403032h = pdVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new lv2.a(this.f403030f, this.f403031g, this.f403032h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((lv2.a) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object c17;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f403029e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        java.lang.ref.WeakReference weakReference = this.f403031g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            bw5.ic0 ic0Var = this.f403030f;
            java.lang.String str = ic0Var.m12143x6e095e9(4) ? ic0Var.f110058f : "";
            if (str != null) {
                if (!(str.length() == 0)) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 e17 = kv2.h.f394195a.e(weakReference);
                    qk.j8 j8Var = (qk.j8) i95.n0.c(qk.j8.class);
                    this.f403028d = e17;
                    this.f403029e = 1;
                    rk4.l4 l4Var = (rk4.l4) j8Var;
                    l4Var.getClass();
                    c17 = p3325xe03a0797.p3326xc267989b.a4.c(5000L, new rk4.j4(l4Var, str, null), this);
                    if (c17 == aVar) {
                        return aVar;
                    }
                    u3Var = e17;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMentionCategoryRouteHandler", "categoryId is empty");
            return f0Var;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        u3Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) this.f403028d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        c17 = obj;
        bw5.o50 o50Var = (bw5.o50) c17;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (o50Var == null) {
            kv2.h.f394195a.f(weakReference, com.p314xaae8f345.mm.R.C30867xcad56011.lg7);
            return f0Var;
        }
        kv2.h hVar = kv2.h.f394195a;
        if ((o50Var.f112497n == 3) && o50Var.W) {
            hVar.f(weakReference, com.p314xaae8f345.mm.R.C30867xcad56011.lg6);
            return f0Var;
        }
        int i18 = o50Var.f112497n;
        if ((i18 == 2 || i18 == 8 || i18 == 9) && o50Var.W) {
            hVar.f(weakReference, com.p314xaae8f345.mm.R.C30867xcad56011.lg8);
            return f0Var;
        }
        int i19 = o50Var.f112497n;
        if ((i19 == 2 || i19 == 8 || i19 == 9) && !o50Var.K && !o50Var.f112499p) {
            hVar.f(weakReference, com.p314xaae8f345.mm.R.C30867xcad56011.lg9);
            return f0Var;
        }
        il4.e eVar = new il4.e(null, 0, 0, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554431, null);
        dm.pd mention = this.f403032h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mention, "mention");
        int i27 = mention.f66105xcd878615;
        if ((i27 > 2000 && i27 < 2999) || i27 == 1002 || i27 == 1004) {
            eVar.f373651o = java.lang.String.valueOf(mention.f66076x418206d5);
        }
        bw5.ar0 ar0Var = bw5.ar0.TingScene_FinderMsgList;
        eVar.f373639c = 1609;
        android.content.Context context = (android.app.Activity) weakReference.get();
        qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        android.content.Context context2 = context;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context2);
        ((rk4.k8) aj6).o(context2, o50Var, ar0Var, eVar, null);
        return f0Var;
    }
}
