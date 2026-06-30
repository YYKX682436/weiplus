package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f95044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f95045e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.l1 f95046f;

    public k1(com.tencent.mm.plugin.card.ui.l1 l1Var, java.lang.String str, java.lang.String str2) {
        this.f95046f = l1Var;
        this.f95044d = str;
        this.f95045e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.card.ui.l1 l1Var = this.f95046f;
        if (l1Var.f95063d.Z.getVisibility() != 8) {
            l1Var.f95063d.Z.setVisibility(8);
        }
        java.lang.String str = this.f95044d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(l1Var.f95063d.f94822f.f94653m) || !str.equals(l1Var.f95063d.f94822f.f94653m)) {
            l1Var.f95063d.M.setVisibility(8);
        } else {
            l1Var.f95063d.M.setVisibility(0);
        }
        android.graphics.Bitmap Ai = ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).Ai(this.f95045e);
        if (Ai == null) {
            l1Var.f95063d.N.setImageResource(com.tencent.mm.R.raw.download_image_icon);
        } else {
            l1Var.f95063d.N.setImageBitmap(Ai);
        }
    }
}
