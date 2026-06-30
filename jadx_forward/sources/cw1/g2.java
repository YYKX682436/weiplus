package cw1;

/* loaded from: classes12.dex */
public final class g2 implements android.widget.ExpandableListView.OnGroupExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cw1.o0 f304479a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13111x890e232d f304480b;

    public g2(cw1.o0 o0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13111x890e232d activityC13111x890e232d) {
        this.f304479a = o0Var;
        this.f304480b = activityC13111x890e232d;
    }

    @Override // android.widget.ExpandableListView.OnGroupExpandListener
    public final void onGroupExpand(int i17) {
        java.lang.Object obj = this.f304479a.f304723h.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        if (((java.lang.Number) obj).intValue() == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13111x890e232d activityC13111x890e232d = this.f304480b;
            long j17 = activityC13111x890e232d.f177228m;
            if (j17 >= 0) {
                mt1.b0.s(12, j17, java.lang.Long.valueOf(activityC13111x890e232d.f177230o), java.lang.Long.valueOf(activityC13111x890e232d.f177229n));
                activityC13111x890e232d.f177228m = -2L;
            }
        }
    }
}
