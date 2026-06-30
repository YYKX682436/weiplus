package com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui;

/* loaded from: classes11.dex */
public class h implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.i f243807d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.i iVar) {
        this.f243807d = iVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        android.view.View view = this.f243807d.f243812a;
        if (view != null) {
            view.setKeepScreenOn(false);
        }
        return false;
    }
}
