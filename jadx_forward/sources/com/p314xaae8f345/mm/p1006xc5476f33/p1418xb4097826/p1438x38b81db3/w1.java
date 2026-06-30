package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public final class w1 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186365a;

    public w1(in5.s0 s0Var) {
        this.f186365a = s0Var;
    }

    @Override // ym5.n0
    /* renamed from: getExposedId */
    public long mo55681x18a217a5(android.view.View view) {
        java.util.ArrayList arrayList;
        r45.jb4 jb4Var;
        r45.my0 my0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        so2.y0 y0Var = (so2.y0) this.f186365a.f374658i;
        if (y0Var == null || (arrayList = y0Var.A) == null || (jb4Var = (r45.jb4) kz5.n0.Z(arrayList)) == null || (my0Var = (r45.my0) jb4Var.m75936x14adae67(2)) == null) {
            return 0L;
        }
        return my0Var.m75942xfb822ef2(0);
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        java.util.ArrayList<r45.jb4> arrayList;
        java.lang.String str;
        java.lang.String m75945x2fec8307;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        in5.s0 s0Var = this.f186365a;
        so2.y0 y0Var = (so2.y0) s0Var.f374658i;
        if (z17) {
            java.util.ArrayList arrayList2 = y0Var.A;
            if ((arrayList2 == null || arrayList2.isEmpty()) || (arrayList = y0Var.A) == null) {
                return;
            }
            for (r45.jb4 jb4Var : arrayList) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                android.content.Context context = s0Var.f374654e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                pf5.z zVar = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
                int m8183xf806b362 = s0Var.m8183xf806b362();
                r45.my0 my0Var = (r45.my0) jb4Var.m75936x14adae67(2);
                if (my0Var == null || (str = my0Var.m75945x2fec8307(1)) == null) {
                    str = "";
                }
                r45.my0 my0Var2 = (r45.my0) jb4Var.m75936x14adae67(2);
                o3Var.Jk(V6, false, m8183xf806b362, str, (my0Var2 == null || (m75945x2fec8307 = my0Var2.m75945x2fec8307(4)) == null) ? "" : m75945x2fec8307);
            }
        }
    }
}
