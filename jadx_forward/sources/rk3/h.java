package rk3;

/* loaded from: classes8.dex */
public final class h implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rk3.i f478053d;

    public h(rk3.i iVar) {
        this.f478053d = iVar;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
        jk3.e eVar;
        jk3.e eVar2;
        rk3.i iVar = this.f478053d;
        if (i17 == 1 && iVar.f478058e == 0 && (eVar2 = iVar.f478056c) != null) {
            eVar2.j();
        }
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1898x2e06d1.C16606xc6010f80 c16606xc6010f80 = iVar.f478055b;
            if (c16606xc6010f80 != null && c16606xc6010f80.m80830xfda78ef6() == 1) {
                try {
                    android.widget.FrameLayout frameLayout = iVar.f478057d;
                    if (frameLayout != null && (eVar = iVar.f478056c) != null) {
                        eVar.g(eVar != null ? eVar.h(uj5.g.d(frameLayout, (int) (frameLayout.getWidth() / 1.0f), (int) (frameLayout.getHeight() / 1.0f), true, android.graphics.Bitmap.Config.RGB_565)) : null);
                    }
                } catch (java.lang.Throwable th6) {
                    iVar.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTaskWrapper", "snapshot bitmap failed", th6);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1898x2e06d1.C16606xc6010f80 c16606xc6010f802 = iVar.f478055b;
                if (c16606xc6010f802 != null) {
                    c16606xc6010f802.m78873x6e5cce43(false);
                }
                jk3.e eVar3 = iVar.f478056c;
                if (eVar3 != null) {
                    eVar3.k();
                }
            }
        }
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageSelected */
    public void mo8333x510f45c9(int i17) {
        this.f478053d.f478058e = i17;
    }
}
