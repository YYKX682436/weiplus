package i93;

/* loaded from: classes11.dex */
public class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1792xdec7722c.ActivityC16176xdf6c8530 f371285d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1792xdec7722c.ActivityC16176xdf6c8530 activityC16176xdf6c8530) {
        this.f371285d = activityC16176xdf6c8530;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1792xdec7722c.ActivityC16176xdf6c8530 activityC16176xdf6c8530 = this.f371285d;
        if (activityC16176xdf6c8530.f224925m) {
            activityC16176xdf6c8530.f224925m = false;
            activityC16176xdf6c8530.f224926n.setText(activityC16176xdf6c8530.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572026wm));
            activityC16176xdf6c8530.f224932t.setVisibility(8);
            i93.e eVar = activityC16176xdf6c8530.f224927o;
            eVar.f371272s = true;
            eVar.f371268o = 0;
            java.util.List list = eVar.f371262f;
            if (list != null) {
                ((java.util.LinkedList) list).clear();
            }
            eVar.m8146xced61ae5();
        } else {
            activityC16176xdf6c8530.f224925m = true;
            activityC16176xdf6c8530.f224926n.setText(activityC16176xdf6c8530.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573907g95));
            activityC16176xdf6c8530.f224932t.setVisibility(0);
            java.util.List list2 = activityC16176xdf6c8530.f224927o.f371262f;
            if (list2 == null || ((java.util.LinkedList) list2).size() == 0) {
                activityC16176xdf6c8530.f224932t.setText(activityC16176xdf6c8530.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571885sk));
            } else {
                activityC16176xdf6c8530.f224932t.setText(activityC16176xdf6c8530.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571885sk) + "(" + ((java.util.LinkedList) activityC16176xdf6c8530.f224927o.f371262f).size() + ")");
            }
            i93.e eVar2 = activityC16176xdf6c8530.f224927o;
            eVar2.f371272s = false;
            eVar2.f371268o = 1;
            java.util.List list3 = eVar2.f371262f;
            if (list3 != null) {
                ((java.util.LinkedList) list3).clear();
            }
            eVar2.m8146xced61ae5();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
