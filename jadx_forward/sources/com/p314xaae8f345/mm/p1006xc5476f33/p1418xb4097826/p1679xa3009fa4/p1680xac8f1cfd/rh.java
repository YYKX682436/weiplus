package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class rh implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.th f217330d;

    public rh(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.th thVar) {
        this.f217330d = thVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.th thVar = this.f217330d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = thVar.f217558d;
        int mo1894x7e414b06 = (c1163xf1deaba42 == null || (mo7946xf939df19 = c1163xf1deaba42.mo7946xf939df19()) == null) ? 0 : mo7946xf939df19.mo1894x7e414b06();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FullFeedGuideUIC", "[videoComplete] count=" + mo1894x7e414b06);
        if (mo1894x7e414b06 < 1 || (c1163xf1deaba4 = thVar.f217558d) == null) {
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        if (c1162x665295de != null) {
            int t17 = c1162x665295de.t();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = c1163xf1deaba4.mo7946xf939df19();
            if (t17 < 0 || !(mo7946xf939df192 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) || thVar.f217564m == null) {
                return;
            }
            in5.c cVar = (in5.c) kz5.n0.a0(((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df192).m82898xfb7e5820(), t17 + 1);
            java.lang.Long valueOf = cVar != null ? java.lang.Long.valueOf(cVar.mo2128x1ed62e84()) : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = thVar.f217564m;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, abstractC14490x69736cb5 != null ? java.lang.Long.valueOf(abstractC14490x69736cb5.mo2128x1ed62e84()) : null)) {
                c1163xf1deaba4.mo7976xc291bbd2(0, (int) c1163xf1deaba4.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561195c0));
            }
        }
    }
}
