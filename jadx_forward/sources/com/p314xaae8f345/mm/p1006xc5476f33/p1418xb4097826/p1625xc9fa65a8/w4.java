package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class w4 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f207496d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f207497e;

    /* renamed from: f, reason: collision with root package name */
    public int f207498f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14954x2934a5e5 f207499g;

    public w4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14954x2934a5e5 activityC14954x2934a5e5, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i18 & 1) != 0 ? 4 : i17;
        this.f207499g = activityC14954x2934a5e5;
        this.f207496d = i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        int i17 = this.f207496d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14954x2934a5e5 activityC14954x2934a5e5 = this.f207499g;
        if (i17 == 3 && activityC14954x2934a5e5.f207128i.size() != 0) {
            this.f207498f = 0;
            this.f207497e = false;
            java.util.Iterator it = activityC14954x2934a5e5.f207128i.iterator();
            while (it.hasNext()) {
                r45.r03 r03Var = (r45.r03) ((r45.t03) it.next()).m75936x14adae67(0);
                boolean z17 = r03Var != null && r03Var.m75939xb282bd08(5) > 0;
                this.f207497e = z17;
                if (!z17) {
                    break;
                }
                this.f207498f++;
            }
            if (this.f207497e) {
                return this.f207498f == activityC14954x2934a5e5.f207128i.size() ? activityC14954x2934a5e5.f207128i.size() : activityC14954x2934a5e5.f207128i.size() + 2;
            }
        }
        return activityC14954x2934a5e5.f207128i.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        if (this.f207496d != 4 || !this.f207497e || this.f207498f == this.f207499g.f207128i.size()) {
            return 3;
        }
        if (i17 == 0) {
            return 1;
        }
        return i17 == this.f207498f + 1 ? 2 : 3;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        x(holder, i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14954x2934a5e5 activityC14954x2934a5e5 = this.f207499g;
        if (i17 == 3) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC14954x2934a5e5.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo55332x76847179);
            android.view.View inflate = mo55332x76847179.getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570353aj4, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.v2(inflate, false, false, false, 14, null);
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = activityC14954x2934a5e5.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo55332x768471792);
        android.view.View inflate2 = mo55332x768471792.getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b5j, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.v4(activityC14954x2934a5e5, inflate2);
    }

    public final void x(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        java.lang.String str;
        boolean z17 = k3Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.v4;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14954x2934a5e5 activityC14954x2934a5e5 = this.f207499g;
        if (z17) {
            if (mo863xcdaf1228(i17) == 1) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.v4) k3Var).f207479d.setText(activityC14954x2934a5e5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cqb));
                return;
            } else {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.v4) k3Var).f207479d.setText(activityC14954x2934a5e5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cqd));
                return;
            }
        }
        r45.t03 t03Var = (this.f207496d == 4 && this.f207497e && this.f207498f != activityC14954x2934a5e5.f207128i.size()) ? i17 < this.f207498f + 1 ? (r45.t03) activityC14954x2934a5e5.f207128i.get(i17 - 1) : (r45.t03) activityC14954x2934a5e5.f207128i.get(i17 - 2) : (r45.t03) activityC14954x2934a5e5.f207128i.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t03Var);
        r45.r03 r03Var = (r45.r03) t03Var.m75936x14adae67(0);
        if (r03Var == null || (str = r03Var.m75945x2fec8307(0)) == null) {
            str = "";
        }
        java.util.HashMap hashMap = activityC14954x2934a5e5.f207132p;
        if (!hashMap.containsKey(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.e0 e0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.e0();
            e0Var.f207199b = str;
            e0Var.f207198a = i17;
            e0Var.f207200c = 1;
            e0Var.f207201d = java.lang.System.currentTimeMillis();
            hashMap.put(str, e0Var);
            if (hashMap.size() % 30 == 0) {
                activityC14954x2934a5e5.W6(false);
            }
        }
        r45.r03 r03Var2 = (r45.r03) t03Var.m75936x14adae67(0);
        if (r03Var2 != null) {
            android.widget.TextView textView = (android.widget.TextView) k3Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.gbc);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = k3Var.f3639x46306858.getContext();
            java.lang.String m75945x2fec8307 = r03Var2.m75945x2fec8307(0);
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, m75945x2fec8307));
            ((android.widget.TextView) k3Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.gbb)).setText(k3Var.f3639x46306858.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573484er4, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.g(2, r03Var2.m75939xb282bd08(2))));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17, java.util.List payloads) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        x(holder, i17);
    }
}
