package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class o70 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f216969d;

    /* renamed from: e, reason: collision with root package name */
    public final int f216970e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f216971f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f216972g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f216973h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o70(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f216969d = new java.util.HashMap();
        this.f216970e = Q6();
    }

    public static final java.lang.String O6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o70 o70Var, java.lang.String str, android.graphics.Paint paint, int i17) {
        o70Var.getClass();
        java.lang.String str2 = "";
        if ((str.length() == 0) || paint == null || paint.getTextSize() <= 0.0f || i17 <= 0) {
            return "";
        }
        int length = str.length();
        int i18 = 0;
        int i19 = 0;
        while (i18 < length) {
            i19 = ((i18 + length) + 1) / 2;
            str2 = str.substring(0, i19);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "substring(...)");
            float measureText = paint.measureText(str2);
            float f17 = i17;
            if (measureText < f17) {
                i18 = i19;
            } else if (measureText > f17) {
                length = i19 - 1;
            } else {
                length = i19;
                i18 = length;
            }
        }
        if (i18 == i19) {
            return str2;
        }
        java.lang.String substring = str.substring(0, i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        return substring;
    }

    public final java.lang.String P6(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.n70 n70Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.n70) this.f216969d.get(java.lang.Long.valueOf(j17));
        java.util.List list = n70Var != null ? n70Var.f216808k : null;
        if (list == null || list.isEmpty()) {
            return "30000";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r45.ch7 a17 = r45.ch7.a(((r45.ay2) it.next()).m75939xb282bd08(0));
            java.lang.String obj = a17 != null ? a17.toString() : null;
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        java.lang.String g07 = kz5.n0.g0(arrayList, "#", null, null, 0, null, null, 62, null);
        java.lang.String str = g07.length() > 0 ? g07 : null;
        return str == null ? "30000" : str;
    }

    public final int Q6() {
        com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(m80379x76847179());
        return a17.f278668a - (m80379x76847179().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9) * 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x01a5 A[LOOP:1: B:67:0x0173->B:77:0x01a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ab A[EDGE_INSN: B:78:0x01ab->B:79:0x01ab BREAK  A[LOOP:1: B:67:0x0173->B:77:0x01a5], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R6(long r35, int r37) {
        /*
            Method dump skipped, instructions count: 1158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o70.R6(long, int):void");
    }

    public final void S6(in5.s0 s0Var, boolean z17) {
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.C15413x7c45044c X6;
        if (s0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSubtitleUIC", "resetContainer holder is null");
            this.f216971f = null;
        }
        if (z17) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt ptVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt) pf5.z.f435481a.a(activity).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt.class);
            if (ptVar == null || (X6 = ptVar.X6()) == null) {
                this.f216971f = null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSubtitleUIC", "resetContainer find container error");
            } else {
                this.f216971f = X6.findViewById(com.p314xaae8f345.mm.R.id.tvl);
            }
        } else {
            this.f216971f = (s0Var == null || (view = s0Var.f3639x46306858) == null) ? null : view.findViewById(com.p314xaae8f345.mm.R.id.tvl);
        }
        android.view.View view2 = this.f216971f;
        this.f216972g = view2 != null ? (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.tvm) : null;
        android.view.View view3 = this.f216971f;
        this.f216973h = view3 != null ? (android.widget.TextView) view3.findViewById(com.p314xaae8f345.mm.R.id.tvn) : null;
    }

    public final void T6(long j17, java.util.List languages) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(languages, "languages");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.n70 n70Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.n70) this.f216969d.get(java.lang.Long.valueOf(j17));
        if (n70Var != null) {
            n70Var.f216808k = languages;
            int size = languages.size();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o70 o70Var = n70Var.f216810m;
            if (size == 0) {
                db5.t7.h(o70Var.m80379x76847179(), o70Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.o27));
            } else {
                db5.t7.h(o70Var.m80379x76847179(), o70Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f573627o26));
            }
            n70Var.e((r45.by2) kz5.n0.a0(n70Var.f216806i, n70Var.f216807j));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o70(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f216969d = new java.util.HashMap();
        this.f216970e = Q6();
    }
}
