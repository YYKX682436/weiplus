package com.tencent.mm.plugin.appbrand.av_device_usage;

/* loaded from: classes7.dex */
public final class h extends com.tencent.mm.plugin.appbrand.av_device_usage.j {

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f76706b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(fb1.d scene, yz5.a dataGetter) {
        super(scene, false, null);
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(dataGetter, "dataGetter");
        this.f76706b = dataGetter;
    }

    @Override // com.tencent.mm.plugin.appbrand.av_device_usage.j
    public boolean a() {
        return ((java.lang.Boolean) this.f76706b.invoke()).booleanValue();
    }
}
