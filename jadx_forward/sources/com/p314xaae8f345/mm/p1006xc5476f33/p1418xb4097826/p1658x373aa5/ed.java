package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class ed {

    /* renamed from: a */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ed f213532a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ed();

    public static /* synthetic */ void b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ed edVar, android.content.Context context, r45.h32 h32Var, java.lang.String str, long j17, java.util.List list, java.lang.String str2, boolean z17, yz5.a aVar, yz5.l lVar, int i17, java.lang.Object obj) {
        edVar.a(context, h32Var, str, j17, list, str2, (i17 & 64) != 0 ? true : z17, (i17 & 128) != 0 ? null : aVar, (i17 & 256) != 0 ? null : lVar);
    }

    public final void a(android.content.Context ctx, r45.h32 h32Var, java.lang.String str, long j17, java.util.List couponInfo, java.lang.String anchorFinderUsername, boolean z17, yz5.a aVar, yz5.l lVar) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(couponInfo, "couponInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorFinderUsername, "anchorFinderUsername");
        if (couponInfo.isEmpty()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.kd kdVar = z17 ? new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.kd(ctx) : new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ld(ctx);
        kdVar.f214022h = aVar;
        kdVar.f214030s = lVar;
        kdVar.f214028q = anchorFinderUsername;
        java.util.ArrayList arrayList = (java.util.ArrayList) kdVar.f214029r;
        arrayList.clear();
        arrayList.addAll(couponInfo);
        android.content.Context context = kdVar.f199914d;
        if (j17 > 0) {
            if (h32Var != null) {
                android.widget.TextView textView = kdVar.f214024m;
                if (textView != null) {
                    textView.setText(zl2.q4.t(zl2.q4.f555466a, h32Var, com.p314xaae8f345.mm.R.C30867xcad56011.csf, false, false, false, 28, null));
                }
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                java.lang.String r17 = zl2.q4.r(zl2.q4.f555466a, j17, null, false, false, 14, null);
                android.widget.TextView textView2 = kdVar.f214024m;
                if (textView2 != null) {
                    textView2.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.csf, r17));
                }
            }
        } else {
            android.widget.TextView textView3 = kdVar.f214024m;
            if (textView3 != null) {
                textView3.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lhx));
            }
            android.widget.TextView textView4 = kdVar.f214023i;
            if (textView4 != null) {
                textView4.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lhw));
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = kdVar.f214025n;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.jd(kdVar));
        }
        kdVar.w();
    }
}
