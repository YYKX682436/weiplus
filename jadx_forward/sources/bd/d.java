package bd;

/* loaded from: classes15.dex */
public abstract class d {
    private static final java.lang.String TAG = "WxaLiteApp.WxaLiteAppModule";

    /* renamed from: mCallback */
    private bd.e f4195x1ab9c7d2;

    /* renamed from: getAppId */
    public java.lang.String m10166x74292566() {
        bd.e eVar = this.f4195x1ab9c7d2;
        return eVar != null ? eVar.f100731b : "";
    }

    /* renamed from: getAppUuid */
    public long m10167xe7b2546() {
        bd.e eVar = this.f4195x1ab9c7d2;
        if (eVar != null) {
            return eVar.f100730a;
        }
        return 0L;
    }

    /* renamed from: getCallback */
    public bd.e m10168x71965dbb() {
        return this.f4195x1ab9c7d2;
    }

    /* renamed from: getContext */
    public android.content.Context m10169x76847179() {
        bd.e eVar = this.f4195x1ab9c7d2;
        return com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65317xc88b72ec(eVar != null ? eVar.f100730a : 0L);
    }

    /* renamed from: getPageId */
    public long m10170x29bd2700() {
        bd.e eVar = this.f4195x1ab9c7d2;
        if (eVar != null) {
            return eVar.f100732c;
        }
        return 0L;
    }

    /* renamed from: setCallback */
    public void m10171x6c4ebec7(bd.e eVar) {
        this.f4195x1ab9c7d2 = eVar;
    }
}
