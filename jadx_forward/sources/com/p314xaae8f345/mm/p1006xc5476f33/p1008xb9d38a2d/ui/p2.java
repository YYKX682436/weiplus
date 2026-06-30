package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes11.dex */
public class p2 implements com.p314xaae8f345.mm.ui.y9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f155637a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11405x94a32f64 f155638b;

    public p2(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11405x94a32f64 activityC11405x94a32f64, android.widget.TextView textView) {
        this.f155638b = activityC11405x94a32f64;
        this.f155637a = textView;
    }

    @Override // com.p314xaae8f345.mm.ui.y9
    public void a(java.lang.Object obj) {
    }

    @Override // com.p314xaae8f345.mm.ui.y9
    public void b(java.lang.Object obj) {
        if (c01.z1.u()) {
            int count = this.f155638b.f154822e.getCount();
            android.widget.TextView textView = this.f155637a;
            if (count == 0) {
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
        }
    }
}
