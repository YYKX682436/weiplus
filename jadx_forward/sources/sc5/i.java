package sc5;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final sc5.i f488114a = new sc5.i();

    public final boolean a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        v05.a aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        boolean z17 = false;
        if (msg.I0() <= 0) {
            return false;
        }
        l15.c cVar = new l15.c();
        java.lang.String j17 = msg.j();
        if (j17 == null) {
            j17 = "";
        }
        cVar.m126728xdc93280d(j17);
        v05.b k17 = cVar.k();
        if (k17 != null && (aVar = (v05.a) k17.m75936x14adae67(k17.f513848e + 8)) != null && aVar.t() == msg.I0()) {
            z17 = true;
        }
        return !z17;
    }
}
