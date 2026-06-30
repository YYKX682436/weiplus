package rw2;

/* loaded from: classes10.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rw2.j f482123d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(rw2.j jVar) {
        super(2);
        this.f482123d = jVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        kk4.v vVar;
        ((java.lang.Number) obj2).intValue();
        rw2.j jVar = this.f482123d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(jVar.f482140c, "video download complete");
        jVar.f482145h = true;
        if (jVar.f482143f) {
            java.lang.Object obj3 = jVar.f482142e.get(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "get(...)");
            long j17 = ((rw2.g) obj3).f482129a;
            jVar.f482141d.f482172p = j17;
            if (jVar.f482145h && (vVar = jVar.f482144g) != null) {
                kk4.b.f(vVar, (int) j17, true, null, 4, null);
            }
        } else {
            jVar.c();
        }
        return jz5.f0.f384359a;
    }
}
