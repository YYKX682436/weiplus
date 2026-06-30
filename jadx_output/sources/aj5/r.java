package aj5;

/* loaded from: classes.dex */
public final class r extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f5497d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f5498e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f5499f;

    /* renamed from: g, reason: collision with root package name */
    public final aj5.m f5500g;

    /* renamed from: h, reason: collision with root package name */
    public p13.c f5501h;

    /* renamed from: i, reason: collision with root package name */
    public p13.c f5502i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f5497d = jz5.h.b(aj5.k.f5456d);
        this.f5498e = jz5.h.b(new aj5.q(this));
        this.f5499f = new java.util.ArrayList();
        this.f5500g = new aj5.m();
    }

    public static final void T6(aj5.r rVar, wi5.n0 n0Var) {
        rVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactAddressBookRecommendStrictDupUIC", "startRecommendChatRoom");
        p13.c cVar = rVar.f5501h;
        if (cVar != null) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(cVar);
            rVar.f5501h = null;
        }
        java.util.List b17 = wi5.p0.f446333a.b(n0Var.f446319o, n0Var.f446318n, false);
        if (((java.util.ArrayList) b17).size() <= 1) {
            com.tencent.mm.view.recyclerview.WxRecyclerView k17 = rVar.V6().k();
            kotlin.jvm.internal.o.f(k17, "getSelectContactRv(...)");
            com.tencent.mm.plugin.mvvmlist.MvvmList a17 = xm3.u0.a(k17);
            if (a17 != null) {
                a17.z(rVar.f5500g);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactAddressBookRecommendStrictDupUIC", "startRecommendChatRoom, selectUsernameList: " + b17);
        p13.u uVar = new p13.u();
        java.util.List list = uVar.f351155q;
        if (list != null) {
            ((java.util.ArrayList) list).addAll(b17);
        }
        uVar.f351140b = 15;
        uVar.f351150l = r13.b.f368602d;
        uVar.f351152n = (com.tencent.mm.sdk.platformtools.n3) ((jz5.n) rVar.f5497d).getValue();
        uVar.f351154p = true;
        uVar.f351151m = new aj5.j(rVar, new aj5.n(b17, rVar));
        rVar.f5501h = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(11, uVar);
    }

    public static final void U6(aj5.r rVar, wi5.n0 n0Var) {
        rVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactAddressBookRecommendStrictDupUIC", "startRecommendContact");
        p13.c cVar = rVar.f5502i;
        if (cVar != null) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(cVar);
            rVar.f5502i = null;
        }
        aj5.p pVar = new aj5.p();
        java.util.List b17 = wi5.p0.f446333a.b(n0Var.f446319o, n0Var.f446318n, false);
        if (!(!((java.util.ArrayList) b17).isEmpty())) {
            com.tencent.mm.view.recyclerview.WxRecyclerView k17 = rVar.V6().k();
            kotlin.jvm.internal.o.f(k17, "getSelectContactRv(...)");
            com.tencent.mm.plugin.mvvmlist.MvvmList a17 = xm3.u0.a(k17);
            if (a17 != null) {
                a17.z(pVar);
                return;
            }
            return;
        }
        p13.u uVar = new p13.u();
        java.util.List list = uVar.f351155q;
        if (list != null) {
            ((java.util.ArrayList) list).addAll(b17);
        }
        uVar.f351140b = 13;
        uVar.f351150l = r13.b.f368602d;
        uVar.f351152n = (com.tencent.mm.sdk.platformtools.n3) ((jz5.n) rVar.f5497d).getValue();
        uVar.f351147i = 6;
        uVar.f351151m = new aj5.j(rVar, new aj5.o(rVar, pVar));
        uVar.f351154p = true;
        rVar.f5502i = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(11, uVar);
    }

    public final em.l2 V6() {
        return (em.l2) ((jz5.n) this.f5498e).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        boolean booleanExtra = getIntent().getBooleanExtra("recommend_chatroom", false);
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new aj5.l(this, booleanExtra));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        p13.c cVar = this.f5501h;
        if (cVar != null) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(cVar);
            this.f5501h = null;
        }
        p13.c cVar2 = this.f5502i;
        if (cVar2 != null) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(cVar2);
            this.f5502i = null;
        }
    }
}
