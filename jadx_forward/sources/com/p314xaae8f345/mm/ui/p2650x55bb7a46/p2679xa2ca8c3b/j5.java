package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class j5 implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f285764a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.l5 f285765b;

    public j5(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.l5 l5Var, android.content.Context context) {
        this.f285765b = l5Var;
        this.f285764a = context;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
        android.graphics.Bitmap bitmap = bVar.f441067d;
        if (bitmap != null) {
            this.f285765b.f285928f.getViewTreeObserver().addOnPreDrawListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i5(this, bitmap));
        }
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        return null;
    }
}
