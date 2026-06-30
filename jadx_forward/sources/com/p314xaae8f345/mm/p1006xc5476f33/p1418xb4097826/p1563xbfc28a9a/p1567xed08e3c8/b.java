package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8;

/* loaded from: classes2.dex */
public final class b extends eo2.i {

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f202705r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f202705r = "";
    }

    @Override // eo2.i
    public v92.g W6() {
        return new fo2.e(m158354x19263085(), this.f202705r);
    }

    @Override // eo2.i
    public java.lang.String X6() {
        r45.tr0 tr0Var = (r45.tr0) this.f337113d;
        java.lang.String str = tr0Var != null ? tr0Var.f468257e : null;
        return str == null ? "" : str;
    }

    @Override // eo2.i, eo2.j, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        super.mo450x3e5a77bb(bundle);
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("key_author_finder_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f202705r = stringExtra;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f202705r = "";
    }
}
