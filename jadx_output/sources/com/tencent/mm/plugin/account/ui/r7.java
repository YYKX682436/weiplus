package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public class r7 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginUI f74157d;

    public r7(com.tencent.mm.plugin.account.ui.LoginUI loginUI) {
        this.f74157d = loginUI;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        com.tencent.mm.plugin.account.ui.LoginUI activity = this.f74157d;
        kotlin.jvm.internal.o.g(activity, "activity");
        ((vm3.d) pf5.z.f353948a.a(activity).a(vm3.d.class)).V6(z17);
    }
}
