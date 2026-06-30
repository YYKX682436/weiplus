package uf5;

/* loaded from: classes10.dex */
public class o1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8 f508813d;

    public o1(com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8 activityC22349xe6f834c8) {
        this.f508813d = activityC22349xe6f834c8;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/privacy/SelectPrivacyContactsFromRangeUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8 activityC22349xe6f834c8 = this.f508813d;
        activityC22349xe6f834c8.L = !activityC22349xe6f834c8.L;
        activityC22349xe6f834c8.y7();
        if (activityC22349xe6f834c8.L) {
            java.util.Iterator it = ((java.util.HashSet) activityC22349xe6f834c8.Q).iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (!((java.util.LinkedList) activityC22349xe6f834c8.C.f508822r).contains(str)) {
                    ((java.util.LinkedList) activityC22349xe6f834c8.C.f508822r).add(str);
                }
            }
        } else {
            ((java.util.LinkedList) activityC22349xe6f834c8.C.f508822r).clear();
        }
        activityC22349xe6f834c8.C.notifyDataSetChanged();
        activityC22349xe6f834c8.z7();
        yj0.a.h(this, "com/tencent/mm/ui/contact/privacy/SelectPrivacyContactsFromRangeUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
