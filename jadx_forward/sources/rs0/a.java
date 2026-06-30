package rs0;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f480820a;

    /* renamed from: b, reason: collision with root package name */
    public final fp.j f480821b;

    public a(java.lang.String taskName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskName, "taskName");
        this.f480820a = taskName;
        fp.j jVar = new fp.j();
        this.f480821b = jVar;
        jVar.b();
    }

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CodeUtil", m162950x9616526c());
    }

    /* renamed from: toString */
    public java.lang.String m162950x9616526c() {
        return "CodeMan task " + this.f480820a + " cost : " + this.f480821b.a();
    }
}
