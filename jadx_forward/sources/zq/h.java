package zq;

/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final zq.h f556505a = new zq.h();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f556506b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final fp0.o f556507c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f556508d;

    static {
        fp0.o oVar = new fp0.o(new gp0.g(new zq.f(), new gp0.h(5, 5), 2, "EmojiLoader"));
        f556507c = oVar;
        oVar.g(new zq.g());
    }

    public final er.f a(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 emojiInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        er.f fVar = (er.f) f556506b.get(emojiInfo.mo42933xb5885648() + "_cover");
        return fVar == null ? new er.b(emojiInfo) : fVar;
    }

    public final void b(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiLoader", "cancel: " + view);
        dr.s sVar = (dr.s) view.getTag(com.p314xaae8f345.mm.R.id.dbt);
        if (sVar != null) {
            sVar.a();
        }
    }

    public final dr.g c(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 emojiInfo, dr.r rVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        dr.g gVar = new dr.g(emojiInfo, rVar);
        dr.s.g(gVar, false, 1, null);
        return gVar;
    }

    public final dr.i d(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 emojiInfo, android.widget.ImageView view, android.graphics.drawable.Drawable drawable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        dr.i iVar = new dr.i(emojiInfo, view, drawable);
        dr.s.g(iVar, false, 1, null);
        return iVar;
    }

    public final dr.j e(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 emojiInfo, dr.q qVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        return f(emojiInfo, true, qVar);
    }

    public final dr.j f(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 emojiInfo, boolean z17, dr.q qVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiLoader", "load emoji file " + emojiInfo.mo42933xb5885648());
        dr.j jVar = new dr.j(emojiInfo, qVar);
        jVar.f(z17);
        return jVar;
    }
}
