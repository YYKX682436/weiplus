package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes11.dex */
public abstract class n3 {
    public static boolean a(java.lang.CharSequence charSequence, android.widget.TextView textView) {
        if (charSequence == null || charSequence.length() == 0) {
            textView.setVisibility(8);
            return false;
        }
        textView.setText(charSequence, android.widget.TextView.BufferType.SPANNABLE);
        textView.setVisibility(0);
        return true;
    }

    public static boolean b(java.lang.String str, android.widget.TextView textView) {
        if (textView == null) {
            return false;
        }
        if (str == null || str.length() == 0) {
            textView.setVisibility(8);
            return false;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = textView.getContext();
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str, textSize));
        textView.setVisibility(0);
        return true;
    }

    public static void c(java.lang.CharSequence charSequence, android.widget.TextView textView, float f17) {
        if (charSequence == null || charSequence.length() == 0) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(charSequence, android.widget.TextView.BufferType.SPANNABLE);
        textView.setVisibility(0);
        textView.setTextSize(0, f17);
    }

    public static java.lang.CharSequence d(android.content.Context context, java.util.List list, java.lang.String[] strArr, p13.r rVar, android.text.TextPaint textPaint, java.lang.String str) {
        u50.u uVar = new u50.u();
        uVar.f506304a = context;
        uVar.f506305b = list;
        uVar.f506306c = strArr;
        uVar.f506307d = rVar;
        uVar.f506308e = textPaint;
        uVar.f506309f = str;
        uVar.f506310g = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.b.f219549a;
        return e(uVar);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0088. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.CharSequence e(u50.u r18) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.e(u50.u):java.lang.CharSequence");
    }

    public static java.lang.String f(int i17) {
        int i18;
        switch (i17) {
            case org.p3343x72743996.net.InterfaceC29524x4f65168b.f73894x389a6e4 /* -32 */:
                i18 = com.p314xaae8f345.mm.R.C30867xcad56011.p7i;
                break;
            case org.p3343x72743996.net.InterfaceC29524x4f65168b.f73978xfbca7bdf /* -31 */:
                i18 = com.p314xaae8f345.mm.R.C30867xcad56011.p6r;
                break;
            case org.p3343x72743996.net.InterfaceC29524x4f65168b.f73893x3897a05 /* -30 */:
                i18 = com.p314xaae8f345.mm.R.C30867xcad56011.p7j;
                break;
            case -29:
                i18 = com.p314xaae8f345.mm.R.C30867xcad56011.p3i;
                break;
            case -28:
                i18 = com.p314xaae8f345.mm.R.C30867xcad56011.o3v;
                break;
            case -27:
                i18 = com.p314xaae8f345.mm.R.C30867xcad56011.o3u;
                break;
            case -26:
            case -25:
            case -24:
                i18 = com.p314xaae8f345.mm.R.C30867xcad56011.idm;
                break;
            case -23:
                i18 = com.p314xaae8f345.mm.R.C30867xcad56011.ffw;
                break;
            case -22:
            case -19:
            case -18:
            case -17:
            case -16:
            case -14:
            case -12:
            case -10:
            case -9:
            default:
                i18 = 0;
                break;
            case -21:
                i18 = com.p314xaae8f345.mm.R.C30867xcad56011.idx;
                break;
            case -20:
                i18 = com.p314xaae8f345.mm.R.C30867xcad56011.fg9;
                break;
            case -15:
                i18 = com.p314xaae8f345.mm.R.C30867xcad56011.ffz;
                break;
            case -13:
                i18 = com.p314xaae8f345.mm.R.C30867xcad56011.fg8;
                break;
            case -11:
                i18 = com.p314xaae8f345.mm.R.C30867xcad56011.f573690fg0;
                break;
            case -8:
                i18 = com.p314xaae8f345.mm.R.C30867xcad56011.fg7;
                break;
            case -7:
                i18 = com.p314xaae8f345.mm.R.C30867xcad56011.ffv;
                break;
            case -6:
                i18 = com.p314xaae8f345.mm.R.C30867xcad56011.ffu;
                break;
            case -5:
                i18 = com.p314xaae8f345.mm.R.C30867xcad56011.ffx;
                break;
            case -4:
                i18 = com.p314xaae8f345.mm.R.C30867xcad56011.ffq;
                break;
            case -3:
                i18 = com.p314xaae8f345.mm.R.C30867xcad56011.ffp;
                break;
            case -2:
                i18 = com.p314xaae8f345.mm.R.C30867xcad56011.ffy;
                break;
            case -1:
                i18 = com.p314xaae8f345.mm.R.C30867xcad56011.fft;
                break;
        }
        if (i18 == 0) {
            return null;
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(i18);
    }

    public static boolean g(android.content.Context context) {
        if (!k23.c1.f385069h.a(context).U6()) {
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(z13.f.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            if (!((z13.f) a17).e7()) {
                return false;
            }
        }
        return true;
    }

    public static boolean h() {
        return !((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
    }

    public static final void i(android.view.View view, boolean z17) {
        if (z17) {
            view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562839q2);
        } else {
            view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ae7);
        }
    }

    public static final void j(android.view.View view, boolean z17) {
        if (z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSUIApiLogic", "setDivider", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSUIApiLogic", "setDivider", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/FTSUIApiLogic", "setDivider", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSUIApiLogic", "setDivider", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public static void k(android.content.Context context, android.widget.ImageView imageView, java.lang.String str, java.lang.String str2, int i17, boolean z17, int i18, int i19) {
        imageView.setTag(((com.p314xaae8f345.mm.p1006xc5476f33.fts.n) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj()).d(str, str2, z17, i18, i19));
        imageView.hashCode();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            if (i17 <= 0 || (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2))) {
                imageView.setVisibility(8);
                return;
            } else {
                imageView.setImageResource(i17);
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.n nVar = (com.p314xaae8f345.mm.p1006xc5476f33.fts.n) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj();
        android.graphics.Bitmap e17 = nVar.e(nVar.d(str, str2, z17, i18, i19));
        if (e17 == null || e17.isRecycled()) {
            if (i17 > 0) {
                imageView.setImageResource(i17);
            } else {
                imageView.setImageResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.fts.n nVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.fts.n) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj();
            java.lang.String d17 = nVar2.d(str, str2, z17, i18, i19);
            imageView.setTag(d17);
            imageView.hashCode();
            if (nVar2.f219302c) {
                com.p314xaae8f345.mm.p1006xc5476f33.fts.k kVar = new com.p314xaae8f345.mm.p1006xc5476f33.fts.k(nVar2, d17, str, str2, z17, i18, i19, new com.p314xaae8f345.mm.p1006xc5476f33.fts.i(nVar2, imageView, context));
                java.util.Set set = nVar2.f219309j;
                if (set.add(d17)) {
                    int i27 = nVar2.f219303d + 1;
                    nVar2.f219303d = i27;
                    int i28 = i27 % 2;
                    nVar2.f219303d = i28;
                    nVar2.f219305f[i28].mo50293x3498a0(kVar);
                } else {
                    set.toString();
                }
            }
        } else {
            imageView.setImageDrawable(new t13.m(context.getResources(), e17));
            imageView.postInvalidate();
        }
        imageView.setVisibility(0);
    }
}
