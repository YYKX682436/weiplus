package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df;

/* loaded from: classes8.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f256584d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.o0 f256585e;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.o0 o0Var, android.graphics.Bitmap bitmap) {
        this.f256585e = o0Var;
        this.f256584d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.o0 o0Var = this.f256585e;
        android.graphics.Bitmap bitmap = this.f256584d;
        if (bitmap != null) {
            o0Var.f256591d.f256477c.setImageBitmap(bitmap);
        } else {
            o0Var.f256591d.f256477c.setImageDrawable(o0Var.f256596i.f256519d.getResources().getDrawable(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a));
            o0Var.f256591d.f256478d = 0;
        }
        o0Var.f256591d.f256477c.setVisibility(0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "layout %s,%s, fakeIv %s,%s", java.lang.Integer.valueOf(o0Var.f256591d.f256476b.getWidth()), java.lang.Integer.valueOf(o0Var.f256591d.f256476b.getHeight()), java.lang.Integer.valueOf(o0Var.f256591d.f256477c.getWidth()), java.lang.Integer.valueOf(o0Var.f256591d.f256477c.getHeight()));
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.C19226x5a0e667d c19226x5a0e667d = o0Var.f256596i.f256524i;
        if (c19226x5a0e667d != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "topStoryWebView %s,%s", java.lang.Integer.valueOf(c19226x5a0e667d.getWidth()), java.lang.Integer.valueOf(o0Var.f256596i.f256524i.getHeight()));
        }
        o0Var.f256596i.j(o0Var.f256592e, o0Var.f256593f, o0Var.f256594g, o0Var.f256595h, true);
    }
}
