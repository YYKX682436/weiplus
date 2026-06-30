package zu0;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f557216a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Bitmap f557217b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f557218c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f557219d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f557220e;

    public l(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a time, android.graphics.Bitmap bitmap, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(time, "time");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        this.f557216a = time;
        this.f557217b = bitmap;
        this.f557218c = str;
    }

    /* renamed from: equals */
    public boolean m179482xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(zu0.l.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.movie_composing.data.beans.SnapshotImageData");
        zu0.l lVar = (zu0.l) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f557216a, lVar.f557216a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f557217b, lVar.f557217b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f557218c, lVar.f557218c) && java.util.Arrays.equals(this.f557220e, lVar.f557220e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f557219d, lVar.f557219d);
    }

    /* renamed from: hashCode */
    public int m179483x8cdac1b() {
        int hashCode = ((this.f557216a.hashCode() * 31) + this.f557217b.hashCode()) * 31;
        java.lang.String str = this.f557218c;
        int hashCode2 = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + java.util.Arrays.hashCode(this.f557220e)) * 31;
        java.lang.String str2 = this.f557219d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m179484x9616526c() {
        return "SnapshotImageData(time=" + this.f557216a + ", bitmap=" + this.f557217b + ", imageOcrData=" + this.f557218c + ')';
    }
}
