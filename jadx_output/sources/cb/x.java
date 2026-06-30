package cb;

/* loaded from: classes13.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cb.u f40191d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cb.w f40192e;

    public x(cb.w wVar, cb.u uVar) {
        this.f40192e = wVar;
        this.f40191d = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.util.Log.isLoggable("EnhancedIntentService", 3);
        com.google.firebase.iid.zzb zzbVar = this.f40192e.f40190d;
        cb.u uVar = this.f40191d;
        zzbVar.d(uVar.f40184a);
        uVar.a();
    }
}
