package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd;

/* loaded from: classes2.dex */
public final class l extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements zy2.o5 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f183242d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.api.p1420xac8f1cfd.C13638xb683e9ec f183243e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f183244f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f183245g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f183246h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.g f183247i;

    /* renamed from: m, reason: collision with root package name */
    public r45.zn5 f183248m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f183249n;

    /* renamed from: o, reason: collision with root package name */
    public int f183250o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f183251p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f183252q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f183247i = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ec, code lost:
    
        if (r1 >= 1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x013a, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0138, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0136, code lost:
    
        if (r1 >= 2) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void O6(r45.lk2 r26) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.l.O6(r45.lk2):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAccountSwitchUIC", "onActivityResult, requestCode:" + i17 + ", resultCode:" + i18);
        if (i17 == 702) {
            if (i18 == -1) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ((c61.ub) i95.n0.c(c61.ub.class))).hj(m158354x19263085(), intent, 11103);
                return;
            }
            return;
        }
        if (i17 == 11103 || i17 == 11104) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50) ((zy2.xa) pf5.z.f435481a.a(activity).c(zy2.xa.class))).X6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        this.f183242d = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.e7x);
        android.widget.TextView textView = (android.widget.TextView) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.e7z);
        com.p314xaae8f345.mm.ui.bk.s0(textView != null ? textView.getPaint() : null);
        android.view.View view = this.f183242d;
        if (view != null) {
            view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.j(this));
        }
        O6(null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        super.mo2287xc39f8281();
        if (m158354x19263085().isFinishing()) {
            g92.b.f351302e.P0("", "selfCenterClear");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f183247i = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.g();
    }
}
