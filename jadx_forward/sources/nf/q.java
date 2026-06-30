package nf;

/* loaded from: classes7.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nf.r f418132d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(nf.r rVar) {
        super(0);
        this.f418132d = rVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        nf.r rVar = this.f418132d;
        java.lang.String str = rVar.f418133a;
        if (str == null) {
            java.lang.Object obj = rVar.f418136d;
            if (obj == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("thisRef");
                throw null;
            }
            str = obj.getClass().getCanonicalName();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N(str, 2, null);
    }
}
