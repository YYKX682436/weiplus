package zo1;

/* loaded from: classes5.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12866x739418c6 f556172d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12866x739418c6 activityC12866x739418c6) {
        this.f556172d = activityC12866x739418c6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/BackupRangeManagerUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.Calendar calendar = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12866x739418c6.f174317t;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12866x739418c6 activityC12866x739418c6 = this.f556172d;
        activityC12866x739418c6.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupRangeManagerUI", "goto select group");
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c9 = activityC12866x739418c6.f174320f;
        if (c12853x6acde7c9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c92 = activityC12866x739418c6.f174320f;
        if (c12853x6acde7c92 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
            throw null;
        }
        java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>(c12853x6acde7c92.f174264e.size());
        java.util.Iterator it = c12853x6acde7c9.f174264e.iterator();
        while (it.hasNext()) {
            arrayList2.add(java.lang.String.valueOf(((java.lang.Number) it.next()).intValue()));
        }
        intent.putStringArrayListExtra("label_id", arrayList2);
        intent.setClassName(activityC12866x739418c6, "com.tencent.mm.plugin.label.ui.ContactLabelSelectUI");
        activityC12866x739418c6.startActivityForResult(intent, 127);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/BackupRangeManagerUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
