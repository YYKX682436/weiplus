package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes4.dex */
public final class wa0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f217862d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ya0 f217863e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f217864f;

    public wa0(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ya0 ya0Var, java.lang.String str) {
        this.f217862d = j17;
        this.f217863e = ya0Var;
        this.f217864f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView textView;
        long j17 = this.f217862d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ya0 ya0Var = this.f217863e;
        if (j17 > 0 && (textView = ya0Var.f218077d) != null) {
            textView.postDelayed(ya0Var.f218078e, j17);
        }
        ya0Var.R6(true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderWifiHintUIC", "[showHint] hint:" + this.f217864f);
    }
}
