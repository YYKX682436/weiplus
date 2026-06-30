package qe5;

/* loaded from: classes8.dex */
public final class p0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public jk3.v f443700d;

    /* renamed from: e, reason: collision with root package name */
    public gc5.c f443701e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f443702f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f443703g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public final kd5.e T6() {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            return (kd5.e) Q6.mo140437x75286adb();
        }
        return null;
    }

    public final java.lang.String U6() {
        java.lang.String str;
        kd5.e T6 = T6();
        return (T6 == null || (str = T6.f388426x) == null) ? "" : str;
    }

    public final void V6() {
        java.lang.String str;
        java.lang.String str2;
        if (this.f443702f) {
            return;
        }
        ty.i0 i0Var = (ty.i0) i95.n0.c(ty.i0.class);
        ak3.i iVar = new ak3.i(m80379x76847179());
        ((sy.x) i0Var).getClass();
        md5.b bVar = new md5.b(iVar);
        this.f443700d = bVar;
        kd5.e T6 = T6();
        java.lang.String str3 = "";
        if (T6 == null || (str = T6.F) == null) {
            str = "";
        }
        java.lang.String U6 = U6();
        kd5.e T62 = T6();
        bVar.c0(str, U6, T62 != null ? T62.f388416n : 0, true);
        java.lang.Object obj = this.f443700d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.multitask.IFilesPageMultiTaskHelper");
        md5.c cVar = (md5.c) obj;
        java.lang.String U62 = U6();
        kd5.e T63 = T6();
        if (T63 != null && (str2 = T63.f388425w) != null) {
            str3 = str2;
        }
        ((md5.b) cVar).d0(U62, str3);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16084xdca2b46a abstractC16084xdca2b46a = ((qe5.e) pf5.z.f435481a.a(activity).a(qe5.e.class)).f443621d;
        if (abstractC16084xdca2b46a != null) {
            jk3.v vVar = this.f443700d;
            abstractC16084xdca2b46a.mo65013xf5a3a234(vVar != null ? vVar.f381610a : null);
        }
        this.f443702f = true;
    }

    public final void W6() {
        gc5.b bVar;
        java.lang.String str;
        java.lang.String str2;
        if (this.f443703g) {
            return;
        }
        if (((ty.i0) i95.n0.c(ty.i0.class)) != null) {
            bVar = new gc5.b(new dp1.a(m80379x76847179()));
            kd5.e T6 = T6();
            java.lang.String str3 = "";
            if (T6 == null || (str = T6.F) == null) {
                str = "";
            }
            java.lang.String U6 = U6();
            kd5.e T62 = T6();
            bVar.u0(str, U6, T62 != null ? T62.f388416n : 0, true);
            java.lang.String U62 = U6();
            kd5.e T63 = T6();
            if (T63 != null && (str2 = T63.f388425w) != null) {
                str3 = str2;
            }
            bVar.v0(U62, str3);
            this.f443703g = true;
        } else {
            bVar = null;
        }
        this.f443701e = bVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        java.lang.Object obj = this.f443701e;
        if (obj != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4) obj).o0();
        }
    }
}
