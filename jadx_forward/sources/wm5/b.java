package wm5;

/* loaded from: classes10.dex */
public class b implements com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb {

    /* renamed from: a, reason: collision with root package name */
    public final wm5.a f528877a;

    public b(wm5.a filter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filter, "filter");
        this.f528877a = filter;
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb
    /* renamed from: createFilter */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb.Filter mo98526x44bdab94() {
        return this.f528877a;
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb
    /* renamed from: effectId */
    public java.lang.String mo98527xc35ea28c() {
        return "CompositionMixEffect_" + hashCode();
    }
}
