package un0;

/* loaded from: classes3.dex */
public final class c {
    public c(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.content.Intent intent, java.lang.Class cls, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        jz2.x0 x0Var = jz2.x0.f384287a;
        intent.putExtra("NOTICE_LAUNCH_KEY", p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls, (java.lang.Class) ((jz5.n) jz2.x0.f384292f).mo141623x754a37bb()) ? 2 : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls, (java.lang.Class) ((jz5.n) jz2.x0.f384291e).mo141623x754a37bb()) ? 1 : 0);
        intent.putExtra("START_SERVICE_FROM_KEY", i17);
    }
}
