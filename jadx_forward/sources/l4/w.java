package l4;

/* loaded from: classes13.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f397302a = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final l4.q f397303b;

    /* renamed from: c, reason: collision with root package name */
    public volatile p4.i f397304c;

    public w(l4.q qVar) {
        this.f397303b = qVar;
    }

    public p4.i a() {
        this.f397303b.a();
        if (!this.f397302a.compareAndSet(false, true)) {
            java.lang.String b17 = b();
            l4.q qVar = this.f397303b;
            qVar.a();
            qVar.b();
            return new q4.i(((q4.c) qVar.f397281c.d0()).f441540d.compileStatement(b17));
        }
        if (this.f397304c == null) {
            java.lang.String b18 = b();
            l4.q qVar2 = this.f397303b;
            qVar2.a();
            qVar2.b();
            this.f397304c = new q4.i(((q4.c) qVar2.f397281c.d0()).f441540d.compileStatement(b18));
        }
        return this.f397304c;
    }

    public abstract java.lang.String b();

    public void c(p4.i iVar) {
        if (iVar == this.f397304c) {
            this.f397302a.set(false);
        }
    }
}
