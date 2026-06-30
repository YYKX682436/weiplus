package mh4;

/* loaded from: classes8.dex */
public final class a extends ph4.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ph4.f callback) {
        super(callback);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
    }

    @Override // ph4.j
    public int a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        return data.f66793x2262335f == 4 ? com.p314xaae8f345.mm.R.C30861xcebc809e.cfx : com.p314xaae8f345.mm.R.C30861xcebc809e.f563692cg0;
    }

    @Override // ph4.j
    public java.lang.String b(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c) {
        if (c16601x7ed0e40c == null) {
            return "";
        }
        if (c16601x7ed0e40c.f66793x2262335f == 4) {
            java.lang.String r17 = i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f571851rn);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getString(...)");
            return r17;
        }
        java.lang.String r18 = i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f571855rr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r18, "getString(...)");
        return r18;
    }

    @Override // ph4.j
    public void c(ph4.b viewHolder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        viewHolder.f435995e.setImageBitmap(null);
    }

    @Override // ph4.j
    public void d(int i17, ph4.b viewHolder, lh4.n viewModel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewModel, "viewModel");
        super.d(i17, viewHolder, viewModel);
        java.util.List list = viewModel.f400257d;
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) ((java.util.ArrayList) list).get(i17)).f66793x2262335f == 4) {
            jt.a0 a0Var = (jt.a0) i95.n0.c(jt.a0.class);
            java.lang.String m75945x2fec8307 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) ((java.util.ArrayList) list).get(i17)).v0().m75945x2fec8307(4);
            ((ht.s) a0Var).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.t3.n(m75945x2fec8307, false);
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.gb) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.c7) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.c7.class))).getClass();
        com.p314xaae8f345.mm.p2614xca6eae71.x1 Di = com.p314xaae8f345.mm.p2614xca6eae71.x1.Di();
        viewHolder.f3639x46306858.getContext();
        viewHolder.f435996f.setText(Di.Ri(((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) ((java.util.ArrayList) list).get(i17)).v0().m75945x2fec8307(1), true));
    }
}
