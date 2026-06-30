package oh4;

/* loaded from: classes8.dex */
public final class n extends ph4.j {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f427019b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ph4.f callback) {
        super(callback);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f427019b = "TaskBarSectionOtherViewMusicHelper";
    }

    @Override // ph4.j
    public int a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        return com.p314xaae8f345.mm.R.C30861xcebc809e.cfz;
    }

    @Override // ph4.j
    public java.lang.String b(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c) {
        java.lang.String r17 = i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f571854rq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getString(...)");
        return r17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [jz5.f0] */
    /* JADX WARN: Type inference failed for: r1v12, types: [wu5.c] */
    @Override // ph4.j
    public void d(int i17, ph4.b viewHolder, lh4.n viewModel) {
        java.lang.String m75945x2fec8307;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewModel, "viewModel");
        super.d(i17, viewHolder, viewModel);
        r45.rs4 rs4Var = new r45.rs4();
        try {
            rs4Var.mo11468x92b714fd(((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) ((java.util.ArrayList) viewModel.f400257d).get(i17)).f66790x225a93cf);
            viewHolder.f435994d.setVisibility(0);
            viewHolder.f435995e.setImageDrawable(null);
            r45.xs4 xs4Var = (r45.xs4) rs4Var.m75936x14adae67(0);
            if (xs4Var != null && (m75945x2fec8307 = xs4Var.m75945x2fec8307(13)) != null) {
                r45.xs4 xs4Var2 = (r45.xs4) rs4Var.m75936x14adae67(0);
                r3 = xs4Var2 != null ? xs4Var2.m75945x2fec8307(2) : null;
                if ((r3 == null || r3.length() == 0) && com.p314xaae8f345.mm.vfs.w6.j(m75945x2fec8307)) {
                    str = ((ku5.t0) ku5.t0.f394148d).a(new oh4.m(m75945x2fec8307, this, viewHolder, rs4Var));
                } else {
                    e(viewHolder, rs4Var);
                    str = jz5.f0.f384359a;
                }
                r3 = str;
            }
            if (r3 == null) {
                e(viewHolder, rs4Var);
            }
            viewHolder.f435996f.setText(((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) ((java.util.ArrayList) viewModel.f400257d).get(i17)).v0().m75945x2fec8307(1));
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f427019b, "MusicMultiTaskData parse failed");
        }
    }

    public final void e(ph4.b bVar, r45.rs4 rs4Var) {
        bVar.f435995e.setImageDrawable(null);
        r45.xs4 xs4Var = (r45.xs4) rs4Var.m75936x14adae67(0);
        java.lang.String m75945x2fec8307 = xs4Var != null ? xs4Var.m75945x2fec8307(2) : null;
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            m75945x2fec8307 = rs4Var.m75945x2fec8307(13);
        }
        if (m75945x2fec8307 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f427019b, "use url: ".concat(m75945x2fec8307));
            n11.a.b().h(m75945x2fec8307, bVar.f435995e, gh4.j0.f353466a);
        }
    }
}
