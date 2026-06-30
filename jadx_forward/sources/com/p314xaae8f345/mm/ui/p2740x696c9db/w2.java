package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes15.dex */
public class w2 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.C22500x8bcca9d0 f292398a;

    public w2(com.p314xaae8f345.mm.ui.p2740x696c9db.C22500x8bcca9d0 c22500x8bcca9d0) {
        this.f292398a = c22500x8bcca9d0;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.a3 a3Var;
        int i17 = message.what;
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22500x8bcca9d0 c22500x8bcca9d0 = this.f292398a;
        if (i17 == 4659) {
            c22500x8bcca9d0.a();
            return;
        }
        if (i17 == 4658) {
            c22500x8bcca9d0.b();
            return;
        }
        if (i17 != 4660 && i17 == 4661) {
            android.view.MotionEvent motionEvent = (android.view.MotionEvent) message.obj;
            c22500x8bcca9d0.f291562y = java.lang.System.currentTimeMillis();
            c22500x8bcca9d0.f291555r = false;
            if (motionEvent.getRawX() - c22500x8bcca9d0.f291549i <= 10.0f && motionEvent.getRawY() - c22500x8bcca9d0.f291550m <= 10.0f && motionEvent.getRawX() - c22500x8bcca9d0.f291549i >= -10.0f && motionEvent.getRawY() - c22500x8bcca9d0.f291550m >= -10.0f) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                long j17 = c22500x8bcca9d0.f291562y;
                if (j17 != 0) {
                    long j18 = currentTimeMillis - j17;
                    if (j18 < 300 && j18 >= 0 && (a3Var = c22500x8bcca9d0.A) != null) {
                        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22499xed564269 activityC22499xed564269 = ((com.p314xaae8f345.mm.ui.p2740x696c9db.m2) a3Var).f292097a;
                        if (activityC22499xed564269.f291534g.getVisibility() == 0) {
                            activityC22499xed564269.f291534g.setVisibility(4);
                        } else if (activityC22499xed564269.f291534g.getVisibility() == 4) {
                            activityC22499xed564269.f291534g.setVisibility(0);
                        }
                    }
                }
                c22500x8bcca9d0.f291562y = 0L;
            }
            android.graphics.PointF pointF = c22500x8bcca9d0.f291551n;
            android.graphics.Bitmap bitmap = c22500x8bcca9d0.f291545e;
            if (pointF == null || bitmap == null) {
                return;
            }
            pointF.set(bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        }
    }
}
