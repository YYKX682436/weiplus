package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class bg extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15062xd67d4d74 f210483d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.bs2 f210484e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15062xd67d4d74 activityC15062xd67d4d74, r45.bs2 bs2Var) {
        super(0);
        this.f210483d = activityC15062xd67d4d74;
        this.f210484e = bs2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Bitmap bitmap;
        r45.bs2 bs2Var = this.f210484e;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = bs2Var.m75934xbce7f2f(1);
        android.graphics.Bitmap G = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.G(m75934xbce7f2f != null ? m75934xbce7f2f.f273689a : null);
        java.lang.String m75945x2fec8307 = bs2Var.m75945x2fec8307(2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15062xd67d4d74 activityC15062xd67d4d74 = this.f210483d;
        android.widget.ProgressBar progressBar = activityC15062xd67d4d74.B;
        if (progressBar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loading");
            throw null;
        }
        progressBar.setVisibility(8);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSelfQRCodeUI", "qrcode url " + m75945x2fec8307);
        if (G == null) {
            if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
                java.lang.String str = activityC15062xd67d4d74.f210234t;
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) c0Var).getClass();
                android.graphics.Bitmap s07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(com.p314xaae8f345.mm.p943x351df9c2.g.a(str), false, r2.getWidth() * 0.5f);
                float e17 = (com.p314xaae8f345.mm.ui.zk.e(activityC15062xd67d4d74, com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj) * 1.0f) / s07.getWidth();
                android.graphics.Bitmap z07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.z0(s07, 0.0f, e17, e17);
                android.graphics.Bitmap K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.K0(activityC15062xd67d4d74.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.ac7));
                java.lang.Object[] objArr = new java.lang.Object[4];
                objArr[0] = java.lang.Integer.valueOf(z07 == null ? 0 : z07.getWidth());
                objArr[1] = java.lang.Integer.valueOf(z07 == null ? 0 : z07.getHeight());
                objArr[2] = java.lang.Integer.valueOf(K0 == null ? 0 : K0.getWidth());
                objArr[3] = java.lang.Integer.valueOf(K0 == null ? 0 : K0.getHeight());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BitmapUtil", "src(%d,%d) background(%d,%d)", objArr);
                if (z07 == null || K0 == null) {
                    bitmap = null;
                } else {
                    android.graphics.Bitmap m17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.m(java.lang.Math.max(z07.getWidth(), K0.getWidth()), java.lang.Math.max(z07.getHeight(), K0.getHeight()), android.graphics.Bitmap.Config.ARGB_8888, false);
                    java.util.WeakHashMap weakHashMap = com.p314xaae8f345.mm.sdk.p2603x2137b148.t.f274510a;
                    android.graphics.Canvas canvas = new android.graphics.Canvas(m17);
                    canvas.drawBitmap(K0, (r1 - K0.getWidth()) / 2.0f, (r4 - K0.getHeight()) / 2.0f, new android.graphics.Paint());
                    canvas.drawBitmap(z07, (r1 - z07.getWidth()) / 2.0f, (r4 - z07.getHeight()) / 2.0f, new android.graphics.Paint());
                    K0.recycle();
                    z07.recycle();
                    bitmap = m17;
                }
                G = ((jd0.w1) ((kd0.k2) i95.n0.c(kd0.k2.class))).Ai(activityC15062xd67d4d74, bitmap, m75945x2fec8307, 3, 0.0d);
            }
        }
        if (G != null) {
            android.widget.ImageView imageView = activityC15062xd67d4d74.f210240z;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("qrcode");
                throw null;
            }
            imageView.setImageBitmap(G);
            android.widget.TextView textView = activityC15062xd67d4d74.f210239y;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("saveToGalleryTv");
                throw null;
            }
            textView.setVisibility(0);
        }
        return jz5.f0.f384359a;
    }
}
