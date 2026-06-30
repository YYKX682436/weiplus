package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

/* loaded from: classes15.dex */
public class x0 implements y60.e {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f234905d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f234906e;

    /* renamed from: f, reason: collision with root package name */
    public wq3.u f234907f;

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        wq3.u uVar = this.f234907f;
        if (uVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(uVar.f530140b) || !str.equals(this.f234907f.f530140b)) {
            return;
        }
        this.f234905d.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.w0(this, bitmap));
    }
}
