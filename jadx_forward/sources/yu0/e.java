package yu0;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final yu0.c f547319a;

    /* renamed from: b, reason: collision with root package name */
    public final yu0.s f547320b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f547321c;

    public e(yu0.c task, yu0.s resultData, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultData, "resultData");
        this.f547319a = task;
        this.f547320b = resultData;
        this.f547321c = z17;
    }

    /* renamed from: equals */
    public boolean m177667xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu0.e)) {
            return false;
        }
        yu0.e eVar = (yu0.e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547319a, eVar.f547319a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547320b, eVar.f547320b) && this.f547321c == eVar.f547321c;
    }

    /* renamed from: hashCode */
    public int m177668x8cdac1b() {
        return (((this.f547319a.m177662x8cdac1b() * 31) + this.f547320b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f547321c);
    }

    /* renamed from: toString */
    public java.lang.String m177669x9616526c() {
        return "AudioTaskResult(task=" + this.f547319a + ", resultData=" + this.f547320b + ", isCancel=" + this.f547321c + ')';
    }
}
