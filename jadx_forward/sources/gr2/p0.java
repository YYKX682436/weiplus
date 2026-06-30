package gr2;

/* loaded from: classes2.dex */
public class p0 implements cr2.z {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f356338a;

    /* renamed from: b, reason: collision with root package name */
    public final dr2.c f356339b;

    /* renamed from: c, reason: collision with root package name */
    public final int f356340c;

    /* renamed from: d, reason: collision with root package name */
    public final int f356341d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f356342e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78 f356343f;

    /* renamed from: g, reason: collision with root package name */
    public zq2.c f356344g;

    /* renamed from: h, reason: collision with root package name */
    public int f356345h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1597x373aa5.C14573x2cf8777 f356346i;

    /* renamed from: j, reason: collision with root package name */
    public final gr2.n0 f356347j;

    /* JADX WARN: Type inference failed for: r3v5, types: [com.tencent.mm.plugin.finder.nearby.ui.special.view.ThemeLivingViewPagerWidget$themeTagChangEvent$1] */
    public p0(final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, dr2.c outsideOperator, float f17, int i17, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i18 = (i19 & 16) != 0 ? 0 : i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outsideOperator, "outsideOperator");
        this.f356338a = context;
        this.f356339b = outsideOperator;
        this.f356340c = i17;
        this.f356341d = i18;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f356342e = linkedList;
        this.f356345h = -1;
        this.f356346i = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5685xa20ebe4d>(context) { // from class: com.tencent.mm.plugin.finder.nearby.ui.special.view.ThemeLivingViewPagerWidget$themeTagChangEvent$1
            {
                this.f39173x3fe91575 = 1093141053;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5685xa20ebe4d c5685xa20ebe4d) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5685xa20ebe4d event = c5685xa20ebe4d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("receive themeTagChangEvent: ");
                am.bj bjVar = event.f136011g;
                sb6.append(bjVar != null ? java.lang.Integer.valueOf(bjVar.f87790a) : null);
                sb6.append(" pos: ");
                sb6.append(bjVar != null ? java.lang.Integer.valueOf(bjVar.f87791b) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ThemeLivingViewPagerConvert", sb6.toString());
                if (bjVar.f87790a != 1) {
                    return false;
                }
                int i27 = bjVar.f87791b;
                gr2.p0 p0Var = gr2.p0.this;
                p0Var.getClass();
                pm0.v.X(new gr2.o0(i27, p0Var));
                p0Var.f356345h = i27;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ThemeLivingViewPagerConvert", "onSelectThemeTag pos: " + i27);
                return true;
            }
        };
        this.f356347j = new gr2.n0(this, context, linkedList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    public final void a(android.app.Activity rootView, zq2.c item) {
        java.lang.String str;
        int i17;
        gr2.p0 p0Var;
        ?? r152;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78 c15359x536ace78;
        int i18;
        r45.uz2 uz2Var;
        gr2.p0 p0Var2 = this;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p0Var2.f356344g = item;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int size = item.f556563f.size();
        java.lang.String str3 = "";
        int i19 = 2;
        int i27 = 0;
        int i28 = 1;
        r45.fa2 fa2Var = item.f556562e;
        if (size > 0) {
            int i29 = 0;
            for (java.lang.Object obj : item.f556563f) {
                int i37 = i29 + 1;
                if (i29 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                zq2.e eVar = (zq2.e) obj;
                java.lang.String str4 = item.f556561d;
                java.lang.String m75945x2fec8307 = eVar.f556565d.m75945x2fec8307(i28);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = str3;
                }
                r45.id2 id2Var = eVar.f556565d;
                java.lang.String m75945x2fec83072 = id2Var.m75945x2fec8307(i27);
                if (m75945x2fec83072 == null) {
                    m75945x2fec83072 = str3;
                }
                int m75939xb282bd08 = id2Var.m75939xb282bd08(i19);
                int i38 = fa2Var.f455658d;
                r45.u80 u80Var = new r45.u80();
                u80Var.set(i27, java.lang.Integer.valueOf(fa2Var.f455658d));
                u80Var.set(i28, fa2Var.f455665n);
                u80Var.m75941xfb821914(2).addAll(item.g());
                linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1596x9da2e250.C14568x797587ad(new er2.a(i29, str4, m75945x2fec8307, m75945x2fec83072, m75939xb282bd08, i38, u80Var, this, p0Var2.f356340c, p0Var2.f356341d)));
                i28 = 1;
                i19 = 2;
                fa2Var = fa2Var;
                i27 = 0;
                i29 = i37;
                str3 = str3;
                p0Var2 = this;
            }
            str = str3;
            p0Var = this;
            r152 = i28;
            i17 = i19;
        } else {
            str = "";
            java.lang.String str5 = item.f556561d;
            r45.uz2 uz2Var2 = fa2Var.f455668q;
            java.lang.String str6 = (uz2Var2 == null || (str2 = uz2Var2.f469281e) == null) ? str : str2;
            int i39 = fa2Var.f455659e;
            int i47 = fa2Var.f455658d;
            r45.u80 u80Var2 = new r45.u80();
            u80Var2.set(0, java.lang.Integer.valueOf(fa2Var.f455658d));
            u80Var2.set(1, fa2Var.f455665n);
            i17 = 2;
            u80Var2.m75941xfb821914(2).addAll(item.g());
            p0Var = this;
            r152 = 1;
            linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1596x9da2e250.C14568x797587ad(new er2.a(0, str5, str6, "", i39, i47, u80Var2, this, p0Var.f356340c, p0Var.f356341d)));
        }
        java.util.LinkedList linkedList2 = p0Var.f356342e;
        linkedList2.clear();
        linkedList2.addAll(linkedList);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78 c15359x536ace782 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78) rootView.findViewById(com.p314xaae8f345.mm.R.id.f569103p16);
        if (c15359x536ace782 != 0) {
            c15359x536ace782.m62442xecae6946(r152);
            c15359x536ace782.m8321x40341e13(i17);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = p0Var.f356338a;
            p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d mo7595x9cdc264 = abstractActivityC21394xb3d2c0cf.mo7595x9cdc264();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo7595x9cdc264, "getSupportFragmentManager(...)");
            c15359x536ace782.m8315x6cab2c8d(new dq2.c(mo7595x9cdc264, linkedList2, 0));
            gr2.n0 n0Var = p0Var.f356347j;
            c15359x536ace782.m8289xa5a25773(n0Var);
            int intValue = ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.D2().r()).intValue();
            if (intValue > 0) {
                try {
                    java.lang.reflect.Field declaredField = p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.class.getDeclaredField("mScroller");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredField, "getDeclaredField(...)");
                    declaredField.setAccessible(r152);
                    declaredField.set(c15359x536ace782, new hc2.h1(abstractActivityC21394xb3d2c0cf, intValue));
                } catch (java.lang.Exception e17) {
                    i18 = 0;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("ViewPagerExt", e17, str, new java.lang.Object[0]);
                }
            }
            i18 = 0;
            p012xc85e97e9.p114xa324943e.p115xd1075a44.a m8299xf939df19 = c15359x536ace782.m8299xf939df19();
            if (m8299xf939df19 != null) {
                m8299xf939df19.mo8343xced61ae5();
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
            zq2.c cVar = p0Var.f356344g;
            if (cVar != null) {
                r45.fa2 fa2Var2 = cVar.f556562e;
                java.lang.String str7 = (fa2Var2 == null || (uz2Var = fa2Var2.f455668q) == null) ? null : uz2Var.f469281e;
                int i48 = i18;
                for (java.lang.Object obj2 : cVar.f556563f) {
                    int i49 = i48 + 1;
                    if (i48 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((zq2.e) obj2).f556565d.m75945x2fec8307(r152), str7)) {
                        f0Var.f391649d = i48;
                    }
                    i48 = i49;
                }
            }
            int i57 = f0Var.f391649d;
            if (i57 > 0) {
                pm0.v.V(50L, new gr2.m0(f0Var, p0Var));
                c15359x536ace78 = c15359x536ace782;
            } else {
                n0Var.mo8333x510f45c9(i57);
                c15359x536ace78 = c15359x536ace782;
            }
        } else {
            c15359x536ace78 = null;
        }
        p0Var.f356343f = c15359x536ace78;
        p0Var.f356346i.mo48813x58998cd();
    }
}
