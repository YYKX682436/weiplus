package vn2;

/* loaded from: classes2.dex */
public final class l0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f519849d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f519850e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.C14438x701c8eca f519851f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ym5.q1 f519852g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f519853h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f519854i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(boolean z17, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.C14438x701c8eca c14438x701c8eca, ym5.q1 q1Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        super(0);
        this.f519849d = z17;
        this.f519850e = context;
        this.f519851f = c14438x701c8eca;
        this.f519852g = q1Var;
        this.f519853h = h0Var;
        this.f519854i = abstractC14490x69736cb5;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        int i18;
        int i19;
        ym5.q1 q1Var;
        ym5.q1 q1Var2;
        if (this.f519849d) {
            android.content.Context context = this.f519850e;
            if (context instanceof android.app.Activity) {
                vn2.u0.f519920a.c((android.app.Activity) context);
            }
        }
        java.util.ArrayList m56388xcaeb60d0 = this.f519851f.m56388xcaeb60d0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f519854i;
        synchronized (m56388xcaeb60d0) {
            java.util.Iterator it = m56388xcaeb60d0.iterator();
            i17 = 0;
            i18 = 0;
            while (true) {
                i19 = -1;
                if (!it.hasNext()) {
                    i18 = -1;
                    break;
                }
                so2.j5 j5Var = (so2.j5) it.next();
                if ((j5Var instanceof zn2.a) && j5Var.mo2128x1ed62e84() == abstractC14490x69736cb5.mo2128x1ed62e84()) {
                    break;
                }
                i18++;
            }
        }
        if (i18 > 0 && (q1Var2 = this.f519852g) != null) {
            q1Var2.mo56050xa44dd169(i18, 1, 101);
        }
        if (this.f519853h.f391656d != null) {
            this.f519851f.c().b((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) this.f519853h.f391656d, this.f519852g);
        } else {
            java.util.Iterator it6 = this.f519851f.m56388xcaeb60d0().iterator();
            int i27 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                so2.j5 j5Var2 = (so2.j5) it6.next();
                if ((j5Var2 instanceof zn2.d) || (j5Var2 instanceof zn2.c)) {
                    i19 = i27;
                    break;
                }
                i27++;
            }
            java.util.List i28 = kz5.c0.i(java.lang.Boolean.valueOf(pm0.v.b0(this.f519851f.m56388xcaeb60d0(), vn2.k0.f519847d)), java.lang.Boolean.valueOf(pm0.v.b0(this.f519851f.m56388xcaeb60d0(), vn2.j0.f519846d)));
            if (!i28.isEmpty()) {
                java.util.Iterator it7 = i28.iterator();
                while (it7.hasNext()) {
                    if (((java.lang.Boolean) it7.next()).booleanValue() && (i17 = i17 + 1) < 0) {
                        kz5.c0.o();
                        throw null;
                    }
                }
            }
            if (i17 > 0 && (q1Var = this.f519852g) != null) {
                q1Var.mo56053xb9568715(i19, i17);
            }
        }
        return jz5.f0.f384359a;
    }
}
