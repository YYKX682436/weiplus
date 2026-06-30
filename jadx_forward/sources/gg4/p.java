package gg4;

/* loaded from: classes11.dex */
public class p extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f353300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e.ActivityC18539xe0826959 f353301e;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e.ActivityC18539xe0826959 activityC18539xe0826959, android.content.Context context) {
        this.f353301e = activityC18539xe0826959;
        this.f353300d = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e.ActivityC18539xe0826959 activityC18539xe0826959 = this.f353301e;
        return activityC18539xe0826959.f253954e.size() + activityC18539xe0826959.f253955f.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        gg4.r rVar;
        android.view.View view2;
        java.lang.String str;
        android.content.Context context = this.f353300d;
        if (view == null) {
            view2 = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.ciy, null);
            rVar = new gg4.r();
            rVar.f353305b = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.a9n);
            rVar.f353306c = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.kbg);
            rVar.f353308e = view2.findViewById(com.p314xaae8f345.mm.R.id.f569071ox2);
            rVar.f353307d = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.hed);
            rVar.f353309f = view2.findViewById(com.p314xaae8f345.mm.R.id.f564923aj3);
            view2.setTag(rVar);
        } else {
            rVar = (gg4.r) view.getTag();
            view2 = view;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e.ActivityC18539xe0826959 activityC18539xe0826959 = this.f353301e;
        if (i17 >= activityC18539xe0826959.f253954e.size()) {
            r45.cx5 cx5Var = (r45.cx5) activityC18539xe0826959.f253955f.get(i17 - activityC18539xe0826959.f253954e.size());
            rVar.f353304a = cx5Var.f453433d;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(rVar.f353305b, rVar.f353304a);
            rVar.f353305b.setTag(rVar.f353304a);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(rVar.f353305b, rVar.f353304a, null);
            android.view.View view3 = rVar.f353308e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$ContactSearchResultAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$ContactSearchResultAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = rVar.f353309f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$ContactSearchResultAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$ContactSearchResultAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            rVar.f353307d.setText("");
            try {
                android.widget.TextView textView = rVar.f353306c;
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String str2 = cx5Var.f453434e;
                float textSize = rVar.f353306c.getTextSize();
                ((ke0.e) xVar).getClass();
                textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str2, textSize));
            } catch (java.lang.Exception unused) {
                rVar.f353306c.setText("");
            }
            return view2;
        }
        r45.gw5 gw5Var = (r45.gw5) activityC18539xe0826959.f253954e.get(i17);
        if (gw5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactSearchResultAdapter", "shouldnot be empty");
            return view2;
        }
        rVar.f353304a = gw5Var.f457094d.f454289d;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(rVar.f353305b, rVar.f353304a);
        rVar.f353305b.setTag(rVar.f353304a);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(rVar.f353305b, rVar.f353304a, null);
        java.lang.String str3 = gw5Var.f457094d.f454289d;
        gg4.q qVar = (gg4.q) ((java.util.HashMap) activityC18539xe0826959.f253956g).get(str3);
        if (qVar == null) {
            qVar = new gg4.q(null);
            ((java.util.HashMap) activityC18539xe0826959.f253956g).put(str3, qVar);
            r45.va0 va0Var = gw5Var.C;
            if (va0Var != null) {
                qk.o oVar = new qk.o();
                oVar.f66748xdec927b = str3;
                oVar.f66733x6baace8e = va0Var.f469554d;
                oVar.f66734xea1bd3d4 = va0Var.f469557g;
                oVar.f66735x6bac33d0 = va0Var.f469556f;
                oVar.f66740x26b3182a = va0Var.f469555e;
                qk.j k17 = oVar.D0(false) != null ? oVar.D0(false).k() : null;
                if (k17 != null) {
                    qk.n D0 = oVar.D0(false);
                    org.json.JSONObject jSONObject = D0.f445789a;
                    if (jSONObject != null) {
                        D0.f445811w = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(jSONObject.optString("IsTrademarkProtection"), 0) == 1;
                    }
                    qVar.f353302a = D0.f445811w && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(k17.f445710b);
                    qVar.f353303b = gw5Var.f457104q != 0;
                }
            }
        }
        android.view.View view5 = rVar.f353308e;
        int i18 = qVar.f353303b ? 0 : 8;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList3.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$ContactSearchResultAdapter", "dealVerifyInfo", "(Lcom/tencent/mm/protocal/protobuf/SearchContactItem;Lcom/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$ContactSearchResultAdapter", "dealVerifyInfo", "(Lcom/tencent/mm/protocal/protobuf/SearchContactItem;Lcom/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view6 = rVar.f353309f;
        int i19 = qVar.f353302a ? 0 : 8;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$ContactSearchResultAdapter", "dealVerifyInfo", "(Lcom/tencent/mm/protocal/protobuf/SearchContactItem;Lcom/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$ContactSearchResultAdapter", "dealVerifyInfo", "(Lcom/tencent/mm/protocal/protobuf/SearchContactItem;Lcom/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.String str4 = gw5Var.f457102o;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str4 == null) {
            str4 = "";
        }
        try {
            android.widget.TextView textView2 = rVar.f353307d;
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            float textSize2 = rVar.f353307d.getTextSize();
            ((ke0.e) xVar2).getClass();
            textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str4, textSize2));
        } catch (java.lang.Exception unused2) {
            rVar.f353307d.setText("");
        }
        try {
            android.widget.TextView textView3 = rVar.f353306c;
            le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gw5Var.f457095e.f454289d)) {
                str = gw5Var.f457095e.f454289d;
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gw5Var.f457107t)) {
                str = gw5Var.f457094d.f454289d;
                if (str == null) {
                    str = "";
                }
            } else {
                str = gw5Var.f457107t;
            }
            float textSize3 = rVar.f353306c.getTextSize();
            ((ke0.e) xVar3).getClass();
            textView3.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str, textSize3));
        } catch (java.lang.Exception unused3) {
            rVar.f353306c.setText("");
        }
        return view2;
    }
}
