package w;

/* loaded from: classes16.dex */
public final class h extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 {

    /* renamed from: b2, reason: collision with root package name */
    public final java.util.List f523357b2;

    /* renamed from: c2, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f523358c2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context, java.util.List cellItems) {
        super(context, false, null, -1.0f, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cellItems, "cellItems");
        this.f523357b2 = cellItems;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e9u;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public java.lang.String L() {
        java.lang.String string = this.f199716e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oql);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        android.content.Context context = this.f199716e;
        a0(context.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.clh));
        Y(com.p314xaae8f345.mm.R.C30859x5a72f63.f560023b);
        d0();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) rootView.findViewById(com.p314xaae8f345.mm.R.id.suu);
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context));
        java.lang.String e17 = xy2.c.e(context);
        java.util.List<qe2.c> list = this.f523357b2;
        for (qe2.c cVar : list) {
            if (cVar.f443568a.length() > 0) {
                boolean z17 = e17.length() > 0;
                java.lang.String str = cVar.f443568a;
                if (z17 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, e17)) {
                    cVar.f443573f = true;
                }
                ya2.b2 b17 = ya2.h.f542017a.b(str);
                if (b17 != null) {
                    int i17 = b17.f69313xcad4ef95;
                    l75.e0 e0Var = ya2.b2.O2;
                    cVar.f443571d = i17 == ya2.b2.Q2;
                    if (cVar.f443570c.length() == 0) {
                        java.lang.String str2 = b17.f69301x81118c51;
                        if (!(str2 == null || str2.length() == 0)) {
                            java.lang.String field_avatarUrl = b17.f69301x81118c51;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_avatarUrl, "field_avatarUrl");
                            cVar.f443570c = field_avatarUrl;
                        }
                    }
                    if (cVar.f443572e == null && (c19780xceb4c4dc = b17.f69300x731cac1b) != null) {
                        cVar.f443572e = c19780xceb4c4dc;
                    }
                }
            }
        }
        final qe2.b bVar = new qe2.b(context, list, this);
        c1163xf1deaba4.mo7960x6cab2c8d(bVar);
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be>(a0Var) { // from class: com.tencent.mm.plugin.finder.live.coauthor.FinderLiveCoAuthorSheet$CoAuthorSheetPanel$initContentView$listener$1
            {
                this.f39173x3fe91575 = 398763182;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be c5560x6f070be) {
                am.zd zdVar;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be event = c5560x6f070be;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                w.h hVar = w.h.this;
                java.util.Iterator it = hVar.f523357b2.iterator();
                int i18 = 0;
                while (true) {
                    boolean hasNext = it.hasNext();
                    zdVar = event.f135879g;
                    if (!hasNext) {
                        i18 = -1;
                        break;
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((qe2.c) it.next()).f443568a, zdVar.f90084a)) {
                        break;
                    }
                    i18++;
                }
                if (i18 != -1) {
                    int i19 = zdVar.f90085b;
                    if (!(i19 == 4 || i19 == 1)) {
                        if (i19 != 5 && i19 != 2) {
                            r4 = false;
                        }
                        r4 = r4 ? false : true;
                    }
                    ((qe2.c) hVar.f523357b2.get(i18)).f443571d = r4;
                    pm0.v.X(new w.g(bVar, i18));
                }
                return false;
            }
        };
        abstractC20980x9b9ad01d.mo48813x58998cd();
        this.f523358c2 = abstractC20980x9b9ad01d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void S() {
        super.S();
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f523358c2;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
        this.f523358c2 = null;
    }
}
