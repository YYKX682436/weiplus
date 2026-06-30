package df2;

/* loaded from: classes3.dex */
public final class u00 extends if2.b implements if2.e, mf2.v {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f313020m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f313021n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f313022o;

    /* renamed from: p, reason: collision with root package name */
    public if2.d0 f313023p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yx f313024q;

    /* renamed from: r, reason: collision with root package name */
    public long f313025r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u00(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f313020m = "Finder.VisitorDefinitionController";
        this.f313021n = jz5.h.b(df2.r00.f312740d);
    }

    public final void Z6() {
        hn0.r rVar;
        kn0.r c17;
        if (this.f313025r == 0) {
            co0.s u07 = dk2.ef.f314905a.u0();
            if (((u07 == null || (rVar = u07.R1) == null || (c17 = rVar.c()) == null) ? 0 : c17.f391130b) == 5) {
                this.f313025r = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f313020m, "checkAndStartUltraHDTracking ultraHDPlayBeginTime:" + this.f313025r);
            }
        }
    }

    public final kn0.r a7() {
        java.lang.Object obj;
        java.util.List list = ((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).f410860v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-audienceLinkMicUserList>(...)");
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((km2.q) obj).f390703a, ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).m8())) {
                    break;
                }
            }
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yx.f202011f.c(obj != null);
    }

    public final void b7(int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.W1, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public final void c7() {
        hn0.r rVar;
        kn0.r c17;
        if (this.f313025r > 0) {
            co0.s u07 = dk2.ef.f314905a.u0();
            if (((u07 == null || (rVar = u07.R1) == null || (c17 = rVar.c()) == null) ? 0 : c17.f391130b) != 5) {
                long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f313025r;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f313020m, "reportUltraHDWatchDurationIfNeed ultraHDPlayBeginTime:" + this.f313025r + ", duration:" + currentTimeMillis);
                ((ml2.r0) i95.n0.c(ml2.r0.class)).Jk(1, currentTimeMillis);
                this.f313025r = 0L;
            }
        }
    }

    public final void d7(java.lang.String str, boolean z17) {
        android.widget.TextView textView;
        java.lang.String string;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yx yxVar = this.f313024q;
        if (yxVar != null) {
            yxVar.a(z17);
        }
        android.view.View view = this.f313022o;
        if (view == null || (textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.fp8)) == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.fk.a(textView);
        textView.setTextSize(1, 14.0f);
        kn0.r a76 = a7();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f313020m, str + " videoDefinitionResult:" + a76 + '!');
        if (a76 == null || (string = a76.f391131c) == null) {
            string = textView.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dx6);
        }
        textView.setText(string);
        android.view.View rootView = textView.getRootView();
        if (rootView == null) {
            return;
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.Object[] objArr = new java.lang.Object[1];
        kn0.r a77 = a7();
        if (a77 == null || (str2 = a77.f391131c) == null) {
            str2 = "";
        }
        objArr[0] = str2;
        rootView.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.los, objArr));
    }

    @Override // mf2.v
    public void e0() {
        d7("onConnectSucc", true);
        c7();
        Z6();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        super.mo14860x9606ce3f();
        if (this.f313025r > 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f313025r;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f313020m, "onLiveDeactivate ultraHDPlayBeginTime:" + this.f313025r + ", duration:" + currentTimeMillis);
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Jk(2, currentTimeMillis);
            this.f313025r = 0L;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        super.mo14863x39a513b7(hc1Var);
        Z6();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f3  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo8998x9f682d55(android.view.ViewGroup r8) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.u00.mo8998x9f682d55(android.view.ViewGroup):void");
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yx yxVar = this.f313024q;
        if (yxVar != null) {
            yxVar.f202016e = false;
            yxVar.f202015d = null;
            yxVar.f202014c = null;
        }
        this.f313024q = null;
        this.f313022o = null;
        if2.d0 d0Var = this.f313023p;
        if (d0Var != null) {
            d0Var.d(8);
        }
        this.f313023p = null;
    }

    @Override // mf2.v
    public void s6(int i17, android.os.Bundle bundle) {
        if (i17 == 22) {
            d7("SwitchSucc", true);
            c7();
            Z6();
        } else if (i17 == 23) {
            d7("SwitchFail", false);
        } else if (i17 == 13) {
            Z6();
        }
    }
}
