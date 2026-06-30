package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class ij implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f285718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f285719e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f285720f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285721g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285722h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 f285723i;

    public ij(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105, int i17, java.util.Map map, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, java.lang.String str2) {
        this.f285723i = c21908xb66fd105;
        this.f285718d = i17;
        this.f285719e = map;
        this.f285720f = f9Var;
        this.f285721g = str;
        this.f285722h = str2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$57", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.Map map = this.f285719e;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105 = this.f285723i;
        int i17 = this.f285718d;
        if (i17 == 1) {
            java.lang.String str = (java.lang.String) map.get(".msg.appmsg.mmreader.category.item.schedule_username");
            long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) map.get(".msg.appmsg.mmreader.category.item.schedule_messvrid"), -1L);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.i0(c21908xb66fd105, view.getContext(), str, V);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(795L, 2L, 1L, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemDyeingTemplate", "[onClick] Remind! username:%s svrMsgId:%s", str, java.lang.Long.valueOf(V));
        } else if (i17 == 2) {
            j45.l.u(view.getContext(), ".ui.AllRemindMsgUI", new android.content.Intent(), null);
        }
        tb5.a.f498558a.a(3, c21908xb66fd105.X, c21908xb66fd105.f284708s.x(), c21908xb66fd105.Y);
        tb5.o0.c(c21908xb66fd105.f284708s, this.f285720f, map, 3);
        this.f285723i.p1(5, this.f285719e, this.f285721g, "", this.f285722h);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.e0(c21908xb66fd105, erVar, map);
        c21908xb66fd105.s1(3, c21908xb66fd105.f284708s.x(), erVar.f285439b);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$57", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
