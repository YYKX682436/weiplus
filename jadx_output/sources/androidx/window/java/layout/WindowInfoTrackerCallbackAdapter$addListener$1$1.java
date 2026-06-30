package androidx.window.java.layout;

@qz5.f(c = "androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1", f = "WindowInfoTrackerCallbackAdapter.kt", l = {com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_IN_SETAUDIOEFFECT}, m = "invokeSuspend")
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/y0;", "Ljz5/f0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes14.dex */
public final class WindowInfoTrackerCallbackAdapter$addListener$1$1 extends qz5.l implements yz5.p {
    final /* synthetic */ m3.a $consumer;
    final /* synthetic */ kotlinx.coroutines.flow.j $flow;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInfoTrackerCallbackAdapter$addListener$1$1(kotlinx.coroutines.flow.j jVar, m3.a aVar, kotlin.coroutines.Continuation<? super androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1> continuation) {
        super(2, continuation);
        this.$flow = jVar;
        this.$consumer = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation<jz5.f0> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1(this.$flow, this.$consumer, continuation);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.label;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.j jVar = this.$flow;
            final m3.a aVar2 = this.$consumer;
            kotlinx.coroutines.flow.k kVar = new kotlinx.coroutines.flow.k() { // from class: androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1
                @Override // kotlinx.coroutines.flow.k
                public java.lang.Object emit(T t17, kotlin.coroutines.Continuation<? super jz5.f0> continuation) {
                    m3.a.this.accept(t17);
                    return jz5.f0.f302826a;
                }
            };
            this.label = 1;
            if (jVar.a(kVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }

    @Override // yz5.p
    public final java.lang.Object invoke(kotlinx.coroutines.y0 y0Var, kotlin.coroutines.Continuation<? super jz5.f0> continuation) {
        return ((androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1) create(y0Var, continuation)).invokeSuspend(jz5.f0.f302826a);
    }
}
