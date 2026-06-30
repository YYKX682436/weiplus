package zo1;

/* loaded from: classes5.dex */
public final class s0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f556296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12867x6b26c82f f556297e;

    public s0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12867x6b26c82f activityC12867x6b26c82f) {
        this.f556296d = z2Var;
        this.f556297e = activityC12867x6b26c82f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/CheckPackageContentUI$showDeleteBottomSheet$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f556296d.B();
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12867x6b26c82f activityC12867x6b26c82f = this.f556297e;
        zo1.w wVar = activityC12867x6b26c82f.f174340p;
        if (wVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("conversationAdapter");
            throw null;
        }
        if (wVar.x()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC12867x6b26c82f.f174332e, "Before deleteBackupDataAsync, delete all conversation");
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.d(activityC12867x6b26c82f.f174333f, new java.util.ArrayList(), true);
        } else {
            java.util.ArrayList<zo1.s> arrayList2 = activityC12867x6b26c82f.f174345u;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (zo1.s sVar : arrayList2) {
                java.lang.String str = sVar.f556295c ? sVar.f556293a : null;
                if (str != null) {
                    arrayList3.add(str);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC12867x6b26c82f.f174332e, "Before deleteBackupDataAsync, selectedList.size=" + arrayList3.size());
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.d(activityC12867x6b26c82f.f174333f, arrayList3, false);
        }
        android.content.Intent intent = new android.content.Intent(activityC12867x6b26c82f, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e.class);
        intent.putExtra("expandCard", true);
        intent.putExtra("packageId", activityC12867x6b26c82f.f174333f);
        intent.addFlags(67108864);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12867x6b26c82f activityC12867x6b26c82f2 = this.f556297e;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(intent);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(activityC12867x6b26c82f2, arrayList4.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/pkg/CheckPackageContentUI$showDeleteBottomSheet$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC12867x6b26c82f2.startActivity((android.content.Intent) arrayList4.get(0));
        yj0.a.f(activityC12867x6b26c82f2, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/CheckPackageContentUI$showDeleteBottomSheet$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC12867x6b26c82f.b7();
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/CheckPackageContentUI$showDeleteBottomSheet$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
