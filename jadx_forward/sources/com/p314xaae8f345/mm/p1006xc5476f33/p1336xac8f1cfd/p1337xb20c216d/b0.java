package com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d;

/* loaded from: classes12.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f178063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f178064e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f178065f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.ActivityC13155x6eea6ae2 f178066g;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.ActivityC13155x6eea6ae2 activityC13155x6eea6ae2, java.util.List list, java.lang.String str, java.lang.Runnable runnable) {
        this.f178066g = activityC13155x6eea6ae2;
        this.f178063d = list;
        this.f178064e = str;
        this.f178065f = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (java.lang.String str : this.f178063d) {
            java.lang.String r17 = c01.z1.r();
            k70.i0 i0Var = new k70.i0();
            i0Var.f386175a = 4;
            java.lang.String str2 = this.f178066g.f178017m;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            r70.g gVar = new r70.g(str2, 0, r17 == null ? "" : r17, str == null ? "" : str, i0Var);
            gVar.f474641j = "editor_ui_send_img";
            ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).nj(gVar);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f178064e)) {
                if (w11.t1.a(str)) {
                    w11.r1 a17 = w11.s1.a(str);
                    a17.g(str);
                    a17.e(this.f178064e);
                    a17.h(c01.e2.C(str));
                    a17.b();
                } else {
                    w11.r1 a18 = w11.s1.a(str);
                    a18.g(str);
                    a18.e(this.f178064e);
                    a18.h(c01.e2.C(str));
                    a18.f523664f = 0;
                    a18.f523667i = 4;
                    a18.a().a();
                }
            }
        }
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.a0(this));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(this.f178065f);
    }

    /* renamed from: toString */
    public java.lang.String m54581x9616526c() {
        return super.toString() + "|onActivityResult";
    }
}
