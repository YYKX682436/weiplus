package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9;

/* loaded from: classes2.dex */
public final class b0 implements tj5.n {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f204846d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f204847e;

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f204848f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 f204849g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f204850h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f204851i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.z f204852m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.l f204853n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f204854o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 f204855p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f204856q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.w f204857r;

    /* renamed from: s, reason: collision with root package name */
    public long f204858s;

    public b0(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f204846d = context;
        this.f204850h = new java.util.LinkedList();
        this.f204851i = new java.util.LinkedList();
    }

    @Override // tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        if (str == null || str.length() == 0) {
            a();
        } else {
            b();
        }
    }

    @Override // tj5.n
    public boolean G0() {
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 m80997xdc5215a6;
        b();
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb92 = this.f204855p;
        if (c22482x50bddb92 == null || (m80997xdc5215a6 = c22482x50bddb92.m80997xdc5215a6()) == null) {
            return true;
        }
        m80997xdc5215a6.h();
        return true;
    }

    @Override // tj5.n
    public void U1(boolean z17) {
    }

    public final void a() {
        this.f204858s = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfilePoiListView", "[clearSearch] lastQueryTime=" + this.f204858s);
        java.util.LinkedList linkedList = this.f204850h;
        linkedList.clear();
        linkedList.addAll(this.f204851i);
        c(linkedList.size());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.z zVar = this.f204852m;
        if (zVar != null) {
            zVar.m8146xced61ae5();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
    }

    public final void b() {
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 m80997xdc5215a6;
        android.widget.EditText m80966xdb574fcd;
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb92 = this.f204855p;
        java.lang.String valueOf = java.lang.String.valueOf((c22482x50bddb92 == null || (m80997xdc5215a6 = c22482x50bddb92.m80997xdc5215a6()) == null || (m80966xdb574fcd = m80997xdc5215a6.m80966xdb574fcd()) == null) ? null : m80966xdb574fcd.getText());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.w wVar = this.f204857r;
        if (wVar != null) {
            java.lang.String str = this.f204856q;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.UserPoiHandler", "[requestPoiSearch] query=" + valueOf + ", finderUsername=" + str + " queryTime=" + currentTimeMillis);
            wVar.f(false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.C14871xa985f898 c14871xa985f898 = wVar.f205983g;
            if (c14871xa985f898 != null) {
                c14871xa985f898.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.t(valueOf, str, wVar, currentTimeMillis));
            }
        }
    }

    public final void c(int i17) {
        android.widget.TextView textView;
        android.view.View view = this.f204854o;
        if (view == null || (textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.d4v)) == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        android.content.res.Resources resources = textView.getContext().getResources();
        textView.setText(resources != null ? resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.eul, java.lang.Integer.valueOf(i17)) : null);
    }

    @Override // tj5.n
    public void o3(int i17, tj5.x xVar) {
    }

    @Override // tj5.n
    /* renamed from: onClickClearTextBtn */
    public void mo56570x81f2906b(android.view.View view) {
        a();
    }
}
