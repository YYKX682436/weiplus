package com.p176xb6135e39.p280x308fcb.p281x21ffc6bd;

/* loaded from: classes16.dex */
public class m implements com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.reflect.Type f126353a;

    public m(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.r rVar, java.lang.reflect.Type type) {
        this.f126353a = type;
    }

    @Override // com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.d0
    public java.lang.Object a() {
        java.lang.reflect.Type type = this.f126353a;
        if (!(type instanceof java.lang.reflect.ParameterizedType)) {
            throw new com.p176xb6135e39.p280x308fcb.m("Invalid EnumSet type: " + type.toString());
        }
        java.lang.reflect.Type type2 = ((java.lang.reflect.ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof java.lang.Class) {
            return java.util.EnumSet.noneOf((java.lang.Class) type2);
        }
        throw new com.p176xb6135e39.p280x308fcb.m("Invalid EnumSet type: " + type.toString());
    }
}
