package e23;

/* loaded from: classes12.dex */
public class c1 extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public int f328329b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.e1 f328330c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(e23.e1 e1Var, int i17) {
        super(e1Var);
        this.f328330c = e1Var;
        this.f328329b = i17;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        android.view.View inflate;
        int i17;
        e23.e1 e1Var = (e23.e1) gVar;
        e23.d1 d1Var = (e23.d1) eVar;
        if (this.f328329b == 3) {
            d1Var.f328350a.setVisibility(8);
            android.view.View view = d1Var.f328354e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/item/FTSServiceNotifyMsgContentDataItem$FTSServiceNotifyContentViewItem", "fillingHeaderAndTitle", "(Lcom/tencent/mm/plugin/fts/ui/item/FTSServiceNotifyMsgContentDataItem$FTSServiceNotifyMsgContentViewHolder;Lcom/tencent/mm/plugin/fts/ui/item/FTSServiceNotifyMsgContentDataItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/item/FTSServiceNotifyMsgContentDataItem$FTSServiceNotifyContentViewItem", "fillingHeaderAndTitle", "(Lcom/tencent/mm/plugin/fts/ui/item/FTSServiceNotifyMsgContentDataItem$FTSServiceNotifyMsgContentViewHolder;Lcom/tencent/mm/plugin/fts/ui/item/FTSServiceNotifyMsgContentDataItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            d1Var.f328356g.setVisibility(0);
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(e1Var.f328368v, d1Var.f328356g);
        } else {
            d1Var.f328350a.setVisibility(0);
            android.view.View view2 = d1Var.f328354e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/item/FTSServiceNotifyMsgContentDataItem$FTSServiceNotifyContentViewItem", "fillingHeaderAndTitle", "(Lcom/tencent/mm/plugin/fts/ui/item/FTSServiceNotifyMsgContentDataItem$FTSServiceNotifyMsgContentViewHolder;Lcom/tencent/mm/plugin/fts/ui/item/FTSServiceNotifyMsgContentDataItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/fts/ui/item/FTSServiceNotifyMsgContentDataItem$FTSServiceNotifyContentViewItem", "fillingHeaderAndTitle", "(Lcom/tencent/mm/plugin/fts/ui/item/FTSServiceNotifyMsgContentDataItem$FTSServiceNotifyMsgContentViewHolder;Lcom/tencent/mm/plugin/fts/ui/item/FTSServiceNotifyMsgContentDataItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            d1Var.f328356g.setVisibility(8);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(d1Var.f328351b, e1Var.f328365s);
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(e1Var.f328366t, d1Var.f328352c);
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(e1Var.f328368v, d1Var.f328353d);
        }
        android.widget.TextView textView = d1Var.f328355f;
        java.lang.CharSequence charSequence = e1Var.f328367u;
        e23.e1 e1Var2 = this.f328330c;
        p13.i b17 = p13.i.b(charSequence, e1Var2.f505295e);
        b17.f432633h = textView.getPaint();
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(o13.q.e(b17).f432638a, d1Var.f328355f);
        java.lang.String i18 = e1Var.i();
        java.util.List list = e1Var.f328369w;
        if (list == null || ((java.util.ArrayList) list).isEmpty() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i18)) {
            d1Var.f328357h.removeAllViews();
            d1Var.f328357h.setVisibility(8);
            return;
        }
        java.util.Iterator it = ((java.util.ArrayList) e1Var.f328369w).iterator();
        int i19 = 0;
        while (it.hasNext()) {
            java.lang.String str = ((tt0.b) it.next()).f503317a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                i17 = 0;
            } else {
                int i27 = 0;
                i17 = 0;
                while (i27 < str.length()) {
                    int i28 = i27 + 1;
                    i17 = str.substring(i27, i28).matches("[Α-￥]") ? i17 + 2 : i17 + 1;
                    i27 = i28;
                }
            }
            i19 = java.lang.Math.max((i17 + 1) / 2, i19);
        }
        int min = java.lang.Math.min(i19, 8);
        java.util.Iterator it6 = ((java.util.ArrayList) e1Var.f328369w).iterator();
        int i29 = 0;
        while (it6.hasNext()) {
            tt0.b bVar = (tt0.b) it6.next();
            java.lang.String str2 = bVar.f503318b;
            if (str2 == null) {
                str2 = "";
            }
            if (str2.toLowerCase().contains((i18 != null ? i18 : "").toLowerCase())) {
                if (i29 < d1Var.f328357h.getChildCount()) {
                    inflate = d1Var.f328357h.getChildAt(i29);
                } else {
                    inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570657aw4, (android.view.ViewGroup) null);
                    d1Var.f328357h.addView(inflate);
                }
                android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.i29);
                android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.i2i);
                textView2.setText(bVar.f503317a);
                textView2.setEms(min);
                p13.i b18 = p13.i.b(bVar.f503318b, e1Var2.f505295e);
                b18.f432633h = textView3.getPaint();
                textView3.setText(o13.q.e(b18).f432638a);
                i29++;
            }
        }
        if (i29 < d1Var.f328357h.getChildCount()) {
            android.widget.LinearLayout linearLayout = d1Var.f328357h;
            linearLayout.removeViews(i29, linearLayout.getChildCount() - i29);
        }
        d1Var.f328357h.setVisibility(0);
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570656bd2, viewGroup, false);
        e23.d1 d1Var = this.f328330c.f328371y;
        d1Var.f328350a = (android.view.ViewGroup) inflate.findViewById(com.p314xaae8f345.mm.R.id.hhp);
        d1Var.f328351b = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        d1Var.f328352c = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kbq);
        d1Var.f328353d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.gxw);
        d1Var.f328354e = inflate.findViewById(com.p314xaae8f345.mm.R.id.hho);
        d1Var.f328355f = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
        d1Var.f328356g = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.hjp);
        d1Var.f328357h = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.i2b);
        inflate.setTag(d1Var);
        return inflate;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        e23.e1 e1Var = (e23.e1) gVar;
        android.content.Intent intent = new android.content.Intent();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        intent.putExtra("Chat_User", "notifymessage");
        intent.putExtra("finish_direct", true);
        intent.putExtra("from_service_notify_content_search", true);
        intent.putExtra("need_hight_item", true);
        intent.putExtra("chat_from_scene", 6);
        intent.putExtra("msg_local_id", e1Var.f328364r);
        if (this.f328329b == 3) {
            intent.putExtra("key_notify_message_real_username", e1Var.f328365s);
        }
        j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
        return true;
    }
}
