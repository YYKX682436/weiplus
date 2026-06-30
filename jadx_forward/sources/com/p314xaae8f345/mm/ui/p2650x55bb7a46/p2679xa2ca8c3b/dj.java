package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class dj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285334e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ej f285335f;

    public dj(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ej ejVar, java.lang.String str, java.lang.String str2) {
        this.f285335f = ejVar;
        this.f285333d = str;
        this.f285334e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        n11.a b17 = n11.a.b();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ej ejVar = this.f285335f;
        b17.h(this.f285333d, ejVar.f285421a.Q, ejVar.f285423c.F);
        java.lang.String str = this.f285334e;
        if (android.text.TextUtils.isEmpty(str)) {
            str = ejVar.f285422b;
        }
        ejVar.f285421a.R.setText(str);
    }
}
