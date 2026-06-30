package xc5;

/* loaded from: classes3.dex */
public final class p1 extends dg3.k {

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f535082g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f535082g = jz5.h.b(xc5.o1.f535077d);
    }

    @Override // dg3.k
    public java.util.List W6(mf3.k info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new dg3.p(dg3.q.f313874e, com.p314xaae8f345.mm.R.C30867xcad56011.i29, com.p314xaae8f345.mm.R.raw.f79902x4225bfc7, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m)));
        if (info.mo2109xfb85f7b0() == mf3.u.f407656e || info.mo2109xfb85f7b0() == mf3.u.f407658g) {
            arrayList.add(new dg3.p(dg3.q.f313876g, com.p314xaae8f345.mm.R.C30867xcad56011.hjg, com.p314xaae8f345.mm.R.raw.f78683x36757420, null));
        }
        return arrayList;
    }

    @Override // dg3.k
    public dg3.o X6(mf3.k info, mf3.p apiCenter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiCenter, "apiCenter");
        return new xc5.a2(info, apiCenter, new xc5.n1(this));
    }

    @Override // dg3.k
    public java.util.List Y6(mf3.k info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        dg3.q qVar = dg3.q.f313875f;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832);
        arrayList.add(new dg3.p(qVar, com.p314xaae8f345.mm.R.C30867xcad56011.i8c, com.p314xaae8f345.mm.R.raw.f80089x8164b1e0, valueOf));
        if (info.mo2109xfb85f7b0() == mf3.u.f407656e) {
            arrayList.add(new dg3.p(dg3.q.f313877h, com.p314xaae8f345.mm.R.C30867xcad56011.b2d, com.p314xaae8f345.mm.R.raw.f80259x58c5ec65, valueOf));
            arrayList.add(new dg3.p(dg3.q.f313878i, com.p314xaae8f345.mm.R.C30867xcad56011.b2f, com.p314xaae8f345.mm.R.raw.f80336x9bb432f6, valueOf));
        }
        jz5.g gVar = this.f535082g;
        arrayList.add(new dg3.p(dg3.q.f313882p, com.p314xaae8f345.mm.R.C30867xcad56011.b2b, ((java.lang.Boolean) ((jz5.n) gVar).mo141623x754a37bb()).booleanValue() ? com.p314xaae8f345.mm.R.raw.f79976xc548acd1 : com.p314xaae8f345.mm.R.raw.f80047x8e8a2dc3, valueOf));
        arrayList.add(new dg3.p(dg3.q.f313881o, ((java.lang.Boolean) ((jz5.n) gVar).mo141623x754a37bb()).booleanValue() ? com.p314xaae8f345.mm.R.C30867xcad56011.o_2 : com.p314xaae8f345.mm.R.C30867xcad56011.n7s, ((java.lang.Boolean) ((jz5.n) gVar).mo141623x754a37bb()).booleanValue() ? com.p314xaae8f345.mm.R.raw.f79964x5675008a : com.p314xaae8f345.mm.R.raw.f79861x621aa2e4, valueOf));
        return arrayList;
    }
}
