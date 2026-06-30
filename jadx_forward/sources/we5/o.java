package we5;

/* loaded from: classes9.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f526895d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f526896e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ we5.v f526897f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f526898g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f526899h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f526900i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ rd5.d f526901m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f526902n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f526903o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f526904p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, we5.v vVar, boolean z17, boolean z18, boolean z19, rd5.d dVar2, android.os.Bundle bundle, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2) {
        super(1);
        this.f526895d = dVar;
        this.f526896e = f9Var;
        this.f526897f = vVar;
        this.f526898g = z17;
        this.f526899h = z18;
        this.f526900i = z19;
        this.f526901m = dVar2;
        this.f526902n = bundle;
        this.f526903o = h0Var;
        this.f526904p = h0Var2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        int i17;
        android.widget.TextView autoTranslationText;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao it = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.widget.LinearLayout linearLayout = it.f284927q;
        yb5.d ui6 = this.f526895d;
        if (linearLayout != null && (autoTranslationText = it.f284928r) != null) {
            we5.e eVar = we5.v.f526926x;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(autoTranslationText, "autoTranslationText");
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f526896e;
            android.app.Activity g17 = ui6.g();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getContext(...)");
            eVar.a(ui6, linearLayout, autoTranslationText, f9Var, g17);
        }
        we5.v vVar = this.f526897f;
        vVar.getClass();
        boolean z17 = this.f526898g;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = this.f526896e;
        if (z17 || this.f526899h || this.f526900i) {
            it.f284912b.setTag(com.p314xaae8f345.mm.R.id.nwp, java.lang.Boolean.FALSE);
            it.f284912b.setOnTouchListener(it.f284920j);
            it.f284912b.setOnLongClickListener(vVar.u(vVar.f285588s));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = it.f284912b;
            if (vVar.f285589t == null) {
                vVar.f285589t = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.zn(vVar.f285588s);
            }
            c22624x85d69039.setOnClickListener(vVar.f285589t);
        } else {
            int i18 = c01.ia.i(f9Var2);
            if (i18 <= 0 || i18 >= wl5.y.o(it.f284912b).length()) {
                i18 = 0;
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q0 u17 = vVar.u(vVar.f285588s);
            wl5.v x17 = vVar.x(u17);
            wl5.x xVar = it.f284919i;
            if (xVar != null) {
                xVar.c();
            }
            int[] iArr = new int[2];
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690392 = it.f284912b;
            if (c22624x85d690392 != null) {
                c22624x85d690392.getLocationInWindow(iArr);
                int i19 = iArr[0];
                if (i19 == 0) {
                    android.graphics.Rect rect = new android.graphics.Rect();
                    it.f284912b.getGlobalVisibleRect(rect);
                    i19 = rect.left;
                }
                i17 = i19;
            } else {
                i17 = 0;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690393 = it.f284912b;
            rl5.r rVar = it.f284918h;
            if (vVar.f285589t == null) {
                vVar.f285589t = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.zn(vVar.f285588s);
            }
            wl5.o oVar = new wl5.o(c22624x85d690393, rVar, x17, vVar.f285589t, it.f284920j);
            oVar.f528656g = com.p314xaae8f345.mm.R.C30859x5a72f63.a3y;
            oVar.f528657h = 18;
            oVar.f528655f = com.p314xaae8f345.mm.R.C30859x5a72f63.f560393j6;
            if (i17 != 0) {
                oVar.a(i17 + com.p314xaae8f345.mm.ui.zk.e(it.f284912b.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
            }
            wl5.x xVar2 = new wl5.x(oVar);
            it.f284919i = xVar2;
            it.f284921k = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wn(xVar2);
            xVar2.f528692d = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.hn(vVar);
            java.util.ArrayList arrayList = it.f284922l;
            if (arrayList.size() > 0) {
                java.util.ArrayList arrayList2 = it.f284919i.f528705q;
                arrayList2.clear();
                arrayList2.addAll(arrayList);
            }
            u17.f286826h = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.in(vVar, it);
            wl5.x xVar3 = it.f284919i;
            xVar3.C = i18;
            xVar3.Y = it.f284921k;
        }
        it.f284912b.m84180x74caf26a(vVar);
        it.f284912b.m81372xd77b7e83(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.jn(vVar, it));
        android.os.Bundle bundle = this.f526902n;
        java.lang.String str2 = (java.lang.String) this.f526903o.f391656d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io ioVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io) this.f526904p.f391656d;
        rd5.d dVar = this.f526901m;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var3 = dVar.f475787d.f526833b;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && ioVar == com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io.NoTransform) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5 c21917xeb4fc2b5 = it.f284915e;
            if (c21917xeb4fc2b5 != null) {
                c21917xeb4fc2b5.setVisibility(8);
            }
            str = null;
        } else {
            if (it.f284915e == null) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5 c21917xeb4fc2b52 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5) it.f284914d.inflate();
                it.f284915e = c21917xeb4fc2b52;
                c21917xeb4fc2b52.c();
            }
            str = null;
            it.f284915e.e(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).rj(it.f284912b.getContext(), str2, (int) it.f284912b.m84164x40077844(), 1, bundle, vVar.d0(f9Var3)), ioVar, f9Var3.m124847x74d37ac6());
            it.f284915e.m80030x6e632093(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var3.U0()) ? vVar.f285588s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jxn) : f9Var3.U0());
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q0 u18 = vVar.u(vVar.f285588s);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go goVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go(dVar, vVar.f285588s.D(), it, null);
                goVar.R = 2;
                it.f284915e.m80028xc2a54588().setTag(goVar);
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5 c21917xeb4fc2b53 = it.f284915e;
                if (vVar.f285589t == null) {
                    vVar.f285589t = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.zn(vVar.f285588s);
                }
                c21917xeb4fc2b53.setOnClickListener(vVar.f285589t);
                it.f284915e.m80031x74caf26a(vVar);
                it.f284915e.setOnTouchListener(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) vVar.f285588s.f542241c.a(sb5.z.class))).B1);
                it.f284915e.setOnLongClickListener(vVar.u(vVar.f285588s));
                it.f284915e.setVisibility(0);
                if (it.f284923m == null) {
                    yb5.d dVar2 = vVar.f285588s;
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bo.e(dVar2, it, f9Var3, u18, vVar.x(vVar.u(dVar2)));
                }
            }
        }
        java.lang.String j17 = f9Var2 != null ? f9Var2.j() : str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        java.lang.String x18 = ui6.x();
        if (f9Var2 == null || j17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemTextFrom", "requestAutoTranslate talker is null or msg is null!");
        } else {
            go.d dVar3 = go.d.f355229a;
            if (dVar3.c(x18) == 2 && f9Var2.A0() == 0 && !f9Var2.i2() && com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.l2.c(j17)) {
                if (!go.d.f355231c.containsKey(java.lang.Long.valueOf(f9Var2.m124847x74d37ac6()))) {
                    dVar3.f(f9Var2);
                }
            }
        }
        java.lang.String str3 = f9Var2.G;
        if ((str3 == null ? "" : str3).contains("msg_wording")) {
            android.view.ViewStub viewStub = it.f284931u;
            if (viewStub != null) {
                if (it.f284932v == null) {
                    android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) viewStub.inflate();
                    it.f284932v = linearLayout2;
                    it.f284933w = (android.widget.TextView) linearLayout2.findViewById(com.p314xaae8f345.mm.R.id.sq6);
                }
                if (it.f284933w == null) {
                    android.widget.LinearLayout linearLayout3 = it.f284932v;
                    if (linearLayout3 != null) {
                        linearLayout3.setVisibility(8);
                    }
                } else {
                    c01.ea w17 = c01.w9.w(str3);
                    if (w17 == null || !w17.f118698x || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w17.f118699y)) {
                        it.f284932v.setVisibility(8);
                    } else {
                        it.f284933w.setText(w17.f118699y);
                        it.f284932v.setVisibility(0);
                    }
                }
            }
        } else {
            android.widget.LinearLayout linearLayout4 = it.f284932v;
            if (linearLayout4 != null) {
                linearLayout4.setVisibility(8);
            }
        }
        return jz5.f0.f384359a;
    }
}
