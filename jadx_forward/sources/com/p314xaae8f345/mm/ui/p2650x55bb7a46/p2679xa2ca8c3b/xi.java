package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class xi implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f287523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 f287524e;

    public xi(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105, java.util.Map map) {
        this.f287524e = c21908xb66fd105;
        this.f287523d = map;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$49", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.Map map = this.f287523d;
        java.lang.String str = (java.lang.String) map.get(".msg.appmsg.mmreader.template_header.finder_feedid");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str2 = str == null ? "" : str;
        java.lang.String str3 = (java.lang.String) map.get(".msg.appmsg.mmreader.template_header.finder_nonceid");
        java.lang.String str4 = str3 == null ? "" : str3;
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105 = this.f287524e;
        ((c61.l7) b6Var).vj(c21908xb66fd105.f284708s.g(), str2, str4, false, 16, qg0.h0.Fg(2));
        c21908xb66fd105.o1(3, map, "");
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$49", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
