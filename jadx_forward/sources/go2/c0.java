package go2;

/* loaded from: classes2.dex */
public final class c0 extends x92.m {
    public static int E = -1;
    public android.view.ViewGroup A;
    public android.widget.TextView B;
    public android.widget.ProgressBar C;
    public android.view.ViewGroup D;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f355491y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f355492z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f355491y = "";
        this.f355492z = "";
    }

    @Override // x92.m
    public void C7(int i17, java.lang.String str) {
        super.C7(i17, str);
        android.view.ViewGroup viewGroup = this.A;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyView");
            throw null;
        }
        viewGroup.setVisibility(0);
        android.widget.TextView textView = this.B;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("retryView");
            throw null;
        }
        textView.setVisibility(0);
        android.widget.ProgressBar progressBar = this.C;
        if (progressBar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("progressView");
            throw null;
        }
        progressBar.setVisibility(8);
        android.view.ViewGroup viewGroup2 = this.A;
        if (viewGroup2 != null) {
            viewGroup2.setOnClickListener(new go2.a0(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyView");
            throw null;
        }
    }

    @Override // x92.m
    public void G7() {
        android.view.ViewGroup viewGroup = this.A;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyView");
            throw null;
        }
        viewGroup.setVisibility(0);
        android.widget.TextView textView = this.B;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("retryView");
            throw null;
        }
        textView.setVisibility(8);
        android.widget.ProgressBar progressBar = this.C;
        if (progressBar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("progressView");
            throw null;
        }
        progressBar.setVisibility(0);
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        this.f355492z = java.lang.String.valueOf(m158359x1e885992().getStringExtra("KEY_FINDER_PROFILE_UI_REQUEST_LIST_POSITION"));
        km5.d T = pm0.v.T(new ho2.b(V6, this.f355491y, this.f355492z, 0).l(), new go2.b0(this));
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
        T.f((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) m158354x19263085);
    }

    public final void I7(java.lang.Integer num, java.lang.Integer num2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 fragment) {
        java.lang.String str;
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        if (num == null || num.intValue() <= 0) {
            str = null;
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("+");
            int intValue = num.intValue();
            if (intValue > 99) {
                intValue = 99;
            }
            sb6.append(intValue);
            str = sb6.toString();
        }
        if ((num2 != null ? num2.intValue() : 0) > 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num2);
            if (num2.intValue() > 999) {
                java.lang.String str3 = fragment.f210799q;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
                str2 = str3.concat("(999+)");
            } else {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                java.lang.String str4 = fragment.f210799q;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str4);
                sb7.append(str4);
                sb7.append('(');
                sb7.append(num2);
                sb7.append(')');
                str2 = sb7.toString();
            }
        } else {
            str2 = fragment.f210799q;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        }
        eo2.l lVar = new eo2.l(m80379x76847179(), -1, str2, false, fragment.f210798p, 0, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570561di0, false);
        lVar.f337120q = str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860.R6(this, lVar, fragment, false, 4, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        if (i17 == 1000 && i18 == -1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860.t7(this, 1, false, 2, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        super.mo451xac79a11b();
        E = -1;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        if (E != -1) {
            java.util.Iterator it = f7().iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                }
                zx2.i iVar = (zx2.i) it.next();
                if ((iVar instanceof w92.a) && ((w92.a) iVar).f525606l == E) {
                    break;
                } else {
                    i17++;
                }
            }
            if (i17 != -1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860.t7(this, i17, false, 2, null);
            }
        }
        E = -1;
    }

    @Override // x92.m
    public int w7() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b2m;
    }

    @Override // x92.m
    public void z7() {
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("key_author_finder_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f355491y = stringExtra;
        m158359x1e885992().getIntExtra("key_finder_member_visitor_status", 0);
        android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f565762dg3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f0, "findViewById(...)");
        this.A = (android.view.ViewGroup) mo144222x4ff8c0f0;
        android.view.View mo144222x4ff8c0f02 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.m2g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f02, "findViewById(...)");
        this.B = (android.widget.TextView) mo144222x4ff8c0f02;
        android.view.View mo144222x4ff8c0f03 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.lbi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f03, "findViewById(...)");
        this.C = (android.widget.ProgressBar) mo144222x4ff8c0f03;
        android.view.View mo144222x4ff8c0f04 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f567408jf1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f04, "findViewById(...)");
        this.D = (android.view.ViewGroup) mo144222x4ff8c0f04;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = this.f215191g;
        if (c2718xca2902ff == null) {
            return;
        }
        c2718xca2902ff.m20376x95e7e540(null);
    }
}
