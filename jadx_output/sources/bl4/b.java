package bl4;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public bw5.eq0 f21732a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f21733b;

    /* renamed from: c, reason: collision with root package name */
    public int f21734c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f21735d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f21736e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.lp0 f21737f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.o50 f21738g;

    public b(bw5.eq0 bizType, java.lang.String id6, int i17, java.lang.String title, java.lang.String coverUrl, com.tencent.mm.protobuf.g gVar, int i18, kotlin.jvm.internal.i iVar) {
        kotlin.jvm.internal.o.g(bizType, "bizType");
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(coverUrl, "coverUrl");
        this.f21732a = bizType;
        this.f21733b = id6;
        this.f21734c = i17;
        this.f21735d = title;
        this.f21736e = coverUrl;
    }

    public final boolean a(bl4.b bVar) {
        return kotlin.jvm.internal.o.b(this.f21733b, bVar != null ? bVar.f21733b : null);
    }

    public java.lang.String toString() {
        return "TingFloatBallViewInfo [bizType: " + this.f21732a + ", title: " + this.f21735d + ", status: " + this.f21734c + ", id: " + this.f21733b + ']';
    }
}
