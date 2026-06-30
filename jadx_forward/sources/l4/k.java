package l4;

/* loaded from: classes13.dex */
public class k extends android.os.RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p105x3580db.ServiceC1166x25ea1c9 f397261a;

    public k(p012xc85e97e9.p105x3580db.ServiceC1166x25ea1c9 serviceC1166x25ea1c9) {
        this.f397261a = serviceC1166x25ea1c9;
    }

    @Override // android.os.RemoteCallbackList
    public void onCallbackDied(android.os.IInterface iInterface, java.lang.Object obj) {
        this.f397261a.f93852e.remove(java.lang.Integer.valueOf(((java.lang.Integer) obj).intValue()));
    }
}
