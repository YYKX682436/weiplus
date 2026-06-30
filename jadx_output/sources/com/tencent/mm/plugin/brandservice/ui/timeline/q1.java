package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes11.dex */
public final class q1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI f94494d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI bizTestUI) {
        super(0);
        this.f94494d = bizTestUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.appcompat.app.AppCompatActivity context = this.f94494d.getContext();
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        com.tencent.wechat.mm.biz.g0 c17 = yw.q3.f466437a.c();
        aVar.f211729s = c17 != null ? c17.f() : null;
        aVar.f211709a = "cache config";
        aVar.f211732v = of5.b.a(context).getString(com.tencent.mm.R.string.f490507x1);
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        j0Var.show();
        return jz5.f0.f302826a;
    }
}
