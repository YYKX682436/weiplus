package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* loaded from: classes8.dex */
public class c3 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.w3 f263690a;

    public c3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.w3 w3Var) {
        this.f263690a = w3Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g9
    public void a(java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("img_path", str);
        android.content.Context context = this.f263690a.f264202j.f488143d;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("task_class_name", com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.v3.class.getName());
        intent.putExtra("input_data", bundle);
        intent.putExtra("orientation", -1);
        j45.l.j(context, "webview", ".luggage.ipc.IpcProxyUI", intent, null);
    }
}
