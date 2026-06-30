package wh2;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final wh2.f f527482a = new wh2.f();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f527483b;

    static {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9 e9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a;
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183668d);
        sb6.append("InteractiveGift/");
        f527483b = sb6.toString();
    }

    public final java.lang.String a(r45.kv1 gift) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gift, "gift");
        java.lang.String m75945x2fec8307 = gift.m75945x2fec8307(20);
        java.lang.String m75945x2fec83072 = gift.m75945x2fec8307(0);
        if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
            if (!(m75945x2fec83072 == null || m75945x2fec83072.length() == 0)) {
                return f527483b + com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(m75945x2fec8307 + '_' + m75945x2fec83072) + ".zip";
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderInteractiveGiftLoader", "getInteractiveGiftPath invalid url:" + m75945x2fec8307 + ", id:" + m75945x2fec83072);
        return null;
    }
}
