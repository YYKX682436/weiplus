package pk2;

/* loaded from: classes3.dex */
public final class e4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.f4 f437238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437239e;

    public e4(pk2.f4 f4Var, pk2.o9 o9Var) {
        this.f437238d = f4Var;
        this.f437239e = o9Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        pk2.g8 g8Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9 o9Var;
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar = dk2.ef.I;
        if (eVar != null) {
            java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
            pk2.f4 f4Var = this.f437238d;
            int i18 = f4Var.f437265j;
            pk2.o9 o9Var2 = this.f437239e;
            if (valueOf != null && valueOf.intValue() == i18) {
                pk2.f4.E(f4Var);
                if (efVar.k(eVar) != null) {
                    com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = o9Var2.f437611d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("key_media_type", 2);
                    intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 4);
                    j45.l.v(context, "com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI", intent, 3);
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = f4Var.f437269n;
                if (k0Var != null) {
                    k0Var.u();
                    return;
                }
                return;
            }
            if (valueOf != null && valueOf.intValue() == 0) {
                pk2.f4.E(f4Var);
                if (efVar.k(eVar) != null) {
                    com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context2 = o9Var2.f437611d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("key_media_type", 2);
                    intent2.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 4);
                    j45.l.v(context2, "com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI", intent2, 1);
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = f4Var.f437269n;
                if (k0Var2 != null) {
                    k0Var2.u();
                    return;
                }
                return;
            }
            if (valueOf != null && valueOf.intValue() == f4Var.f437266k) {
                pk2.f4.E(f4Var);
                dk2.xf k17 = efVar.k(eVar);
                if (k17 != null) {
                    ((dk2.r4) k17).X(o9Var2.f437611d, 4);
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var3 = f4Var.f437269n;
                if (k0Var3 != null) {
                    k0Var3.u();
                    return;
                }
                return;
            }
            if (valueOf != null && valueOf.intValue() == f4Var.f437263h) {
                pk2.f4.E(f4Var);
                dk2.xf k18 = efVar.k(eVar);
                if (k18 != null) {
                    ((dk2.r4) k18).X(o9Var2.f437611d, 2);
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var4 = f4Var.f437269n;
                if (k0Var4 != null) {
                    k0Var4.u();
                    return;
                }
                return;
            }
            if (valueOf != null && valueOf.intValue() == f4Var.f437264i) {
                pk2.d9 d9Var = o9Var2.f437615f;
                if (d9Var != null && (g8Var = d9Var.f437191a) != null && (o9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9) ((pk2.k9) g8Var).f437457a.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9.class)) != null) {
                    o9Var.E1();
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var5 = f4Var.f437269n;
                if (k0Var5 != null) {
                    k0Var5.u();
                    return;
                }
                return;
            }
            if (valueOf != null && valueOf.intValue() == f4Var.f437267l) {
                pk2.f4.D(f4Var);
                android.content.Intent intent3 = new android.content.Intent(o9Var2.f437611d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13991x36464073.class);
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = o9Var2.f437611d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractActivityC21394xb3d2c0cf, "null cannot be cast to non-null type android.app.Activity");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(5);
                arrayList.add(intent3);
                java.util.Collections.reverse(arrayList);
                yj0.a.k(abstractActivityC21394xb3d2c0cf, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorScreenShareOption$menuItemClickListener$1", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var6 = f4Var.f437269n;
                if (k0Var6 != null) {
                    k0Var6.u();
                    return;
                }
                return;
            }
            if (valueOf != null && valueOf.intValue() == f4Var.f437268m) {
                pk2.f4.D(f4Var);
                android.content.Intent intent4 = new android.content.Intent(o9Var2.f437611d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13991x36464073.class);
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = o9Var2.f437611d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractActivityC21394xb3d2c0cf2, "null cannot be cast to non-null type android.app.Activity");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(5);
                arrayList2.add(intent4);
                java.util.Collections.reverse(arrayList2);
                yj0.a.k(abstractActivityC21394xb3d2c0cf2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorScreenShareOption$menuItemClickListener$1", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var7 = f4Var.f437269n;
                if (k0Var7 != null) {
                    k0Var7.u();
                }
            }
        }
    }
}
