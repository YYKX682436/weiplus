package com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e;

/* loaded from: classes11.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f134491a;

    /* renamed from: b, reason: collision with root package name */
    public final int f134492b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f134493c;

    /* renamed from: d, reason: collision with root package name */
    public final int f134494d;

    public l(java.lang.String objectName, int i17, java.lang.String referenceName, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectName, "objectName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(referenceName, "referenceName");
        this.f134491a = objectName;
        this.f134492b = i17;
        this.f134493c = referenceName;
        this.f134494d = i18;
    }

    /* renamed from: equals */
    public boolean m41236xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.l)) {
            return false;
        }
        com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.l lVar = (com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.l) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f134491a, lVar.f134491a) && this.f134492b == lVar.f134492b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f134493c, lVar.f134493c) && this.f134494d == lVar.f134494d;
    }

    /* renamed from: hashCode */
    public int m41237x8cdac1b() {
        java.lang.String str = this.f134491a;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f134492b) * 31;
        java.lang.String str2 = this.f134493c;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f134494d;
    }

    /* renamed from: toString */
    public java.lang.String m41238x9616526c() {
        return "Node(objectName=" + this.f134491a + ", objectType=" + this.f134492b + ", referenceName=" + this.f134493c + ", referenceType=" + this.f134494d + ")";
    }
}
