package io.p3284xd2ae381c.p3320x373aa5;

/* renamed from: io.flutter.view.AccessibilityBridge */
/* loaded from: classes15.dex */
public class C28974x81a86657 extends android.view.accessibility.AccessibilityNodeProvider {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f72138x7118e671 = false;

    /* renamed from: ACTION_SHOW_ON_SCREEN */
    private static final int f72139xde2d1d33 = 16908342;

    /* renamed from: BOLD_TEXT_WEIGHT_ADJUSTMENT */
    private static final int f72140x8fcb79fc = 300;

    /* renamed from: DEFAULT_TRANSITION_ANIMATION_SCALE */
    private static final float f72141xd9a97283 = 1.0f;

    /* renamed from: DISABLED_TRANSITION_ANIMATION_SCALE */
    private static final float f72142x764d4948 = 0.0f;

    /* renamed from: MIN_ENGINE_GENERATED_NODE_ID */
    private static final int f72145xd945d258 = 65536;

    /* renamed from: ROOT_NODE_ID */
    private static final int f72146xa7fc0e1b = 0;

    /* renamed from: SCROLL_EXTENT_FOR_INFINITY */
    private static final float f72148x427cd381 = 100000.0f;

    /* renamed from: SCROLL_POSITION_CAP_FOR_INFINITY */
    private static final float f72149x3e596dcf = 70000.0f;
    private static final java.lang.String TAG = "AccessibilityBridge";

    /* renamed from: accessibilityChannel */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28652xd6ce13f5 f72151xcb08dfd5;

    /* renamed from: accessibilityFeatureFlags */
    private int f72152x1f187d9f;

    /* renamed from: accessibilityFocusedSemanticsNode */
    private io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode f72153x6b716f46;

    /* renamed from: accessibilityManager */
    private final android.view.accessibility.AccessibilityManager f72154xd0c6727f;

    /* renamed from: accessibilityMessageHandler */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28652xd6ce13f5.AccessibilityMessageHandler f72155xc0a85631;

    /* renamed from: accessibilityStateChangeListener */
    private final android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener f72156x8e9f0347;

    /* renamed from: accessibilityViewEmbedder */
    private final io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab f72157xf593d4cb;

    /* renamed from: accessibleNavigation */
    private boolean f72158xabe0d66a;

    /* renamed from: animationScaleObserver */
    private final android.database.ContentObserver f72159xe547c11c;

    /* renamed from: contentResolver */
    private final android.content.ContentResolver f72160x7c1dcb9f;

    /* renamed from: customAccessibilityActions */
    private final java.util.Map<java.lang.Integer, io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.CustomAccessibilityAction> f72161xaea48e0;

    /* renamed from: embeddedAccessibilityFocusedNodeId */
    private java.lang.Integer f72162x3f41bc90;

    /* renamed from: embeddedInputFocusedNodeId */
    private java.lang.Integer f72163x56d15994;

    /* renamed from: flutterNavigationStack */
    private final java.util.List<java.lang.Integer> f72164x50bab918;

    /* renamed from: flutterSemanticsTree */
    private final java.util.Map<java.lang.Integer, io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode> f72165x2c7eb9ef;

    /* renamed from: hoveredObject */
    private io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode f72166x764a35fa;

    /* renamed from: inputFocusedSemanticsNode */
    private io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode f72167xa90efc2;

    /* renamed from: isReleased */
    private boolean f72168xafdb8087;

    /* renamed from: lastInputFocusedSemanticsNode */
    private io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode f72169xc753b1cc;

    /* renamed from: lastLeftFrameInset */
    private java.lang.Integer f72170x9f47234d;

    /* renamed from: onAccessibilityChangeListener */
    private io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.OnAccessibilityChangeListener f72171xdcd1e013;

    /* renamed from: platformViewsAccessibilityDelegate */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28723x24b38218 f72172xc8ac05f8;

    /* renamed from: previousRouteId */
    private int f72173xab39364d;

    /* renamed from: rootAccessibilityView */
    private final android.view.View f72174x2eff7851;

    /* renamed from: touchExplorationStateChangeListener */
    private final android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener f72175xcbd4a771;

    /* renamed from: SCROLLABLE_ACTIONS */
    private static final int f72147xf55a1e45 = ((io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.SCROLL_RIGHT.f72215x6ac9171 | io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.SCROLL_LEFT.f72215x6ac9171) | io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.SCROLL_UP.f72215x6ac9171) | io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.SCROLL_DOWN.f72215x6ac9171;

    /* renamed from: FOCUSABLE_FLAGS */
    private static final int f72144x8528d1fa = ((((((((((io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.HAS_CHECKED_STATE.f72252x6ac9171 | io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.IS_CHECKED.f72252x6ac9171) | io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.IS_SELECTED.f72252x6ac9171) | io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.IS_TEXT_FIELD.f72252x6ac9171) | io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.IS_FOCUSED.f72252x6ac9171) | io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.HAS_ENABLED_STATE.f72252x6ac9171) | io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.IS_ENABLED.f72252x6ac9171) | io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.IS_IN_MUTUALLY_EXCLUSIVE_GROUP.f72252x6ac9171) | io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.HAS_TOGGLED_STATE.f72252x6ac9171) | io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.IS_TOGGLED.f72252x6ac9171) | io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.IS_FOCUSABLE.f72252x6ac9171) | io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.IS_SLIDER.f72252x6ac9171;

    /* renamed from: FIRST_RESOURCE_ID */
    private static int f72143x4c0f77bd = 267386881;

    /* renamed from: systemAction */
    static int f72150xb7583d45 = (io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.DID_GAIN_ACCESSIBILITY_FOCUS.f72215x6ac9171 & io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.DID_LOSE_ACCESSIBILITY_FOCUS.f72215x6ac9171) & io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.SHOW_ON_SCREEN.f72215x6ac9171;

    /* renamed from: io.flutter.view.AccessibilityBridge$5, reason: invalid class name */
    /* loaded from: classes15.dex */
    public static /* synthetic */ class AnonymousClass5 {

        /* renamed from: $SwitchMap$io$flutter$view$AccessibilityBridge$StringAttributeType */
        static final /* synthetic */ int[] f72181x66a987df;

        static {
            int[] iArr = new int[io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.StringAttributeType.m139597xcee59d22().length];
            f72181x66a987df = iArr;
            try {
                iArr[io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.StringAttributeType.SPELLOUT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f72181x66a987df[io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.StringAttributeType.LOCALE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f72181x66a987df[io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.StringAttributeType.URL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: io.flutter.view.AccessibilityBridge$AccessibilityFeature */
    /* loaded from: classes8.dex */
    public enum AccessibilityFeature {
        ACCESSIBLE_NAVIGATION(1),
        INVERT_COLORS(2),
        DISABLE_ANIMATIONS(4),
        BOLD_TEXT(8),
        REDUCE_MOTION(16),
        HIGH_CONTRAST(32),
        ON_OFF_SWITCH_LABELS(64),
        NO_ANNOUNCE(128);


        /* renamed from: value */
        final int f72191x6ac9171;

        AccessibilityFeature(int i17) {
            this.f72191x6ac9171 = i17;
        }
    }

    /* renamed from: io.flutter.view.AccessibilityBridge$Action */
    /* loaded from: classes15.dex */
    public enum Action {
        TAP(1),
        LONG_PRESS(2),
        SCROLL_LEFT(4),
        SCROLL_RIGHT(8),
        SCROLL_UP(16),
        SCROLL_DOWN(32),
        INCREASE(64),
        DECREASE(128),
        SHOW_ON_SCREEN(256),
        MOVE_CURSOR_FORWARD_BY_CHARACTER(512),
        MOVE_CURSOR_BACKWARD_BY_CHARACTER(1024),
        SET_SELECTION(2048),
        COPY(4096),
        CUT(8192),
        PASTE(16384),
        DID_GAIN_ACCESSIBILITY_FOCUS(32768),
        DID_LOSE_ACCESSIBILITY_FOCUS(65536),
        CUSTOM_ACTION(131072),
        DISMISS(262144),
        MOVE_CURSOR_FORWARD_BY_WORD(524288),
        MOVE_CURSOR_BACKWARD_BY_WORD(1048576),
        SET_TEXT(2097152),
        FOCUS(4194304),
        SCROLL_TO_OFFSET(8388608);


        /* renamed from: value */
        public final int f72215x6ac9171;

        Action(int i17) {
            this.f72215x6ac9171 = i17;
        }
    }

    /* renamed from: io.flutter.view.AccessibilityBridge$CustomAccessibilityAction */
    /* loaded from: classes15.dex */
    public static class CustomAccessibilityAction {

        /* renamed from: hint */
        private java.lang.String f72216x30de87;

        /* renamed from: label */
        private java.lang.String f72217x61f7ef4;

        /* renamed from: resourceId */
        private int f72219xafcb01c9 = -1;

        /* renamed from: id, reason: collision with root package name */
        private int f374926id = -1;

        /* renamed from: overrideId */
        private int f72218x963f6207 = -1;
    }

    /* renamed from: io.flutter.view.AccessibilityBridge$Flag */
    /* loaded from: classes15.dex */
    public enum Flag {
        HAS_CHECKED_STATE(1),
        IS_CHECKED(2),
        IS_SELECTED(4),
        IS_BUTTON(8),
        IS_TEXT_FIELD(16),
        IS_FOCUSED(32),
        HAS_ENABLED_STATE(64),
        IS_ENABLED(128),
        IS_IN_MUTUALLY_EXCLUSIVE_GROUP(256),
        IS_HEADER(512),
        IS_OBSCURED(1024),
        SCOPES_ROUTE(2048),
        NAMES_ROUTE(4096),
        IS_HIDDEN(8192),
        IS_IMAGE(16384),
        IS_LIVE_REGION(32768),
        HAS_TOGGLED_STATE(65536),
        IS_TOGGLED(131072),
        HAS_IMPLICIT_SCROLLING(262144),
        IS_MULTILINE(524288),
        IS_READ_ONLY(1048576),
        IS_FOCUSABLE(2097152),
        IS_LINK(4194304),
        IS_SLIDER(8388608),
        IS_KEYBOARD_KEY(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb),
        IS_CHECK_STATE_MIXED(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432),
        HAS_EXPANDED_STATE(67108864),
        IS_EXPANDED(134217728),
        HAS_SELECTED_STATE(268435456),
        HAS_REQUIRED_STATE(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965),
        IS_REQUIRED(1073741824);


        /* renamed from: value */
        final int f72252x6ac9171;

        Flag(int i17) {
            this.f72252x6ac9171 = i17;
        }
    }

    /* renamed from: io.flutter.view.AccessibilityBridge$LocaleStringAttribute */
    /* loaded from: classes15.dex */
    public static class LocaleStringAttribute extends io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.StringAttribute {

        /* renamed from: locale */
        java.lang.String f72253xbe960e5a;

        private LocaleStringAttribute() {
            super();
        }
    }

    /* renamed from: io.flutter.view.AccessibilityBridge$OnAccessibilityChangeListener */
    /* loaded from: classes15.dex */
    public interface OnAccessibilityChangeListener {
        /* renamed from: onAccessibilityChanged */
        void mo137287x94836205(boolean z17, boolean z18);
    }

    /* renamed from: io.flutter.view.AccessibilityBridge$SemanticsNode */
    /* loaded from: classes15.dex */
    public static class SemanticsNode {

        /* renamed from: accessibilityBridge */
        final io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657 f72254x36f49e77;

        /* renamed from: actions */
        private int f72255xbac048fd;

        /* renamed from: bottom */
        private float f72256xad8d9a2b;

        /* renamed from: currentValueLength */
        private int f72259x6fbc147e;

        /* renamed from: customAccessibilityActions */
        private java.util.List<io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.CustomAccessibilityAction> f72260xaea48e0;

        /* renamed from: decreasedValue */
        private java.lang.String f72261x6351598b;

        /* renamed from: decreasedValueAttributes */
        private java.util.List<io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.StringAttribute> f72262x1b62ad42;

        /* renamed from: flags */
        private long f72263x5cfee87;

        /* renamed from: globalRect */
        private android.graphics.Rect f72265xcccf4827;

        /* renamed from: globalTransform */
        private float[] f72266xfd7def09;

        /* renamed from: hint */
        private java.lang.String f72268x30de87;

        /* renamed from: hintAttributes */
        private java.util.List<io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.StringAttribute> f72269xeacd273e;

        /* renamed from: identifier */
        private java.lang.String f72270x9f88aca9;

        /* renamed from: increasedValue */
        private java.lang.String f72271x2f41842f;

        /* renamed from: increasedValueAttributes */
        private java.util.List<io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.StringAttribute> f72272xa328dae6;

        /* renamed from: inverseTransform */
        private float[] f72273xbe0a461c;

        /* renamed from: label */
        private java.lang.String f72275x61f7ef4;

        /* renamed from: labelAttributes */
        private java.util.List<io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.StringAttribute> f72276x3453e36b;

        /* renamed from: left */
        private float f72277x32a007;

        /* renamed from: linkUrl */
        private java.lang.String f72278xa8de315;

        /* renamed from: maxValueLength */
        private int f72279x28129bb3;

        /* renamed from: onLongPressOverride */
        private io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.CustomAccessibilityAction f72280x1035cff4;

        /* renamed from: onTapOverride */
        private io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.CustomAccessibilityAction f72281x25657530;

        /* renamed from: parent */
        private io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode f72282xc4ab08aa;

        /* renamed from: platformViewId */
        private int f72283xd23420f3;

        /* renamed from: previousActions */
        private int f72284x13623206;

        /* renamed from: previousFlags */
        private long f72285xeeba85d0;

        /* renamed from: previousLabel */
        private java.lang.String f72286xef0a163d;

        /* renamed from: previousScrollExtentMax */
        private float f72288x1c2c8596;

        /* renamed from: previousScrollExtentMin */
        private float f72289x1c2c8684;

        /* renamed from: previousScrollPosition */
        private float f72290xf4da51ed;

        /* renamed from: previousTextSelectionBase */
        private int f72291x9686b419;

        /* renamed from: previousTextSelectionExtent */
        private int f72292x160d3a72;

        /* renamed from: previousValue */
        private java.lang.String f72293xef9728ba;

        /* renamed from: right */
        private float f72294x677c21c;

        /* renamed from: scrollChildren */
        private int f72295xb2318bec;

        /* renamed from: scrollExtentMax */
        private float f72296x751bb58d;

        /* renamed from: scrollExtentMin */
        private float f72297x751bb67b;

        /* renamed from: scrollIndex */
        private int f72298x79e38a05;

        /* renamed from: scrollPosition */
        private float f72299x7bd9c716;

        /* renamed from: textDirection */
        private io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.TextDirection f72300xd70264d2;

        /* renamed from: textSelectionBase */
        private int f72301x7069c250;

        /* renamed from: textSelectionExtent */
        private int f72302x36596e9;

        /* renamed from: tooltip */
        private java.lang.String f72303xbc0bd003;
        private float top;

        /* renamed from: transform */
        private float[] f72304x3ebe6b6c;

        /* renamed from: value */
        private java.lang.String f72305x6ac9171;

        /* renamed from: valueAttributes */
        private java.util.List<io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.StringAttribute> f72306x70ddbda8;

        /* renamed from: id, reason: collision with root package name */
        private int f374927id = -1;

        /* renamed from: previousNodeId */
        private int f72287xf6689094 = -1;

        /* renamed from: hadPreviousConfig */
        private boolean f72267xfeeb6484 = false;

        /* renamed from: childrenInTraversalOrder */
        private java.util.List<io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode> f72258x52e2dd4 = new java.util.ArrayList();

        /* renamed from: childrenInHitTestOrder */
        private java.util.List<io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode> f72257x3a61512d = new java.util.ArrayList();

        /* renamed from: inverseTransformDirty */
        private boolean f72274x1f28df16 = true;

        /* renamed from: globalGeometryDirty */
        private boolean f72264xa1f8f9d = true;

        public SemanticsNode(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657 c28974x81a86657) {
            this.f72254x36f49e77 = c28974x81a86657;
        }

        /* renamed from: access$2212 */
        public static /* synthetic */ int m139527xbf18d3a1(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode semanticsNode, int i17) {
            int i18 = semanticsNode.f72302x36596e9 + i17;
            semanticsNode.f72302x36596e9 = i18;
            return i18;
        }

        /* renamed from: access$2220 */
        public static /* synthetic */ int m139528xbf18d3be(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode semanticsNode, int i17) {
            int i18 = semanticsNode.f72302x36596e9 - i17;
            semanticsNode.f72302x36596e9 = i18;
            return i18;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: collectRoutes */
        public void m139570xa7d0dd14(java.util.List<io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode> list) {
            if (m139587x29842926(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.SCOPES_ROUTE)) {
                list.add(this);
            }
            java.util.Iterator<io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode> it = this.f72258x52e2dd4.iterator();
            while (it.hasNext()) {
                it.next().m139570xa7d0dd14(list);
            }
        }

        /* renamed from: createSpannableString */
        private android.text.SpannableString m139571x63bcbad3(java.lang.String str, java.util.List<io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.StringAttribute> list) {
            if (str == null) {
                return null;
            }
            android.text.SpannableString spannableString = new android.text.SpannableString(str);
            if (list != null) {
                for (io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.StringAttribute stringAttribute : list) {
                    int i17 = io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.AnonymousClass5.f72181x66a987df[stringAttribute.f72308x368f3a.ordinal()];
                    if (i17 == 1) {
                        spannableString.setSpan(new android.text.style.TtsSpan.Builder("android.type.verbatim").build(), stringAttribute.f72307x68ac462, stringAttribute.end, 0);
                    } else if (i17 == 2) {
                        spannableString.setSpan(new android.text.style.LocaleSpan(java.util.Locale.forLanguageTag(((io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.LocaleStringAttribute) stringAttribute).f72253xbe960e5a)), stringAttribute.f72307x68ac462, stringAttribute.end, 0);
                    } else if (i17 == 3) {
                        spannableString.setSpan(new android.text.style.URLSpan(((io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.UrlStringAttribute) stringAttribute).url), stringAttribute.f72307x68ac462, stringAttribute.end, 0);
                    }
                }
            }
            return spannableString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: didChangeLabel */
        public boolean m139572xf7cf725() {
            java.lang.String str;
            java.lang.String str2 = this.f72275x61f7ef4;
            if (str2 == null && this.f72286xef0a163d == null) {
                return false;
            }
            return str2 == null || (str = this.f72286xef0a163d) == null || !str2.equals(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: didScroll */
        public boolean m139573xc350bc2c() {
            return (java.lang.Float.isNaN(this.f72299x7bd9c716) || java.lang.Float.isNaN(this.f72290xf4da51ed) || this.f72290xf4da51ed == this.f72299x7bd9c716) ? false : true;
        }

        /* renamed from: ensureInverseTransform */
        private void m139574x70d7ea7a() {
            if (this.f72274x1f28df16) {
                this.f72274x1f28df16 = false;
                if (this.f72273xbe0a461c == null) {
                    this.f72273xbe0a461c = new float[16];
                }
                if (android.opengl.Matrix.invertM(this.f72273xbe0a461c, 0, this.f72304x3ebe6b6c, 0)) {
                    return;
                }
                java.util.Arrays.fill(this.f72273xbe0a461c, 0.0f);
            }
        }

        /* renamed from: getAncestor */
        private io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode m139575x41cec749(io.p3284xd2ae381c.p3319x36f002.InterfaceC28971x2718c997<io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode> interfaceC28971x2718c997) {
            for (io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode semanticsNode = this.f72282xc4ab08aa; semanticsNode != null; semanticsNode = semanticsNode.f72282xc4ab08aa) {
                if (interfaceC28971x2718c997.mo139418x364492(semanticsNode)) {
                    return semanticsNode;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: getGlobalRect */
        public android.graphics.Rect m139576xbb10001d() {
            return this.f72265xcccf4827;
        }

        /* renamed from: getHint */
        private java.lang.CharSequence m139577xfb8046fd() {
            return m139571x63bcbad3(this.f72268x30de87, this.f72269xeacd273e);
        }

        /* renamed from: getLabel */
        private java.lang.CharSequence m139578x74bd253e() {
            java.util.List<io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.StringAttribute> list = this.f72276x3453e36b;
            java.lang.String str = this.f72278xa8de315;
            if (str != null && str.length() > 0) {
                list = list == null ? new java.util.ArrayList<>() : new java.util.ArrayList<>(list);
                io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.UrlStringAttribute urlStringAttribute = new io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.UrlStringAttribute();
                urlStringAttribute.f72307x68ac462 = 0;
                urlStringAttribute.end = this.f72275x61f7ef4.length();
                urlStringAttribute.url = this.f72278xa8de315;
                urlStringAttribute.f72308x368f3a = io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.StringAttributeType.URL;
                list.add(urlStringAttribute);
            }
            return m139571x63bcbad3(this.f72275x61f7ef4, list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: getRouteName */
        public java.lang.String m139579x968c5be() {
            java.lang.String str;
            if (m139587x29842926(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.NAMES_ROUTE) && (str = this.f72275x61f7ef4) != null && !str.isEmpty()) {
                return this.f72275x61f7ef4;
            }
            java.util.Iterator<io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode> it = this.f72258x52e2dd4.iterator();
            while (it.hasNext()) {
                java.lang.String m139579x968c5be = it.next().m139579x968c5be();
                if (m139579x968c5be != null && !m139579x968c5be.isEmpty()) {
                    return m139579x968c5be;
                }
            }
            return null;
        }

        /* renamed from: getStringAttributesFromBuffer */
        private java.util.List<io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.StringAttribute> m139580x9da0a2e8(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer[] byteBufferArr) {
            int i17 = byteBuffer.getInt();
            if (i17 == -1) {
                return null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(i17);
            for (int i18 = 0; i18 < i17; i18++) {
                int i19 = byteBuffer.getInt();
                int i27 = byteBuffer.getInt();
                io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.StringAttributeType stringAttributeType = io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.StringAttributeType.m139597xcee59d22()[byteBuffer.getInt()];
                int i28 = io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.AnonymousClass5.f72181x66a987df[stringAttributeType.ordinal()];
                if (i28 == 1) {
                    byteBuffer.getInt();
                    io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SpellOutStringAttribute spellOutStringAttribute = new io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SpellOutStringAttribute();
                    spellOutStringAttribute.f72307x68ac462 = i19;
                    spellOutStringAttribute.end = i27;
                    spellOutStringAttribute.f72308x368f3a = stringAttributeType;
                    arrayList.add(spellOutStringAttribute);
                } else if (i28 == 2) {
                    java.nio.ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                    io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.LocaleStringAttribute localeStringAttribute = new io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.LocaleStringAttribute();
                    localeStringAttribute.f72307x68ac462 = i19;
                    localeStringAttribute.end = i27;
                    localeStringAttribute.f72308x368f3a = stringAttributeType;
                    localeStringAttribute.f72253xbe960e5a = java.nio.charset.Charset.forName(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c).decode(byteBuffer2).toString();
                    arrayList.add(localeStringAttribute);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: getTextFieldHint */
        public java.lang.CharSequence m139581x1926003e() {
            java.lang.CharSequence[] charSequenceArr = {m139578x74bd253e(), m139577xfb8046fd()};
            java.lang.CharSequence charSequence = null;
            for (int i17 = 0; i17 < 2; i17++) {
                java.lang.CharSequence charSequence2 = charSequenceArr[i17];
                if (charSequence2 != null && charSequence2.length() > 0) {
                    charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : android.text.TextUtils.concat(charSequence, ", ", charSequence2);
                }
            }
            return charSequence;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: getValue */
        public java.lang.CharSequence m139582x754a37bb() {
            return m139571x63bcbad3(this.f72305x6ac9171, this.f72306x70ddbda8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: getValueLabelHint */
        public java.lang.CharSequence m139583x6a1ca220() {
            java.lang.CharSequence[] charSequenceArr = {m139582x754a37bb(), m139578x74bd253e(), m139577xfb8046fd()};
            java.lang.CharSequence charSequence = null;
            for (int i17 = 0; i17 < 3; i17++) {
                java.lang.CharSequence charSequence2 = charSequenceArr[i17];
                if (charSequence2 != null && charSequence2.length() > 0) {
                    charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : android.text.TextUtils.concat(charSequence, ", ", charSequence2);
                }
            }
            return charSequence;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: hadAction */
        public boolean m139584xb6a2a8a1(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action action) {
            return (action.f72215x6ac9171 & this.f72284x13623206) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: hadFlag */
        public boolean m139585x28b0c897(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag flag) {
            return (this.f72285xeeba85d0 & ((long) flag.f72252x6ac9171)) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: hasAction */
        public boolean m139586xd0202170(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action action) {
            return (action.f72215x6ac9171 & this.f72255xbac048fd) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: hasFlag */
        public boolean m139587x29842926(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag flag) {
            return (this.f72263x5cfee87 & ((long) flag.f72252x6ac9171)) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: hitTest */
        public io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode m139588x373f4ac5(float[] fArr, boolean z17) {
            float f17 = fArr[3];
            boolean z18 = false;
            float f18 = fArr[0] / f17;
            float f19 = fArr[1] / f17;
            if (f18 < this.f72277x32a007 || f18 >= this.f72294x677c21c || f19 < this.top || f19 >= this.f72256xad8d9a2b) {
                return null;
            }
            float[] fArr2 = new float[4];
            for (io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode semanticsNode : this.f72257x3a61512d) {
                if (!semanticsNode.m139587x29842926(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.IS_HIDDEN)) {
                    semanticsNode.m139574x70d7ea7a();
                    android.opengl.Matrix.multiplyMV(fArr2, 0, semanticsNode.f72273xbe0a461c, 0, fArr, 0);
                    io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode m139588x373f4ac5 = semanticsNode.m139588x373f4ac5(fArr2, z17);
                    if (m139588x373f4ac5 != null) {
                        return m139588x373f4ac5;
                    }
                }
            }
            if (z17 && this.f72283xd23420f3 != -1) {
                z18 = true;
            }
            if (m139589xa7560028() || z18) {
                return this;
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: isFocusable */
        public boolean m139589xa7560028() {
            java.lang.String str;
            java.lang.String str2;
            java.lang.String str3;
            if (m139587x29842926(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.SCOPES_ROUTE)) {
                return false;
            }
            if (m139587x29842926(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.IS_FOCUSABLE)) {
                return true;
            }
            return ((this.f72255xbac048fd & (~io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.f72147xf55a1e45)) == 0 && (this.f72263x5cfee87 & ((long) io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.f72144x8528d1fa)) == 0 && ((str = this.f72275x61f7ef4) == null || str.isEmpty()) && (((str2 = this.f72305x6ac9171) == null || str2.isEmpty()) && ((str3 = this.f72268x30de87) == null || str3.isEmpty()))) ? false : true;
        }

        private void log(java.lang.String str, boolean z17) {
        }

        private float max(float f17, float f18, float f19, float f27) {
            return java.lang.Math.max(f17, java.lang.Math.max(f18, java.lang.Math.max(f19, f27)));
        }

        private float min(float f17, float f18, float f19, float f27) {
            return java.lang.Math.min(f17, java.lang.Math.min(f18, java.lang.Math.min(f19, f27)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: nullableHasAncestor */
        public static boolean m139590x672ff86c(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode semanticsNode, io.p3284xd2ae381c.p3319x36f002.InterfaceC28971x2718c997<io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode> interfaceC28971x2718c997) {
            return (semanticsNode == null || semanticsNode.m139575x41cec749(interfaceC28971x2718c997) == null) ? false : true;
        }

        /* renamed from: transformPoint */
        private void m139591x9b733d84(float[] fArr, float[] fArr2, float[] fArr3) {
            android.opengl.Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
            float f17 = fArr[3];
            fArr[0] = fArr[0] / f17;
            fArr[1] = fArr[1] / f17;
            fArr[2] = fArr[2] / f17;
            fArr[3] = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: updateRecursively */
        public void m139592x940574b6(float[] fArr, java.util.Set<io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode> set, boolean z17) {
            if (this.f72304x3ebe6b6c == null) {
                return;
            }
            set.add(this);
            if (this.f72264xa1f8f9d) {
                z17 = true;
            }
            if (z17) {
                if (this.f72266xfd7def09 == null) {
                    this.f72266xfd7def09 = new float[16];
                }
                if (this.f72304x3ebe6b6c == null) {
                    this.f72304x3ebe6b6c = new float[16];
                }
                android.opengl.Matrix.multiplyMM(this.f72266xfd7def09, 0, fArr, 0, this.f72304x3ebe6b6c, 0);
                float[] fArr2 = {this.f72277x32a007, this.top, 0.0f, 1.0f};
                float[] fArr3 = new float[4];
                float[] fArr4 = new float[4];
                float[] fArr5 = new float[4];
                float[] fArr6 = new float[4];
                m139591x9b733d84(fArr3, this.f72266xfd7def09, fArr2);
                fArr2[0] = this.f72294x677c21c;
                fArr2[1] = this.top;
                m139591x9b733d84(fArr4, this.f72266xfd7def09, fArr2);
                fArr2[0] = this.f72294x677c21c;
                fArr2[1] = this.f72256xad8d9a2b;
                m139591x9b733d84(fArr5, this.f72266xfd7def09, fArr2);
                fArr2[0] = this.f72277x32a007;
                fArr2[1] = this.f72256xad8d9a2b;
                m139591x9b733d84(fArr6, this.f72266xfd7def09, fArr2);
                if (this.f72265xcccf4827 == null) {
                    this.f72265xcccf4827 = new android.graphics.Rect();
                }
                this.f72265xcccf4827.set(java.lang.Math.round(min(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), java.lang.Math.round(min(fArr3[1], fArr4[1], fArr5[1], fArr6[1])), java.lang.Math.round(max(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), java.lang.Math.round(max(fArr3[1], fArr4[1], fArr5[1], fArr6[1])));
                this.f72264xa1f8f9d = false;
            }
            int i17 = -1;
            for (io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode semanticsNode : this.f72258x52e2dd4) {
                semanticsNode.f72287xf6689094 = i17;
                i17 = semanticsNode.f374927id;
                semanticsNode.m139592x940574b6(this.f72266xfd7def09, set, z17);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: updateWith */
        public void m139593xee5dd12f(java.nio.ByteBuffer byteBuffer, java.lang.String[] strArr, java.nio.ByteBuffer[] byteBufferArr) {
            this.f72267xfeeb6484 = true;
            this.f72293xef9728ba = this.f72305x6ac9171;
            this.f72286xef0a163d = this.f72275x61f7ef4;
            this.f72285xeeba85d0 = this.f72263x5cfee87;
            this.f72284x13623206 = this.f72255xbac048fd;
            this.f72291x9686b419 = this.f72301x7069c250;
            this.f72292x160d3a72 = this.f72302x36596e9;
            this.f72290xf4da51ed = this.f72299x7bd9c716;
            this.f72288x1c2c8596 = this.f72296x751bb58d;
            this.f72289x1c2c8684 = this.f72297x751bb67b;
            this.f72263x5cfee87 = byteBuffer.getLong();
            this.f72255xbac048fd = byteBuffer.getInt();
            this.f72279x28129bb3 = byteBuffer.getInt();
            this.f72259x6fbc147e = byteBuffer.getInt();
            this.f72301x7069c250 = byteBuffer.getInt();
            this.f72302x36596e9 = byteBuffer.getInt();
            this.f72283xd23420f3 = byteBuffer.getInt();
            this.f72295xb2318bec = byteBuffer.getInt();
            this.f72298x79e38a05 = byteBuffer.getInt();
            this.f72299x7bd9c716 = byteBuffer.getFloat();
            this.f72296x751bb58d = byteBuffer.getFloat();
            this.f72297x751bb67b = byteBuffer.getFloat();
            int i17 = byteBuffer.getInt();
            this.f72270x9f88aca9 = i17 == -1 ? null : strArr[i17];
            int i18 = byteBuffer.getInt();
            this.f72275x61f7ef4 = i18 == -1 ? null : strArr[i18];
            this.f72276x3453e36b = m139580x9da0a2e8(byteBuffer, byteBufferArr);
            int i19 = byteBuffer.getInt();
            this.f72305x6ac9171 = i19 == -1 ? null : strArr[i19];
            this.f72306x70ddbda8 = m139580x9da0a2e8(byteBuffer, byteBufferArr);
            int i27 = byteBuffer.getInt();
            this.f72271x2f41842f = i27 == -1 ? null : strArr[i27];
            this.f72272xa328dae6 = m139580x9da0a2e8(byteBuffer, byteBufferArr);
            int i28 = byteBuffer.getInt();
            this.f72261x6351598b = i28 == -1 ? null : strArr[i28];
            this.f72262x1b62ad42 = m139580x9da0a2e8(byteBuffer, byteBufferArr);
            int i29 = byteBuffer.getInt();
            this.f72268x30de87 = i29 == -1 ? null : strArr[i29];
            this.f72269xeacd273e = m139580x9da0a2e8(byteBuffer, byteBufferArr);
            int i37 = byteBuffer.getInt();
            this.f72303xbc0bd003 = i37 == -1 ? null : strArr[i37];
            int i38 = byteBuffer.getInt();
            this.f72278xa8de315 = i38 == -1 ? null : strArr[i38];
            this.f72300xd70264d2 = io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.TextDirection.m139600xdc92efe5(byteBuffer.getInt());
            this.f72277x32a007 = byteBuffer.getFloat();
            this.top = byteBuffer.getFloat();
            this.f72294x677c21c = byteBuffer.getFloat();
            this.f72256xad8d9a2b = byteBuffer.getFloat();
            if (this.f72304x3ebe6b6c == null) {
                this.f72304x3ebe6b6c = new float[16];
            }
            for (int i39 = 0; i39 < 16; i39++) {
                this.f72304x3ebe6b6c[i39] = byteBuffer.getFloat();
            }
            this.f72274x1f28df16 = true;
            this.f72264xa1f8f9d = true;
            int i47 = byteBuffer.getInt();
            this.f72258x52e2dd4.clear();
            this.f72257x3a61512d.clear();
            for (int i48 = 0; i48 < i47; i48++) {
                io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode m139455x9fe17ada = this.f72254x36f49e77.m139455x9fe17ada(byteBuffer.getInt());
                m139455x9fe17ada.f72282xc4ab08aa = this;
                this.f72258x52e2dd4.add(m139455x9fe17ada);
            }
            for (int i49 = 0; i49 < i47; i49++) {
                io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode m139455x9fe17ada2 = this.f72254x36f49e77.m139455x9fe17ada(byteBuffer.getInt());
                m139455x9fe17ada2.f72282xc4ab08aa = this;
                this.f72257x3a61512d.add(m139455x9fe17ada2);
            }
            int i57 = byteBuffer.getInt();
            if (i57 == 0) {
                this.f72260xaea48e0 = null;
                return;
            }
            java.util.List<io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.CustomAccessibilityAction> list = this.f72260xaea48e0;
            if (list == null) {
                this.f72260xaea48e0 = new java.util.ArrayList(i57);
            } else {
                list.clear();
            }
            for (int i58 = 0; i58 < i57; i58++) {
                io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.CustomAccessibilityAction m139454xda61c0af = this.f72254x36f49e77.m139454xda61c0af(byteBuffer.getInt());
                if (m139454xda61c0af.f72218x963f6207 == io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.TAP.f72215x6ac9171) {
                    this.f72281x25657530 = m139454xda61c0af;
                } else if (m139454xda61c0af.f72218x963f6207 == io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.LONG_PRESS.f72215x6ac9171) {
                    this.f72280x1035cff4 = m139454xda61c0af;
                } else {
                    this.f72260xaea48e0.add(m139454xda61c0af);
                }
                this.f72260xaea48e0.add(m139454xda61c0af);
            }
        }
    }

    /* renamed from: io.flutter.view.AccessibilityBridge$SpellOutStringAttribute */
    /* loaded from: classes15.dex */
    public static class SpellOutStringAttribute extends io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.StringAttribute {
        private SpellOutStringAttribute() {
            super();
        }
    }

    /* renamed from: io.flutter.view.AccessibilityBridge$StringAttribute */
    /* loaded from: classes15.dex */
    public static class StringAttribute {
        int end;

        /* renamed from: start */
        int f72307x68ac462;

        /* renamed from: type */
        io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.StringAttributeType f72308x368f3a;

        private StringAttribute() {
        }
    }

    /* renamed from: io.flutter.view.AccessibilityBridge$StringAttributeType */
    /* loaded from: classes15.dex */
    public enum StringAttributeType {
        SPELLOUT,
        LOCALE,
        URL
    }

    /* renamed from: io.flutter.view.AccessibilityBridge$TextDirection */
    /* loaded from: classes6.dex */
    public enum TextDirection {
        UNKNOWN,
        LTR,
        RTL;

        /* renamed from: fromInt */
        public static io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.TextDirection m139600xdc92efe5(int i17) {
            return i17 != 1 ? i17 != 2 ? UNKNOWN : LTR : RTL;
        }
    }

    /* renamed from: io.flutter.view.AccessibilityBridge$UrlStringAttribute */
    /* loaded from: classes15.dex */
    public static class UrlStringAttribute extends io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.StringAttribute {
        java.lang.String url;

        private UrlStringAttribute() {
            super();
        }
    }

    public C28974x81a86657(android.view.View view, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28652xd6ce13f5 c28652xd6ce13f5, android.view.accessibility.AccessibilityManager accessibilityManager, android.content.ContentResolver contentResolver, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28723x24b38218 interfaceC28723x24b38218) {
        this(view, c28652xd6ce13f5, accessibilityManager, contentResolver, new io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab(view, 65536), interfaceC28723x24b38218);
    }

    /* renamed from: access$1172 */
    public static /* synthetic */ int m139435xbf185c3b(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657 c28974x81a86657, int i17) {
        int i18 = i17 & c28974x81a86657.f72152x1f187d9f;
        c28974x81a86657.f72152x1f187d9f = i18;
        return i18;
    }

    /* renamed from: access$1176 */
    public static /* synthetic */ int m139436xbf185c3f(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657 c28974x81a86657, int i17) {
        int i18 = i17 | c28974x81a86657.f72152x1f187d9f;
        c28974x81a86657.f72152x1f187d9f = i18;
        return i18;
    }

    /* renamed from: createTextChangedEvent */
    private android.view.accessibility.AccessibilityEvent m139451x60d85b2f(int i17, java.lang.String str, java.lang.String str2) {
        android.view.accessibility.AccessibilityEvent m139461x78943f71 = m139461x78943f71(i17, 16);
        m139461x78943f71.setBeforeText(str);
        m139461x78943f71.getText().add(str2);
        int i18 = 0;
        while (i18 < str.length() && i18 < str2.length() && str.charAt(i18) == str2.charAt(i18)) {
            i18++;
        }
        if (i18 >= str.length() && i18 >= str2.length()) {
            return null;
        }
        m139461x78943f71.setFromIndex(i18);
        int length = str.length() - 1;
        int length2 = str2.length() - 1;
        while (length >= i18 && length2 >= i18 && str.charAt(length) == str2.charAt(length2)) {
            length--;
            length2--;
        }
        m139461x78943f71.setRemovedCount((length - i18) + 1);
        m139461x78943f71.setAddedCount((length2 - i18) + 1);
        return m139461x78943f71;
    }

    /* renamed from: doesLayoutInDisplayCutoutModeRequireLeftInset */
    private boolean m139452xa8f1d0da() {
        android.app.Activity m139426x19263085 = io.p3284xd2ae381c.p3319x36f002.C28973x1922e4ec.m139426x19263085(this.f72174x2eff7851.getContext());
        if (m139426x19263085 == null || m139426x19263085.getWindow() == null) {
            return false;
        }
        int i17 = m139426x19263085.getWindow().getAttributes().layoutInDisplayCutoutMode;
        return i17 == 2 || i17 == 0;
    }

    /* renamed from: getBoundsInScreen */
    private android.graphics.Rect m139453x43a02cbc(android.graphics.Rect rect) {
        android.graphics.Rect rect2 = new android.graphics.Rect(rect);
        int[] iArr = new int[2];
        this.f72174x2eff7851.getLocationOnScreen(iArr);
        rect2.offset(iArr[0], iArr[1]);
        return rect2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getOrCreateAccessibilityAction */
    public io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.CustomAccessibilityAction m139454xda61c0af(int i17) {
        io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.CustomAccessibilityAction customAccessibilityAction = this.f72161xaea48e0.get(java.lang.Integer.valueOf(i17));
        if (customAccessibilityAction != null) {
            return customAccessibilityAction;
        }
        io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.CustomAccessibilityAction customAccessibilityAction2 = new io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.CustomAccessibilityAction();
        customAccessibilityAction2.f374926id = i17;
        customAccessibilityAction2.f72219xafcb01c9 = f72143x4c0f77bd + i17;
        this.f72161xaea48e0.put(java.lang.Integer.valueOf(i17), customAccessibilityAction2);
        return customAccessibilityAction2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getOrCreateSemanticsNode */
    public io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode m139455x9fe17ada(int i17) {
        io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode semanticsNode = this.f72165x2c7eb9ef.get(java.lang.Integer.valueOf(i17));
        if (semanticsNode != null) {
            return semanticsNode;
        }
        io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode semanticsNode2 = new io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode(this);
        semanticsNode2.f374927id = i17;
        this.f72165x2c7eb9ef.put(java.lang.Integer.valueOf(i17), semanticsNode2);
        return semanticsNode2;
    }

    /* renamed from: getRootSemanticsNode */
    private io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode m139456xd7c82497() {
        return this.f72165x2c7eb9ef.get(0);
    }

    /* renamed from: handleTouchExploration */
    private void m139457xa90eebac(float f17, float f18, boolean z17) {
        io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode m139588x373f4ac5;
        if (this.f72165x2c7eb9ef.isEmpty() || (m139588x373f4ac5 = m139456xd7c82497().m139588x373f4ac5(new float[]{f17, f18, 0.0f, 1.0f}, z17)) == this.f72166x764a35fa) {
            return;
        }
        if (m139588x373f4ac5 != null) {
            m139487xf64a1b94(m139588x373f4ac5.f374927id, 128);
        }
        io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode semanticsNode = this.f72166x764a35fa;
        if (semanticsNode != null) {
            m139487xf64a1b94(semanticsNode.f374927id, 256);
        }
        this.f72166x764a35fa = m139588x373f4ac5;
    }

    /* renamed from: isImportant */
    private boolean m139458x39cf6a18(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode semanticsNode) {
        if (semanticsNode.m139587x29842926(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.SCOPES_ROUTE)) {
            return false;
        }
        return (semanticsNode.m139583x6a1ca220() == null && (semanticsNode.f72255xbac048fd & (~f72150xb7583d45)) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$shouldSetCollectionInfo$0 */
    public static /* synthetic */ boolean m139459xd3775f2a(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode semanticsNode, io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode semanticsNode2) {
        return semanticsNode2 == semanticsNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$shouldSetCollectionInfo$1 */
    public static /* synthetic */ boolean m139460xd3775f2b(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode semanticsNode) {
        return semanticsNode.m139587x29842926(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.HAS_IMPLICIT_SCROLLING);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: obtainAccessibilityEvent */
    public android.view.accessibility.AccessibilityEvent m139461x78943f71(int i17, int i18) {
        android.view.accessibility.AccessibilityEvent m139480x78943f71 = m139480x78943f71(i18);
        m139480x78943f71.setPackageName(this.f72174x2eff7851.getContext().getPackageName());
        m139480x78943f71.setSource(this.f72174x2eff7851, i17);
        return m139480x78943f71;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onTouchExplorationExit */
    public void m139462x558a0121() {
        io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode semanticsNode = this.f72166x764a35fa;
        if (semanticsNode != null) {
            m139487xf64a1b94(semanticsNode.f374927id, 256);
            this.f72166x764a35fa = null;
        }
    }

    /* renamed from: onWindowNameChange */
    private void m139463x5ae0662a(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode semanticsNode) {
        java.lang.String m139579x968c5be = semanticsNode.m139579x968c5be();
        if (m139579x968c5be == null) {
            m139579x968c5be = " ";
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            m139470x179cb924(m139579x968c5be);
            return;
        }
        android.view.accessibility.AccessibilityEvent m139461x78943f71 = m139461x78943f71(semanticsNode.f374927id, 32);
        m139461x78943f71.getText().add(m139579x968c5be);
        m139467xf64a1b94(m139461x78943f71);
    }

    /* renamed from: performCursorMoveAction */
    private boolean m139464xee234ade(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode semanticsNode, int i17, android.os.Bundle bundle, boolean z17) {
        int i18 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z18 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i19 = semanticsNode.f72301x7069c250;
        int i27 = semanticsNode.f72302x36596e9;
        m139466xfd76535e(semanticsNode, i18, z17, z18);
        if (i19 != semanticsNode.f72301x7069c250 || i27 != semanticsNode.f72302x36596e9) {
            java.lang.String str = semanticsNode.f72305x6ac9171 != null ? semanticsNode.f72305x6ac9171 : "";
            android.view.accessibility.AccessibilityEvent m139461x78943f71 = m139461x78943f71(semanticsNode.f374927id, 8192);
            m139461x78943f71.getText().add(str);
            m139461x78943f71.setFromIndex(semanticsNode.f72301x7069c250);
            m139461x78943f71.setToIndex(semanticsNode.f72302x36596e9);
            m139461x78943f71.setItemCount(str.length());
            m139467xf64a1b94(m139461x78943f71);
        }
        if (i18 == 1) {
            if (z17) {
                io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action action = io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (semanticsNode.m139586xd0202170(action)) {
                    this.f72151xcb08dfd5.m138143x92ca6029(i17, action, java.lang.Boolean.valueOf(z18));
                    return true;
                }
            }
            if (z17) {
                return false;
            }
            io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action action2 = io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
            if (!semanticsNode.m139586xd0202170(action2)) {
                return false;
            }
            this.f72151xcb08dfd5.m138143x92ca6029(i17, action2, java.lang.Boolean.valueOf(z18));
            return true;
        }
        if (i18 != 2) {
            return i18 == 4 || i18 == 8 || i18 == 16;
        }
        if (z17) {
            io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action action3 = io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.MOVE_CURSOR_FORWARD_BY_WORD;
            if (semanticsNode.m139586xd0202170(action3)) {
                this.f72151xcb08dfd5.m138143x92ca6029(i17, action3, java.lang.Boolean.valueOf(z18));
                return true;
            }
        }
        if (z17) {
            return false;
        }
        io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action action4 = io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.MOVE_CURSOR_BACKWARD_BY_WORD;
        if (!semanticsNode.m139586xd0202170(action4)) {
            return false;
        }
        this.f72151xcb08dfd5.m138143x92ca6029(i17, action4, java.lang.Boolean.valueOf(z18));
        return true;
    }

    /* renamed from: performSetText */
    private boolean m139465xb1af460e(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode semanticsNode, int i17, android.os.Bundle bundle) {
        java.lang.String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
        this.f72151xcb08dfd5.m138143x92ca6029(i17, io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.SET_TEXT, string);
        semanticsNode.f72305x6ac9171 = string;
        semanticsNode.f72306x70ddbda8 = null;
        return true;
    }

    /* renamed from: predictCursorMovement */
    private void m139466xfd76535e(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode semanticsNode, int i17, boolean z17, boolean z18) {
        if (semanticsNode.f72302x36596e9 < 0 || semanticsNode.f72301x7069c250 < 0) {
            return;
        }
        if (i17 != 1) {
            if (i17 != 2) {
                if (i17 != 4) {
                    if (i17 == 8 || i17 == 16) {
                        if (z17) {
                            semanticsNode.f72302x36596e9 = semanticsNode.f72305x6ac9171.length();
                        } else {
                            semanticsNode.f72302x36596e9 = 0;
                        }
                    }
                } else if (z17 && semanticsNode.f72302x36596e9 < semanticsNode.f72305x6ac9171.length()) {
                    java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("(?!^)(\\n)").matcher(semanticsNode.f72305x6ac9171.substring(semanticsNode.f72302x36596e9));
                    if (matcher.find()) {
                        io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode.m139527xbf18d3a1(semanticsNode, matcher.start(1));
                    } else {
                        semanticsNode.f72302x36596e9 = semanticsNode.f72305x6ac9171.length();
                    }
                } else if (!z17 && semanticsNode.f72302x36596e9 > 0) {
                    java.util.regex.Matcher matcher2 = java.util.regex.Pattern.compile("(?s:.*)(\\n)").matcher(semanticsNode.f72305x6ac9171.substring(0, semanticsNode.f72302x36596e9));
                    if (matcher2.find()) {
                        semanticsNode.f72302x36596e9 = matcher2.start(1);
                    } else {
                        semanticsNode.f72302x36596e9 = 0;
                    }
                }
            } else if (z17 && semanticsNode.f72302x36596e9 < semanticsNode.f72305x6ac9171.length()) {
                java.util.regex.Matcher matcher3 = java.util.regex.Pattern.compile("\\p{L}(\\b)").matcher(semanticsNode.f72305x6ac9171.substring(semanticsNode.f72302x36596e9));
                matcher3.find();
                if (matcher3.find()) {
                    io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode.m139527xbf18d3a1(semanticsNode, matcher3.start(1));
                } else {
                    semanticsNode.f72302x36596e9 = semanticsNode.f72305x6ac9171.length();
                }
            } else if (!z17 && semanticsNode.f72302x36596e9 > 0) {
                java.util.regex.Matcher matcher4 = java.util.regex.Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(semanticsNode.f72305x6ac9171.substring(0, semanticsNode.f72302x36596e9));
                if (matcher4.find()) {
                    semanticsNode.f72302x36596e9 = matcher4.start(1);
                }
            }
        } else if (z17 && semanticsNode.f72302x36596e9 < semanticsNode.f72305x6ac9171.length()) {
            io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode.m139527xbf18d3a1(semanticsNode, 1);
        } else if (!z17 && semanticsNode.f72302x36596e9 > 0) {
            io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode.m139528xbf18d3be(semanticsNode, 1);
        }
        if (z18) {
            return;
        }
        semanticsNode.f72301x7069c250 = semanticsNode.f72302x36596e9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sendLatestAccessibilityFlagsToFlutter */
    public void m139468x7282f499() {
        this.f72151xcb08dfd5.m138146xb1a6069(this.f72152x1f187d9f);
    }

    /* renamed from: sendWindowContentChangeEvent */
    private void m139469x3330b249(int i17) {
        android.view.accessibility.AccessibilityEvent m139461x78943f71 = m139461x78943f71(i17, 2048);
        m139461x78943f71.setContentChangeTypes(1);
        m139467xf64a1b94(m139461x78943f71);
    }

    /* renamed from: setAccessibilityPaneTitle */
    private void m139470x179cb924(java.lang.String str) {
        this.f72174x2eff7851.setAccessibilityPaneTitle(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setAccessibleNavigation */
    public void m139471xd3ffc1ec(boolean z17) {
        if (this.f72158xabe0d66a == z17) {
            return;
        }
        this.f72158xabe0d66a = z17;
        if (z17) {
            this.f72152x1f187d9f |= io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.AccessibilityFeature.ACCESSIBLE_NAVIGATION.f72191x6ac9171;
        } else {
            this.f72152x1f187d9f &= ~io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.AccessibilityFeature.ACCESSIBLE_NAVIGATION.f72191x6ac9171;
        }
        m139468x7282f499();
    }

    /* renamed from: setBoldTextFlag */
    private void m139472xda1f3160() {
        android.view.View view = this.f72174x2eff7851;
        if (view == null || view.getResources() == null) {
            return;
        }
        int i17 = this.f72174x2eff7851.getResources().getConfiguration().fontWeightAdjustment;
        if (i17 != Integer.MAX_VALUE && i17 >= 300) {
            this.f72152x1f187d9f |= io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.AccessibilityFeature.BOLD_TEXT.f72191x6ac9171;
        } else {
            this.f72152x1f187d9f &= ~io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.AccessibilityFeature.BOLD_TEXT.f72191x6ac9171;
        }
        m139468x7282f499();
    }

    /* renamed from: shouldSetCollectionInfo */
    private boolean m139473x8e9923fb(final io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode semanticsNode) {
        return semanticsNode.f72295xb2318bec > 0 && (io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode.m139590x672ff86c(this.f72153x6b716f46, new io.p3284xd2ae381c.p3319x36f002.InterfaceC28971x2718c997() { // from class: io.flutter.view.AccessibilityBridge$$a
            @Override // io.p3284xd2ae381c.p3319x36f002.InterfaceC28971x2718c997
            /* renamed from: test */
            public final boolean mo139418x364492(java.lang.Object obj) {
                boolean m139459xd3775f2a;
                m139459xd3775f2a = io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.m139459xd3775f2a(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode.this, (io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode) obj);
                return m139459xd3775f2a;
            }
        }) || !io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode.m139590x672ff86c(this.f72153x6b716f46, new io.p3284xd2ae381c.p3320x373aa5.C28976x6bddf22b()));
    }

    /* renamed from: willRemoveSemanticsNode */
    private void m139474x4b1aafb9(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode semanticsNode) {
        android.view.View mo138639xbd854120;
        java.lang.Integer num;
        semanticsNode.f72282xc4ab08aa = null;
        if (semanticsNode.f72283xd23420f3 != -1 && (num = this.f72162x3f41bc90) != null && this.f72157xf593d4cb.m139614x7302d451(num.intValue()) == this.f72172xc8ac05f8.mo138639xbd854120(semanticsNode.f72283xd23420f3)) {
            m139487xf64a1b94(this.f72162x3f41bc90.intValue(), 65536);
            this.f72162x3f41bc90 = null;
        }
        if (semanticsNode.f72283xd23420f3 != -1 && (mo138639xbd854120 = this.f72172xc8ac05f8.mo138639xbd854120(semanticsNode.f72283xd23420f3)) != null) {
            mo138639xbd854120.setImportantForAccessibility(4);
        }
        io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode semanticsNode2 = this.f72153x6b716f46;
        if (semanticsNode2 == semanticsNode) {
            m139487xf64a1b94(semanticsNode2.f374927id, 65536);
            this.f72153x6b716f46 = null;
        }
        if (this.f72167xa90efc2 == semanticsNode) {
            this.f72167xa90efc2 = null;
        }
        if (this.f72166x764a35fa == semanticsNode) {
            this.f72166x764a35fa = null;
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int i17) {
        int i18;
        boolean z17 = true;
        m139471xd3ffc1ec(true);
        if (i17 >= 65536) {
            return this.f72157xf593d4cb.m139609x427e11a2(i17);
        }
        if (i17 == -1) {
            android.view.accessibility.AccessibilityNodeInfo m139481x1e1c2599 = m139481x1e1c2599(this.f72174x2eff7851);
            this.f72174x2eff7851.onInitializeAccessibilityNodeInfo(m139481x1e1c2599);
            if (this.f72165x2c7eb9ef.containsKey(0)) {
                m139481x1e1c2599.addChild(this.f72174x2eff7851, 0);
            }
            m139481x1e1c2599.setImportantForAccessibility(false);
            return m139481x1e1c2599;
        }
        io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode semanticsNode = this.f72165x2c7eb9ef.get(java.lang.Integer.valueOf(i17));
        if (semanticsNode == null) {
            return null;
        }
        if (semanticsNode.f72283xd23420f3 != -1 && this.f72172xc8ac05f8.mo138654x756fc223(semanticsNode.f72283xd23420f3)) {
            android.view.View mo138639xbd854120 = this.f72172xc8ac05f8.mo138639xbd854120(semanticsNode.f72283xd23420f3);
            if (mo138639xbd854120 == null) {
                return null;
            }
            return this.f72157xf593d4cb.m139611x71e59f7a(mo138639xbd854120, semanticsNode.f374927id, semanticsNode.m139576xbb10001d());
        }
        android.view.accessibility.AccessibilityNodeInfo m139482x1e1c2599 = m139482x1e1c2599(this.f72174x2eff7851, i17);
        int i19 = android.os.Build.VERSION.SDK_INT;
        m139482x1e1c2599.setImportantForAccessibility(m139458x39cf6a18(semanticsNode));
        m139482x1e1c2599.setViewIdResourceName("");
        if (semanticsNode.f72270x9f88aca9 != null) {
            m139482x1e1c2599.setViewIdResourceName(semanticsNode.f72270x9f88aca9);
        }
        m139482x1e1c2599.setPackageName(this.f72174x2eff7851.getContext().getPackageName());
        m139482x1e1c2599.setClassName("android.view.View");
        m139482x1e1c2599.setSource(this.f72174x2eff7851, i17);
        m139482x1e1c2599.setFocusable(semanticsNode.m139589xa7560028());
        io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode semanticsNode2 = this.f72167xa90efc2;
        if (semanticsNode2 != null) {
            m139482x1e1c2599.setFocused(semanticsNode2.f374927id == i17);
        }
        io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode semanticsNode3 = this.f72153x6b716f46;
        if (semanticsNode3 != null) {
            m139482x1e1c2599.setAccessibilityFocused(semanticsNode3.f374927id == i17);
        }
        io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag flag = io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.IS_TEXT_FIELD;
        if (semanticsNode.m139587x29842926(flag)) {
            m139482x1e1c2599.setPassword(semanticsNode.m139587x29842926(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.IS_OBSCURED));
            if (!semanticsNode.m139587x29842926(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.IS_READ_ONLY)) {
                m139482x1e1c2599.setClassName("android.widget.EditText");
            }
            m139482x1e1c2599.setEditable(!semanticsNode.m139587x29842926(r9));
            if (semanticsNode.f72301x7069c250 != -1 && semanticsNode.f72302x36596e9 != -1) {
                m139482x1e1c2599.setTextSelection(semanticsNode.f72301x7069c250, semanticsNode.f72302x36596e9);
            }
            io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode semanticsNode4 = this.f72153x6b716f46;
            if (semanticsNode4 != null && semanticsNode4.f374927id == i17) {
                m139482x1e1c2599.setLiveRegion(1);
            }
            if (semanticsNode.m139586xd0202170(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                m139482x1e1c2599.addAction(256);
                i18 = 1;
            } else {
                i18 = 0;
            }
            if (semanticsNode.m139586xd0202170(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                m139482x1e1c2599.addAction(512);
                i18 |= 1;
            }
            if (semanticsNode.m139586xd0202170(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.MOVE_CURSOR_FORWARD_BY_WORD)) {
                m139482x1e1c2599.addAction(256);
                i18 |= 2;
            }
            if (semanticsNode.m139586xd0202170(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                m139482x1e1c2599.addAction(512);
                i18 |= 2;
            }
            m139482x1e1c2599.setMovementGranularities(i18);
            if (semanticsNode.f72279x28129bb3 >= 0) {
                int length = semanticsNode.f72305x6ac9171 == null ? 0 : semanticsNode.f72305x6ac9171.length();
                int unused = semanticsNode.f72259x6fbc147e;
                int unused2 = semanticsNode.f72279x28129bb3;
                m139482x1e1c2599.setMaxTextLength((length - semanticsNode.f72259x6fbc147e) + semanticsNode.f72279x28129bb3);
            }
        }
        if (semanticsNode.m139586xd0202170(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.SET_SELECTION)) {
            m139482x1e1c2599.addAction(131072);
        }
        if (semanticsNode.m139586xd0202170(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.COPY)) {
            m139482x1e1c2599.addAction(16384);
        }
        if (semanticsNode.m139586xd0202170(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.CUT)) {
            m139482x1e1c2599.addAction(65536);
        }
        if (semanticsNode.m139586xd0202170(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.PASTE)) {
            m139482x1e1c2599.addAction(32768);
        }
        if (semanticsNode.m139586xd0202170(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.SET_TEXT)) {
            m139482x1e1c2599.addAction(2097152);
        }
        if (semanticsNode.m139587x29842926(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.IS_BUTTON)) {
            m139482x1e1c2599.setClassName(com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4930x24ae7051.f21227xcdc820b);
        }
        if (semanticsNode.m139587x29842926(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.IS_IMAGE)) {
            m139482x1e1c2599.setClassName("android.widget.ImageView");
        }
        if (semanticsNode.m139586xd0202170(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.DISMISS)) {
            m139482x1e1c2599.setDismissable(true);
            m139482x1e1c2599.addAction(1048576);
        }
        if (semanticsNode.f72282xc4ab08aa != null) {
            m139482x1e1c2599.setParent(this.f72174x2eff7851, semanticsNode.f72282xc4ab08aa.f374927id);
        } else {
            m139482x1e1c2599.setParent(this.f72174x2eff7851);
        }
        if (semanticsNode.f72287xf6689094 != -1) {
            m139482x1e1c2599.setTraversalAfter(this.f72174x2eff7851, semanticsNode.f72287xf6689094);
        }
        android.graphics.Rect m139576xbb10001d = semanticsNode.m139576xbb10001d();
        if (semanticsNode.f72282xc4ab08aa != null) {
            android.graphics.Rect m139576xbb10001d2 = semanticsNode.f72282xc4ab08aa.m139576xbb10001d();
            android.graphics.Rect rect = new android.graphics.Rect(m139576xbb10001d);
            rect.offset(-m139576xbb10001d2.left, -m139576xbb10001d2.top);
            m139482x1e1c2599.setBoundsInParent(rect);
        } else {
            m139482x1e1c2599.setBoundsInParent(m139576xbb10001d);
        }
        m139482x1e1c2599.setBoundsInScreen(m139453x43a02cbc(m139576xbb10001d));
        m139482x1e1c2599.setVisibleToUser(true);
        m139482x1e1c2599.setEnabled(!semanticsNode.m139587x29842926(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.HAS_ENABLED_STATE) || semanticsNode.m139587x29842926(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.IS_ENABLED));
        if (semanticsNode.m139586xd0202170(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.TAP)) {
            if (semanticsNode.f72281x25657530 != null) {
                m139482x1e1c2599.addAction(new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(16, semanticsNode.f72281x25657530.f72216x30de87));
                m139482x1e1c2599.setClickable(true);
            } else {
                m139482x1e1c2599.addAction(16);
                m139482x1e1c2599.setClickable(true);
            }
        } else if (semanticsNode.m139587x29842926(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.IS_SLIDER)) {
            m139482x1e1c2599.addAction(16);
            m139482x1e1c2599.setClickable(true);
        }
        if (semanticsNode.m139586xd0202170(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.LONG_PRESS)) {
            if (semanticsNode.f72280x1035cff4 != null) {
                m139482x1e1c2599.addAction(new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(32, semanticsNode.f72280x1035cff4.f72216x30de87));
                m139482x1e1c2599.setLongClickable(true);
            } else {
                m139482x1e1c2599.addAction(32);
                m139482x1e1c2599.setLongClickable(true);
            }
        }
        io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action action = io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.SCROLL_LEFT;
        if (semanticsNode.m139586xd0202170(action) || semanticsNode.m139586xd0202170(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.SCROLL_UP) || semanticsNode.m139586xd0202170(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.SCROLL_RIGHT) || semanticsNode.m139586xd0202170(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.SCROLL_DOWN)) {
            m139482x1e1c2599.setScrollable(true);
            if (semanticsNode.m139587x29842926(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.HAS_IMPLICIT_SCROLLING)) {
                if (semanticsNode.m139586xd0202170(action) || semanticsNode.m139586xd0202170(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.SCROLL_RIGHT)) {
                    if (m139473x8e9923fb(semanticsNode)) {
                        m139482x1e1c2599.setCollectionInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(0, semanticsNode.f72295xb2318bec, false));
                    } else {
                        m139482x1e1c2599.setClassName("android.widget.HorizontalScrollView");
                    }
                } else if (m139473x8e9923fb(semanticsNode)) {
                    m139482x1e1c2599.setCollectionInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(semanticsNode.f72295xb2318bec, 0, false));
                } else {
                    m139482x1e1c2599.setClassName("android.widget.ScrollView");
                }
            }
            if (semanticsNode.m139586xd0202170(action) || semanticsNode.m139586xd0202170(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.SCROLL_UP)) {
                m139482x1e1c2599.addAction(4096);
            }
            if (semanticsNode.m139586xd0202170(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.SCROLL_RIGHT) || semanticsNode.m139586xd0202170(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.SCROLL_DOWN)) {
                m139482x1e1c2599.addAction(8192);
            }
        }
        io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action action2 = io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.INCREASE;
        if (semanticsNode.m139586xd0202170(action2) || semanticsNode.m139586xd0202170(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.DECREASE)) {
            m139482x1e1c2599.setClassName("android.widget.SeekBar");
            if (semanticsNode.m139586xd0202170(action2)) {
                m139482x1e1c2599.addAction(4096);
            }
            if (semanticsNode.m139586xd0202170(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.DECREASE)) {
                m139482x1e1c2599.addAction(8192);
            }
        }
        if (semanticsNode.m139587x29842926(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.IS_LIVE_REGION)) {
            m139482x1e1c2599.setLiveRegion(1);
        }
        if (semanticsNode.m139587x29842926(flag)) {
            m139482x1e1c2599.setText(semanticsNode.m139582x754a37bb());
            if (i19 >= 28) {
                m139482x1e1c2599.setHintText(semanticsNode.m139581x1926003e());
            }
        } else if (!semanticsNode.m139587x29842926(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.SCOPES_ROUTE)) {
            java.lang.CharSequence m139583x6a1ca220 = semanticsNode.m139583x6a1ca220();
            if (i19 < 28 && semanticsNode.f72303xbc0bd003 != null) {
                m139583x6a1ca220 = ((java.lang.Object) (m139583x6a1ca220 != null ? m139583x6a1ca220 : "")) + "\n" + semanticsNode.f72303xbc0bd003;
            }
            if (m139583x6a1ca220 != null) {
                m139482x1e1c2599.setContentDescription(m139583x6a1ca220);
            }
        }
        if (i19 >= 28 && semanticsNode.f72303xbc0bd003 != null) {
            m139482x1e1c2599.setTooltipText(semanticsNode.f72303xbc0bd003);
            if (semanticsNode.m139583x6a1ca220() == null) {
                m139482x1e1c2599.setContentDescription(semanticsNode.f72303xbc0bd003);
            }
        }
        boolean m139587x29842926 = semanticsNode.m139587x29842926(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.HAS_CHECKED_STATE);
        boolean m139587x298429262 = semanticsNode.m139587x29842926(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.HAS_TOGGLED_STATE);
        if (!m139587x29842926 && !m139587x298429262) {
            z17 = false;
        }
        m139482x1e1c2599.setCheckable(z17);
        if (m139587x29842926) {
            m139482x1e1c2599.setChecked(semanticsNode.m139587x29842926(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.IS_CHECKED));
            if (semanticsNode.m139587x29842926(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.IS_IN_MUTUALLY_EXCLUSIVE_GROUP)) {
                m139482x1e1c2599.setClassName("android.widget.RadioButton");
            } else {
                m139482x1e1c2599.setClassName("android.widget.CheckBox");
            }
        } else if (m139587x298429262) {
            m139482x1e1c2599.setChecked(semanticsNode.m139587x29842926(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.IS_TOGGLED));
            m139482x1e1c2599.setClassName("android.widget.Switch");
        }
        m139482x1e1c2599.setSelected(semanticsNode.m139587x29842926(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.IS_SELECTED));
        if (i19 >= 28) {
            m139482x1e1c2599.setHeading(semanticsNode.m139587x29842926(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.IS_HEADER));
        }
        io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode semanticsNode5 = this.f72153x6b716f46;
        if (semanticsNode5 == null || semanticsNode5.f374927id != i17) {
            m139482x1e1c2599.addAction(64);
        } else {
            m139482x1e1c2599.addAction(128);
        }
        if (semanticsNode.f72260xaea48e0 != null) {
            for (io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.CustomAccessibilityAction customAccessibilityAction : semanticsNode.f72260xaea48e0) {
                m139482x1e1c2599.addAction(new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(customAccessibilityAction.f72219xafcb01c9, customAccessibilityAction.f72217x61f7ef4));
            }
        }
        for (io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode semanticsNode6 : semanticsNode.f72258x52e2dd4) {
            if (!semanticsNode6.m139587x29842926(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.IS_HIDDEN)) {
                if (semanticsNode6.f72283xd23420f3 != -1) {
                    android.view.View mo138639xbd8541202 = this.f72172xc8ac05f8.mo138639xbd854120(semanticsNode6.f72283xd23420f3);
                    if (!this.f72172xc8ac05f8.mo138654x756fc223(semanticsNode6.f72283xd23420f3)) {
                        mo138639xbd8541202.setImportantForAccessibility(0);
                        m139482x1e1c2599.addChild(mo138639xbd8541202);
                    }
                }
                m139482x1e1c2599.addChild(this.f72174x2eff7851, semanticsNode6.f374927id);
            }
        }
        return m139482x1e1c2599;
    }

    /* renamed from: externalViewRequestSendAccessibilityEvent */
    public boolean m139475x7605e9d3(android.view.View view, android.view.View view2, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        java.lang.Integer m139610xa9447ad0;
        if (!this.f72157xf593d4cb.m139615xacf4d503(view, view2, accessibilityEvent) || (m139610xa9447ad0 = this.f72157xf593d4cb.m139610xa9447ad0(view, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 8) {
            this.f72163x56d15994 = m139610xa9447ad0;
            this.f72167xa90efc2 = null;
            return true;
        }
        if (eventType == 128) {
            this.f72166x764a35fa = null;
            return true;
        }
        if (eventType == 32768) {
            this.f72162x3f41bc90 = m139610xa9447ad0;
            this.f72153x6b716f46 = null;
            return true;
        }
        if (eventType != 65536) {
            return true;
        }
        this.f72163x56d15994 = null;
        this.f72162x3f41bc90 = null;
        return true;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public android.view.accessibility.AccessibilityNodeInfo findFocus(int i17) {
        if (i17 == 1) {
            io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode semanticsNode = this.f72167xa90efc2;
            if (semanticsNode != null) {
                return createAccessibilityNodeInfo(semanticsNode.f374927id);
            }
            java.lang.Integer num = this.f72163x56d15994;
            if (num != null) {
                return createAccessibilityNodeInfo(num.intValue());
            }
        } else if (i17 != 2) {
            return null;
        }
        io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode semanticsNode2 = this.f72153x6b716f46;
        if (semanticsNode2 != null) {
            return createAccessibilityNodeInfo(semanticsNode2.f374927id);
        }
        java.lang.Integer num2 = this.f72162x3f41bc90;
        if (num2 != null) {
            return createAccessibilityNodeInfo(num2.intValue());
        }
        return null;
    }

    /* renamed from: getAccessibleNavigation */
    public boolean m139476x59ac92e0() {
        return this.f72158xabe0d66a;
    }

    /* renamed from: getHoveredObjectId */
    public int m139477xf0f67a7f() {
        return this.f72166x764a35fa.f374927id;
    }

    /* renamed from: isAccessibilityEnabled */
    public boolean m139478x2061f65d() {
        return this.f72154xd0c6727f.isEnabled();
    }

    /* renamed from: isTouchExplorationEnabled */
    public boolean m139479x8179cb3() {
        return this.f72154xd0c6727f.isTouchExplorationEnabled();
    }

    /* renamed from: obtainAccessibilityNodeInfo */
    public android.view.accessibility.AccessibilityNodeInfo m139481x1e1c2599(android.view.View view) {
        return android.view.accessibility.AccessibilityNodeInfo.obtain(view);
    }

    /* renamed from: onAccessibilityHoverEvent */
    public boolean m139483x32e691cd(android.view.MotionEvent motionEvent) {
        return m139484x32e691cd(motionEvent, false);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int i17, int i18, android.os.Bundle bundle) {
        if (i17 >= 65536) {
            boolean m139613x8c1184f7 = this.f72157xf593d4cb.m139613x8c1184f7(i17, i18, bundle);
            if (m139613x8c1184f7 && i18 == 128) {
                this.f72162x3f41bc90 = null;
            }
            return m139613x8c1184f7;
        }
        io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode semanticsNode = this.f72165x2c7eb9ef.get(java.lang.Integer.valueOf(i17));
        boolean z17 = false;
        if (semanticsNode == null) {
            return false;
        }
        switch (i18) {
            case 16:
                this.f72151xcb08dfd5.m138142x92ca6029(i17, io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.TAP);
                return true;
            case 32:
                this.f72151xcb08dfd5.m138142x92ca6029(i17, io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.LONG_PRESS);
                return true;
            case 64:
                if (this.f72153x6b716f46 == null) {
                    this.f72174x2eff7851.invalidate();
                }
                this.f72153x6b716f46 = semanticsNode;
                this.f72151xcb08dfd5.m138142x92ca6029(i17, io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.DID_GAIN_ACCESSIBILITY_FOCUS);
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("type", "didGainFocus");
                hashMap.put("nodeId", java.lang.Integer.valueOf(semanticsNode.f374927id));
                this.f72151xcb08dfd5.f71282x2c0b7d03.m138402x35cf88(hashMap);
                m139487xf64a1b94(i17, 32768);
                if (semanticsNode.m139586xd0202170(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.INCREASE) || semanticsNode.m139586xd0202170(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.DECREASE)) {
                    m139487xf64a1b94(i17, 4);
                }
                return true;
            case 128:
                io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode semanticsNode2 = this.f72153x6b716f46;
                if (semanticsNode2 != null && semanticsNode2.f374927id == i17) {
                    this.f72153x6b716f46 = null;
                }
                java.lang.Integer num = this.f72162x3f41bc90;
                if (num != null && num.intValue() == i17) {
                    this.f72162x3f41bc90 = null;
                }
                this.f72151xcb08dfd5.m138142x92ca6029(i17, io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.DID_LOSE_ACCESSIBILITY_FOCUS);
                m139487xf64a1b94(i17, 65536);
                return true;
            case 256:
                return m139464xee234ade(semanticsNode, i17, bundle, true);
            case 512:
                return m139464xee234ade(semanticsNode, i17, bundle, false);
            case 4096:
                io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action action = io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.SCROLL_UP;
                if (semanticsNode.m139586xd0202170(action)) {
                    this.f72151xcb08dfd5.m138142x92ca6029(i17, action);
                } else {
                    io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action action2 = io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.SCROLL_LEFT;
                    if (semanticsNode.m139586xd0202170(action2)) {
                        this.f72151xcb08dfd5.m138142x92ca6029(i17, action2);
                    } else {
                        io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action action3 = io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.INCREASE;
                        if (!semanticsNode.m139586xd0202170(action3)) {
                            return false;
                        }
                        semanticsNode.f72305x6ac9171 = semanticsNode.f72271x2f41842f;
                        semanticsNode.f72306x70ddbda8 = semanticsNode.f72272xa328dae6;
                        m139487xf64a1b94(i17, 4);
                        this.f72151xcb08dfd5.m138142x92ca6029(i17, action3);
                    }
                }
                return true;
            case 8192:
                io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action action4 = io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.SCROLL_DOWN;
                if (semanticsNode.m139586xd0202170(action4)) {
                    this.f72151xcb08dfd5.m138142x92ca6029(i17, action4);
                } else {
                    io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action action5 = io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.SCROLL_RIGHT;
                    if (semanticsNode.m139586xd0202170(action5)) {
                        this.f72151xcb08dfd5.m138142x92ca6029(i17, action5);
                    } else {
                        io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action action6 = io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.DECREASE;
                        if (!semanticsNode.m139586xd0202170(action6)) {
                            return false;
                        }
                        semanticsNode.f72305x6ac9171 = semanticsNode.f72261x6351598b;
                        semanticsNode.f72306x70ddbda8 = semanticsNode.f72262x1b62ad42;
                        m139487xf64a1b94(i17, 4);
                        this.f72151xcb08dfd5.m138142x92ca6029(i17, action6);
                    }
                }
                return true;
            case 16384:
                this.f72151xcb08dfd5.m138142x92ca6029(i17, io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.COPY);
                return true;
            case 32768:
                this.f72151xcb08dfd5.m138142x92ca6029(i17, io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.PASTE);
                return true;
            case 65536:
                this.f72151xcb08dfd5.m138142x92ca6029(i17, io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.CUT);
                return true;
            case 131072:
                java.util.HashMap hashMap2 = new java.util.HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    z17 = true;
                }
                if (z17) {
                    hashMap2.put(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37137xa0346395, java.lang.Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    hashMap2.put("extent", java.lang.Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                } else {
                    hashMap2.put(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37137xa0346395, java.lang.Integer.valueOf(semanticsNode.f72302x36596e9));
                    hashMap2.put("extent", java.lang.Integer.valueOf(semanticsNode.f72302x36596e9));
                }
                this.f72151xcb08dfd5.m138143x92ca6029(i17, io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.SET_SELECTION, hashMap2);
                io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode semanticsNode3 = this.f72165x2c7eb9ef.get(java.lang.Integer.valueOf(i17));
                semanticsNode3.f72301x7069c250 = ((java.lang.Integer) hashMap2.get(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37137xa0346395)).intValue();
                semanticsNode3.f72302x36596e9 = ((java.lang.Integer) hashMap2.get("extent")).intValue();
                return true;
            case 1048576:
                this.f72151xcb08dfd5.m138142x92ca6029(i17, io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.DISMISS);
                return true;
            case 2097152:
                return m139465xb1af460e(semanticsNode, i17, bundle);
            case 16908342:
                this.f72151xcb08dfd5.m138142x92ca6029(i17, io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.SHOW_ON_SCREEN);
                return true;
            default:
                io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.CustomAccessibilityAction customAccessibilityAction = this.f72161xaea48e0.get(java.lang.Integer.valueOf(i18 - f72143x4c0f77bd));
                if (customAccessibilityAction == null) {
                    return false;
                }
                this.f72151xcb08dfd5.m138143x92ca6029(i17, io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.CUSTOM_ACTION, java.lang.Integer.valueOf(customAccessibilityAction.f374926id));
                return true;
        }
    }

    /* renamed from: release */
    public void m139485x41012807() {
        this.f72168xafdb8087 = true;
        this.f72172xc8ac05f8.mo138634x212f07e4();
        m139488x6e96c6d1(null);
        this.f72154xd0c6727f.removeAccessibilityStateChangeListener(this.f72156x8e9f0347);
        this.f72154xd0c6727f.removeTouchExplorationStateChangeListener(this.f72175xcbd4a771);
        this.f72160x7c1dcb9f.unregisterContentObserver(this.f72159xe547c11c);
        this.f72151xcb08dfd5.m138147x4f53d46f(null);
    }

    /* renamed from: reset */
    public void m139486x6761d4f() {
        this.f72165x2c7eb9ef.clear();
        io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode semanticsNode = this.f72153x6b716f46;
        if (semanticsNode != null) {
            m139487xf64a1b94(semanticsNode.f374927id, 65536);
        }
        this.f72153x6b716f46 = null;
        this.f72166x764a35fa = null;
        m139469x3330b249(0);
    }

    /* renamed from: sendAccessibilityEvent */
    public void m139487xf64a1b94(int i17, int i18) {
        if (this.f72154xd0c6727f.isEnabled()) {
            m139467xf64a1b94(m139461x78943f71(i17, i18));
        }
    }

    /* renamed from: setOnAccessibilityChangeListener */
    public void m139488x6e96c6d1(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.OnAccessibilityChangeListener onAccessibilityChangeListener) {
        this.f72171xdcd1e013 = onAccessibilityChangeListener;
    }

    /* renamed from: updateCustomAccessibilityActions */
    public void m139489xda104489(java.nio.ByteBuffer byteBuffer, java.lang.String[] strArr) {
        while (byteBuffer.hasRemaining()) {
            io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.CustomAccessibilityAction m139454xda61c0af = m139454xda61c0af(byteBuffer.getInt());
            m139454xda61c0af.f72218x963f6207 = byteBuffer.getInt();
            int i17 = byteBuffer.getInt();
            java.lang.String str = null;
            m139454xda61c0af.f72217x61f7ef4 = i17 == -1 ? null : strArr[i17];
            int i18 = byteBuffer.getInt();
            if (i18 != -1) {
                str = strArr[i18];
            }
            m139454xda61c0af.f72216x30de87 = str;
        }
    }

    /* renamed from: updateSemantics */
    public void m139490x104104a4(java.nio.ByteBuffer byteBuffer, java.lang.String[] strArr, java.nio.ByteBuffer[] byteBufferArr) {
        io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode semanticsNode;
        io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode semanticsNode2;
        float f17;
        float f18;
        android.view.View mo138639xbd854120;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (byteBuffer.hasRemaining()) {
            io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode m139455x9fe17ada = m139455x9fe17ada(byteBuffer.getInt());
            m139455x9fe17ada.m139593xee5dd12f(byteBuffer, strArr, byteBufferArr);
            if (!m139455x9fe17ada.m139587x29842926(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.IS_HIDDEN)) {
                if (m139455x9fe17ada.m139587x29842926(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.IS_FOCUSED)) {
                    this.f72167xa90efc2 = m139455x9fe17ada;
                }
                if (m139455x9fe17ada.f72267xfeeb6484) {
                    arrayList.add(m139455x9fe17ada);
                }
                if (m139455x9fe17ada.f72283xd23420f3 != -1 && !this.f72172xc8ac05f8.mo138654x756fc223(m139455x9fe17ada.f72283xd23420f3) && (mo138639xbd854120 = this.f72172xc8ac05f8.mo138639xbd854120(m139455x9fe17ada.f72283xd23420f3)) != null) {
                    mo138639xbd854120.setImportantForAccessibility(0);
                }
            }
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode m139456xd7c82497 = m139456xd7c82497();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (m139456xd7c82497 != null) {
            float[] fArr = new float[16];
            android.opengl.Matrix.setIdentityM(fArr, 0);
            m139456xd7c82497.m139592x940574b6(fArr, hashSet, false);
            m139456xd7c82497.m139570xa7d0dd14(arrayList2);
        }
        java.util.Iterator it = arrayList2.iterator();
        io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode semanticsNode3 = null;
        while (it.hasNext()) {
            io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode semanticsNode4 = (io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode) it.next();
            if (!this.f72164x50bab918.contains(java.lang.Integer.valueOf(semanticsNode4.f374927id))) {
                semanticsNode3 = semanticsNode4;
            }
        }
        if (semanticsNode3 == null && arrayList2.size() > 0) {
            semanticsNode3 = (io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode) arrayList2.get(arrayList2.size() - 1);
        }
        if (semanticsNode3 != null && (semanticsNode3.f374927id != this.f72173xab39364d || arrayList2.size() != this.f72164x50bab918.size())) {
            this.f72173xab39364d = semanticsNode3.f374927id;
            m139463x5ae0662a(semanticsNode3);
        }
        this.f72164x50bab918.clear();
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            this.f72164x50bab918.add(java.lang.Integer.valueOf(((io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode) it6.next()).f374927id));
        }
        java.util.Iterator<java.util.Map.Entry<java.lang.Integer, io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode>> it7 = this.f72165x2c7eb9ef.entrySet().iterator();
        while (it7.hasNext()) {
            io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode value = it7.next().getValue();
            if (!hashSet.contains(value)) {
                m139474x4b1aafb9(value);
                it7.remove();
            }
        }
        m139469x3330b249(0);
        java.util.Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode semanticsNode5 = (io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode) it8.next();
            if (semanticsNode5.m139573xc350bc2c()) {
                android.view.accessibility.AccessibilityEvent m139461x78943f71 = m139461x78943f71(semanticsNode5.f374927id, 4096);
                float f19 = semanticsNode5.f72299x7bd9c716;
                float f27 = semanticsNode5.f72296x751bb58d;
                if (java.lang.Float.isInfinite(semanticsNode5.f72296x751bb58d)) {
                    if (f19 > f72149x3e596dcf) {
                        f19 = 70000.0f;
                    }
                    f27 = 100000.0f;
                }
                if (java.lang.Float.isInfinite(semanticsNode5.f72297x751bb67b)) {
                    f17 = f27 + f72148x427cd381;
                    if (f19 < -70000.0f) {
                        f19 = -70000.0f;
                    }
                    f18 = f19 + f72148x427cd381;
                } else {
                    f17 = f27 - semanticsNode5.f72297x751bb67b;
                    f18 = f19 - semanticsNode5.f72297x751bb67b;
                }
                if (semanticsNode5.m139584xb6a2a8a1(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.SCROLL_UP) || semanticsNode5.m139584xb6a2a8a1(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.SCROLL_DOWN)) {
                    m139461x78943f71.setScrollY((int) f18);
                    m139461x78943f71.setMaxScrollY((int) f17);
                } else if (semanticsNode5.m139584xb6a2a8a1(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.SCROLL_LEFT) || semanticsNode5.m139584xb6a2a8a1(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action.SCROLL_RIGHT)) {
                    m139461x78943f71.setScrollX((int) f18);
                    m139461x78943f71.setMaxScrollX((int) f17);
                }
                if (semanticsNode5.f72295xb2318bec > 0) {
                    m139461x78943f71.setItemCount(semanticsNode5.f72295xb2318bec);
                    m139461x78943f71.setFromIndex(semanticsNode5.f72298x79e38a05);
                    java.util.Iterator it9 = semanticsNode5.f72257x3a61512d.iterator();
                    int i17 = 0;
                    while (it9.hasNext()) {
                        if (!((io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode) it9.next()).m139587x29842926(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.IS_HIDDEN)) {
                            i17++;
                        }
                    }
                    m139461x78943f71.setToIndex((semanticsNode5.f72298x79e38a05 + i17) - 1);
                }
                m139467xf64a1b94(m139461x78943f71);
            }
            if (semanticsNode5.m139587x29842926(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.IS_LIVE_REGION) && semanticsNode5.m139572xf7cf725()) {
                m139469x3330b249(semanticsNode5.f374927id);
            }
            io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode semanticsNode6 = this.f72153x6b716f46;
            if (semanticsNode6 != null && semanticsNode6.f374927id == semanticsNode5.f374927id) {
                io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag flag = io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.IS_SELECTED;
                if (!semanticsNode5.m139585x28b0c897(flag) && semanticsNode5.m139587x29842926(flag)) {
                    android.view.accessibility.AccessibilityEvent m139461x78943f712 = m139461x78943f71(semanticsNode5.f374927id, 4);
                    m139461x78943f712.getText().add(semanticsNode5.f72275x61f7ef4);
                    m139467xf64a1b94(m139461x78943f712);
                }
            }
            io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode semanticsNode7 = this.f72167xa90efc2;
            if (semanticsNode7 != null && semanticsNode7.f374927id == semanticsNode5.f374927id && ((semanticsNode2 = this.f72169xc753b1cc) == null || semanticsNode2.f374927id != this.f72167xa90efc2.f374927id)) {
                this.f72169xc753b1cc = this.f72167xa90efc2;
                m139467xf64a1b94(m139461x78943f71(semanticsNode5.f374927id, 8));
            } else if (this.f72167xa90efc2 == null) {
                this.f72169xc753b1cc = null;
            }
            io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode semanticsNode8 = this.f72167xa90efc2;
            if (semanticsNode8 != null && semanticsNode8.f374927id == semanticsNode5.f374927id) {
                io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag flag2 = io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Flag.IS_TEXT_FIELD;
                if (semanticsNode5.m139585x28b0c897(flag2) && semanticsNode5.m139587x29842926(flag2) && ((semanticsNode = this.f72153x6b716f46) == null || semanticsNode.f374927id == this.f72167xa90efc2.f374927id)) {
                    java.lang.String str = semanticsNode5.f72293xef9728ba != null ? semanticsNode5.f72293xef9728ba : "";
                    java.lang.String str2 = semanticsNode5.f72305x6ac9171 != null ? semanticsNode5.f72305x6ac9171 : "";
                    android.view.accessibility.AccessibilityEvent m139451x60d85b2f = m139451x60d85b2f(semanticsNode5.f374927id, str, str2);
                    if (m139451x60d85b2f != null) {
                        m139467xf64a1b94(m139451x60d85b2f);
                    }
                    if (semanticsNode5.f72291x9686b419 != semanticsNode5.f72301x7069c250 || semanticsNode5.f72292x160d3a72 != semanticsNode5.f72302x36596e9) {
                        android.view.accessibility.AccessibilityEvent m139461x78943f713 = m139461x78943f71(semanticsNode5.f374927id, 8192);
                        m139461x78943f713.getText().add(str2);
                        m139461x78943f713.setFromIndex(semanticsNode5.f72301x7069c250);
                        m139461x78943f713.setToIndex(semanticsNode5.f72302x36596e9);
                        m139461x78943f713.setItemCount(str2.length());
                        m139467xf64a1b94(m139461x78943f713);
                    }
                }
            }
        }
    }

    public C28974x81a86657(android.view.View view, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28652xd6ce13f5 c28652xd6ce13f5, final android.view.accessibility.AccessibilityManager accessibilityManager, android.content.ContentResolver contentResolver, io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab c28977x6f8a34ab, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28723x24b38218 interfaceC28723x24b38218) {
        this.f72165x2c7eb9ef = new java.util.HashMap();
        this.f72161xaea48e0 = new java.util.HashMap();
        this.f72152x1f187d9f = 0;
        this.f72164x50bab918 = new java.util.ArrayList();
        this.f72173xab39364d = 0;
        this.f72170x9f47234d = 0;
        this.f72158xabe0d66a = false;
        this.f72168xafdb8087 = false;
        this.f72155xc0a85631 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28652xd6ce13f5.AccessibilityMessageHandler() { // from class: io.flutter.view.AccessibilityBridge.1
            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28652xd6ce13f5.AccessibilityMessageHandler
            /* renamed from: announce */
            public void mo138148xd9479469(java.lang.String str) {
                if (android.os.Build.VERSION.SDK_INT >= 36) {
                    io.p3284xd2ae381c.Log.w(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.TAG, "Using AnnounceSemanticsEvent for accessibility is deprecated on Android. Migrate to using semantic properties for a more robust and accessible user experience.\nFlutter: If you are unsure why you are seeing this bug, it might be because you are using a widget that calls this method. See https://github.com/flutter/flutter/issues/165510 for more details.\nAndroid documentation: https://developer.android.com/reference/android/view/View#announceForAccessibility(java.lang.CharSequence)");
                }
                io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.this.f72174x2eff7851.announceForAccessibility(str);
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28652xd6ce13f5.AccessibilityMessageHandler
            /* renamed from: onFocus */
            public void mo138149xaf972a39(int i17) {
                io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.this.m139487xf64a1b94(i17, 8);
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28652xd6ce13f5.AccessibilityMessageHandler
            /* renamed from: onLongPress */
            public void mo138150x4f8d808(int i17) {
                io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.this.m139487xf64a1b94(i17, 2);
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28652xd6ce13f5.AccessibilityMessageHandler
            /* renamed from: onTap */
            public void mo138151x64f7944(int i17) {
                io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.this.m139487xf64a1b94(i17, 1);
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28652xd6ce13f5.AccessibilityMessageHandler
            /* renamed from: onTooltip */
            public void mo138152xbb1d124(java.lang.String str) {
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    return;
                }
                android.view.accessibility.AccessibilityEvent m139461x78943f71 = io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.this.m139461x78943f71(0, 32);
                m139461x78943f71.getText().add(str);
                io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.this.m139467xf64a1b94(m139461x78943f71);
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.AccessibilityDelegate
            /* renamed from: updateCustomAccessibilityActions */
            public void mo137765xda104489(java.nio.ByteBuffer byteBuffer, java.lang.String[] strArr) {
                byteBuffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
                io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.this.m139489xda104489(byteBuffer, strArr);
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.AccessibilityDelegate
            /* renamed from: updateSemantics */
            public void mo137766x104104a4(java.nio.ByteBuffer byteBuffer, java.lang.String[] strArr, java.nio.ByteBuffer[] byteBufferArr) {
                byteBuffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
                for (java.nio.ByteBuffer byteBuffer2 : byteBufferArr) {
                    byteBuffer2.order(java.nio.ByteOrder.LITTLE_ENDIAN);
                }
                io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.this.m139490x104104a4(byteBuffer, strArr, byteBufferArr);
            }
        };
        android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener = new android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener() { // from class: io.flutter.view.AccessibilityBridge.2
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public void onAccessibilityStateChanged(boolean z17) {
                if (io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.this.f72168xafdb8087) {
                    return;
                }
                if (z17) {
                    io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.this.f72151xcb08dfd5.m138147x4f53d46f(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.this.f72155xc0a85631);
                    io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.this.f72151xcb08dfd5.m138145x26e8f1c3();
                } else {
                    io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.this.m139471xd3ffc1ec(false);
                    io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.this.f72151xcb08dfd5.m138147x4f53d46f(null);
                    io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.this.f72151xcb08dfd5.m138144x6479a43a();
                }
                if (io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.this.f72171xdcd1e013 != null) {
                    io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.this.f72171xdcd1e013.mo137287x94836205(z17, io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.this.f72154xd0c6727f.isTouchExplorationEnabled());
                }
            }
        };
        this.f72156x8e9f0347 = accessibilityStateChangeListener;
        android.database.ContentObserver contentObserver = new android.database.ContentObserver(new android.os.Handler()) { // from class: io.flutter.view.AccessibilityBridge.3
            @Override // android.database.ContentObserver
            public void onChange(boolean z17) {
                onChange(z17, null);
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z17, android.net.Uri uri) {
                if (io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.this.f72168xafdb8087) {
                    return;
                }
                if (android.provider.Settings.Global.getFloat(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.this.f72160x7c1dcb9f, "transition_animation_scale", 1.0f) == 0.0f) {
                    io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.m139436xbf185c3f(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.this, io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.AccessibilityFeature.DISABLE_ANIMATIONS.f72191x6ac9171);
                } else {
                    io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.m139435xbf185c3b(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.this, ~io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.AccessibilityFeature.DISABLE_ANIMATIONS.f72191x6ac9171);
                }
                io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.this.m139468x7282f499();
            }
        };
        this.f72159xe547c11c = contentObserver;
        this.f72174x2eff7851 = view;
        this.f72151xcb08dfd5 = c28652xd6ce13f5;
        this.f72154xd0c6727f = accessibilityManager;
        this.f72160x7c1dcb9f = contentResolver;
        this.f72157xf593d4cb = c28977x6f8a34ab;
        this.f72172xc8ac05f8 = interfaceC28723x24b38218;
        accessibilityStateChangeListener.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(accessibilityStateChangeListener);
        android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener() { // from class: io.flutter.view.AccessibilityBridge.4
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public void onTouchExplorationStateChanged(boolean z17) {
                if (io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.this.f72168xafdb8087) {
                    return;
                }
                if (!z17) {
                    io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.this.m139471xd3ffc1ec(false);
                    io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.this.m139462x558a0121();
                }
                if (io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.this.f72171xdcd1e013 != null) {
                    io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.this.f72171xdcd1e013.mo137287x94836205(accessibilityManager.isEnabled(), z17);
                }
            }
        };
        this.f72175xcbd4a771 = touchExplorationStateChangeListener;
        touchExplorationStateChangeListener.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        this.f72152x1f187d9f |= io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.AccessibilityFeature.NO_ANNOUNCE.f72191x6ac9171;
        contentObserver.onChange(false);
        contentResolver.registerContentObserver(android.provider.Settings.Global.getUriFor("transition_animation_scale"), false, contentObserver);
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            m139472xda1f3160();
        }
        interfaceC28723x24b38218.mo138623x58b57ff2(this);
    }

    /* renamed from: obtainAccessibilityNodeInfo */
    public android.view.accessibility.AccessibilityNodeInfo m139482x1e1c2599(android.view.View view, int i17) {
        return android.view.accessibility.AccessibilityNodeInfo.obtain(view, i17);
    }

    /* renamed from: onAccessibilityHoverEvent */
    public boolean m139484x32e691cd(android.view.MotionEvent motionEvent, boolean z17) {
        if (!this.f72154xd0c6727f.isTouchExplorationEnabled() || this.f72165x2c7eb9ef.isEmpty()) {
            return false;
        }
        io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.SemanticsNode m139588x373f4ac5 = m139456xd7c82497().m139588x373f4ac5(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z17);
        if (m139588x373f4ac5 != null && m139588x373f4ac5.f72283xd23420f3 != -1) {
            if (z17) {
                return false;
            }
            return this.f72157xf593d4cb.m139612x32e691cd(m139588x373f4ac5.f374927id, motionEvent);
        }
        if (motionEvent.getAction() != 9 && motionEvent.getAction() != 7) {
            if (motionEvent.getAction() == 10) {
                m139462x558a0121();
            } else {
                io.p3284xd2ae381c.Log.d("flutter", "unexpected accessibility hover event: " + motionEvent);
                return false;
            }
        } else {
            m139457xa90eebac(motionEvent.getX(), motionEvent.getY(), z17);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sendAccessibilityEvent */
    public void m139467xf64a1b94(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (this.f72154xd0c6727f.isEnabled()) {
            this.f72174x2eff7851.getParent().requestSendAccessibilityEvent(this.f72174x2eff7851, accessibilityEvent);
        }
    }

    /* renamed from: obtainAccessibilityEvent */
    public android.view.accessibility.AccessibilityEvent m139480x78943f71(int i17) {
        return android.view.accessibility.AccessibilityEvent.obtain(i17);
    }
}
