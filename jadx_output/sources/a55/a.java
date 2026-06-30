package a55;

/* loaded from: classes12.dex */
public class a implements com.tencent.mars.app.AppManager.CallBack {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f1602a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mars.app.AppManager.DeviceInfo f1603b = new com.tencent.mars.app.AppManager.DeviceInfo(o45.wf.f343026d, wo.q.f447780a);

    public a(android.content.Context context) {
        this.f1602a = null;
        this.f1602a = context;
    }

    @Override // com.tencent.mars.app.AppManager.CallBack
    public com.tencent.mars.app.AppManager.AccountInfo getAccountInfo() {
        return new com.tencent.mars.app.AppManager.AccountInfo();
    }

    @Override // com.tencent.mars.app.AppManager.CallBack
    public java.lang.String getAppFilePath() {
        return this.f1602a.getFilesDir().toString();
    }

    @Override // com.tencent.mars.app.AppManager.CallBack
    public java.lang.String getClientConfig(java.lang.String str, java.lang.String str2) {
        return j62.e.g().j(str, str2, true, true);
    }

    @Override // com.tencent.mars.app.AppManager.CallBack
    public long getClientConfigID(java.lang.String str) {
        return j62.b.f().c(str);
    }

    @Override // com.tencent.mars.app.AppManager.CallBack
    public int getClientVersion() {
        return o45.wf.f343029g;
    }

    @Override // com.tencent.mars.app.AppManager.CallBack
    public com.tencent.mars.app.AppManager.DeviceInfo getDeviceType() {
        return this.f1603b;
    }
}
