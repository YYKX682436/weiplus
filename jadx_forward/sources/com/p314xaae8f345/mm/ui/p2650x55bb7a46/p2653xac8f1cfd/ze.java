package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public class ze implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public int f281904d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f281905e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe f281906f;

    public ze(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe peVar, android.view.View view) {
        this.f281906f = peVar;
        this.f281905e = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        if (this.f281904d >= 2) {
            this.f281905e.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.HeaderComponent", "onPreDraw! return false");
        if (this.f281904d == 0) {
            this.f281906f.f280113d.M(true, false, false);
        }
        this.f281904d++;
        return false;
    }
}
