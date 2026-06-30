package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes5.dex */
public class a5 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f154103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f154104e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 f154105f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907, android.widget.ImageView imageView, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        super(false);
        this.f154105f = activityC11351x975a7907;
        this.f154103d = imageView;
        this.f154104e = k0Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "choose aaByPersonMember mdoe");
        android.widget.ImageView imageView = this.f154103d;
        if (imageView.getVisibility() == 8) {
            imageView.setVisibility(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907 = this.f154105f;
        activityC11351x975a7907.f154037h = 3;
        activityC11351x975a7907.f154038i = 4;
        activityC11351x975a7907.H7();
        this.f154104e.u();
    }
}
