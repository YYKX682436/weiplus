package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* loaded from: classes8.dex */
public class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f263755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f263756e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263757f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f263758g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f263759h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.y1 f263760i;

    public i2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.y1 y1Var, boolean z17, android.graphics.Bitmap bitmap, java.lang.String str, int i17, boolean z18) {
        this.f263760i = y1Var;
        this.f263755d = z17;
        this.f263756e = bitmap;
        this.f263757f = str;
        this.f263758g = i17;
        this.f263759h = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.y1 y1Var = this.f263760i;
        if (y1Var == null || y1Var.f264226e == null) {
            return;
        }
        if (this.f263755d) {
            y1Var.a(true);
            return;
        }
        y1Var.a(false);
        if (y1Var.f264234p == null || y1Var.f264235q == null) {
            return;
        }
        y1Var.f264240v = false;
        android.graphics.Bitmap bitmap = this.f263756e;
        if (bitmap == null || bitmap.isRecycled()) {
            java.lang.String str = this.f263757f;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                y1Var.f264234p.setVisibility(8);
                y1Var.f264235q.setVisibility(0);
                y1Var.f264235q.setText(str);
                int i17 = this.f263758g;
                if (i17 != -1) {
                    y1Var.f264235q.setTextColor(i17);
                }
            }
        } else {
            y1Var.f264234p.setVisibility(0);
            y1Var.f264234p.setImageBitmap(bitmap);
            y1Var.f264235q.setVisibility(8);
            y1Var.f264240v = true;
        }
        if (this.f263759h) {
            y1Var.f264234p.setOnClickListener(y1Var.D);
            y1Var.f264235q.setOnClickListener(y1Var.D);
        }
    }
}
