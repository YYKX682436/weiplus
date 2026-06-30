package c.t.m.sapp.c;

/* loaded from: classes4.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public java.io.File f36902a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Context f36903b;

    public j(android.content.Context context) {
        if (context == null) {
            return;
        }
        this.f36903b = context.getApplicationContext();
        try {
            this.f36902a = new java.io.File(context.getExternalFilesDir(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA).getAbsolutePath() + "/d_l");
        } catch (java.lang.Throwable unused) {
            this.f36902a = null;
        }
    }
}
