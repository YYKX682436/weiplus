package ap1;

/* loaded from: classes5.dex */
public final class l1 implements com.tencent.mm.ui.contact.l4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap1.p1 f12698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ap1.p1 f12699e;

    public l1(ap1.p1 p1Var, ap1.p1 p1Var2) {
        this.f12698d = p1Var;
        this.f12699e = p1Var2;
    }

    @Override // com.tencent.mm.ui.contact.l4
    public android.widget.ListView O3() {
        em.c4 c4Var = this.f12699e.f12723e;
        if (c4Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        android.widget.ListView d17 = c4Var.d();
        kotlin.jvm.internal.o.f(d17, "getSearchResultLv(...)");
        return d17;
    }

    @Override // com.tencent.mm.ui.contact.l4
    public java.lang.String W5(com.tencent.mm.ui.contact.item.d dVar) {
        return "";
    }

    @Override // com.tencent.mm.ui.contact.l4
    public android.app.Activity getActivity() {
        return this.f12698d.getActivity();
    }

    @Override // com.tencent.mm.ui.contact.l4
    public boolean p5(com.tencent.mm.ui.contact.item.d dVar) {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.l4
    public boolean t4(com.tencent.mm.ui.contact.item.d dVar) {
        ap1.c2 c2Var;
        java.lang.String str = dVar != null ? dVar.f206850s : null;
        if (str == null) {
            return false;
        }
        ap1.p1 p1Var = this.f12699e;
        j75.f fVar = p1Var.f12725g;
        if (fVar == null) {
            fVar = p1Var.Q6();
            p1Var.f12725g = fVar;
        }
        if (fVar == null || (c2Var = (ap1.c2) fVar.getState()) == null) {
            return false;
        }
        return c2Var.d(str);
    }
}
