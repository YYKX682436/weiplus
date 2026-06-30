package d22;

/* loaded from: classes12.dex */
public final class j0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d22.k0 f307382d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f307383e;

    public j0(d22.k0 k0Var, android.content.Context context) {
        this.f307382d = k0Var;
        this.f307383e = context;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        y12.h Ni;
        int itemId = menuItem.getItemId();
        d22.k0 k0Var = this.f307382d;
        k0Var.getClass();
        android.content.Context context = this.f307383e;
        if (itemId == 0) {
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = k0Var.f307385i;
            int i18 = c21053xdbf1e5f4.f68653x95b20dd4;
            l75.e0 e0Var = com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4.L2;
            if (i18 == 17) {
                return;
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
            if (com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(c21053xdbf1e5f4.mo42933xb5885648()) == null) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
                com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().J0(c21053xdbf1e5f4);
            }
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0 b0Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class);
            if (b0Var != null && (Ni = b0Var.Ni()) != null) {
                Ni.U(context, c21053xdbf1e5f4, k0Var.f445756a + 100000 + 1000000, k0Var.f445758c);
            }
            k0Var.c(3);
            return;
        }
        if (itemId == k0Var.f307387k) {
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f42 = k0Var.f307385i;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c21053xdbf1e5f42.mo42933xb5885648())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(k0Var.f307386j, "forward failed. emojiMsgWrap is null.");
                return;
            }
            new lb5.a().n(c21053xdbf1e5f42.mo42933xb5885648());
            c21053xdbf1e5f42.K2 = qk.z6.SEND_FROM_SCENE_FORWARD_FROM_PREVIEW;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s5.class))).hj(context, c21053xdbf1e5f42.mo42933xb5885648(), c21053xdbf1e5f42);
            k0Var.c(1);
            return;
        }
        if (itemId != k0Var.f307389m) {
            if (itemId == k0Var.f307388l) {
                k0Var.c(5);
                int i19 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
                e4Var.f293313g = 2;
                e4Var.f293309c = context.getText(com.p314xaae8f345.mm.R.C30867xcad56011.ggc);
                new rr.e(context, k0Var.f307385i, null, new d22.g0(e4Var.c(), context, k0Var));
                return;
            }
            return;
        }
        android.content.Context context2 = this.f307383e;
        k0Var.getClass();
        if (j62.e.g().l("clicfg_emoji_expose_config_switch_android", false, false, true)) {
            android.os.Bundle bundle = new android.os.Bundle();
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle.putString("appId", "wxalited4df4810a40b1d9ddc0cbea44d263fd9");
            bundle.putString("query", "{\"scene\":51}");
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            arrayList.add(k0Var.f445763h);
            bundle2.putStringArrayList("k_outside_expose_proof_item_list", arrayList);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(k0Var.f445761f)) {
                bundle2.putString("k_username", k0Var.f445758c);
            } else {
                bundle2.putString("k_username", k0Var.f445761f);
            }
            bundle2.putLong("k_expose_msg_id", k0Var.f445762g);
            bundle2.putInt("k_expose_msg_type", 47);
            bundle.putBundle(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099, bundle2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k0Var.f307386j, "open liteapp:wxalited4df4810a40b1d9ddc0cbea44d263fd9,page:");
            q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
            if (g0Var != null) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).kk(context2, bundle, true, false, new d22.h0(k0Var, context2));
            }
        } else {
            k0Var.a(context2);
        }
        k0Var.c(6);
    }
}
