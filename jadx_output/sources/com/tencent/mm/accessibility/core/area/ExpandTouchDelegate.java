package com.tencent.mm.accessibility.core.area;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\u0019\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R&\u0010\u001c\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001b\u0012\u0004\u0012\u00020\u00040\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/tencent/mm/accessibility/core/area/ExpandTouchDelegate;", "Landroid/view/TouchDelegate;", "Landroid/view/View;", "view", "Landroid/graphics/Rect;", "rectKey", "Ljz5/f0;", "putRect", "reset", "rect", "addDelegateChild", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "onTouchExplorationHoverEvent", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/ViewGroup;", "passRelativeCoordinate", "Z", "mDelegateTargeted", "mTargetedRect", "Landroid/graphics/Rect;", "mTargetedView", "Landroid/view/View;", "", "Ljava/lang/ref/WeakReference;", "viewRectMap", "Ljava/util/Map;", "", "lastEventCode", "Ljava/lang/Integer;", "<init>", "(Landroid/view/ViewGroup;Z)V", "Companion", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class ExpandTouchDelegate extends android.view.TouchDelegate {
    public static final java.lang.String TAG = "MicroMsg.Acc.ExpandTouchDelegate";
    private static java.lang.reflect.Method getListenerInfoMethod;
    private static java.lang.reflect.Field mOnTouchListenerField;
    private static boolean successReflect;
    private static boolean tryReflect;
    private java.lang.Integer lastEventCode;
    private boolean mDelegateTargeted;
    private android.graphics.Rect mTargetedRect;
    private android.view.View mTargetedView;
    private final android.view.ViewGroup parentView;
    private final boolean passRelativeCoordinate;
    private final java.util.Map<java.lang.ref.WeakReference<android.view.View>, android.graphics.Rect> viewRectMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.Companion INSTANCE = new com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.Companion(null);
    public static final int $stable = 8;
    private static final com.tencent.mm.accessibility.uitl.TimeBlocker timeBlocker = new com.tencent.mm.accessibility.uitl.TimeBlocker(1000);
    private static final com.tencent.mm.accessibility.core.area.ExpandTouchDelegate$Companion$layoutChangeListener$1 layoutChangeListener = new android.view.View.OnLayoutChangeListener() { // from class: com.tencent.mm.accessibility.core.area.ExpandTouchDelegate$Companion$layoutChangeListener$1
        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(android.view.View v17, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
            kotlin.jvm.internal.o.g(v17, "v");
            com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.timeBlocker.pendingExcu(v17, "onLayoutChange", new com.tencent.mm.accessibility.core.area.ExpandTouchDelegate$Companion$layoutChangeListener$1$onLayoutChange$1(v17, this));
        }
    };

    @kotlin.Metadata(d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u001f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\f\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J<\u0010\u0015\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\nH\u0007J6\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\nJ8\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fR\u0014\u0010\u001a\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010&¨\u0006-"}, d2 = {"Lcom/tencent/mm/accessibility/core/area/ExpandTouchDelegate$Companion;", "", "Landroid/view/View;", "view", "Ljz5/f0;", "setDelegate", "Landroid/view/ViewGroup;", "parent", "Landroid/graphics/Rect;", "rectInParent", "", "isOutBound", "checkHasTouchListener", "getParentCached", "saveParent", "", "eLeft", "eTop", "eRight", "eBottom", "passRelativeCoordinate", "expand", org.chromium.base.BaseSwitches.V, "outRectInParent", "findLargeParentPath", "", "TAG", "Ljava/lang/String;", "Ljava/lang/reflect/Method;", "getListenerInfoMethod", "Ljava/lang/reflect/Method;", "com/tencent/mm/accessibility/core/area/ExpandTouchDelegate$Companion$layoutChangeListener$1", "layoutChangeListener", "Lcom/tencent/mm/accessibility/core/area/ExpandTouchDelegate$Companion$layoutChangeListener$1;", "Ljava/lang/reflect/Field;", "mOnTouchListenerField", "Ljava/lang/reflect/Field;", "successReflect", "Z", "Lcom/tencent/mm/accessibility/uitl/TimeBlocker;", "timeBlocker", "Lcom/tencent/mm/accessibility/uitl/TimeBlocker;", "tryReflect", "<init>", "()V", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        private final boolean checkHasTouchListener(android.view.View view) {
            if (view == null) {
                return false;
            }
            if (com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.tryReflect && !com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.successReflect) {
                return false;
            }
            if (!com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.tryReflect) {
                try {
                    com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.getListenerInfoMethod = android.view.View.class.getDeclaredMethod("getListenerInfo", new java.lang.Class[0]);
                    java.lang.reflect.Method method = com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.getListenerInfoMethod;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.mOnTouchListenerField = java.lang.Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener");
                    java.lang.reflect.Field field = com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.mOnTouchListenerField;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                    com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.successReflect = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.TAG, th6, "tryReflect error in checkHasTouchListener", new java.lang.Object[0]);
                }
                com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.tryReflect = true;
            }
            if (com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.successReflect && com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.getListenerInfoMethod != null && com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.mOnTouchListenerField != null) {
                try {
                    java.lang.reflect.Field field2 = com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.mOnTouchListenerField;
                    java.lang.reflect.Method method2 = com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.getListenerInfoMethod;
                    if (field2 != null && method2 != null && field2.get(method2.invoke(view, new java.lang.Object[0])) != null) {
                        com.tencent.mm.accessibility.uitl.IdUtil.INSTANCE.getName(view.getId());
                        return true;
                    }
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.TAG, th7, "successReflect but invoke error in checkHasTouchListener", new java.lang.Object[0]);
                }
            }
            return false;
        }

        public static /* synthetic */ void expand$default(com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.Companion companion, android.view.View view, int i17, int i18, int i19, int i27, boolean z17, int i28, java.lang.Object obj) {
            if ((i28 & 32) != 0) {
                z17 = false;
            }
            companion.expand(view, i17, i18, i19, i27, z17);
        }

        private final android.view.ViewGroup getParentCached(android.view.View view) {
            com.tencent.mm.accessibility.base.ViewTag tagData = com.tencent.mm.accessibility.core.ViewTagManager.INSTANCE.getTagData(view);
            java.lang.ref.WeakReference<android.view.ViewGroup> touchDelegateParent = tagData != null ? tagData.getTouchDelegateParent() : null;
            if (!(touchDelegateParent instanceof java.lang.ref.WeakReference)) {
                touchDelegateParent = null;
            }
            if (touchDelegateParent == null) {
                return null;
            }
            android.view.ViewGroup viewGroup = touchDelegateParent.get();
            if (viewGroup instanceof android.view.ViewGroup) {
                return viewGroup;
            }
            return null;
        }

        private final boolean isOutBound(android.view.ViewGroup parent, android.graphics.Rect rectInParent) {
            return parent.getHeight() < rectInParent.bottom || parent.getWidth() < rectInParent.right || rectInParent.top < 0 || rectInParent.left < 0;
        }

        private final void saveParent(android.view.View view, android.view.ViewGroup viewGroup) {
            com.tencent.mm.accessibility.base.ViewTag tagData = com.tencent.mm.accessibility.core.ViewTagManager.INSTANCE.getTagData(view);
            if (tagData == null) {
                return;
            }
            tagData.setTouchDelegateParent(viewGroup != null ? new java.lang.ref.WeakReference<>(viewGroup) : null);
        }

        public final void setDelegate(android.view.View view) {
            com.tencent.mm.accessibility.base.ViewTag tagData = com.tencent.mm.accessibility.core.ViewTagManager.INSTANCE.getTagData(view);
            if (tagData != null) {
                java.lang.Integer eLeft = tagData.getELeft();
                java.lang.Integer eTop = tagData.getETop();
                java.lang.Integer eRight = tagData.getERight();
                java.lang.Integer eBottom = tagData.getEBottom();
                java.lang.Boolean passRelativeCoordinate = tagData.getPassRelativeCoordinate();
                if (eLeft == null || eTop == null || eRight == null || eBottom == null || passRelativeCoordinate == null) {
                    return;
                }
                boolean booleanValue = passRelativeCoordinate.booleanValue();
                int intValue = eBottom.intValue();
                int intValue2 = eRight.intValue();
                int intValue3 = eTop.intValue();
                com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.INSTANCE.setDelegate(view, eLeft.intValue(), intValue3, intValue2, intValue, booleanValue);
            }
        }

        public final void expand(android.view.View view, int i17, int i18, int i19, int i27) {
            expand$default(this, view, i17, i18, i19, i27, false, 32, null);
        }

        public final android.view.ViewGroup findLargeParentPath(android.view.View view, android.graphics.Rect outRectInParent, int eLeft, int eTop, int eRight, int eBottom) {
            kotlin.jvm.internal.o.g(view, "view");
            kotlin.jvm.internal.o.g(outRectInParent, "outRectInParent");
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
            android.view.ViewGroup parentCached = getParentCached(view);
            if (parentCached != null) {
                try {
                    parentCached.offsetDescendantRectToMyCoords(viewGroup, outRectInParent);
                    return parentCached;
                } catch (java.lang.IllegalArgumentException e17) {
                    com.tencent.mars.xlog.Log.e(com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.TAG, "getParentCached: throw " + e17.getMessage());
                    com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.INSTANCE.saveParent(view, null);
                }
            }
            while (viewGroup != null) {
                if (!isOutBound(viewGroup, outRectInParent) || viewGroup.isClickable() || viewGroup.isLongClickable() || checkHasTouchListener(viewGroup)) {
                    saveParent(view, viewGroup);
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
                        com.tencent.mars.xlog.Log.e(com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.TAG, "findLargeParentPath: throw " + e18.getMessage());
                        return null;
                    }
                }
                viewGroup = viewGroup2;
            }
            return null;
        }

        public final void expand(android.view.View view, int i17, int i18, int i19, int i27, boolean z17) {
            if (view == null) {
                return;
            }
            com.tencent.mm.accessibility.base.ViewTag tagData = com.tencent.mm.accessibility.core.ViewTagManager.INSTANCE.getTagData(view);
            if (tagData != null) {
                tagData.setELeft(java.lang.Integer.valueOf(i17));
                tagData.setETop(java.lang.Integer.valueOf(i18));
                tagData.setERight(java.lang.Integer.valueOf(i19));
                tagData.setEBottom(java.lang.Integer.valueOf(i27));
                tagData.setPassRelativeCoordinate(java.lang.Boolean.valueOf(z17));
            }
            com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.timeBlocker.pendingExcu(view, "addOnLayoutChangeListener", new com.tencent.mm.accessibility.core.area.ExpandTouchDelegate$Companion$expand$2(view));
            setDelegate(view);
        }

        public final void setDelegate(android.view.View v17, int i17, int i18, int i19, int i27, boolean z17) {
            kotlin.jvm.internal.o.g(v17, "v");
            android.graphics.Rect rect = new android.graphics.Rect();
            android.view.ViewGroup findLargeParentPath = findLargeParentPath(v17, rect, i17, i18, i19, i27);
            jz5.f0 f0Var = null;
            if (findLargeParentPath != null) {
                android.view.TouchDelegate touchDelegate = findLargeParentPath.getTouchDelegate();
                com.tencent.mm.accessibility.core.area.ExpandTouchDelegate expandTouchDelegate = touchDelegate instanceof com.tencent.mm.accessibility.core.area.ExpandTouchDelegate ? (com.tencent.mm.accessibility.core.area.ExpandTouchDelegate) touchDelegate : null;
                if (expandTouchDelegate != null) {
                    expandTouchDelegate.addDelegateChild(v17, rect);
                } else {
                    findLargeParentPath.setTouchDelegate(new com.tencent.mm.accessibility.core.area.ExpandTouchDelegate(findLargeParentPath, z17));
                    android.view.TouchDelegate touchDelegate2 = findLargeParentPath.getTouchDelegate();
                    com.tencent.mm.accessibility.core.area.ExpandTouchDelegate expandTouchDelegate2 = touchDelegate2 instanceof com.tencent.mm.accessibility.core.area.ExpandTouchDelegate ? (com.tencent.mm.accessibility.core.area.ExpandTouchDelegate) touchDelegate2 : null;
                    if (expandTouchDelegate2 != null) {
                        expandTouchDelegate2.addDelegateChild(v17, rect);
                    }
                }
                com.tencent.mm.accessibility.base.ViewTag tagData = com.tencent.mm.accessibility.core.ViewTagManager.INSTANCE.getTagData(v17);
                if (tagData != null) {
                    tagData.setTouchDelegate(new java.lang.ref.WeakReference<>(findLargeParentPath.getTouchDelegate()));
                }
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.e(com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.TAG, "expand parent null? " + com.tencent.mm.accessibility.uitl.IdUtil.INSTANCE.getName(v17.getId()));
            }
        }
    }

    public /* synthetic */ ExpandTouchDelegate(android.view.ViewGroup viewGroup, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        this(viewGroup, (i17 & 2) != 0 ? false : z17);
    }

    public static final void expand(android.view.View view, int i17, int i18, int i19, int i27) {
        INSTANCE.expand(view, i17, i18, i19, i27);
    }

    private final synchronized void putRect(android.view.View view, android.graphics.Rect rect) {
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

    private final void reset() {
        this.mTargetedRect = null;
        this.mTargetedView = null;
        this.mDelegateTargeted = false;
    }

    public final void addDelegateChild(android.view.View view, android.graphics.Rect rect) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(rect, "rect");
        putRect(view, new android.graphics.Rect(rect));
    }

    @Override // android.view.TouchDelegate
    public boolean onTouchEvent(android.view.MotionEvent event) {
        boolean z17;
        kotlin.jvm.internal.o.g(event, "event");
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
                        com.tencent.mm.accessibility.uitl.IdUtil idUtil = com.tencent.mm.accessibility.uitl.IdUtil.INSTANCE;
                        android.view.View view2 = (android.view.View) ((java.lang.ref.WeakReference) entry.getKey()).get();
                        idUtil.getName(view2 != null ? view2.getId() : 0);
                        idUtil.getName(this.parentView.getId());
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
                reset();
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
            reset();
        }
        return z18;
    }

    @Override // android.view.TouchDelegate
    public boolean onTouchExplorationHoverEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ExpandTouchDelegate(android.view.ViewGroup r2, boolean r3) {
        /*
            r1 = this;
            java.lang.String r0 = "parentView"
            kotlin.jvm.internal.o.g(r2, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.<init>(android.view.ViewGroup, boolean):void");
    }

    public static final void expand(android.view.View view, int i17, int i18, int i19, int i27, boolean z17) {
        INSTANCE.expand(view, i17, i18, i19, i27, z17);
    }
}
