package com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0015\u0010\u0016JS\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0086 J\u0011\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0086 J\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u0002H\u0086 J\u0011\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0086 ¨\u0006\u0019"}, d2 = {"Lcom/tencent/mm/appbrand/commonjni/TWasmCacheManagerJni;", "", "", "isolatePtr", "contextPtr", "", "appId", "packageMD5", "Ljava/nio/ByteBuffer;", "wasmBuffer", "wasmPath", "wasmCachePath", "", "threadNum", "funcListBuffer", "createTask", "task", "Ljz5/f0;", "destroyTask", "start", "stop", "<init>", "()V", "Companion", "al/a", "lib-wxa-common-binding_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: com.tencent.mm.appbrand.commonjni.TWasmCacheManagerJni */
/* loaded from: classes7.dex */
public final class C5134xe8c411a2 {

    /* renamed from: Companion */
    public static final al.a f21477x233c02ec = new al.a(null);
    public static final java.lang.String TAG = "TWasmCacheManagerJni";

    static {
        bl.d.f103207a.mo10716xeb57c8f5("wxa-runtime-binding");
    }

    /* renamed from: createTask */
    public final native long m43197x519c6ca1(long isolatePtr, long contextPtr, java.lang.String appId, java.lang.String packageMD5, java.nio.ByteBuffer wasmBuffer, java.lang.String wasmPath, java.lang.String wasmCachePath, int threadNum, java.nio.ByteBuffer funcListBuffer);

    /* renamed from: destroyTask */
    public final native void m43198x89d6bc9f(long j17);

    /* renamed from: start */
    public final native java.lang.String m43199x68ac462(long task);

    /* renamed from: stop */
    public final native void m43200x360802(long j17);
}
