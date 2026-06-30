package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd;

/* loaded from: classes5.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final oa.i f237824a;

    /* renamed from: b, reason: collision with root package name */
    public final int f237825b;

    /* renamed from: c, reason: collision with root package name */
    public final int f237826c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f237827d;

    public m0(android.content.Context context, oa.i tab, int i17, int i18, java.lang.String titleName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tab, "tab");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(titleName, "titleName");
        this.f237824a = tab;
        this.f237825b = i17;
        this.f237826c = i18;
        tab.f425311a = this;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570861dd0, (android.view.ViewGroup) null);
        tab.d(inflate);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.nuw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.f237827d = textView;
        textView.setText(titleName);
        com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
    }

    public final void a(boolean z17) {
        int i17 = z17 ? com.p314xaae8f345.mm.R.C30859x5a72f63.aca : com.p314xaae8f345.mm.R.C30859x5a72f63.acb;
        android.widget.TextView textView = this.f237827d;
        textView.setTextColor(i65.a.d(textView.getContext(), i17));
    }

    /* renamed from: toString */
    public java.lang.String m68364x9616526c() {
        return "MusicPickerTabItem(tabType=" + this.f237825b + ", tabIndex=" + this.f237826c + ')';
    }
}
