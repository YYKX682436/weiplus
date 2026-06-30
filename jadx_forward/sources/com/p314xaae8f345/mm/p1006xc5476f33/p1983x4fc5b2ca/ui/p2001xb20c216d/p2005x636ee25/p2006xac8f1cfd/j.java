package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f237794a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f237795b;

    /* renamed from: c, reason: collision with root package name */
    public long f237796c;

    /* renamed from: d, reason: collision with root package name */
    public long f237797d;

    /* renamed from: e, reason: collision with root package name */
    public long f237798e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.C17062x96def0f0 f237799f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f237800g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f237801h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f237802i;

    /* renamed from: j, reason: collision with root package name */
    public final yz5.l f237803j;

    /* renamed from: k, reason: collision with root package name */
    public yz5.p f237804k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f237805l;

    public j(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f237794a = context;
        this.f237803j = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.g(this);
    }

    public final void a() {
        android.widget.TextView textView = this.f237800g;
        xv3.b bVar = xv3.b.f538963a;
        if (textView != null) {
            textView.setText(bVar.a((int) (this.f237797d / 1000)));
        }
        android.widget.TextView textView2 = this.f237801h;
        if (textView2 == null) {
            return;
        }
        textView2.setText(bVar.a((int) ((this.f237798e - this.f237797d) / 1000)));
    }
}
