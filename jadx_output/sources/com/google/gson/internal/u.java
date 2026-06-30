package com.google.gson.internal;

/* loaded from: classes8.dex */
public final class u extends java.lang.Number {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f44825d;

    public u(java.lang.String str) {
        this.f44825d = str;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return java.lang.Double.parseDouble(this.f44825d);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.gson.internal.u)) {
            return false;
        }
        java.lang.Object obj2 = ((com.google.gson.internal.u) obj).f44825d;
        java.lang.String str = this.f44825d;
        return str == obj2 || str.equals(obj2);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return java.lang.Float.parseFloat(this.f44825d);
    }

    public int hashCode() {
        return this.f44825d.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        java.lang.String str = this.f44825d;
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
        java.lang.String str = this.f44825d;
        try {
            return java.lang.Long.parseLong(str);
        } catch (java.lang.NumberFormatException unused) {
            return new java.math.BigDecimal(str).longValue();
        }
    }

    public java.lang.String toString() {
        return this.f44825d;
    }
}
