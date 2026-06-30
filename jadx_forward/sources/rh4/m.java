package rh4;

/* loaded from: classes8.dex */
public class m extends rh4.o {

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.ImageView f477297w;

    /* renamed from: x, reason: collision with root package name */
    public android.animation.ObjectAnimator f477298x;

    /* renamed from: y, reason: collision with root package name */
    public int f477299y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.content.Context context, lh4.b callback, int i17) {
        super(context, callback, i17, null, 0);
        android.view.ViewGroup.LayoutParams layoutParams;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        m162446x4905e9fa().setId(com.p314xaae8f345.mm.R.id.r8w);
        m162445x6ece7510().setAccessibilityTraversalBefore(m162446x4905e9fa().getId());
        ((android.widget.TextView) m145777xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.jrt)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.f571843rf);
        android.widget.RelativeLayout m162445x6ece7510 = m162445x6ece7510();
        if (m162445x6ece7510 != null && (layoutParams = m162445x6ece7510.getLayoutParams()) != null) {
            layoutParams.width = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561208cc);
            m162445x6ece7510().setLayoutParams(layoutParams);
        }
        this.f477297w = (android.widget.ImageView) m145777xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.f567216im4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0085, code lost:
    
        if ((r2.length() == 0) != false) goto L26;
     */
    /* renamed from: getGetCommonUsedWording */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String m162442x25f05af0() {
        /*
            r7 = this;
            java.lang.String r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d()
            java.lang.Class<ft.a> r1 = ft.a.class
            i95.m r1 = i95.n0.c(r1)
            ft.a r1 = (ft.a) r1
            com.tencent.mm.feature.appbrand.support.a r1 = (com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.a) r1
            r1.getClass()
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a.b()
            java.lang.String r1 = r1.f158764y1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "wxaCommUseSetting: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r3 = "  curLang:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.TaskBarSectionCommonUsedWeAppView"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L3c
            java.lang.String r0 = ""
            return r0
        L3c:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L42
            r2.<init>(r1)     // Catch: java.lang.Exception -> L42
            goto L5a
        L42:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "wxaCommUseSettingJson#get, fail since "
            r2.<init>(r4)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r1)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
        L5a:
            java.lang.String r1 = "CommUseWording"
            org.json.JSONObject r1 = r2.optJSONObject(r1)
            if (r1 == 0) goto L87
            java.lang.String r2 = r1.optString(r0)
            if (r2 == 0) goto L87
            int r4 = r2.length()
            r5 = 1
            r6 = 0
            if (r4 != 0) goto L72
            r4 = r5
            goto L73
        L72:
            r4 = r6
        L73:
            if (r4 == 0) goto L7b
            java.lang.String r2 = "en"
            java.lang.String r2 = r1.optString(r2)
        L7b:
            if (r2 == 0) goto L87
            int r1 = r2.length()
            if (r1 != 0) goto L84
            goto L85
        L84:
            r5 = r6
        L85:
            if (r5 == 0) goto L88
        L87:
            r2 = 0
        L88:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "commUseWording#get, curLang: "
            r1.<init>(r4)
            r1.append(r0)
            java.lang.String r0 = ", "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: rh4.m.m162442x25f05af0():java.lang.String");
    }

    @Override // rh4.n0, lh4.h
    public void c() {
        super.c();
        m162446x4905e9fa().m1();
    }

    @Override // rh4.o, rh4.n0, lh4.h
    public java.lang.String f() {
        java.lang.String m162442x25f05af0 = m162442x25f05af0();
        if (!android.text.TextUtils.isEmpty(m162442x25f05af0)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m162442x25f05af0);
            return m162442x25f05af0;
        }
        java.lang.String string = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m7c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    /* renamed from: getLoadObjAnimator */
    public final android.animation.ObjectAnimator m162443xcca21e02() {
        return this.f477298x;
    }

    @Override // rh4.o, rh4.n0
    public com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093.C18566x5b11ed80 i() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093.C18564x29fd1ad8(getContext());
    }

    @Override // rh4.o, rh4.n0
    public void l() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionCommonUsedWeAppView", "onClickMore");
        rh4.j0 m162451x2b17f622 = m162451x2b17f622();
        if (m162451x2b17f622 != null) {
            m162451x2b17f622.r(7);
        }
    }

    @Override // rh4.n0
    public void n() {
        android.widget.ImageView imageView;
        rh4.j0 m162451x2b17f622 = m162451x2b17f622();
        java.lang.Integer valueOf = m162451x2b17f622 != null ? java.lang.Integer.valueOf(m162451x2b17f622.k()) : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(valueOf, "null cannot be cast to non-null type kotlin.Int");
        m162445x6ece7510().setVisibility(valueOf.intValue() > 0 ? 0 : 4);
        if (m162445x6ece7510().getVisibility() != 4 || (imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.jr6)) == null) {
            return;
        }
        imageView.setImageDrawable(null);
    }

    public boolean r() {
        if (m162445x6ece7510() == null || m145779x7531c8a2() == null) {
            return false;
        }
        android.widget.TextView m145779x7531c8a2 = m145779x7531c8a2();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m145779x7531c8a2);
        android.widget.RelativeLayout m162445x6ece7510 = m162445x6ece7510();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m162445x6ece7510, "<get-moreView>(...)");
        android.graphics.Rect rect = new android.graphics.Rect();
        m145779x7531c8a2.getGlobalVisibleRect(rect);
        android.graphics.Rect rect2 = new android.graphics.Rect();
        m162445x6ece7510.getGlobalVisibleRect(rect2);
        return rect.intersect(rect2);
    }

    public final void s(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionCommonUsedWeAppView", "notifyItemRangeChanged, itemCount:" + i17);
        this.f477299y = 0;
        if (m162446x4905e9fa().E0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionCommonUsedWeAppView", "isComputingLayout notifyItemRangeChanged");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionCommonUsedWeAppView", "notifyItemRangeChangedDelay");
            postDelayed(new rh4.l(this, i17), 300L);
        } else {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = m162446x4905e9fa().mo7946xf939df19();
            if (mo7946xf939df19 != null) {
                mo7946xf939df19.m8151xc67946d3(0, i17);
            }
        }
    }

    /* renamed from: setLoadObjAnimator */
    public final void m162444x378b776(android.animation.ObjectAnimator objectAnimator) {
        this.f477298x = objectAnimator;
    }

    public void t(boolean z17) {
        int f17;
        int f18;
        android.view.ViewGroup.LayoutParams layoutParams;
        android.widget.TextView textView = (android.widget.TextView) m145777xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.jrt);
        if (textView == null) {
            return;
        }
        if (z17) {
            textView.setMaxLines(1);
            f17 = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561197c2);
            f18 = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj);
        } else {
            textView.setMaxLines(2);
            f17 = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561208cc);
            f18 = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj);
        }
        textView.setMaxWidth(f17 - f18);
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        android.widget.RelativeLayout m162445x6ece7510 = m162445x6ece7510();
        if (m162445x6ece7510 == null || (layoutParams = m162445x6ece7510.getLayoutParams()) == null) {
            return;
        }
        layoutParams.width = f17;
        m162445x6ece7510().setLayoutParams(layoutParams);
    }

    public void u() {
        android.animation.ObjectAnimator objectAnimator = this.f477298x;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        android.widget.ImageView imageView = this.f477297w;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(8);
    }
}
