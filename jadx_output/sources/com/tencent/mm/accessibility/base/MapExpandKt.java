package com.tencent.mm.accessibility.base;

@kotlin.Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aG\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001e\u0010\f\u001a\u00020\u0006*\u00020\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\n\u001a\u0018\u0010\u000f\u001a\u00020\u0006*\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r\u001a\n\u0010\u0011\u001a\u00020\u0010*\u00020\t\u001a\n\u0010\u0012\u001a\u00020\u0010*\u00020\t\u001a\n\u0010\u0013\u001a\u00020\u0010*\u00020\t\u001a\n\u0010\u0014\u001a\u00020\u0010*\u00020\t\u001a\n\u0010\u0015\u001a\u00020\u0010*\u00020\t\u001a\n\u0010\u0017\u001a\u00020\u0006*\u00020\u0016\u001a\n\u0010\u0018\u001a\u00020\u0006*\u00020\u0016\u001a\u0012\u0010\u001b\u001a\u00020\u0006*\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019\u001a\u0012\u0010\u001c\u001a\u00020\u0006*\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019\u001a\u0018\u0010 \u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0016H\u0002\"&\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$\"\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010&\"\u0014\u0010'\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010&¨\u0006("}, d2 = {androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "", "", "outsideInt", "insideInt", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Ljz5/f0;", "putData", "(Ljava/util/Map;IILjava/lang/Object;)V", "Landroid/view/View;", "Lkotlin/Function1;", "visitor", "visitChild", "Lkotlin/Function0;", "invoke", "postIfNeed", "", "isList", "canDelegateOnInflate", org.chromium.net.HttpNegotiateConstants.KEY_CAN_DELEGATE, "isComposeView", "isDisabledDelegate", "Landroid/view/accessibility/AccessibilityNodeInfo;", "disable", "clearInfo", "Landroid/content/Context;", "context", "recordText", "toFakeInfo", "", "key", "info", "recordAccInfo", "", "Lcom/tencent/mm/accessibility/base/AccInfo;", "infoMap", "Ljava/util/Map;", "PerPoolMaxSize", "I", "PerPoolMinSize", "plugin-autoaccessibility_release"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class MapExpandKt {
    private static final int PerPoolMaxSize = 1000;
    private static final int PerPoolMinSize = 5;
    private static final java.util.Map<java.lang.String, java.util.List<com.tencent.mm.accessibility.base.AccInfo>> infoMap = new java.util.LinkedHashMap();

    public static final boolean canDelegate(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<this>");
        return (isList(view) || isComposeView(view) || isDisabledDelegate(view)) ? false : true;
    }

    public static final boolean canDelegateOnInflate(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<this>");
        if (isList(view)) {
            return false;
        }
        android.view.ViewParent parent = view.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        return ((viewGroup != null && isList(viewGroup)) || isComposeView(view)) ? false : true;
    }

    public static final void clearInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        kotlin.jvm.internal.o.g(accessibilityNodeInfo, "<this>");
        accessibilityNodeInfo.setViewIdResourceName("");
        accessibilityNodeInfo.setText("");
        accessibilityNodeInfo.setContentDescription("");
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            accessibilityNodeInfo.setHintText("");
        }
    }

    public static final void disable(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        kotlin.jvm.internal.o.g(accessibilityNodeInfo, "<this>");
        accessibilityNodeInfo.setText("");
        accessibilityNodeInfo.setContentDescription("");
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            accessibilityNodeInfo.setHintText("");
        }
        accessibilityNodeInfo.setCheckable(false);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        accessibilityNodeInfo.setFocusable(false);
    }

    public static final boolean isComposeView(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<this>");
        return r26.n0.B(view.getClass().getSimpleName(), "AndroidComposeView", false);
    }

    public static final boolean isDisabledDelegate(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<this>");
        java.lang.Object tag = view.getTag(com.tencent.mm.R.id.nw7);
        return kotlin.jvm.internal.o.b(tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null, java.lang.Boolean.TRUE);
    }

    public static final boolean isList(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<this>");
        return (view instanceof android.widget.ListView) || (view instanceof androidx.recyclerview.widget.RecyclerView);
    }

    public static final void postIfNeed(android.view.View view, final yz5.a invoke) {
        kotlin.jvm.internal.o.g(view, "<this>");
        kotlin.jvm.internal.o.g(invoke, "invoke");
        if (view.getWidth() == 0 && view.getHeight() == 0) {
            view.post(new java.lang.Runnable() { // from class: com.tencent.mm.accessibility.base.MapExpandKt$postIfNeed$1
                @Override // java.lang.Runnable
                public final void run() {
                    yz5.a.this.invoke();
                }
            });
        } else {
            invoke.invoke();
        }
    }

    public static final <T> void putData(java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, T>> map, int i17, int i18, T t17) {
        kotlin.jvm.internal.o.g(map, "<this>");
        if (map.get(java.lang.Integer.valueOf(i17)) == null) {
            map.put(java.lang.Integer.valueOf(i17), new java.util.LinkedHashMap());
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.util.Map<java.lang.Integer, T> map2 = map.get(java.lang.Integer.valueOf(i17));
        kotlin.jvm.internal.o.d(map2);
        map2.put(valueOf, t17);
    }

    private static final void recordAccInfo(java.lang.String str, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String obj;
        java.util.Map<java.lang.String, java.util.List<com.tencent.mm.accessibility.base.AccInfo>> map = infoMap;
        if (!map.containsKey(str)) {
            map.put(str, new java.util.ArrayList());
        }
        java.util.List<com.tencent.mm.accessibility.base.AccInfo> list = map.get(str);
        if (list == null) {
            return;
        }
        java.lang.CharSequence contentDescription = accessibilityNodeInfo.getContentDescription();
        java.lang.String str4 = "";
        if (contentDescription == null || (str2 = contentDescription.toString()) == null) {
            str2 = "";
        }
        java.lang.String viewIdResourceName = accessibilityNodeInfo.getViewIdResourceName();
        if (viewIdResourceName == null) {
            viewIdResourceName = "";
        }
        java.lang.CharSequence text = accessibilityNodeInfo.getText();
        if (text == null || (str3 = text.toString()) == null) {
            str3 = "";
        }
        com.tencent.mm.accessibility.base.AccInfo accInfo = new com.tencent.mm.accessibility.base.AccInfo(viewIdResourceName, str3, str2);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            java.lang.CharSequence hintText = accessibilityNodeInfo.getHintText();
            if (hintText != null && (obj = hintText.toString()) != null) {
                str4 = obj;
            }
            accInfo.setHintText(str4);
        }
        list.add(accInfo);
        if (list.size() >= 1000) {
            map.put(str, list.subList(0, 500));
        }
    }

    public static final void recordText(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, android.content.Context context) {
        kotlin.jvm.internal.o.g(accessibilityNodeInfo, "<this>");
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.CharSequence contentDescription = accessibilityNodeInfo.getContentDescription();
        if (contentDescription == null || contentDescription.length() == 0) {
            java.lang.CharSequence text = accessibilityNodeInfo.getText();
            if (text == null || text.length() == 0) {
                return;
            }
        }
        recordAccInfo(context.getClass().getName(), accessibilityNodeInfo);
    }

    public static final void toFakeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, android.content.Context context) {
        kotlin.jvm.internal.o.g(accessibilityNodeInfo, "<this>");
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.CharSequence contentDescription = accessibilityNodeInfo.getContentDescription();
        boolean z17 = true;
        if (contentDescription == null || contentDescription.length() == 0) {
            java.lang.CharSequence text = accessibilityNodeInfo.getText();
            if (text != null && text.length() != 0) {
                z17 = false;
            }
            if (z17) {
                return;
            }
        }
        java.util.List<com.tencent.mm.accessibility.base.AccInfo> list = infoMap.get(context.getClass().getName());
        if (list == null) {
            list = new java.util.ArrayList<>();
        }
        if (list.size() <= 5) {
            clearInfo(accessibilityNodeInfo);
            return;
        }
        com.tencent.mm.accessibility.base.AccInfo accInfo = (com.tencent.mm.accessibility.base.AccInfo) kz5.n0.a0(list, c06.e.f37716d.e(0, list.size()));
        if (accInfo != null) {
            accessibilityNodeInfo.setContentDescription(accInfo.getContentDescription());
            accessibilityNodeInfo.setText(accInfo.getText());
            accessibilityNodeInfo.setViewIdResourceName(accInfo.getViewIdResourceName());
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                accessibilityNodeInfo.setHintText(accInfo.getHintText());
            }
        }
    }

    public static final void visitChild(android.view.View view, yz5.l visitor) {
        kotlin.jvm.internal.o.g(view, "<this>");
        kotlin.jvm.internal.o.g(visitor, "visitor");
        visitor.invoke(view);
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = viewGroup.getChildAt(i17);
                if (childAt != null) {
                    visitChild(childAt, visitor);
                }
            }
        }
    }
}
