package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* loaded from: classes8.dex */
public class b3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.w3 f263685d;

    public b3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.w3 w3Var) {
        this.f263685d = w3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/luggage/LuggageWebViewLongClickHelper$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.w3 w3Var = this.f263685d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = w3Var.f264200h;
        if (k0Var != null && k0Var.i()) {
            w3Var.f264200h.u();
        }
        w3Var.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("type", 3);
        bundle.putString("preUsername", w3Var.f264202j.f488190n.getString("preUsername"));
        bundle.putString("preChatName", w3Var.f264202j.f488190n.getString("preChatName"));
        bundle.putString("rawUrl", w3Var.f264202j.s());
        java.lang.String string = w3Var.f264202j.f488190n.getString("pre_username");
        if (string == null || !com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.g.c(string)) {
            bundle.putString("pre_username", w3Var.f264202j.f488190n.getString(com.p314xaae8f345.mm.ui.w2.f292736p));
        } else {
            bundle.putString("pre_username", string);
        }
        bundle.putString("result", w3Var.f264193a);
        java.lang.String str = w3Var.f264193a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = "";
        } else if (str.length() > 1024) {
            str = str.substring(0, 1024);
        }
        bundle.putString("imageUrl", str);
        bundle.putString("url", w3Var.f264202j.u());
        bundle.putInt("codeType", w3Var.f264195c);
        bundle.putInt("codeVersion", w3Var.f264196d);
        if (w3Var.f264194b != null) {
            java.lang.String Ri = ((jd0.d2) ((kd0.s2) i95.n0.c(kd0.s2.class))).Ri(java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
            com.p314xaae8f345.mm.vfs.w6.R(Ri, w3Var.f264194b);
            bundle.putString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, Ri);
            w3Var.f264194b = null;
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19264xff7385d4.class, null);
        yj0.a.h(this, "com/tencent/mm/plugin/webview/luggage/LuggageWebViewLongClickHelper$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
