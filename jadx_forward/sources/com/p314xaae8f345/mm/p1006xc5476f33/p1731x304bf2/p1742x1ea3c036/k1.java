package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036;

/* loaded from: classes8.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f221333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221334e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k60.e f221335f;

    public k1(java.lang.Class cls, java.lang.String str, k60.e eVar) {
        this.f221333d = cls;
        this.f221334e = str;
        this.f221335f = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        sd.o0 o0Var = new sd.o0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, this.f221333d);
        java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1.f221398a;
        java.lang.String str = this.f221334e;
        hashMap.put(str, o0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1.f221399b.remove(str);
        if (!android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreloadGameWebCoreHelp", "loadUrl: %s", str);
            o0Var.j(str);
        }
        k60.e eVar = this.f221335f;
        if (eVar != null) {
            eVar.a();
        }
    }
}
