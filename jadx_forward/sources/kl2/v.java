package kl2;

/* loaded from: classes3.dex */
public final class v extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g {

    /* renamed from: h, reason: collision with root package name */
    public final yz5.l f390352h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.a f390353i;

    /* renamed from: m, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f390354m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f390355n;

    /* renamed from: o, reason: collision with root package name */
    public final kl2.s f390356o;

    /* renamed from: p, reason: collision with root package name */
    public r45.f82 f390357p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(android.content.Context context, yz5.l onSelect, yz5.a onCancel) {
        super(context, false, null, false, 12, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSelect, "onSelect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onCancel, "onCancel");
        this.f390352h = onSelect;
        this.f390353i = onCancel;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f390355n = linkedList;
        kl2.s sVar = new kl2.s(this, linkedList);
        this.f390356o = sVar;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f390354m;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context));
        c1163xf1deaba4.mo7960x6cab2c8d(sVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public android.view.View b() {
        return e();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ayh;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public java.lang.String o() {
        java.lang.String string = this.f199914d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ebh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.lqa);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f390354m = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void s() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void u() {
        a();
        this.f390353i.mo152xb9724478();
    }
}
