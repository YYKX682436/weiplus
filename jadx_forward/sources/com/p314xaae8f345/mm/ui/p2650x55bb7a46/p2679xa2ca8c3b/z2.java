package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class z2 implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.v1 f287642a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yb5.d f287643b;

    public z2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.o2 o2Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.v1 v1Var, yb5.d dVar) {
        this.f287642a = v1Var;
        this.f287643b = dVar;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
        android.graphics.Bitmap bitmap = bVar.f441067d;
        if (bitmap != null) {
            this.f287642a.f287300r.getViewTreeObserver().addOnPreDrawListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.y2(this, bitmap));
        }
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        return null;
    }
}
