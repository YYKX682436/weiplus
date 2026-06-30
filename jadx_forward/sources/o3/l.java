package o3;

/* loaded from: classes14.dex */
public class l {

    /* renamed from: d, reason: collision with root package name */
    public static int f424174d;

    /* renamed from: a, reason: collision with root package name */
    public final android.view.accessibility.AccessibilityNodeInfo f424175a;

    /* renamed from: b, reason: collision with root package name */
    public int f424176b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f424177c = -1;

    public l(java.lang.Object obj) {
        this.f424175a = (android.view.accessibility.AccessibilityNodeInfo) obj;
    }

    public static java.lang.String d(int i17) {
        if (i17 == 1) {
            return "ACTION_FOCUS";
        }
        if (i17 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i17) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case android.R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case android.R.id.KEYCODE_3D_MODE:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i17) {
                    case android.R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case android.R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case android.R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case android.R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case android.R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case android.R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case android.R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case android.R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i17) {
                            case android.R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case android.R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case android.R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case android.R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case android.R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case android.R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case android.R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i17) {
                                    case android.R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case android.R.id.ALT:
                                        return "ACTION_DRAG_START";
                                    case android.R.id.CTRL:
                                        return "ACTION_DRAG_DROP";
                                    case android.R.id.FUNCTION:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public void a(int i17) {
        this.f424175a.addAction(i17);
    }

    public void b(o3.f fVar) {
        this.f424175a.addAction((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) fVar.f424169a);
    }

    public final java.util.List c(java.lang.String str) {
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = this.f424175a;
        java.util.ArrayList<java.lang.Integer> integerArrayList = o3.g.c(accessibilityNodeInfo).getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
        o3.g.c(accessibilityNodeInfo).putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public final boolean e(int i17) {
        android.os.Bundle c17 = o3.g.c(this.f424175a);
        return c17 != null && (c17.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i17) == i17;
    }

    /* renamed from: equals */
    public boolean m150531xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o3.l)) {
            return false;
        }
        o3.l lVar = (o3.l) obj;
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = lVar.f424175a;
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo2 = this.f424175a;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        return this.f424177c == lVar.f424177c && this.f424176b == lVar.f424176b;
    }

    public void f(android.graphics.Rect rect) {
        this.f424175a.getBoundsInParent(rect);
    }

    public java.lang.CharSequence g() {
        int i17 = android.os.Build.VERSION.SDK_INT;
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = this.f424175a;
        return i17 >= 30 ? o3.h.b(accessibilityNodeInfo) : o3.g.c(accessibilityNodeInfo).getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public java.lang.CharSequence h() {
        boolean z17 = !c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = this.f424175a;
        if (!z17) {
            return accessibilityNodeInfo.getText();
        }
        java.util.List c17 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        java.util.List c18 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        java.util.List c19 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        java.util.List c27 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        android.text.SpannableString spannableString = new android.text.SpannableString(android.text.TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i17 = 0; i17 < c17.size(); i17++) {
            spannableString.setSpan(new o3.a(((java.lang.Integer) c27.get(i17)).intValue(), this, o3.g.c(accessibilityNodeInfo).getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((java.lang.Integer) c17.get(i17)).intValue(), ((java.lang.Integer) c18.get(i17)).intValue(), ((java.lang.Integer) c19.get(i17)).intValue());
        }
        return spannableString;
    }

    /* renamed from: hashCode */
    public int m150532x8cdac1b() {
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = this.f424175a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public void i(boolean z17) {
        this.f424175a.setAccessibilityFocused(z17);
    }

    public final void j(int i17, boolean z17) {
        android.os.Bundle c17 = o3.g.c(this.f424175a);
        if (c17 != null) {
            int i18 = c17.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i17);
            if (!z17) {
                i17 = 0;
            }
            c17.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i17 | i18);
        }
    }

    public void k(android.graphics.Rect rect) {
        this.f424175a.setBoundsInParent(rect);
    }

    public void l(android.graphics.Rect rect) {
        this.f424175a.setBoundsInScreen(rect);
    }

    public void m(boolean z17) {
        this.f424175a.setCheckable(z17);
    }

    public void n(java.lang.CharSequence charSequence) {
        this.f424175a.setClassName(charSequence);
    }

    public void o(java.lang.Object obj) {
        this.f424175a.setCollectionItemInfo(obj == null ? null : (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) ((o3.k) obj).f424173a);
    }

    public void p(java.lang.CharSequence charSequence) {
        this.f424175a.setContentDescription(charSequence);
    }

    public void q(boolean z17) {
        this.f424175a.setEnabled(z17);
    }

    public void r(boolean z17) {
        this.f424175a.setFocusable(z17);
    }

    public void s(boolean z17) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.f424175a.setScreenReaderFocusable(z17);
        } else {
            j(1, z17);
        }
    }

    public void t(boolean z17) {
        this.f424175a.setScrollable(z17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    /* renamed from: toString */
    public java.lang.String m150533x9616526c() {
        ?? emptyList;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(super.toString());
        android.graphics.Rect rect = new android.graphics.Rect();
        f(rect);
        sb6.append("; boundsInParent: " + rect);
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = this.f424175a;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb6.append("; boundsInScreen: " + rect);
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 34) {
            o3.j.a(accessibilityNodeInfo, rect);
        } else {
            android.graphics.Rect rect2 = (android.graphics.Rect) o3.g.c(accessibilityNodeInfo).getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        sb6.append("; boundsInWindow: " + rect);
        sb6.append("; packageName: ");
        sb6.append(accessibilityNodeInfo.getPackageName());
        sb6.append("; className: ");
        sb6.append(accessibilityNodeInfo.getClassName());
        sb6.append("; text: ");
        sb6.append(h());
        sb6.append("; error: ");
        sb6.append(accessibilityNodeInfo.getError());
        sb6.append("; maxTextLength: ");
        sb6.append(accessibilityNodeInfo.getMaxTextLength());
        sb6.append("; stateDescription: ");
        sb6.append(g());
        sb6.append("; contentDescription: ");
        sb6.append(accessibilityNodeInfo.getContentDescription());
        sb6.append("; tooltipText: ");
        sb6.append(i17 >= 28 ? accessibilityNodeInfo.getTooltipText() : o3.g.c(accessibilityNodeInfo).getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY"));
        sb6.append("; viewIdResName: ");
        sb6.append(accessibilityNodeInfo.getViewIdResourceName());
        sb6.append("; uniqueId: ");
        sb6.append(i17 >= 33 ? o3.i.g(accessibilityNodeInfo) : o3.g.c(accessibilityNodeInfo).getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"));
        sb6.append("; checkable: ");
        sb6.append(accessibilityNodeInfo.isCheckable());
        sb6.append("; checked: ");
        sb6.append(accessibilityNodeInfo.isChecked());
        sb6.append("; focusable: ");
        sb6.append(accessibilityNodeInfo.isFocusable());
        sb6.append("; focused: ");
        sb6.append(accessibilityNodeInfo.isFocused());
        sb6.append("; selected: ");
        sb6.append(accessibilityNodeInfo.isSelected());
        sb6.append("; clickable: ");
        sb6.append(accessibilityNodeInfo.isClickable());
        sb6.append("; longClickable: ");
        sb6.append(accessibilityNodeInfo.isLongClickable());
        sb6.append("; contextClickable: ");
        sb6.append(accessibilityNodeInfo.isContextClickable());
        sb6.append("; enabled: ");
        sb6.append(accessibilityNodeInfo.isEnabled());
        sb6.append("; password: ");
        sb6.append(accessibilityNodeInfo.isPassword());
        sb6.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb6.append("; containerTitle: ");
        sb6.append(i17 >= 34 ? o3.j.b(accessibilityNodeInfo) : o3.g.c(accessibilityNodeInfo).getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY"));
        sb6.append("; granularScrollingSupported: ");
        sb6.append(e(67108864));
        sb6.append("; importantForAccessibility: ");
        sb6.append(accessibilityNodeInfo.isImportantForAccessibility());
        sb6.append("; visible: ");
        sb6.append(accessibilityNodeInfo.isVisibleToUser());
        sb6.append("; isTextSelectable: ");
        sb6.append(i17 >= 33 ? o3.i.h(accessibilityNodeInfo) : e(8388608));
        sb6.append("; accessibilityDataSensitive: ");
        sb6.append(i17 >= 34 ? o3.j.e(accessibilityNodeInfo) : e(64));
        sb6.append("; [");
        java.util.List<android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        if (actionList != null) {
            emptyList = new java.util.ArrayList();
            int size = actionList.size();
            for (int i18 = 0; i18 < size; i18++) {
                emptyList.add(new o3.f(actionList.get(i18), 0, null, null, null));
            }
        } else {
            emptyList = java.util.Collections.emptyList();
        }
        for (int i19 = 0; i19 < emptyList.size(); i19++) {
            o3.f fVar = (o3.f) emptyList.get(i19);
            java.lang.String d17 = d(((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) fVar.f424169a).getId());
            if (d17.equals("ACTION_UNKNOWN")) {
                java.lang.Object obj = fVar.f424169a;
                if (((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                    d17 = ((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
                }
            }
            sb6.append(d17);
            if (i19 != emptyList.size() - 1) {
                sb6.append(", ");
            }
        }
        sb6.append("]");
        return sb6.toString();
    }

    public void u(java.lang.CharSequence charSequence) {
        int i17 = android.os.Build.VERSION.SDK_INT;
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = this.f424175a;
        if (i17 >= 30) {
            o3.h.c(accessibilityNodeInfo, charSequence);
        } else {
            o3.g.c(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public void v(java.lang.CharSequence charSequence) {
        this.f424175a.setText(charSequence);
    }

    public l(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f424175a = accessibilityNodeInfo;
    }
}
