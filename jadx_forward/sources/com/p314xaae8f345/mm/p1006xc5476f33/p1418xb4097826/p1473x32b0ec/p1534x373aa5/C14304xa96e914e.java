package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013B!\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J*\u0010\u000b\u001a\u00020\u00042\"\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00040\u0006J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCommentPostRealNamePanel;", "Landroid/widget/LinearLayout;", "Landroid/widget/TextView;", "tv", "Ljz5/f0;", "setLicenseText", "Lkotlin/Function3;", "Landroid/content/Context;", "Landroid/content/Intent;", "", "callback", "setWebviewForwardCallback", "", "height", "setDialogHeight", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCommentPostRealNamePanel */
/* loaded from: classes3.dex */
public final class C14304xa96e914e extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public yz5.q f197358d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f197359e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f197360f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f197361g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f197362h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14304xa96e914e(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f197362h = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12>(a0Var) { // from class: com.tencent.mm.plugin.finder.live.view.FinderLiveCommentPostRealNamePanel$realnameNotifyListener$1
            {
                this.f39173x3fe91575 = 323604482;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12 c6256xb3fb7c12) {
                boolean z17;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12 event = c6256xb3fb7c12;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                mo48814x2efc64();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("realnameNotifyListener ");
                am.a20 a20Var = event.f136506g;
                sb6.append(a20Var.f87653a);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveCommentPostRealNamePanel", sb6.toString());
                if (a20Var.f87653a == -1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14304xa96e914e c14304xa96e914e = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14304xa96e914e.this;
                    yz5.l lVar = c14304xa96e914e.f197359e;
                    if (lVar != null) {
                        lVar.mo146xb9724478(java.lang.Boolean.TRUE);
                    }
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = c14304xa96e914e.f197360f;
                    if (z2Var == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bottomDialog");
                        throw null;
                    }
                    z2Var.B();
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (z17) {
                    ((ml2.r0) i95.n0.c(ml2.r0.class)).Dk(ml2.d4.f408896g);
                } else {
                    ((ml2.r0) i95.n0.c(ml2.r0.class)).Dk(ml2.d4.f408897h);
                }
                return false;
            }
        };
        a(context);
    }

    /* renamed from: setLicenseText */
    private final void m57268x4a05ef4c(android.widget.TextView textView) {
        java.lang.String string = textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d4l);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String string2 = textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dab, string);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        java.lang.String format = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[0], 0));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        int L = r26.n0.L(format, string, 0, false, 6, null);
        int length = string.length() + L;
        android.text.SpannableString spannableString = new android.text.SpannableString(format);
        spannableString.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.p3(this), L, length, 33);
        textView.setHighlightColor(textView.getContext().getResources().getColor(android.R.color.transparent));
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView.setText(spannableString);
    }

    public final void a(android.content.Context context) {
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.ape, this);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.f567071i11);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        ((android.widget.CheckBox) findViewById).setOnCheckedChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.n3(this));
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f567072i12);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        m57268x4a05ef4c((android.widget.TextView) findViewById2);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(context, 2, 1);
        this.f197360f = z2Var;
        z2Var.y(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gcs));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var2 = this.f197360f;
        if (z2Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bottomDialog");
            throw null;
        }
        z2Var2.F = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.o3(this, context);
        z2Var2.x(1);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var3 = this.f197360f;
        if (z2Var3 != null) {
            z2Var3.j(this);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bottomDialog");
            throw null;
        }
    }

    /* renamed from: setDialogHeight */
    public final void m57269x9b01f211(double d17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = this.f197360f;
        if (z2Var != null) {
            z2Var.u((int) d17);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bottomDialog");
            throw null;
        }
    }

    /* renamed from: setWebviewForwardCallback */
    public final void m57270x457e7ff3(yz5.q callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f197358d = callback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14304xa96e914e(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f197362h = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12>(a0Var) { // from class: com.tencent.mm.plugin.finder.live.view.FinderLiveCommentPostRealNamePanel$realnameNotifyListener$1
            {
                this.f39173x3fe91575 = 323604482;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12 c6256xb3fb7c12) {
                boolean z17;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12 event = c6256xb3fb7c12;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                mo48814x2efc64();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("realnameNotifyListener ");
                am.a20 a20Var = event.f136506g;
                sb6.append(a20Var.f87653a);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveCommentPostRealNamePanel", sb6.toString());
                if (a20Var.f87653a == -1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14304xa96e914e c14304xa96e914e = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14304xa96e914e.this;
                    yz5.l lVar = c14304xa96e914e.f197359e;
                    if (lVar != null) {
                        lVar.mo146xb9724478(java.lang.Boolean.TRUE);
                    }
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = c14304xa96e914e.f197360f;
                    if (z2Var == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bottomDialog");
                        throw null;
                    }
                    z2Var.B();
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (z17) {
                    ((ml2.r0) i95.n0.c(ml2.r0.class)).Dk(ml2.d4.f408896g);
                } else {
                    ((ml2.r0) i95.n0.c(ml2.r0.class)).Dk(ml2.d4.f408897h);
                }
                return false;
            }
        };
        a(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14304xa96e914e(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f197362h = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12>(a0Var) { // from class: com.tencent.mm.plugin.finder.live.view.FinderLiveCommentPostRealNamePanel$realnameNotifyListener$1
            {
                this.f39173x3fe91575 = 323604482;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12 c6256xb3fb7c12) {
                boolean z17;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12 event = c6256xb3fb7c12;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                mo48814x2efc64();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("realnameNotifyListener ");
                am.a20 a20Var = event.f136506g;
                sb6.append(a20Var.f87653a);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveCommentPostRealNamePanel", sb6.toString());
                if (a20Var.f87653a == -1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14304xa96e914e c14304xa96e914e = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14304xa96e914e.this;
                    yz5.l lVar = c14304xa96e914e.f197359e;
                    if (lVar != null) {
                        lVar.mo146xb9724478(java.lang.Boolean.TRUE);
                    }
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = c14304xa96e914e.f197360f;
                    if (z2Var == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bottomDialog");
                        throw null;
                    }
                    z2Var.B();
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (z17) {
                    ((ml2.r0) i95.n0.c(ml2.r0.class)).Dk(ml2.d4.f408896g);
                } else {
                    ((ml2.r0) i95.n0.c(ml2.r0.class)).Dk(ml2.d4.f408897h);
                }
                return false;
            }
        };
        a(context);
    }
}
