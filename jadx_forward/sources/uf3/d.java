package uf3;

/* loaded from: classes12.dex */
public final class d implements y51.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uf3.g f508714a;

    public d(uf3.g gVar) {
        this.f508714a = gVar;
    }

    @Override // y51.d
    public void a(long j17, int i17) {
        java.lang.Object[] objArr = {java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17)};
        uf3.g gVar = this.f508714a;
        gVar.P("onParseVideoError >> mediaId: %d, errCode: %d", objArr);
        gVar.S(gVar.K().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fjg));
    }

    @Override // y51.d
    public void b(long j17, aq.u0 videoMetaData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoMetaData, "videoMetaData");
        this.f508714a.P("onParseVideoSuccess >> mediaId: " + j17 + " w-h:(" + java.lang.Integer.valueOf(videoMetaData.f94512e) + '-' + java.lang.Integer.valueOf(videoMetaData.f94511d) + ')', new java.lang.Object[0]);
    }
}
