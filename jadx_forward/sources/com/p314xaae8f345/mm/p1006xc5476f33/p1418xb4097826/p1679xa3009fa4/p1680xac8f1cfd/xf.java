package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes10.dex */
public final class xf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f217989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f217990e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f217991f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f217992g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg f217993h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f217994i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f217995m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf(boolean z17, boolean z18, boolean z19, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg ggVar, boolean z27, boolean z28, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f217990e = z17;
        this.f217991f = z18;
        this.f217992g = z19;
        this.f217993h = ggVar;
        this.f217994i = z27;
        this.f217995m = z28;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.xf(this.f217990e, this.f217991f, this.f217992g, this.f217993h, this.f217994i, this.f217995m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.xf) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        r45.qt2 qt2Var;
        r45.qt2 qt2Var2;
        r45.qt2 qt2Var3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f217989d;
        boolean z17 = this.f217990e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg ggVar = this.f217993h;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            kd2.o0 o0Var = kd2.p1.N;
            o0Var.a().f174665d.f174591s = z17;
            kd2.p1 a17 = o0Var.a();
            boolean z18 = this.f217991f;
            boolean z19 = this.f217992g;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.ea eaVar = ggVar.f216046o;
            boolean z27 = this.f217994i;
            this.f217989d = 1;
            obj = kd2.p1.y0(a17, z18, false, z19, eaVar, z27, this, 2, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        if (booleanValue) {
            ggVar.f216041g = true;
        }
        ggVar.f216042h = booleanValue;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addFloatBall: ret=");
        sb6.append(booleanValue);
        sb6.append(", needTriggerBack=");
        boolean z28 = this.f217995m;
        sb6.append(z28);
        sb6.append(", isPassive=");
        sb6.append(this.f217991f);
        sb6.append(", addFromSwipe=");
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, sb6.toString());
        if (z28 && booleanValue) {
            if (!ggVar.P6(true)) {
                android.app.Activity activity = ggVar.m80379x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                pf5.z zVar = pf5.z.f435481a;
                if (!(activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg.class)).f216047p) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg.f216037z = true;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "resumeFromClickFloatBallAndBack:true");
                }
                ggVar.f216047p = true;
                ggVar.m158354x19263085().onBackPressed();
            }
            kd2.o0 o0Var2 = kd2.p1.N;
            kd2.b0 E0 = o0Var2.a().E0();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = ggVar.m158354x19263085();
            E0.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6 b6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            cl0.g gVar = new cl0.g();
            java.lang.String str3 = o0Var2.a().D;
            java.lang.Object obj2 = "";
            if (str3 == null) {
                str3 = "";
            }
            gVar.h("float_frame_id", str3);
            kd2.q0 q0Var = o0Var2.a().C;
            gVar.h("feedid", (q0Var == null || (c14989xf862ae88 = q0Var.f388339g) == null) ? "" : pm0.v.u(c14989xf862ae88.getFeedId()));
            kd2.p1 p1Var = E0.f388242a;
            kd2.q0 q0Var2 = p1Var.f388320x;
            if (q0Var2 == null || (qt2Var3 = q0Var2.f388336d) == null || (str = qt2Var3.m75945x2fec8307(2)) == null) {
                str = "";
            }
            gVar.h("source_tabcontextid", str);
            kd2.q0 q0Var3 = p1Var.f388320x;
            if (q0Var3 == null || (qt2Var2 = q0Var3.f388336d) == null || (str2 = qt2Var2.m75945x2fec8307(1)) == null) {
                str2 = "";
            }
            gVar.h("source_contextid", str2);
            kd2.q0 q0Var4 = p1Var.f388320x;
            if (q0Var4 != null && (qt2Var = q0Var4.f388336d) != null) {
                obj2 = java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5));
            }
            gVar.h("source_commentscene", obj2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(b6Var, V6, "button_create_float_frame", 1, gVar, false, null, 48, null);
        }
        return jz5.f0.f384359a;
    }
}
