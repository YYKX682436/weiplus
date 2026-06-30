package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes8.dex */
public class wl extends com.p314xaae8f345.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public final android.content.Context f243245o;

    /* renamed from: p, reason: collision with root package name */
    public final int f243246p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17459xab65a958 f243247q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wl(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17459xab65a958 activityC17459xab65a958, android.content.Context context, int i17) {
        super(context, new f21.i0());
        this.f243247q = activityC17459xab65a958;
        this.f243245o = context;
        this.f243246p = i17;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        f21.i0 i0Var = (f21.i0) obj;
        if (i0Var == null) {
            i0Var = new f21.i0();
        }
        i0Var.a(cursor);
        return i0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.z9, android.widget.Adapter
    public int getCount() {
        return j().getCount() + 2;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.jq jqVar;
        android.view.View view2;
        android.graphics.Bitmap i07;
        android.content.Context context = this.f243245o;
        if (view == null) {
            view2 = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570984cm0, null);
            int i18 = this.f243246p;
            view2.setLayoutParams(new android.widget.AbsListView.LayoutParams(i18, i18));
            jqVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.jq();
            jqVar.f242744a = (android.widget.LinearLayout) view2.findViewById(com.p314xaae8f345.mm.R.id.mi6);
            jqVar.f242745b = (android.widget.LinearLayout) view2.findViewById(com.p314xaae8f345.mm.R.id.f568337mi5);
            jqVar.f242746c = (android.widget.LinearLayout) view2.findViewById(com.p314xaae8f345.mm.R.id.mi_);
            jqVar.f242747d = (android.widget.LinearLayout) view2.findViewById(com.p314xaae8f345.mm.R.id.mia);
            jqVar.f242748e = (android.widget.LinearLayout) view2.findViewById(com.p314xaae8f345.mm.R.id.f568336mi4);
            view2.setTag(jqVar);
        } else {
            jqVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.jq) view.getTag();
            view2 = view;
        }
        int j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1((java.lang.Integer) gm0.j1.u().c().l(12311, null), -2);
        ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
        f21.b wi6 = f21.r0.wi();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17459xab65a958 activityC17459xab65a958 = this.f243247q;
        f21.a m07 = wi6.m0(activityC17459xab65a958.f242193m);
        if (i17 == 0) {
            boolean z17 = activityC17459xab65a958.f242192i;
            if (!(z17 && j17 == -2) && (!(!z17 && j17 == -2 && m07 == null) && (m07 == null || m07.f340366b != -2))) {
                jqVar.a("downloaded");
            } else {
                jqVar.a("using");
            }
            ((android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.mi8)).setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.czx);
            return view2;
        }
        if (i17 == 1) {
            boolean z18 = activityC17459xab65a958.f242192i;
            if (!(z18 && j17 == 0) && (!(!z18 && j17 == 0 && m07 == null) && (m07 == null || m07.f340366b != 0))) {
                jqVar.a("downloaded");
            } else {
                jqVar.a("using");
            }
            android.content.res.Resources resources = context.getResources();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.bh8));
            arrayList.add(resources);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSelectBgUI$BgAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/setting/ui/setting/SettingsSelectBgUI$BgAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            ((android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.mi8)).setImageBitmap(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(decodeResource, true, activityC17459xab65a958.f242187d));
            return view2;
        }
        f21.i0 i0Var = (f21.i0) getItem(i17 - 2);
        ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
        f21.j0 Bi = f21.r0.Bi();
        if (gm0.j1.u().l()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            Bi.getClass();
            sb6.append(zz1.a.a());
            sb6.append(i0Var.f340446a + "_" + i0Var.f340452g + "_thumb.jpg");
            i07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.i0(sb6.toString());
        } else {
            android.content.res.Resources resources2 = activityC17459xab65a958.getResources();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.bks));
            arrayList2.add(resources2);
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSelectBgUI$BgAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            i07 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue());
            yj0.a.e(obj2, i07, "com/tencent/mm/plugin/setting/ui/setting/SettingsSelectBgUI$BgAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        }
        if (i07 == null) {
            int i19 = i0Var.f340446a;
            int i27 = i0Var.f340452g;
            Bi.getClass();
            if (Bi.f340462d.mo70514xb06685ab("packageinfo2", "id= ? and type =?", new java.lang.String[]{"" + i19, "" + i27}) > 0) {
                Bi.m145262xf35bbb4();
            }
            return view2;
        }
        ((android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.mi8)).setImageBitmap(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(i07, true, 10.0f));
        int i28 = i0Var.f340451f;
        if (i28 != 1) {
            if (i28 != 2) {
                if (i28 == 3) {
                    jqVar.a("downloading");
                } else if (i28 == 4) {
                    jqVar.a("canceling");
                } else if (i28 == 5) {
                    jqVar.a("undownloaded");
                }
            } else if (activityC17459xab65a958.f242192i || m07 == null || m07.f340366b != i0Var.f340446a) {
                jqVar.a("downloaded");
            } else {
                jqVar.a("using");
            }
        } else if (activityC17459xab65a958.f242192i || m07 == null || m07.f340366b == i0Var.f340446a) {
            jqVar.a("using");
        } else {
            jqVar.a("downloaded");
        }
        return view2;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void o() {
        q();
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void q() {
        ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
        f21.j0 Bi = f21.r0.Bi();
        Bi.getClass();
        s(Bi.f340462d.B("select packageinfo2.localId,packageinfo2.id,packageinfo2.version,packageinfo2.name,packageinfo2.size,packageinfo2.packname,packageinfo2.status,packageinfo2.type,packageinfo2.reserved1,packageinfo2.reserved2,packageinfo2.reserved3,packageinfo2.reserved4 from packageinfo2   where packageinfo2.type=1", null));
        notifyDataSetChanged();
    }
}
