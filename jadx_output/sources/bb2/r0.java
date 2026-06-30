package bb2;

/* loaded from: classes5.dex */
public final class r0 extends wp.i {

    /* renamed from: J, reason: collision with root package name */
    public android.text.SpannableString f18970J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(xp.d danmakuContext) {
        super(danmakuContext);
        kotlin.jvm.internal.o.g(danmakuContext, "danmakuContext");
        this.f448346q = 0;
    }

    @Override // wp.a
    public void a() {
        r45.oo ooVar;
        java.lang.String string;
        java.lang.Object obj = this.f448354y;
        android.text.SpannableString spannableString = null;
        bb2.o oVar = obj instanceof bb2.o ? (bb2.o) obj : null;
        if (oVar != null && (ooVar = oVar.f18926a) != null && (string = ooVar.getString(2)) != null) {
            i95.m c17 = i95.n0.c(le0.x.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            spannableString = com.tencent.mm.pluginsdk.ui.span.c0.i(com.tencent.mm.sdk.platformtools.x2.f193071a, string);
        }
        this.f18970J = spannableString;
    }

    @Override // wp.f, wp.a
    public void c() {
        r45.oo ooVar;
        r45.no noVar;
        xp.i f17 = xp.d.f();
        java.lang.Object obj = this.f448354y;
        bb2.o oVar = obj instanceof bb2.o ? (bb2.o) obj : null;
        long integer = ((oVar == null || (ooVar = oVar.f18926a) == null || (noVar = (r45.no) ooVar.getCustom(13)) == null) ? xp.d.f().f455844a : noVar.getInteger(0)) / f17.f455860q;
        if (integer <= 0) {
            integer = f17.f455844a;
        }
        this.f448334e = new zp.h(integer);
        this.f448336g = integer;
    }

    @Override // wp.f, wp.a
    public float i() {
        return this.E - com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
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
        kotlin.jvm.internal.o.e(oVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.bullet.FixedCenterBulletViewHolder");
        bb2.q0 q0Var = (bb2.q0) oVar;
        java.lang.Object obj = this.f448354y;
        bb2.o oVar2 = obj instanceof bb2.o ? (bb2.o) obj : null;
        java.lang.Integer valueOf = (oVar2 == null || (ooVar = oVar2.f18926a) == null || (moVar = (r45.mo) ooVar.getCustom(10)) == null || (n6Var = (r45.n6) moVar.getCustom(0)) == null) ? null : java.lang.Integer.valueOf(n6Var.getInteger(0));
        com.tencent.mm.plugin.finder.view.StrokeTextView strokeTextView = q0Var.f18953f;
        int measureText = valueOf != null ? (int) strokeTextView.getPaint().measureText(java.lang.String.valueOf(valueOf.intValue())) : strokeTextView.getMeasuredWidth();
        int h17 = h() - q0Var.f18952e.getMeasuredWidth();
        android.view.ViewGroup.LayoutParams layoutParams = q0Var.f18953f.getLayoutParams();
        return ((((h17 - ((layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null) != null ? r1.leftMargin : 0)) - measureText) / 2.0f) - xp.d.f().f455848e) - q0Var.f18951d.getPaddingLeft();
    }

    @Override // wp.f
    public float z(long j17) {
        return y(j17);
    }
}
