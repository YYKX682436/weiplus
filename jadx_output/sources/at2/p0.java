package at2;

/* loaded from: classes3.dex */
public final class p0 implements db5.s4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f13730a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o25.y1 f13731b;

    public p0(com.tencent.mm.ui.widget.dialog.k0 k0Var, o25.y1 y1Var) {
        this.f13730a = k0Var;
        this.f13731b = y1Var;
    }

    @Override // db5.s4
    public final void a(android.view.MenuItem menuItem, int i17) {
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = c1Var != null ? c1Var.f328846n : null;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f13730a;
        if (k0Var == null || finderObject == null) {
            return;
        }
        kotlin.jvm.internal.o.e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
        ((com.tencent.mm.pluginsdk.forward.m) this.f13731b).bj(k0Var, (db5.h4) menuItem);
    }
}
