package nh5;

/* loaded from: classes11.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f418658d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nh5.c f418659e;

    public b(nh5.c cVar, java.lang.String str) {
        this.f418659e = cVar;
        this.f418658d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        nh5.c cVar = this.f418659e;
        cVar.f418661d.dismiss();
        com.tencent.mm.ui.matrix.MatrixBaseLeakResultUI matrixBaseLeakResultUI = cVar.f418662e;
        int i17 = com.p314xaae8f345.mm.ui.p2715xbf8d97c1.ViewOnLongClickListenerC22439x7c94dc29.f290635s;
        matrixBaseLeakResultUI.getClass();
        java.lang.String str = this.f418658d;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ManualDumpActivity", "dealWithFile fail, filePath is empty");
            dp.a.m125853x26a183b((android.content.Context) matrixBaseLeakResultUI, com.p314xaae8f345.mm.R.C30867xcad56011.j4_, 1).show();
            matrixBaseLeakResultUI.finish();
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ManualDumpActivity", "dealWithFile fail, filePath is refer to private file.");
            dp.a.m125853x26a183b((android.content.Context) matrixBaseLeakResultUI, com.p314xaae8f345.mm.R.C30867xcad56011.j4_, 1).show();
            matrixBaseLeakResultUI.finish();
            return;
        }
        long k17 = com.p314xaae8f345.mm.vfs.w6.k(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ManualDumpActivity", "filelength: [%d]", java.lang.Long.valueOf(k17));
        if (k17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ManualDumpActivity", "dealWithFile fail, fileLength is 0");
            dp.a.m125853x26a183b((android.content.Context) matrixBaseLeakResultUI, com.p314xaae8f345.mm.R.C30867xcad56011.j4_, 1).show();
            matrixBaseLeakResultUI.finish();
            return;
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504(new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11280xa65cf99c(str));
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        java.lang.String str3 = a17.f294812f;
        int lastIndexOf = str3.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str3 = str3.substring(lastIndexOf + 1);
        }
        c11286x34a5504.f33130x6942258 = str3;
        c11286x34a5504.f33121x993583fc = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(k17);
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req req = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req();
        req.f32866x7fa0d2de = null;
        req.f33049x38eb0007 = c11286x34a5504;
        android.os.Bundle bundle = new android.os.Bundle();
        req.mo48427x792022dd(bundle);
        bundle.putInt(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32808x6604d593, com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.C11223x3d8d64e.f32730x9efbee2a);
        bundle.putString(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32760x1a7d3e8, "com.tencent.mm.openapi");
        bundle.putString("SendAppMessageWrapper_AppId", "wx4310bbd51be7d979");
        android.content.Intent className = new android.content.Intent().setClassName((android.content.Context) matrixBaseLeakResultUI, "com.tencent.mm.ui.transmit.SelectConversationUI");
        className.putExtra("Select_Conv_NextStep", new android.content.Intent().setClassName((android.content.Context) matrixBaseLeakResultUI, "com.tencent.mm.ui.transmit.SendAppMessageWrapperUI").putExtras(bundle).putExtra("animation_pop_in", true));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(className);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(matrixBaseLeakResultUI, arrayList.toArray(), "com/tencent/mm/ui/matrix/ManualDumpActivity", "sendHprofFile", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        matrixBaseLeakResultUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(matrixBaseLeakResultUI, "com/tencent/mm/ui/matrix/ManualDumpActivity", "sendHprofFile", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
