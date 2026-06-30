package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes8.dex */
public class e5 implements r53.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f222908a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15981x4bb6dd1c f222909b;

    public e5(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15981x4bb6dd1c c15981x4bb6dd1c, java.lang.String str) {
        this.f222909b = c15981x4bb6dd1c;
        this.f222908a = str;
    }

    @Override // r53.x
    public void a(android.view.View view, android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f222909b.f222462f.put(this.f222908a, bitmap);
    }

    @Override // r53.x
    public void b(java.lang.String str, android.view.View view) {
    }
}
