package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz;

/* loaded from: classes2.dex */
public class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 f280354d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f280355e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.m0 f280356f;

    public x(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a aVar, com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 activityC21387x976b8e54, java.util.List list, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.m0 m0Var) {
        this.f280354d = activityC21387x976b8e54;
        this.f280355e = list;
        this.f280356f = m0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/biz/BizComponent$27", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(view.getContext(), view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572272ak0), false, 0, null);
        f17.show();
        r45.hv6 hv6Var = new r45.hv6();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 7386;
        lVar.f152199c = "/cgi-bin/micromsg-bin/usebizmuteflag";
        lVar.f152197a = hv6Var;
        lVar.f152198b = new r45.iv6();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
        iVar.p(a17);
        iVar.f152182i = true;
        iVar.l().f(this.f280354d).h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.w(this, f17));
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/biz/BizComponent$27", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
