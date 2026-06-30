package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public abstract class qg {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.List f286895a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f286896b;

    static {
        java.lang.Double valueOf = java.lang.Double.valueOf(0.75d);
        java.lang.Double valueOf2 = java.lang.Double.valueOf(1.3333333333333333d);
        f286895a = new java.util.ArrayList(java.util.Arrays.asList(valueOf, java.lang.Double.valueOf(1.0d), valueOf2));
        f286896b = new java.util.ArrayList(java.util.Arrays.asList(valueOf, valueOf2));
    }

    public static double a(int i17, float f17, float f18) {
        if (f17 <= 0.0f || f18 <= 0.0f) {
            return 0.75d;
        }
        double d17 = f17 / f18;
        java.util.List list = f286895a;
        if (i17 == 0) {
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            double doubleValue = ((java.lang.Double) arrayList.get(0)).doubleValue();
            double abs = java.lang.Math.abs(d17 - doubleValue);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                double doubleValue2 = ((java.lang.Double) it.next()).doubleValue();
                double abs2 = java.lang.Math.abs(d17 - doubleValue2);
                if (abs2 < abs) {
                    doubleValue = doubleValue2;
                    abs = abs2;
                }
            }
            return doubleValue;
        }
        if (i17 != 1) {
            return ((java.lang.Double) ((java.util.ArrayList) list).get(0)).doubleValue();
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) f286896b;
        double doubleValue3 = ((java.lang.Double) arrayList2.get(0)).doubleValue();
        double abs3 = java.lang.Math.abs(d17 - doubleValue3);
        java.util.Iterator it6 = arrayList2.iterator();
        double d18 = abs3;
        double d19 = doubleValue3;
        while (it6.hasNext()) {
            double doubleValue4 = ((java.lang.Double) it6.next()).doubleValue();
            double abs4 = java.lang.Math.abs(d17 - doubleValue4);
            if (abs4 < d18) {
                d19 = doubleValue4;
                d18 = abs4;
            }
        }
        return d19;
    }

    public static java.lang.String b(java.lang.String str) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Bi(str) ? "miniProgram" : r01.z.n(str) ? "biz" : "";
    }

    public static int c(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return 0;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.z3(str)) {
            return 2;
        }
        if (r01.z.n(str)) {
            return 1;
        }
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.S3(str) ? 3 : 0;
    }

    public static void d(android.content.Context context, java.lang.String str, android.widget.ImageView imageView, android.widget.TextView textView) {
        if (context == null || str == null || imageView == null || textView == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemBizUtils", "refreshBizSrcInfoNew param null");
            return;
        }
        ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).getClass();
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.F3(str) && ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).wi()) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f80848x56d04ab0);
        } else {
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f80757xe68851f8);
        }
        if (imageView instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) {
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) imageView).m82040x7541828(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
        }
        g(context, str, textView);
    }

    public static void e(android.content.Context context, java.lang.String str, android.widget.ImageView imageView, android.widget.TextView textView) {
        if (context == null || str == null || imageView == null || textView == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemBizUtils", "param null");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemBizUtils", "srcUsername null");
        }
        if (c01.e2.G(str)) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(imageView, str);
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(imageView, " ");
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bgo);
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, "", textSize));
        imageView.setVisibility(0);
        textView.setVisibility(0);
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String e17 = c01.a2.e(str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17)) {
            e17 = str;
        }
        imageView.setTag(str);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (n17 == null || ((int) n17.E2) <= 0)) {
            imageView.setTag(str);
            java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(imageView);
            ((c01.k7) c01.n8.a()).b(str, 5, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.og(weakReference, textView, context));
            return;
        }
        if (!c01.e2.G(str)) {
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.aj6);
            float textSize2 = textView.getTextSize();
            ((ke0.e) xVar2).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, string, textSize2));
            return;
        }
        if (!n17.r2()) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
            if (com.p314xaae8f345.mm.p943x351df9c2.g.a(str) == null) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().n0(str);
                if (n07 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n07.d())) {
                    lr1.m.a(imageView, n17, n07.d(), true);
                }
            }
        }
        le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
        float textSize3 = textView.getTextSize();
        ((ke0.e) xVar3).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, e17, textSize3));
    }

    public static void f(android.content.Context context, java.lang.String str, android.widget.ImageView imageView, android.widget.TextView textView, boolean z17, boolean z18, boolean z19) {
        if (context == null || str == null || imageView == null || textView == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemBizUtils", "refreshSrcInfo param null");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemBizUtils", "refreshSrcInfo srcUsername null");
        }
        boolean z27 = imageView instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352;
        if (z27) {
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) imageView).m82040x7541828(0);
        }
        if (z18) {
            imageView.setVisibility(0);
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f79664x14f92eb);
            if (z27) {
                ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) imageView).m82040x7541828(context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560059a7));
            }
            g(context, str, textView);
        } else {
            imageView.setLayerPaint(null);
            e(context, str, imageView, textView);
        }
        if (!z17) {
            imageView.setVisibility(8);
        }
        if (z19) {
            java.lang.CharSequence text = textView.getText();
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ajg);
            if (text == null) {
                text = "";
            }
            objArr[1] = text;
            textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n4t, objArr));
        }
    }

    public static void g(android.content.Context context, java.lang.String str, android.widget.TextView textView) {
        if (context == null || str == null || textView == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemBizUtils", "param null");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemBizUtils", "srcUsername null");
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, "", textSize));
        textView.setVisibility(0);
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String e17 = c01.a2.e(str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17)) {
            e17 = str;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (n17 == null || ((int) n17.E2) <= 0)) {
            ((c01.k7) c01.n8.a()).b(str, 5, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.pg(textView, context));
        } else {
            if (c01.e2.G(str)) {
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                float textSize2 = textView.getTextSize();
                ((ke0.e) xVar2).getClass();
                textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, e17, textSize2));
                return;
            }
            le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.aj6);
            float textSize3 = textView.getTextSize();
            ((ke0.e) xVar3).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, string, textSize3));
        }
    }

    public static void h(android.widget.TextView textView, ot0.q qVar, java.lang.String str) {
        if (textView == null) {
            return;
        }
        if (qVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemBizUtils", "setFriendInfo, param error");
            textView.setText("");
            return;
        }
        ot0.f fVar = (ot0.f) qVar.y(ot0.f.class);
        if (fVar == null || fVar.f429994h != 1) {
            textView.setText("");
            return;
        }
        java.lang.String string = textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574097gz4);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        textView.setText(string != null ? string : "");
    }

    public static boolean i(ot0.q qVar, ot0.f fVar) {
        if (fVar == null || qVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f430255w)) {
            return false;
        }
        if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).p(qVar.f430207k)) {
            return fVar.f429988b >= 0 || fVar.f429999m == 1;
        }
        return false;
    }

    public static void j(android.widget.ImageView imageView) {
        if (imageView != null && (imageView instanceof com.p314xaae8f345.mm.p2776x373aa5.C22782x8bcca9d0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemBizUtils", "updateBizSharePicImageViewCrop");
            ((com.p314xaae8f345.mm.p2776x373aa5.C22782x8bcca9d0) imageView).m82522xf4e85f16(new android.graphics.RectF(0.0f, 0.0f, 1.0f, 0.2f));
        }
    }
}
