package r23;

/* loaded from: classes3.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final r23.e f450355d = new r23.e();

    public e() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17;
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_publish_template_media_total_duration_seconds, 600);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplateExptConfig", "getPublishTemplateMediaTotalDurationLimitSeconds: " + Ni);
        if (r23.j.f450366g / 1000 > Ni) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            db5.e1.T(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573713fi4, java.lang.Integer.valueOf(a06.d.b(Ni / 60.0f))));
            z17 = false;
        } else {
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
