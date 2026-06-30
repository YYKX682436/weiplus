package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f268708a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f268709b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f268710c;

    /* renamed from: d, reason: collision with root package name */
    public final int f268711d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Intent f268712e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f268713f;

    /* renamed from: g, reason: collision with root package name */
    public final android.app.Dialog f268714g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.h7 f268715h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p1 f268716i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f268717j;

    public e0(float f17, java.lang.String str, boolean z17, int i17, android.content.Intent intent, boolean z18, android.app.Dialog dialog, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.h7 h7Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p1 p1Var, boolean z19, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        f17 = (i18 & 1) != 0 ? 0.75f : f17;
        str = (i18 & 2) != 0 ? null : str;
        z17 = (i18 & 4) != 0 ? true : z17;
        i17 = (i18 & 8) != 0 ? 80 : i17;
        intent = (i18 & 16) != 0 ? null : intent;
        z18 = (i18 & 32) != 0 ? false : z18;
        dialog = (i18 & 64) != 0 ? null : dialog;
        h7Var = (i18 & 128) != 0 ? null : h7Var;
        p1Var = (i18 & 256) != 0 ? null : p1Var;
        z19 = (i18 & 512) != 0 ? true : z19;
        this.f268708a = f17;
        this.f268709b = str;
        this.f268710c = z17;
        this.f268711d = i17;
        this.f268712e = intent;
        this.f268713f = z18;
        this.f268714g = dialog;
        this.f268715h = h7Var;
        this.f268716i = p1Var;
        this.f268717j = z19;
    }

    /* renamed from: equals */
    public boolean m74820xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.e0)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.e0 e0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.e0) obj;
        return java.lang.Float.compare(this.f268708a, e0Var.f268708a) == 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f268709b, e0Var.f268709b) && this.f268710c == e0Var.f268710c && this.f268711d == e0Var.f268711d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f268712e, e0Var.f268712e) && this.f268713f == e0Var.f268713f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f268714g, e0Var.f268714g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f268715h, e0Var.f268715h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f268716i, e0Var.f268716i) && this.f268717j == e0Var.f268717j;
    }

    /* renamed from: hashCode */
    public int m74821x8cdac1b() {
        int hashCode = java.lang.Float.hashCode(this.f268708a) * 31;
        java.lang.String str = this.f268709b;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f268710c)) * 31) + java.lang.Integer.hashCode(this.f268711d)) * 31;
        android.content.Intent intent = this.f268712e;
        int hashCode3 = (((hashCode2 + (intent == null ? 0 : intent.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f268713f)) * 31;
        android.app.Dialog dialog = this.f268714g;
        int hashCode4 = (hashCode3 + (dialog == null ? 0 : dialog.hashCode())) * 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.h7 h7Var = this.f268715h;
        int hashCode5 = (hashCode4 + (h7Var == null ? 0 : h7Var.hashCode())) * 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p1 p1Var = this.f268716i;
        return ((hashCode5 + (p1Var != null ? p1Var.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f268717j);
    }

    /* renamed from: toString */
    public java.lang.String m74822x9616526c() {
        return "CommWebViewOption(heightPercent=" + this.f268708a + ", extData=" + this.f268709b + ", reuseWebView=" + this.f268710c + ", getA8KeyScene=" + this.f268711d + ", extraIntent=" + this.f268712e + ", readMode=" + this.f268713f + ", uiDialog=" + this.f268714g + ", customWebChromeClientCreator=" + this.f268715h + ", commWebViewDelegate=" + this.f268716i + ", showProgressBar=" + this.f268717j + ')';
    }
}
