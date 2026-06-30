package e33;

/* loaded from: classes10.dex */
public class i0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final i33.e1 f328813d;

    /* renamed from: e, reason: collision with root package name */
    public final i33.t0 f328814e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f328815f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d f328816g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd f328817h;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d) {
        this.f328817h = activityC15653x403456cd;
        this.f328816g = c1161x57298f5d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = activityC15653x403456cd.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f328813d = (i33.e1) pf5.z.f435481a.a(activity).e(i33.e1.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = activityC15653x403456cd.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
        this.f328814e = (i33.t0) pf5.z.f435481a.a(activity2).e(i33.t0.class);
        this.f328815f = new e33.h0(this);
    }

    public final java.lang.String a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd = this.f328817h;
        java.lang.String B = activityC15653x403456cd.f220061m.B(this.f328816g.w());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(B) || !B.equals("album_business_bubble_media_by_coordinate")) {
            return B;
        }
        return activityC15653x403456cd.f220069p1 + "附近的照片和视频";
    }

    public final void b(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd = this.f328817h;
        i33.e1 e1Var = this.f328813d;
        if (e1Var != null) {
            e1Var.X6(activityC15653x403456cd.f220061m);
            return;
        }
        java.lang.Runnable runnable = this.f328815f;
        if (!z17) {
            activityC15653x403456cd.f220065o.removeCallbacks(runnable);
            activityC15653x403456cd.f220065o.postDelayed(runnable, 256L);
            return;
        }
        activityC15653x403456cd.f220065o.removeCallbacks(runnable);
        if (activityC15653x403456cd.f220065o.getVisibility() != 0) {
            activityC15653x403456cd.f220065o.setText(a());
            activityC15653x403456cd.f220065o.setVisibility(0);
            activityC15653x403456cd.f220065o.setAlpha(0.0f);
            activityC15653x403456cd.f220065o.animate().alpha(1.0f).setDuration(300L).start();
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$13", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd = this.f328817h;
        if (1 == i17) {
            b(true);
            activityC15653x403456cd.f220067p.setVisibility(8);
            t23.p0.h().b();
        } else {
            if (i17 == 0) {
                b(false);
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = this.f328816g;
                activityC15653x403456cd.f220070p2 = c1161x57298f5d.w();
                activityC15653x403456cd.f220072q2 = c1161x57298f5d.y();
                int i18 = activityC15653x403456cd.f220070p2;
                int i19 = activityC15653x403456cd.f220072q2;
                t23.z1 z1Var = t23.z1.f496846d;
                t23.z1.f496846d.b(t23.p1.f496780d, activityC15653x403456cd.f220070p2, activityC15653x403456cd.f220072q2, activityC15653x403456cd.f220061m.I());
            } else if (2 == i17) {
                com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo46128x89c4face(com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45819x8226d3ce(), activityC15653x403456cd.f220068p0);
                activityC15653x403456cd.f220068p0 = com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo46127x5f00c26e(com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45819x8226d3ce(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45818xeb5a95d8(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45817x95b06b3d(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45820x3ea298d1(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45821x95b0ae13() ? android.os.Process.myTid() : 0, com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45822xd4536876(), 702, com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45816x7ac12c81(), "MicroMsg.AlbumPreviewUI");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$13", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$13", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd = this.f328817h;
        i33.e1 e1Var = this.f328813d;
        if (e1Var != null) {
            e1Var.X6(activityC15653x403456cd.f220061m);
        } else {
            activityC15653x403456cd.f220065o.setText(a());
        }
        i33.t0 t0Var = this.f328814e;
        if (t0Var != null && t0Var.f369781g) {
            yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$13", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = this.f328816g;
        int w17 = c1161x57298f5d.w();
        int y17 = c1161x57298f5d.y();
        int i19 = activityC15653x403456cd.f220070p2;
        int i27 = activityC15653x403456cd.f220072q2;
        if (activityC15653x403456cd.f220070p2 != w17 || activityC15653x403456cd.f220072q2 != y17) {
            activityC15653x403456cd.f220070p2 = w17;
            activityC15653x403456cd.f220072q2 = y17;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (int i28 = activityC15653x403456cd.f220070p2; i28 <= activityC15653x403456cd.f220072q2; i28++) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 E = activityC15653x403456cd.f220061m.E(i28);
                if (E != null) {
                    arrayList2.add(j33.d0.d(E.o(), null, -1));
                }
            }
            arrayList2.size();
            t23.p0.h().d(arrayList2);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = activityC15653x403456cd.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            i33.b1 b1Var = (i33.b1) pf5.z.f435481a.a(activity).a(i33.b1.class);
            int size = arrayList2.size();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6630xab45bdc9 c6630xab45bdc9 = b1Var.f369695g;
            if (c6630xab45bdc9.f139830h <= 0) {
                c6630xab45bdc9.f139830h = size;
            }
            if (i18 != 0) {
                if (i18 < 0) {
                    activityC15653x403456cd.f220066o2 = t23.p1.f496781e;
                } else {
                    activityC15653x403456cd.f220066o2 = t23.p1.f496782f;
                }
                t23.p1 p1Var = activityC15653x403456cd.f220066o2;
                t23.z1 z1Var = t23.z1.f496846d;
                t23.z1.f496846d.b(p1Var, activityC15653x403456cd.f220070p2, activityC15653x403456cd.f220072q2, activityC15653x403456cd.f220061m.I());
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$13", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
