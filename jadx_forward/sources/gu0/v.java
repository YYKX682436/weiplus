package gu0;

/* loaded from: classes5.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu0.o f357356d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p880x4ac6c74f.p882xed08e3c8.ActivityC10926xa2f37a4e f357357e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hu0.a0 f357358f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hu0.l f357359g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(hu0.o oVar, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p880x4ac6c74f.p882xed08e3c8.ActivityC10926xa2f37a4e activityC10926xa2f37a4e, hu0.a0 a0Var, hu0.l lVar) {
        super(1);
        this.f357356d = oVar;
        this.f357357e = activityC10926xa2f37a4e;
        this.f357358f = a0Var;
        this.f357359g = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        hu0.o oVar = this.f357356d;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p880x4ac6c74f.p882xed08e3c8.ActivityC10926xa2f37a4e activityC10926xa2f37a4e = this.f357357e;
        if (str != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.PreviewUI", "preparePreview failed: ".concat(str));
            hu0.o.P6(oVar, null, new gu0.t(activityC10926xa2f37a4e), 1, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.PreviewUI", "prepare Preview success, start playback");
            com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a m67438x827fa4bb = activityC10926xa2f37a4e.m67438x827fa4bb();
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(m67438x827fa4bb, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new gu0.u(this.f357358f, this.f357359g, oVar, null), 2, null);
        }
        return jz5.f0.f384359a;
    }
}
