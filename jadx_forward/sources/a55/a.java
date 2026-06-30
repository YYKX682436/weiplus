package a55;

/* loaded from: classes12.dex */
public class a implements com.p314xaae8f345.p542x3306d5.app.C4440xec1b926c.CallBack {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f83135a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p542x3306d5.app.C4440xec1b926c.DeviceInfo f83136b = new com.p314xaae8f345.p542x3306d5.app.C4440xec1b926c.DeviceInfo(o45.wf.f424559d, wo.q.f529313a);

    public a(android.content.Context context) {
        this.f83135a = null;
        this.f83135a = context;
    }

    @Override // com.p314xaae8f345.p542x3306d5.app.C4440xec1b926c.CallBack
    /* renamed from: getAccountInfo */
    public com.p314xaae8f345.p542x3306d5.app.C4440xec1b926c.AccountInfo mo652xd71cb45() {
        return new com.p314xaae8f345.p542x3306d5.app.C4440xec1b926c.AccountInfo();
    }

    @Override // com.p314xaae8f345.p542x3306d5.app.C4440xec1b926c.CallBack
    /* renamed from: getAppFilePath */
    public java.lang.String mo653xda9123cc() {
        return this.f83135a.getFilesDir().toString();
    }

    @Override // com.p314xaae8f345.p542x3306d5.app.C4440xec1b926c.CallBack
    /* renamed from: getClientConfig */
    public java.lang.String mo654xeff8b163(java.lang.String str, java.lang.String str2) {
        return j62.e.g().j(str, str2, true, true);
    }

    @Override // com.p314xaae8f345.p542x3306d5.app.C4440xec1b926c.CallBack
    /* renamed from: getClientConfigID */
    public long mo655xd491edbe(java.lang.String str) {
        return j62.b.f().c(str);
    }

    @Override // com.p314xaae8f345.p542x3306d5.app.C4440xec1b926c.CallBack
    /* renamed from: getClientVersion */
    public int mo656xeb61b2d7() {
        return o45.wf.f424562g;
    }

    @Override // com.p314xaae8f345.p542x3306d5.app.C4440xec1b926c.CallBack
    /* renamed from: getDeviceType */
    public com.p314xaae8f345.p542x3306d5.app.C4440xec1b926c.DeviceInfo mo657x1cd0bea6() {
        return this.f83136b;
    }
}
