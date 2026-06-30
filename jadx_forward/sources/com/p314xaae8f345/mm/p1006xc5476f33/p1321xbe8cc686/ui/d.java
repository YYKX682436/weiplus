package com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui;

/* loaded from: classes12.dex */
public class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.ActivityC13096xe0b615b8 f177151d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.ActivityC13096xe0b615b8 activityC13096xe0b615b8) {
        this.f177151d = activityC13096xe0b615b8;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileListUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.ActivityC13096xe0b615b8 activityC13096xe0b615b8 = this.f177151d;
        xv1.b bVar = activityC13096xe0b615b8.f177105i;
        synchronized (bVar) {
            java.util.Set set = bVar.f538923d;
            if (set != null) {
                if (((java.util.HashSet) set).size() > 0) {
                    z17 = true;
                }
            }
            z17 = false;
        }
        if (!z17) {
            android.content.Intent intent = new android.content.Intent();
            intent.putParcelableArrayListExtra("FILEPATHS", activityC13096xe0b615b8.f177105i.a());
            activityC13096xe0b615b8.setResult(-1, intent);
            activityC13096xe0b615b8.finish();
            yj0.a.h(this, "com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileListUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC13096xe0b615b8);
        u1Var.g(activityC13096xe0b615b8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b77));
        u1Var.a(true);
        u1Var.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.c(this));
        u1Var.q(false);
        yj0.a.h(this, "com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileListUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
