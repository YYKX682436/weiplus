package kv3;

/* loaded from: classes5.dex */
public final class g implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kv3.h f394210d;

    public g(kv3.h hVar) {
        this.f394210d = hVar;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageSelected */
    public void mo8333x510f45c9(int i17) {
        kv3.h hVar = this.f394210d;
        java.lang.Object obj = hVar.K.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2009xb4097826.p2010x9da2e250.C17075xed501c65 c17075xed501c65 = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2009xb4097826.p2010x9da2e250.C17075xed501c65) obj;
        java.lang.String str = hVar.I;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(hVar.M, c17075xed501c65)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2009xb4097826.p2010x9da2e250.C17075xed501c65 c17075xed501c652 = hVar.M;
        c17075xed501c65.M0();
        hVar.M = c17075xed501c65;
    }
}
