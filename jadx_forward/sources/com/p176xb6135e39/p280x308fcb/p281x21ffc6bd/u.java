package com.p176xb6135e39.p280x308fcb.p281x21ffc6bd;

/* loaded from: classes8.dex */
public final class u extends java.lang.Number {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f126358d;

    public u(java.lang.String str) {
        this.f126358d = str;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return java.lang.Double.parseDouble(this.f126358d);
    }

    /* renamed from: equals */
    public boolean m20501xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.u)) {
            return false;
        }
        java.lang.Object obj2 = ((com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.u) obj).f126358d;
        java.lang.String str = this.f126358d;
        return str == obj2 || str.equals(obj2);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return java.lang.Float.parseFloat(this.f126358d);
    }

    /* renamed from: hashCode */
    public int m20502x8cdac1b() {
        return this.f126358d.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        java.lang.String str = this.f126358d;
        try {
            try {
                return java.lang.Integer.parseInt(str);
            } catch (java.lang.NumberFormatException unused) {
                return (int) java.lang.Long.parseLong(str);
            }
        } catch (java.lang.NumberFormatException unused2) {
            return new java.math.BigDecimal(str).intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        java.lang.String str = this.f126358d;
        try {
            return java.lang.Long.parseLong(str);
        } catch (java.lang.NumberFormatException unused) {
            return new java.math.BigDecimal(str).longValue();
        }
    }

    /* renamed from: toString */
    public java.lang.String m20503x9616526c() {
        return this.f126358d;
    }
}
