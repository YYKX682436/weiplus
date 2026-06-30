package m91;

/* loaded from: classes7.dex */
public final class a implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public static final m91.a f406474d = new m91.a();

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        java.util.LinkedHashMap linkedHashMap = m91.f.f406486c;
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        java.util.Set keySet = linkedHashMap.keySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet, "<get-keys>(...)");
        m91.c cVar = (m91.c) kz5.n0.h0(keySet);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.g gVar = new com.p314xaae8f345.mm.sdk.p2603x2137b148.g();
        gVar.f274244a = cVar.f406476d;
        gVar.f274245b = cVar.f406477e;
        return gVar;
    }
}
