package android.support.v4.media;

/* loaded from: classes11.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Messenger f8934a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Bundle f8935b;

    public l(android.os.IBinder iBinder, android.os.Bundle bundle) {
        this.f8934a = new android.os.Messenger(iBinder);
        this.f8935b = bundle;
    }

    public final void a(int i17, android.os.Bundle bundle, android.os.Messenger messenger) {
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = i17;
        obtain.arg1 = 1;
        obtain.setData(bundle);
        obtain.replyTo = messenger;
        this.f8934a.send(obtain);
    }
}
