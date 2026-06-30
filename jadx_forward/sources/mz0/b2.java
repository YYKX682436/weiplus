package mz0;

/* loaded from: classes5.dex */
public abstract class b2 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements dz0.k {
    public final jz5.g A;
    public p3325xe03a0797.p3326xc267989b.r2 B;
    public p3325xe03a0797.p3326xc267989b.r2 C;
    public final jz5.g D;
    public final jz5.g E;
    public final yz5.a F;
    public final jz5.g G;
    public final jz5.g H;

    /* renamed from: d, reason: collision with root package name */
    public boolean f414416d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f414417e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f414418f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f414419g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f414420h;

    /* renamed from: i, reason: collision with root package name */
    public final n0.v2 f414421i;

    /* renamed from: m, reason: collision with root package name */
    public ty0.b1 f414422m;

    /* renamed from: n, reason: collision with root package name */
    public kz0.a f414423n;

    /* renamed from: o, reason: collision with root package name */
    public final n0.v2 f414424o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f414425p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f414426q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f414427r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f414428s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f414429t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f414430u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f414431v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f414432w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f414433x;

    /* renamed from: y, reason: collision with root package name */
    public final n0.v2 f414434y;

    /* renamed from: z, reason: collision with root package name */
    public final n0.v2 f414435z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f414417e = new java.util.ArrayList();
        jz5.i iVar = jz5.i.f384364f;
        this.f414418f = jz5.h.a(iVar, new mz0.r(this));
        this.f414419g = new java.util.ArrayList();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(bm5.o1.f104252a.g(bm5.h0.RepairerConfig_Maas_SnsSpringStrategy_Int, -1));
        valueOf = valueOf.intValue() != -1 ? valueOf : null;
        this.f414420h = !((valueOf != null ? valueOf.intValue() : ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SnsVideoTemplateMiaojianRecommendEnabled", 1)) == 1);
        this.f414421i = n0.s4.c(null, null, 2, null);
        this.f414424o = n0.s4.c(java.lang.Boolean.FALSE, null, 2, null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
        sb6.append(lp0.b.h0("TemplateExport").o());
        sb6.append('/');
        this.f414425p = sb6.toString();
        this.f414426q = jz5.h.b(mz0.s.f414571d);
        this.f414427r = jz5.h.a(iVar, new mz0.g0(this));
        this.f414428s = jz5.h.a(iVar, new mz0.a2(this));
        this.f414429t = jz5.h.a(iVar, new mz0.j0(this));
        this.f414430u = jz5.h.a(iVar, new mz0.p(this));
        this.f414431v = jz5.h.a(iVar, new mz0.v0(this));
        this.f414432w = jz5.h.a(iVar, new mz0.q0(this));
        this.f414433x = jz5.h.a(iVar, new mz0.x1(this));
        this.f414434y = n0.s4.c(0, null, 2, null);
        this.f414435z = n0.s4.c(java.lang.Double.valueOf(0.0d), null, 2, null);
        this.A = jz5.h.a(iVar, mz0.t1.f414595d);
        this.D = jz5.h.a(iVar, new mz0.v1(this));
        this.E = jz5.h.a(iVar, new mz0.q(this));
        this.F = new mz0.w0(this);
        this.G = jz5.h.a(iVar, new mz0.o0(this));
        this.H = jz5.h.a(iVar, new mz0.h(this));
    }

    public static final int O6(mz0.b2 b2Var) {
        return ((java.lang.Number) ((n0.q4) b2Var.f414434y).mo128745x754a37bb()).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P6(mz0.b2 r7, com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5 r8, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            r7.getClass()
            boolean r0 = r9 instanceof mz0.a1
            if (r0 == 0) goto L16
            r0 = r9
            mz0.a1 r0 = (mz0.a1) r0
            int r1 = r0.f414409g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f414409g = r1
            goto L1b
        L16:
            mz0.a1 r0 = new mz0.a1
            r0.<init>(r7, r9)
        L1b:
            java.lang.Object r9 = r0.f414407e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f414409g
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r7 = r0.f414406d
            dz0.l r7 = (dz0.l) r7
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L6d
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            android.app.Activity r9 = r7.m80379x76847179()
            java.lang.String r2 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r2)
            pf5.z r2 = pf5.z.f435481a
            boolean r5 = r9 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112
            if (r5 == 0) goto L9e
            androidx.appcompat.app.AppCompatActivity r9 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) r9
            pf5.v r9 = r2.a(r9)
            java.lang.Class<dz0.l> r2 = dz0.l.class
            pf5.c r9 = r9.c(r2)
            dz0.l r9 = (dz0.l) r9
            mz0.e1 r2 = new mz0.e1
            r2.<init>(r8, r7, r9, r3)
            r0.f414406d = r9
            r0.f414409g = r4
            r7 = 300000(0x493e0, double:1.482197E-318)
            java.lang.Object r7 = p3325xe03a0797.p3326xc267989b.a4.c(r7, r2, r0)
            if (r7 != r1) goto L6a
            goto L9d
        L6a:
            r6 = r9
            r9 = r7
            r7 = r6
        L6d:
            r1 = r9
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 != 0) goto L7d
            r8 = 2131771685(0x7f104125, float:1.9174708E38)
            com.tencent.mm.mj_template.maas.uic.MaasSdkUIC r7 = (com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b) r7
            r7.r7(r8)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L9d
        L7d:
            com.tencent.mm.autogen.mmdata.rpt.MaasAITemplateMakeReportStruct r7 = oy0.a.f431366a
            if (r7 != 0) goto L82
            goto L84
        L82:
            r7.f140502d = r4
        L84:
            if (r7 != 0) goto L87
            goto L94
        L87:
            r8 = 0
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r9 = "failReason"
            java.lang.String r8 = r7.b(r9, r8, r4)
            r7.f140510l = r8
        L94:
            com.tencent.mm.autogen.mmdata.rpt.MaasAITemplateMakeReportStruct r7 = oy0.a.f431366a
            if (r7 == 0) goto L9b
            r7.k()
        L9b:
            oy0.a.f431366a = r3
        L9d:
            return r1
        L9e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Check failed."
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mz0.b2.P6(mz0.b2, com.tencent.mm.mj_template.sns.compose.widget.m5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void Q6(mz0.b2 b2Var) {
        b2Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Template.TemplateControlUIC", "preloadMusic: ");
        android.app.Activity context = b2Var.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        dz0.x xVar = ((com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b) ((dz0.l) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(dz0.l.class))).f151322m;
        java.util.List list = (java.util.List) xVar.f326585c.mo3195x754a37bb();
        if (list == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Template.TemplateControlUIC", "preloadMusic: music info list is null");
            return;
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 c4116xf4b2c356 = (com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) xVar.f326586d.mo3195x754a37bb();
        java.lang.String m33856x92013dca = c4116xf4b2c356 != null ? c4116xf4b2c356.m33856x92013dca() : null;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) it.next()).m33856x92013dca());
        }
        int indexOf = arrayList.indexOf(m33856x92013dca);
        az0.i5.f97090a.A(kz5.p0.f395529d, arrayList.subList(java.lang.Math.max(0, indexOf), java.lang.Math.min(indexOf + 3, arrayList.size())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0293  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void R6(mz0.b2 r26, dw3.o0 r27) {
        /*
            Method dump skipped, instructions count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mz0.b2.R6(mz0.b2, dw3.o0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0225 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object V6(mz0.b2 r19, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r20) {
        /*
            Method dump skipped, instructions count: 1006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mz0.b2.V6(mz0.b2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // dz0.k
    public void A(float f17) {
        py0.f0 f76 = f7();
        java.lang.String string = m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gvr, java.lang.Integer.valueOf(a06.d.b(f17 * 100)));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        f76.c(string);
    }

    public final void A7() {
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83;
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        az0.n7 n7Var = ((com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b) ((dz0.l) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(dz0.l.class))).f151316d;
        java.lang.Double m33413xcaf1328e = (n7Var == null || (c4079x793f83 = n7Var.f97275a) == null) ? null : c4079x793f83.m33413xcaf1328e();
        double doubleValue = m33413xcaf1328e == null ? 1.0d : m33413xcaf1328e.doubleValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Template.TemplateControlUIC", "refreshScreenRatio: " + doubleValue);
        ((n0.q4) this.f414435z).mo148714x53d8522f(java.lang.Double.valueOf(doubleValue));
    }

    public final void B7(int i17) {
        if (this.f414416d) {
            return;
        }
        bz0.f fVar = bz0.f.f118268a;
        bz0.f.f118271d = p3325xe03a0797.p3326xc267989b.l.d(bz0.f.f118269b, null, null, new bz0.e(bz0.f.f118271d, i17, null), 3, null);
        this.f414416d = true;
    }

    public void C7(java.util.List defaultTemplateList, r45.rz6 rz6Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defaultTemplateList, "defaultTemplateList");
    }

    public void D7(java.util.ArrayList mediaList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaList, "mediaList");
    }

    public void E7(java.lang.String curSelectedItemId, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curSelectedItemId, "curSelectedItemId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
    }

    public void F7(java.lang.String curSelectedItemId, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curSelectedItemId, "curSelectedItemId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
    }

    public void G7(java.lang.String curSelectedItemId, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curSelectedItemId, "curSelectedItemId");
    }

    @Override // dz0.k
    public java.lang.Object H6(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return V6(this, interfaceC29045xdcb5ca57);
    }

    public void H7(boolean z17) {
    }

    public final void I7(java.lang.String content, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        py0.f0 f76 = f7();
        f76.c(content);
        f76.e(z17);
    }

    @Override // dz0.k
    public void Q1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Template.TemplateControlUIC", "onPreview");
        f7().dismiss();
        android.view.TextureView textureView = (android.view.TextureView) ((n0.q4) this.f414421i).mo128745x754a37bb();
        if (textureView != null) {
            textureView.setVisibility(0);
        }
        ((n0.q4) this.f414424o).mo148714x53d8522f(java.lang.Boolean.TRUE);
        A7();
    }

    @Override // dz0.k
    public java.lang.Object R1(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        mz0.a a76;
        java.lang.Object obj;
        boolean p76 = p7();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (p76 && (a76 = a7()) != null) {
            java.util.Iterator it = o7().b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5) obj).f151610a, a76.f414404a)) {
                    break;
                }
            }
            com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5 m5Var = (com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5) obj;
            if (m5Var != null && (m5Var instanceof com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.k5)) {
                oy0.d.f431370a.a((com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.k5) m5Var, m80379x76847179(), new mz0.d(this, m5Var));
            }
        }
        return f0Var;
    }

    public abstract java.lang.Object S6(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57);

    public abstract java.lang.Object T6(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57);

    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U6(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof mz0.e
            if (r0 == 0) goto L13
            r0 = r8
            mz0.e r0 = (mz0.e) r0
            int r1 = r0.f414467g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f414467g = r1
            goto L18
        L13:
            mz0.e r0 = new mz0.e
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f414465e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f414467g
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r0.f414464d
            mz0.b2 r0 = (mz0.b2) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L67
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            java.lang.Object r2 = r0.f414464d
            mz0.b2 r2 = (mz0.b2) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L4e
        L3f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            r0.f414464d = r7
            r0.f414467g = r5
            java.lang.Object r8 = r7.T6(r0)
            if (r8 != r1) goto L4d
            return r1
        L4d:
            r2 = r7
        L4e:
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L6f
            kotlinx.coroutines.p0 r5 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r5 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            mz0.f r6 = new mz0.f
            r6.<init>(r2, r8, r3)
            r0.f414464d = r2
            r0.f414467g = r4
            java.lang.Object r8 = p3325xe03a0797.p3326xc267989b.l.g(r5, r6, r0)
            if (r8 != r1) goto L66
            return r1
        L66:
            r0 = r2
        L67:
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L6d
            r2 = r0
            goto L6f
        L6d:
            r3 = r8
            goto L7f
        L6f:
            com.tencent.mm.mj_template.sns.compose.widget.m7 r8 = r2.o7()
            kz5.p0 r0 = kz5.p0.f395529d
            r8.c(r0)
            java.lang.String r8 = "MicroMsg.Template.TemplateControlUIC"
            java.lang.String r0 = "get template list info error"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r8, r0)
        L7f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: mz0.b2.U6(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public abstract dz0.e W6();

    public abstract dz0.h X6();

    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2008xb118f8f1.C17067x215f5d9e Y6() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2008xb118f8f1.C17067x215f5d9e(m80379x76847179(), null);
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a Z6() {
        return null;
    }

    public abstract mz0.a a7();

    public abstract java.lang.Object b7(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57);

    public abstract mz0.b c7();

    public abstract java.lang.String d7();

    public abstract int e7();

    public final py0.f0 f7() {
        return (py0.f0) this.f414427r.mo141623x754a37bb();
    }

    public abstract com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.c7 g7();

    public abstract ty0.c h7();

    public abstract com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.t0 i7();

    public yz5.q k7() {
        return null;
    }

    public final dz0.d l7() {
        return (dz0.d) this.D.mo141623x754a37bb();
    }

    public abstract boolean m7();

    public final az0.d n7() {
        return (az0.d) this.f414433x.mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m7 o7() {
        return (com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m7) this.f414428s.mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBeforeFinish */
    public void mo2275x62f76871(android.content.Intent intent) {
        super.mo2275x62f76871(intent);
        B7(1);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        f7().e(false);
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.p314xaae8f345.mm.p935xe99f85f3.C11098x3efa6197) this.f414418f.mo141623x754a37bb()).m47820xe9f5bdb7(u0.j.c(-712169128, true, new mz0.f0(this, (dz0.l) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(dz0.l.class))));
        if (this.f414420h) {
            y7();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateBefore */
    public void mo2277xb2f1ab1a(android.os.Bundle bundle) {
        java.util.ArrayList arrayList;
        java.util.ArrayList parcelableArrayListExtra = m158359x1e885992().getParcelableArrayListExtra("Template_Media_List");
        java.util.ArrayList mediaList = this.f414417e;
        if (parcelableArrayListExtra != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Template.TemplateControlUIC", "media size :" + parcelableArrayListExtra.size());
            int i17 = 0;
            for (java.lang.Object obj : parcelableArrayListExtra) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Template.TemplateControlUIC", "index:" + i17 + " path:" + ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) obj).f219963e);
                i17 = i18;
            }
            mediaList.addAll(parcelableArrayListExtra);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showSpringStrategy:");
        boolean z17 = this.f414420h;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Template.TemplateControlUIC", sb6.toString());
        super.mo2277xb2f1ab1a(bundle);
        pf5.u uVar = pf5.u.f435469a;
        dz0.l lVar = (dz0.l) uVar.b(m80379x76847179()).c(dz0.l.class);
        dz0.l lVar2 = (dz0.l) uVar.b(m80379x76847179()).c(dz0.l.class);
        D7(mediaList);
        com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b c11015x5b190a3b = (com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b) lVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaList, "mediaList");
        c11015x5b190a3b.f151331v = mediaList;
        c11015x5b190a3b.f151325p = false;
        dz0.e provider = W6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(provider, "provider");
        c11015x5b190a3b.f151332w = provider;
        c11015x5b190a3b.f151318f = this;
        dz0.h params = X6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        c11015x5b190a3b.f151317e = params;
        boolean z18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(params.f326388a, "MomentsTemplateRecommendv2") && bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2548x18d5ed17.C20464x5023168e()) == 1;
        boolean z19 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c11015x5b190a3b.f151317e.f326388a, "TemplateRecommendv2") && bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2548x18d5ed17.C20444x145b17f4()) == 1;
        if (z18 || z19) {
            boolean z27 = params.f326389b;
            boolean z28 = params.f326390c;
            int i19 = params.f326391d;
            boolean z29 = params.f326392e;
            int i27 = params.f326394g;
            boolean z37 = params.f326395h;
            java.util.List list = params.f326396i;
            arrayList = mediaList;
            boolean z38 = params.f326397j;
            java.util.List defaultTemplateIDs = params.f326393f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defaultTemplateIDs, "defaultTemplateIDs");
            c11015x5b190a3b.f151317e = new dz0.h("alltemplaterecommend", z27, z28, i19, z29, defaultTemplateIDs, i27, z37, list, z38);
        } else {
            arrayList = mediaList;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Template.TemplateControlUIC", "set homepage template from wechat backend");
            ((com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b) lVar).f151324o = false;
            p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new mz0.x0(this, null), 3, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Template.TemplateControlUIC", "set homepage template from maas");
            ((com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b) lVar).f151324o = true;
            android.content.ComponentCallbacks2 m80379x76847179 = m80379x76847179();
            p012xc85e97e9.p093xedfae76a.y yVar = m80379x76847179 instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) m80379x76847179 : null;
            if (yVar != null) {
                ((com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b) ((dz0.l) uVar.b(m80379x76847179()).c(dz0.l.class))).f151320h.mo7806x9d92d11c(yVar, new mz0.y0(this));
            }
        }
        vt3.l lVar3 = vt3.l.f521538a;
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it.next()).f219963e);
        }
        lVar3.b(arrayList3, 5, false);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        ((n0.q4) this.f414421i).mo148714x53d8522f(null);
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.j5 j5Var = com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.k5.f151558m;
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.k5.f151560o.clear();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2008xb118f8f1.C17067x215f5d9e) ((zy0.e) ((dz0.f) this.G.mo141623x754a37bb())).f558854j.mo141623x754a37bb()).h();
        B7(5);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onWindowFocusChanged */
    public void mo14961xa4ec7b0b(boolean z17) {
        super.mo14961xa4ec7b0b(z17);
        if (z17) {
            int c17 = com.p314xaae8f345.mm.ui.bl.c(m158354x19263085());
            ((n0.q4) this.f414434y).mo148714x53d8522f(java.lang.Integer.valueOf(c17));
        }
    }

    public abstract boolean p7();

    public abstract boolean q7();

    public void r7(java.lang.Throwable th6) {
        f7().dismiss();
    }

    public void s7(java.lang.Throwable th6, java.lang.String musicId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicId, "musicId");
    }

    @Override // dz0.k
    public void t(java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Template.TemplateControlUIC", "onSdkError:".concat(msg));
        f7().dismiss();
        db5.t7.g(m80379x76847179(), m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572308aq3));
        m80379x76847179().finish();
    }

    public void t7(dw3.o0 launchType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(launchType, "launchType");
    }

    public void u7(java.lang.Throwable th6, java.lang.String templateId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
    }

    public void v7(java.lang.String templateId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
    }

    public void w7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Template.TemplateControlUIC", "performExport");
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new mz0.j1(this, null), 3, null);
    }

    public abstract void x7(az0.b0 b0Var);

    @Override // dz0.k
    public void y1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Template.TemplateControlUIC", "onMovieSessionCreated: ");
        android.view.TextureView textureView = new android.view.TextureView(m158354x19263085());
        n0.v2 v2Var = this.f414421i;
        ((n0.q4) v2Var).mo148714x53d8522f(textureView);
        android.view.TextureView textureView2 = (android.view.TextureView) ((n0.q4) v2Var).mo128745x754a37bb();
        if (textureView2 != null) {
            textureView2.setVisibility(4);
        }
        android.view.TextureView textureView3 = (android.view.TextureView) ((n0.q4) v2Var).mo128745x754a37bb();
        if (textureView3 == null) {
            return;
        }
        textureView3.setSurfaceTextureListener(new mz0.z0(this));
    }

    public abstract void y7();

    @Override // dz0.k
    public java.lang.Object z2(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (K0) {
            return f0Var;
        }
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        java.lang.Object a17 = dz0.g.a(((com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b) ((dz0.l) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(dz0.l.class))).D, str, null, interfaceC29045xdcb5ca57, 2, null);
        return a17 == pz5.a.f440719d ? a17 : f0Var;
    }

    public final void z7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Template.TemplateControlUIC", "preloadTemplate: ");
        java.util.List b17 = o7().b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = b17.iterator();
        while (true) {
            boolean z17 = false;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5 m5Var = (com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5) next;
            if (m5Var.f151612c && !r26.n0.D(m5Var.f151610a, "@@", false, 2, null)) {
                z17 = true;
            }
            if (z17) {
                arrayList.add(next);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            arrayList2.add(((com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5) it6.next()).f151610a);
        }
        int indexOf = arrayList2.indexOf(o7().a());
        if (indexOf > 0) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            int i17 = indexOf - 1;
            int i18 = indexOf + 2;
            int size = arrayList2.size();
            if (i18 <= size) {
                size = i18;
            }
            arrayList3.addAll(arrayList2.subList(i17, size));
            if (i17 > 0) {
                int size2 = arrayList2.size();
                if (i17 > size2) {
                    i17 = size2;
                }
                arrayList3.addAll(arrayList2.subList(0, i17));
            }
            if (i18 < arrayList2.size()) {
                arrayList3.addAll(arrayList2.subList(i18, arrayList2.size()));
            }
            arrayList2 = arrayList3;
        }
        az0.i5.f97090a.A(arrayList2, kz5.p0.f395529d);
    }
}
