package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752;

/* loaded from: classes12.dex */
public class w0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0 f182624d;

    public w0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0 h0Var) {
        this.f182624d = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/gallery/FavMediaHistoryGallery$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.y1 y1Var = this.f182624d.f182474a;
        if (y1Var != null) {
            int intValue = ((java.lang.Integer) view.getTag()).intValue();
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.l2 l2Var = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.l2) y1Var;
            l2Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "[handleSelectedItem] type:%s", java.lang.Integer.valueOf(intValue));
            java.util.ArrayList arrayList2 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.d1.f182441a.f182451a;
            if (arrayList2 == null || arrayList2.size() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "handleSelectedItem() list == null");
            } else if (intValue == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0 h0Var = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0) l2Var.f182526a;
                h0Var.getClass();
                if (arrayList2.size() > 0) {
                    java.util.ArrayList arrayList3 = (java.util.ArrayList) h0Var.f182497x;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("Select_Conv_Type", 3);
                    intent.putExtra("mutil_select_is_ret", true);
                    if (arrayList3.size() == 1) {
                        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1 b1Var = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1) arrayList2.get(0);
                        java.lang.String X = o72.x1.X(b1Var.f182431b);
                        java.lang.String x17 = o72.x1.x(b1Var.f182431b);
                        if (com.p314xaae8f345.mm.vfs.w6.j(X)) {
                            intent.putExtra("image_path", X);
                        } else {
                            intent.putExtra("image_path", x17);
                        }
                        intent.putExtra("Retr_Msg_Type", (b1Var.c() || b1Var.d()) ? 1 : 0);
                        intent.putExtra("select_is_ret", true);
                    } else {
                        intent.putExtra("scene_from", 1);
                        intent.putExtra("Retr_Msg_Type", 17);
                    }
                    j45.l.v(h0Var.f182485l, ".ui.transmit.SelectConversationUI", intent, 1);
                    java.util.Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        o72.v2.d(((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1) it.next()).f182430a.f67645x88be67a1, 1, 0);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.y0 y0Var = h0Var.f182488o;
                    if (y0Var != null) {
                        y0Var.l3(0, arrayList3.size());
                    }
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0) l2Var.f182526a).i();
            } else if (intValue == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0 h0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0) l2Var.f182526a;
                h0Var2.getClass();
                if (arrayList2.size() > 0) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.util.HashSet hashSet = new java.util.HashSet();
                    java.util.Iterator it6 = arrayList2.iterator();
                    boolean z17 = false;
                    o72.r2 r2Var = null;
                    while (it6.hasNext()) {
                        r2Var = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1) it6.next()).f182430a;
                        if (r2Var == null || !((i17 = r2Var.f67657x2262335f) == 18 || i17 == 14)) {
                            arrayList4.add(r2Var);
                        } else {
                            hashSet.add(java.lang.Long.valueOf(r2Var.f67645x88be67a1));
                            z17 = true;
                        }
                    }
                    int size = arrayList4.size();
                    android.app.Activity activity = h0Var2.f182485l;
                    if (size != 0) {
                        db5.e1.u(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_i), "", new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.k0(h0Var2, arrayList4, z17), null);
                    } else if (hashSet.size() >= 2) {
                        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257.e7(activity);
                    } else {
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activity);
                        u1Var.g(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_j));
                        u1Var.j(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_c));
                        u1Var.n(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.caz));
                        u1Var.c(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.x0(h0Var2), new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.i0(h0Var2, r2Var));
                        u1Var.q(false);
                    }
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0) l2Var.f182526a).i();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/gallery/FavMediaHistoryGallery$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
