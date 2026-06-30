package eg4;

/* loaded from: classes11.dex */
public class g1 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f334247d;

    /* renamed from: e, reason: collision with root package name */
    public final eg4.t1 f334248e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f334249f;

    public g1(android.content.Context context, eg4.t1 t1Var, boolean z17) {
        this.f334249f = false;
        this.f334247d = context;
        this.f334248e = t1Var;
        this.f334249f = z17;
    }

    public static void a(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.m7 m7Var, java.lang.String str, boolean z17) {
        boolean z18;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FConversationOnItemClickListener", "dealOnClick fail, talker is null");
            return;
        }
        r21.w.wi().i1(str);
        com.p314xaae8f345.mm.p2621x8fb0427b.p7 W0 = r21.w.Ai().W0(str);
        if (W0 != null && W0.f66490xff7bdab7 == 1 && W0.f66494x2262335f == 1) {
            z18 = true;
        } else {
            W0 = r21.w.Ai().b1(str);
            z18 = false;
        }
        if (W0 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FConversationOnItemClickListener", "onItemClick, lastRecvFmsg is null, talker = ".concat(str));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FConversationOnItemClickListener", "isforceHideReply = " + z18);
        if (W0.f66494x2262335f != 0) {
            b(context, m7Var, W0, z17, z18);
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.y8 D3 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).D3(W0.f66491xbeb3161d);
        if (D3.f277891a.length() <= 0) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("Contact_ShowFMessageList", true);
        bundle.putInt("Contact_Source_FMessage", D3.f277897g);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(D3.f277891a, true);
        if (n17 != null && ((int) n17.E2) > 0 && n17.r2()) {
            ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
            com.p314xaae8f345.mm.ui.p2690x38b72420.g1.a(context, n17, D3, true, true, bundle, "");
            return;
        }
        if (D3.f277900j > 0) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(D3.f277902l) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(D3.f277901k) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(D3.f277892b)) {
                bundle.putString("Contact_QQNick", D3.f277892b);
            }
            ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
            com.p314xaae8f345.mm.ui.p2690x38b72420.g1.b(context, D3, true, true, bundle);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(D3.f277898h) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(D3.f277899i)) {
            ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
            com.p314xaae8f345.mm.ui.p2690x38b72420.g1.b(context, D3, true, true, bundle);
            return;
        }
        r61.a i17 = m61.k.wi().i(D3.f277898h);
        if ((i17 != null && i17.e() != null && i17.e().length() > 0) || ((i17 = m61.k.wi().i(D3.f277899i)) != null && i17.e() != null && i17.e().length() > 0)) {
            if (i17.i() == null || i17.i().length() <= 0) {
                i17.f474325h = D3.f277891a;
                i17.O = 128;
                if (m61.k.wi().j(i17.e(), i17) == -1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FConversationOnItemClickListener", "update mobile contact username failed");
                    return;
                }
            }
            ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
            com.p314xaae8f345.mm.ui.p2690x38b72420.g1.b(context, D3, true, true, bundle);
            return;
        }
        if (n17 == null || ((int) n17.E2) <= 0) {
            ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
            com.p314xaae8f345.mm.ui.p2690x38b72420.g1.b(context, D3, true, true, bundle);
        } else {
            ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
            com.p314xaae8f345.mm.ui.p2690x38b72420.g1.a(context, n17, D3, true, true, bundle, "");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FConversationOnItemClickListener", "error : this is not the mobile contact, MD5 = " + D3.f277898h + " fullMD5:" + D3.f277899i);
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x03aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(android.content.Context r18, com.p314xaae8f345.mm.p2621x8fb0427b.m7 r19, com.p314xaae8f345.mm.p2621x8fb0427b.p7 r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 974
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eg4.g1.b(android.content.Context, com.tencent.mm.storage.m7, com.tencent.mm.storage.p7, boolean, boolean):void");
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
        yj0.a.b("com/tencent/mm/plugin/subapp/ui/friend/FConversationOnItemClickListener", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        if (this.f334249f) {
            i17 -= 2;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.m7 m7Var = (com.p314xaae8f345.mm.p2621x8fb0427b.m7) this.f334248e.getItem(i17);
        if (m7Var != null) {
            a(this.f334247d, m7Var, m7Var.f66376x114ef53e, false);
            yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/friend/FConversationOnItemClickListener", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FConversationOnItemClickListener", "onItemClick, item is null, pos = " + i17);
            yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/friend/FConversationOnItemClickListener", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }
}
