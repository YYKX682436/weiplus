package bb2;

/* loaded from: classes5.dex */
public final class r0 extends wp.i {

    /* renamed from: J, reason: collision with root package name */
    public android.text.SpannableString f100503J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(xp.d danmakuContext) {
        super(danmakuContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(danmakuContext, "danmakuContext");
        this.f529879q = 0;
    }

    @Override // wp.a
    public void a() {
        r45.oo ooVar;
        java.lang.String m75945x2fec8307;
        java.lang.Object obj = this.f529887y;
        android.text.SpannableString spannableString = null;
        bb2.o oVar = obj instanceof bb2.o ? (bb2.o) obj : null;
        if (oVar != null && (ooVar = oVar.f100459a) != null && (m75945x2fec8307 = ooVar.m75945x2fec8307(2)) != null) {
            i95.m c17 = i95.n0.c(le0.x.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            spannableString = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, m75945x2fec8307);
        }
        this.f100503J = spannableString;
    }

    @Override // wp.f, wp.a
    public void c() {
        r45.oo ooVar;
        r45.no noVar;
        xp.i f17 = xp.d.f();
        java.lang.Object obj = this.f529887y;
        bb2.o oVar = obj instanceof bb2.o ? (bb2.o) obj : null;
        long m75939xb282bd08 = ((oVar == null || (ooVar = oVar.f100459a) == null || (noVar = (r45.no) ooVar.m75936x14adae67(13)) == null) ? xp.d.f().f537377a : noVar.m75939xb282bd08(0)) / f17.f537393q;
        if (m75939xb282bd08 <= 0) {
            m75939xb282bd08 = f17.f537377a;
        }
        this.f529867e = new zp.h(m75939xb282bd08);
        this.f529869g = m75939xb282bd08;
    }

    @Override // wp.f, wp.a
    public float i() {
        return this.E - com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
    }

    @Override // wp.i, wp.a
    public int j() {
        return -2147483646;
    }

    @Override // wp.i, wp.a
    public zp.d r(zp.m mVar) {
        super.r(mVar);
        return new zp.d(0);
    }

    @Override // wp.f, wp.a
    public void s(float f17, float f18, long j17, long j18) {
        super.s(f17, f18, j17, j18);
        i();
        h();
        i();
    }

    @Override // wp.a
    public void u(long j17) {
    }

    @Override // wp.f
    public float y(long j17) {
        r45.oo ooVar;
        r45.mo moVar;
        r45.n6 n6Var;
        yp.o oVar = this.H;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(oVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.bullet.FixedCenterBulletViewHolder");
        bb2.q0 q0Var = (bb2.q0) oVar;
        java.lang.Object obj = this.f529887y;
        bb2.o oVar2 = obj instanceof bb2.o ? (bb2.o) obj : null;
        java.lang.Integer valueOf = (oVar2 == null || (ooVar = oVar2.f100459a) == null || (moVar = (r45.mo) ooVar.m75936x14adae67(10)) == null || (n6Var = (r45.n6) moVar.m75936x14adae67(0)) == null) ? null : java.lang.Integer.valueOf(n6Var.m75939xb282bd08(0));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15381xac4783ea c15381xac4783ea = q0Var.f100486f;
        int measureText = valueOf != null ? (int) c15381xac4783ea.getPaint().measureText(java.lang.String.valueOf(valueOf.intValue())) : c15381xac4783ea.getMeasuredWidth();
        int h17 = h() - q0Var.f100485e.getMeasuredWidth();
        android.view.ViewGroup.LayoutParams layoutParams = q0Var.f100486f.getLayoutParams();
        return ((((h17 - ((layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null) != null ? r1.leftMargin : 0)) - measureText) / 2.0f) - xp.d.f().f537381e) - q0Var.f100484d.getPaddingLeft();
    }

    @Override // wp.f
    public float z(long j17) {
        return y(j17);
    }
}
