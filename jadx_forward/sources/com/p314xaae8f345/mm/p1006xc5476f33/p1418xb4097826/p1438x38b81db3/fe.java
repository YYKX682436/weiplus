package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class fe implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1462x365338.C13928xc82087f4 f184901d;

    public fe(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1462x365338.C13928xc82087f4 c13928xc82087f4) {
        this.f184901d = c13928xc82087f4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1462x365338.C13928xc82087f4 c13928xc82087f4 = this.f184901d;
        if (c13928xc82087f4.visibilityManager.O6(c13928xc82087f4.f190598e)) {
            c13928xc82087f4.setVisibility(0);
            c13928xc82087f4.setAlpha(0.0f);
            android.widget.TextView textView = (android.widget.TextView) c13928xc82087f4.findViewById(com.p314xaae8f345.mm.R.id.f566490g21);
            if (textView != null) {
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.cwt);
            }
            c13928xc82087f4.animate().setDuration(300L).alpha(1.0f).start();
            c13928xc82087f4.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ee(c13928xc82087f4), 5000L);
        }
    }
}
