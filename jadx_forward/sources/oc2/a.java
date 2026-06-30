package oc2;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f425680a;

    /* renamed from: b, reason: collision with root package name */
    public final int f425681b;

    public a(int i17, int i18) {
        this.f425680a = i17;
        this.f425681b = i18;
    }

    /* renamed from: equals */
    public boolean m150973xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc2.a)) {
            return false;
        }
        oc2.a aVar = (oc2.a) obj;
        return this.f425680a == aVar.f425680a && this.f425681b == aVar.f425681b;
    }

    /* renamed from: hashCode */
    public int m150974x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f425680a) * 31) + java.lang.Integer.hashCode(this.f425681b);
    }

    /* renamed from: toString */
    public java.lang.String m150975x9616526c() {
        return "CapsuleMarginInfo(leftMargin=" + this.f425680a + ", rightMargin=" + this.f425681b + ')';
    }
}
