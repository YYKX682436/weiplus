package com.tencent.mm.plugin.appbrand.av_device_usage;

/* loaded from: classes7.dex */
public final class i extends com.tencent.mm.plugin.appbrand.av_device_usage.j {

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.g0 f76709b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(fb1.d scene, androidx.lifecycle.j0 mutable) {
        super(scene, true, null);
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(mutable, "mutable");
        this.f76709b = mutable;
    }

    @Override // com.tencent.mm.plugin.appbrand.av_device_usage.j
    public boolean a() {
        java.lang.Boolean bool = (java.lang.Boolean) this.f76709b.getValue();
        if (bool == null) {
            bool = java.lang.Boolean.FALSE;
        }
        return bool.booleanValue();
    }
}
