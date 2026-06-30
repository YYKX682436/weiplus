package cw1;

/* loaded from: classes12.dex */
public final class z1 implements android.widget.ExpandableListView.OnGroupClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cw1.o0 f305064a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13111x890e232d f305065b;

    public z1(cw1.o0 o0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13111x890e232d activityC13111x890e232d) {
        this.f305064a = o0Var;
        this.f305065b = activityC13111x890e232d;
    }

    @Override // android.widget.ExpandableListView.OnGroupClickListener
    public final boolean onGroupClick(android.widget.ExpandableListView expandableListView, android.view.View view, int i17, long j17) {
        cw1.o0 o0Var = this.f305064a;
        java.util.ArrayList arrayList = o0Var.f304723h;
        java.lang.Object obj = arrayList.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        int intValue = ((java.lang.Number) obj).intValue();
        if (intValue < 0) {
            int i18 = i17 - 1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13111x890e232d activityC13111x890e232d = o0Var.f304719d;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22700x2b5d269a c22700x2b5d269a = activityC13111x890e232d.f177222d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22700x2b5d269a);
            if (c22700x2b5d269a.isGroupExpanded(i18)) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22700x2b5d269a c22700x2b5d269a2 = activityC13111x890e232d.f177222d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22700x2b5d269a2);
                c22700x2b5d269a2.c(i18);
            } else {
                java.lang.Object obj2 = arrayList.get(i18);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                int intValue2 = ((java.lang.Number) obj2).intValue();
                if (o0Var.f304725j[intValue2] != null) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22700x2b5d269a c22700x2b5d269a3 = activityC13111x890e232d.f177222d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22700x2b5d269a3);
                    c22700x2b5d269a3.d(i18);
                } else {
                    o0Var.f304722g[intValue2] = true;
                }
            }
            o0Var.notifyDataSetChanged();
        } else {
            boolean[] zArr = o0Var.f304721f;
            boolean z17 = !zArr[intValue];
            zArr[intValue] = z17;
            boolean[] zArr2 = o0Var.f304724i[intValue];
            if (zArr2 != null) {
                kz5.v.v(zArr2, z17, 0, 0, 6, null);
            }
            o0Var.notifyDataSetChanged();
        }
        return ((java.lang.Boolean) this.f305065b.f177227i.mo152xb9724478()).booleanValue();
    }
}
