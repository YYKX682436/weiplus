package cw1;

/* loaded from: classes12.dex */
public final class a2 implements android.widget.ExpandableListView.OnChildClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cw1.o0 f304249a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13111x890e232d f304250b;

    public a2(cw1.o0 o0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13111x890e232d activityC13111x890e232d) {
        this.f304249a = o0Var;
        this.f304250b = activityC13111x890e232d;
    }

    @Override // android.widget.ExpandableListView.OnChildClickListener
    public final boolean onChildClick(android.widget.ExpandableListView expandableListView, android.view.View view, int i17, int i18, long j17) {
        cw1.o0 o0Var = this.f304249a;
        java.lang.Object obj = o0Var.f304723h.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        int intValue = ((java.lang.Number) obj).intValue();
        boolean[] zArr = o0Var.f304724i[intValue];
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(zArr);
        boolean z17 = true;
        boolean z18 = !zArr[i18];
        zArr[i18] = z18;
        boolean z19 = false;
        if (z18) {
            int length = zArr.length;
            int i19 = 0;
            while (true) {
                if (i19 >= length) {
                    break;
                }
                if (!zArr[i19]) {
                    z17 = false;
                    break;
                }
                i19++;
            }
            z19 = z17;
        }
        o0Var.f304721f[intValue] = z19;
        o0Var.notifyDataSetChanged();
        return ((java.lang.Boolean) this.f304250b.f177227i.mo152xb9724478()).booleanValue();
    }
}
