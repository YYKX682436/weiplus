package ub3;

/* loaded from: classes15.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f507622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f507623e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f507624f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ub3.j f507625g;

    public b(ub3.j jVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f507625g = jVar;
        this.f507622d = str;
        this.f507623e = str2;
        this.f507624f = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        ub3.j jVar = this.f507625g;
        java.util.ArrayList arrayList = (java.util.ArrayList) jVar.f507646d.f226616t;
        java.lang.String str = this.f507622d;
        if (arrayList.contains(str)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16330x45b4a404 activityC16330x45b4a404 = jVar.f507646d;
        ((java.util.ArrayList) activityC16330x45b4a404.f226616t).add(0, str);
        java.lang.String str2 = this.f507623e;
        if (!c01.e2.J(str2)) {
            com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var = new com.p314xaae8f345.mm.p943x351df9c2.r0();
            r0Var.f152062a = str2;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().y0(r0Var);
        }
        ((java.util.HashMap) activityC16330x45b4a404.f226617u).put(str, str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e c16332x7cb9791e = activityC16330x45b4a404.f226626z;
        java.util.ArrayList arrayList2 = (java.util.ArrayList) c16332x7cb9791e.f226645d;
        if (arrayList2.size() > 0) {
            if (c16332x7cb9791e.f226650i.isStarted()) {
                c16332x7cb9791e.f226650i.end();
            }
            if (c16332x7cb9791e.f226649h.isStarted()) {
                c16332x7cb9791e.f226649h.end();
            }
            android.view.View view = c16332x7cb9791e.f226656r;
            if (view != null) {
                c16332x7cb9791e.f226654p = view;
                arrayList2.remove(view);
                android.animation.ValueAnimator valueAnimator = c16332x7cb9791e.f226647f;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                c16332x7cb9791e.i(c16332x7cb9791e.f226657s);
                if (c16332x7cb9791e.f226660v > 0) {
                    int random = (int) (java.lang.Math.random() * c16332x7cb9791e.f226660v);
                    c16332x7cb9791e.f226657s = random;
                    c16332x7cb9791e.f226656r = (android.view.View) arrayList2.get(random);
                } else {
                    c16332x7cb9791e.f226656r = null;
                    c16332x7cb9791e.f226657s = 0;
                }
            } else {
                c16332x7cb9791e.j((int) (java.lang.Math.random() * c16332x7cb9791e.f226660v));
                c16332x7cb9791e.f226654p = c16332x7cb9791e.f226656r;
                c16332x7cb9791e.f226650i.addListener(new ub3.h0(c16332x7cb9791e));
            }
        }
        ((java.util.ArrayList) activityC16330x45b4a404.A).remove(activityC16330x45b4a404.f226626z.m66060xfd54e659());
        activityC16330x45b4a404.G.c(0L, 60000L);
        ((java.util.LinkedList) activityC16330x45b4a404.f226618v).add(new android.util.Pair(str2, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(this.f507624f, 0))));
    }
}
