package qd2;

/* loaded from: classes2.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qd2.g f443233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wt3.h0 f443234e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(qd2.g gVar, wt3.h0 h0Var) {
        super(2);
        this.f443233d = gVar;
        this.f443234e = h0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        this.f443233d.f443263d = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAudioExtractor", "[downloadImgBgm] success:" + booleanValue + " isFileLegal:" + this.f443233d.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a) this.f443234e).f237248i) + " filePath:" + ((java.lang.String) obj2) + '}');
        this.f443233d.c(booleanValue);
        return jz5.f0.f384359a;
    }
}
