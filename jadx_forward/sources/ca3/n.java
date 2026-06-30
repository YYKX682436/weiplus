package ca3;

/* loaded from: classes13.dex */
public final class n implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMarkerClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.map.C16226x881c42e f121337a;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.map.C16226x881c42e c16226x881c42e) {
        this.f121337a = c16226x881c42e;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMarkerClickListener
    /* renamed from: onMarkerClick */
    public boolean mo14570x289a5e0f(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.map.C16226x881c42e c16226x881c42e = this.f121337a;
        java.util.Collection<ca3.b> values = c16226x881c42e.H.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        ca3.b bVar = null;
        for (ca3.b bVar2 : values) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar2.f121320c, interfaceC4409x88f1805a)) {
                bVar = bVar2;
            }
        }
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = c16226x881c42e.f225634e;
        if (c28688xe8dbe4c2 == null) {
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar);
        c28688xe8dbe4c2.m138438xd8c5c779("clickMarker", kz5.c1.i(new jz5.l("markerId", java.lang.Integer.valueOf(bVar.f121319b))));
        return true;
    }
}
