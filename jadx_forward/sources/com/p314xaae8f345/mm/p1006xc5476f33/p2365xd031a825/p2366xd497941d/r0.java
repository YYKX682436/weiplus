package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* loaded from: classes9.dex */
public class r0 implements com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.aa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f261015a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ViewOnClickListenerC19074x1cba768d f261016b;

    public r0(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ViewOnClickListenerC19074x1cba768d viewOnClickListenerC19074x1cba768d, android.view.View view) {
        this.f261016b = viewOnClickListenerC19074x1cba768d;
        this.f261015a = view;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.aa
    /* renamed from: agree */
    public void mo25350x58772ac(android.content.Intent intent) {
        android.view.View view = this.f261015a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ViewOnClickListenerC19074x1cba768d viewOnClickListenerC19074x1cba768d = this.f261016b;
        viewOnClickListenerC19074x1cba768d.m73862xdb213023(view);
        viewOnClickListenerC19074x1cba768d.B = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.aa
    /* renamed from: cancel */
    public void mo25351xae7a2e7a() {
        this.f261016b.A.f261712d = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.aa
    /* renamed from: nothing */
    public void mo25352x7eeae7cd() {
        this.f261016b.m73862xdb213023(this.f261015a);
    }
}
