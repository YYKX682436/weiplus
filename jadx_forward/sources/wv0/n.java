package wv0;

/* loaded from: classes5.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wv0.q f531458d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(wv0.q qVar) {
        super(2);
        this.f531458d = qVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        sv0.j m174519xdf919e9b;
        sv0.j m174519xdf919e9b2;
        int intValue = ((java.lang.Number) obj).intValue();
        vv0.n data = (vv0.n) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        wv0.q qVar = this.f531458d;
        m174519xdf919e9b = qVar.m174519xdf919e9b();
        m174519xdf919e9b.m165374x9dcc288c();
        m174519xdf919e9b2 = qVar.m174519xdf919e9b();
        m174519xdf919e9b2.z(intValue, data);
        yz5.l m174524xa3bfa8a9 = qVar.m174524xa3bfa8a9();
        if (m174524xa3bfa8a9 != null) {
            m174524xa3bfa8a9.mo146xb9724478(data.f521931a);
        }
        return jz5.f0.f384359a;
    }
}
