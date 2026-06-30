package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class y5 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f269222d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f269223e;

    public y5(java.lang.ref.WeakReference weakReference, java.lang.String str) {
        this.f269222d = weakReference;
        this.f269223e = str;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19332xce3811a4 c19332xce3811a4 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19332xce3811a4) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5 b5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5) this.f269222d.get();
        if (b5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewLongClickHelper", "RecogQBarIPCCallBack helper == null");
            return;
        }
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19332xce3811a4.f265317e);
        java.lang.String str = this.f269223e;
        java.lang.String str2 = c19332xce3811a4.f265317e;
        if (K0 || !str2.equals(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewLongClickHelper", "RecogQBarIPCCallBack   path error, data.mImagePath:" + str2 + "   path: " + str);
            return;
        }
        java.util.HashMap hashMap = b5Var.f265475j;
        if (hashMap.containsKey(str2)) {
            hashMap.remove(str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewLongClickHelper", "RecogQBarIPCCallBack  remove filePath:".concat(str2));
        }
        if (!c19332xce3811a4.f265318f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewLongClickHelper", "RecogQBarIPCCallBack  recog is fail:" + str);
            return;
        }
        b5Var.f265476k = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        b5Var.f265477l = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - b5Var.f265478m.longValue());
        java.util.ArrayList arrayList = b5Var.f265466a;
        arrayList.clear();
        java.util.ArrayList arrayList2 = c19332xce3811a4.f265316d;
        if (arrayList2 != null && arrayList2.size() > 0) {
            arrayList.add((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357) arrayList2.get(0));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewLongClickHelper", "RecogQBarIPCCallBack  :" + arrayList.size());
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.l5(b5Var));
        b5Var.v();
    }
}
