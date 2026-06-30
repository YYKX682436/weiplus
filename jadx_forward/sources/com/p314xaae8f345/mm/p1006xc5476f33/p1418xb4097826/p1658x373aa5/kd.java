package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public class kd extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g {

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f214022h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f214023i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f214024m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f214025n;

    /* renamed from: o, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f214026o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.id f214027p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f214028q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f214029r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.l f214030s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd(android.content.Context context) {
        super(context, false, null, false, 12, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f214028q = "";
        this.f214029r = new java.util.ArrayList();
        this.f199917g.f526369c.b().setGravity(80);
        this.f199917g.f526369c.b().setWindowAnimations(com.p314xaae8f345.mm.R.C30868x68b1db1.f575607dp);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.aw7;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int l() {
        return (this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ld) ^ true ? 0 : 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public android.view.View m(android.view.ViewGroup root, zl2.u4 uiMode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiMode, "uiMode");
        zl2.w4 w4Var = zl2.w4.f555550a;
        android.content.Context context = this.f199914d;
        android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(from, "from(...)");
        return w4Var.b(com.p314xaae8f345.mm.R.C30864xbddafb2a.aw7, root, false, uiMode, context, from);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int n() {
        return (this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ld) ^ true ? 0 : 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        this.f214023i = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.qb9);
        this.f214024m = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.orf);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) rootView.findViewById(com.p314xaae8f345.mm.R.id.f565291bz2);
        this.f214025n = c22699x3dcdb352;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setVisibility((this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ld) ^ true ? 8 : 0);
        }
        this.f214026o = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) rootView.findViewById(com.p314xaae8f345.mm.R.id.q4c);
        android.content.Context context = this.f199914d;
        this.f214027p = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.id(this, context);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f214026o;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context));
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f214026o;
        if (c1163xf1deaba42 == null) {
            return;
        }
        c1163xf1deaba42.mo7960x6cab2c8d(this.f214027p);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public boolean r() {
        return !(this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ld);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void t() {
        super.t();
        yz5.a aVar = this.f214022h;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
