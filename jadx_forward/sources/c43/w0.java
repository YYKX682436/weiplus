package c43;

/* loaded from: classes15.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u33.h f120019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c43.x0 f120020e;

    public w0(c43.x0 x0Var, u33.h hVar) {
        this.f120020e = x0Var;
        this.f120019d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        android.graphics.drawable.GradientDrawable gradientDrawable;
        c43.x0 x0Var = this.f120020e;
        android.widget.ImageView imageView = x0Var.f120050a.f120031p;
        u33.h hVar = this.f120019d;
        imageView.setContentDescription(((y33.e) hVar).f66960x21eb2633);
        android.widget.TextView textView = x0Var.f120050a.f120034s;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = x0Var.f120050a.f120025g;
        java.lang.String str = ((y33.e) hVar).f66960x21eb2633;
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str));
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15822x6dfd348 c15822x6dfd348 = ((y33.e) hVar).f66965x1839e923;
        if (c15822x6dfd348 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c15822x6dfd348.f36873x2efe91)) {
            x0Var.f120050a.f120035t.setVisibility(8);
        } else {
            x0Var.f120050a.f120035t.setVisibility(0);
            java.lang.String string = x0Var.f120050a.f120025g.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fpo, c15822x6dfd348.f36873x2efe91);
            android.widget.TextView textView2 = x0Var.f120050a.f120035t;
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context2 = x0Var.f120050a.f120025g;
            ((ke0.e) xVar2).getClass();
            textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context2, string));
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f43 = c15822x6dfd348.f36872x5a72f63;
            if (c15748x3e43f43 != null) {
                java.lang.String str2 = c15748x3e43f43.f36646xa0e2915a;
                if (str2 == null) {
                    str2 = "";
                }
                java.lang.Integer l17 = s33.y.l(str2);
                if (l17 != null) {
                    x0Var.f120050a.f120035t.setTextColor(l17.intValue());
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15834xf3f76701 c15834xf3f76701 = ((y33.e) hVar).f66968xde00c86;
        boolean z18 = true;
        if (c15834xf3f76701 == null || c15834xf3f76701.f36905x14024ea2 == null) {
            x0Var.f120050a.f120037v.setVisibility(8);
            z17 = false;
        } else {
            x0Var.f120050a.f120037v.setVisibility(0);
            r53.y.a().e(x0Var.f120050a.f120037v, c15834xf3f76701.f36905x14024ea2.f36851xd4094ca9, null, null);
            z17 = true;
        }
        if (c15834xf3f76701 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c15834xf3f76701.f36903x2efe91)) {
            x0Var.f120050a.f120038w.setVisibility(8);
            z18 = z17;
        } else {
            x0Var.f120050a.f120038w.setVisibility(0);
            x0Var.f120050a.f120038w.setText(c15834xf3f76701.f36903x2efe91);
            java.lang.String str3 = c15834xf3f76701.f36906x6bc869ee;
            if (str3 == null) {
                str3 = "";
            }
            java.lang.Integer l18 = s33.y.l(str3);
            if (l18 != null) {
                x0Var.f120050a.f120038w.setTextColor(l18.intValue());
            }
        }
        if (z18) {
            java.lang.String str4 = c15834xf3f76701.f36900x7966cd12;
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            java.lang.Integer l19 = s33.y.l(str4 != null ? str4 : "");
            if (l19 != null && (gradientDrawable = (android.graphics.drawable.GradientDrawable) x0Var.f120050a.f120036u.getBackground()) != null) {
                gradientDrawable.setColor(l19.intValue());
            }
        }
        android.view.View view = x0Var.f120050a.f120036u;
        int i17 = z18 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$6$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$6$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        x0Var.f120050a.f120036u.setOnClickListener(new c43.v0(this, c15834xf3f76701));
    }
}
