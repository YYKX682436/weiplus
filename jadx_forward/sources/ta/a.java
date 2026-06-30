package ta;

/* loaded from: classes8.dex */
public class a implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.p268xc9fa65a8.p269xa785d61b.p270xaf12f3cb.AbstractIntentServiceC2731xa719591 f498128d;

    public a(com.p176xb6135e39.p177xcca8366f.p268xc9fa65a8.p269xa785d61b.p270xaf12f3cb.AbstractIntentServiceC2731xa719591 abstractIntentServiceC2731xa719591) {
        this.f498128d = abstractIntentServiceC2731xa719591;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        sa.c aVar;
        com.p176xb6135e39.p177xcca8366f.p268xc9fa65a8.p269xa785d61b.p270xaf12f3cb.AbstractIntentServiceC2731xa719591 abstractIntentServiceC2731xa719591 = this.f498128d;
        boolean z17 = abstractIntentServiceC2731xa719591.f126165d;
        int i17 = sa.b.f486781d;
        if (iBinder == null) {
            aVar = null;
        } else {
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.search.verification.api.ISearchActionVerificationService");
            aVar = (queryLocalInterface == null || !(queryLocalInterface instanceof sa.c)) ? new sa.a(iBinder) : (sa.c) queryLocalInterface;
        }
        abstractIntentServiceC2731xa719591.f126169h = aVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        com.p176xb6135e39.p177xcca8366f.p268xc9fa65a8.p269xa785d61b.p270xaf12f3cb.AbstractIntentServiceC2731xa719591 abstractIntentServiceC2731xa719591 = this.f498128d;
        abstractIntentServiceC2731xa719591.f126169h = null;
        boolean z17 = abstractIntentServiceC2731xa719591.f126165d;
    }
}
