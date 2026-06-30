package dk2;

/* loaded from: classes3.dex */
public final class g7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315042d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(java.lang.String str) {
        super(1);
        this.f315042d = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.p3363xbe4143f1.C29690xfae77312 pagFile = (org.p3363xbe4143f1.C29690xfae77312) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pagFile, "pagFile");
        java.util.HashMap hashMap = dk2.u7.f315725l;
        java.lang.String str = this.f315042d;
        java.lang.Long l17 = (java.lang.Long) hashMap.get(str);
        if (l17 == null) {
            l17 = 0L;
        }
        if (0 == l17.longValue()) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = new com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b(context);
            ym5.l2 l2Var = ym5.l2.f544957a;
            ym5.j2[] j2VarArr = ym5.j2.f544925d;
            c22789xd23e9a9b.o(ae2.in.f85221a.a(ym5.f6.Q1));
            c22789xd23e9a9b.mo82568x3e3ac3e8(pagFile);
            hashMap.put(str, java.lang.Long.valueOf(c22789xd23e9a9b.c()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftLoader", "[syncPagFromLiveMsg] giftFullPagDurationMap: giftId = " + str + ", duration = " + hashMap.get(str));
        }
        return jz5.f0.f384359a;
    }
}
