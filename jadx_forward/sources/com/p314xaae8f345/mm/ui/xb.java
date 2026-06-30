package com.p314xaae8f345.mm.ui;

/* loaded from: classes13.dex */
public final class xb extends android.view.ContextThemeWrapper {

    /* renamed from: a, reason: collision with root package name */
    public android.view.LayoutInflater f294082a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb(android.content.Context base, int i17) {
        super(base, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(base, "base");
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b("layout_inflater", name)) {
            return super.getSystemService(name);
        }
        if (this.f294082a == null) {
            java.lang.Object systemService = super.getSystemService(name);
            this.f294082a = com.p314xaae8f345.mm.ui.id.c(systemService instanceof android.view.LayoutInflater ? (android.view.LayoutInflater) systemService : null);
        }
        return this.f294082a;
    }
}
