package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class vp extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t1 {
    public final qo0.c N;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l P;
    public final java.lang.String Q;
    public android.widget.CheckBox R;
    public android.view.View S;
    public boolean T;
    public final jz5.g U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp(android.content.Context context, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.N = statusMonitor;
        this.P = basePlugin;
        this.Q = "VoiceRoomLbsRequestPanel";
        this.U = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.up(this, context));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570468ds0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int J() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.rti);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.R = (android.widget.CheckBox) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.s2c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.S = findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.p314xaae8f345.mm.R.id.o3b);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        com.p314xaae8f345.mm.ui.fk.a((android.widget.TextView) findViewById3);
        android.view.View view = this.S;
        if (view != null) {
            view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rp(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("requestBtn");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public boolean Q() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t1, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void S() {
        super.S();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("result", k0() ? 1 : 0);
        jSONObject.put("type", this.T ? 2 : 1);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.f408806w2, t17, 0L, null, null, null, null, null, 252, null);
        this.T = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t1
    public java.lang.String i0() {
        return this.Q;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t1
    public void l0(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0(), "mmPermissionCallback hadPermission: " + z17);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("result", z17 ? 1 : 2);
        jSONObject.put("element", 3);
        this.T = true;
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.f408804v2, t17, 0L, null, null, null, null, null, 252, null);
        if (z17) {
            h0(true);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(this, null, false, 0, 7, null);
        android.widget.CheckBox checkBox = this.R;
        if (checkBox != null) {
            checkBox.setChecked(false);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("checkBox");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t1
    public void m0(r45.ze2 location) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sp) ((jz5.n) this.U).mo141623x754a37bb()).b();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t1
    public void n0(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0(), "systemPermissionCallback hadPermission: " + z17);
        this.T = true;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("result", z17 ? 1 : 2);
        jSONObject.put("element", 2);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.f408804v2, t17, 0L, null, null, null, null, null, 252, null);
        if (z17) {
            h0(true);
            return;
        }
        android.widget.CheckBox checkBox = this.R;
        if (checkBox == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("checkBox");
            throw null;
        }
        checkBox.setChecked(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(this, null, false, 0, 7, null);
    }

    public final void o0(int i17, int i18, yz5.l lVar) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put("element", i18);
        if (lVar != null) {
            lVar.mo146xb9724478(jSONObject);
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.f408802u2, t17, 0L, null, null, null, null, null, 252, null);
    }
}
