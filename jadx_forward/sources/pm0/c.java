package pm0;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f438296a;

    /* renamed from: b, reason: collision with root package name */
    public final fp.j f438297b;

    public c(java.lang.String taskName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskName, "taskName");
        this.f438296a = taskName;
        fp.j jVar = new fp.j();
        this.f438297b = jVar;
        jVar.b();
    }

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CodeUtil", m158702x9616526c());
    }

    /* renamed from: toString */
    public java.lang.String m158702x9616526c() {
        return "CodeMan task " + this.f438296a + " cost : " + this.f438297b.a();
    }
}
