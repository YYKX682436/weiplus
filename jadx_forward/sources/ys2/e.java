package ys2;

/* loaded from: classes3.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ys2.f f546683d;

    public e(ys2.f fVar) {
        this.f546683d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ct2.j jVar;
        dt2.a0 a0Var;
        dt2.a0 a0Var2;
        ys2.f fVar = this.f546683d;
        fVar.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", true);
        java.lang.ref.WeakReference weakReference = fVar.f546684d;
        ys2.h hVar = (ys2.h) weakReference.get();
        if (hVar != null) {
            ((mm2.c1) hVar.m56788xbba4bfc0(mm2.c1.class)).N1 = true;
            hVar.X6(qo0.b.Z2, bundle);
        }
        ys2.h hVar2 = (ys2.h) weakReference.get();
        if (hVar2 != null) {
            hVar2.f546698s = true;
            if2.d0 d0Var = hVar2.f546693n;
            android.view.View view = d0Var != null ? d0Var.f372638a : null;
            android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
            if (viewGroup != null) {
                viewGroup.requestDisallowInterceptTouchEvent(true);
            }
            if2.d0 d0Var2 = hVar2.f546693n;
            if (d0Var2 != null) {
                d0Var2.d(0);
            }
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(hVar2.f546694o, "alpha", 0.1f, 0.8f);
            ofFloat.setDuration(250L);
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(hVar2.f546694o, "alpha", 0.8f, 0.1f);
            ofFloat2.setDuration(250L);
            android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(hVar2.f546695p, "alpha", 0.1f, 0.8f);
            ofFloat3.setDuration(250L);
            android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(hVar2.f546695p, "alpha", 0.8f, 0.1f);
            ofFloat4.setDuration(250L);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.play(ofFloat);
            animatorSet.play(ofFloat2).with(ofFloat3).after(ofFloat);
            animatorSet.play(ofFloat4).after(ofFloat2);
            animatorSet.addListener(new ys2.g(hVar2));
            animatorSet.start();
            hVar2.f546696q = animatorSet;
            at2.y0 y0Var = (at2.y0) hVar2.m56789x25fe639c(at2.y0.class);
            if (y0Var != null) {
                if (((ct2.j) y0Var.m56788xbba4bfc0(ct2.j.class)).B == 2.0f) {
                    at2.u1 u1Var = (at2.u1) y0Var.R6(at2.u1.class);
                    if (u1Var != null && (a0Var2 = u1Var.f95295q) != null) {
                        a0Var2.f324691a.m58794xeb2d9731(3.0f);
                    }
                } else {
                    at2.u1 u1Var2 = (at2.u1) y0Var.R6(at2.u1.class);
                    if (u1Var2 != null && (a0Var = u1Var2.f95295q) != null) {
                        a0Var.f324691a.m58794xeb2d9731(2.0f);
                    }
                }
            }
            at2.u0 u0Var = (at2.u0) hVar2.R6(at2.u0.class);
            if (u0Var != null) {
                u0Var.f95291q = true;
            }
        }
        android.os.Vibrator vibrator = fVar.f546686f;
        if (vibrator != null) {
            vibrator.vibrate(10L);
        }
        org.json.JSONObject b17 = ml2.z0.b(ml2.z0.f409863a, null, 1, null);
        ys2.h hVar3 = (ys2.h) weakReference.get();
        b17.put("press_before_type", java.lang.Float.valueOf((hVar3 == null || (jVar = (ct2.j) hVar3.m56788xbba4bfc0(ct2.j.class)) == null) ? 1.0f : jVar.B));
        zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
        ml2.o3[] o3VarArr = ml2.o3.f409306d;
        java.lang.String jSONObject = b17.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        ((ml2.j0) zbVar).Wj("watch_live_speed_press", jSONObject);
    }
}
