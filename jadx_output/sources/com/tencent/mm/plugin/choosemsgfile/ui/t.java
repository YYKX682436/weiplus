package com.tencent.mm.plugin.choosemsgfile.ui;

/* loaded from: classes12.dex */
public class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI f95634d;

    public t(com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI chooseMsgFileUI) {
        this.f95634d = chooseMsgFileUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(view);
        java.lang.Object[] array = arrayList2.toArray();
        arrayList2.clear();
        yj0.a.b("com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI chooseMsgFileUI = this.f95634d;
        xv1.b bVar = chooseMsgFileUI.f95599m;
        bVar.f457389c = !bVar.f457389c;
        java.util.Map map = bVar.f457388b;
        if (map == null || ((java.util.concurrent.ConcurrentHashMap) map).size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChooseMsgFileHelper", "msgIdToFilePath is null, return");
            arrayList = new java.util.ArrayList();
        } else {
            arrayList = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) bVar.f457388b).values().iterator();
            while (it.hasNext()) {
                arrayList.add((xv1.a) it.next());
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            xv1.a aVar = (xv1.a) it6.next();
            wv1.a aVar2 = aVar.f457385b;
            androidx.recyclerview.widget.k3 p07 = chooseMsgFileUI.f95602p.p0(aVar.f457386c);
            com.tencent.mm.plugin.choosemsgfile.logic.ui.v vVar = ((com.tencent.mm.plugin.choosemsgfile.logic.ui.a) aVar2.f449929a).f95526g;
            if (vVar != null) {
                vVar.a(true, aVar2, p07);
            }
        }
        if (bVar.f457389c) {
            chooseMsgFileUI.f95605s.setImageResource(com.tencent.mm.R.raw.radio_on);
        } else {
            chooseMsgFileUI.f95605s.setImageResource(com.tencent.mm.R.raw.radio_off);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
