package com.tencent.mm.loader.cache.memory;

/* loaded from: classes15.dex */
public abstract class e {
    public abstract hp0.g a(ip0.a aVar, dp0.a aVar2);

    public java.lang.String b(ip0.a aVar, dp0.a aVar2) {
        if (aVar == null) {
            return null;
        }
        if (!(aVar.f293573a != null)) {
            return null;
        }
        if (aVar2 != null) {
            java.lang.String aVar3 = aVar.toString();
            kotlin.jvm.internal.o.f(aVar3, "toString(...)");
            java.lang.String b17 = aVar2.b(aVar3);
            if (b17 != null) {
                return b17;
            }
        }
        java.lang.String aVar4 = aVar.toString();
        kotlin.jvm.internal.o.f(aVar4, "toString(...)");
        return aVar4;
    }

    public abstract void c(ip0.a aVar, dp0.a aVar2, java.lang.Object obj);

    public abstract void d(ip0.a aVar, dp0.a aVar2);
}
