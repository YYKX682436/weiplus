package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class i4 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.extension.reddot.jb f105587a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f105588b;

    /* renamed from: c, reason: collision with root package name */
    public int f105589c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f105590d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.extension.reddot.u5 f105591e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.extension.reddot.x5 f105592f;

    public i4(com.tencent.mm.plugin.finder.extension.reddot.jb redDotCtrInfo, java.lang.String dicPath, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(redDotCtrInfo, "redDotCtrInfo");
        kotlin.jvm.internal.o.g(dicPath, "dicPath");
        this.f105587a = redDotCtrInfo;
        this.f105588b = dicPath;
        this.f105589c = i17;
        this.f105590d = z17;
        this.f105591e = com.tencent.mm.plugin.finder.extension.reddot.u5.f105887e;
        this.f105592f = com.tencent.mm.plugin.finder.extension.reddot.x5.f105990e;
    }

    public final java.lang.String a() {
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = this.f105587a;
        java.lang.String str = this.f105588b;
        r45.f03 I0 = jbVar.I0(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(" (ignoreLimit=");
        boolean z17 = false;
        if (I0 != null && I0.f373899s == 1) {
            z17 = true;
        }
        sb6.append(z17);
        sb6.append(",businessType=");
        sb6.append(jbVar.field_businessType);
        sb6.append(",expose=");
        sb6.append(this.f105589c);
        sb6.append(",time=");
        sb6.append(jbVar.field_time);
        sb6.append(",is_exempt=");
        sb6.append(I0 != null ? java.lang.Boolean.valueOf(I0.I) : null);
        sb6.append(",win_type=");
        sb6.append(this.f105591e);
        sb6.append(",sub=");
        sb6.append(this.f105592f);
        sb6.append(')');
        return sb6.toString();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.extension.reddot.i4)) {
            return false;
        }
        com.tencent.mm.plugin.finder.extension.reddot.i4 i4Var = (com.tencent.mm.plugin.finder.extension.reddot.i4) obj;
        return kotlin.jvm.internal.o.b(this.f105587a, i4Var.f105587a) && kotlin.jvm.internal.o.b(this.f105588b, i4Var.f105588b) && this.f105589c == i4Var.f105589c && this.f105590d == i4Var.f105590d;
    }

    public int hashCode() {
        return (((((this.f105587a.hashCode() * 31) + this.f105588b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f105589c)) * 31) + java.lang.Boolean.hashCode(this.f105590d);
    }

    public java.lang.String toString() {
        return "LocalRedDotCollectWrapper(redDotCtrInfo=" + this.f105587a + ", dicPath=" + this.f105588b + ", exposeCnt=" + this.f105589c + ", ban=" + this.f105590d + ')';
    }
}
