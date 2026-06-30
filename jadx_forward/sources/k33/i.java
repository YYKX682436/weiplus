package k33;

/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f385402a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e f385403b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1730x373aa5.C15674x2a0ac891 f385404c;

    public i(android.view.ViewGroup parent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        this.f385402a = jz5.h.b(k33.h.f385401d);
        android.view.ViewStub viewStub = (android.view.ViewStub) parent.findViewById(com.p314xaae8f345.mm.R.id.pwn);
        if (viewStub != null) {
            viewStub.setLayoutResource(a() ? com.p314xaae8f345.mm.R.C30864xbddafb2a.dck : com.p314xaae8f345.mm.R.C30864xbddafb2a.dcl);
        }
        android.view.View inflate = viewStub != null ? viewStub.inflate() : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImagePreviewViewPagerWrapper", "useMMViewPager: " + a());
        if (a()) {
            this.f385403b = inflate != null ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e) inflate.findViewById(com.p314xaae8f345.mm.R.id.ghs) : null;
        } else {
            this.f385404c = inflate != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1730x373aa5.C15674x2a0ac891) inflate.findViewById(com.p314xaae8f345.mm.R.id.ghs) : null;
        }
    }

    public final boolean a() {
        return ((java.lang.Boolean) this.f385402a.mo141623x754a37bb()).booleanValue();
    }

    public final void b(int i17, boolean z17) {
        if (a()) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e = this.f385403b;
            if (c21520x5bb48e5e != null) {
                c21520x5bb48e5e.m80846x940d026a(i17, z17, false);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1730x373aa5.C15674x2a0ac891 c15674x2a0ac891 = this.f385404c;
        if (c15674x2a0ac891 != null) {
            c15674x2a0ac891.m8317x940d026a(i17, z17);
        }
    }
}
