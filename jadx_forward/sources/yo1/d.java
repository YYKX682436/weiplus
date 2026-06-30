package yo1;

/* loaded from: classes5.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1267xe125c5cf.ActivityC12864xc0eb7555 f545646d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1267xe125c5cf.ActivityC12864xc0eb7555 activityC12864xc0eb7555) {
        this.f545646d = activityC12864xc0eb7555;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/permission/PermissionRegainUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.List b17 = ro1.v.f479547a.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1267xe125c5cf.ActivityC12864xc0eb7555 activityC12864xc0eb7555 = this.f545646d;
        java.lang.String str = activityC12864xc0eb7555.f174314d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Count of available devices is ");
        java.util.ArrayList arrayList2 = (java.util.ArrayList) b17;
        sb6.append(arrayList2.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (arrayList2.isEmpty()) {
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(activityC12864xc0eb7555);
            e4Var.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
            e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.mza);
            e4Var.c();
            yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/permission/PermissionRegainUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        po1.d dVar = activityC12864xc0eb7555.f174315e;
        if (dVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54472x96df1280);
            throw null;
        }
        if (dVar.f438833f.length() == 0) {
            po1.d dVar2 = activityC12864xc0eb7555.f174315e;
            if (dVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54472x96df1280);
                throw null;
            }
            java.lang.String str2 = ((po1.d) kz5.n0.i0(b17)).f438833f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<set-?>");
            dVar2.f438833f = str2;
        }
        po1.d dVar3 = activityC12864xc0eb7555.f174315e;
        if (dVar3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54472x96df1280);
            throw null;
        }
        android.content.Intent d17 = to1.g.f502444a.d(po1.d.a(dVar3, null, null, null, null, "/", null, null, 111, null));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
        activityC12864xc0eb7555.startActivityForResult(d17, 296);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/permission/PermissionRegainUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
