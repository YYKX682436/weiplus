package zo1;

/* loaded from: classes5.dex */
public final class p2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 f556265d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12870x21c4817b f556266e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wo1.i1 f556267f;

    public p2(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a04, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12870x21c4817b activityC12870x21c4817b, wo1.i1 i1Var) {
        this.f556265d = c21486x59d05a04;
        this.f556266e = activityC12870x21c4817b;
        this.f556267f = i1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageManagerUI$changePackageName$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String obj = this.f556265d.getText().toString();
        if ((obj.length() > 0) && obj.length() <= 16) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Try to change name from");
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12870x21c4817b activityC12870x21c4817b = this.f556266e;
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar = activityC12870x21c4817b.f174372e;
            if (gVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgInfo");
                throw null;
            }
            sb6.append(gVar.f297364f);
            sb6.append(" to ");
            sb6.append(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PackageManagerUI", sb6.toString());
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar2 = activityC12870x21c4817b.f174372e;
            if (gVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgInfo");
                throw null;
            }
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar2.f297364f, obj);
            wo1.i1 i1Var = this.f556267f;
            if (b17) {
                i1Var.hide();
                yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageManagerUI$changePackageName$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            java.lang.String string = activityC12870x21c4817b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mvy);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(activityC12870x21c4817b, string, false, 3, null);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar3 = activityC12870x21c4817b.f174372e;
            if (gVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgInfo");
                throw null;
            }
            zo1.o2 o2Var = new zo1.o2(f17, activityC12870x21c4817b, obj, i1Var);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar4 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g();
            gVar4.mo11468x92b714fd(gVar3.m75960xfb7e5820());
            gVar4.f297364f = obj;
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.s(gVar4, o2Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageManagerUI$changePackageName$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
