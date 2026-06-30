package com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui;

/* loaded from: classes14.dex */
public class f implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ViewOnClickListenerC18768x401c3b80 f256858d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ViewOnClickListenerC18768x401c3b80 viewOnClickListenerC18768x401c3b80) {
        this.f256858d = viewOnClickListenerC18768x401c3b80;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ViewOnClickListenerC18768x401c3b80 viewOnClickListenerC18768x401c3b80 = this.f256858d;
        viewOnClickListenerC18768x401c3b80.f256826o++;
        int i17 = viewOnClickListenerC18768x401c3b80.f256826o;
        if (i17 > 99) {
            return false;
        }
        if (viewOnClickListenerC18768x401c3b80.f256818d == 1) {
            viewOnClickListenerC18768x401c3b80.f256823i.setText(viewOnClickListenerC18768x401c3b80.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bpi, java.lang.Integer.valueOf(i17)));
        }
        return true;
    }
}
