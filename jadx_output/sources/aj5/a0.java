package aj5;

/* loaded from: classes.dex */
public final class a0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f5382d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f5383e;

    /* renamed from: f, reason: collision with root package name */
    public p13.c f5384f;

    /* renamed from: g, reason: collision with root package name */
    public p13.c f5385g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f5382d = jz5.h.b(aj5.t.f5515d);
        this.f5383e = jz5.h.b(new aj5.z(this));
    }

    public static final void T6(aj5.a0 a0Var, wi5.n0 n0Var) {
        a0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactRecommendUIC", "startRecommendChatRoom");
        p13.c cVar = a0Var.f5384f;
        if (cVar != null) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(cVar);
            a0Var.f5384f = null;
        }
        aj5.w wVar = new aj5.w();
        java.util.List b17 = wi5.p0.f446333a.b(n0Var.f446319o, n0Var.f446318n, false);
        if (!(!((java.util.ArrayList) b17).isEmpty())) {
            com.tencent.mm.view.recyclerview.WxRecyclerView k17 = a0Var.V6().k();
            kotlin.jvm.internal.o.f(k17, "getSelectContactRv(...)");
            com.tencent.mm.plugin.mvvmlist.MvvmList a17 = xm3.u0.a(k17);
            if (a17 != null) {
                a17.z(wVar);
                return;
            }
            return;
        }
        p13.u uVar = new p13.u();
        ((java.util.ArrayList) uVar.f351155q).addAll(b17);
        uVar.f351140b = 8;
        uVar.f351150l = r13.b.f368602d;
        uVar.f351152n = (com.tencent.mm.sdk.platformtools.n3) ((jz5.n) a0Var.f5382d).getValue();
        uVar.f351147i = 3;
        uVar.f351154p = true;
        uVar.f351151m = new aj5.s(a0Var, new aj5.v(a0Var, wVar));
        a0Var.f5384f = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(11, uVar);
    }

    public static final void U6(aj5.a0 a0Var, wi5.n0 n0Var) {
        a0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactRecommendUIC", "startRecommendContact");
        p13.c cVar = a0Var.f5385g;
        if (cVar != null) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(cVar);
            a0Var.f5385g = null;
        }
        aj5.y yVar = new aj5.y();
        java.util.List b17 = wi5.p0.f446333a.b(n0Var.f446319o, n0Var.f446318n, false);
        if (!(!((java.util.ArrayList) b17).isEmpty())) {
            com.tencent.mm.view.recyclerview.WxRecyclerView k17 = a0Var.V6().k();
            kotlin.jvm.internal.o.f(k17, "getSelectContactRv(...)");
            com.tencent.mm.plugin.mvvmlist.MvvmList a17 = xm3.u0.a(k17);
            if (a17 != null) {
                a17.z(yVar);
                return;
            }
            return;
        }
        p13.u uVar = new p13.u();
        ((java.util.ArrayList) uVar.f351155q).addAll(b17);
        uVar.f351140b = 13;
        uVar.f351150l = r13.b.f368602d;
        uVar.f351152n = (com.tencent.mm.sdk.platformtools.n3) ((jz5.n) a0Var.f5382d).getValue();
        uVar.f351147i = 6;
        uVar.f351151m = new aj5.s(a0Var, new aj5.x(a0Var, yVar));
        uVar.f351154p = true;
        a0Var.f5385g = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(11, uVar);
    }

    public final em.l2 V6() {
        return (em.l2) ((jz5.n) this.f5383e).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        boolean booleanExtra = getIntent().getBooleanExtra("recommend_chatroom", false);
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new aj5.u(this, booleanExtra));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        p13.c cVar = this.f5384f;
        if (cVar != null) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(cVar);
            this.f5384f = null;
        }
        p13.c cVar2 = this.f5385g;
        if (cVar2 != null) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(cVar2);
            this.f5385g = null;
        }
    }
}
