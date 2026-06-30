package pg2;

/* loaded from: classes3.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final pg2.s f435715d = new pg2.s();

    public s() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ug5.g it = (ug5.g) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("enterImage removeCallback player: ");
        java.util.HashMap hashMap = it.f509128i;
        sb6.append(hashMap.get("key_player"));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSurfaceViewService", sb6.toString());
        java.lang.Object obj2 = hashMap.get("key_player");
        nn0.c cVar = obj2 instanceof nn0.c ? (nn0.c) obj2 : null;
        if (cVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSurfaceViewService", "remove callback stop play");
            mn0.b0.C(cVar, true, false, false, 4, null);
        }
        return jz5.f0.f384359a;
    }
}
