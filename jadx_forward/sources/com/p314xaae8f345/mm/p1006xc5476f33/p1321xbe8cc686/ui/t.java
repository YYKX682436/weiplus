package com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui;

/* loaded from: classes12.dex */
public class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.ActivityC13098x53df0b7a f177167d;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.ActivityC13098x53df0b7a activityC13098x53df0b7a) {
        this.f177167d = activityC13098x53df0b7a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(view);
        java.lang.Object[] array = arrayList2.toArray();
        arrayList2.clear();
        yj0.a.b("com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.ActivityC13098x53df0b7a activityC13098x53df0b7a = this.f177167d;
        xv1.b bVar = activityC13098x53df0b7a.f177132m;
        bVar.f538922c = !bVar.f538922c;
        java.util.Map map = bVar.f538921b;
        if (map == null || ((java.util.concurrent.ConcurrentHashMap) map).size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChooseMsgFileHelper", "msgIdToFilePath is null, return");
            arrayList = new java.util.ArrayList();
        } else {
            arrayList = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) bVar.f538921b).values().iterator();
            while (it.hasNext()) {
                arrayList.add((xv1.a) it.next());
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            xv1.a aVar = (xv1.a) it6.next();
            wv1.a aVar2 = aVar.f538918b;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = activityC13098x53df0b7a.f177135p.p0(aVar.f538919c);
            com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.v vVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.a) aVar2.f531462a).f177059g;
            if (vVar != null) {
                vVar.a(true, aVar2, p07);
            }
        }
        if (bVar.f538922c) {
            activityC13098x53df0b7a.f177138s.setImageResource(com.p314xaae8f345.mm.R.raw.f80939xfe2298a3);
        } else {
            activityC13098x53df0b7a.f177138s.setImageResource(com.p314xaae8f345.mm.R.raw.f80936xc6307b2b);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
