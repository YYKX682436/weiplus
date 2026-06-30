package com.tencent.mm.plugin.account.ui;

/* loaded from: classes12.dex */
public class nh implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegSetInfoUI f74068d;

    public nh(com.tencent.mm.plugin.account.ui.RegSetInfoUI regSetInfoUI) {
        this.f74068d = regSetInfoUI;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        if (z17) {
            com.tencent.mm.plugin.account.ui.RegSetInfoUI regSetInfoUI = this.f74068d;
            regSetInfoUI.K = true;
            regSetInfoUI.U.c(200L, 200L);
        }
    }
}
