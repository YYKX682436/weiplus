package bz0;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f118277a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f118278b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Integer f118279c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f118280d;

    public h(java.lang.String templateId, boolean z17, java.lang.Integer num, java.util.List behaviorIndex, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        templateId = (i17 & 1) != 0 ? "" : templateId;
        z17 = (i17 & 2) != 0 ? false : z17;
        num = (i17 & 4) != 0 ? null : num;
        behaviorIndex = (i17 & 8) != 0 ? new java.util.ArrayList() : behaviorIndex;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(behaviorIndex, "behaviorIndex");
        this.f118277a = templateId;
        this.f118278b = z17;
        this.f118279c = num;
        this.f118280d = behaviorIndex;
    }
}
