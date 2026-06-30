package j25;

@j95.b
/* loaded from: classes11.dex */
public class n extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public android.os.Handler f378855d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f378856e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f378857f = new j25.m(this);

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        super.mo8845x3e5a77bb(context);
        java.util.List list = this.f378856e;
        ((java.util.ArrayList) list).add(new k25.c());
        ((java.util.ArrayList) list).add(new k25.b());
        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f378855d = handler;
        handler.postDelayed(this.f378857f, 15000L);
    }
}
