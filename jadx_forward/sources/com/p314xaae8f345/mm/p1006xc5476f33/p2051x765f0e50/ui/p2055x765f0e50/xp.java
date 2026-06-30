package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes11.dex */
public class xp extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17486x3b418ac7 f243301d;

    public xp(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17486x3b418ac7 activityC17486x3b418ac7) {
        this.f243301d = activityC17486x3b418ac7;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f243301d.f242312t.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        if (k3Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.bq) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.bq bqVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.bq) k3Var;
            bqVar.f242421i.setTag(java.lang.Integer.valueOf(i17));
            bqVar.f242423n.setTag(java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17486x3b418ac7 activityC17486x3b418ac7 = this.f243301d;
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.yp ypVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.yp) activityC17486x3b418ac7.f242312t.get(i17);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai((android.widget.ImageView) bqVar.f242416d.m79176xc2a54588(), ypVar.f243333c.d1(), null);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC17486x3b418ac7.mo55332x76847179();
            java.lang.String str = ypVar.f243332b;
            android.widget.TextView textView = bqVar.f242417e;
            float textSize = textView.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(mo55332x76847179, str, textSize));
            bqVar.f242420h.setVisibility(ypVar.f243333c.x2() ? 0 : 8);
            java.lang.String d17 = ypVar.f243333c.d1();
            if (p94.w0.f() != null && activityC17486x3b418ac7.f242316x.size() == 0) {
                activityC17486x3b418ac7.f242316x.addAll(((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r2) p94.w0.f()).L0(5L));
            }
            bqVar.f242419g.setVisibility(activityC17486x3b418ac7.f242316x.contains(d17) ? 0 : 8);
            boolean containsKey = activityC17486x3b418ac7.f242311s.containsKey(java.lang.Integer.valueOf(i17));
            android.widget.TextView textView2 = bqVar.f242418f;
            if (containsKey) {
                textView2.setVisibility(0);
                textView2.setText((java.lang.CharSequence) activityC17486x3b418ac7.f242311s.get(java.lang.Integer.valueOf(i17)));
            } else {
                textView2.setVisibility(8);
            }
            boolean z17 = activityC17486x3b418ac7.f242318z;
            android.widget.LinearLayout linearLayout = bqVar.f242421i;
            android.widget.LinearLayout linearLayout2 = bqVar.f242424o;
            if (!z17) {
                linearLayout2.setPadding(linearLayout2.getPaddingLeft(), linearLayout2.getPaddingTop(), (int) activityC17486x3b418ac7.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561409hp), linearLayout2.getPaddingBottom());
                linearLayout.setVisibility(8);
                return;
            }
            linearLayout2.setPadding(linearLayout2.getPaddingLeft(), linearLayout2.getPaddingTop(), 0, linearLayout2.getPaddingBottom());
            boolean contains = activityC17486x3b418ac7.f242313u.contains(java.lang.Integer.valueOf(i17));
            android.widget.CheckBox checkBox = bqVar.f242422m;
            if (contains) {
                checkBox.setChecked(true);
            } else {
                checkBox.setChecked(false);
            }
            linearLayout.setVisibility(0);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.bq(this.f243301d, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d2j, viewGroup, false));
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.yp x(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17486x3b418ac7 activityC17486x3b418ac7 = this.f243301d;
        return activityC17486x3b418ac7.f242312t.size() > i17 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.yp) activityC17486x3b418ac7.f242312t.get(i17) : new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.yp(activityC17486x3b418ac7, new com.p314xaae8f345.mm.p2621x8fb0427b.z3());
    }
}
