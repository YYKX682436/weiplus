package yt3;

/* loaded from: classes10.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.z f547245d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(yt3.z zVar) {
        super(1);
        this.f547245d = zVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        yt3.z zVar = this.f547245d;
        if (booleanValue) {
            ju3.d0.k(zVar.f547266e, ju3.c0.V, null, 2, null);
        } else {
            ju3.d0.k(zVar.f547266e, ju3.c0.W, null, 2, null);
        }
        return jz5.f0.f384359a;
    }
}
