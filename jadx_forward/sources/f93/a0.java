package f93;

/* loaded from: classes4.dex */
public final class a0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16165x57283aea f341819d;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16165x57283aea activityC16165x57283aea) {
        this.f341819d = activityC16165x57283aea;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/ContactEditLabel$bindUIAndSetListener$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16165x57283aea activityC16165x57283aea = this.f341819d;
        f93.y yVar = activityC16165x57283aea.A;
        if (yVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d item = yVar.getItem(i17);
        if (item == null || !(item instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u)) {
            yj0.a.h(this, "com/tencent/mm/plugin/label/ui/ContactEditLabel$bindUIAndSetListener$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        java.lang.String str = ((com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u) item).f288352z;
        f93.y yVar2 = activityC16165x57283aea.A;
        if (yVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        if (yVar2.f288611f) {
            if (yVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            java.util.LinkedList linkedList = yVar2.f342047r;
            if (linkedList.contains(str)) {
                linkedList.remove(str);
            } else {
                linkedList.add(str);
            }
            yVar2.notifyDataSetChanged();
        } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.k4(str)) {
            android.content.Intent intent = new android.content.Intent(activityC16165x57283aea.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22286xab929968.class);
            intent.putExtra("Contact_GroupFilter_DisplayName", "@biz.contact");
            com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16165x57283aea activityC16165x57283aea2 = this.f341819d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activityC16165x57283aea2, arrayList2.toArray(), "com/tencent/mm/plugin/label/ui/ContactEditLabel$bindUIAndSetListener$2", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC16165x57283aea2.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activityC16165x57283aea2, "com/tencent/mm/plugin/label/ui/ContactEditLabel$bindUIAndSetListener$2", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            yj0.a.h(this, "com/tencent/mm/plugin/label/ui/ContactEditLabel$bindUIAndSetListener$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("Contact_User", str);
        intent2.putExtra("Contact_Scene", 3);
        intent2.putExtra("CONTACT_INFO_UI_SOURCE", 4);
        if (str != null) {
            if (str.length() > 0) {
                j45.l.j(activityC16165x57283aea.mo55332x76847179(), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent2, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/ContactEditLabel$bindUIAndSetListener$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
