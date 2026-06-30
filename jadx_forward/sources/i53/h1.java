package i53;

/* loaded from: classes8.dex */
public class h1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i53.i1 f370122d;

    public h1(i53.i1 i1Var) {
        this.f370122d = i1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        boolean z17;
        boolean z18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!(view.getTag(com.p314xaae8f345.mm.R.id.jdi) instanceof java.lang.Integer)) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.Integer num = (java.lang.Integer) view.getTag(com.p314xaae8f345.mm.R.id.jdi);
        if (num == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameLocalMediaView", "[onClick] null == position!");
            yj0.a.h(this, "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        i53.i1 i1Var = this.f370122d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) i1Var.f370127d.get(num.intValue());
        if (abstractC15633xee433078 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(abstractC15633xee433078.f219963e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameLocalMediaView", "[onClick] null == item!");
            yj0.a.h(this, "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLocalMediaView", "click Image path:" + abstractC15633xee433078.f219963e);
        if (i1Var.f370128e.contains(abstractC15633xee433078)) {
            i1Var.f370128e.remove(abstractC15633xee433078);
            z18 = true;
            z17 = false;
        } else {
            ((d60.y) ((e60.c1) i95.n0.c(e60.c1.class))).getClass();
            if (t23.p0.k().f496830f == 3 && abstractC15633xee433078.f219971p.equalsIgnoreCase("image/gif")) {
                com.p314xaae8f345.mm.vfs.w6.k(abstractC15633xee433078.f219963e);
                if (!((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.p1) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.f6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.f6.class))).wi(abstractC15633xee433078.f219963e)) {
                    android.content.Context context = i1Var.f370129f;
                    db5.e1.T(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fjh));
                    yj0.a.h(this, "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
            }
            if (i1Var.f370128e.size() < i1Var.f370131h) {
                i1Var.f370128e.add(abstractC15633xee433078);
                z17 = false;
            } else {
                z17 = true;
            }
            z18 = z17;
        }
        if (z17) {
            int i17 = i1Var.f370130g;
            if (i17 == 1) {
                android.content.Context context2 = i1Var.f370129f;
                android.content.res.Resources resources = context2.getResources();
                int i18 = i1Var.f370131h;
                db5.e1.T(context2, resources.getQuantityString(com.p314xaae8f345.mm.R.C30866xe3ab596f.f571211o, i18, java.lang.Integer.valueOf(i18)));
            } else if (i17 == 2) {
                android.content.Context context3 = i1Var.f370129f;
                android.content.res.Resources resources2 = context3.getResources();
                int i19 = i1Var.f370131h;
                db5.e1.T(context3, resources2.getQuantityString(com.p314xaae8f345.mm.R.C30866xe3ab596f.f571214r, i19, java.lang.Integer.valueOf(i19)));
            } else {
                android.content.Context context4 = i1Var.f370129f;
                android.content.res.Resources resources3 = context4.getResources();
                int i27 = i1Var.f370131h;
                db5.e1.T(context4, resources3.getQuantityString(com.p314xaae8f345.mm.R.C30866xe3ab596f.f571212p, i27, java.lang.Integer.valueOf(i27)));
            }
        }
        if (true == z18) {
            ((android.widget.CheckBox) view.getTag(com.p314xaae8f345.mm.R.id.jdh)).setChecked(false);
            android.view.View view2 = (android.view.View) view.getTag(com.p314xaae8f345.mm.R.id.f567402je0);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter$7", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter$7", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.view.View) view.getTag(com.p314xaae8f345.mm.R.id.f567402je0)).setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560799uj);
        } else {
            ((android.widget.CheckBox) view.getTag(com.p314xaae8f345.mm.R.id.jdh)).setChecked(true);
            android.view.View view3 = (android.view.View) view.getTag(com.p314xaae8f345.mm.R.id.f567402je0);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter$7", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter$7", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.view.View) view.getTag(com.p314xaae8f345.mm.R.id.f567402je0)).setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77911xe61cad92);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15908x78af54de c15908x78af54de = i1Var.f370134n;
            int i28 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15908x78af54de.f221577q;
            c15908x78af54de.c(1, 2, null);
        }
        i53.b1 b1Var = i1Var.f370132i;
        if (b1Var != null) {
            ((i53.z0) b1Var).a(i1Var.f370128e.size());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
