package com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\u0019\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R&\u0010\u001c\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001b\u0012\u0004\u0012\u00020\u00040\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/tencent/mm/accessibility/core/area/ExpandTouchDelegate;", "Landroid/view/TouchDelegate;", "Landroid/view/View;", "view", "Landroid/graphics/Rect;", "rectKey", "Ljz5/f0;", "putRect", "reset", "rect", "addDelegateChild", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "onTouchExplorationHoverEvent", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/ViewGroup;", "passRelativeCoordinate", "Z", "mDelegateTargeted", "mTargetedRect", "Landroid/graphics/Rect;", "mTargetedView", "Landroid/view/View;", "", "Ljava/lang/ref/WeakReference;", "viewRectMap", "Ljava/util/Map;", "", "lastEventCode", "Ljava/lang/Integer;", "<init>", "(Landroid/view/ViewGroup;Z)V", "Companion", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.accessibility.core.area.ExpandTouchDelegate */
/* loaded from: classes14.dex */
public final class C4882xbb3d954a extends android.view.TouchDelegate {
    public static final java.lang.String TAG = "MicroMsg.Acc.ExpandTouchDelegate";

    /* renamed from: getListenerInfoMethod */
    private static java.lang.reflect.Method f21097x4d5118f9;

    /* renamed from: mOnTouchListenerField */
    private static java.lang.reflect.Field f21099x9c5c77f3;

    /* renamed from: successReflect */
    private static boolean f21100x506eb53a;

    /* renamed from: tryReflect */
    private static boolean f21102x75175482;
    private java.lang.Integer lastEventCode;
    private boolean mDelegateTargeted;
    private android.graphics.Rect mTargetedRect;
    private android.view.View mTargetedView;
    private final android.view.ViewGroup parentView;
    private final boolean passRelativeCoordinate;
    private final java.util.Map<java.lang.ref.WeakReference<android.view.View>, android.graphics.Rect> viewRectMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.Companion INSTANCE = new com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.Companion(null);

    /* renamed from: $stable */
    public static final int f21095x3b2de05f = 8;

    /* renamed from: timeBlocker */
    private static final com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4969x8c157e4d f21101x28abd66d = new com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4969x8c157e4d(1000);

    /* renamed from: layoutChangeListener */
    private static final com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.ViewOnLayoutChangeListenerC4884xa787582d f21098x5b05824e = new android.view.View.OnLayoutChangeListener() { // from class: com.tencent.mm.accessibility.core.area.ExpandTouchDelegate$Companion$layoutChangeListener$1
        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(android.view.View v17, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
            com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.f21101x28abd66d.m42866x4255129c(v17, "onLayoutChange", new com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4885xba8ec8dd(v17, this));
        }
    };

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u001f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\f\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J<\u0010\u0015\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\nH\u0007J6\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\nJ8\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fR\u0014\u0010\u001a\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010&¨\u0006-"}, d2 = {"Lcom/tencent/mm/accessibility/core/area/ExpandTouchDelegate$Companion;", "", "Landroid/view/View;", "view", "Ljz5/f0;", "setDelegate", "Landroid/view/ViewGroup;", "parent", "Landroid/graphics/Rect;", "rectInParent", "", "isOutBound", "checkHasTouchListener", "getParentCached", "saveParent", "", "eLeft", "eTop", "eRight", "eBottom", "passRelativeCoordinate", "expand", org.p3343x72743996.p3344x2e06d1.C29284xa13724f3.V, "outRectInParent", "findLargeParentPath", "", "TAG", "Ljava/lang/String;", "Ljava/lang/reflect/Method;", "getListenerInfoMethod", "Ljava/lang/reflect/Method;", "com/tencent/mm/accessibility/core/area/ExpandTouchDelegate$Companion$layoutChangeListener$1", "layoutChangeListener", "Lcom/tencent/mm/accessibility/core/area/ExpandTouchDelegate$Companion$layoutChangeListener$1;", "Ljava/lang/reflect/Field;", "mOnTouchListenerField", "Ljava/lang/reflect/Field;", "successReflect", "Z", "Lcom/tencent/mm/accessibility/uitl/TimeBlocker;", "timeBlocker", "Lcom/tencent/mm/accessibility/uitl/TimeBlocker;", "tryReflect", "<init>", "()V", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.accessibility.core.area.ExpandTouchDelegate$Companion, reason: from kotlin metadata */
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: checkHasTouchListener */
        private final boolean m42549x7a2999c1(android.view.View view) {
            if (view == null) {
                return false;
            }
            if (com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.f21102x75175482 && !com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.f21100x506eb53a) {
                return false;
            }
            if (!com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.f21102x75175482) {
                try {
                    com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.f21097x4d5118f9 = android.view.View.class.getDeclaredMethod("getListenerInfo", new java.lang.Class[0]);
                    java.lang.reflect.Method method = com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.f21097x4d5118f9;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.f21099x9c5c77f3 = java.lang.Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener");
                    java.lang.reflect.Field field = com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.f21099x9c5c77f3;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                    com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.f21100x506eb53a = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.TAG, th6, "tryReflect error in checkHasTouchListener", new java.lang.Object[0]);
                }
                com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.f21102x75175482 = true;
            }
            if (com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.f21100x506eb53a && com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.f21097x4d5118f9 != null && com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.f21099x9c5c77f3 != null) {
                try {
                    java.lang.reflect.Field field2 = com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.f21099x9c5c77f3;
                    java.lang.reflect.Method method2 = com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.f21097x4d5118f9;
                    if (field2 != null && method2 != null && field2.get(method2.invoke(view, new java.lang.Object[0])) != null) {
                        com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4968x823b57dd.f21368x4fbc8495.m42859xfb82e301(view.getId());
                        return true;
                    }
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.TAG, th7, "successReflect but invoke error in checkHasTouchListener", new java.lang.Object[0]);
                }
            }
            return false;
        }

        /* renamed from: expand$default */
        public static /* synthetic */ void m42550x8c53ca37(com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.Companion companion, android.view.View view, int i17, int i18, int i19, int i27, boolean z17, int i28, java.lang.Object obj) {
            if ((i28 & 32) != 0) {
                z17 = false;
            }
            companion.m42556xb328de9a(view, i17, i18, i19, i27, z17);
        }

        /* renamed from: getParentCached */
        private final android.view.ViewGroup m42551x83f520e2(android.view.View view) {
            com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.C4853x7e4b6695 m42517xe172022e = com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4876xaa469f58.f21085x4fbc8495.m42517xe172022e(view);
            java.lang.ref.WeakReference<android.view.ViewGroup> m42386x6b034878 = m42517xe172022e != null ? m42517xe172022e.m42386x6b034878() : null;
            if (!(m42386x6b034878 instanceof java.lang.ref.WeakReference)) {
                m42386x6b034878 = null;
            }
            if (m42386x6b034878 == null) {
                return null;
            }
            android.view.ViewGroup viewGroup = m42386x6b034878.get();
            if (viewGroup instanceof android.view.ViewGroup) {
                return viewGroup;
            }
            return null;
        }

        /* renamed from: isOutBound */
        private final boolean m42552xd25ba21a(android.view.ViewGroup parent, android.graphics.Rect rectInParent) {
            return parent.getHeight() < rectInParent.bottom || parent.getWidth() < rectInParent.right || rectInParent.top < 0 || rectInParent.left < 0;
        }

        /* renamed from: saveParent */
        private final void m42553x399be487(android.view.View view, android.view.ViewGroup viewGroup) {
            com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.C4853x7e4b6695 m42517xe172022e = com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4876xaa469f58.f21085x4fbc8495.m42517xe172022e(view);
            if (m42517xe172022e == null) {
                return;
            }
            m42517xe172022e.m42397xb94807ec(viewGroup != null ? new java.lang.ref.WeakReference<>(viewGroup) : null);
        }

        /* renamed from: setDelegate */
        public final void m42554xa7687c07(android.view.View view) {
            com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.C4853x7e4b6695 m42517xe172022e = com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4876xaa469f58.f21085x4fbc8495.m42517xe172022e(view);
            if (m42517xe172022e != null) {
                java.lang.Integer eLeft = m42517xe172022e.getELeft();
                java.lang.Integer eTop = m42517xe172022e.getETop();
                java.lang.Integer eRight = m42517xe172022e.getERight();
                java.lang.Integer eBottom = m42517xe172022e.getEBottom();
                java.lang.Boolean passRelativeCoordinate = m42517xe172022e.getPassRelativeCoordinate();
                if (eLeft == null || eTop == null || eRight == null || eBottom == null || passRelativeCoordinate == null) {
                    return;
                }
                boolean booleanValue = passRelativeCoordinate.booleanValue();
                int intValue = eBottom.intValue();
                int intValue2 = eRight.intValue();
                int intValue3 = eTop.intValue();
                com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.INSTANCE.m42558xa7687c07(view, eLeft.intValue(), intValue3, intValue2, intValue, booleanValue);
            }
        }

        /* renamed from: expand */
        public final void m42555xb328de9a(android.view.View view, int i17, int i18, int i19, int i27) {
            m42550x8c53ca37(this, view, i17, i18, i19, i27, false, 32, null);
        }

        /* renamed from: findLargeParentPath */
        public final android.view.ViewGroup m42557xf24fe91(android.view.View view, android.graphics.Rect outRectInParent, int eLeft, int eTop, int eRight, int eBottom) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRectInParent, "outRectInParent");
            android.view.ViewParent parent = view.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup == null) {
                return null;
            }
            view.getHitRect(outRectInParent);
            outRectInParent.left -= eLeft;
            outRectInParent.top -= eTop;
            outRectInParent.right += eRight;
            outRectInParent.bottom += eBottom;
            android.view.ViewGroup m42551x83f520e2 = m42551x83f520e2(view);
            if (m42551x83f520e2 != null) {
                try {
                    m42551x83f520e2.offsetDescendantRectToMyCoords(viewGroup, outRectInParent);
                    return m42551x83f520e2;
                } catch (java.lang.IllegalArgumentException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.TAG, "getParentCached: throw " + e17.getMessage());
                    com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.INSTANCE.m42553x399be487(view, null);
                }
            }
            while (viewGroup != null) {
                if (!m42552xd25ba21a(viewGroup, outRectInParent) || viewGroup.isClickable() || viewGroup.isLongClickable() || m42549x7a2999c1(viewGroup)) {
                    m42553x399be487(view, viewGroup);
                    return viewGroup;
                }
                if (!(viewGroup.getParent() instanceof android.view.ViewGroup)) {
                    return null;
                }
                android.view.ViewParent parent2 = viewGroup.getParent();
                android.view.ViewGroup viewGroup2 = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
                if (viewGroup2 != null) {
                    try {
                        viewGroup2.offsetDescendantRectToMyCoords(viewGroup, outRectInParent);
                    } catch (java.lang.IllegalArgumentException e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.TAG, "findLargeParentPath: throw " + e18.getMessage());
                        return null;
                    }
                }
                viewGroup = viewGroup2;
            }
            return null;
        }

        /* renamed from: expand */
        public final void m42556xb328de9a(android.view.View view, int i17, int i18, int i19, int i27, boolean z17) {
            if (view == null) {
                return;
            }
            com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.C4853x7e4b6695 m42517xe172022e = com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4876xaa469f58.f21085x4fbc8495.m42517xe172022e(view);
            if (m42517xe172022e != null) {
                m42517xe172022e.m42390x52df1aca(java.lang.Integer.valueOf(i17));
                m42517xe172022e.m42392x76496232(java.lang.Integer.valueOf(i18));
                m42517xe172022e.m42391x95a9fb9(java.lang.Integer.valueOf(i19));
                m42517xe172022e.m42389x706702e(java.lang.Integer.valueOf(i27));
                m42517xe172022e.m42395xa638ee57(java.lang.Boolean.valueOf(z17));
            }
            com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.f21101x28abd66d.m42866x4255129c(view, "addOnLayoutChangeListener", new com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4883x790bc8fa(view));
            m42554xa7687c07(view);
        }

        /* renamed from: setDelegate */
        public final void m42558xa7687c07(android.view.View v17, int i17, int i18, int i19, int i27, boolean z17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
            android.graphics.Rect rect = new android.graphics.Rect();
            android.view.ViewGroup m42557xf24fe91 = m42557xf24fe91(v17, rect, i17, i18, i19, i27);
            jz5.f0 f0Var = null;
            if (m42557xf24fe91 != null) {
                android.view.TouchDelegate touchDelegate = m42557xf24fe91.getTouchDelegate();
                com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a c4882xbb3d954a = touchDelegate instanceof com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a ? (com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a) touchDelegate : null;
                if (c4882xbb3d954a != null) {
                    c4882xbb3d954a.m42547xe5e5776(v17, rect);
                } else {
                    m42557xf24fe91.setTouchDelegate(new com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a(m42557xf24fe91, z17));
                    android.view.TouchDelegate touchDelegate2 = m42557xf24fe91.getTouchDelegate();
                    com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a c4882xbb3d954a2 = touchDelegate2 instanceof com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a ? (com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a) touchDelegate2 : null;
                    if (c4882xbb3d954a2 != null) {
                        c4882xbb3d954a2.m42547xe5e5776(v17, rect);
                    }
                }
                com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.C4853x7e4b6695 m42517xe172022e = com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4876xaa469f58.f21085x4fbc8495.m42517xe172022e(v17);
                if (m42517xe172022e != null) {
                    m42517xe172022e.m42396xaf0594a2(new java.lang.ref.WeakReference<>(m42557xf24fe91.getTouchDelegate()));
                }
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.TAG, "expand parent null? " + com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4968x823b57dd.f21368x4fbc8495.m42859xfb82e301(v17.getId()));
            }
        }
    }

    public /* synthetic */ C4882xbb3d954a(android.view.ViewGroup viewGroup, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(viewGroup, (i17 & 2) != 0 ? false : z17);
    }

    /* renamed from: expand */
    public static final void m42543xb328de9a(android.view.View view, int i17, int i18, int i19, int i27) {
        INSTANCE.m42555xb328de9a(view, i17, i18, i19, i27);
    }

    /* renamed from: putRect */
    private final synchronized void m42545xf2ea6193(android.view.View view, android.graphics.Rect rect) {
        for (java.lang.ref.WeakReference<android.view.View> weakReference : this.viewRectMap.keySet()) {
            android.view.View view2 = weakReference.get();
            boolean z17 = false;
            if (view2 != null && view2.hashCode() == view.hashCode()) {
                z17 = true;
            }
            if (z17) {
                this.viewRectMap.put(weakReference, rect);
                return;
            }
        }
        this.viewRectMap.put(new java.lang.ref.WeakReference<>(view), rect);
    }

    /* renamed from: reset */
    private final void m42546x6761d4f() {
        this.mTargetedRect = null;
        this.mTargetedView = null;
        this.mDelegateTargeted = false;
    }

    /* renamed from: addDelegateChild */
    public final void m42547xe5e5776(android.view.View view, android.graphics.Rect rect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "rect");
        m42545xf2ea6193(view, new android.graphics.Rect(rect));
    }

    @Override // android.view.TouchDelegate
    public boolean onTouchEvent(android.view.MotionEvent event) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        int hashCode = event.hashCode();
        java.lang.Integer num = this.lastEventCode;
        boolean z18 = false;
        if (num != null && hashCode == num.intValue()) {
            return false;
        }
        this.lastEventCode = java.lang.Integer.valueOf(event.hashCode());
        int x17 = (int) event.getX();
        int y17 = (int) event.getY();
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                if (actionMasked == 3) {
                    z17 = this.mDelegateTargeted;
                } else if (actionMasked != 5 && actionMasked != 6) {
                    z17 = false;
                }
            }
            z17 = this.mDelegateTargeted;
        } else {
            java.util.Iterator<T> it = this.viewRectMap.entrySet().iterator();
            boolean z19 = false;
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                if (((android.graphics.Rect) entry.getValue()).contains(x17, y17)) {
                    android.view.View view = (android.view.View) ((java.lang.ref.WeakReference) entry.getKey()).get();
                    if (view == null) {
                        return false;
                    }
                    if (view.getVisibility() == 0 && view.isShown()) {
                        com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4968x823b57dd c4968x823b57dd = com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4968x823b57dd.f21368x4fbc8495;
                        android.view.View view2 = (android.view.View) ((java.lang.ref.WeakReference) entry.getKey()).get();
                        c4968x823b57dd.m42859xfb82e301(view2 != null ? view2.getId() : 0);
                        c4968x823b57dd.m42859xfb82e301(this.parentView.getId());
                        this.parentView.isClickable();
                        this.parentView.isLongClickable();
                        this.mTargetedRect = (android.graphics.Rect) entry.getValue();
                        this.mTargetedView = (android.view.View) ((java.lang.ref.WeakReference) entry.getKey()).get();
                        this.mDelegateTargeted = true;
                        z19 = true;
                    }
                }
            }
            if (!z19) {
                m42546x6761d4f();
            }
            z17 = this.mDelegateTargeted;
        }
        android.view.View view3 = this.mTargetedView;
        android.graphics.Rect rect = this.mTargetedRect;
        if (z17 && view3 != null && rect != null) {
            if (this.passRelativeCoordinate) {
                event.setLocation(event.getX() - view3.getLeft(), event.getY() - view3.getTop());
            } else {
                event.setLocation(view3.getWidth() / 2.0f, view3.getHeight() / 2.0f);
            }
            z18 = view3.dispatchTouchEvent(event);
        }
        this.lastEventCode = null;
        if (3 == event.getActionMasked()) {
            m42546x6761d4f();
        }
        return z18;
    }

    @Override // android.view.TouchDelegate
    public boolean onTouchExplorationHoverEvent(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C4882xbb3d954a(android.view.ViewGroup r2, boolean r3) {
        /*
            r1 = this;
            java.lang.String r0 = "parentView"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r0)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.getHitRect(r0)
            r1.<init>(r0, r2)
            r1.parentView = r2
            r1.passRelativeCoordinate = r3
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r1.viewRectMap = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.<init>(android.view.ViewGroup, boolean):void");
    }

    /* renamed from: expand */
    public static final void m42544xb328de9a(android.view.View view, int i17, int i18, int i19, int i27, boolean z17) {
        INSTANCE.m42556xb328de9a(view, i17, i18, i19, i27, z17);
    }
}
