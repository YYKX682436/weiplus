package jy;

/* loaded from: classes14.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d0 f384003a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w f384004b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.n0 f384005c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w1 f384006d;

    public m(com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d0 roomInfo, com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w openScreen, com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.n0 roomScene, com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w1 reportAiChatExtInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomInfo, "roomInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openScreen, "openScreen");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomScene, "roomScene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportAiChatExtInfo, "reportAiChatExtInfo");
        this.f384003a = roomInfo;
        this.f384004b = openScreen;
        this.f384005c = roomScene;
        this.f384006d = reportAiChatExtInfo;
    }

    /* renamed from: equals */
    public boolean m141485xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jy.m)) {
            return false;
        }
        jy.m mVar = (jy.m) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f384003a, mVar.f384003a) && this.f384004b == mVar.f384004b && this.f384005c == mVar.f384005c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f384006d, mVar.f384006d);
    }

    /* renamed from: hashCode */
    public int m141486x8cdac1b() {
        return (((((this.f384003a.hashCode() * 31) + this.f384004b.hashCode()) * 31) + this.f384005c.hashCode()) * 31) + this.f384006d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m141487x9616526c() {
        return "ScreenInfo(roomInfo=" + this.f384003a + ", openScreen=" + this.f384004b + ", roomScene=" + this.f384005c + ", reportAiChatExtInfo=" + this.f384006d + ')';
    }
}
