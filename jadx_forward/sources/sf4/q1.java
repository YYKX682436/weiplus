package sf4;

/* loaded from: classes4.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public final if4.h f489104a;

    /* renamed from: b, reason: collision with root package name */
    public int f489105b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f489106c;

    public q1(int i17, int i18, if4.h item, int i19, int i27) {
        java.lang.String b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f489104a = item;
        this.f489105b = i19;
        java.lang.String str = item.f372791f.f471556f;
        int i28 = item.f372788c;
        if (str == null) {
            b17 = "story_local_video_" + i28;
        } else {
            b17 = com.p314xaae8f345.mm.p947xba6de98f.i2.b("storyvideo", i28, "story", str);
        }
        b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17) ? null : b17;
        this.f489106c = b17 == null ? "" : b17;
    }

    public /* synthetic */ q1(int i17, int i18, if4.h hVar, int i19, int i27, int i28, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(i17, i18, hVar, (i28 & 8) != 0 ? 0 : i19, (i28 & 16) != 0 ? 1 : i27);
    }
}
