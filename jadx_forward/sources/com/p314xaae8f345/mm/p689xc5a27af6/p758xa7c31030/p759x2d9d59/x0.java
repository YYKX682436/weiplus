package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59;

/* loaded from: classes12.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f149037a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f149038b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f149039c;

    public x0(int i17, java.lang.String source, java.lang.String reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        this.f149037a = i17;
        this.f149038b = source;
        this.f149039c = reason;
    }

    /* renamed from: equals */
    public boolean m45121xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x0)) {
            return false;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x0 x0Var = (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x0) obj;
        return this.f149037a == x0Var.f149037a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f149038b, x0Var.f149038b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f149039c, x0Var.f149039c);
    }

    /* renamed from: hashCode */
    public int m45122x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f149037a) * 31) + this.f149038b.hashCode()) * 31) + this.f149039c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m45123x9616526c() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Signal(");
        int i17 = this.f149037a;
        if (i17 == 0) {
            str = com.p314xaae8f345.p3085x8ea91595.p3089x41473653.AbstractServiceConnectionC26658x1e46da09.f56035xc79cea6c;
        } else if (i17 == 1) {
            str = "RED";
        } else if (i17 == 2) {
            str = "GREEN";
        } else {
            if (i17 != 3) {
                throw new java.lang.IllegalStateException(("Unknown signal: " + i17).toString());
            }
            str = "YELLOW";
        }
        sb6.append(str);
        sb6.append(", source='");
        sb6.append(this.f149038b);
        sb6.append("', reason='");
        sb6.append(this.f149039c);
        sb6.append("')");
        return sb6.toString();
    }

    public /* synthetic */ x0(int i17, java.lang.String str, java.lang.String str2, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(i17, str, (i18 & 4) != 0 ? "" : str2);
    }
}
