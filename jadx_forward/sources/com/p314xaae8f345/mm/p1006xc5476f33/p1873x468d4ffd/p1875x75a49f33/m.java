package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33;

/* loaded from: classes10.dex */
public class m implements com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.ActivityC16536xd4e3d45b f230590a;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.ActivityC16536xd4e3d45b activityC16536xd4e3d45b) {
        this.f230590a = activityC16536xd4e3d45b;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.z1
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.ActivityC16536xd4e3d45b activityC16536xd4e3d45b = this.f230590a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.a2 a2Var = activityC16536xd4e3d45b.f230395h;
        if (a2Var != null) {
            a2Var.e();
            activityC16536xd4e3d45b.f230395h = null;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.l(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.z1
    public void b() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.ActivityC16536xd4e3d45b activityC16536xd4e3d45b = this.f230590a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightEditUI", "onEditFinish");
        try {
            activityC16536xd4e3d45b.f230402r = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.a2 a2Var = activityC16536xd4e3d45b.f230395h;
            long j17 = a2Var.f230801d;
            long j18 = a2Var.f230802e;
            a2Var.f(false, "");
            activityC16536xd4e3d45b.f230395h.e();
            activityC16536xd4e3d45b.f230395h = null;
            if (!activityC16536xd4e3d45b.f230401q) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("K_SEGMENTVIDEOPATH", activityC16536xd4e3d45b.f230394g);
                intent.putExtra("key_seek_look_start_time", j17);
                intent.putExtra("key_seek_end_time", j18);
                activityC16536xd4e3d45b.setResult(-1, intent);
                activityC16536xd4e3d45b.finish();
                return;
            }
            android.graphics.Bitmap p17 = ai3.d.p(activityC16536xd4e3d45b.f230398n);
            if (p17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightEditUI", "getVideoThumb failed!");
                return;
            }
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
            int width = p17.getWidth();
            int height = p17.getHeight();
            int i17 = activityC16536xd4e3d45b.f230396i.f152737t;
            if (i17 <= 0 || java.lang.Math.min(width, height) <= i17) {
                z17 = false;
            } else {
                if (width < height) {
                    height = (int) (height / ((width * 1.0f) / i17));
                    width = i17;
                } else {
                    width = (int) (width / ((height * 1.0f) / i17));
                    height = i17;
                }
                z17 = true;
            }
            c19767x257d7f.f38864x6ac9171 = width;
            c19767x257d7f2.f38864x6ac9171 = height;
            if (z17) {
                p17 = android.graphics.Bitmap.createScaledBitmap(p17, c19767x257d7f.f38864x6ac9171, height, true);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightEditUI", "getBitmap size = [%d, %d]", java.lang.Integer.valueOf(p17.getWidth()), java.lang.Integer.valueOf(p17.getHeight()));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(p17, 80, android.graphics.Bitmap.CompressFormat.JPEG, activityC16536xd4e3d45b.f230399o, true);
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("K_SEGMENTVIDEOPATH", activityC16536xd4e3d45b.f230398n);
            intent2.putExtra("KSEGMENTVIDEOTHUMBPATH", activityC16536xd4e3d45b.f230399o);
            activityC16536xd4e3d45b.setResult(-1, intent2);
            activityC16536xd4e3d45b.finish();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMSightEditUI", e17, "save video thumb error", new java.lang.Object[0]);
            dp.a.m125853x26a183b(activityC16536xd4e3d45b, com.p314xaae8f345.mm.R.C30867xcad56011.gw9, 1).show();
            activityC16536xd4e3d45b.finish();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.z1
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightEditUI", "onExitEdit");
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.ActivityC16536xd4e3d45b activityC16536xd4e3d45b = this.f230590a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.a2 a2Var = activityC16536xd4e3d45b.f230395h;
        if (a2Var != null) {
            a2Var.f(true, "");
            activityC16536xd4e3d45b.f230395h.e();
            activityC16536xd4e3d45b.f230395h = null;
        }
        activityC16536xd4e3d45b.finish();
    }
}
