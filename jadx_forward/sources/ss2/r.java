package ss2;

/* loaded from: classes10.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ss2.a0 f493514d;

    public r(ss2.a0 a0Var) {
        this.f493514d = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        ss2.a0 a0Var = this.f493514d;
        android.os.Bundle bundle = a0Var.A;
        java.util.ArrayList<java.lang.String> stringArrayList = bundle != null ? bundle.getStringArrayList("image_thumb_list") : null;
        a0Var.f493450s.clear();
        java.util.ArrayList arrayList = a0Var.f493449r;
        if (arrayList != null) {
            int i17 = 0;
            for (java.lang.Object obj : arrayList) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                java.lang.String e17 = (stringArrayList == null || stringArrayList.size() <= i17 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringArrayList.get(i17))) ? mv2.q.f413151a.e((java.lang.String) obj, null) : stringArrayList.get(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
                java.util.ArrayList arrayList2 = a0Var.f493451t;
                if (arrayList2 != null && (str = (java.lang.String) kz5.n0.a0(arrayList2, i17)) != null) {
                    h0Var.f391656d = mv2.q.f413151a.e(str, null);
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17)) {
                    android.graphics.Bitmap J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(e17, null);
                    android.graphics.Bitmap J3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J((java.lang.String) h0Var.f391656d, null);
                    if (J2 != null) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new ss2.q(a0Var, e17, h0Var, J3, i17, J2));
                    }
                }
                i17 = i18;
            }
        }
    }
}
