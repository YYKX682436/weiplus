package com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44;

/* loaded from: classes15.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f295986a;

    /* renamed from: b, reason: collision with root package name */
    public int f295987b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Object f295988c;

    /* renamed from: d, reason: collision with root package name */
    public int f295989d;

    public b(int i17, int i18, int i19, java.lang.Object obj) {
        this.f295986a = i17;
        this.f295987b = i18;
        this.f295989d = i19;
        this.f295988c = obj;
    }

    /* renamed from: equals */
    public boolean m83629xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.b)) {
            return false;
        }
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.b bVar = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.b) obj;
        int i17 = this.f295986a;
        if (i17 != bVar.f295986a) {
            return false;
        }
        if (i17 == 8 && java.lang.Math.abs(this.f295989d - this.f295987b) == 1 && this.f295989d == bVar.f295987b && this.f295987b == bVar.f295989d) {
            return true;
        }
        if (this.f295989d != bVar.f295989d || this.f295987b != bVar.f295987b) {
            return false;
        }
        java.lang.Object obj2 = this.f295988c;
        if (obj2 != null) {
            if (!obj2.equals(bVar.f295988c)) {
                return false;
            }
        } else if (bVar.f295988c != null) {
            return false;
        }
        return true;
    }

    /* renamed from: hashCode */
    public int m83630x8cdac1b() {
        return (((this.f295986a * 31) + this.f295987b) * 31) + this.f295989d;
    }

    /* renamed from: toString */
    public java.lang.String m83631x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb6.append("[");
        int i17 = this.f295986a;
        sb6.append(i17 != 1 ? i17 != 2 ? i17 != 4 ? i17 != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb6.append(",s:");
        sb6.append(this.f295987b);
        sb6.append("c:");
        sb6.append(this.f295989d);
        sb6.append(",p:");
        sb6.append(this.f295988c);
        sb6.append("]");
        return sb6.toString();
    }
}
