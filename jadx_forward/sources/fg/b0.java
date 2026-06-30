package fg;

/* loaded from: classes7.dex */
public final class b0 extends com.p314xaae8f345.p3210x3857dc.C27820x71d6ac3f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f343257a;

    /* renamed from: b, reason: collision with root package name */
    public final long f343258b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f343259c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.oa f343260d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2 f343261e;

    /* renamed from: f, reason: collision with root package name */
    public fg.g f343262f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.EditText f343263g;

    /* renamed from: h, reason: collision with root package name */
    public int f343264h;

    /* renamed from: i, reason: collision with root package name */
    public int f343265i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f343266j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f343267k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.Integer f343268l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f343269m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f343270n;

    /* renamed from: o, reason: collision with root package name */
    public int f343271o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f343272p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f343273q;

    /* renamed from: r, reason: collision with root package name */
    public int f343274r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.w5 f343275s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k2 f343276t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.p314xaae8f345.p3210x3857dc.i2 view) {
        super(view);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f343257a = "WebViewExtendInputClient";
        this.f343258b = 250L;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        this.f343259c = z65.c.a();
        this.f343275s = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.w5(new fg.t(this));
        this.f343276t = new fg.s(this);
    }

    public final void a(boolean z17, fg.g gVar) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.v4 l17;
        java.lang.String message;
        if (!this.f343266j) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f343257a, "send confirm after keyboard hide");
            return;
        }
        java.lang.String str2 = null;
        pl1.f mo129515x29c21c7c = gVar != null ? gVar.mo129515x29c21c7c() : null;
        java.lang.String str3 = mo129515x29c21c7c != null ? mo129515x29c21c7c.R : null;
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.r1.f173174d;
        if ("encrypt-text".equalsIgnoreCase(str3) || com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.r1.e(str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f343257a, "onKeyboardComplete, do encrypt");
            if (gVar != null) {
                try {
                    l17 = gVar.l();
                } catch (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k4 e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f343257a, "onKeyboardComplete, encrypt fail since " + e17);
                    message = e17.getMessage();
                }
            } else {
                l17 = null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.oa oaVar = this.f343260d;
            str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l4.b(l17, oaVar != null ? oaVar.a() : null, mo129515x29c21c7c);
            message = null;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (str2 != null) {
                jSONObject.put("encryptedValue", str2);
            }
            if (message != null) {
                jSONObject.put("encryptError", message);
            }
            str = jSONObject.toString();
        } else {
            str = "";
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(function(){    var focusElement = document.activeElement;    if(focusElement){        if(focusElement.onkeyboardconfirm){            focusElement.onkeyboardconfirm(");
        sb6.append(str);
        sb6.append(");        }");
        sb6.append(z17 ? "" : "        focusElement.blur();");
        sb6.append("    }})();");
        m120206x738236e6(sb6.toString(), fg.j.f343312a);
    }

    public final fg.g b(android.view.inputmethod.InputConnection inputConnection) {
        synchronized (this.f343257a) {
            fg.g gVar = this.f343262f;
            if (gVar != null) {
                return gVar;
            }
            java.lang.String str = this.f343273q;
            fg.g gVar2 = null;
            if (str == null) {
                return null;
            }
            if (e(str) && inputConnection == null) {
                return null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.oa oaVar = this.f343260d;
            if (oaVar != null) {
                if ((oaVar != null ? oaVar.a() : null) != null) {
                    java.lang.String str2 = this.f343273q;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                    fg.g c17 = c(str2, inputConnection);
                    this.f343262f = c17;
                    this.f343263g = new android.widget.EditText(c17.mo129516xfb86a31b().getContext());
                    c17.k(new fg.m(c17, this));
                    gVar2 = this.f343262f;
                }
            }
            return gVar2;
        }
    }

    public final fg.g c(java.lang.String str, android.view.inputmethod.InputConnection inputConnection) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.r1.f(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.oa oaVar = this.f343260d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oaVar);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t a17 = oaVar.a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getAppBrandPage(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inputConnection);
            return new fg.e0(a17, inputConnection, this.f343274r);
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "safe-password")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.oa oaVar2 = this.f343260d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oaVar2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t a18 = oaVar2.a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "getAppBrandPage(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inputConnection);
            fg.i0 i0Var = new fg.i0(a18, inputConnection);
            i0Var.f343304b = new fg.o(this);
            return i0Var;
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.r1.g(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.oa oaVar3 = this.f343260d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oaVar3);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t a19 = oaVar3.a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a19, "getAppBrandPage(...)");
            return new fg.l0(a19, inputConnection);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.oa oaVar4 = this.f343260d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oaVar4);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t a27 = oaVar4.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a27, "getAppBrandPage(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inputConnection);
        return new fg.o0(a27, inputConnection, this.f343274r);
    }

    public final int d(int i17) {
        fg.g b17 = b(null);
        if (b17 == null || !this.f343267k) {
            return i17;
        }
        int c17 = b17.c();
        if (c17 != 0 && c17 != this.f343264h) {
            this.f343264h = c17;
        }
        return i17 + this.f343264h;
    }

    public final boolean e(java.lang.String str) {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.r1.f(str) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "safe-password") || com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.r1.g(str);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27820x71d6ac3f
    /* renamed from: getToolBarHeight */
    public int mo120207x6a051cac(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.oa oaVar = this.f343260d;
        if (oaVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oaVar);
            if (oaVar.a() != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.oa oaVar2 = this.f343260d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oaVar2);
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f5.c(oaVar2.a().mo51310xc2a54588())) {
                    return 0;
                }
                return d(i17);
            }
        }
        return 0;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27820x71d6ac3f
    /* renamed from: onExtraInfoChanged */
    public void mo120209x628133f5(java.lang.String str) {
        org.json.JSONObject jSONObject;
        if (str != null) {
            pl1.f fVar = new pl1.f();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TextAreaInfo", "totalInfo:".concat(str));
            try {
                jSONObject = new org.json.JSONObject(str);
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo convert to json error");
                jSONObject = new org.json.JSONObject();
            }
            try {
                if (jSONObject.has("element-tag")) {
                    jSONObject.getString("element-tag");
                }
            } catch (org.json.JSONException unused2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo add elementTag error");
            }
            try {
                if (jSONObject.has("keyboard-type")) {
                    java.lang.String string = jSONObject.getString("keyboard-type");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                    fVar.R = string;
                }
            } catch (org.json.JSONException unused3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo add keyboardType error");
            }
            try {
                if (jSONObject.has("cursor-spacing")) {
                    fVar.f438144y = java.lang.Integer.valueOf(ik1.w.k(jSONObject, "cursor-spacing"));
                }
            } catch (java.lang.NumberFormatException unused4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get cursor-spacing parseInt error");
            } catch (org.json.JSONException unused5) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get cursor-spacing error");
            } catch (java.lang.Exception unused6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get cursor-spacing parseInt error");
            }
            try {
                if (jSONObject.has("adjust-position")) {
                    fVar.B = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y(jSONObject.getString("adjust-position"), true));
                }
            } catch (org.json.JSONException unused7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get adjust-position error");
            } catch (java.lang.Exception unused8) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get adjust-position error");
            }
            try {
                if (jSONObject.has("show-confirm-bar")) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y(jSONObject.getString("show-confirm-bar"), false);
                }
            } catch (org.json.JSONException unused9) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get show-confirm-bar error");
            } catch (java.lang.Exception unused10) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get show-confirm-bar error");
            }
            try {
                if (jSONObject.has("password")) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y(jSONObject.getString("password"), false);
                }
            } catch (org.json.JSONException unused11) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get password error");
            } catch (java.lang.Exception unused12) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get password error");
            }
            try {
                if (jSONObject.has("show-cover-view")) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y(jSONObject.getString("show-cover-view"), false);
                }
            } catch (org.json.JSONException unused13) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get show-cover-view error");
            } catch (java.lang.Exception unused14) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get show-cover-view error");
            }
            try {
                if (jSONObject.has("confirm-hold")) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y(jSONObject.getString("confirm-hold"), false);
                }
            } catch (org.json.JSONException unused15) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get confirm-hold error");
            } catch (java.lang.Exception unused16) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get confirm-hold error");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h6.d(jSONObject, fVar);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l4.d(jSONObject, fVar);
            fg.g b17 = b(null);
            if (b17 != null) {
                b17.f(fVar);
            }
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27820x71d6ac3f
    /* renamed from: onHideKeyboard */
    public boolean mo120210xb4cbdec8(java.lang.String str, android.view.inputmethod.InputConnection inputConnection) {
        android.view.View mo51310xc2a54588;
        android.view.ViewTreeObserver viewTreeObserver;
        fg.g b17;
        if (this.f343259c && inputConnection != null) {
            boolean z17 = inputConnection instanceof android.view.inputmethod.BaseInputConnection;
        }
        this.f343266j = false;
        if (this.f343260d != null && (b17 = b(null)) != null) {
            b17.mo129517x3f895349();
            b17.a(false);
        }
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.w5 w5Var = this.f343275s;
            w5Var.a();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.oa oaVar = this.f343260d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oaVar);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t a17 = oaVar.a();
            if (a17 != null && (mo51310xc2a54588 = a17.mo51310xc2a54588()) != null && (viewTreeObserver = mo51310xc2a54588.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(w5Var);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2 l2Var = this.f343261e;
            if (l2Var != null) {
                l2Var.g(this.f343276t);
            }
        }
        fg.p0.f343334a.a(true);
        this.f343273q = null;
        this.f343262f = null;
        this.f343267k = false;
        this.f343268l = null;
        this.f343269m = null;
        return false;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27820x71d6ac3f
    /* renamed from: onShowKeyboard */
    public boolean mo120212x6080f183(java.lang.String str, java.lang.String extendInfo, android.view.inputmethod.InputConnection inputConnection, android.os.ResultReceiver resultReceiver) {
        android.view.View mo51310xc2a54588;
        android.view.ViewTreeObserver viewTreeObserver;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extendInfo, "extendInfo");
        if (this.f343259c && inputConnection != null) {
            boolean z17 = inputConnection instanceof android.view.inputmethod.BaseInputConnection;
        }
        this.f343266j = true;
        fg.i iVar = new fg.i(extendInfo);
        sf.c cVar = sf.c.f488472a;
        pl1.f fVar = iVar.f343301d;
        java.lang.Integer num = fVar.X;
        if (num == null) {
            num = -1;
        }
        cVar.c(new sf.a(0, num.intValue()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2 l2Var = this.f343261e;
        if (l2Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.oa oaVar = this.f343260d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oaVar);
            l2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1.e(oaVar.a().mo51310xc2a54588());
        }
        this.f343261e = l2Var;
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.oa oaVar2 = this.f343260d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oaVar2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t a17 = oaVar2.a();
            if (a17 != null && (mo51310xc2a54588 = a17.mo51310xc2a54588()) != null && (viewTreeObserver = mo51310xc2a54588.getViewTreeObserver()) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.w5 w5Var = this.f343275s;
                viewTreeObserver.removeOnGlobalLayoutListener(w5Var);
                viewTreeObserver.addOnGlobalLayoutListener(w5Var);
            }
        } else if (l2Var != null) {
            l2Var.a(this.f343276t);
        }
        fg.p0.f343334a.a(false);
        this.f343272p = iVar.f343302e;
        java.lang.String str2 = iVar.f343298a;
        this.f343273q = str2;
        this.f343274r = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1((java.lang.Integer) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.r1.f173174d.get(str2), 0);
        boolean z18 = iVar.f343299b;
        this.f343267k = z18;
        this.f343268l = fVar.X;
        this.f343269m = str;
        boolean e17 = e(this.f343273q);
        if (this.f343260d == null) {
            return false;
        }
        fg.g b17 = b(inputConnection);
        if (b17 != null) {
            if (z18) {
                b17.j(iVar.f343300c);
            }
            b17.g(new fg.v(this, b17));
            b17.i(fVar);
            b17.mo129518x765074af(this.f343269m);
            b17.b();
            if (z18) {
                b17.mo129516xfb86a31b().postDelayed(new fg.y(this, b17, iVar, e17), 200L);
            } else if (e17) {
                b17.a(z18);
                b17.mo129516xfb86a31b().post(new fg.a0(b17, this));
            }
        }
        return e17;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27820x71d6ac3f
    /* renamed from: onShowKeyboardConfig */
    public boolean mo120213x48bcf2a5(java.lang.String str, int i17, int i18, java.lang.String str2, int i19, int i27, android.view.inputmethod.EditorInfo outAttrs) {
        java.lang.String str3 = this.f343257a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outAttrs, "outAttrs");
        pl1.c cVar = null;
        try {
            cVar = (pl1.c) pl1.e.a(new org.json.JSONObject(str2).optString("confirm-type", null), pl1.c.class);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str3, "onShowKeyboardConfig, get confirm-type error");
        }
        if (cVar == null) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "onShowKeyboardConfig, confirmType: " + cVar);
        if (pl1.c.RETURN != cVar) {
            outAttrs.imeOptions &= -1073741825;
        }
        int i28 = outAttrs.imeOptions;
        int i29 = cVar.f438116d;
        outAttrs.imeOptions = i28 | i29;
        this.f343271o = i29;
        return false;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27820x71d6ac3f
    /* renamed from: performEditorAction */
    public boolean mo120214x17a33804(int i17) {
        if (i17 == 0 || i17 != this.f343271o) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f343257a, "performEditorAction, confirmHold: " + this.f343272p);
        a(this.f343272p, this.f343262f);
        return false;
    }
}
