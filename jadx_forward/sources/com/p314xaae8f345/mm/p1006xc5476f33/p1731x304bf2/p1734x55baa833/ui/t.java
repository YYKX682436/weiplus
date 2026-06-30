package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui;

/* loaded from: classes5.dex */
public final class t extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f220391d;

    /* renamed from: e, reason: collision with root package name */
    public final long f220392e;

    /* renamed from: f, reason: collision with root package name */
    public final long f220393f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f220394g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.s f220395h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f220396i;

    public t(java.lang.String chatroomName, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatroomName, "chatroomName");
        this.f220391d = chatroomName;
        this.f220392e = j17;
        this.f220393f = j18;
        this.f220394g = new java.util.ArrayList();
        this.f220396i = new java.util.HashMap();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return ((java.util.ArrayList) this.f220394g).size();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b6  */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r23, int r24) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.t.mo864xe5e2e48d(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bgz, (android.view.ViewGroup) null, false);
        int i18 = com.p314xaae8f345.mm.R.id.f566576gc3;
        android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f566576gc3);
        if (textView != null) {
            i18 = com.p314xaae8f345.mm.R.id.hke;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.hke);
            if (c22628xfde5d61d != null) {
                i18 = com.p314xaae8f345.mm.R.id.hyq;
                android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.hyq);
                if (relativeLayout != null) {
                    i18 = com.p314xaae8f345.mm.R.id.okz;
                    android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.okz);
                    if (textView2 != null) {
                        i18 = com.p314xaae8f345.mm.R.id.oog;
                        android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.oog);
                        if (textView3 != null) {
                            i18 = com.p314xaae8f345.mm.R.id.oqm;
                            android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.oqm);
                            if (textView4 != null) {
                                return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.v(new x33.f((android.widget.RelativeLayout) inflate, textView, c22628xfde5d61d, relativeLayout, textView2, textView3, textView4), this.f220391d, this.f220392e, this.f220393f);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i18)));
    }

    public final void x(java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        java.util.List a17 = e43.e.f330894a.a(list);
        java.util.List list2 = this.f220394g;
        ((java.util.ArrayList) list2).clear();
        ((java.util.ArrayList) list2).addAll(a17);
        this.f220396i.clear();
        m8146xced61ae5();
    }
}
