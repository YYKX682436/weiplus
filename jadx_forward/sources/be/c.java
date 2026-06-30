package be;

/* loaded from: classes7.dex */
public final class c extends be1.j {

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f100978c;

    static {
        new be.b(null);
        f100978c = jz5.h.b(be.a.f100977d);
    }

    @Override // be1.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public java.util.Map a(java.lang.String type, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y component) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        jz5.g gVar = f100978c;
        ((be.d) ((jz5.n) gVar).mo141623x754a37bb()).getClass();
        java.util.Map a17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b("windowInfo", type) ? ((be.d) ((jz5.n) gVar).mo141623x754a37bb()).a(type, component) : null;
        return a17 == null ? super.a(type, component) : a17;
    }
}
