package w03;

/* loaded from: classes11.dex */
public final class f extends bj0.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w03.h f523413a;

    public f(w03.h hVar) {
        this.f523413a = hVar;
    }

    @Override // bj0.t
    public void a(bj0.u observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        w03.h hVar = this.f523413a;
        na5.b a17 = w03.h.a(hVar, observer, true);
        if (a17 != null) {
            hVar.getClass();
            java.util.ArrayList arrayList = (java.util.ArrayList) hVar.f417527d;
            if (arrayList.contains(a17)) {
                return;
            }
            arrayList.add(a17);
        }
    }
}
