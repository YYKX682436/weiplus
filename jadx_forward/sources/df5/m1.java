package df5;

/* loaded from: classes10.dex */
public final class m1 extends df5.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final df5.e f313700a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(df5.e task) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        this.f313700a = task;
    }

    /* renamed from: equals */
    public boolean m124346xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof df5.m1) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f313700a, ((df5.m1) obj).f313700a);
    }

    /* renamed from: hashCode */
    public int m124347x8cdac1b() {
        return this.f313700a.m124315x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m124348x9616526c() {
        return "Feed(task=" + this.f313700a + ')';
    }
}
