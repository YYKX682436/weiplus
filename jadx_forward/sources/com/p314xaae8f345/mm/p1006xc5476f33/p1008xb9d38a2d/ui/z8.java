package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes11.dex */
public class z8 implements com.p314xaae8f345.mm.ui.y9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f155891a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11449xcdfa582e f155892b;

    public z8(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11449xcdfa582e activityC11449xcdfa582e, android.widget.TextView textView) {
        this.f155892b = activityC11449xcdfa582e;
        this.f155891a = textView;
    }

    @Override // com.p314xaae8f345.mm.ui.y9
    public void a(java.lang.Object obj) {
    }

    @Override // com.p314xaae8f345.mm.ui.y9
    public void b(java.lang.Object obj) {
        boolean u17 = c01.z1.u();
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11449xcdfa582e activityC11449xcdfa582e = this.f155892b;
        if (u17 && activityC11449xcdfa582e.f154989i) {
            int count = activityC11449xcdfa582e.f154985e.getCount();
            android.widget.TextView textView = this.f155891a;
            if (count == 0) {
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
        }
        activityC11449xcdfa582e.f154989i = false;
    }
}
