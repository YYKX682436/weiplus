package c51;

/* loaded from: classes10.dex */
public final class a extends c51.c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f38627a;

    /* renamed from: b, reason: collision with root package name */
    public final int f38628b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String path, int i17) {
        super(null);
        kotlin.jvm.internal.o.g(path, "path");
        this.f38627a = path;
        this.f38628b = i17;
    }

    public java.lang.String toString() {
        return "[Failed] path:" + this.f38627a + ", errcode:" + this.f38628b;
    }
}
