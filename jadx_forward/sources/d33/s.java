package d33;

/* loaded from: classes9.dex */
public final class s implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f f307804d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f activityC15646xc9a7ee3f) {
        this.f307804d = activityC15646xc9a7ee3f;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        java.lang.String Y6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f activityC15646xc9a7ee3f = this.f307804d;
        if (!activityC15646xc9a7ee3f.A) {
            return true;
        }
        int intValue = ((java.lang.Number) ((jz5.n) activityC15646xc9a7ee3f.f220004o).mo141623x754a37bb()).intValue();
        if (intValue == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f.T6(activityC15646xc9a7ee3f);
        } else if (intValue != 2) {
            if (intValue != 3) {
                if (intValue == 4) {
                    if (android.text.TextUtils.isEmpty(activityC15646xc9a7ee3f.Y6())) {
                        Y6 = activityC15646xc9a7ee3f.X6();
                    } else {
                        byte[] N = com.p314xaae8f345.mm.vfs.w6.N(activityC15646xc9a7ee3f.X6(), 0, -1);
                        com.p314xaae8f345.mm.vfs.w6.S(activityC15646xc9a7ee3f.Y6(), N, 0, N.length);
                        Y6 = activityC15646xc9a7ee3f.Y6();
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Y6);
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("CropImage_Compress_Img", true);
                    intent.putExtra("CropImage_OutputPath", Y6);
                    intent.putExtra("from_source", activityC15646xc9a7ee3f.getIntent().getIntExtra("from_source", 0));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ImageCropReport", "inc: 9");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1361L, 9, 1L);
                    activityC15646xc9a7ee3f.setResult(-1, intent);
                    activityC15646xc9a7ee3f.finish();
                }
            } else if (!activityC15646xc9a7ee3f.f220011v) {
                activityC15646xc9a7ee3f.f220011v = true;
                activityC15646xc9a7ee3f.b7();
                android.content.Intent intent2 = new android.content.Intent();
                p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
                h0Var.f391656d = "";
                pm0.v.K(null, new d33.f0(activityC15646xc9a7ee3f, h0Var, intent2));
            }
        } else if (!activityC15646xc9a7ee3f.f220011v) {
            activityC15646xc9a7ee3f.f220011v = true;
            activityC15646xc9a7ee3f.b7();
            pm0.v.K(null, new d33.c(activityC15646xc9a7ee3f));
        }
        return true;
    }
}
