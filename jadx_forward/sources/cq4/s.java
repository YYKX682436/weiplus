package cq4;

/* loaded from: classes10.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18833x82cf22d f303018d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18833x82cf22d c18833x82cf22d) {
        super(2);
        this.f303018d = c18833x82cf22d;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj).intValue();
        kp4.a info = (kp4.a) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        if (!info.e() && info.f392612i >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18833x82cf22d c18833x82cf22d = this.f303018d;
            cq4.t onSelectCallback = c18833x82cf22d.getOnSelectCallback();
            if (onSelectCallback != null) {
                int i17 = info.f392612i;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("EDIT_VLOG_SELECT_TRACK", i17);
                ((bp4.c4) onSelectCallback).f104669a.w(ju3.c0.f383407e2, bundle);
            }
            c18833x82cf22d.H = info.f392612i;
            c18833x82cf22d.F = info.c();
            c18833x82cf22d.G = info.a();
            c18833x82cf22d.f257669g.y(info.f392612i);
        }
        return jz5.f0.f384359a;
    }
}
