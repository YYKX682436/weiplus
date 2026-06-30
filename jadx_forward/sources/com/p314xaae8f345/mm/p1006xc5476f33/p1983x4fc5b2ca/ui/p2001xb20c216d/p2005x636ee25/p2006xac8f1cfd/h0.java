package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd;

/* loaded from: classes5.dex */
public class h0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.b {

    /* renamed from: h, reason: collision with root package name */
    public final int[] f237767h;

    /* renamed from: i, reason: collision with root package name */
    public final int f237768i;

    /* renamed from: m, reason: collision with root package name */
    public final yz5.l f237769m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f237770n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f237771o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.AbstractC17080x95c906ad f237772p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f237773q;

    /* renamed from: r, reason: collision with root package name */
    public final p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener f237774r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(android.view.ViewGroup parent, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.j0 status, int[] tabTypeArray, int i17, yz5.l fragmentCreator) {
        super(parent, status);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabTypeArray, "tabTypeArray");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragmentCreator, "fragmentCreator");
        this.f237767h = tabTypeArray;
        this.f237768i = i17;
        this.f237769m = fragmentCreator;
        this.f237770n = "MicroMsg.MusicPagerComponent[" + hashCode() + ']';
        this.f237771o = new java.util.ArrayList();
        this.f237773q = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.f0(this, parent));
        this.f237774r = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.g0(this, status);
    }

    @Override // fv3.b
    public void m() {
        java.util.ArrayList arrayList;
        int[] tabTypeArray = this.f237767h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabTypeArray, "tabTypeArray");
        int length = tabTypeArray.length;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            arrayList = this.f237771o;
            if (i17 >= length) {
                break;
            }
            int i27 = tabTypeArray[i17];
            int i28 = i18 + 1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.AbstractC17080x95c906ad abstractC17080x95c906ad = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.AbstractC17080x95c906ad) this.f237769m.mo146xb9724478(java.lang.Integer.valueOf(i27));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f237770n, "initViewPager index:" + i18 + " type:" + i27 + " fragment:" + abstractC17080x95c906ad);
            arrayList.add(new jz5.l(java.lang.Integer.valueOf(i27), abstractC17080x95c906ad));
            if (i27 == this.f237768i) {
                this.f237772p = abstractC17080x95c906ad;
                i19 = i18;
            }
            i17++;
            i18 = i28;
        }
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe q17 = q();
        if (q17 != null) {
            android.content.Context context = this.f237701g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d mo7595x9cdc264 = ((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).mo7595x9cdc264();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo7595x9cdc264, "getSupportFragmentManager(...)");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.AbstractC17080x95c906ad) ((jz5.l) it.next()).f384367e);
            }
            q17.m8315x6cab2c8d(new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.l0(mo7595x9cdc264, arrayList2));
        }
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe q18 = q();
        if (q18 != null) {
            q18.m8321x40341e13(tabTypeArray.length - 1);
        }
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe q19 = q();
        if (q19 != null) {
            q19.m8289xa5a25773(this.f237774r);
        }
        if (i19 >= 0) {
            q().m8316x940d026a(i19);
        }
    }

    public final p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 o(int i17) {
        java.lang.Object obj;
        java.util.Iterator it = this.f237771o.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((java.lang.Number) ((jz5.l) obj).f384366d).intValue() == i17) {
                break;
            }
        }
        jz5.l lVar = (jz5.l) obj;
        if (lVar != null) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.AbstractC17080x95c906ad) lVar.f384367e;
        }
        return null;
    }

    public final p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe q() {
        return (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) ((jz5.n) this.f237773q).mo141623x754a37bb();
    }

    public void r(int i17) {
    }
}
