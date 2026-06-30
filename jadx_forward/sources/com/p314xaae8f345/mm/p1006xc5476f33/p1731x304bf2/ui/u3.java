package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes8.dex */
public class u3 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f223319d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15971xe6741863 f223320e;

    public u3(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15971xe6741863 c15971xe6741863) {
        this.f223320e = c15971xe6741863;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f223319d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c) this.f223319d.get(i17)).f221768a;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.t3 t3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.t3) k3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c cVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c) this.f223319d.get(i17);
        if (cVar == null) {
            return;
        }
        int i18 = cVar.f221768a;
        if (i18 == 2000) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15962xc18ff45c) t3Var.f223296d).m64748x76491f2c(cVar);
            return;
        }
        switch (i18) {
            case 1:
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ViewOnClickListenerC15960x624858fd) t3Var.f223296d).m64746x76491f2c(cVar);
                return;
            case 2:
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ViewOnClickListenerC15969x690956d0) t3Var.f223296d).m64755xab2cf483(cVar);
                return;
            case 3:
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ViewOnClickListenerC15969x690956d0) t3Var.f223296d).m64754xcb0b5d38(cVar);
                return;
            case 4:
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ViewOnClickListenerC15961x3e2f671a) t3Var.f223296d).m64747x76491f2c(cVar);
                return;
            case 5:
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ViewOnClickListenerC15959x7b3d5841) t3Var.f223296d).m64745x76491f2c(cVar);
                return;
            case 6:
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ViewOnClickListenerC15964xf63325b1) t3Var.f223296d).m64750x76491f2c(cVar);
                return;
            default:
                switch (i18) {
                    case 8:
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ViewOnClickListenerC15958x327075c3) t3Var.f223296d).m64744x76491f2c(cVar);
                        return;
                    case 9:
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ViewOnClickListenerC15963x3ed7d5f2) t3Var.f223296d).m64749x76491f2c(cVar);
                        return;
                    case 10:
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ViewOnClickListenerC15965xf7560355) t3Var.f223296d).m64751x76491f2c(cVar);
                        return;
                    default:
                        switch (i18) {
                            case 1000:
                                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15942xb94ae91e) t3Var.f223296d).m64736x765074af(cVar.f221771d.f405727r.f405426e);
                                return;
                            case 1001:
                                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ViewOnClickListenerC15940x6a15e3d2) t3Var.f223296d).m64734x76491f2c(cVar);
                                return;
                            case 1002:
                                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ViewOnClickListenerC15941x3fc583cf) t3Var.f223296d).m64735x76491f2c(cVar);
                                return;
                            default:
                                return;
                        }
                }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        android.view.View inflate;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15971xe6741863 c15971xe6741863 = this.f223320e;
        if (i17 != 2000) {
            switch (i17) {
                case 1:
                    inflate = android.view.LayoutInflater.from(c15971xe6741863.f222388i2).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bfu, viewGroup, false);
                    break;
                case 2:
                case 3:
                    inflate = android.view.LayoutInflater.from(c15971xe6741863.f222388i2).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570681bg3, viewGroup, false);
                    break;
                case 4:
                    inflate = android.view.LayoutInflater.from(c15971xe6741863.f222388i2).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bfw, viewGroup, false);
                    break;
                case 5:
                    inflate = android.view.LayoutInflater.from(c15971xe6741863.f222388i2).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bft, viewGroup, false);
                    break;
                case 6:
                    inflate = android.view.LayoutInflater.from(c15971xe6741863.f222388i2).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bfz, viewGroup, false);
                    break;
                default:
                    switch (i17) {
                        case 8:
                            inflate = android.view.LayoutInflater.from(c15971xe6741863.f222388i2).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bfs, viewGroup, false);
                            break;
                        case 9:
                            inflate = android.view.LayoutInflater.from(c15971xe6741863.f222388i2).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bfy, viewGroup, false);
                            break;
                        case 10:
                            inflate = android.view.LayoutInflater.from(c15971xe6741863.f222388i2).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570678bg0, viewGroup, false);
                            break;
                        default:
                            switch (i17) {
                                case 1000:
                                    inflate = android.view.LayoutInflater.from(c15971xe6741863.f222388i2).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570668be2, viewGroup, false);
                                    break;
                                case 1001:
                                    inflate = android.view.LayoutInflater.from(c15971xe6741863.f222388i2).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570666be0, viewGroup, false);
                                    break;
                                case 1002:
                                    inflate = android.view.LayoutInflater.from(c15971xe6741863.f222388i2).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570667be1, viewGroup, false);
                                    break;
                                default:
                                    inflate = new android.widget.FrameLayout(c15971xe6741863.getContext());
                                    break;
                            }
                    }
            }
        } else {
            inflate = android.view.LayoutInflater.from(c15971xe6741863.f222388i2).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bfx, viewGroup, false);
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.t3(this, inflate);
    }
}
