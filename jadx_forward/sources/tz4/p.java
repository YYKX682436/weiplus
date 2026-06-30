package tz4;

/* loaded from: classes10.dex */
public class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tz4.l f504908d;

    public p(tz4.l lVar) {
        this.f504908d = lVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wenote/ui/nativenote/toolview/WNToolViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tz4.l lVar = this.f504908d;
        if (lVar.f504893f.get() != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) ((tz4.k) lVar.f504893f.get());
            activityC19519x7af4daf3.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteEditorUI", "onClickTakePhotoBtn");
            activityC19519x7af4daf3.J1.B(-1, false, true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 h17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624.h(4);
            h17.f237218w = 15000;
            com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b.C10402x5bc41468 c10402x5bc41468 = new com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b.C10402x5bc41468((hp.a) null);
            java.util.Map map = c10402x5bc41468.f146312h;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            java.util.HashMap hashMap = (java.util.HashMap) map;
            hashMap.put("plugin_filter", bool);
            hashMap.put("plugin_poi", bool);
            hashMap.put("plugin_tip", bool);
            hashMap.put("plugin_menu", bool);
            h17.f237210o = c10402x5bc41468;
            ut3.m.f512715a.c(activityC19519x7af4daf3, 4098, com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0, com.p314xaae8f345.mm.R.C30854x2dc211.f559410e1, h17);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wenote/ui/nativenote/toolview/WNToolViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
