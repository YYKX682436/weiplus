package i13;

/* loaded from: classes5.dex */
public abstract class r extends i13.c {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f368852h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f368853i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(java.lang.String id6, java.lang.String title, java.lang.String msg, long j17) {
        super(id6, j17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        this.f368852h = title;
        this.f368853i = msg;
    }

    @Override // i13.c
    public java.lang.String c() {
        return this.f368852h;
    }

    @Override // in5.c
    public int h() {
        return 5;
    }
}
