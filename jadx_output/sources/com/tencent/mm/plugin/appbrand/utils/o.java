package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public final class o implements com.tencent.mm.plugin.appbrand.utils.p2 {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.utils.n f90519b = new com.tencent.mm.plugin.appbrand.utils.n(null);

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f90520a;

    public o(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f90520a = context;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.p2
    public com.tencent.mm.plugin.appbrand.utils.e4 a() {
        int i17 = this.f90520a.getResources().getConfiguration().orientation;
        return i17 != 1 ? i17 != 2 ? com.tencent.mm.plugin.appbrand.utils.e4.f90421d : com.tencent.mm.plugin.appbrand.utils.e4.f90423f : com.tencent.mm.plugin.appbrand.utils.e4.f90422e;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.p2
    public java.lang.String getName() {
        return "AndroidOrientationGetter";
    }
}
