package na2;

/* loaded from: classes2.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ na2.f f417487d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(na2.f fVar) {
        super(2);
        this.f417487d = fVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((android.content.Context) obj, "<anonymous parameter 0>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((java.lang.String) obj2, "<anonymous parameter 1>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("audioExtractor finished, pendingPostParams=");
        na2.f fVar = this.f417487d;
        sb6.append(fVar.f417492f != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostPlayAudioExtractorUIC", sb6.toString());
        qs2.e eVar = fVar.f417492f;
        if (eVar != null) {
            fVar.f417492f = null;
            fVar.O6(eVar);
        }
        return jz5.f0.f384359a;
    }
}
