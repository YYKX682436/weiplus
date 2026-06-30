package w51;

/* loaded from: classes15.dex */
public class n {
    public static final java.text.DateFormat C = new java.text.SimpleDateFormat(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f, java.util.Locale.ENGLISH);
    public final android.content.Context A;
    public final boolean B;

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f524522a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 f524523b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 f524524c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 f524525d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 f524526e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 f524527f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 f524528g;

    /* renamed from: h, reason: collision with root package name */
    public int f524529h;

    /* renamed from: i, reason: collision with root package name */
    public o51.f f524530i;

    /* renamed from: j, reason: collision with root package name */
    public boolean[] f524531j;

    /* renamed from: k, reason: collision with root package name */
    public int f524532k;

    /* renamed from: l, reason: collision with root package name */
    public int f524533l;

    /* renamed from: m, reason: collision with root package name */
    public int f524534m;

    /* renamed from: n, reason: collision with root package name */
    public int f524535n;

    /* renamed from: o, reason: collision with root package name */
    public int f524536o;

    /* renamed from: p, reason: collision with root package name */
    public int f524537p;

    /* renamed from: q, reason: collision with root package name */
    public int f524538q;

    /* renamed from: r, reason: collision with root package name */
    public int f524539r;

    /* renamed from: s, reason: collision with root package name */
    public int f524540s;

    /* renamed from: t, reason: collision with root package name */
    public int f524541t;

    /* renamed from: u, reason: collision with root package name */
    public int f524542u;

    /* renamed from: v, reason: collision with root package name */
    public int f524543v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f524544w;

    /* renamed from: x, reason: collision with root package name */
    public v51.a f524545x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.List f524546y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.List f524547z;

    public n(android.content.Context context) {
        this.f524532k = 1900;
        this.f524533l = 2100;
        this.f524534m = 1;
        this.f524535n = 12;
        this.f524536o = 1;
        this.f524537p = 31;
        this.f524538q = 0;
        this.f524539r = 0;
        this.f524540s = 23;
        this.f524541t = 59;
        this.f524544w = false;
        this.f524546y = java.util.Arrays.asList("1", "3", "5", "7", "8", com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27997xfdbbeb01.f62845xa1e463a0, "12");
        this.f524547z = java.util.Arrays.asList("4", "6", "9", "11");
        this.B = true;
        this.A = context;
    }

    public static void a(w51.n nVar, int i17, int i18, int i19, int i27, java.util.List list, java.util.List list2) {
        int c17 = nVar.c(nVar.f524525d);
        int m48589xfda78ef6 = nVar.f524525d.m48589xfda78ef6();
        if (list.contains(java.lang.String.valueOf(i18))) {
            if (i27 > 31) {
                i27 = 31;
            }
            nVar.f524525d.m48595x6cab2c8d(new o51.d(i19, i27));
        } else if (list2.contains(java.lang.String.valueOf(i18))) {
            if (i27 > 30) {
                i27 = 30;
            }
            nVar.f524525d.m48595x6cab2c8d(new o51.d(i19, i27));
        } else if ((i17 % 4 != 0 || i17 % 100 == 0) && i17 % 400 != 0) {
            if (i27 > 28) {
                i27 = 28;
            }
            nVar.f524525d.m48595x6cab2c8d(new o51.d(i19, i27));
        } else {
            if (i27 > 29) {
                i27 = 29;
            }
            nVar.f524525d.m48595x6cab2c8d(new o51.d(i19, i27));
        }
        if (m48589xfda78ef6 > nVar.f524525d.m48588xf939df19().mo145524x99620925() - 1) {
            nVar.f524525d.m48596x940d026a(nVar.f524525d.m48588xf939df19().mo145524x99620925() - 1);
        }
        if (nVar.c(nVar.f524525d) != c17) {
            int c18 = ((o51.d) nVar.f524525d.m48588xf939df19()).c();
            int d17 = ((o51.d) nVar.f524525d.m48588xf939df19()).d();
            if (c17 <= d17) {
                nVar.f524525d.m48596x940d026a(0);
            } else if (c17 >= c18) {
                nVar.f524525d.m48596x940d026a(r3.m48588xf939df19().mo145524x99620925() - 1);
            } else {
                nVar.f524525d.m48596x940d026a(c17 - d17);
            }
        }
    }

    public final void b(com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 c11323x28056480) {
        if (this.f524545x != null) {
            c11323x28056480.m48604x88423923(new w51.m(this));
        }
    }

    public int c(com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 c11323x28056480) {
        java.lang.Object mo145523xfb80e389;
        if (!(c11323x28056480.m48588xf939df19() instanceof o51.d) || (mo145523xfb80e389 = c11323x28056480.m48588xf939df19().mo145523xfb80e389(c11323x28056480.m48589xfda78ef6())) == null) {
            return 0;
        }
        return ((java.lang.Integer) mo145523xfb80e389).intValue();
    }

    public java.lang.String d() {
        return java.lang.String.valueOf(c(this.f524523b) + "-" + c(this.f524524c) + "-" + c(this.f524525d) + " " + c(this.f524526e) + ":" + c(this.f524527f) + ":" + c(this.f524528g));
    }

    public java.util.List e() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < 6; i17++) {
            if (i17 == 0) {
                this.f524523b.setVisibility(this.f524531j[i17] ? 0 : 8);
                if (this.f524531j[i17]) {
                    arrayList.add(this.f524523b);
                }
            } else if (i17 == 1) {
                this.f524524c.setVisibility(this.f524531j[i17] ? 0 : 8);
                if (this.f524531j[i17]) {
                    arrayList.add(this.f524524c);
                }
            } else if (i17 == 2) {
                this.f524525d.setVisibility(this.f524531j[i17] ? 0 : 8);
                if (this.f524531j[i17]) {
                    arrayList.add(this.f524525d);
                }
            } else if (i17 == 3) {
                this.f524526e.setVisibility(this.f524531j[i17] ? 0 : 8);
                if (this.f524531j[i17]) {
                    arrayList.add(this.f524526e);
                }
            } else if (i17 == 4) {
                this.f524527f.setVisibility(this.f524531j[i17] ? 0 : 8);
                if (this.f524531j[i17]) {
                    arrayList.add(this.f524527f);
                }
            } else if (i17 == 5) {
                this.f524528g.setVisibility(this.f524531j[i17] ? 0 : 8);
                if (this.f524531j[i17]) {
                    arrayList.add(this.f524528g);
                }
            }
        }
        return arrayList;
    }

    public void f(int i17) {
        this.f524543v = i17;
        this.f524525d.m48598x4d90c14c(i17);
        this.f524524c.m48598x4d90c14c(this.f524543v);
        this.f524523b.m48598x4d90c14c(this.f524543v);
        this.f524526e.m48598x4d90c14c(this.f524543v);
        this.f524527f.m48598x4d90c14c(this.f524543v);
        this.f524528g.m48598x4d90c14c(this.f524543v);
    }

    public void g(boolean z17, int i17) {
        if (i17 <= 0) {
            i17 = com.p314xaae8f345.mm.R.C30867xcad56011.hih;
        }
        this.f524544w = z17;
        o51.f fVar = this.f524530i;
        fVar.f424626g = z17;
        fVar.f424627h = i17;
        com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 c11323x28056480 = this.f524523b;
        c11323x28056480.B = z17;
        c11323x28056480.C = i17;
        this.f524524c.m48603x8eb892a6(z17);
        this.f524525d.m48603x8eb892a6(z17);
    }

    public n(android.content.Context context, boolean z17) {
        this.f524532k = 1900;
        this.f524533l = 2100;
        this.f524534m = 1;
        this.f524535n = 12;
        this.f524536o = 1;
        this.f524537p = 31;
        this.f524538q = 0;
        this.f524539r = 0;
        this.f524540s = 23;
        this.f524541t = 59;
        this.f524544w = false;
        this.f524546y = java.util.Arrays.asList("1", "3", "5", "7", "8", com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27997xfdbbeb01.f62845xa1e463a0, "12");
        this.f524547z = java.util.Arrays.asList("4", "6", "9", "11");
        this.B = true;
        this.A = context;
        this.B = z17;
    }
}
