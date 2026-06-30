package vu0;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 f521650a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4179xedb0cdf9 f521651b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f521652c;

    public m(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4179xedb0cdf9 captionItem, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a duration) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(captionItem, "captionItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(duration, "duration");
        this.f521650a = segmentID;
        this.f521651b = captionItem;
        this.f521652c = duration;
    }

    /* renamed from: equals */
    public boolean m172631xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu0.m)) {
            return false;
        }
        vu0.m mVar = (vu0.m) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521650a, mVar.f521650a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521651b, mVar.f521651b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521652c, mVar.f521652c);
    }

    /* renamed from: hashCode */
    public int m172632x8cdac1b() {
        return (((this.f521650a.m32423x8cdac1b() * 31) + this.f521651b.hashCode()) * 31) + this.f521652c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m172633x9616526c() {
        return "TimbreIdentity(segmentID=" + this.f521650a + ", captionItem=" + this.f521651b + ", duration=" + this.f521652c + ')';
    }
}
