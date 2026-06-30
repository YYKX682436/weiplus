package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public final class r3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f282853a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f282854b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f282855c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f282856d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f282857e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f282858f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p954x7e3e6bb0.C11126xa77ef256 f282859g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f282860h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Integer f282861i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f282862j;

    /* renamed from: k, reason: collision with root package name */
    public final int f282863k;

    /* renamed from: l, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f282864l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f282865m;

    public r3(int i17, java.lang.String str, boolean z17, boolean z18, boolean z19, java.lang.String str2, com.p314xaae8f345.mm.p954x7e3e6bb0.C11126xa77ef256 c11126xa77ef256, boolean z27, java.lang.Integer num, boolean z28, int i18, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z29) {
        this.f282853a = i17;
        this.f282854b = str;
        this.f282855c = z17;
        this.f282856d = z18;
        this.f282857e = z19;
        this.f282858f = str2;
        this.f282859g = c11126xa77ef256;
        this.f282860h = z27;
        this.f282861i = num;
        this.f282862j = z28;
        this.f282863k = i18;
        this.f282864l = f9Var;
        this.f282865m = z29;
    }

    /* renamed from: equals */
    public boolean m79626xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.r3)) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.r3 r3Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.r3) obj;
        return this.f282853a == r3Var.f282853a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f282854b, r3Var.f282854b) && this.f282855c == r3Var.f282855c && this.f282856d == r3Var.f282856d && this.f282857e == r3Var.f282857e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f282858f, r3Var.f282858f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f282859g, r3Var.f282859g) && this.f282860h == r3Var.f282860h && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f282861i, r3Var.f282861i) && this.f282862j == r3Var.f282862j && this.f282863k == r3Var.f282863k && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f282864l, r3Var.f282864l) && this.f282865m == r3Var.f282865m;
    }

    /* renamed from: hashCode */
    public int m79627x8cdac1b() {
        int hashCode = java.lang.Integer.hashCode(this.f282853a) * 31;
        java.lang.String str = this.f282854b;
        int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f282855c)) * 31) + java.lang.Boolean.hashCode(this.f282856d)) * 31) + java.lang.Boolean.hashCode(this.f282857e)) * 31;
        java.lang.String str2 = this.f282858f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        com.p314xaae8f345.mm.p954x7e3e6bb0.C11126xa77ef256 c11126xa77ef256 = this.f282859g;
        int m48137x8cdac1b = (((hashCode3 + (c11126xa77ef256 == null ? 0 : c11126xa77ef256.m48137x8cdac1b())) * 31) + java.lang.Boolean.hashCode(this.f282860h)) * 31;
        java.lang.Integer num = this.f282861i;
        int hashCode4 = (((((m48137x8cdac1b + (num == null ? 0 : num.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f282862j)) * 31) + java.lang.Integer.hashCode(this.f282863k)) * 31;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f282864l;
        return ((hashCode4 + (f9Var != null ? f9Var.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f282865m);
    }

    /* renamed from: toString */
    public java.lang.String m79628x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ImageGalleryOPLayerViewConfig(position=");
        sb6.append(this.f282853a);
        sb6.append(", hdLeghtStr=");
        sb6.append(this.f282854b);
        sb6.append(", isVideo=");
        sb6.append(this.f282855c);
        sb6.append(", showJumpMiniProgram=");
        sb6.append(this.f282856d);
        sb6.append(", showReadOrigin=");
        sb6.append(this.f282857e);
        sb6.append(", launchAppBrandBtnDesc=");
        sb6.append(this.f282858f);
        sb6.append(", showImageLink=");
        sb6.append(this.f282859g != null);
        sb6.append(", originMediaShow=");
        sb6.append(this.f282860h);
        sb6.append(", originMediaProgress=");
        sb6.append(this.f282861i);
        sb6.append(", disabledOpLayer=");
        sb6.append(this.f282862j);
        sb6.append(')');
        return sb6.toString();
    }
}
