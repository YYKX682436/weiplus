package te2;

/* loaded from: classes.dex */
public final class db implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.hc f499496d;

    public db(te2.hc hcVar) {
        this.f499496d = hcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorNoticeQRCodeUIC$initView$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.HashMap hashMap = new java.util.HashMap();
        te2.hc hcVar = this.f499496d;
        r45.h32 h32Var = hcVar.f499601J;
        if (h32Var == null || (str = h32Var.m75945x2fec8307(4)) == null) {
            str = "";
        }
        hashMap.put("notice_id", str);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.f409535x2, hashMap, null, "200", null, null, false, 116, null);
        hcVar.getClass();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) hcVar.m80379x76847179(), 0, true);
        k0Var.X1 = false;
        k0Var.U1 = true;
        k0Var.f293388d2 = false;
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
        new com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m().Di(hcVar.m158354x19263085(), k0Var, 2, null, new te2.ma(k0Var, hcVar));
        k0Var.f293405n = new te2.ia(k0Var, hcVar);
        k0Var.f293414s = new te2.ja(k0Var, hcVar);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorNoticeQRCodeUIC$initView$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
