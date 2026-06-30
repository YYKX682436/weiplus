package com.tencent.mm.plugin.appbrand.launch.magicbrush_frame;

/* loaded from: classes7.dex */
public final class j0 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.j0 f84294d = new com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.j0();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        fj1.y yVar = (fj1.y) obj;
        fj1.y yVar2 = (fj1.y) obj2;
        if (kotlin.jvm.internal.o.b(yVar, yVar2)) {
            return 0;
        }
        return yVar.hashCode() - yVar2.hashCode();
    }
}
