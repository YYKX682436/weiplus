package mm2;

/* loaded from: classes3.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.w f410954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ce2 f410955e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(mm2.w wVar, r45.ce2 ce2Var) {
        super(0);
        this.f410954d = wVar;
        this.f410955e = ce2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        mm2.w wVar = this.f410954d;
        mm2.h hVar = wVar.f411037p;
        if (hVar != null) {
            hVar.B = java.lang.System.currentTimeMillis();
            hVar.m66744x2a55bdd7().b(false);
        }
        mm2.h hVar2 = wVar.f411037p;
        r45.ce2 ce2Var = this.f410955e;
        if (hVar2 != null) {
            hVar2.m147953xfc7b4f0e(new mm2.q(wVar, ce2Var));
        }
        mm2.h hVar3 = wVar.f411037p;
        if (hVar3 != null) {
            hVar3.m147952x1aa44e73(new mm2.r(wVar, ce2Var));
        }
        mm2.h hVar4 = wVar.f411037p;
        if (hVar4 != null) {
            hVar4.m147949xed92507e(new mm2.s(wVar));
        }
        ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
        tn0.w0 w0Var = dk2.ef.f314911d;
        mm2.h hVar5 = wVar.f411037p;
        if (hVar5 != null) {
            hVar5.m147954x887cd1cb(wVar.f411041t);
        }
        fo0.n O = w0Var != null ? w0Var.O() : null;
        if (O != null) {
            mm2.h hVar6 = wVar.f411037p;
            java.lang.Object parent = hVar6 != null ? hVar6.getParent() : null;
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(wVar.f411037p);
            }
            mm2.h hVar7 = wVar.f411037p;
            if (hVar7 != null) {
                O.b(hVar7);
            }
        }
        return jz5.f0.f384359a;
    }
}
