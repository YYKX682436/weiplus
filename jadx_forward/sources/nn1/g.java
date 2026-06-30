package nn1;

/* loaded from: classes12.dex */
public class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de f420195d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de activityC12832x56c88de) {
        this.f420195d = activityC12832x56c88de;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de activityC12832x56c88de = this.f420195d;
        if (activityC12832x56c88de.b7().f536990f) {
            nn1.a aVar = activityC12832x56c88de.f174041e;
            java.util.HashSet hashSet = aVar.f420170e;
            if (hashSet.size() == aVar.getCount()) {
                hashSet.clear();
            } else {
                for (int i17 = 0; i17 < aVar.getCount(); i17++) {
                    hashSet.add(java.lang.Integer.valueOf(i17));
                }
            }
            aVar.notifyDataSetChanged();
            aVar.f420169d.d7(hashSet);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
