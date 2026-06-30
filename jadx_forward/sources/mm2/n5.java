package mm2;

/* loaded from: classes8.dex */
public final class n5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.yx1 f410823d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f410824e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f410825f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(r45.yx1 yx1Var, java.lang.String str, yz5.p pVar) {
        super(2);
        this.f410823d = yx1Var;
        this.f410824e = str;
        this.f410825f = pVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        long longValue2 = ((java.lang.Number) obj2).longValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveRequestSongSlice", "downloadKtvBGMResource progress: songId: " + this.f410823d.f472991d + " resource " + this.f410824e + " totalLen " + longValue + ", finishedLen " + longValue2);
        this.f410825f.mo149xb9724478(java.lang.Long.valueOf(longValue), java.lang.Long.valueOf(longValue2));
        return jz5.f0.f384359a;
    }
}
