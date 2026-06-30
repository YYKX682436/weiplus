package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.ComposeView f10748d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10749e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(androidx.compose.ui.platform.ComposeView composeView, int i17) {
        super(2);
        this.f10748d = composeView;
        this.f10749e = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f10749e | 1;
        this.f10748d.a((n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
