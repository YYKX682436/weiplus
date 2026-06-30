package bf3;

/* loaded from: classes7.dex */
public final class b extends com.tencent.mm.plugin.appbrand.jsruntime.a {

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.appbrand.commonjni.buffer.BufferURLManager f19611b;

    public b(com.tencent.mm.appbrand.commonjni.buffer.BufferURLManager impl) {
        kotlin.jvm.internal.o.g(impl, "impl");
        this.f19611b = impl;
        bf3.a aVar = new bf3.a(this);
        synchronized (impl.f53941b) {
            impl.f53941b.add(aVar);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.d1
    public java.nio.ByteBuffer a(java.lang.String str) {
        return this.f19611b.c(str);
    }
}
