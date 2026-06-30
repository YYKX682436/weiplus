package com.google.gson;

/* loaded from: classes16.dex */
public final class q extends com.google.gson.l {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f44842d;

    public q(java.lang.Boolean bool) {
        bool.getClass();
        this.f44842d = bool;
    }

    public static boolean g(com.google.gson.q qVar) {
        java.lang.Object obj = qVar.f44842d;
        if (!(obj instanceof java.lang.Number)) {
            return false;
        }
        java.lang.Number number = (java.lang.Number) obj;
        return (number instanceof java.math.BigInteger) || (number instanceof java.lang.Long) || (number instanceof java.lang.Integer) || (number instanceof java.lang.Short) || (number instanceof java.lang.Byte);
    }

    public java.lang.Number d() {
        java.lang.Object obj = this.f44842d;
        return obj instanceof java.lang.String ? new com.google.gson.internal.u((java.lang.String) obj) : (java.lang.Number) obj;
    }

    public java.lang.String e() {
        java.lang.Object obj = this.f44842d;
        return obj instanceof java.lang.Number ? d().toString() : obj instanceof java.lang.Boolean ? ((java.lang.Boolean) obj).toString() : (java.lang.String) obj;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.google.gson.q.class != obj.getClass()) {
            return false;
        }
        com.google.gson.q qVar = (com.google.gson.q) obj;
        java.lang.Object obj2 = this.f44842d;
        java.lang.Object obj3 = qVar.f44842d;
        if (obj2 == null) {
            return obj3 == null;
        }
        if (g(this) && g(qVar)) {
            return d().longValue() == qVar.d().longValue();
        }
        if (!(obj2 instanceof java.lang.Number) || !(obj3 instanceof java.lang.Number)) {
            return obj2.equals(obj3);
        }
        double doubleValue = d().doubleValue();
        double doubleValue2 = qVar.d().doubleValue();
        if (doubleValue != doubleValue2) {
            return java.lang.Double.isNaN(doubleValue) && java.lang.Double.isNaN(doubleValue2);
        }
        return true;
    }

    public int hashCode() {
        long doubleToLongBits;
        java.lang.Object obj = this.f44842d;
        if (obj == null) {
            return 31;
        }
        if (g(this)) {
            doubleToLongBits = d().longValue();
        } else {
            if (!(obj instanceof java.lang.Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = java.lang.Double.doubleToLongBits(d().doubleValue());
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public q(java.lang.Number number) {
        number.getClass();
        this.f44842d = number;
    }

    public q(java.lang.String str) {
        str.getClass();
        this.f44842d = str;
    }
}
