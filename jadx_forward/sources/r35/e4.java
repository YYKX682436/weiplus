package r35;

/* loaded from: classes11.dex */
public class e4 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f450617d;

    /* renamed from: f, reason: collision with root package name */
    public ns.h f450619f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.Context f450620g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f450621h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a f450622i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f450623m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f450624n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.LinkedList f450625o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.LinkedList f450626p;

    /* renamed from: r, reason: collision with root package name */
    public java.util.Map f450628r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f450629s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f450630t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f450631u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f450632v;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3 f450635y;

    /* renamed from: z, reason: collision with root package name */
    public r45.dz3 f450636z;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f450618e = null;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f450627q = "";

    /* renamed from: w, reason: collision with root package name */
    public boolean f450633w = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f450634x = true;
    public boolean A = false;

    public e4(android.content.Context context, ns.h hVar) {
        this.f450620g = context;
        this.f450619f = hVar;
    }

    public final void a(int i17, int i18, java.lang.String str) {
        if (i17 == 4 && i18 == -22) {
            android.content.Context context = this.f450620g;
            dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571386dl), 1).show();
        } else if (i17 == 4 && i18 == -24 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            dp.a.m125854x26a183b(this.f450620g, str, 1).show();
        } else {
            android.content.Context context2 = this.f450620g;
            dp.a.m125854x26a183b(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571385dk), 1).show();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendVerifyRequest", "dealFail.");
    }

    public final void b() {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3 m3Var = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3(2, this.f450623m, this.f450625o, this.f450627q, "", this.f450628r, this.f450631u, this.f450624n);
        this.f450635y = m3Var;
        m3Var.S(this.f450633w);
        this.f450635y.U(this.f450629s, this.f450630t);
        this.f450635y.R(this.f450636z);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f450635y.Q(currentTimeMillis);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendVerifyRequest", "SendVerifyRequest doScene: id=%d", java.lang.Long.valueOf(currentTimeMillis));
        gm0.j1.n().f354821b.g(this.f450635y);
    }

    public final void c() {
        java.util.LinkedList linkedList = this.f450626p;
        if (linkedList == null || linkedList.isEmpty()) {
            this.A = true;
            gm0.j1.n().f354821b.a(881, this);
            gm0.j1.n().f354821b.g(new l41.x((java.lang.String) this.f450623m.getFirst(), "", ""));
        } else {
            l41.f0 f0Var = new l41.f0((java.lang.String) this.f450623m.getFirst(), this.f450627q, (java.lang.String) this.f450626p.getFirst(), 0);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            f0Var.H(currentTimeMillis, null, null, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendVerifyRequest", "SendVerifyRequest doVerifyOpenIm clientMsgId=%d openImCustomInfo=%s openImAppId=%s descWordingId=%s", java.lang.Long.valueOf(currentTimeMillis), null, null, null);
            gm0.j1.n().f354821b.g(f0Var);
        }
    }

    public final void d() {
        gm0.j1.n().f354821b.a(30, this);
        gm0.j1.n().f354821b.a(243, this);
    }

    public final void e() {
        gm0.j1.n().f354821b.q(30, this);
        gm0.j1.n().f354821b.q(243, this);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f450618e;
        if (j0Var != null) {
            j0Var.dismiss();
            this.f450618e = null;
        }
    }

    public void f(java.util.LinkedList linkedList, java.util.LinkedList linkedList2, java.util.LinkedList linkedList3) {
        iz5.a.g(null, linkedList.size() >= 1);
        iz5.a.g(null, linkedList2.size() >= 1);
        d();
        this.f450623m = linkedList;
        this.f450625o = linkedList2;
        this.f450626p = linkedList3;
        this.f450621h = android.view.View.inflate(this.f450620g, com.p314xaae8f345.mm.R.C30864xbddafb2a.ckf, null);
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(this.f450632v == null);
        java.lang.String str = this.f450632v;
        objArr[1] = java.lang.Integer.valueOf(str != null ? str.length() : 0);
        objArr[2] = this.f450632v;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendVerifyRequest", "verifyTip is null: %b, length : %d, value : [%s]", objArr);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f450632v)) {
            ((android.widget.TextView) this.f450621h.findViewById(com.p314xaae8f345.mm.R.id.mmq)).setText(this.f450632v);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a) this.f450621h.findViewById(com.p314xaae8f345.mm.R.id.mmp);
        this.f450622i = c21503x6e5a020a;
        c21503x6e5a020a.m79040x765074af((java.lang.String) null);
        r35.w3 w3Var = new r35.w3(this);
        r35.x3 x3Var = new r35.x3(this);
        android.content.Context context = this.f450620g;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 x17 = db5.e1.x(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iip), null, this.f450621h, w3Var, x3Var);
        this.f450618e = x17;
        if (x17 == null) {
            e();
        }
        this.f450622i.post(new r35.y3(this));
    }

    public void g(java.util.List list, java.util.List list2) {
        this.f450634x = false;
        d();
        this.f450623m = new java.util.LinkedList(list);
        this.f450625o = new java.util.LinkedList(list2);
        if (list.size() == 1 && com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4((java.lang.String) this.f450623m.getFirst())) {
            c();
        } else {
            b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x01fa, code lost:
    
        if (((en.a) ((en.k) i95.n0.c(en.k.class))).Zi(r17.f450620g, r18, r19, r20) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01fc, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x024d, code lost:
    
        if (((en.a) ((en.k) i95.n0.c(en.k.class))).Zi(r17.f450620g, r18, r19, r20) != false) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r18, int r19, java.lang.String r20, com.p314xaae8f345.mm.p944x882e457a.m1 r21) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r35.e4.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
