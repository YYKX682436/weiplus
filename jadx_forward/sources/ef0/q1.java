package ef0;

@j95.b
/* loaded from: classes11.dex */
public final class q1 extends i95.w implements qk.a8 {

    /* renamed from: d, reason: collision with root package name */
    public final jk3.d f333836d = new ef0.j1();

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f333837e = jz5.h.b(ef0.l1.f333797d);

    public static void wi(ef0.q1 q1Var, android.app.Activity activity, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, bw5.ar0 ar0Var, bw5.v70 v70Var, qk.z7 z7Var, int i17, int i18, android.view.View view, android.graphics.Rect rect, android.graphics.Bitmap bitmap, boolean z17, int i19, java.lang.Object obj) {
        android.graphics.Rect rect2;
        android.graphics.Bitmap bitmap2;
        int i27 = (i19 & 32) != 0 ? 0 : i17;
        int i28 = (i19 & 64) != 0 ? 0 : i18;
        android.view.View view2 = (i19 & 128) != 0 ? null : view;
        android.graphics.Rect rect3 = (i19 & 256) != 0 ? null : rect;
        android.graphics.Bitmap bitmap3 = (i19 & 512) != 0 ? null : bitmap;
        boolean z18 = (i19 & 1024) == 0 ? z17 : false;
        q1Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingAddToPlayListFeatureService", "addToPlayList type: " + v70Var.f115722e + ", title: " + v70Var.m13171x7531c8a2() + ", currentTimeMs:" + i27 + ", durationMs:" + i28);
        qk.i9 i9Var = (qk.i9) i95.n0.c(qk.i9.class);
        bw5.lp0 lp0Var = new bw5.lp0();
        lp0Var.j(v70Var);
        java.lang.String m13170xcc16feb8 = v70Var.m13170xcc16feb8();
        if (m13170xcc16feb8 == null) {
            m13170xcc16feb8 = "";
        }
        lp0Var.g(m13170xcc16feb8);
        ((ef0.l4) i9Var).getClass();
        pm0.v.X(new ef0.g4(lp0Var));
        if (q1Var.Bi() && !z18) {
            if (view2 != null) {
                android.graphics.Bitmap b07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.b0(view2);
                android.graphics.Rect rect4 = new android.graphics.Rect();
                view2.getGlobalVisibleRect(rect4);
                rect4.left = i65.a.c(activity, rect4.left);
                rect4.top = i65.a.c(activity, rect4.top);
                rect4.right = i65.a.c(activity, rect4.right);
                rect4.bottom = i65.a.c(activity, rect4.bottom);
                bitmap2 = b07;
                rect2 = rect4;
            } else {
                rect2 = rect3;
                bitmap2 = bitmap3;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ting add to star ! screenshot : ");
            sb6.append(bitmap2 != null ? java.lang.Integer.valueOf(bitmap2.getByteCount()) : null);
            sb6.append(", ");
            sb6.append(rect2 != null ? java.lang.Integer.valueOf(rect2.centerX()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingAddToPlayListFeatureService", sb6.toString());
            cl4.l.c0(new cl4.l(new cl4.m(activity)), v70Var, false, il4.l.k(v70Var.f115722e), rect2, bitmap2, false, 32, null);
        }
        vk4.b bVar = new vk4.b(v70Var, ar0Var);
        bVar.l().q(new ef0.k1(v70Var, q1Var, activity, componentCallbacksC1101xa17d4670, bVar, i27, i28, z7Var));
    }

    public void Ai(android.content.Context context, bw5.ar0 enterScene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterScene, "enterScene");
        ((rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj()).B(enterScene, true, null, null);
    }

    public final boolean Bi() {
        return ((java.lang.Boolean) ((jz5.n) this.f333837e).mo141623x754a37bb()).booleanValue();
    }
}
