package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes5.dex */
public final class zb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15052xa671b52d f211621d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ac f211622e;

    public zb(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15052xa671b52d activityC15052xa671b52d, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ac acVar) {
        this.f211621d = activityC15052xa671b52d;
        this.f211622e = acVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderPostAtUI$SelectAtContactAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15052xa671b52d activity = this.f211621d;
        activity.getIntent().putExtra("from_at_contact", true);
        activity.getIntent().putExtra("request_type", 6);
        activity.getIntent().putExtra("need_history", false);
        activity.getIntent().putExtra("key_need_hide_top_padding", true);
        activity.getIntent().putExtra("key_finder_object_id", activity.f210183z);
        if (lk5.s.b(activity)) {
            bh5.c cVar = new bh5.c();
            cVar.f102455a.f102457a = activity;
            cVar.d(activity.getIntent());
            cVar.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15226xd4231758.class);
            cVar.a("com.tencent.mm.plugin.finder.search.FinderContactSearchIncludeFollowUI");
            cVar.h(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            android.content.Intent i17 = activity.getIntent();
            i0Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(i17, "i");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4.f207296c = null;
            jx3.f.INSTANCE.mo68477x336bdfd8(1265L, 2L, 1L, false);
            i17.setClass(activity, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14941x5c78ef2b.class);
            activity.startActivityForResult(i17, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ac acVar = this.f211622e;
        acVar.f210390d = false;
        acVar.m8155x27702c4(0);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderPostAtUI$SelectAtContactAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
