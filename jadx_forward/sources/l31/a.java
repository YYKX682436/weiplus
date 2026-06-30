package l31;

/* loaded from: classes9.dex */
public final class a implements f31.e {

    /* renamed from: d, reason: collision with root package name */
    public final f31.e f396843d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f396844e;

    public a(l31.b task, f31.e eVar, f31.f netScene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(netScene, "netScene");
        this.f396843d = eVar;
        this.f396844e = new java.lang.ref.WeakReference(task);
    }

    @Override // f31.e
    public void a(int i17, int i18, java.lang.String errMsg, com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        l31.b bVar = (l31.b) this.f396844e.get();
        if (bVar != null) {
            k31.o.f385383a.a(bVar);
        }
        f31.e eVar = this.f396843d;
        if (eVar != null) {
            eVar.a(i17, i18, errMsg, c11158xe7d16ed5);
        }
    }
}
