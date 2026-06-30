package com.tencent.mm.matrix;

/* loaded from: classes8.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.matrix.m0 f68726d = new com.tencent.mm.matrix.m0();

    public m0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.g gVar = com.tencent.mm.matrix.n0.f68824a;
        java.lang.reflect.Field declaredField = ((java.lang.Class) ((jz5.n) com.tencent.mm.matrix.n0.f68825b).getValue()).getDeclaredField("mAnimationObjs");
        declaredField.setAccessible(true);
        java.lang.Object obj = declaredField.get(((jz5.n) com.tencent.mm.matrix.n0.f68824a).getValue());
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type java.util.LinkedHashMap<*, *>{ kotlin.collections.TypeAliasesKt.LinkedHashMap<*, *> }");
        return (java.util.LinkedHashMap) obj;
    }
}
