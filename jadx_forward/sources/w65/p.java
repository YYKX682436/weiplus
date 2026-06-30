package w65;

/* loaded from: classes12.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public final w65.q f524895a;

    /* renamed from: b, reason: collision with root package name */
    public final w65.m f524896b;

    /* renamed from: c, reason: collision with root package name */
    public int f524897c;

    /* renamed from: d, reason: collision with root package name */
    public float f524898d;

    public p(w65.q status, w65.m task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        this.f524895a = status;
        this.f524896b = task;
    }

    /* renamed from: toString */
    public java.lang.String mo173287x9616526c() {
        return "id:" + this.f524896b.id() + " status:" + this.f524895a + " ret:" + this.f524897c + " taskPercent:" + this.f524898d;
    }
}
