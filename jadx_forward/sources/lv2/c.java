package lv2;

/* loaded from: classes10.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f403034d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f403035e;

    /* renamed from: f, reason: collision with root package name */
    public int f403036f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bw5.ic0 f403037g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f403038h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ dm.pd f403039i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(bw5.ic0 ic0Var, java.lang.ref.WeakReference weakReference, dm.pd pdVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f403037g = ic0Var;
        this.f403038h = weakReference;
        this.f403039i = pdVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new lv2.c(this.f403037g, this.f403038h, this.f403039i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((lv2.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        java.lang.Object c17;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        bw5.v70 d17;
        bw5.v70 d18;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f403036f;
        jz5.f0 f0Var = jz5.f0.f384359a;
        java.lang.ref.WeakReference weakReference = this.f403038h;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            bw5.ic0 ic0Var = this.f403037g;
            str = ic0Var.m12143x6e095e9(1) ? ic0Var.f110057e : "";
            if (str != null) {
                if (!(str.length() == 0)) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 e17 = kv2.h.f394195a.e(weakReference);
                    qk.j8 j8Var = (qk.j8) i95.n0.c(qk.j8.class);
                    this.f403034d = str;
                    this.f403035e = e17;
                    this.f403036f = 1;
                    rk4.l4 l4Var = (rk4.l4) j8Var;
                    l4Var.getClass();
                    c17 = p3325xe03a0797.p3326xc267989b.a4.c(5000L, new rk4.k4(l4Var, str, str, null), this);
                    if (c17 == aVar) {
                        return aVar;
                    }
                    u3Var = e17;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingMentionTingItemRouteHandler", "listenId is empty");
            kv2.h.f394195a.f(weakReference, com.p314xaae8f345.mm.R.C30867xcad56011.jyt);
            return f0Var;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        u3Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) this.f403035e;
        str = (java.lang.String) this.f403034d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        c17 = obj;
        bw5.lp0 lp0Var = (bw5.lp0) c17;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleJumpTingItemPage, listenId ");
        sb6.append((lp0Var == null || (d18 = lp0Var.d()) == null) ? null : d18.m13170xcc16feb8());
        sb6.append(", title:");
        sb6.append((lp0Var == null || (d17 = lp0Var.d()) == null) ? null : d17.m13171x7531c8a2());
        sb6.append(", commentId:");
        dm.pd pdVar = this.f403039i;
        sb6.append(pdVar.f66076x418206d5);
        sb6.append(", mentionSubtype:");
        sb6.append(pdVar.f66105xcd878615);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMentionTingItemRouteHandler", sb6.toString());
        if (lp0Var == null) {
            kv2.h.f394195a.f(weakReference, com.p314xaae8f345.mm.R.C30867xcad56011.lg7);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingMentionTingItemRouteHandler", "tingItem is null");
            return f0Var;
        }
        bw5.v70 d19 = lp0Var.d();
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d19 != null ? d19.m13170xcc16feb8() : null, str)) {
            kv2.h.f394195a.f(weakReference, com.p314xaae8f345.mm.R.C30867xcad56011.lg7);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("listenId not equal, listenId:");
            sb7.append(str);
            sb7.append(", tingItemId:");
            bw5.v70 d27 = lp0Var.d();
            sb7.append(d27 != null ? d27.m13170xcc16feb8() : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingMentionTingItemRouteHandler", sb7.toString());
            return f0Var;
        }
        il4.e eVar = new il4.e(null, 0, 0, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554431, null);
        kv2.h hVar = kv2.h.f394195a;
        int i18 = pdVar.f66105xcd878615;
        if ((i18 > 2000 && i18 < 2999) || i18 == 1002 || i18 == 1004) {
            eVar.f373651o = java.lang.String.valueOf(pdVar.f66076x418206d5);
        }
        android.content.Context context = (android.app.Activity) weakReference.get();
        bw5.ar0 ar0Var = bw5.ar0.TingScene_FinderMsgList;
        eVar.f373639c = 1609;
        o40.e eVar2 = (o40.e) i95.n0.c(o40.e.class);
        if (il4.l.g(lp0Var.d().f115722e)) {
            eVar2.getClass();
            bw5.x40 x40Var = new bw5.x40();
            x40Var.f116489f = lp0Var.d();
            x40Var.f116492i[3] = true;
            if (context == null) {
                context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
            ((wy2.g) eVar2).Bi(context, x40Var.mo14344x5f01b1f6(), kz5.c1.l(new jz5.l("needLoadMore", java.lang.Boolean.FALSE), new jz5.l("refCommentId", new java.lang.Long(pdVar.f66076x418206d5))));
        } else {
            qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
            if (context == null) {
                context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            }
            android.content.Context context2 = context;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context2);
            qk.f9.b(aj6, context2, true, lp0Var, eVar, null, null, ar0Var, null, 176, null);
        }
        return f0Var;
    }
}
