package com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89;

/* loaded from: classes12.dex */
public class x1 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.gb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f269842a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a f269843b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 f269844c;

    public x1(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a) {
        this.f269844c = activityC19519x7af4daf3;
        this.f269842a = i17;
        this.f269843b = c19515x154ec45a;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.gb
    public void a() {
        float f17 = this.f269842a;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3.f269673e2;
        this.f269844c.h7(f17);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.gb
    public void b(java.lang.String str) {
        this.f269843b.requestFocus();
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = this.f269844c;
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a b17 = activityC19519x7af4daf3.f269680m.b();
        if (b17 != null) {
            b17.getEditableText().insert(b17.getSelectionEnd(), str);
        }
        activityC19519x7af4daf3.O1.n();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.gb
    public void c(boolean z17) {
    }
}
