package com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui;

/* loaded from: classes2.dex */
public class m implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jt4.k f262584a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19163x451b3a3a f262585b;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19163x451b3a3a activityC19163x451b3a3a, jt4.k kVar) {
        this.f262585b = activityC19163x451b3a3a;
        this.f262584a = kVar;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.ng5 ng5Var = this.f262584a.f383199s;
        java.lang.String str2 = ng5Var.f462925n;
        com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19163x451b3a3a activityC19163x451b3a3a = this.f262585b;
        activityC19163x451b3a3a.f262567m = str2;
        activityC19163x451b3a3a.f262568n = ng5Var.f462926o;
        activityC19163x451b3a3a.getClass();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ng5Var.f462920f)) {
            activityC19163x451b3a3a.mo54450xbf7c1df6(ng5Var.f462920f);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ng5Var.f462922h)) {
            activityC19163x451b3a3a.f262561d.setText(ng5Var.f462922h);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ng5Var.f462921g)) {
            activityC19163x451b3a3a.f262566i.m75396xca029dad(ng5Var.f462921g);
        }
        r45.zs zsVar = ng5Var.f462923i;
        if (zsVar != null) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zsVar.f473878d)) {
                activityC19163x451b3a3a.f262562e.setText(zsVar.f473878d);
            }
            java.util.LinkedList linkedList = zsVar.f473879e;
            if (linkedList != null) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    java.lang.String str3 = (java.lang.String) it.next();
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) android.view.LayoutInflater.from(activityC19163x451b3a3a).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570250a50, (android.view.ViewGroup) activityC19163x451b3a3a.f262564g, false);
                    ((android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.d_9)).setText(str3);
                    activityC19163x451b3a3a.f262564g.addView(linearLayout);
                }
            }
        }
        if (ng5Var.f462928q != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletECardLogoutUI", "show trade detail");
            r45.jo6 jo6Var = ng5Var.f462928q;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jo6Var.f459527d)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.d7 d7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.d7(2, new com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.n(activityC19163x451b3a3a, jo6Var));
                android.text.SpannableString spannableString = new android.text.SpannableString(jo6Var.f459527d);
                spannableString.setSpan(d7Var, 0, spannableString.length(), 18);
                activityC19163x451b3a3a.f262563f.setClickable(true);
                activityC19163x451b3a3a.f262563f.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(activityC19163x451b3a3a));
                activityC19163x451b3a3a.f262563f.setText(spannableString);
                activityC19163x451b3a3a.f262563f.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.o(activityC19163x451b3a3a));
                activityC19163x451b3a3a.f262563f.setVisibility(0);
            }
        }
        android.view.View view = activityC19163x451b3a3a.f262565h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet_ecard/ui/WalletECardLogoutUI", "updateView", "(Lcom/tencent/mm/protocal/protobuf/QryCancelECardDescRes;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/wallet_ecard/ui/WalletECardLogoutUI", "updateView", "(Lcom/tencent/mm/protocal/protobuf/QryCancelECardDescRes;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
