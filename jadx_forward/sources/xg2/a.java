package xg2;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final rm0.j f535912a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.CancellationException f535913b;

    public a(rm0.j jVar, java.util.concurrent.CancellationException cancellationException, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        jVar = (i17 & 1) != 0 ? null : jVar;
        cancellationException = (i17 & 2) != 0 ? null : cancellationException;
        this.f535912a = jVar;
        this.f535913b = cancellationException;
    }

    /* renamed from: toString */
    public java.lang.String m175486x9616526c() {
        java.lang.String jVar;
        rm0.j jVar2 = this.f535912a;
        if (jVar2 != null && (jVar = jVar2.toString()) != null) {
            return jVar;
        }
        return "cancelException: " + this.f535913b;
    }
}
