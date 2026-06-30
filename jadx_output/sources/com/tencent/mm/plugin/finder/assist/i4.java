package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class i4 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f102251a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f102252b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f102253c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f102254d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f102255e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f102256f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f102257g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f102258h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f102259i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f102260j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f102261k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f102262l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f102263m;

    public i4(boolean z17, boolean z18, boolean z19, boolean z27, java.lang.String forwardTip, java.lang.String snsTip, java.lang.String favTip, java.lang.String forwardWeWorkTip, boolean z28, boolean z29, boolean z37, boolean z38, boolean z39) {
        kotlin.jvm.internal.o.g(forwardTip, "forwardTip");
        kotlin.jvm.internal.o.g(snsTip, "snsTip");
        kotlin.jvm.internal.o.g(favTip, "favTip");
        kotlin.jvm.internal.o.g(forwardWeWorkTip, "forwardWeWorkTip");
        this.f102251a = z17;
        this.f102252b = z18;
        this.f102253c = z19;
        this.f102254d = z27;
        this.f102255e = forwardTip;
        this.f102256f = snsTip;
        this.f102257g = favTip;
        this.f102258h = forwardWeWorkTip;
        this.f102259i = z28;
        this.f102260j = z29;
        this.f102261k = z37;
        this.f102262l = z38;
        this.f102263m = z39;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.assist.i4)) {
            return false;
        }
        com.tencent.mm.plugin.finder.assist.i4 i4Var = (com.tencent.mm.plugin.finder.assist.i4) obj;
        return this.f102251a == i4Var.f102251a && this.f102252b == i4Var.f102252b && this.f102253c == i4Var.f102253c && this.f102254d == i4Var.f102254d && kotlin.jvm.internal.o.b(this.f102255e, i4Var.f102255e) && kotlin.jvm.internal.o.b(this.f102256f, i4Var.f102256f) && kotlin.jvm.internal.o.b(this.f102257g, i4Var.f102257g) && kotlin.jvm.internal.o.b(this.f102258h, i4Var.f102258h) && this.f102259i == i4Var.f102259i && this.f102260j == i4Var.f102260j && this.f102261k == i4Var.f102261k && this.f102262l == i4Var.f102262l && this.f102263m == i4Var.f102263m;
    }

    public int hashCode() {
        return (((((((((((((((((((((((java.lang.Boolean.hashCode(this.f102251a) * 31) + java.lang.Boolean.hashCode(this.f102252b)) * 31) + java.lang.Boolean.hashCode(this.f102253c)) * 31) + java.lang.Boolean.hashCode(this.f102254d)) * 31) + this.f102255e.hashCode()) * 31) + this.f102256f.hashCode()) * 31) + this.f102257g.hashCode()) * 31) + this.f102258h.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f102259i)) * 31) + java.lang.Boolean.hashCode(this.f102260j)) * 31) + java.lang.Boolean.hashCode(this.f102261k)) * 31) + java.lang.Boolean.hashCode(this.f102262l)) * 31) + java.lang.Boolean.hashCode(this.f102263m);
    }

    public java.lang.String toString() {
        return "ActionMenuInfo(forwardDisable=" + this.f102251a + ", snsDisable=" + this.f102252b + ", favDisable=" + this.f102253c + ", forwardWeWorkDisable=" + this.f102254d + ", forwardTip=" + this.f102255e + ", snsTip=" + this.f102256f + ", favTip=" + this.f102257g + ", forwardWeWorkTip=" + this.f102258h + ", hideForward=" + this.f102259i + ", hideSns=" + this.f102260j + ", hideGlobalFav=" + this.f102261k + ", hideForwardWeWork=" + this.f102262l + ", disableGlobalFav=" + this.f102263m + ')';
    }
}
