package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.x f10564d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(androidx.compose.ui.platform.x xVar) {
        super(1);
        this.f10564d = xVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        androidx.compose.ui.platform.y3 it = (androidx.compose.ui.platform.y3) obj;
        kotlin.jvm.internal.o.g(it, "it");
        androidx.compose.ui.platform.x xVar = this.f10564d;
        xVar.getClass();
        if (it.isValid()) {
            xVar.f10787e.getSnapshotObserver().a(it, xVar.C, new androidx.compose.ui.platform.f0(it, xVar));
        }
        return jz5.f0.f302826a;
    }
}
