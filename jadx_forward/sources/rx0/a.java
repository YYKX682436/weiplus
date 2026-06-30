package rx0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final rx0.b f482436a;

    /* renamed from: b, reason: collision with root package name */
    public final rx0.d f482437b;

    /* renamed from: c, reason: collision with root package name */
    public final rx0.c f482438c;

    public a(rx0.b taskType, rx0.d dVar, rx0.c cVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskType, "taskType");
        this.f482436a = taskType;
        this.f482437b = dVar;
        this.f482438c = cVar;
    }

    /* renamed from: equals */
    public boolean m163364xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx0.a)) {
            return false;
        }
        rx0.a aVar = (rx0.a) obj;
        return this.f482436a == aVar.f482436a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482437b, aVar.f482437b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482438c, aVar.f482438c);
    }

    /* renamed from: hashCode */
    public int m163365x8cdac1b() {
        int hashCode = this.f482436a.hashCode() * 31;
        rx0.d dVar = this.f482437b;
        int m163374x8cdac1b = (hashCode + (dVar == null ? 0 : dVar.m163374x8cdac1b())) * 31;
        rx0.c cVar = this.f482438c;
        return m163374x8cdac1b + (cVar != null ? cVar.m163371x8cdac1b() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m163366x9616526c() {
        return "AIGCTaskInfo(taskType=" + this.f482436a + ", createTaskInfo=" + this.f482437b + ", queryTaskInfo=" + this.f482438c + ')';
    }
}
