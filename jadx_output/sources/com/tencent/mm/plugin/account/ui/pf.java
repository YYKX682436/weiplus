package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public class pf implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI f74115d;

    public pf(com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI regByMobileRegAIOUI) {
        this.f74115d = regByMobileRegAIOUI;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI activity = this.f74115d;
        kotlin.jvm.internal.o.g(activity, "activity");
        ((vm3.d) pf5.z.f353948a.a(activity).a(vm3.d.class)).V6(z17);
    }
}
