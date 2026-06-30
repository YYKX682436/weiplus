package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class lf implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean[] f74017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI f74018e;

    public lf(com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI regByMobileRegAIOUI, boolean[] zArr) {
        this.f74018e = regByMobileRegAIOUI;
        this.f74017d = zArr;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        if (z17) {
            this.f74017d[0] = true;
        } else {
            fo3.s.INSTANCE.E7("ie_reg");
        }
        com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI activity = this.f74018e;
        kotlin.jvm.internal.o.g(activity, "activity");
        ((vm3.d) pf5.z.f353948a.a(activity).a(vm3.d.class)).V6(z17);
    }
}
