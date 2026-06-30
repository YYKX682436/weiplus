package b30;

/* loaded from: classes9.dex */
public final class g {
    public g(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final b30.i a(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        jz5.g gVar = b30.i.f99097c;
        if (!((java.util.WeakHashMap) ((jz5.n) gVar).mo141623x754a37bb()).containsKey(activity)) {
            ((java.util.WeakHashMap) ((jz5.n) gVar).mo141623x754a37bb()).put(activity, new b30.i());
        }
        java.lang.Object obj = ((java.util.WeakHashMap) ((jz5.n) gVar).mo141623x754a37bb()).get(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        return (b30.i) obj;
    }
}
