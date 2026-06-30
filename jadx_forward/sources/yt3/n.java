package yt3;

/* loaded from: classes10.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.p f547077d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(yt3.p pVar) {
        super(1);
        this.f547077d = pVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        yt3.p pVar = this.f547077d;
        if (booleanValue) {
            ju3.d0.k(pVar.f547108d, ju3.c0.G, null, 2, null);
        } else {
            ju3.d0.k(pVar.f547108d, ju3.c0.W, null, 2, null);
        }
        return jz5.f0.f384359a;
    }
}
