package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class z7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f105089d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(in5.s0 s0Var) {
        super(0);
        this.f105089d = s0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar;
        android.content.Context context = this.f105089d.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (context instanceof com.tencent.mm.ui.MMFragmentActivity) {
            nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        } else {
            nyVar = null;
        }
        if (nyVar != null) {
            r45.qt2 V6 = nyVar.V6();
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((com.tencent.mm.plugin.finder.report.o3) c17).yj(2, 1, 0, V6);
        }
        com.tencent.mm.autogen.events.FinderTabSelectedEvent finderTabSelectedEvent = new com.tencent.mm.autogen.events.FinderTabSelectedEvent();
        finderTabSelectedEvent.f54329g.f6938a = 4;
        finderTabSelectedEvent.e();
        return jz5.f0.f302826a;
    }
}
