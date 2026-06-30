package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class y9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5171x6c1e5751 f281839d;

    public y9(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21660x10aa7a44 c21660x10aa7a44, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5171x6c1e5751 c5171x6c1e5751) {
        this.f281839d = c5171x6c1e5751;
    }

    @Override // java.lang.Runnable
    public void run() {
        am.a0 a0Var = this.f281839d.f135520g;
        java.lang.String str = a0Var.f87643a;
        int i17 = a0Var.f87644b;
        int i18 = a0Var.f87645c;
        java.util.HashMap hashMap = (java.util.HashMap) com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.h6.f285613i;
        if (!hashMap.containsKey(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppMsgEmojiItemHolder", "no contain attchid:%s");
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.h6 h6Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.h6) ((java.lang.ref.WeakReference) hashMap.get(str)).get();
        if (h6Var != null) {
            if (i18 == 0) {
                h6Var.f285615c.setVisibility(0);
                h6Var.f285617e.setVisibility(8);
                h6Var.f285616d.setVisibility(8);
                h6Var.f285615c.setProgress(0);
                return;
            }
            if (i18 == 1) {
                h6Var.f285615c.setVisibility(8);
                h6Var.f285617e.setVisibility(8);
                h6Var.f285616d.setVisibility(8);
            } else {
                if (i18 != 2) {
                    return;
                }
                h6Var.f285615c.setVisibility(8);
                h6Var.f285617e.setVisibility(8);
                h6Var.f285616d.setVisibility(0);
                h6Var.f285615c.setProgress(i17);
                h6Var.f285616d.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f77982xb2f71f8);
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 a0Var2 = h6Var.f39491xbb6bd679;
                if (a0Var2 instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i6) {
                    ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i6) a0Var2).f285700t = true;
                }
            }
        }
    }
}
