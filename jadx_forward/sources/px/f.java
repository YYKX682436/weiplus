package px;

/* loaded from: classes.dex */
public final class f implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final px.f f440279d = new px.f();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj;
        java.lang.String str2 = (java.lang.String) obj2;
        jz5.g gVar = px.g.f440280a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        java.lang.String concat = "forward_clawbot_last_used_".concat(str);
        jz5.g gVar2 = px.g.f440280a;
        java.lang.Object mo141623x754a37bb = ((jz5.n) gVar2).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        long q17 = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) mo141623x754a37bb).q(concat, 0L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        java.lang.String concat2 = "forward_clawbot_last_used_".concat(str2);
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) gVar2).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        long q18 = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) mo141623x754a37bb2).q(concat2, 0L);
        if (q17 > 0 && q18 > 0) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.j(q18, q17);
        }
        if (q17 > 0) {
            return -1;
        }
        return q18 > 0 ? 1 : 0;
    }
}
