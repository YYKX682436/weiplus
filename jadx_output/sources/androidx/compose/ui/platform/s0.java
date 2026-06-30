package androidx.compose.ui.platform;

/* loaded from: classes3.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f10740d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(n0.v2 v2Var) {
        super(1);
        this.f10740d = v2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.content.res.Configuration it = (android.content.res.Configuration) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f10740d.setValue(it);
        return jz5.f0.f302826a;
    }
}
