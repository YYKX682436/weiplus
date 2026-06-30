package ws2;

/* loaded from: classes3.dex */
public final class x0 implements dk2.rg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ws2.k1 f530687a;

    public x0(ws2.k1 k1Var) {
        this.f530687a = k1Var;
    }

    public void a(java.lang.String sdkUserId, float f17, java.lang.String gestureId, java.lang.String randomId, float f18, float f19, float f27, float f28, java.lang.String giftComboId, java.lang.String giftSoundId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sdkUserId, "sdkUserId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gestureId, "gestureId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(randomId, "randomId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftComboId, "giftComboId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftSoundId, "giftSoundId");
        java.util.Iterator it = ((java.util.ArrayList) this.f530687a.f530602a).iterator();
        while (it.hasNext()) {
            ((yz5.b) it.next()).V(sdkUserId, java.lang.Float.valueOf(f17), gestureId, randomId, java.lang.Float.valueOf(f18), java.lang.Float.valueOf(f19), java.lang.Float.valueOf(f27), java.lang.Float.valueOf(f28), giftComboId, giftSoundId);
        }
    }
}
