package com.p176xb6135e39.p280x308fcb;

/* loaded from: classes16.dex */
public final class q extends com.p176xb6135e39.p280x308fcb.l {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f126375d;

    public q(java.lang.Boolean bool) {
        bool.getClass();
        this.f126375d = bool;
    }

    public static boolean g(com.p176xb6135e39.p280x308fcb.q qVar) {
        java.lang.Object obj = qVar.f126375d;
        if (!(obj instanceof java.lang.Number)) {
            return false;
        }
        java.lang.Number number = (java.lang.Number) obj;
        return (number instanceof java.math.BigInteger) || (number instanceof java.lang.Long) || (number instanceof java.lang.Integer) || (number instanceof java.lang.Short) || (number instanceof java.lang.Byte);
    }

    public java.lang.Number d() {
        java.lang.Object obj = this.f126375d;
        return obj instanceof java.lang.String ? new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.u((java.lang.String) obj) : (java.lang.Number) obj;
    }

    public java.lang.String e() {
        java.lang.Object obj = this.f126375d;
        return obj instanceof java.lang.Number ? d().toString() : obj instanceof java.lang.Boolean ? ((java.lang.Boolean) obj).toString() : (java.lang.String) obj;
    }

    /* renamed from: equals */
    public boolean m20512xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.p176xb6135e39.p280x308fcb.q.class != obj.getClass()) {
            return false;
        }
        com.p176xb6135e39.p280x308fcb.q qVar = (com.p176xb6135e39.p280x308fcb.q) obj;
        java.lang.Object obj2 = this.f126375d;
        java.lang.Object obj3 = qVar.f126375d;
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

    /* renamed from: hashCode */
    public int m20513x8cdac1b() {
        long doubleToLongBits;
        java.lang.Object obj = this.f126375d;
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
        this.f126375d = number;
    }

    public q(java.lang.String str) {
        str.getClass();
        this.f126375d = str;
    }
}
