package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1745xadfe2b3.ui;

/* loaded from: classes8.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f221377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f221378e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221379f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f221380g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f221381h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1745xadfe2b3.ui.e f221382i;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1745xadfe2b3.ui.e eVar, boolean z17, android.graphics.Bitmap bitmap, java.lang.String str, int i17, boolean z18) {
        this.f221382i = eVar;
        this.f221377d = z17;
        this.f221378e = bitmap;
        this.f221379f = str;
        this.f221380g = i17;
        this.f221381h = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1745xadfe2b3.ui.e eVar = this.f221382i;
        if (eVar == null) {
            return;
        }
        final boolean z17 = true;
        if (this.f221377d) {
            ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.game.luggage.liteapp.ui.e$$a
                @Override // java.lang.Runnable
                public final void run() {
                    android.widget.LinearLayout linearLayout = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1745xadfe2b3.ui.e.this.f221358m;
                    if (linearLayout == null) {
                        return;
                    }
                    if (z17) {
                        linearLayout.setVisibility(8);
                    } else {
                        linearLayout.setVisibility(0);
                    }
                }
            });
            return;
        }
        final boolean z18 = false;
        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.game.luggage.liteapp.ui.e$$a
            @Override // java.lang.Runnable
            public final void run() {
                android.widget.LinearLayout linearLayout = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1745xadfe2b3.ui.e.this.f221358m;
                if (linearLayout == null) {
                    return;
                }
                if (z18) {
                    linearLayout.setVisibility(8);
                } else {
                    linearLayout.setVisibility(0);
                }
            }
        });
        if (eVar.f221359n == null || eVar.f221360o == null) {
            return;
        }
        eVar.f221363r = false;
        android.graphics.Bitmap bitmap = this.f221378e;
        if (bitmap == null || bitmap.isRecycled()) {
            java.lang.String str = this.f221379f;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                eVar.f221359n.setVisibility(8);
                eVar.f221360o.setVisibility(0);
                eVar.f221360o.setText(str);
                int i17 = this.f221380g;
                if (i17 != -1) {
                    eVar.f221360o.setTextColor(i17);
                }
            }
        } else {
            eVar.f221359n.setVisibility(0);
            eVar.f221359n.setImageBitmap(bitmap);
            eVar.f221360o.setVisibility(8);
            eVar.f221363r = true;
        }
        if (this.f221381h) {
            eVar.f221359n.setOnClickListener(eVar.f221369x);
            eVar.f221360o.setOnClickListener(eVar.f221369x);
        }
    }
}
