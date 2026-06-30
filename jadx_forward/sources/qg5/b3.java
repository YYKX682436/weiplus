package qg5;

/* loaded from: classes8.dex */
public final class b3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f444462a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f444463b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f444464c;

    public b3(java.lang.String shareSessionId, java.util.Map sharedReportParameters, java.util.Map extraInfo, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        sharedReportParameters = (i17 & 2) != 0 ? new java.util.concurrent.ConcurrentHashMap() : sharedReportParameters;
        extraInfo = (i17 & 4) != 0 ? new java.util.concurrent.ConcurrentHashMap() : extraInfo;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareSessionId, "shareSessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sharedReportParameters, "sharedReportParameters");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraInfo, "extraInfo");
        this.f444462a = shareSessionId;
        this.f444463b = sharedReportParameters;
        this.f444464c = extraInfo;
    }
}
