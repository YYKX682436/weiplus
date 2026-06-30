package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.NetStatPreference */
/* loaded from: classes12.dex */
public class C17374x19c0e52c extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public boolean L;

    public C17374x19c0e52c(android.content.Context context) {
        this(context, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        android.content.Context context;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17373xc1271f8e c17373xc1271f8e;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17374x19c0e52c c17374x19c0e52c = this;
        super.t(view);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.gtt);
        linearLayout.removeAllViews();
        long j17 = 86400000;
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 86400000);
        int i18 = 15;
        while (true) {
            context = c17374x19c0e52c.f279303d;
            android.util.AttributeSet attributeSet = null;
            if (i18 <= 0) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17373xc1271f8e c17373xc1271f8e2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17373xc1271f8e(context, null);
            int i19 = (currentTimeMillis - i18) + 1;
            boolean z18 = c17374x19c0e52c.L;
            c17373xc1271f8e2.f241685e.setText(android.text.format.DateFormat.format(c17373xc1271f8e2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573668fc2, ""), i19 * j17).toString());
            c17373xc1271f8e2.f241684d.removeAllViews();
            int i27 = 0;
            while (i27 < 5) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17376x400fd295 c17376x400fd295 = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17376x400fd295(c17373xc1271f8e2.getContext(), attributeSet);
                ((u90.t) ((v90.w) i95.n0.c(v90.w.class))).getClass();
                com.p314xaae8f345.mm.p959x883644fd.s n07 = com.p314xaae8f345.mm.p959x883644fd.t0.Ai().n0(i19 + i27);
                if (n07 == null) {
                    i17 = i19;
                    c17373xc1271f8e = c17373xc1271f8e2;
                    z17 = z18;
                } else if (z18) {
                    c17373xc1271f8e = c17373xc1271f8e2;
                    i17 = i19;
                    z17 = z18;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetStatUnit", "dknetflow peroid:%d wifi : %d %d %d %d", java.lang.Integer.valueOf(n07.f153088c), java.lang.Long.valueOf(n07.f153110y), java.lang.Long.valueOf(n07.f153098m), java.lang.Long.valueOf(n07.A), java.lang.Long.valueOf(n07.f153100o));
                    c17376x400fd295.a(n07.f153110y + n07.f153098m, n07.A + n07.f153100o);
                } else {
                    i17 = i19;
                    c17373xc1271f8e = c17373xc1271f8e2;
                    z17 = z18;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetStatUnit", "dknetflow peroid:%d mobile : %d %d %d %d", java.lang.Integer.valueOf(n07.f153088c), java.lang.Long.valueOf(n07.f153109x), java.lang.Long.valueOf(n07.f153097l), java.lang.Long.valueOf(n07.f153111z), java.lang.Long.valueOf(n07.f153099n));
                    c17376x400fd295.a(n07.f153109x + n07.f153097l, n07.f153111z + n07.f153099n);
                }
                c17376x400fd295.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1, 1.0f));
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17373xc1271f8e c17373xc1271f8e3 = c17373xc1271f8e;
                c17373xc1271f8e3.f241684d.addView(c17376x400fd295);
                i27++;
                attributeSet = null;
                c17373xc1271f8e2 = c17373xc1271f8e3;
                z18 = z17;
                i19 = i17;
            }
            linearLayout.addView(c17373xc1271f8e2, -2, -1);
            i18 -= 5;
            j17 = 86400000;
            c17374x19c0e52c = this;
        }
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.m8j);
        linearLayout2.removeAllViews();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17373xc1271f8e c17373xc1271f8e4 = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17373xc1271f8e(context, null);
        boolean z19 = this.L;
        c17373xc1271f8e4.removeAllViews();
        android.view.View.inflate(c17373xc1271f8e4.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.c7h, c17373xc1271f8e4);
        c17373xc1271f8e4.f241684d = (android.widget.LinearLayout) c17373xc1271f8e4.findViewById(com.p314xaae8f345.mm.R.id.gtt);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17375xc1c37205 c17375xc1c37205 = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17375xc1c37205(c17373xc1271f8e4.getContext(), null);
        c17375xc1c37205.setTag(z19 ? "wifi" : "mobile");
        c17375xc1c37205.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1, 1.0f));
        c17373xc1271f8e4.f241684d.addView(c17375xc1c37205);
        linearLayout2.addView(c17373xc1271f8e4);
        E(8);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        android.view.View.inflate(this.f279303d, com.p314xaae8f345.mm.R.C30864xbddafb2a.bzq, viewGroup2);
        return u17;
    }

    public C17374x19c0e52c(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C17374x19c0e52c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = false;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f14.f.f340218b, i17, 0);
        this.L = obtainStyledAttributes.getInt(0, 0) == 1;
        obtainStyledAttributes.recycle();
        H(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ity, 15));
    }
}
