package c51;

/* loaded from: classes10.dex */
public final class a extends c51.c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f120160a;

    /* renamed from: b, reason: collision with root package name */
    public final int f120161b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String path, int i17) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f120160a = path;
        this.f120161b = i17;
    }

    /* renamed from: toString */
    public java.lang.String m14186x9616526c() {
        return "[Failed] path:" + this.f120160a + ", errcode:" + this.f120161b;
    }
}
