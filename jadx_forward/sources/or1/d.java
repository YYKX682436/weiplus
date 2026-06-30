package or1;

/* loaded from: classes12.dex */
public class d extends fb5.b {
    public d(or1.f fVar) {
    }

    @Override // fb5.b
    public void a(android.view.View view, fb5.a aVar) {
        if (view == null || aVar == null || !(aVar instanceof or1.e)) {
            return;
        }
        or1.e eVar = (or1.e) aVar;
        eVar.f402217a = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.a9n);
        eVar.f429010c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.kbg);
        eVar.f429009b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.cfx);
        eVar.f429013f = view.findViewById(com.p314xaae8f345.mm.R.id.f564923aj3);
        eVar.f429012e = view.findViewById(com.p314xaae8f345.mm.R.id.f569071ox2);
        eVar.f429011d = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.hed);
    }

    @Override // fb5.b
    public void b(android.content.Context context, fb5.a aVar, fb5.c cVar, java.lang.Object... objArr) {
        java.lang.Object obj;
        if (context == null || aVar == null || cVar == null || (obj = cVar.f342415b) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizRecommDataItem", "Context or ViewHolder or DataItem or DataItem.data is null.");
            return;
        }
        if (!(aVar instanceof or1.e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizRecommDataItem", "The ViewHolder is not a instance of BizRecommViewHolder.");
            return;
        }
        if (!(obj instanceof r45.fx5)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizRecommDataItem", "The ViewHolder is not a instance of SearchOrRecommendItem.");
            return;
        }
        or1.e eVar = (or1.e) aVar;
        or1.f fVar = (or1.f) cVar;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(eVar.f402217a, fVar.f429020i);
        eVar.f429010c.setText(fVar.f429019h, android.widget.TextView.BufferType.SPANNABLE);
        android.view.View view = eVar.f429013f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/brandservice/ui/BizRecommDataItem$1", "fillingView", "(Landroid/content/Context;Lcom/tencent/mm/ui/base/sortview/BaseDataItem$BaseViewHolder;Lcom/tencent/mm/ui/base/sortview/BaseDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/brandservice/ui/BizRecommDataItem$1", "fillingView", "(Landroid/content/Context;Lcom/tencent/mm/ui/base/sortview/BaseDataItem$BaseViewHolder;Lcom/tencent/mm/ui/base/sortview/BaseDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = eVar.f429012e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/brandservice/ui/BizRecommDataItem$1", "fillingView", "(Landroid/content/Context;Lcom/tencent/mm/ui/base/sortview/BaseDataItem$BaseViewHolder;Lcom/tencent/mm/ui/base/sortview/BaseDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/brandservice/ui/BizRecommDataItem$1", "fillingView", "(Landroid/content/Context;Lcom/tencent/mm/ui/base/sortview/BaseDataItem$BaseViewHolder;Lcom/tencent/mm/ui/base/sortview/BaseDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        eVar.f429011d.setText((java.lang.CharSequence) null, android.widget.TextView.BufferType.SPANNABLE);
        lr1.m.b(eVar.f429009b, fVar.f429021j);
    }

    @Override // fb5.b
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        return view == null ? android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.ciy, null) : view;
    }

    @Override // fb5.b
    public boolean d(android.content.Context context, android.view.View view, fb5.c cVar, java.lang.Object... objArr) {
        or1.m mVar;
        or1.l lVar;
        if (!(cVar instanceof or1.f)) {
            return false;
        }
        or1.f fVar = (or1.f) cVar;
        r45.fx5 fx5Var = (r45.fx5) cVar.f342415b;
        r45.du5 du5Var = fx5Var.f456235e;
        java.lang.String str = du5Var != null ? du5Var.f454289d : null;
        r45.du5 du5Var2 = fx5Var.f456234d;
        java.lang.String str2 = du5Var2 != null ? du5Var2.f454289d : null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizRecommDataItem", "onItemClick but username is null");
            return false;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true);
        android.content.Intent intent = new android.content.Intent();
        if (n17.r2()) {
            intent.putExtra("Contact_User", str2);
            intent.putExtra("Contact_Scene", 55);
        } else {
            intent.putExtra("Contact_User", str2);
            intent.putExtra("Contact_Alias", fx5Var.f456244q);
            intent.putExtra("Contact_Nick", str);
            intent.putExtra("Contact_Signature", fx5Var.f456239i);
            intent.putExtra("Contact_RegionCode", com.p314xaae8f345.mm.p2621x8fb0427b.ha.q(fx5Var.f456247t, fx5Var.f456237g, fx5Var.f456238h));
            intent.putExtra("Contact_Sex", fx5Var.f456236f);
            intent.putExtra("Contact_VUser_Info", fx5Var.f456242o);
            intent.putExtra("Contact_VUser_Info_Flag", fx5Var.f456241n);
            intent.putExtra("Contact_KWeibo_flag", fx5Var.f456246s);
            intent.putExtra("Contact_KWeibo", fx5Var.f456243p);
            intent.putExtra("Contact_KWeiboNick", fx5Var.f456245r);
            intent.putExtra("Contact_Scene", 55);
            r45.va0 va0Var = fx5Var.f456248u;
            if (va0Var != null) {
                try {
                    intent.putExtra("Contact_customInfo", va0Var.mo14344x5f01b1f6());
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BizRecommDataItem", e17, "", new java.lang.Object[0]);
                }
            }
        }
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.l(intent, context);
        if (objArr != null && objArr.length > 0) {
            java.lang.Object obj = objArr[0];
            if (obj instanceof or1.m) {
                mVar = (or1.m) obj;
                lVar = fVar.f439466g;
                if (lVar != null && mVar != null) {
                    lVar.a(mVar, cVar, 1, str2, fVar.f439465f, fVar.f439464e);
                }
                return true;
            }
        }
        mVar = null;
        lVar = fVar.f439466g;
        if (lVar != null) {
            lVar.a(mVar, cVar, 1, str2, fVar.f439465f, fVar.f439464e);
        }
        return true;
    }
}
