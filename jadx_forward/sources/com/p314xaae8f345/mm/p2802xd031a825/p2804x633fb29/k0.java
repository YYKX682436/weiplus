package com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29;

/* loaded from: classes9.dex */
public class k0 implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p f295458a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f295459b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p0 f295460c;

    public k0(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p0 p0Var, com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p pVar, android.app.Activity activity) {
        this.f295460c = p0Var;
        this.f295458a = pVar;
        this.f295459b = activity;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.r
    /* renamed from: onCancel */
    public void mo25208x3d6f0539() {
        if (this.f295460c.b()) {
            this.f295458a.a();
        } else {
            this.f295459b.finish();
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.r
    /* renamed from: onEnter */
    public void mo25209xaf88dc39() {
        this.f295460c.getClass();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.r
    /* renamed from: onUrlCancel */
    public void mo25210xccb70daa() {
        if (this.f295460c.b()) {
            this.f295458a.a();
        } else {
            this.f295459b.finish();
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.r
    /* renamed from: onUrlOk */
    public void mo25211xb06c050c() {
        if (this.f295460c.b()) {
            this.f295458a.a();
        }
    }
}
