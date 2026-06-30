package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class lf implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean[] f155550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11461x47892174 f155551e;

    public lf(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11461x47892174 activityC11461x47892174, boolean[] zArr) {
        this.f155551e = activityC11461x47892174;
        this.f155550d = zArr;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        if (z17) {
            this.f155550d[0] = true;
        } else {
            fo3.s.INSTANCE.E7("ie_reg");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11461x47892174 activity = this.f155551e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((vm3.d) pf5.z.f435481a.a(activity).a(vm3.d.class)).V6(z17);
    }
}
