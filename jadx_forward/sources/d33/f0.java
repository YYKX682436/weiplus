package d33;

/* loaded from: classes9.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f f307757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f307758e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f307759f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f activityC15646xc9a7ee3f, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, android.content.Intent intent) {
        super(0);
        this.f307757d = activityC15646xc9a7ee3f;
        this.f307758e = h0Var;
        this.f307759f = intent;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f activityC15646xc9a7ee3f = this.f307757d;
        boolean z17 = activityC15646xc9a7ee3f.f220013x;
        android.content.Intent intent = this.f307759f;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f307758e;
        if (!z17) {
            try {
                java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
                android.graphics.Bitmap bitmap = activityC15646xc9a7ee3f.f220015z;
                if (bitmap == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AvatarCropUI", "emojiBmp is null");
                    pm0.v.X(new d33.b0(activityC15646xc9a7ee3f));
                } else {
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    if (width > 640 || height > 640) {
                        if (width > height) {
                            height = (int) ((height * 640) / width);
                            width = 640;
                        } else {
                            width = (int) ((width * 640) / height);
                            height = 640;
                        }
                    }
                    android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, width, height, true);
                    if (createScaledBitmap == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AvatarCropUI", "commpressedImg is null");
                        pm0.v.X(new d33.c0(activityC15646xc9a7ee3f));
                    } else {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(createScaledBitmap, 100, android.graphics.Bitmap.CompressFormat.PNG, activityC15646xc9a7ee3f.Y6() + a17, false);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarCropUI", "save bitmap to image successful");
                        java.lang.String b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(com.p314xaae8f345.mm.vfs.w6.N(activityC15646xc9a7ee3f.Y6() + a17, 0, -1));
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getMD5String(...)");
                        h0Var.f391656d = b17;
                        if (com.p314xaae8f345.mm.vfs.w6.j(activityC15646xc9a7ee3f.Y6() + ((java.lang.String) h0Var.f391656d))) {
                            com.p314xaae8f345.mm.vfs.w6.h(activityC15646xc9a7ee3f.Y6() + a17);
                        } else {
                            com.p314xaae8f345.mm.vfs.w6.P(activityC15646xc9a7ee3f.Y6(), a17, (java.lang.String) h0Var.f391656d);
                        }
                        intent.putExtra("emoji_type", 0);
                    }
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AvatarCropUI", e17, "", null);
                pm0.v.X(new d33.d0(activityC15646xc9a7ee3f, e17));
            }
            return jz5.f0.f384359a;
        }
        byte[] N = com.p314xaae8f345.mm.vfs.w6.N(activityC15646xc9a7ee3f.X6(), 0, -1);
        java.lang.String b18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(N);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b18, "getMD5String(...)");
        h0Var.f391656d = b18;
        if (com.p314xaae8f345.mm.vfs.w6.j(activityC15646xc9a7ee3f.Y6() + ((java.lang.String) h0Var.f391656d))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarCropUI", "file is exist. do not need to copy!");
        } else {
            com.p314xaae8f345.mm.vfs.w6.S(activityC15646xc9a7ee3f.Y6() + ((java.lang.String) h0Var.f391656d), N, 0, N.length);
        }
        intent.putExtra("emoji_type", 1);
        pm0.v.X(new d33.e0(activityC15646xc9a7ee3f, intent, h0Var));
        return jz5.f0.f384359a;
    }
}
