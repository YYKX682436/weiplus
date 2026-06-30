package ba0;

/* loaded from: classes9.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ba0.h f18676d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ba0.h hVar) {
        super(0);
        this.f18676d = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean n17 = com.tencent.mm.sdk.platformtools.x2.n();
        ba0.h hVar = this.f18676d;
        if (n17) {
            hVar.getClass();
            return new ba0.f(k31.h.f303839a);
        }
        if (!com.tencent.mm.sdk.platformtools.x2.s()) {
            return null;
        }
        hVar.getClass();
        return new h31.t();
    }
}
