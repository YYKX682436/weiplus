package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public abstract class f extends al5.j2 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p4 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.a5 f172964d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.y4 f172965e;

    /* renamed from: f, reason: collision with root package name */
    public final int f172966f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f172967g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.ref.WeakReference f172968h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View.OnFocusChangeListener f172969i = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.c(this);

    /* renamed from: m, reason: collision with root package name */
    public final ck5.e f172970m = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d(this);

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.v4 f172971n = null;

    public f(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, int i17) {
        this.f172967g = str;
        this.f172968h = new java.lang.ref.WeakReference(v5Var);
        this.f172966f = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p4
    public boolean a() {
        return q();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.a5 a5Var = this.f172964d;
        if (a5Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t0) a5Var).a(editable == null ? "" : editable.toString(), android.text.Selection.getSelectionEnd(editable), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.z4.CHANGED);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p4
    /* renamed from: currentValue */
    public android.text.Editable mo53471x57066778() {
        if (n() == null) {
            return null;
        }
        return n().getEditableText();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p4
    public final void d(java.lang.String str, java.lang.Integer num) {
        t(str);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(num == null ? -1 : num.intValue());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b.b(n(), valueOf.intValue(), valueOf.intValue());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p4
    public final int e() {
        return this.f172966f;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p4
    public final void f(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.y4 y4Var = this.f172965e;
        if (y4Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u0 u0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u0) y4Var;
            int i18 = u0Var.f173202b;
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) u0Var.f173201a.get();
                if (v5Var == null) {
                    return;
                }
                int e17 = ik1.w.e(i17);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("inputId", i18);
                    try {
                        jSONObject.put("height", e17);
                        v5Var.g("onKeyboardShow", jSONObject.toString());
                        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1().x(i17, v5Var.v3(), v5Var, java.lang.Integer.valueOf(i18));
                    } catch (org.json.JSONException e18) {
                        throw new cl0.f(e18);
                    }
                } catch (org.json.JSONException e19) {
                    throw new cl0.f(e19);
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p4
    public boolean g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var) {
        return v5Var != null && v5Var == this.f172968h.get();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p4
    public android.widget.EditText h() {
        return n();
    }

    public final boolean j(pl1.i iVar) {
        pl1.i s17 = s(iVar);
        if (s17 == null) {
            return false;
        }
        java.lang.Integer num = s17.f438133n;
        if (num == null) {
            s17.f438133n = 140;
        } else if (num.intValue() <= 0) {
            s17.f438133n = Integer.MAX_VALUE;
        }
        if (n() == null) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.v1 g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.v1.g(n());
        int intValue = s17.f438133n.intValue();
        g17.f124094f = 0;
        g17.f124093e = intValue;
        g17.f124089a = false;
        g17.f124095g = com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_1;
        g17.d(this.f172970m);
        return true;
    }

    public final void k() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) this.f172968h.get();
        if (v5Var == null || v5Var.a2() == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.s.f173179b.b(v5Var.a2());
    }

    public final void l(android.text.Editable editable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.a5 a5Var = this.f172964d;
        if (a5Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t0) a5Var).a(editable == null ? "" : editable.toString(), android.text.Selection.getSelectionEnd(editable), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.z4.COMPLETE);
        }
    }

    public final void m(android.text.Editable editable, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.a5 a5Var = this.f172964d;
        if (a5Var != null) {
            java.lang.String obj = editable == null ? "" : editable.toString();
            int selectionEnd = android.text.Selection.getSelectionEnd(editable);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t0 t0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t0) a5Var;
            t0Var.getClass();
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) t0Var.f173188a.get();
                if (v5Var == null) {
                    return;
                }
                org.json.JSONObject put = new org.json.JSONObject().put("value", obj).put("keyCode", (int) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t4) t0Var.f173189b.n())).m53465xfe6f04ef()).put("inputId", t0Var.f173190c).put("cursor", selectionEnd);
                if (str != null) {
                    put.put("encryptValue", str);
                }
                if (str2 != null) {
                    put.put("encryptError", str2);
                }
                java.lang.String jSONObject = put.toString();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandInputJsApiHandler", "onKeyboardCompleteWithEncryptedValue, eventData: " + jSONObject);
                v5Var.g("onKeyboardComplete", jSONObject);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public abstract android.widget.EditText n();

    public abstract android.graphics.Rect o();

    public abstract boolean p(boolean z17);

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean q() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p pVar;
        android.widget.EditText n17 = n();
        if (n17 == 0) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t4 t4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t4) n17;
        android.view.View.OnFocusChangeListener onFocusChangeListener = this.f172969i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4 e4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4) t4Var;
        if (onFocusChangeListener != null) {
            ((x.n) e4Var.f172945i).m174754xc84af884(onFocusChangeListener);
        }
        n17.removeTextChangedListener(this);
        e4Var.n();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) this.f172968h.get();
        if (v5Var == null || (pVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p) v5Var.E1()) == null) {
            return false;
        }
        pVar.p(n17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.r1.h(v5Var, t4Var);
        return true;
    }

    public final void r() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) this.f172968h.get();
        if (v5Var == null || v5Var.a2() == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.s.f173179b.c(v5Var.a2());
    }

    public abstract pl1.i s(pl1.i iVar);

    public abstract boolean t(java.lang.String str);
}
