package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd;

/* loaded from: classes5.dex */
public abstract class b extends fv3.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f237700f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f237701g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.view.ViewGroup parent, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.j0 status) {
        super(status, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f237700f = parent;
        android.content.Context context = parent.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f237701g = context;
    }

    public final android.view.View n(int i17) {
        return this.f237700f.findViewById(i17);
    }
}
