package cq1;

/* loaded from: classes8.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f302895d;

    /* renamed from: e, reason: collision with root package name */
    public int f302896e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.biz.p1284xc9e135a5.ActivityC12955x181c0197 f302897f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f302898g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.p314xaae8f345.mm.p1006xc5476f33.biz.p1284xc9e135a5.ActivityC12955x181c0197 activityC12955x181c0197, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f302897f = activityC12955x181c0197;
        this.f302898g = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new cq1.o(this.f302897f, this.f302898g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((cq1.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        dq1.b bVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f302896e;
        com.p314xaae8f345.mm.p1006xc5476f33.biz.p1284xc9e135a5.ActivityC12955x181c0197 activityC12955x181c0197 = this.f302897f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            activityC12955x181c0197.f175410h = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(activityC12955x181c0197.mo55332x76847179(), activityC12955x181c0197.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggd), true, 3, new cq1.n(activityC12955x181c0197));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC12955x181c0197.f175410h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u3Var);
            u3Var.show();
            dq1.b bVar2 = new dq1.b();
            if (gm0.j1.b().n()) {
                str = gm0.j1.b().j();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getUinString(...)");
            } else {
                str = "";
            }
            bVar2.f323878a = str;
            cq1.s sVar = activityC12955x181c0197.f175407e;
            this.f302895d = bVar2;
            this.f302896e = 1;
            sVar.getClass();
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            boolean n17 = gm0.j1.b().n();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("runCheckCgi, isLogin: ");
            sb6.append(n17);
            sb6.append(", url:");
            java.lang.String str2 = this.f302898g;
            sb6.append(str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizCommonSchemeUrlCgiServe", sb6.toString());
            if (n17) {
                new cq1.t(str2).l().K(new cq1.q(sVar, nVar));
            } else {
                new cq1.u(str2).l().K(new cq1.r(sVar, nVar));
            }
            java.lang.Object a17 = nVar.a();
            if (a17 == aVar) {
                return aVar;
            }
            bVar = bVar2;
            obj = a17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (dq1.b) this.f302895d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        r45.r00 r00Var = (r45.r00) obj;
        boolean isFinishing = activityC12955x181c0197.isFinishing();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (isFinishing) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC12955x181c0197.f175406d, "isFinishing, checkResp illegal!");
            return f0Var;
        }
        if (r00Var == null || r00Var.f465928e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC12955x181c0197.f175406d, "empty resp!");
            activityC12955x181c0197.Z6();
            return f0Var;
        }
        java.lang.String str3 = activityC12955x181c0197.f175406d;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("antispam_type = ");
        r45.o00 o00Var = r00Var.f465931h;
        sb7.append(o00Var != null ? new java.lang.Integer(o00Var.f463325e) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, sb7.toString());
        r45.o00 o00Var2 = r00Var.f465931h;
        java.lang.Integer num = o00Var2 != null ? new java.lang.Integer(o00Var2.f463325e) : null;
        cq1.a[] aVarArr = cq1.a.f302859d;
        if (num != null && num.intValue() == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.biz.p1284xc9e135a5.ActivityC12955x181c0197.T6(activityC12955x181c0197, r00Var, bVar);
        } else {
            cq1.a[] aVarArr2 = cq1.a.f302859d;
            if (num != null && num.intValue() == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.biz.p1284xc9e135a5.ActivityC12955x181c0197.U6(activityC12955x181c0197, r00Var, bVar);
            } else {
                cq1.a[] aVarArr3 = cq1.a.f302859d;
                if (num != null && num.intValue() == 3) {
                    com.p314xaae8f345.mm.p1006xc5476f33.biz.p1284xc9e135a5.ActivityC12955x181c0197.U6(activityC12955x181c0197, r00Var, bVar);
                } else {
                    activityC12955x181c0197.Z6();
                }
            }
        }
        return f0Var;
    }
}
