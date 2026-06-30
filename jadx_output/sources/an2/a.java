package an2;

/* loaded from: classes14.dex */
public final class a implements an2.b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f8840a;

    /* renamed from: b, reason: collision with root package name */
    public final lo0.m f8841b;

    public a(java.lang.String label, lo0.m group) {
        kotlin.jvm.internal.o.g(label, "label");
        kotlin.jvm.internal.o.g(group, "group");
        this.f8840a = label;
        this.f8841b = group;
    }

    @Override // an2.b
    public java.lang.String a() {
        return "live_beauty_group_" + this.f8841b.f320045a;
    }

    @Override // an2.b
    public java.lang.String b() {
        return this.f8840a;
    }
}
