package or1;

/* loaded from: classes9.dex */
public class j0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.C12980x8e9ea871 f429042d;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.C12980x8e9ea871 c12980x8e9ea871) {
        this.f429042d = c12980x8e9ea871;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/ui/EnterpriseBizContactListView$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        java.lang.Object tag = view.getTag();
        if (tag == null || !(tag instanceof or1.u0)) {
            yj0.a.h(this, "com/tencent/mm/plugin/brandservice/ui/EnterpriseBizContactListView$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        or1.u0 u0Var = (or1.u0) tag;
        r45.d67 d67Var = u0Var.f429113c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.C12980x8e9ea871 c12980x8e9ea871 = this.f429042d;
        if (d67Var != null) {
            c12980x8e9ea871.A.a(d67Var);
            yj0.a.h(this, "com/tencent/mm/plugin/brandservice/ui/EnterpriseBizContactListView$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(u0Var.f429111a)) {
            yj0.a.h(this, "com/tencent/mm/plugin/brandservice/ui/EnterpriseBizContactListView$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        boolean l17 = r01.z.l(u0Var.f429111a);
        rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
        java.lang.String str = u0Var.f429111a;
        ((qv.o) u2Var).getClass();
        boolean g17 = r01.z.g(str);
        qk.o b17 = r01.z.b(u0Var.f429111a);
        java.lang.String z07 = b17 == null ? null : b17.z0();
        if (z07 == null) {
            z07 = "";
        }
        if (l17) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", z07);
            intent.putExtra("useJs", true);
            intent.putExtra("srcUsername", u0Var.f429111a);
            intent.putExtra("bizofstartfrom", "enterpriseHomeSubBrand");
            intent.addFlags(67108864);
            j45.l.j(c12980x8e9ea871.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.C12980x8e9ea871.g(c12980x8e9ea871, b17, 2);
            yj0.a.h(this, "com/tencent/mm/plugin/brandservice/ui/EnterpriseBizContactListView$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (g17) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Contact_User", u0Var.f429111a);
            intent2.addFlags(67108864);
            intent2.putExtra("biz_chat_from_scene", 3);
            j45.l.u(c12980x8e9ea871.getContext(), ".ui.bizchat.BizChatConversationUI", intent2, null);
        } else {
            android.content.Intent intent3 = new android.content.Intent();
            intent3.addFlags(67108864);
            intent3.putExtra("finish_direct", true);
            intent3.putExtra("Chat_User", u0Var.f429111a);
            intent3.putExtra("chat_from_scene", 2);
            android.content.Context context = c12980x8e9ea871.getContext();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandService.BrandServiceApplication", "startChattingUI");
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.j(intent3, context);
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.C12980x8e9ea871.g(c12980x8e9ea871, b17, 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/ui/EnterpriseBizContactListView$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
