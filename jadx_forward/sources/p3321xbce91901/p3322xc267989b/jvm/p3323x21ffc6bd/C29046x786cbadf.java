package p3321xbce91901.p3322xc267989b.jvm.p3323x21ffc6bd;

/* compiled from: DebugProbes.kt */
@p3321xbce91901.InterfaceC29042xe907df4f(mv = {1, 6, 0}, k = 2, xi = 48, d1 = {"��\u0012\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\"\u0010��\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b��\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H��\u001a\u0014\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001H��\u001a\u0014\u0010\u0007\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001H��¨\u0006\b"}, d2 = {"probeCoroutineCreated", "Lkotlin/coroutines/Continuation;", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2960xe17f46c3, "completion", "probeCoroutineResumed", "", "frame", "probeCoroutineSuspended", "kotlinx-coroutines-integration-testing_debugAgentTest"})
/* renamed from: kotlin.coroutines.jvm.internal.DebugProbesKt */
/* loaded from: wechat.apk:DebugProbesKt.bin */
public final class C29046x786cbadf {
    @org.jetbrains.annotations.NotNull
    /* renamed from: probeCoroutineCreated */
    public static final <T> p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<T> m143927x67549cc0(@org.jetbrains.annotations.NotNull p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<? super T> interfaceC29045xdcb5ca57) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interfaceC29045xdcb5ca57, "completion");
        return kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE.probeCoroutineCreated$kotlinx_coroutines_core(interfaceC29045xdcb5ca57);
    }

    /* renamed from: probeCoroutineResumed */
    public static final void m143928x6b715baf(@org.jetbrains.annotations.NotNull p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<?> interfaceC29045xdcb5ca57) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interfaceC29045xdcb5ca57, "frame");
        kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE.probeCoroutineResumed$kotlinx_coroutines_core(interfaceC29045xdcb5ca57);
    }

    /* renamed from: probeCoroutineSuspended */
    public static final void m143929x5deb95b3(@org.jetbrains.annotations.NotNull p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<?> interfaceC29045xdcb5ca57) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interfaceC29045xdcb5ca57, "frame");
        kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE.probeCoroutineSuspended$kotlinx_coroutines_core(interfaceC29045xdcb5ca57);
    }
}
