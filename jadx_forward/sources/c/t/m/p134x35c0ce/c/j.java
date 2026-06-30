package c.t.m.p134x35c0ce.c;

/* loaded from: classes4.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public java.io.File f118435a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Context f118436b;

    public j(android.content.Context context) {
        if (context == null) {
            return;
        }
        this.f118436b = context.getApplicationContext();
        try {
            this.f118435a = new java.io.File(context.getExternalFilesDir(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306).getAbsolutePath() + "/d_l");
        } catch (java.lang.Throwable unused) {
            this.f118435a = null;
        }
    }
}
