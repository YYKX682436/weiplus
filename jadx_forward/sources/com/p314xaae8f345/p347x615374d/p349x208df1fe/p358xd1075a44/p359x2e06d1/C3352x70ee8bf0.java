package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.MMKView */
/* loaded from: classes15.dex */
public class C3352x70ee8bf0<T extends android.view.View> extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3360x4b193f36 implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.InterfaceC3354xfe068ee1<T> {
    public static final java.lang.String TAG = "base_MMKView";

    /* renamed from: _hellAccFlag_ */
    private byte f13192x7f11beae;

    /* renamed from: backgroundDrawable */
    private android.graphics.drawable.Drawable f13194xc8562bec;

    /* renamed from: borderRadius */
    protected float f13197x506afbde;

    /* renamed from: borderWidth */
    protected float f13198x2c2c84fa;

    /* renamed from: disableDarkModeHighlight */
    private boolean f13201x4dc27473;

    /* renamed from: id, reason: collision with root package name */
    private java.lang.String f127496id;

    /* renamed from: internalDrawable */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3353xea99c5c8 f13202xe9f69e7b;

    /* renamed from: isHighlight */
    private boolean f13203x1da2ceaa;

    /* renamed from: isSecure */
    private boolean f13204xf2284d41;

    /* renamed from: mContext */
    protected android.content.Context f13206xd6cfe882;

    /* renamed from: onClickCallback */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3547x30f2fa9e f13207x2b11264e;

    /* renamed from: onLongClickCallback */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3548xe5a10d02 f13208x861e0b2;

    /* renamed from: onTouchCallback */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3549x5ca66d55 f13209x56c49905;

    /* renamed from: shadowOffset */
    protected float f13211x9a8971d3;

    /* renamed from: shadowRadius */
    protected float f13212x9f6079d2;

    /* renamed from: tmpSaveBgColor */
    private com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 f13214xc45fd84a;

    /* renamed from: uiPageDelegate */
    private java.lang.ref.WeakReference<com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3359x65bf7d3b> f13217xdd82c9e8;

    /* renamed from: view */
    protected T f13218x373aa5;

    /* renamed from: wClickAsView */
    private java.lang.ref.WeakReference<com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0> f13219x283344a8;

    /* renamed from: borderColor */
    protected com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 f13195x2b158697 = new com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284(0, 0);

    /* renamed from: borderPressedColor */
    protected com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 f13196x19bbead = new com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284(0, 0);

    /* renamed from: backgroundColor */
    protected com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 f13193x4cb7f6d5 = null;

    /* renamed from: topLeftBorderRadius */
    private float f13215x8d98d8fa = 0.0f;

    /* renamed from: topRightBorderRadius */
    private float f13216xd43c7b45 = 0.0f;

    /* renamed from: bottomLeftBorderRadius */
    private float f13199x867445d0 = 0.0f;

    /* renamed from: bottomRightBorderRadius */
    private float f13200xf6cea92f = 0.0f;

    /* renamed from: shadowColor */
    protected com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 f13210xa13e7a23 = new com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284(0, 0);

    /* renamed from: supportDynamicSize */
    protected boolean f13213x20fafd91 = true;

    /* renamed from: mAnimatorProxy */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3291x8fe71017 f13205x150a705a = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3291x8fe71017(this);

    /* renamed from: com.tencent.kinda.framework.widget.base.MMKView$8, reason: invalid class name */
    /* loaded from: classes15.dex */
    public static /* synthetic */ class AnonymousClass8 {

        /* renamed from: $SwitchMap$com$tencent$kinda$gen$Visible */
        static final /* synthetic */ int[] f13231xf0a43445;

        static {
            int[] iArr = new int[com.p314xaae8f345.p347x615374d.gen.EnumC3616x7f0a8852.m28425xcee59d22().length];
            f13231xf0a43445 = iArr;
            try {
                iArr[com.p314xaae8f345.p347x615374d.gen.EnumC3616x7f0a8852.VISIBLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f13231xf0a43445[com.p314xaae8f345.p347x615374d.gen.EnumC3616x7f0a8852.INVISIBLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f13231xf0a43445[com.p314xaae8f345.p347x615374d.gen.EnumC3616x7f0a8852.GONE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: checkIfNeedCreateBorderDrawable */
    public com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3353xea99c5c8 m27104x7075b821() {
        if (this.f13202xe9f69e7b == null) {
            this.f13202xe9f69e7b = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3353xea99c5c8(mo27110xfb86a31b());
        }
        return this.f13202xe9f69e7b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getAlpha */
    public long m27105x742757a8(long j17) {
        return j17 >> 24;
    }

    /* renamed from: isViewLayout */
    private boolean m27106x572cef9() {
        T mo27110xfb86a31b = mo27110xfb86a31b();
        if (mo27110xfb86a31b == null) {
            return false;
        }
        return (mo27110xfb86a31b.getLeft() == 0 && mo27110xfb86a31b.getTop() == 0 && mo27110xfb86a31b.getRight() == 0 && mo27110xfb86a31b.getBottom() == 0) ? false : true;
    }

    /* renamed from: removeYogaNode */
    private void m27107x5f77b136() {
        if (m27160x33ae02().mo16965x29c22ba0() != null) {
            m27160x33ae02().mo16965x29c22ba0().mo16979x73bce94b(m27160x33ae02().mo16965x29c22ba0().mo16972x73d44649(m27160x33ae02()));
        }
    }

    /* renamed from: resumeYogaNode */
    private void m27108x7468c7df() {
        if (m27160x33ae02().mo16965x29c22ba0() == null && mo27110xfb86a31b().getParent() != null && (mo27110xfb86a31b().getParent() instanceof com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda)) {
            com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda c1589x9549ddda = (com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda) mo27110xfb86a31b().getParent();
            c1589x9549ddda.m17088x3a5b5608().mo16927x9e387e8e(m27160x33ae02(), c1589x9549ddda.indexOfChild(mo27110xfb86a31b()));
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: accessibilityClickFrom */
    public void mo26181x600943a4(com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190 interfaceC3545x4499190) {
        if ((interfaceC3545x4499190 instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0) && la5.b.f399133a.g(true)) {
            final com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0 c3352x70ee8bf0 = (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0) interfaceC3545x4499190;
            c3352x70ee8bf0.mo27110xfb86a31b().post(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.MMKView.2
                @Override // java.lang.Runnable
                public void run() {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0 c3352x70ee8bf02 = this;
                    boolean z17 = true;
                    if (!(c3352x70ee8bf02 instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3349xbf2e7552) ? !(c3352x70ee8bf02 instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3312x6b7a5e46) ? c3352x70ee8bf02.f13207x2b11264e == null : ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3312x6b7a5e46) c3352x70ee8bf02).f12881xaae60fe8 == null : ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3349xbf2e7552) c3352x70ee8bf02).f13157x3a7e9a5f == null && c3352x70ee8bf02.f13207x2b11264e == null) {
                        z17 = false;
                    }
                    if (z17) {
                        c3352x70ee8bf0.f13219x283344a8 = new java.lang.ref.WeakReference(this);
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0 c3352x70ee8bf03 = c3352x70ee8bf0;
                        c3352x70ee8bf03.mo26305x4649918c(c3352x70ee8bf03.f13207x2b11264e);
                    }
                }
            });
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: accessibilityStatesType */
    public void mo26182xc449d44a(com.p314xaae8f345.p347x615374d.gen.EnumC3603x6a4cdc7c enumC3603x6a4cdc7c) {
        com.p314xaae8f345.mm.p2802xd031a825.e eVar = mo27110xfb86a31b().getAccessibilityDelegate() instanceof com.p314xaae8f345.mm.p2802xd031a825.e ? (com.p314xaae8f345.mm.p2802xd031a825.e) mo27110xfb86a31b().getAccessibilityDelegate() : new com.p314xaae8f345.mm.p2802xd031a825.e();
        eVar.m82971xfe0065e(enumC3603x6a4cdc7c);
        mo27110xfb86a31b().setAccessibilityDelegate(eVar);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: accessibilityTraitsType */
    public void mo26183x63be8ced(com.p314xaae8f345.p347x615374d.gen.EnumC3611x9c1951f enumC3611x9c1951f) {
        com.p314xaae8f345.mm.p2802xd031a825.e eVar = mo27110xfb86a31b().getAccessibilityDelegate() instanceof com.p314xaae8f345.mm.p2802xd031a825.e ? (com.p314xaae8f345.mm.p2802xd031a825.e) mo27110xfb86a31b().getAccessibilityDelegate() : new com.p314xaae8f345.mm.p2802xd031a825.e();
        eVar.m82972xbdda0201(enumC3611x9c1951f);
        mo27110xfb86a31b().setAccessibilityDelegate(eVar);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: addBlurEffect */
    public void mo26184x96296c59(int i17) {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: autoHeight */
    public void mo26185xd5941bb6() {
        this.f13268x67eca98a.m27208xd5941bb6();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: autoWidth */
    public void mo26186x628f9557() {
        this.f13268x67eca98a.m27209x628f9557();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: convertPointToScreen */
    public com.p314xaae8f345.p347x615374d.gen.C3503x8496dc05 mo26187x708b0984(com.p314xaae8f345.p347x615374d.gen.C3503x8496dc05 c3503x8496dc05) {
        return mo26188x994be9bd(c3503x8496dc05, null);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: convertPointToView */
    public com.p314xaae8f345.p347x615374d.gen.C3503x8496dc05 mo26188x994be9bd(com.p314xaae8f345.p347x615374d.gen.C3503x8496dc05 c3503x8496dc05, com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190 interfaceC3545x4499190) {
        if (c3503x8496dc05 == null || mo27110xfb86a31b() == null || mo27110xfb86a31b().getContext() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "%s call convertPointToView params illegal! point: %s, getView(): %s.", this, c3503x8496dc05, mo27110xfb86a31b());
            return new com.p314xaae8f345.p347x615374d.gen.C3503x8496dc05(0.0f, 0.0f);
        }
        int[] iArr = new int[2];
        mo27110xfb86a31b().getLocationOnScreen(new int[2]);
        if (interfaceC3545x4499190 == null) {
            iArr[1] = com.p314xaae8f345.mm.ui.bk.p(mo27110xfb86a31b().getContext());
        } else {
            ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0) interfaceC3545x4499190).mo27110xfb86a31b().getLocationOnScreen(iArr);
        }
        return new com.p314xaae8f345.p347x615374d.gen.C3503x8496dc05(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27359xc5e1a28f(mo27110xfb86a31b().getContext(), (r1[0] - iArr[0]) + c3503x8496dc05.mX), com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27359xc5e1a28f(mo27110xfb86a31b().getContext(), (r1[1] - iArr[1]) + c3503x8496dc05.mY));
    }

    /* renamed from: createView */
    public T mo26107x519d71c1(android.content.Context context) {
        return (T) new android.view.View(context);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: expandHitSize */
    public void mo26189x4cadde3a(float f17, float f18) {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27360x3c905bbd(this.f13218x373aa5, f17, f18);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getAbsoluteOriginXInScreen */
    public float mo26190xd3f2a756() {
        mo27110xfb86a31b().getLocationOnScreen(new int[2]);
        return r0[0];
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getAbsoluteOriginXInScreenDP */
    public float mo26191xa1e63262() {
        mo27110xfb86a31b().getLocationOnScreen(new int[2]);
        float mo25281x6c461726 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3139x70399ae2().mo25281x6c461726();
        return mo25281x6c461726 == 0.0f ? r0[0] : r0[0] / mo25281x6c461726;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getAbsoluteOriginYInScreen */
    public float mo26192x68371657() {
        mo27110xfb86a31b().getLocationOnScreen(new int[2]);
        return r0[1];
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getAbsoluteOriginYInScreenDP */
    public float mo26193x36cae523() {
        mo27110xfb86a31b().getLocationOnScreen(new int[2]);
        float mo25281x6c461726 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3139x70399ae2().mo25281x6c461726();
        return mo25281x6c461726 == 0.0f ? r0[1] : r0[1] / mo25281x6c461726;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getAccessibilityString */
    public java.lang.String mo26194xac4737c9() {
        return mo27110xfb86a31b().getContentDescription() == null ? "" : (java.lang.String) mo27110xfb86a31b().getContentDescription();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getAccessible */
    public boolean mo26195xaa3853ac() {
        return mo27110xfb86a31b().isImportantForAccessibility();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getAlignSelf */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3377x3c6a6e5 mo26196x68c1413b() {
        return this.f13268x67eca98a.m27212x68c1413b();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getAspectRatio */
    public float mo26198x1aef895d() {
        return this.f13268x67eca98a.m27213x1aef895d();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getBackgroundColor */
    public com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 mo26199x3119c89f() {
        com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284 = this.f13193x4cb7f6d5;
        return c3392x2ae78284 == null ? new com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284(0L, 0L) : c3392x2ae78284;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getBorderColor */
    public com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 mo26200x4ebcd61() {
        return this.f13195x2b158697;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getBorderPressedColor */
    public com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 mo26201x14f820a3() {
        return this.f13196x19bbead;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getBorderWidth */
    public float mo26202x602cbc4() {
        return this.f13198x2c2c84fa;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getBottom */
    public float mo26203x12a4bd21() {
        return m27106x572cef9() ? com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27359xc5e1a28f(mo27110xfb86a31b().getContext(), mo27110xfb86a31b().getBottom()) : this.f13268x67eca98a.m27214x12a4bd21();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getBottomLeftCornerRadius */
    public float mo26204xc2a0b82f() {
        return this.f13199x867445d0;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getBottomPercent */
    public float mo26205x49c467e4() {
        return 0.0f;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getBottomRightCornerRadius */
    public float mo26206x992d0c62() {
        return this.f13200xf6cea92f;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getClickable */
    public boolean mo26207x8a52c82c() {
        return mo27110xfb86a31b().isClickable();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getCornerRadius */
    public float mo26208x83bb89bd() {
        return this.f13197x506afbde;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getDisableHighlightDarkMode */
    public boolean mo26209xe604ca7b() {
        return this.f13201x4dc27473;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getEnableHighLight */
    public boolean mo26210x356fec1b() {
        return this.f13203x1da2ceaa;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getFlexBasis */
    public float mo26211x951b690f() {
        return this.f13268x67eca98a.m27216x951b690f();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getFlexGrow */
    public float mo26212xe3c99922() {
        return this.f13268x67eca98a.m27218xe3c99922();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getFlexShrink */
    public float mo26213x2bb64b58() {
        return this.f13268x67eca98a.m27219x2bb64b58();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getFrameOriginX */
    public float mo26214x87ecb23b() {
        if (mo27110xfb86a31b() == null || mo27110xfb86a31b().getContext() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "%s call convertPointToView params illegal!, getView(): %s.", this, mo27110xfb86a31b());
            return 0.0f;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, " get getFrameOriginX getView().getLeft(): %s.", java.lang.Integer.valueOf(mo27110xfb86a31b().getLeft()));
        return i65.a.c(mo27110xfb86a31b().getContext(), mo27110xfb86a31b().getLeft());
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getFrameOriginY */
    public float mo26215x87ecb23c() {
        if (mo27110xfb86a31b() == null || mo27110xfb86a31b().getContext() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "%s call convertPointToView params illegal!, getView(): %s.", this, mo27110xfb86a31b());
            return 0.0f;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, " get getFrameOriginY getView().getTop(): %s.", java.lang.Integer.valueOf(mo27110xfb86a31b().getTop()));
        return i65.a.c(mo27110xfb86a31b().getContext(), mo27110xfb86a31b().getTop());
    }

    /* renamed from: getHeight */
    public float mo26216x1c4fb41d() {
        return this.f13268x67eca98a.m27221x1c4fb41d();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getHeightPercent */
    public float mo26217x8fa0dd68() {
        return this.f13268x67eca98a.m27222x8fa0dd68();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getIsRefreshing */
    public boolean mo26218xcf2ee267() {
        return false;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getLeft */
    public float mo26219xfb82087d() {
        return m27106x572cef9() ? com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27359xc5e1a28f(mo27110xfb86a31b().getContext(), mo27110xfb86a31b().getLeft()) : this.f13268x67eca98a.m27224xfb82087d();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getLeftPercent */
    public float mo26220x6b58dd08() {
        return this.f13268x67eca98a.m27225x6b58dd08();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getMarginBottom */
    public float mo26221x4fb623ef() {
        return this.f13268x67eca98a.m27226x4fb623ef();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getMarginBottomPercent */
    public float mo26222xb6a65d56() {
        return this.f13268x67eca98a.m27227xb6a65d56();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getMarginLeft */
    public float mo26223x63bacacb() {
        return this.f13268x67eca98a.m27228x63bacacb();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getMarginLeftPercent */
    public float mo26224x1ebd86fa() {
        return this.f13268x67eca98a.m27229x1ebd86fa();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getMarginRight */
    public float mo26225x13f4efd8() {
        return this.f13268x67eca98a.m27230x13f4efd8();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getMarginRightPercent */
    public float mo26226x6b2f094d() {
        return this.f13268x67eca98a.m27231x6b2f094d();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getMarginTop */
    public float mo26227xc1272e11() {
        return this.f13268x67eca98a.m27232xc1272e11();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getMarginTopPercent */
    public float mo26228x8bbe08f4() {
        return this.f13268x67eca98a.m27233x8bbe08f4();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getMaxHeight */
    public float mo26229xc96bf8f5() {
        return this.f13268x67eca98a.m27234xc96bf8f5();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getMaxWidth */
    public float mo26230x93b79438() {
        return this.f13268x67eca98a.m27235x93b79438();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getMinHeight */
    public float mo26231xf7770f63() {
        return this.f13268x67eca98a.m27236xf7770f63();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getMinWidth */
    public float mo26232x29d8f80a() {
        return this.f13268x67eca98a.m27237x29d8f80a();
    }

    /* renamed from: getOnClickCallback */
    public com.p314xaae8f345.p347x615374d.gen.AbstractC3547x30f2fa9e m27109xf72f818() {
        return this.f13207x2b11264e;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getPaddingBottom */
    public float mo26233xc96f6de6() {
        return this.f13268x67eca98a.m27238xc96f6de6();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getPaddingBottomPercent */
    public float mo26234xfadb3f7f() {
        return this.f13268x67eca98a.m27239xfadb3f7f();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getPaddingLeft */
    public float mo26235x805c2682() {
        return this.f13268x67eca98a.m27240x805c2682();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getPaddingLeftPercent */
    public float mo26236x7e6df63() {
        return this.f13268x67eca98a.m27241x7e6df63();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getPaddingRight */
    public float mo26237x8b7f0b01() {
        return this.f13268x67eca98a.m27242x8b7f0b01();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getPaddingRightPercent */
    public float mo26238xa730be04() {
        return this.f13268x67eca98a.m27243xa730be04();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getPaddingTop */
    public float mo26239xf39fff7a() {
        return this.f13268x67eca98a.m27244xf39fff7a();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getPaddingTopPercent */
    public float mo26240x93437f6b() {
        return this.f13268x67eca98a.m27245x93437f6b();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getPositionType */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3592xbd33423 mo26241x62fa7279() {
        return this.f13268x67eca98a.m27246x62fa7279();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getReportId */
    public java.lang.String mo26242x62661ee5() {
        return (java.lang.String) this.f13218x373aa5.getTag(com.p314xaae8f345.mm.R.id.pgt);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getRight */
    public float mo26243x75156866() {
        return m27106x572cef9() ? com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27359xc5e1a28f(mo27110xfb86a31b().getContext(), mo27110xfb86a31b().getRight()) : this.f13268x67eca98a.m27247x75156866();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getRightPercent */
    public float mo26244xb1fe74ff() {
        return this.f13268x67eca98a.m27248xb1fe74ff();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getRotation */
    public float mo26245x79734cf4() {
        return mo27110xfb86a31b().getRotation();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getScaleX */
    public float mo26246x2ef54344() {
        return mo27110xfb86a31b().getScaleX();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getScaleY */
    public float mo26247x2ef54345() {
        return mo27110xfb86a31b().getScaleY();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getSecure */
    public boolean mo26248x2f127e6d() {
        return this.f13204xf2284d41;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getShadowColor */
    public com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 mo26249x7b14c0ed() {
        return this.f13210xa13e7a23;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getShadowOffset */
    public float mo26250xfb7c0449() {
        return 0.0f;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getShadowRadius */
    public float mo26251x530c48() {
        return 0.0f;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getSupportDynamicSize */
    public boolean mo26252x34575f87() {
        return this.f13213x20fafd91;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getTop */
    public float mo26253xb588721f() {
        return m27106x572cef9() ? com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27359xc5e1a28f(mo27110xfb86a31b().getContext(), mo27110xfb86a31b().getTop()) : this.f13268x67eca98a.m27250xb588721f();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getTopLeftCornerRadius */
    public float mo26254xb826b12d() {
        return this.f13215x8d98d8fa;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getTopPercent */
    public float mo26255x9678b926() {
        return this.f13268x67eca98a.m27251x9678b926();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getTopRightCornerRadius */
    public float mo26256x54663324() {
        return this.f13216xd43c7b45;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getTranslateX */
    public float mo26257x879df0c0() {
        return mo27110xfb86a31b().getTranslationX();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getTranslateY */
    public float mo26258x879df0c1() {
        return mo27110xfb86a31b().getTranslationY();
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.InterfaceC3354xfe068ee1
    /* renamed from: getView */
    public final T mo27110xfb86a31b() {
        return this.f13218x373aa5;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getViewId */
    public java.lang.String mo26259x346a5196() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f127496id) ? "" : this.f127496id;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getVisible */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3616x7f0a8852 mo26260x599f2c3c() {
        int visibility = mo27110xfb86a31b().getVisibility();
        return visibility != 0 ? visibility != 4 ? visibility != 8 ? com.p314xaae8f345.p347x615374d.gen.EnumC3616x7f0a8852.VISIBLE : com.p314xaae8f345.p347x615374d.gen.EnumC3616x7f0a8852.GONE : com.p314xaae8f345.p347x615374d.gen.EnumC3616x7f0a8852.INVISIBLE : com.p314xaae8f345.p347x615374d.gen.EnumC3616x7f0a8852.VISIBLE;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getWidth */
    public float mo26261x755bd410() {
        return this.f13268x67eca98a.m27253x755bd410();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getWidthPercent */
    public float mo26262x10417615() {
        return this.f13268x67eca98a.m27254x10417615();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: initWithPlatformDelegate */
    public final void mo26263xd722a12e(com.p314xaae8f345.p347x615374d.gen.InterfaceC3416x710a1004 interfaceC3416x710a1004) {
        if (interfaceC3416x710a1004 instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3359x65bf7d3b) {
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3359x65bf7d3b c3359x65bf7d3b = (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3359x65bf7d3b) interfaceC3416x710a1004;
            this.f13217xdd82c9e8 = new java.lang.ref.WeakReference<>(c3359x65bf7d3b);
            android.content.Context m27156x76847179 = c3359x65bf7d3b.m27156x76847179();
            if (m27156x76847179 != null) {
                m27112x76516a27(mo26107x519d71c1(m27156x76847179));
            }
            this.f13206xd6cfe882 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
    }

    /* renamed from: notifyChanged */
    public void mo26970x380a4f2b() {
        if (m27160x33ae02().mo16975x2008b295() && !m27160x33ae02().mo16974x7a9b50c8()) {
            m27160x33ae02().mo16932x5b2a3d2();
        }
        if (mo27110xfb86a31b() != null) {
            mo27110xfb86a31b().requestLayout();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3360x4b193f36
    /* renamed from: onFlexAttribute */
    public void mo27111x33169704() {
        mo26970x380a4f2b();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: removeBlurEffect */
    public void mo26264xd2aaac7c() {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: requestFrameImpl */
    public void mo26265xd0529f5e(final com.p314xaae8f345.p347x615374d.gen.AbstractC3632xb3751500 abstractC3632xb3751500) {
        this.f13218x373aa5.post(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.MMKView.7
            @Override // java.lang.Runnable
            public void run() {
                com.p314xaae8f345.p347x615374d.gen.C3514x447b0cf c3514x447b0cf = new com.p314xaae8f345.p347x615374d.gen.C3514x447b0cf();
                c3514x447b0cf.f13655x134dd5f3 = new com.p314xaae8f345.p347x615374d.gen.C3503x8496dc05();
                c3514x447b0cf.f13656x627560e = new com.p314xaae8f345.p347x615374d.gen.C3525x44836ec();
                c3514x447b0cf.f13655x134dd5f3.mX = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.this.f13218x373aa5.getLeft();
                c3514x447b0cf.f13655x134dd5f3.mY = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.this.f13218x373aa5.getTop();
                c3514x447b0cf.f13656x627560e.f13672xbefb7959 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.this.f13218x373aa5.getWidth();
                c3514x447b0cf.f13656x627560e.f13671x6a4b7f4 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.this.f13218x373aa5.getHeight();
                abstractC3632xb3751500.mo28500x2e7a5e(c3514x447b0cf);
            }
        });
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: requestLayout */
    public void mo26266x46ac7299() {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setAccessibilityString */
    public void mo26267xfa8bf73d(java.lang.String str) {
        mo27110xfb86a31b().setContentDescription(str);
    }

    /* renamed from: setAccessible */
    public void mo26268xd85ca1b8(boolean z17) {
        if (z17) {
            mo27110xfb86a31b().setImportantForAccessibility(1);
        } else {
            mo27110xfb86a31b().setImportantForAccessibility(2);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setAlignSelf */
    public void mo26269xc51501af(com.p314xaae8f345.p347x615374d.gen.EnumC3377x3c6a6e5 enumC3377x3c6a6e5) {
        this.f13268x67eca98a.m27258xc51501af(enumC3377x3c6a6e5);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setAlpha */
    public void mo26270x52b5721c(float f17) {
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3105x3d5fc037.m24905x460ff6e7()) {
            this.f13205x150a705a.mo26270x52b5721c(f17);
            return;
        }
        T mo27110xfb86a31b = mo27110xfb86a31b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mo27110xfb86a31b, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/MMKView", "setAlpha", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        mo27110xfb86a31b.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(mo27110xfb86a31b, "com/tencent/kinda/framework/widget/base/MMKView", "setAlpha", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setAspectRatio */
    public void mo26271xb154fcd1(float f17) {
        this.f13268x67eca98a.m27259xb154fcd1(f17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setBackgroundColor */
    public void mo26272x67f06213(com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284) {
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3105x3d5fc037.m24905x460ff6e7()) {
            toString();
            java.lang.Long.toHexString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27184x64963e11(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27189xf794c2a7(c3392x2ae78284)));
            this.f13205x150a705a.mo26272x67f06213(c3392x2ae78284);
            return;
        }
        toString();
        java.lang.Long.toHexString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27184x64963e11(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27189xf794c2a7(c3392x2ae78284)));
        this.f13193x4cb7f6d5 = c3392x2ae78284;
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27189xf794c2a7(c3392x2ae78284) >= 0) {
            m27104x7075b821().m27119x67f06213(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27355x63f50df7(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27189xf794c2a7(this.f13193x4cb7f6d5)));
            m27113xd5656b5(this.f13194xc8562bec);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setBorderColor */
    public void mo26273x9b5140d5(com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284) {
        this.f13195x2b158697 = c3392x2ae78284;
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27189xf794c2a7(c3392x2ae78284) >= 0) {
            m27104x7075b821().m27120x9b5140d5(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27355x63f50df7(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27189xf794c2a7(this.f13195x2b158697)));
            m27113xd5656b5(this.f13194xc8562bec);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setBorderPressedColor */
    public void mo26274xac23a2af(com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284) {
        this.f13196x19bbead = c3392x2ae78284;
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27189xf794c2a7(c3392x2ae78284) >= 0) {
            m27104x7075b821().m27121xac23a2af(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27355x63f50df7(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27189xf794c2a7(this.f13196x19bbead)));
            m27113xd5656b5(this.f13194xc8562bec);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setBorderWidth */
    public void mo26275x9c683f38(float f17) {
        this.f13198x2c2c84fa = f17;
        if (f17 > 0.0f) {
            m27104x7075b821().m27123x9c683f38(i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (int) f17));
            m27113xd5656b5(this.f13194xc8562bec);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setBottom */
    public void mo26276x5d9f12d(float f17) {
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3105x3d5fc037.m24905x460ff6e7()) {
            this.f13205x150a705a.mo26276x5d9f12d(f17);
        } else {
            this.f13268x67eca98a.m27260x5d9f12d(f17);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setBottomLeftCornerRadius */
    public void mo26277xf4e4543b(float f17) {
        this.f13199x867445d0 = f17;
        if (f17 >= 0.0f) {
            m27104x7075b821().m27124x228658d2(i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (int) this.f13199x867445d0));
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setBottomPercent */
    public void mo26278xdc9ace58(float f17) {
        this.f13268x67eca98a.m27261xdc9ace58(f17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setBottomRightCornerRadius */
    public void mo26279xaf5cf1d6(float f17) {
        this.f13200xf6cea92f = f17;
        if (f17 >= 0.0f) {
            m27104x7075b821().m27125xdcfef66d(i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (int) this.f13200xf6cea92f));
        }
    }

    /* renamed from: setClickable */
    public void mo26280xe6a688a0(boolean z17) {
        mo27110xfb86a31b().setClickable(z17);
    }

    /* renamed from: setCornerRadius */
    public void mo26281xba0484c9(float f17) {
        this.f13197x506afbde = f17;
        if (f17 >= 0.0f) {
            m27104x7075b821().m27122xe7a68960(i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (int) this.f13197x506afbde));
            m27113xd5656b5(this.f13194xc8562bec);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setDisableHighlightDarkMode */
    public void mo26282x95d19387(boolean z17) {
        this.f13201x4dc27473 = z17;
    }

    /* renamed from: setEnableHighLight */
    public void mo26283x6c46858f(boolean z17) {
        this.f13203x1da2ceaa = z17;
        if (mo27110xfb86a31b() == null || !this.f13203x1da2ceaa) {
            return;
        }
        mo27110xfb86a31b().setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.tencent.kinda.framework.widget.base.MMKView.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.this.f13203x1da2ceaa) {
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0 c3352x70ee8bf0 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.this;
                        com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284 = c3352x70ee8bf0.f13193x4cb7f6d5;
                        if (c3392x2ae78284 == null) {
                            c3352x70ee8bf0.f13214xc45fd84a = new com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284(0L, 0L);
                            if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.this.f13201x4dc27473) {
                                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.this.m27104x7075b821().m27119x67f06213(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.this.f13206xd6cfe882.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77907xe61cad8e));
                            } else {
                                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.this.m27104x7075b821().m27119x67f06213(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.this.f13206xd6cfe882.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77630xad7ef28));
                            }
                        } else {
                            if (c3352x70ee8bf0.m27105x742757a8(c3392x2ae78284.f13482x98ef8c0f) == 0) {
                                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0 c3352x70ee8bf02 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.this;
                                if (c3352x70ee8bf02.m27105x742757a8(c3352x70ee8bf02.f13193x4cb7f6d5.f13481x5f08b15d) == 0) {
                                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.this.f13214xc45fd84a = new com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284(0L, 0L);
                                    if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.this.f13201x4dc27473) {
                                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.this.m27104x7075b821().m27119x67f06213(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.this.f13206xd6cfe882.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77907xe61cad8e));
                                    } else {
                                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.this.m27104x7075b821().m27119x67f06213(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.this.f13206xd6cfe882.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77630xad7ef28));
                                    }
                                }
                            }
                            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0 c3352x70ee8bf03 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.this;
                            c3352x70ee8bf03.f13214xc45fd84a = c3352x70ee8bf03.f13193x4cb7f6d5;
                            if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.this.f13201x4dc27473) {
                                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.this.m27104x7075b821().m27119x67f06213((int) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27183x534eeba8(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27193xc76aa86a(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.this.f13193x4cb7f6d5), com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.this.f13206xd6cfe882.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77907xe61cad8e)));
                            } else {
                                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.this.m27104x7075b821().m27119x67f06213((int) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27183x534eeba8(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27193xc76aa86a(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.this.f13193x4cb7f6d5), com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.this.f13206xd6cfe882.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77766x20e835)));
                            }
                        }
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0 c3352x70ee8bf04 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.this;
                        c3352x70ee8bf04.m27113xd5656b5(c3352x70ee8bf04.f13194xc8562bec);
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.this.m27104x7075b821().m27119x67f06213((int) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27189xf794c2a7(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.this.f13214xc45fd84a));
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0 c3352x70ee8bf05 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.this;
                        c3352x70ee8bf05.m27113xd5656b5(c3352x70ee8bf05.f13194xc8562bec);
                    }
                }
                if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.this.f13209x56c49905 == null) {
                    return false;
                }
                com.p314xaae8f345.p347x615374d.gen.EnumC3609xa85a4635 enumC3609xa85a4635 = com.p314xaae8f345.p347x615374d.gen.EnumC3609xa85a4635.DOWN;
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1) {
                        enumC3609xa85a4635 = com.p314xaae8f345.p347x615374d.gen.EnumC3609xa85a4635.UP;
                    } else if (action == 2) {
                        enumC3609xa85a4635 = com.p314xaae8f345.p347x615374d.gen.EnumC3609xa85a4635.MOVE;
                    }
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.this.f13209x56c49905.mo28213xb05cb4a0(new com.p314xaae8f345.p347x615374d.gen.C3610x16332ebb(motionEvent.getX(), motionEvent.getY(), enumC3609xa85a4635));
                return false;
            }
        });
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setFlexBasis */
    public void mo26284xf16f2983(float f17) {
        this.f13268x67eca98a.m27262xf16f2983(f17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setFlexGrow */
    public void mo26285xde81fa2e(float f17) {
        this.f13268x67eca98a.m27264xde81fa2e(f17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setFlexShrink */
    public void mo26286x59da9964(float f17) {
        this.f13268x67eca98a.m27265x59da9964(f17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setFrameImpl */
    public void mo26287x7c3a32eb(com.p314xaae8f345.p347x615374d.gen.C3514x447b0cf c3514x447b0cf, final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619) {
        mo26332xb5c23ecc(c3514x447b0cf.f13655x134dd5f3.mX);
        mo26333xb5c23ecd(c3514x447b0cf.f13655x134dd5f3.mY);
        mo26336x53e9ee84(c3514x447b0cf.f13656x627560e.f13672xbefb7959);
        mo26288xf84e829(c3514x447b0cf.f13656x627560e.f13671x6a4b7f4);
        this.f13218x373aa5.post(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.MMKView.6
            @Override // java.lang.Runnable
            public void run() {
                abstractC3623x3b485619.mo25801x2e7a5e();
            }
        });
    }

    /* renamed from: setHeight */
    public void mo26288xf84e829(float f17) {
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3105x3d5fc037.m24905x460ff6e7()) {
            this.f13205x150a705a.mo26288xf84e829(f17);
        } else {
            this.f13268x67eca98a.m27267xf84e829(f17);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setHeightPercent */
    public void mo26289x227743dc(float f17) {
        this.f13268x67eca98a.m27268x227743dc(f17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setIsRefreshing */
    public void mo26290x577dd73(boolean z17) {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setLeft */
    public void mo26291x764ccf89(float f17) {
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3105x3d5fc037.m24905x460ff6e7()) {
            this.f13205x150a705a.mo26291x764ccf89(f17);
        } else {
            this.f13268x67eca98a.m27270x764ccf89(f17);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setLeftPercent */
    public void mo26292x1be507c(float f17) {
        this.f13268x67eca98a.m27271x1be507c(f17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setMarginBottom */
    public void mo26293x85ff1efb(float f17) {
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3105x3d5fc037.m24905x460ff6e7()) {
            this.f13205x150a705a.mo26293x85ff1efb(f17);
            return;
        }
        this.f13268x67eca98a.m27272x85ff1efb(f17);
        if (mo27110xfb86a31b().getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) {
            ((android.view.ViewGroup.MarginLayoutParams) mo27110xfb86a31b().getLayoutParams()).bottomMargin = (int) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27357xb0f6c08f(this.f13206xd6cfe882, mo26221x4fb623ef());
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setMarginBottomPercent */
    public void mo26294x4eb1cca(float f17) {
        this.f13268x67eca98a.m27273x4eb1cca(f17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setMarginLeft */
    public void mo26295x91df18d7(float f17) {
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3105x3d5fc037.m24905x460ff6e7()) {
            this.f13205x150a705a.mo26295x91df18d7(f17);
            return;
        }
        this.f13268x67eca98a.m27274x91df18d7(f17);
        if (mo27110xfb86a31b().getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) {
            ((android.view.ViewGroup.MarginLayoutParams) mo27110xfb86a31b().getLayoutParams()).leftMargin = (int) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27357xb0f6c08f(this.f13206xd6cfe882, mo26223x63bacacb());
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setMarginLeftPercent */
    public void mo26296xfa53936e(float f17) {
        this.f13268x67eca98a.m27275xfa53936e(f17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setMarginRight */
    public void mo26297xaa5a634c(float f17) {
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3105x3d5fc037.m24905x460ff6e7()) {
            this.f13205x150a705a.mo26297xaa5a634c(f17);
            return;
        }
        this.f13268x67eca98a.m27276xaa5a634c(f17);
        if (mo27110xfb86a31b().getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) {
            ((android.view.ViewGroup.MarginLayoutParams) mo27110xfb86a31b().getLayoutParams()).rightMargin = (int) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27357xb0f6c08f(this.f13206xd6cfe882, mo26225x13f4efd8());
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setMarginRightPercent */
    public void mo26298x25a8b59(float f17) {
        this.f13268x67eca98a.m27277x25a8b59(f17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setMarginTop */
    public void mo26299x1d7aee85(float f17) {
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3105x3d5fc037.m24905x460ff6e7()) {
            this.f13205x150a705a.mo26299x1d7aee85(f17);
            return;
        }
        this.f13268x67eca98a.m27278x1d7aee85(f17);
        if (mo27110xfb86a31b().getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) {
            ((android.view.ViewGroup.MarginLayoutParams) mo27110xfb86a31b().getLayoutParams()).topMargin = (int) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27357xb0f6c08f(this.f13206xd6cfe882, mo26227xc1272e11());
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setMarginTopPercent */
    public void mo26300x2fba9e00(float f17) {
        this.f13268x67eca98a.m27279x2fba9e00(f17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setMaxHeight */
    public void mo26301x25bfb969(float f17) {
        this.f13268x67eca98a.m27280x25bfb969(f17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setMaxWidth */
    public void mo26302x8e6ff544(float f17) {
        this.f13268x67eca98a.m27281x8e6ff544(f17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setMinHeight */
    public void mo26303x53cacfd7(float f17) {
        this.f13268x67eca98a.m27282x53cacfd7(f17);
    }

    /* renamed from: setMinWidth */
    public void mo26304x24915916(float f17) {
        this.f13268x67eca98a.m27283x24915916(f17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setOnClickCallback */
    public void mo26305x4649918c(com.p314xaae8f345.p347x615374d.gen.AbstractC3547x30f2fa9e abstractC3547x30f2fa9e) {
        this.f13207x2b11264e = abstractC3547x30f2fa9e;
        mo27110xfb86a31b().setOnClickListener(new com.p314xaae8f345.mm.p2802xd031a825.ui.z1(true, 800L) { // from class: com.tencent.kinda.framework.widget.base.MMKView.3
            @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
            /* renamed from: onRealClick */
            public void mo27114xc7e50b6b(android.view.View view) {
                if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.this.f13207x2b11264e != null) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.this.f13207x2b11264e.mo28203xaf6b9ae9(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.this);
                    return;
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0 c3352x70ee8bf0 = (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.this.f13219x283344a8.get();
                if (c3352x70ee8bf0 == null || !la5.b.f399133a.g(true)) {
                    return;
                }
                if (c3352x70ee8bf0 instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3349xbf2e7552) {
                    com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619 = ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3349xbf2e7552) c3352x70ee8bf0).f13157x3a7e9a5f;
                    if (abstractC3623x3b485619 != null) {
                        abstractC3623x3b485619.mo25801x2e7a5e();
                        return;
                    } else {
                        if (c3352x70ee8bf0.f13207x2b11264e != null) {
                            c3352x70ee8bf0.f13207x2b11264e.mo28203xaf6b9ae9(c3352x70ee8bf0);
                            return;
                        }
                        return;
                    }
                }
                if (!(c3352x70ee8bf0 instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3312x6b7a5e46)) {
                    if (c3352x70ee8bf0.f13207x2b11264e != null) {
                        c3352x70ee8bf0.f13207x2b11264e.mo28203xaf6b9ae9(c3352x70ee8bf0);
                    }
                } else {
                    com.p314xaae8f345.p347x615374d.gen.AbstractC3527xc1844fac abstractC3527xc1844fac = ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3312x6b7a5e46) c3352x70ee8bf0).f12881xaae60fe8;
                    if (abstractC3527xc1844fac != null) {
                        abstractC3527xc1844fac.mo28151x6fe8be83();
                    }
                }
            }
        });
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setOnLongClickCallback */
    public void mo26306xaed67cf0(com.p314xaae8f345.p347x615374d.gen.AbstractC3548xe5a10d02 abstractC3548xe5a10d02) {
        this.f13208x861e0b2 = abstractC3548xe5a10d02;
        mo27110xfb86a31b().setOnLongClickListener(new android.view.View.OnLongClickListener() { // from class: com.tencent.kinda.framework.widget.base.MMKView.4
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(android.view.View view) {
                if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.this.f13208x861e0b2 == null) {
                    return false;
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.this.f13208x861e0b2.mo28208x43ef94d(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.this);
                return false;
            }
        });
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setOnTouchCallback */
    public void mo26307x71fd0443(com.p314xaae8f345.p347x615374d.gen.AbstractC3549x5ca66d55 abstractC3549x5ca66d55) {
        this.f13209x56c49905 = abstractC3549x5ca66d55;
        if (mo27110xfb86a31b() != null) {
            mo27110xfb86a31b().setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.tencent.kinda.framework.widget.base.MMKView.5
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                    if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.this.f13209x56c49905 == null) {
                        return false;
                    }
                    com.p314xaae8f345.p347x615374d.gen.EnumC3609xa85a4635 enumC3609xa85a4635 = com.p314xaae8f345.p347x615374d.gen.EnumC3609xa85a4635.DOWN;
                    int action = motionEvent.getAction();
                    if (action != 0) {
                        if (action == 1) {
                            enumC3609xa85a4635 = com.p314xaae8f345.p347x615374d.gen.EnumC3609xa85a4635.UP;
                        } else if (action == 2) {
                            enumC3609xa85a4635 = com.p314xaae8f345.p347x615374d.gen.EnumC3609xa85a4635.MOVE;
                        }
                    }
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.this.f13209x56c49905.mo28213xb05cb4a0(new com.p314xaae8f345.p347x615374d.gen.C3610x16332ebb(motionEvent.getX(), motionEvent.getY(), enumC3609xa85a4635));
                    return false;
                }
            });
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setPaddingBottom */
    public void mo26308x5c45d45a(float f17) {
        this.f13268x67eca98a.m27284x5c45d45a(f17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setPaddingBottomPercent */
    public void mo26309x752e6e8b(float f17) {
        this.f13268x67eca98a.m27285x752e6e8b(f17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setPaddingLeft */
    public void mo26310x16c199f6(float f17) {
        this.f13268x67eca98a.m27286x16c199f6(f17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setPaddingLeftPercent */
    public void mo26311x9f12616f(float f17) {
        this.f13268x67eca98a.m27287x9f12616f(f17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setPaddingRight */
    public void mo26312xc1c8060d(float f17) {
        this.f13268x67eca98a.m27288xc1c8060d(f17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setPaddingRightPercent */
    public void mo26313xf5757d78(float f17) {
        this.f13268x67eca98a.m27289xf5757d78(f17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setPaddingTop */
    public void mo26314x21c44d86(float f17) {
        this.f13268x67eca98a.m27290x21c44d86(f17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setPaddingTopPercent */
    public void mo26315x6ed98bdf(float f17) {
        this.f13268x67eca98a.m27291x6ed98bdf(f17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setPositionType */
    public void mo26316x99436d85(com.p314xaae8f345.p347x615374d.gen.EnumC3592xbd33423 enumC3592xbd33423) {
        this.f13268x67eca98a.m27292x99436d85(enumC3592xbd33423);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setReportId */
    public void mo26317x5d1e7ff1(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        this.f13218x373aa5.setTag(com.p314xaae8f345.mm.R.id.pgt, str);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setRight */
    public void mo26318x53a382da(float f17) {
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3105x3d5fc037.m24905x460ff6e7()) {
            this.f13205x150a705a.mo26318x53a382da(f17);
        } else {
            this.f13268x67eca98a.m27293x53a382da(f17);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setRightPercent */
    public void mo26319xe847700b(float f17) {
        this.f13268x67eca98a.m27294xe847700b(f17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setRotation */
    public void mo26320x742bae00(float f17) {
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3105x3d5fc037.m24905x460ff6e7()) {
            this.f13205x150a705a.mo26320x742bae00(f17);
        } else {
            mo27110xfb86a31b().setRotation(f17);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setScaleX */
    public void mo26321x222a7750(float f17) {
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3105x3d5fc037.m24905x460ff6e7()) {
            this.f13205x150a705a.mo26321x222a7750(f17);
        } else {
            mo27110xfb86a31b().setScaleX(f17);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setScaleY */
    public void mo26322x222a7751(float f17) {
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3105x3d5fc037.m24905x460ff6e7()) {
            this.f13205x150a705a.mo26322x222a7751(f17);
        } else {
            mo27110xfb86a31b().setScaleY(f17);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setSecure */
    public void mo26323x2247b279(boolean z17) {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3359x65bf7d3b c3359x65bf7d3b;
        android.content.Context m27156x76847179;
        com.p314xaae8f345.mm.p642xad8b531f.s sVar = ((km0.c) gm0.j1.p().a()).f390525f;
        if (sVar != null && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1(sVar.c(".com.tencent.mm.debug.kinda_secure_page_flag"), 0) == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "secure switch true, because debugger");
            return;
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_kinda_secure_page_flag, 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "setSecure %s, enableValue: %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(Ni));
        if (Ni != 1) {
            return;
        }
        this.f13204xf2284d41 = z17;
        java.lang.ref.WeakReference<com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3359x65bf7d3b> weakReference = this.f13217xdd82c9e8;
        if (weakReference == null || weakReference.get() == null || (m27156x76847179 = (c3359x65bf7d3b = this.f13217xdd82c9e8.get()).m27156x76847179()) == null || !(m27156x76847179 instanceof android.app.Activity)) {
            return;
        }
        android.app.Activity activity = (android.app.Activity) m27156x76847179;
        if (activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        if (!this.f13204xf2284d41) {
            c3359x65bf7d3b.m27158x9b3e7660(java.lang.Integer.valueOf(hashCode()));
            return;
        }
        c3359x65bf7d3b.m27155x5ebd363d(hashCode());
        activity.getWindow().addFlags(8192);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_revert_overlay_hidden, false) || android.os.Build.VERSION.SDK_INT < 31) {
            return;
        }
        try {
            if (b3.l.m9698x3fed0563(m27156x76847179, "android.permission.HIDE_OVERLAY_WINDOWS") == 0) {
                activity.getWindow().setHideOverlayWindows(true);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "no permission");
                jx3.f.INSTANCE.mo68478xbd3cda5f(28867, "100");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setShadowColor */
    public void mo26324x117a3461(com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284) {
        this.f13210xa13e7a23 = c3392x2ae78284;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setShadowOffset */
    public void mo26325x31c4ff55(float f17) {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setShadowRadius */
    public void mo26326x369c0754(float f17) {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setSupportDynamicSize */
    public void mo26327xcb82e193(boolean z17) {
        this.f13213x20fafd91 = z17;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setTop */
    public void mo26328xca029993(float f17) {
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3105x3d5fc037.m24905x460ff6e7()) {
            this.f13205x150a705a.mo26328xca029993(f17);
        } else {
            this.f13268x67eca98a.m27296xca029993(f17);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setTopLeftCornerRadius */
    public void mo26329x66b70a1(float f17) {
        this.f13215x8d98d8fa = f17;
        if (f17 >= 0.0f) {
            m27104x7075b821().m27127x340d7538(i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (int) this.f13215x8d98d8fa));
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setTopPercent */
    public void mo26330xc49d0732(float f17) {
        this.f13268x67eca98a.m27297xc49d0732(f17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setTopRightCornerRadius */
    public void mo26331xceb96230(float f17) {
        this.f13216xd43c7b45 = f17;
        if (f17 >= 0.0f) {
            m27104x7075b821().m27128xfc5b66c7(i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (int) this.f13216xd43c7b45));
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setTranslateX */
    public void mo26332xb5c23ecc(float f17) {
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3105x3d5fc037.m24905x460ff6e7()) {
            this.f13205x150a705a.mo26332xb5c23ecc(f17);
        } else {
            mo27110xfb86a31b().setTranslationX(f17);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setTranslateY */
    public void mo26333xb5c23ecd(float f17) {
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3105x3d5fc037.m24905x460ff6e7()) {
            this.f13205x150a705a.mo26333xb5c23ecd(f17);
        } else {
            mo27110xfb86a31b().setTranslationY(f17);
        }
    }

    /* renamed from: setView */
    public final void m27112x76516a27(T t17) {
        this.f13218x373aa5 = t17;
    }

    /* renamed from: setViewBackground */
    public void m27113xd5656b5(android.graphics.drawable.Drawable drawable) {
        this.f13194xc8562bec = drawable;
        if (drawable == null && this.f13202xe9f69e7b != null) {
            mo27110xfb86a31b().setBackground(this.f13202xe9f69e7b);
            return;
        }
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3353xea99c5c8 c3353xea99c5c8 = this.f13202xe9f69e7b;
        if (c3353xea99c5c8 == null && drawable != null) {
            mo27110xfb86a31b().setBackground(this.f13194xc8562bec);
        } else if (c3353xea99c5c8 != null) {
            c3353xea99c5c8.m27126xb797fb99(drawable);
            mo27110xfb86a31b().setBackground(this.f13202xe9f69e7b);
        }
    }

    /* renamed from: setViewId */
    public void mo26334x279f85a2(java.lang.String str) {
        this.f127496id = str;
        this.f13268x67eca98a.m27295x2403c84f(str);
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27361x5304a1db(this.f13206xd6cfe882, str, mo27110xfb86a31b());
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setVisible */
    public void mo26335xcd1079b0(com.p314xaae8f345.p347x615374d.gen.EnumC3616x7f0a8852 enumC3616x7f0a8852) {
        int i17 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.AnonymousClass8.f13231xf0a43445[enumC3616x7f0a8852.ordinal()];
        if (i17 == 1) {
            T mo27110xfb86a31b = mo27110xfb86a31b();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(mo27110xfb86a31b, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/MMKView", "setVisible", "(Lcom/tencent/kinda/gen/Visible;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo27110xfb86a31b.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(mo27110xfb86a31b, "com/tencent/kinda/framework/widget/base/MMKView", "setVisible", "(Lcom/tencent/kinda/gen/Visible;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f13268x67eca98a.m27298x901b6914(0);
            m27108x7468c7df();
        } else if (i17 == 2) {
            T mo27110xfb86a31b2 = mo27110xfb86a31b();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(mo27110xfb86a31b2, arrayList2.toArray(), "com/tencent/kinda/framework/widget/base/MMKView", "setVisible", "(Lcom/tencent/kinda/gen/Visible;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo27110xfb86a31b2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(mo27110xfb86a31b2, "com/tencent/kinda/framework/widget/base/MMKView", "setVisible", "(Lcom/tencent/kinda/gen/Visible;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f13268x67eca98a.m27298x901b6914(4);
        } else if (i17 == 3) {
            T mo27110xfb86a31b3 = mo27110xfb86a31b();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(mo27110xfb86a31b3, arrayList3.toArray(), "com/tencent/kinda/framework/widget/base/MMKView", "setVisible", "(Lcom/tencent/kinda/gen/Visible;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo27110xfb86a31b3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(mo27110xfb86a31b3, "com/tencent/kinda/framework/widget/base/MMKView", "setVisible", "(Lcom/tencent/kinda/gen/Visible;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f13268x67eca98a.m27298x901b6914(8);
            m27107x5f77b136();
        }
        mo26970x380a4f2b();
    }

    /* renamed from: setWidth */
    public void mo26336x53e9ee84(float f17) {
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3105x3d5fc037.m24905x460ff6e7()) {
            this.f13205x150a705a.mo26336x53e9ee84(f17);
        } else {
            this.f13268x67eca98a.m27299x53e9ee84(f17);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setWidthPercent */
    public void mo26337x468a7121(float f17) {
        this.f13268x67eca98a.m27300x468a7121(f17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getAlpha */
    public float mo26197x742757a8() {
        return mo27110xfb86a31b().getAlpha();
    }
}
