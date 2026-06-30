package androidx.compose.foundation.lazy.layout;

/* loaded from: classes14.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.lazy.layout.v f10445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.lazy.layout.k f10446e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s1.k2 f10447f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10448g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(androidx.compose.foundation.lazy.layout.v vVar, androidx.compose.foundation.lazy.layout.k kVar, s1.k2 k2Var, int i17) {
        super(2);
        this.f10445d = vVar;
        this.f10446e = kVar;
        this.f10447f = k2Var;
        this.f10448g = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f10448g | 1;
        androidx.compose.foundation.lazy.layout.k kVar = this.f10446e;
        s1.k2 k2Var = this.f10447f;
        androidx.compose.foundation.lazy.layout.z.a(this.f10445d, kVar, k2Var, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
