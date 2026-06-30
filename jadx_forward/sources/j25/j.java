package j25;

@j95.b
/* loaded from: classes11.dex */
public class j extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public android.os.Handler f378848d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f378849e = new j25.i(this);

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        super.mo8845x3e5a77bb(context);
        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f378848d = handler;
        handler.postDelayed(this.f378849e, 20000L);
    }
}
