package f93;

/* loaded from: classes4.dex */
public final class d0 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16165x57283aea f341842d;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16165x57283aea activityC16165x57283aea) {
        this.f341842d = activityC16165x57283aea;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16165x57283aea activityC16165x57283aea = this.f341842d;
        f93.y yVar = activityC16165x57283aea.A;
        if (yVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d item = yVar.getItem(i17);
        if (item == null || !(item instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u)) {
            return true;
        }
        java.lang.String str = ((com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u) item).f288352z;
        f93.y yVar2 = activityC16165x57283aea.A;
        if (yVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        if (!yVar2.f288611f) {
            new rl5.r(activityC16165x57283aea.mo55332x76847179()).g(view, i17, j17, new f93.b0(i17), new f93.c0(activityC16165x57283aea, str), activityC16165x57283aea.B, activityC16165x57283aea.C);
        }
        return true;
    }
}
