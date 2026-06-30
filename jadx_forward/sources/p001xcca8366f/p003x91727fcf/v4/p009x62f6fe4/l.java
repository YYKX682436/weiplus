package p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4;

/* loaded from: classes11.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Messenger f90467a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Bundle f90468b;

    public l(android.os.IBinder iBinder, android.os.Bundle bundle) {
        this.f90467a = new android.os.Messenger(iBinder);
        this.f90468b = bundle;
    }

    public final void a(int i17, android.os.Bundle bundle, android.os.Messenger messenger) {
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = i17;
        obtain.arg1 = 1;
        obtain.setData(bundle);
        obtain.replyTo = messenger;
        this.f90467a.send(obtain);
    }
}
