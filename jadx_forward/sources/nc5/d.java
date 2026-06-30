package nc5;

/* loaded from: classes4.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nc5.o f417728d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(nc5.o oVar) {
        super(1);
        this.f417728d = oVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.ArrayList it = (java.util.ArrayList) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it6 = it.iterator();
        while (it6.hasNext()) {
            sb6.append((java.lang.String) ((android.util.Pair) it6.next()).first);
            sb6.append("#");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryQueryHeaderUI", "report sugText: " + ((java.lang.Object) sb6));
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        this.f417728d.c(sb7);
        return jz5.f0.f384359a;
    }
}
