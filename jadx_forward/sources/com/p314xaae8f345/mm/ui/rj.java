package com.p314xaae8f345.mm.ui;

/* loaded from: classes.dex */
public final class rj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f291282d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f291283e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f291284f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21444x679190f4 f291285g;

    public rj(java.util.List list, java.util.ArrayList arrayList, java.lang.String str, com.p314xaae8f345.mm.ui.ActivityC21444x679190f4 activityC21444x679190f4) {
        this.f291282d = list;
        this.f291283e = arrayList;
        this.f291284f = str;
        this.f291285g = activityC21444x679190f4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/TipUseDuplicateGroupUI$onCreate$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.List list = this.f291282d;
        int size = list.size();
        int size2 = this.f291283e.size();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("selectedContactCount: ");
        sb6.append(size);
        sb6.append(", alreadyExistedGroupCount: ");
        sb6.append(size2);
        sb6.append(", createGroupSessionId: ");
        java.lang.String str = this.f291284f;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TipUseDuplicateGroupUI", sb6.toString());
        pm0.v.K(null, new com.p314xaae8f345.mm.ui.qj(size2, size, str));
        com.p314xaae8f345.mm.ui.ActivityC21444x679190f4 activity = this.f291285g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((kk5.h0) pf5.z.f435481a.a(activity).a(kk5.h0.class)).T6(list);
        yj0.a.h(this, "com/tencent/mm/ui/TipUseDuplicateGroupUI$onCreate$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
