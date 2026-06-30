package com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13;

/* loaded from: classes11.dex */
public final class m extends com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a {
    public final boolean C;
    public final jz5.g D;
    public final jz5.g E;
    public p13.l F;
    public java.lang.CharSequence G;

    public m(int i17, boolean z17) {
        super(8, i17);
        this.C = z17;
        this.D = jz5.h.b(new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.l(this));
        this.E = jz5.h.b(new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.k(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d
    public void a(android.content.Context context, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.b bVar) {
        android.text.TextPaint paint;
        if (bVar instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.i) {
            p13.l lVar = this.F;
            java.lang.String str = lVar != null ? lVar.f432647e : null;
            if (lVar == null || str == null) {
                return;
            }
            this.f288352z = lVar.f432647e;
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 L = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().L(str);
            if (L == null) {
                L = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(str);
            }
            f(L);
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String d17 = this.B.d1();
            java.lang.String str2 = this.f288382r;
            ((sg3.a) v0Var).getClass();
            java.lang.String f17 = c01.a2.f(d17, str2);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f17, lVar.f432648f)) {
                this.f288351y = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, f17, i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia));
                p13.i iVar = new p13.i();
                iVar.f432626a = this.f288351y;
                iVar.f432627b = this.A;
                iVar.f432628c = lVar.f432651i;
                iVar.f432629d = lVar.f432652j;
                android.widget.TextView textView = ((com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.i) bVar).f288414e;
                iVar.f432633h = textView != null ? textView.getPaint() : null;
                this.f288351y = o13.q.e(iVar).f432638a;
                return;
            }
            this.f288351y = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, f17, i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia));
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str3 = lVar.f432648f;
            com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.i iVar2 = (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.i) bVar;
            android.widget.TextView textView2 = iVar2.f288414e;
            float textSize = (textView2 == null || (paint = textView2.getPaint()) == null) ? 0.0f : paint.getTextSize();
            ((ke0.e) xVar).getClass();
            android.text.SpannableString j17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str3, textSize);
            p13.i iVar3 = new p13.i();
            iVar3.f432626a = j17;
            iVar3.f432627b = this.A;
            iVar3.f432628c = lVar.f432651i;
            iVar3.f432629d = lVar.f432652j;
            android.widget.TextView textView3 = iVar2.f288414e;
            iVar3.f432633h = textView3 != null ? textView3.getPaint() : null;
            this.G = o13.q.e(iVar3).f432638a;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c b() {
        return (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.j) ((jz5.n) this.D).mo141623x754a37bb();
    }
}
