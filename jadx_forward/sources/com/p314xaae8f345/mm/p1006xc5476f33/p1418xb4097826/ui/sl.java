package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes10.dex */
public final class sl {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15010xb447a21d f211353a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ViewGroup f211354b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f211355c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f211356d;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x011f, code lost:
    
        if (r4.before(r0) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public sl(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15010xb447a21d r12, android.view.ViewGroup r13) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.sl.<init>(com.tencent.mm.plugin.finder.ui.FinderAlbumUI, android.view.ViewGroup):void");
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.sl slVar, boolean z17) {
        android.view.ViewGroup viewGroup = slVar.f211354b;
        ((android.widget.LinearLayout) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f568785o10)).setVisibility(z17 ? 0 : 8);
        ((android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f568786o11)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.fi6);
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.o1e);
        textView.setVisibility(z17 ? 0 : 8);
        textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ol(slVar));
    }

    public static final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.sl slVar) {
        slVar.getClass();
        ((ez0.i) ((uy0.h) i95.n0.c(uy0.h.class))).getClass();
        vy0.g gVar = vy0.g.f522947a;
        android.content.Context context = slVar.f211354b.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        gVar.c("scene_finder_v2", context, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.pl(slVar), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ql(slVar));
    }

    public final android.graphics.Shader c() {
        android.widget.TextView textView = this.f211355c;
        return new android.graphics.LinearGradient(0.0f, 0.0f, textView.getPaint().measureText(textView.getText().toString()), 2 * textView.getTextSize(), new int[]{-17032, -39322}, new float[]{0.2052f, 0.6732f}, android.graphics.Shader.TileMode.CLAMP);
    }

    public final void d(int i17) {
        android.view.ViewGroup viewGroup;
        int i18 = 0;
        boolean z17 = i17 > 0;
        android.widget.TextView textView = this.f211355c;
        if (textView.isEnabled() == z17) {
            return;
        }
        textView.setEnabled(z17);
        if (this.f211356d) {
            android.graphics.drawable.Drawable[] compoundDrawables = textView.getCompoundDrawables();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compoundDrawables, "getCompoundDrawables(...)");
            int length = compoundDrawables.length;
            while (true) {
                viewGroup = this.f211354b;
                if (i18 >= length) {
                    break;
                }
                android.graphics.drawable.Drawable drawable = compoundDrawables[i18];
                if (drawable != null) {
                    if (z17) {
                        f3.b.h(drawable, null);
                    } else {
                        f3.b.g(drawable, i65.a.d(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77671x8113c22a));
                    }
                }
                i18++;
            }
            if (z17) {
                textView.getPaint().setShader(c());
                textView.setTextColor(-1);
            } else {
                textView.getPaint().setShader(null);
                textView.setTextColor(i65.a.d(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77671x8113c22a));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0011 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0012 A[Catch: Exception -> 0x0051, TryCatch #0 {Exception -> 0x0051, blocks: (B:15:0x0005, B:7:0x0012, B:10:0x0029), top: B:14:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Date e(java.lang.String r11) {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
            r2 = 1
            if (r11 == 0) goto Le
            int r3 = r11.length()     // Catch: java.lang.Exception -> L51
            if (r3 != 0) goto Lc
            goto Le
        Lc:
            r3 = r0
            goto Lf
        Le:
            r3 = r2
        Lf:
            if (r3 == 0) goto L12
            return r1
        L12:
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch: java.lang.Exception -> L51
            java.lang.String r3 = "/"
            r5[r0] = r3     // Catch: java.lang.Exception -> L51
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            r4 = r11
            java.util.List r11 = r26.n0.f0(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L51
            int r3 = r11.size()     // Catch: java.lang.Exception -> L51
            r4 = 3
            if (r3 == r4) goto L29
            return r1
        L29:
            java.util.Date r3 = new java.util.Date     // Catch: java.lang.Exception -> L51
            java.lang.Object r0 = r11.get(r0)     // Catch: java.lang.Exception -> L51
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L51
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L51
            int r0 = r0 + (-1900)
            java.lang.Object r4 = r11.get(r2)     // Catch: java.lang.Exception -> L51
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L51
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Exception -> L51
            int r4 = r4 - r2
            r2 = 2
            java.lang.Object r11 = r11.get(r2)     // Catch: java.lang.Exception -> L51
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Exception -> L51
            int r11 = java.lang.Integer.parseInt(r11)     // Catch: java.lang.Exception -> L51
            r3.<init>(r0, r4, r11)     // Catch: java.lang.Exception -> L51
            return r3
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.sl.e(java.lang.String):java.util.Date");
    }
}
