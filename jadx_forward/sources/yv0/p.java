package yv0;

/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 f547518a;

    /* renamed from: b, reason: collision with root package name */
    public final ug.m f547519b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f547520c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f547521d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f547522e;

    public p(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentId, ug.m segmentType, android.graphics.Rect cachedFrame, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentId, "segmentId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentType, "segmentType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cachedFrame, "cachedFrame");
        this.f547518a = segmentId;
        this.f547519b = segmentType;
        this.f547520c = z17;
        this.f547521d = z18;
        this.f547522e = cachedFrame;
    }

    /* renamed from: equals */
    public boolean m177731xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(yv0.p.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.timeline.StorylineSegmentInfo");
        yv0.p pVar = (yv0.p) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547518a, pVar.f547518a) && this.f547519b == pVar.f547519b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547522e, pVar.f547522e);
    }

    /* renamed from: hashCode */
    public int m177732x8cdac1b() {
        return (((this.f547518a.m32423x8cdac1b() * 31) + this.f547519b.hashCode()) * 31) + this.f547522e.hashCode();
    }
}
