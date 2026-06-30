package com.p176xb6135e39.p280x308fcb.p281x21ffc6bd;

/* loaded from: classes15.dex */
public final class d implements java.lang.reflect.WildcardType, java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Type f126341d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.reflect.Type f126342e;

    public d(java.lang.reflect.Type[] typeArr, java.lang.reflect.Type[] typeArr2) {
        com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.a.a(typeArr2.length <= 1);
        com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.a.a(typeArr.length == 1);
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.e.b(typeArr[0]);
            this.f126342e = null;
            this.f126341d = com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.e.a(typeArr[0]);
            return;
        }
        typeArr2[0].getClass();
        com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.e.b(typeArr2[0]);
        com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.a.a(typeArr[0] == java.lang.Object.class);
        this.f126342e = com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.e.a(typeArr2[0]);
        this.f126341d = java.lang.Object.class;
    }

    /* renamed from: equals */
    public boolean m20495xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof java.lang.reflect.WildcardType) && com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.e.c(this, (java.lang.reflect.WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public java.lang.reflect.Type[] getLowerBounds() {
        java.lang.reflect.Type type = this.f126342e;
        return type != null ? new java.lang.reflect.Type[]{type} : com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.e.f126343a;
    }

    @Override // java.lang.reflect.WildcardType
    public java.lang.reflect.Type[] getUpperBounds() {
        return new java.lang.reflect.Type[]{this.f126341d};
    }

    /* renamed from: hashCode */
    public int m20496x8cdac1b() {
        java.lang.reflect.Type type = this.f126342e;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f126341d.hashCode() + 31);
    }

    /* renamed from: toString */
    public java.lang.String m20497x9616526c() {
        java.lang.reflect.Type type = this.f126342e;
        if (type != null) {
            return "? super " + com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.e.h(type);
        }
        java.lang.reflect.Type type2 = this.f126341d;
        if (type2 == java.lang.Object.class) {
            return "?";
        }
        return "? extends " + com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.e.h(type2);
    }
}
