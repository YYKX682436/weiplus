package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public abstract class f extends al5.j2 implements com.tencent.mm.plugin.appbrand.widget.input.p4 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.a5 f91431d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.y4 f91432e;

    /* renamed from: f, reason: collision with root package name */
    public final int f91433f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f91434g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.ref.WeakReference f91435h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View.OnFocusChangeListener f91436i = new com.tencent.mm.plugin.appbrand.widget.input.c(this);

    /* renamed from: m, reason: collision with root package name */
    public final ck5.e f91437m = new com.tencent.mm.plugin.appbrand.widget.input.d(this);

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.v4 f91438n = null;

    public f(java.lang.String str, com.tencent.mm.plugin.appbrand.page.v5 v5Var, int i17) {
        this.f91434g = str;
        this.f91435h = new java.lang.ref.WeakReference(v5Var);
        this.f91433f = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.p4
    public boolean a() {
        return q();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.appbrand.widget.input.a5 a5Var = this.f91431d;
        if (a5Var != null) {
            ((com.tencent.mm.plugin.appbrand.widget.input.t0) a5Var).a(editable == null ? "" : editable.toString(), android.text.Selection.getSelectionEnd(editable), com.tencent.mm.plugin.appbrand.widget.input.z4.CHANGED);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.p4
    public android.text.Editable currentValue() {
        if (n() == null) {
            return null;
        }
        return n().getEditableText();
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.p4
    public final void d(java.lang.String str, java.lang.Integer num) {
        t(str);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(num == null ? -1 : num.intValue());
        com.tencent.mm.plugin.appbrand.widget.input.b.b(n(), valueOf.intValue(), valueOf.intValue());
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.p4
    public final int e() {
        return this.f91433f;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.p4
    public final void f(int i17) {
        com.tencent.mm.plugin.appbrand.widget.input.y4 y4Var = this.f91432e;
        if (y4Var != null) {
            com.tencent.mm.plugin.appbrand.widget.input.u0 u0Var = (com.tencent.mm.plugin.appbrand.widget.input.u0) y4Var;
            int i18 = u0Var.f91669b;
            try {
                com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) u0Var.f91668a.get();
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
                        new com.tencent.mm.plugin.appbrand.jsapi.p1().x(i17, v5Var.v3(), v5Var, java.lang.Integer.valueOf(i18));
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

    @Override // com.tencent.mm.plugin.appbrand.widget.input.p4
    public boolean g(com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        return v5Var != null && v5Var == this.f91435h.get();
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.p4
    public android.widget.EditText h() {
        return n();
    }

    public final boolean j(pl1.i iVar) {
        pl1.i s17 = s(iVar);
        if (s17 == null) {
            return false;
        }
        java.lang.Integer num = s17.f356600n;
        if (num == null) {
            s17.f356600n = 140;
        } else if (num.intValue() <= 0) {
            s17.f356600n = Integer.MAX_VALUE;
        }
        if (n() == null) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.widget.input.v1 g17 = com.tencent.mm.plugin.appbrand.widget.input.v1.g(n());
        int intValue = s17.f356600n.intValue();
        g17.f42561f = 0;
        g17.f42560e = intValue;
        g17.f42556a = false;
        g17.f42562g = com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_1;
        g17.d(this.f91437m);
        return true;
    }

    public final void k() {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) this.f91435h.get();
        if (v5Var == null || v5Var.a2() == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.widget.input.s.f91646b.b(v5Var.a2());
    }

    public final void l(android.text.Editable editable) {
        com.tencent.mm.plugin.appbrand.widget.input.a5 a5Var = this.f91431d;
        if (a5Var != null) {
            ((com.tencent.mm.plugin.appbrand.widget.input.t0) a5Var).a(editable == null ? "" : editable.toString(), android.text.Selection.getSelectionEnd(editable), com.tencent.mm.plugin.appbrand.widget.input.z4.COMPLETE);
        }
    }

    public final void m(android.text.Editable editable, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.appbrand.widget.input.a5 a5Var = this.f91431d;
        if (a5Var != null) {
            java.lang.String obj = editable == null ? "" : editable.toString();
            int selectionEnd = android.text.Selection.getSelectionEnd(editable);
            com.tencent.mm.plugin.appbrand.widget.input.t0 t0Var = (com.tencent.mm.plugin.appbrand.widget.input.t0) a5Var;
            t0Var.getClass();
            try {
                com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) t0Var.f91655a.get();
                if (v5Var == null) {
                    return;
                }
                org.json.JSONObject put = new org.json.JSONObject().put("value", obj).put("keyCode", (int) ((com.tencent.mm.plugin.appbrand.widget.input.e4) ((com.tencent.mm.plugin.appbrand.widget.input.t4) t0Var.f91656b.n())).getLastKeyPressed()).put("inputId", t0Var.f91657c).put("cursor", selectionEnd);
                if (str != null) {
                    put.put("encryptValue", str);
                }
                if (str2 != null) {
                    put.put("encryptError", str2);
                }
                java.lang.String jSONObject = put.toString();
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandInputJsApiHandler", "onKeyboardCompleteWithEncryptedValue, eventData: " + jSONObject);
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
        com.tencent.mm.plugin.appbrand.widget.input.p pVar;
        android.widget.EditText n17 = n();
        if (n17 == 0) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.widget.input.t4 t4Var = (com.tencent.mm.plugin.appbrand.widget.input.t4) n17;
        android.view.View.OnFocusChangeListener onFocusChangeListener = this.f91436i;
        com.tencent.mm.plugin.appbrand.widget.input.e4 e4Var = (com.tencent.mm.plugin.appbrand.widget.input.e4) t4Var;
        if (onFocusChangeListener != null) {
            ((x.n) e4Var.f91412i).remove(onFocusChangeListener);
        }
        n17.removeTextChangedListener(this);
        e4Var.n();
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) this.f91435h.get();
        if (v5Var == null || (pVar = (com.tencent.mm.plugin.appbrand.widget.input.p) v5Var.E1()) == null) {
            return false;
        }
        pVar.p(n17);
        com.tencent.mm.plugin.appbrand.widget.input.r1.h(v5Var, t4Var);
        return true;
    }

    public final void r() {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) this.f91435h.get();
        if (v5Var == null || v5Var.a2() == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.widget.input.s.f91646b.c(v5Var.a2());
    }

    public abstract pl1.i s(pl1.i iVar);

    public abstract boolean t(java.lang.String str);
}
