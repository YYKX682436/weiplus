package wi2;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f527689a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f527690b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 f527691c;

    /* renamed from: d, reason: collision with root package name */
    public vi2.b f527692d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 f527693e;

    /* renamed from: f, reason: collision with root package name */
    public vi2.b f527694f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f527695g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f527696h;

    /* renamed from: i, reason: collision with root package name */
    public final wi2.a f527697i;

    public c(android.content.Context context, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, java.util.ArrayList dataList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        this.f527689a = recyclerView;
        this.f527690b = dataList;
        this.f527691c = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962(context);
        this.f527693e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962(context);
        this.f527695g = true;
        this.f527697i = new wi2.a(this);
    }

    public static final void a(wi2.c cVar) {
        in5.c cVar2;
        int i17;
        in5.c cVar3;
        int i18;
        if (!cVar.f527695g || !cVar.f527696h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorAutoPlayManager", "skip checkAutoPlay: shouldAutoPlay:" + cVar.f527695g + ", isBind:" + cVar.f527696h);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorAutoPlayManager", "stopAllPreviewView");
            cVar.e(cVar.f527691c, true);
            cVar.e(cVar.f527693e, true);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorAutoPlayManager", "checkAutoPlay start");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = cVar.f527689a;
        int height = c1163xf1deaba4.getHeight() / 2;
        int width = c1163xf1deaba4.getWidth() / 4;
        int width2 = (c1163xf1deaba4.getWidth() / 4) * 3;
        float f17 = height;
        android.view.View k07 = c1163xf1deaba4.k0(width, f17);
        java.lang.Integer valueOf = k07 != null ? java.lang.Integer.valueOf(c1163xf1deaba4.u0(k07)) : null;
        java.util.ArrayList arrayList = cVar.f527690b;
        if (valueOf != null && (valueOf.intValue() < 0 || valueOf.intValue() >= arrayList.size())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveMicAnchorAutoPlayManager", "Checking play left position: " + valueOf + " in " + arrayList.size() + " items");
            return;
        }
        if (valueOf != null) {
            valueOf.intValue();
            cVar2 = (in5.c) arrayList.get(valueOf.intValue());
        } else {
            cVar2 = null;
        }
        vi2.b bVar = cVar2 instanceof vi2.b ? (vi2.b) cVar2 : null;
        if (!(k07 == null)) {
            if (!(valueOf == null)) {
                if (!(bVar == null) && ((i17 = bVar.f519068e) == 6 || i17 == 9)) {
                    vi2.b bVar2 = cVar.f527694f;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar.f519077d, bVar2 != null ? bVar2.f519077d : null)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorAutoPlayManager", "swapping left and right views due to curConvertDataLeft.finderLiveContact == curPlayConvertDataRight?.finderLiveContact");
                        vi2.b bVar3 = cVar.f527694f;
                        cVar.f527694f = cVar.f527692d;
                        cVar.f527692d = bVar3;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd8962 = cVar.f527693e;
                        cVar.f527693e = cVar.f527691c;
                        cVar.f527691c = c14522x8ffd8962;
                    }
                    android.view.View k08 = c1163xf1deaba4.k0(width2, f17);
                    java.lang.Integer valueOf2 = k08 != null ? java.lang.Integer.valueOf(c1163xf1deaba4.u0(k08)) : null;
                    if (valueOf2 != null && (valueOf2.intValue() < 0 || valueOf2.intValue() >= arrayList.size())) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveMicAnchorAutoPlayManager", "Checking play right position: " + valueOf2 + " in " + arrayList.size() + " items");
                        return;
                    }
                    if (valueOf2 != null) {
                        valueOf2.intValue();
                        cVar3 = (in5.c) arrayList.get(valueOf2.intValue());
                    } else {
                        cVar3 = null;
                    }
                    vi2.b bVar4 = cVar3 instanceof vi2.b ? (vi2.b) cVar3 : null;
                    if (!(k08 == null)) {
                        if (!(valueOf2 == null)) {
                            if (!(bVar4 == null) && ((i18 = bVar4.f519068e) == 6 || i18 == 9)) {
                                vi2.b bVar5 = cVar.f527692d;
                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar4.f519077d, bVar5 != null ? bVar5.f519077d : null)) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorAutoPlayManager", "swapping left and right views due to curConvertDataRight.finderLiveContact == curPlayConvertDataLeft?.finderLiveContact");
                                    vi2.b bVar6 = cVar.f527694f;
                                    cVar.f527694f = cVar.f527692d;
                                    cVar.f527692d = bVar6;
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd89622 = cVar.f527693e;
                                    cVar.f527693e = cVar.f527691c;
                                    cVar.f527691c = c14522x8ffd89622;
                                }
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorAutoPlayManager", "starting play for both left and right views");
                                cVar.d(k07, cVar.f527691c, bVar, true);
                                cVar.d(k08, cVar.f527693e, bVar4, false);
                                return;
                            }
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorAutoPlayManager", "stop right  data:" + bVar4 + ' ');
                    cVar.e(cVar.f527693e, true);
                    cVar.d(k07, cVar.f527691c, bVar, true);
                    return;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorAutoPlayManager", "both stop data:" + bVar + " return for view:" + k07);
        cVar.e(cVar.f527691c, true);
        cVar.e(cVar.f527693e, true);
    }

    public final void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorAutoPlayManager", "bind manager，isBind:" + this.f527696h);
        if (this.f527696h) {
            return;
        }
        this.f527689a.i(this.f527697i);
        this.f527696h = true;
    }

    public final void c(boolean z17) {
        if (this.f527695g != z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorAutoPlayManager", "Auto play state changed from " + this.f527695g + " to " + z17);
        }
        this.f527695g = z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.view.View r14, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 r15, vi2.b r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wi2.c.d(android.view.View, com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView, vi2.b, boolean):void");
    }

    public final void e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd8962, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorAutoPlayManager", "stopPlayWithPreviewView for view:" + c14522x8ffd8962 + ", removeFromParent:" + z17);
        c14522x8ffd8962.mo58404x360802();
        c14522x8ffd8962.mo58389x41012807();
        c14522x8ffd8962.f203062m = null;
        if (z17) {
            android.view.ViewParent parent = c14522x8ffd8962.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(c14522x8ffd8962);
            }
        }
    }

    public final void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorAutoPlayManager", "unBind manager，isBind:" + this.f527696h);
        if (this.f527696h) {
            this.f527689a.V0(this.f527697i);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorAutoPlayManager", "stopAllPreviewView");
            e(this.f527691c, true);
            e(this.f527693e, true);
            this.f527696h = false;
        }
    }
}
