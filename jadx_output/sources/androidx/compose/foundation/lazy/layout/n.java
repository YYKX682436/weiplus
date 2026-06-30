package androidx.compose.foundation.lazy.layout;

/* loaded from: classes14.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.lazy.layout.k f10417d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f10418e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(androidx.compose.foundation.lazy.layout.k kVar, yz5.p pVar) {
        super(2);
        this.f10417d = kVar;
        this.f10418e = pVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        s1.l2 l2Var = (s1.l2) obj;
        long j17 = ((p2.c) obj2).f351377a;
        kotlin.jvm.internal.o.g(l2Var, "$this$null");
        androidx.compose.foundation.lazy.layout.k kVar = this.f10417d;
        kVar.getClass();
        if (!kotlin.jvm.internal.o.b(l2Var, kVar.f10413d) || !p2.c.b(j17, kVar.f10414e)) {
            kVar.f10413d = l2Var;
            kVar.f10414e = j17;
            ((java.util.LinkedHashMap) kVar.f10412c).clear();
        }
        return (s1.u0) this.f10418e.invoke(new androidx.compose.foundation.lazy.layout.s(kVar, l2Var), new p2.c(j17));
    }
}
