package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.AndroidComposeView f10780d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f10781e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10782f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(androidx.compose.ui.platform.AndroidComposeView androidComposeView, yz5.p pVar, int i17) {
        super(2);
        this.f10780d = androidComposeView;
        this.f10781e = pVar;
        this.f10782f = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f10782f | 1;
        androidx.compose.ui.platform.a1.a(this.f10780d, this.f10781e, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
