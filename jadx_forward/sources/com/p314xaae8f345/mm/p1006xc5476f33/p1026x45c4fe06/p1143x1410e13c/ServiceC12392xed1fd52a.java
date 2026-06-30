package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1143x1410e13c;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0017\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\"\u0010\f\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0016R$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006!"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/loading/AppBrandProcessTriggerService0;", "Landroid/app/Service;", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "Ljz5/f0;", "onRebind", "onCreate", "", "flags", "startId", "onStartCommand", "", "onUnbind", "onDestroy", "Lbj1/e;", "callback", "Lbj1/e;", "getCallback", "()Lbj1/e;", "setCallback", "(Lbj1/e;)V", "Landroid/content/Intent;", "getIntent", "()Landroid/content/Intent;", "setIntent", "(Landroid/content/Intent;)V", "<init>", "()V", "Companion", "xg1/f", "xg1/g", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.loading.AppBrandProcessTriggerService0 */
/* loaded from: classes7.dex */
public class ServiceC12392xed1fd52a extends android.app.Service {

    /* renamed from: Companion */
    public static final xg1.g f35077x233c02ec = new xg1.g(null);

    /* renamed from: IPC_TRIGGER_PRELOAD */
    public static final int f35078x24f263ff = 2;
    private static final java.lang.String TAG = "MicroMsg.AppBrand.AppBrandProcessTriggerService";
    private bj1.e callback;
    private android.content.Intent intent;

    public final bj1.e getCallback() {
        return this.callback;
    }

    public final android.content.Intent getIntent() {
        return this.intent;
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        this.intent = intent;
        return new xg1.f(this);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(android.content.Intent intent) {
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int flags, int startId) {
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent intent) {
        return true;
    }

    /* renamed from: setCallback */
    public final void m51874x6c4ebec7(bj1.e eVar) {
        this.callback = eVar;
    }

    /* renamed from: setIntent */
    public final void m51875x11bd8d9e(android.content.Intent intent) {
        this.intent = intent;
    }
}
