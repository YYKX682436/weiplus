package vx2;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f522782a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f522783b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f522784c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f522785d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd f522786e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f522787f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f522788g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f522789h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f522790i;

    /* renamed from: j, reason: collision with root package name */
    public yz5.l f522791j;

    /* renamed from: k, reason: collision with root package name */
    public yz5.a f522792k;

    /* renamed from: l, reason: collision with root package name */
    public wu5.c f522793l;

    public k(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f522782a = context;
        this.f522783b = jz5.h.b(vx2.i.f522780d);
        this.f522784c = jz5.h.b(vx2.j.f522781d);
        this.f522785d = jz5.h.b(vx2.a.f522768d);
    }

    public static final float a(vx2.k kVar, boolean z17) {
        long j17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = kVar.f522786e;
        long mo56695x7723e6ff = c15188xd8bd4bd != null ? c15188xd8bd4bd.mo56695x7723e6ff() : 0L;
        if (mo56695x7723e6ff == 0) {
            return 0.0f;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd2 = kVar.f522786e;
        long mo56685x3d7f3f1d = c15188xd8bd4bd2 != null ? c15188xd8bd4bd2.mo56685x3d7f3f1d() : 0L;
        if (z17) {
            j17 = mo56695x7723e6ff - mo56685x3d7f3f1d < com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d ? mo56695x7723e6ff - 1000 : 10000 + mo56685x3d7f3f1d;
        } else {
            j17 = mo56685x3d7f3f1d >= com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d ? mo56685x3d7f3f1d - 10000 : 0L;
        }
        return ((float) j17) / ((float) mo56695x7723e6ff);
    }

    public static final void b(vx2.k kVar, long j17, long j18, long j19) {
        kVar.getClass();
        long max = java.lang.Math.max(0L, j18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = kVar.f522786e;
        if (c15188xd8bd4bd != null) {
            float f17 = (float) max;
            c15188xd8bd4bd.r(f17 / 1000.0f, false, 3);
            hc2.f1.x(c15188xd8bd4bd);
            yz5.l lVar = kVar.f522791j;
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Float.valueOf(f17 / ((float) j19)));
            }
            g(kVar, 5000L, false, 2, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSeekHelper", "fast seekTo " + max + " currentMs " + j17);
        }
    }

    public static final float c(vx2.k kVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = kVar.f522786e;
        if (c15188xd8bd4bd == null) {
            return 0.0f;
        }
        long mo56695x7723e6ff = c15188xd8bd4bd.mo56695x7723e6ff();
        if (mo56695x7723e6ff == 0) {
            return 0.0f;
        }
        return ((float) c15188xd8bd4bd.mo56685x3d7f3f1d()) / ((float) mo56695x7723e6ff);
    }

    public static /* synthetic */ void e(vx2.k kVar, long j17, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = 0;
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        kVar.d(j17, z17);
    }

    public static final void f(vx2.k kVar) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = kVar.f522789h;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setVisibility(4);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = kVar.f522790i;
        if (c22699x3dcdb3522 != null) {
            c22699x3dcdb3522.setVisibility(4);
        }
        android.view.ViewGroup viewGroup = kVar.f522788g;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        yz5.a aVar = kVar.f522792k;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    public static void g(vx2.k kVar, long j17, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = ((java.lang.Number) ((jz5.n) kVar.f522785d).mo141623x754a37bb()).longValue();
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        kVar.d(j17, z17);
    }

    public final void d(long j17, boolean z17) {
        if (h()) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f522789h;
            if (c22699x3dcdb352 != null && c22699x3dcdb352.getVisibility() == 0) {
                if (j17 <= 0) {
                    wu5.c cVar = this.f522793l;
                    if (cVar != null) {
                        cVar.cancel(false);
                    }
                    this.f522793l = null;
                    f(this);
                    return;
                }
                wu5.c cVar2 = this.f522793l;
                if (cVar2 != null) {
                    cVar2.cancel(false);
                }
                ku5.u0 u0Var = ku5.t0.f394148d;
                vx2.h hVar = new vx2.h(z17, this);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                this.f522793l = t0Var.z(hVar, j17, false);
            }
        }
    }

    public final boolean h() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        if (((java.lang.Number) ((jz5.n) this.f522783b).mo141623x754a37bb()).intValue() == 0) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f522787f;
        return ((abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null) ? 0 : feedObject.m59300x36bbd779()) >= ((java.lang.Number) ((jz5.n) this.f522784c).mo141623x754a37bb()).intValue();
    }

    public final boolean i() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        if (((java.lang.Number) ((jz5.n) this.f522783b).mo141623x754a37bb()).intValue() != 2) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f522787f;
        return ((abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null) ? 0 : feedObject.m59300x36bbd779()) >= ((java.lang.Number) ((jz5.n) this.f522784c).mo141623x754a37bb()).intValue();
    }

    public final void j() {
        android.view.ViewPropertyAnimator animate;
        if (h()) {
            wu5.c cVar = this.f522793l;
            if (cVar != null) {
                cVar.cancel(false);
            }
            android.view.ViewGroup viewGroup = this.f522788g;
            if (viewGroup != null && (animate = viewGroup.animate()) != null) {
                animate.cancel();
            }
            this.f522793l = null;
            android.view.ViewGroup viewGroup2 = this.f522788g;
            if (viewGroup2 != null) {
                viewGroup2.setAlpha(1.0f);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f522789h;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setVisibility(0);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f522790i;
            if (c22699x3dcdb3522 == null) {
                return;
            }
            c22699x3dcdb3522.setVisibility(0);
        }
    }
}
