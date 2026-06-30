package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class le extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f216588d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.oe f216589e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f216590f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 f216591g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.oe oeVar, android.widget.TextView textView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 c15178x4303ff90) {
        super(1);
        this.f216588d = view;
        this.f216589e = oeVar;
        this.f216590f = textView;
        this.f216591g = c15178x4303ff90;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.oe oeVar = this.f216589e;
            this.f216588d.setBackgroundColor(oeVar.m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
            java.lang.String string = oeVar.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f2c);
            android.widget.TextView textView = this.f216590f;
            textView.setText(string);
            textView.setTextColor(oeVar.m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b));
        }
        this.f216591g.t("");
        return jz5.f0.f384359a;
    }
}
