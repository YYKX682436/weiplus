package bz0;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f36744a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f36745b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Integer f36746c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f36747d;

    public h(java.lang.String templateId, boolean z17, java.lang.Integer num, java.util.List behaviorIndex, int i17, kotlin.jvm.internal.i iVar) {
        templateId = (i17 & 1) != 0 ? "" : templateId;
        z17 = (i17 & 2) != 0 ? false : z17;
        num = (i17 & 4) != 0 ? null : num;
        behaviorIndex = (i17 & 8) != 0 ? new java.util.ArrayList() : behaviorIndex;
        kotlin.jvm.internal.o.g(templateId, "templateId");
        kotlin.jvm.internal.o.g(behaviorIndex, "behaviorIndex");
        this.f36744a = templateId;
        this.f36745b = z17;
        this.f36746c = num;
        this.f36747d = behaviorIndex;
    }
}
