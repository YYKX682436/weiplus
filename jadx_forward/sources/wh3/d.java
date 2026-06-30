package wh3;

/* loaded from: classes10.dex */
public class d extends wh3.b {

    /* renamed from: d, reason: collision with root package name */
    public static final wh3.c f527500d = new wh3.c(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f527501e = java.lang.Math.max(4, java.lang.Runtime.getRuntime().availableProcessors());

    /* renamed from: f, reason: collision with root package name */
    public static final int f527502f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final long f527503g = 115964116992L;

    /* renamed from: h, reason: collision with root package name */
    public static final long f527504h = 1073741824;

    /* renamed from: c, reason: collision with root package name */
    public final dn.o f527505c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String mediaId, java.lang.String downloadUrl, dn.o taskInfo) {
        super(mediaId, downloadUrl);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadUrl, "downloadUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskInfo, "taskInfo");
        this.f527505c = taskInfo;
    }

    /* renamed from: toString */
    public java.lang.String m173804x9616526c() {
        return "OnlineCdnSource mediaId:" + this.f527498a + " url:" + this.f527499b;
    }
}
