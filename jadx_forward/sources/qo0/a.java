package qo0;

/* loaded from: classes3.dex */
public abstract class a implements to0.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f446856d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f446857e;

    public a(android.view.ViewGroup root, qo0.c broadcast) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(broadcast, "broadcast");
        this.f446856d = root;
        this.f446857e = new java.util.HashMap();
        broadcast.mo46553xddc5c3b6(this);
    }

    public static boolean t0(qo0.a aVar, java.lang.String permission, int i17, int i18, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkPermission");
        }
        if ((i19 & 4) != 0) {
            i18 = aVar.hashCode();
        }
        aVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permission, "permission");
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = aVar.f446856d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        ((sb0.f) jVar).getClass();
        boolean a17 = j35.u.a((android.app.Activity) context, permission, i17, "", "");
        if (!a17) {
            aVar.f446857e.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
        return a17;
    }

    public void A0(int i17, int i18, android.content.Intent intent) {
    }

    public boolean B0() {
        return false;
    }

    public void C0(java.util.LinkedHashMap micUserMap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micUserMap, "micUserMap");
    }

    public abstract void E0(int i17);

    public void F0(int i17, int i18, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
    }

    public void G0(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        java.lang.Integer num = (java.lang.Integer) this.f446857e.get(java.lang.Integer.valueOf(i17));
        if (num == null) {
            num = 0;
        }
        F0(i17, num.intValue(), permissions, grantResults);
    }

    public boolean H0() {
        return false;
    }

    public void I0() {
    }

    public void J0() {
    }

    public abstract void K0(int i17);

    public void L0() {
    }

    public abstract void M0(qo0.b bVar, android.os.Bundle bundle);

    public void N0() {
    }

    public abstract void O0();

    @Override // to0.a
    /* renamed from: name */
    public abstract java.lang.String mo57003x337a8b();

    public void s0(int i17, int i18, android.os.Bundle bundle) {
    }

    public int u0() {
        android.content.Context context = this.f446856d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        return ((android.app.Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation();
    }

    public final android.view.ViewGroup v0() {
        return this.f446856d;
    }

    public int w0() {
        return this.f446856d.getVisibility();
    }

    public boolean x0() {
        return this.f446856d.getContext().getResources().getConfiguration().orientation == 2;
    }

    public void y0(boolean z17, int i17) {
    }

    public abstract void z0();
}
