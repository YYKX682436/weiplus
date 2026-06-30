package v22;

/* loaded from: classes10.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final v22.j f514357a = new v22.j();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedList f514358b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public static final fp0.o f514359c;

    /* renamed from: d, reason: collision with root package name */
    public static final yz5.a f514360d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.List f514361e;

    static {
        fp0.o oVar = new fp0.o(new gp0.g(new gp0.b(20, Integer.MAX_VALUE), new gp0.h(1, 5), 1, "EmojiMix"));
        f514359c = oVar;
        f514360d = v22.i.f514356d;
        f514361e = java.util.Collections.synchronizedList(new java.util.LinkedList());
        oVar.g(new v22.h());
    }

    public final v22.g a(int i17, long j17, java.lang.String videoPath, v22.a retriever, int i18, boolean z17, t85.j jVar, com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 emojiInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPath, "videoPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(retriever, "retriever");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(rr.s.f480682a.c() + "/temp/");
        sb7.append("capture_emoji/");
        java.lang.String sb8 = sb7.toString();
        com.p314xaae8f345.mm.vfs.w6.u(sb8);
        sb6.append(sb8);
        sb6.append("temp_gif");
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(java.lang.System.currentTimeMillis());
        v22.g gVar = new v22.g(i17, j17, videoPath, sb6.toString(), retriever, i18, z17, jVar, !t22.o.f496634b, emojiInfo);
        f514361e.add(gVar);
        f514359c.a(new v22.m(gVar));
        f514358b.add(gVar);
        final yz5.a aVar = f514360d;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(new java.lang.Runnable(aVar) { // from class: v22.k

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f514362d;

            {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "function");
                this.f514362d = aVar;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f514362d.mo152xb9724478();
            }
        });
        j45.l.A(new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.p1379x65fca6e.C13386x2f7d1e55.class));
        return gVar;
    }
}
