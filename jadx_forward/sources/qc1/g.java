package qc1;

/* loaded from: classes7.dex */
public class g extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.v3 {
    public final /* synthetic */ java.lang.ref.WeakReference G;
    public final /* synthetic */ int H;
    public final /* synthetic */ java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public final /* synthetic */ qc1.i f442999J;

    public g(qc1.i iVar, java.lang.ref.WeakReference weakReference, int i17, java.lang.String str) {
        this.f442999J = iVar;
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
            uVar.f163907f = new org.json.JSONObject().put("value", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s0.d(str)).put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, this.f442999J.F(i17)).put("cursor", 0).put("inputId", i17).put("keyCode", 8).toString();
            v5Var.i(uVar, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiInsertTextArea", "onBackspacePressedWhileValueNoChange, e = %s", e17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q0
    public void v(java.lang.String str, int i17, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var;
        java.lang.ref.WeakReference weakReference = this.G;
        if (weakReference.get() != null) {
            try {
                java.lang.String jSONObject = new org.json.JSONObject().put("value", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s0.d(str)).put("inputId", this.f173144p).put("cursor", i17).toString();
                if (z17) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) weakReference.get()).g("onKeyboardConfirm", jSONObject);
                }
                if (!z18) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) weakReference.get()).g("onKeyboardComplete", jSONObject);
                }
            } catch (org.json.JSONException e17) {
                boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiInsertTextArea", "dispatch input done, exp = %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            }
            if (z18 || (v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) weakReference.get()) == null || v5Var.a2() == null) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.s.f173179b.c(v5Var.a2());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q0
    public void x() {
        java.lang.ref.WeakReference weakReference = this.G;
        if (weakReference.get() != null) {
            int i17 = this.f173144p;
            java.util.HashMap hashMap = new java.util.HashMap(1);
            hashMap.put("inputId", java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) weakReference.get();
            qc1.i iVar = this.f442999J;
            v5Var.a(this.H, iVar.p("ok", hashMap));
            iVar.E(i17, this.I);
            iVar.D(i17, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) weakReference.get());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q0
    public void y() {
        java.lang.ref.WeakReference weakReference = this.G;
        if (weakReference.get() != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) weakReference.get()).a(this.H, this.f442999J.o("fail"));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) weakReference.get();
            if (v5Var == null || v5Var.a2() == null) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.s.f173179b.c(v5Var.a2());
        }
    }
}
