package af5;

/* loaded from: classes9.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22073xa4763271 f86170d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z01.g f86171e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22073xa4763271 c22073xa4763271, z01.g gVar) {
        super(2);
        this.f86170d = c22073xa4763271;
        this.f86171e = gVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.widget.ImageView thumbIv = (android.widget.ImageView) obj;
        yz5.l successCallback = (yz5.l) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbIv, "thumbIv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(successCallback, "successCallback");
        p3325xe03a0797.p3326xc267989b.l.d(v65.m.a(this.f86170d), null, null, new af5.r(this.f86170d, this.f86171e, thumbIv, successCallback, null), 3, null);
        return jz5.f0.f384359a;
    }
}
