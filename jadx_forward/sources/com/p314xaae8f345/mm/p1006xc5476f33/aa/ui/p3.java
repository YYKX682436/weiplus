package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class p3 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 f154300d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907) {
        super(false);
        this.f154300d = activityC11351x975a7907;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("use_scene", 1);
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907 = this.f154300d;
        intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, activityC11351x975a7907.f154039l1);
        intent.putExtra(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, activityC11351x975a7907.f154055x1);
        intent.putExtra("url", activityC11351x975a7907.f154045p1);
        intent.putExtra("view_info", ym5.u6.b(activityC11351x975a7907.A, activityC11351x975a7907.mo55332x76847179().getWindow().getDecorView()));
        j45.l.n(activityC11351x975a7907, "aa", ".ui.AAImagPreviewUI", intent, 310);
    }
}
