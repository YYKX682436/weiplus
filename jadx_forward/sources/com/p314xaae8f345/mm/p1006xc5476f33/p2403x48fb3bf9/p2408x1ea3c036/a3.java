package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* loaded from: classes8.dex */
public class a3 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.w3 f263677d;

    public a3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.w3 w3Var) {
        this.f263677d = w3Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1
    /* renamed from: onDismiss */
    public void mo889xb349b3ab() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.w3 w3Var = this.f263677d;
        if (w3Var.f264199g != null) {
            try {
                w3Var.f264195c = 0;
                w3Var.f264193a = null;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636) w3Var.f264201i).n();
                java.lang.String str = w3Var.f264199g.f367729c;
                w3Var.getClass();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("type", 2);
                bundle.putString("img_path", str);
                com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19264xff7385d4.class, null);
                w3Var.f264199g.b();
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuggageWebViewLongClickHelper", "cancel capture failed");
            }
        }
    }
}
