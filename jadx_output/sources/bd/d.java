package bd;

/* loaded from: classes15.dex */
public abstract class d {
    private static final java.lang.String TAG = "WxaLiteApp.WxaLiteAppModule";
    private bd.e mCallback;

    public java.lang.String getAppId() {
        bd.e eVar = this.mCallback;
        return eVar != null ? eVar.f19198b : "";
    }

    public long getAppUuid() {
        bd.e eVar = this.mCallback;
        if (eVar != null) {
            return eVar.f19197a;
        }
        return 0L;
    }

    public bd.e getCallback() {
        return this.mCallback;
    }

    public android.content.Context getContext() {
        bd.e eVar = this.mCallback;
        return com.tencent.mm.plugin.lite.LiteAppCenter.getCurrentContext(eVar != null ? eVar.f19197a : 0L);
    }

    public long getPageId() {
        bd.e eVar = this.mCallback;
        if (eVar != null) {
            return eVar.f19199c;
        }
        return 0L;
    }

    public void setCallback(bd.e eVar) {
        this.mCallback = eVar;
    }
}
