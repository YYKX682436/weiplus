package com.tencent.mm.plugin.appbrand;

/* loaded from: classes3.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f85679a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f85680b;

    /* renamed from: c, reason: collision with root package name */
    public final int f85681c;

    /* renamed from: d, reason: collision with root package name */
    public final int f85682d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.CharSequence f85683e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.CharSequence f85684f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.CharSequence f85685g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f85686h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.dialog.p3 f85687i;

    public m0(java.lang.String title, java.lang.String pagFileName, int i17, int i18, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, boolean z17, com.tencent.mm.ui.widget.dialog.p3 p3Var) {
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(pagFileName, "pagFileName");
        this.f85679a = title;
        this.f85680b = pagFileName;
        this.f85681c = i17;
        this.f85682d = i18;
        this.f85683e = charSequence;
        this.f85684f = charSequence2;
        this.f85685g = charSequence3;
        this.f85686h = z17;
        this.f85687i = p3Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.m0)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.m0 m0Var = (com.tencent.mm.plugin.appbrand.m0) obj;
        return kotlin.jvm.internal.o.b(this.f85679a, m0Var.f85679a) && kotlin.jvm.internal.o.b(this.f85680b, m0Var.f85680b) && this.f85681c == m0Var.f85681c && this.f85682d == m0Var.f85682d && kotlin.jvm.internal.o.b(this.f85683e, m0Var.f85683e) && kotlin.jvm.internal.o.b(this.f85684f, m0Var.f85684f) && kotlin.jvm.internal.o.b(this.f85685g, m0Var.f85685g) && this.f85686h == m0Var.f85686h && kotlin.jvm.internal.o.b(this.f85687i, m0Var.f85687i);
    }

    public int hashCode() {
        int hashCode = ((((((this.f85679a.hashCode() * 31) + this.f85680b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f85681c)) * 31) + java.lang.Integer.hashCode(this.f85682d)) * 31;
        java.lang.CharSequence charSequence = this.f85683e;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        java.lang.CharSequence charSequence2 = this.f85684f;
        int hashCode3 = (hashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        java.lang.CharSequence charSequence3 = this.f85685g;
        int hashCode4 = (((hashCode3 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f85686h)) * 31;
        com.tencent.mm.ui.widget.dialog.p3 p3Var = this.f85687i;
        return hashCode4 + (p3Var != null ? p3Var.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "GuideInfo(title=" + this.f85679a + ", pagFileName=" + this.f85680b + ", repeatCount=" + this.f85681c + ", btnType=" + this.f85682d + ", singleBtnText=" + ((java.lang.Object) this.f85683e) + ", leftBtnText=" + ((java.lang.Object) this.f85684f) + ", rightBtnText=" + ((java.lang.Object) this.f85685g) + ", cancelable=" + this.f85686h + ", rightBtnCallBack=" + this.f85687i + ')';
    }
}
