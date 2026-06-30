package gn5;

/* loaded from: classes12.dex */
public class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.C22838xaf7a8190 f355211d;

    public j(com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.C22838xaf7a8190 c22838xaf7a8190) {
        this.f355211d = c22838xaf7a8190;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/popview/EmojiPopView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.C22838xaf7a8190 c22838xaf7a8190 = this.f355211d;
        int i18 = c22838xaf7a8190.f295221x;
        if (i18 == 1) {
            nr.f.f420577a.a(4);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPopView", "delete: %s， %s, %s", c22838xaf7a8190.f295217t, java.lang.Integer.valueOf(c22838xaf7a8190.f295216s), java.lang.Boolean.valueOf(c22838xaf7a8190.f295222y));
            if (!c22838xaf7a8190.f295222y && ((i17 = c22838xaf7a8190.f295216s) == 0 || i17 == 1)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPopView", "showLoading");
                c22838xaf7a8190.f295222y = true;
                c22838xaf7a8190.postDelayed(c22838xaf7a8190.A, 100L);
                c22838xaf7a8190.f295220w = new z12.g(c22838xaf7a8190.f295216s, 2, java.util.Collections.singletonList(c22838xaf7a8190.f295217t), null);
                gm0.j1.n().f354821b.g(c22838xaf7a8190.f295220w);
            }
        } else if (i18 == 2) {
            nr.f.f420577a.a(2);
            com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.C22838xaf7a8190.e(c22838xaf7a8190);
        } else {
            nr.f.f420577a.a(5);
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = c22838xaf7a8190.f295218u;
            if (c21053xdbf1e5f4 != null) {
                java.lang.String str = c21053xdbf1e5f4.f68663x861009b5;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str == null) {
                    str = "";
                }
                qk.c0 c0Var = new qk.c0(str);
                c0Var.f445731g = 3;
                c0Var.f445688a = 16;
                c0Var.f445738n = true;
                com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6 p6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6.class);
                if (p6Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EmojiPopView", "emoticon liteapp service not found");
                } else {
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f4) p6Var).wi(c22838xaf7a8190.getContext(), c0Var);
                }
            }
            c22838xaf7a8190.a();
        }
        yj0.a.h(this, "com/tencent/mm/view/popview/EmojiPopView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
