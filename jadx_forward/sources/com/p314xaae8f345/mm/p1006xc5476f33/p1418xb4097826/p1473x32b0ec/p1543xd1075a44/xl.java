package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes15.dex */
public final class xl implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14400x1527540f f201890d;

    public xl(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14400x1527540f c14400x1527540f) {
        this.f201890d = c14400x1527540f;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14400x1527540f c14400x1527540f = this.f201890d;
        if (i17 == 1 || i17 == 2) {
            c14400x1527540f.h();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14410xbcb3c9ec c14410xbcb3c9ec = c14400x1527540f.f199176f;
        if (c14410xbcb3c9ec == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
            throw null;
        }
        int m8300xfda78ef6 = c14410xbcb3c9ec.m8300xfda78ef6();
        if (c14400x1527540f.e()) {
            if (m8300xfda78ef6 == c14400x1527540f.f199182o.size() - 1) {
                c14400x1527540f.f199178h.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ul(c14400x1527540f));
            } else if (m8300xfda78ef6 == 0) {
                c14400x1527540f.f199179i.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.vl(c14400x1527540f));
            }
        }
        c14400x1527540f.g();
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f201890d.f199174d, "[onPageScrolled] position:" + i17 + ", positionOffset:" + f17 + ", positionOffsetPixels:" + i18 + ", ");
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageSelected */
    public void mo8333x510f45c9(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14400x1527540f c14400x1527540f = this.f201890d;
        java.util.Iterator it = c14400x1527540f.f199182o.iterator();
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                if (i17 == c14400x1527540f.f199182o.size() - 2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14400x1527540f.b(c14400x1527540f);
                    return;
                } else {
                    if (i17 == 1) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14400x1527540f.a(c14400x1527540f);
                        return;
                    }
                    return;
                }
            }
            java.lang.Object next = it.next();
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.view.KeyEvent.Callback callback = (android.view.View) next;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yl ylVar = callback instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yl ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yl) callback : null;
            if (ylVar != null) {
                ylVar.j(i18 == i17);
            }
            i18 = i19;
        }
    }
}
