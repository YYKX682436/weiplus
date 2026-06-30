package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3;

/* loaded from: classes2.dex */
public final class u extends hx2.i {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f211237b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View.OnClickListener f211238c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f211239d;

    public u(android.content.Context context, android.view.View.OnClickListener backClickListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(backClickListener, "backClickListener");
        this.f211237b = context;
        this.f211238c = backClickListener;
    }

    @Override // hx2.i
    public android.view.View a() {
        if (this.f211239d == null) {
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(this.f211237b).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dq7, (android.view.ViewGroup) null);
            this.f211239d = inflate;
            android.view.View findViewById = inflate != null ? inflate.findViewById(com.p314xaae8f345.mm.R.id.bzb) : null;
            if (findViewById != null) {
                findViewById.setOnClickListener(this.f211238c);
            }
        }
        return this.f211239d;
    }
}
