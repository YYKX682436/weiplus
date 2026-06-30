package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes4.dex */
public final class b2 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11404xb70180da f155270a;

    public b2(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11404xb70180da activityC11404xb70180da) {
        this.f155270a = activityC11404xb70180da;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
    public final void a() {
        android.view.View view;
        android.widget.TextView textView;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11404xb70180da activityC11404xb70180da = this.f155270a;
        if (activityC11404xb70180da.f154817m && activityC11404xb70180da.f154818n) {
            activityC11404xb70180da.U6();
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = activityC11404xb70180da.f154819o;
        if (z2Var == null || (view = z2Var.f293591g) == null || (textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.rqc)) == null) {
            return;
        }
        textView.setTextColor(activityC11404xb70180da.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
    }
}
