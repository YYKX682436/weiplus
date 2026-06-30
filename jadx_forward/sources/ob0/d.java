package ob0;

/* loaded from: classes12.dex */
public abstract class d {

    /* renamed from: continuation */
    private ob0.e f73028xd2ea7637;

    /* renamed from: name */
    private final java.lang.String f73029x337a8b;

    public d(java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f73029x337a8b = name;
    }

    /* renamed from: attach */
    public final void m150907xac1eee45(ob0.e continuation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(continuation, "continuation");
        this.f73028xd2ea7637 = continuation;
    }

    /* renamed from: getContinuation */
    public final ob0.e m150908x33dd08ad() {
        ob0.e eVar = this.f73028xd2ea7637;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
        return eVar;
    }

    /* renamed from: getName */
    public final java.lang.String m150909xfb82e301() {
        return this.f73029x337a8b;
    }

    /* renamed from: onResume */
    public abstract void mo46781x57429eec();

    /* renamed from: onSuspend */
    public abstract void mo46783xe142a15d();
}
