package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes8.dex */
public final class m implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final oy2.g f214149a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 f214150b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f214151c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f214152d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f214153e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.DialogInterface.OnDismissListener f214154f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.h f214155g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.C15492xb61be281 f214156h;

    public m(oy2.g dialog, java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dialog, "dialog");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        this.f214149a = dialog;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.h hVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.h(dialog, dialog.c());
        this.f214155g = hVar;
        android.content.Context context = dialog.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        r45.sn snVar = new r45.sn();
        snVar.f467384e = java.util.UUID.randomUUID().toString();
        snVar.f467385f = url;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.C15492xb61be281 c15492xb61be281 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.C15492xb61be281(context, snVar, null, 0, null, 28, null);
        c15492xb61be281.m63384xb4d53cda(dialog.getWindow());
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17262x2289077 c17262x2289077 = hVar.f213731h;
        if (c17262x2289077 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("codeMaskView");
            throw null;
        }
        c15492xb61be281.m63383x2008c240(c17262x2289077);
        this.f214156h = c15492xb61be281;
        c15492xb61be281.mo63358x80670f0d(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.k(this));
        this.f214150b = c15492xb61be281.mo63376x7be6c20d();
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.l(this));
        android.view.Window window = dialog.getWindow();
        if (window != null) {
            window.setWindowAnimations(com.p314xaae8f345.mm.R.C30868x68b1db1.f576215tb);
        }
        dialog.setOnDismissListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.i(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.f214150b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22633x83752a59);
        hVar.f213726c = c22633x83752a59;
        c22633x83752a59.D0(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.d(hVar));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.C15494xd57adead c15494xd57adead = hVar.f213725b;
        if (c15494xd57adead == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mWebViewContainer");
            throw null;
        }
        c15494xd57adead.addView(hVar.f213726c, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a592 = hVar.f213726c;
        if (c22633x83752a592 != null) {
            c22633x83752a592.mo120189xb61559a7(hVar.f213733j);
        }
        hVar.f213732i = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.j(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.n0
    public oy2.m a() {
        return this.f214149a;
    }
}
