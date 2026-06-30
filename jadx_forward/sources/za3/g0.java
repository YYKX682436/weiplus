package za3;

/* loaded from: classes15.dex */
public class g0 implements za3.d0, za3.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f552445a;

    /* renamed from: b, reason: collision with root package name */
    public za3.e0 f552446b;

    /* renamed from: c, reason: collision with root package name */
    public za3.i0 f552447c;

    /* renamed from: g, reason: collision with root package name */
    public final ab3.h f552451g;

    /* renamed from: h, reason: collision with root package name */
    public za3.f0 f552452h;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f552449e = "";

    /* renamed from: f, reason: collision with root package name */
    public boolean f552450f = false;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f552448d = new java.util.ArrayList();

    public g0(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view, java.lang.String str, ab3.h hVar) {
        this.f552445a = view;
        this.f552451g = hVar;
        za3.e0 e0Var = new za3.e0(context, view, str);
        this.f552446b = e0Var;
        e0Var.f552440f = this;
        this.f552447c = new za3.i0(context, viewGroup, str);
        java.util.Iterator it = va3.j0.Ui().b(str).iterator();
        while (it.hasNext()) {
            this.f552448d.add((java.lang.String) it.next());
        }
    }

    public void a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16298xbb1f6725 c16298xbb1f6725;
        com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.C16319x94a0c128 c16319x94a0c128;
        if (this.f552450f) {
            return;
        }
        this.f552449e = str;
        za3.e0 e0Var = this.f552446b;
        e0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareHeaderAvatarViewMgr", "onCurMemberChange, username=%s", str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            e0Var.c();
        } else {
            e0Var.c();
            e0Var.a(str);
        }
        za3.i0 i0Var = this.f552447c;
        java.lang.String str2 = this.f552449e;
        i0Var.getClass();
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = i0Var.f552474l;
        if (K0) {
            i0Var.f552472j = false;
            n3Var.mo50303x856b99f0(10);
            android.os.Message obtain = android.os.Message.obtain();
            obtain.what = 10;
            n3Var.mo50308x2936bf5f(obtain);
            i0Var.b(true);
        } else {
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c01.a2.e(str2))) {
                i0Var.f552472j = true;
                n3Var.mo50303x856b99f0(5);
                android.os.Message obtain2 = android.os.Message.obtain();
                obtain2.what = 5;
                obtain2.obj = str2;
                n3Var.mo50309x6d91b823(obtain2);
            }
            i0Var.b(true);
        }
        java.lang.Object mo1006x62748683 = this.f552451g.mo1006x62748683(this.f552449e);
        if (!(mo1006x62748683 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16298xbb1f6725) || (c16319x94a0c128 = (c16298xbb1f6725 = (com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16298xbb1f6725) mo1006x62748683).f226254p) == null) {
            return;
        }
        c16319x94a0c128.m66003x5ed0f0ff(c16298xbb1f6725.f226246e);
        c16319x94a0c128.m66003x5ed0f0ff(c16298xbb1f6725.f226247f);
    }

    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareHeaderMgr", "onMyselfFinishTalking");
        za3.e0 e0Var = this.f552446b;
        java.lang.String r17 = c01.z1.r();
        if (e0Var.f552437c.c(r17)) {
            e0Var.f552437c.a(r17).a();
            e0Var.f552437c.notifyDataSetChanged();
            e0Var.f552435a.invalidate();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f552447c.f552474l;
        n3Var.mo50303x856b99f0(9);
        n3Var.mo50303x856b99f0(10);
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = 9;
        n3Var.mo50308x2936bf5f(obtain);
        this.f552449e = "";
        this.f552450f = false;
    }
}
