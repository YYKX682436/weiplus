package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class ti implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.SimpleLoginUI f74232d;

    public ti(com.tencent.mm.plugin.account.ui.SimpleLoginUI simpleLoginUI) {
        this.f74232d = simpleLoginUI;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        com.tencent.mm.plugin.account.ui.SimpleLoginUI activity = this.f74232d;
        kotlin.jvm.internal.o.g(activity, "activity");
        ((vm3.d) pf5.z.f353948a.a(activity).a(vm3.d.class)).V6(z17);
    }
}
