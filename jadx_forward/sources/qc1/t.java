package qc1;

/* loaded from: classes7.dex */
public class t extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q0 {
    public final /* synthetic */ java.lang.ref.WeakReference G;
    public final /* synthetic */ int H;
    public final /* synthetic */ java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public final /* synthetic */ qc1.v f443031J;

    public t(qc1.v vVar, java.lang.ref.WeakReference weakReference, int i17, java.lang.String str) {
        this.f443031J = vVar;
        this.G = weakReference;
        this.H = i17;
        this.I = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q0
    public void u(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) this.G.get();
        if (v5Var == null) {
            return;
        }
        try {
            int i17 = this.f173144p;
            qc1.u uVar = new qc1.u();
            uVar.f163907f = new org.json.JSONObject().put("value", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s0.d(str)).put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, this.f443031J.F(i17)).put("cursor", 0).put("inputId", i17).put("keyCode", 8).toString();
            v5Var.i(uVar, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiShowKeyboard", "onBackspacePressedWhileValueNoChange, e = %s", e17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q0
    public void v(java.lang.String str, int i17, boolean z17, boolean z18) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var;
        java.lang.ref.WeakReference weakReference = this.G;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l) weakReference.get();
        if (lVar == null) {
            return;
        }
        try {
            str2 = new org.json.JSONObject().put("value", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s0.d(str)).put("inputId", this.f173144p).put("cursor", i17).toString();
        } catch (org.json.JSONException e17) {
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiShowKeyboard", "dispatch input done, exp = %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            str2 = null;
        }
        if (!android.text.TextUtils.isEmpty(str2)) {
            if (z17) {
                lVar.g("onKeyboardConfirm", str2);
            }
            if (!z18) {
                lVar.g("onKeyboardComplete", str2);
            }
        }
        if (z18 || (v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) weakReference.get()) == null || v5Var.a2() == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.s.f173179b.c(v5Var.a2());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q0
    public void w(java.lang.String str, int i17, boolean z17, boolean z18, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var;
        java.lang.ref.WeakReference weakReference = this.G;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l) weakReference.get();
        if (lVar == null) {
            return;
        }
        java.lang.String str4 = null;
        try {
            org.json.JSONObject put = new org.json.JSONObject().put("value", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s0.d(str)).put("inputId", this.f173144p).put("cursor", i17);
            if (str2 != null) {
                put.put("encryptValue", str2);
            }
            if (str3 != null) {
                put.put("encryptError", str3);
            }
            str4 = put.toString();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShowKeyboard", "onInputDoneWithEncryptedValue, eventData: %s", str4);
        } catch (org.json.JSONException e17) {
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiShowKeyboard", "dispatch input done, exp = %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
        if (!android.text.TextUtils.isEmpty(str4)) {
            if (z17) {
                lVar.g("onKeyboardConfirm", str4);
            }
            if (!z18) {
                lVar.g("onKeyboardComplete", str4);
            }
        }
        if (z18 || (v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) weakReference.get()) == null || v5Var.a2() == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.s.f173179b.c(v5Var.a2());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q0
    public void x() {
        java.lang.ref.WeakReference weakReference = this.G;
        if (weakReference.get() != null) {
            int i17 = this.f173144p;
            java.util.HashMap hashMap = new java.util.HashMap(1);
            hashMap.put("inputId", java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) weakReference.get();
            qc1.v vVar = this.f443031J;
            v5Var.a(this.H, vVar.p("ok", hashMap));
            vVar.E(i17, this.I);
            vVar.D(i17, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) weakReference.get());
            vVar.L((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) weakReference.get(), i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q0
    public void y() {
        java.lang.ref.WeakReference weakReference = this.G;
        if (weakReference.get() != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) weakReference.get()).a(this.H, this.f443031J.o("fail"));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) weakReference.get();
            if (v5Var == null || v5Var.a2() == null) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.s.f173179b.c(v5Var.a2());
        }
    }
}
