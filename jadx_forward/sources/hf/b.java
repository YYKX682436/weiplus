package hf;

/* loaded from: classes11.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f362518a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f362519b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f362520c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f362521d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f362522e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f362523f;

    /* renamed from: g, reason: collision with root package name */
    public final int f362524g;

    public b(java.lang.String deviceParameters, java.lang.String customParameters, java.lang.String applicationParameters, java.lang.String dateTime, java.lang.String context, java.lang.String crashContent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceParameters, "deviceParameters");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(customParameters, "customParameters");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(applicationParameters, "applicationParameters");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dateTime, "dateTime");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(crashContent, "crashContent");
        this.f362518a = deviceParameters;
        this.f362519b = customParameters;
        this.f362520c = applicationParameters;
        this.f362521d = dateTime;
        this.f362522e = context;
        this.f362523f = crashContent;
        this.f362524g = i17;
    }

    /* renamed from: toString */
    public java.lang.String m133464x9616526c() {
        return "Report(deviceParameters='" + this.f362518a + "', customParameters='" + this.f362519b + "', applicationParameters='" + this.f362520c + "', dateTime='" + this.f362521d + "', context='" + this.f362522e + "', crashContent='" + this.f362523f + "', killSelf=" + this.f362524g + ')';
    }
}
