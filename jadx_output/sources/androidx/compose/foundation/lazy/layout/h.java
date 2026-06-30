package androidx.compose.foundation.lazy.layout;

/* loaded from: classes14.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.lazy.layout.j f10402d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(androidx.compose.foundation.lazy.layout.j jVar) {
        super(1);
        this.f10402d = jVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n0.b2 DisposableEffect = (n0.b2) obj;
        kotlin.jvm.internal.o.g(DisposableEffect, "$this$DisposableEffect");
        return new androidx.compose.foundation.lazy.layout.g(this.f10402d);
    }
}
