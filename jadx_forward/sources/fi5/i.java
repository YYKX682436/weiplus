package fi5;

/* loaded from: classes3.dex */
public final class i extends dg3.k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // dg3.k
    public java.util.List W6(mf3.k info) {
        e60.t0 t0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        zh5.k0 k0Var = (zh5.k0) U6(zh5.k0.class);
        boolean z17 = (k0Var == null || (t0Var = ((zh5.e) k0Var).f554552d) == null) ? false : t0Var.f331271i;
        arrayList.add(new dg3.p(dg3.q.f313874e, com.p314xaae8f345.mm.R.C30867xcad56011.i29, com.p314xaae8f345.mm.R.raw.f79902x4225bfc7, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m)));
        if (info.mo2109xfb85f7b0() == mf3.u.f407656e) {
            if (z17) {
                arrayList.add(new dg3.p(dg3.q.f313879m, com.p314xaae8f345.mm.R.C30867xcad56011.hra, com.p314xaae8f345.mm.R.raw.f78691x7ae93edb, null));
            }
            arrayList.add(new dg3.p(dg3.q.f313876g, com.p314xaae8f345.mm.R.C30867xcad56011.hjg, com.p314xaae8f345.mm.R.raw.f78683x36757420, null));
        }
        return arrayList;
    }

    @Override // dg3.k
    public dg3.o X6(mf3.k info, mf3.p apiCenter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiCenter, "apiCenter");
        return info.mo2109xfb85f7b0() == mf3.u.f407656e ? new fi5.j(info, apiCenter) : super.X6(info, apiCenter);
    }

    @Override // dg3.k
    public java.util.List Y6(mf3.k info) {
        e60.t0 t0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        boolean booleanExtra = m158359x1e885992().getBooleanExtra("view_only", true);
        zh5.k0 k0Var = (zh5.k0) U6(zh5.k0.class);
        boolean z17 = (k0Var == null || (t0Var = ((zh5.e) k0Var).f554552d) == null) ? false : t0Var.f331270h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new dg3.p(dg3.q.f313875f, com.p314xaae8f345.mm.R.C30867xcad56011.i8c, com.p314xaae8f345.mm.R.raw.f80089x8164b1e0, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832)));
        if (info.mo2109xfb85f7b0() == mf3.u.f407656e) {
            arrayList.add(new dg3.p(dg3.q.f313877h, com.p314xaae8f345.mm.R.C30867xcad56011.b2d, com.p314xaae8f345.mm.R.raw.f80259x58c5ec65, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832)));
            if (z17) {
                arrayList.add(new dg3.p(dg3.q.f313878i, com.p314xaae8f345.mm.R.C30867xcad56011.b2f, com.p314xaae8f345.mm.R.raw.f80336x9bb432f6, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832)));
            }
            if (!booleanExtra) {
                arrayList.add(new dg3.p(dg3.q.f313880n, com.p314xaae8f345.mm.R.C30867xcad56011.f572589ne0, com.p314xaae8f345.mm.R.raw.f80075x444ae503, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832)));
            }
        }
        return arrayList;
    }
}
