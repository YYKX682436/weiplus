package lj2;

/* loaded from: classes10.dex */
public abstract class j extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14328x87868185 {

    /* renamed from: e, reason: collision with root package name */
    public pm2.a f400407e;

    /* renamed from: f, reason: collision with root package name */
    public km2.q f400408f;

    /* renamed from: g, reason: collision with root package name */
    public xh2.a f400409g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f400410h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.content.Context context) {
        super(context, null, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f400407e = pm2.a.f438386f;
    }

    /* renamed from: getBindLinkMicUser */
    public final km2.q m145849x949ba2a5() {
        return this.f400408f;
    }

    /* renamed from: getBindMicData */
    public final xh2.a m145850xf6df7a5e() {
        return this.f400409g;
    }

    /* renamed from: getCurWidgetMode */
    public final pm2.a m145851x309290b1() {
        return this.f400407e;
    }

    /* renamed from: getFinderLiveMicCoverData */
    public final xh2.a m145852x5565c7c2() {
        return this.f400409g;
    }

    /* renamed from: getTAG */
    public final java.lang.String m145853xb5886c64() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(mo124439x679de195());
        sb6.append('_');
        sb6.append(this.f400407e);
        sb6.append('_');
        sb6.append(hashCode());
        sb6.append('_');
        km2.q qVar = this.f400408f;
        sb6.append(qVar != null ? qVar.f390706d : null);
        return sb6.toString();
    }

    /* renamed from: getTagLayoutBackgroundDrawable */
    public android.graphics.drawable.Drawable mo124438x9f24d53a() {
        return getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30859x5a72f63.f560636q2);
    }

    /* renamed from: getTagString */
    public abstract java.lang.String mo124439x679de195();

    /* renamed from: getTagText */
    public java.lang.String mo124440xe17957b1() {
        return "";
    }

    /* renamed from: getTagTextColor */
    public int mo124441xc9b30e32() {
        return getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560638q4);
    }

    public void l(pm2.a widgetMode, xh2.a data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widgetMode, "widgetMode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f400407e = widgetMode;
        this.f400409g = data;
        this.f400408f = data.f536053a;
    }

    public boolean m() {
        xh2.i iVar;
        xh2.a aVar = this.f400409g;
        return ((aVar == null || (iVar = aVar.f536054b) == null) ? 0.0f : iVar.f364142a) <= 0.1f;
    }

    public boolean n() {
        return p();
    }

    public final boolean o() {
        km2.q qVar;
        xh2.i iVar;
        xh2.i iVar2;
        xh2.a aVar = this.f400409g;
        boolean z17 = false;
        r1 = 0;
        int i17 = 0;
        z17 = false;
        if (((aVar == null || (iVar2 = aVar.f536054b) == null) ? 0 : iVar2.f536091j) != 0) {
            if (aVar != null && (iVar = aVar.f536054b) != null) {
                i17 = iVar.f536091j;
            }
            return !pm0.v.z(i17, 1);
        }
        if (aVar != null && (qVar = aVar.f536053a) != null) {
            z17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(qVar.f390722t, java.lang.Boolean.TRUE);
        }
        return !z17;
    }

    public final boolean p() {
        xh2.i iVar;
        xh2.a aVar = this.f400409g;
        java.lang.Integer valueOf = (aVar == null || (iVar = aVar.f536054b) == null) ? null : java.lang.Integer.valueOf(iVar.f536086e);
        return (((valueOf != null && valueOf.intValue() == 2) || (valueOf != null && valueOf.intValue() == 3)) || (valueOf != null && valueOf.intValue() == 6)) || (valueOf != null && valueOf.intValue() == 7);
    }

    public final void q(android.widget.ImageView imageView) {
        km2.q qVar = this.f400408f;
        if (qVar == null || imageView == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c64(), "showAudioBackground: " + qVar + " bgView: " + imageView);
        java.lang.String str = qVar.f390704b;
        if (str == null || str.length() == 0) {
            ((ku5.t0) ku5.t0.f394148d).g(new po0.d(bp.b.m10969xb866ec1c(getContext().getResources(), com.p314xaae8f345.mm.R.raw.f78922x61de8d17, null), new lj2.e(imageView), (4 & 4) != 0 ? 20.0f : 0.0f, (4 & 2) == 0 ? getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77910xe61cad91) : 0));
            return;
        }
        mn2.g1 g1Var = mn2.g1.f411508a;
        wo0.c b17 = g1Var.c().b(new mn2.e0(qVar.f390704b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), g1Var.h(mn2.f1.f411490h));
        lj2.f fVar = new lj2.f(this);
        b17.getClass();
        b17.f529410h = fVar;
        b17.f529409g = new lj2.g(this);
        b17.f529408f = new lj2.h(this);
        b17.c(imageView);
    }

    public void r(android.view.View view, android.widget.TextView textView, android.view.ViewGroup viewGroup) {
        if (view == null || textView == null || viewGroup == null) {
            return;
        }
        viewGroup.setBackgroundDrawable(mo124438x9f24d53a());
        textView.setTextColor(mo124441xc9b30e32());
        textView.setText(mo124440xe17957b1());
        if (viewGroup.getTranslationY() == 0.0f) {
            viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new lj2.i(viewGroup));
        }
    }

    public void s(android.widget.TextView textView) {
        jz5.f0 f0Var;
        java.lang.String mo124440xe17957b1 = mo124440xe17957b1();
        if (textView == null || mo124440xe17957b1 == null) {
            f0Var = null;
        } else {
            if (mo124440xe17957b1.length() > 0) {
                textView.setText(mo124440xe17957b1);
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var != null || textView == null) {
            return;
        }
        textView.setVisibility(8);
    }

    /* renamed from: setAnchorAudioMode */
    public final void m145854x6c0372a2(boolean z17) {
        this.f400410h = z17;
    }

    /* renamed from: setAnchorShareMode */
    public final void m145855x27ffa2b(boolean z17) {
    }

    /* renamed from: setBindLinkMicUser */
    public final void m145856xcb723c19(km2.q qVar) {
        this.f400408f = qVar;
    }

    /* renamed from: setBindMicData */
    public final void m145857x8d44edd2(xh2.a aVar) {
        this.f400409g = aVar;
    }

    /* renamed from: setCurWidgetMode */
    public final void m145858xc368f725(pm2.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "<set-?>");
        this.f400407e = aVar;
    }

    /* renamed from: setTAG */
    public final void m145859xca0293d8(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void t(android.widget.ImageView imageView) {
        km2.q qVar = this.f400408f;
        if (qVar == null || imageView == null) {
            return;
        }
        imageView.setVisibility(0);
        boolean S3 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.S3(qVar.f390705c);
        int i17 = 2;
        mn2.g1 g1Var = mn2.g1.f411508a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 y90Var = null;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        java.lang.Object[] objArr3 = 0;
        if (S3) {
            g1Var.a().c(new mn2.n(qVar.f390704b, y90Var, i17, objArr3 == true ? 1 : 0), imageView, g1Var.h(mn2.f1.f411490h));
        } else {
            g1Var.l().c(new mn2.n(qVar.f390704b, objArr2 == true ? 1 : 0, i17, objArr == true ? 1 : 0), imageView, g1Var.h(mn2.f1.f411494o));
        }
    }

    public final void u(android.widget.TextView textView) {
        km2.q qVar = this.f400408f;
        if (qVar == null || textView == null) {
            return;
        }
        textView.setText(zl2.r4.D0(zl2.r4.f555483a, qVar.f390705c, qVar.f390706d, false, 4, null));
    }
}
