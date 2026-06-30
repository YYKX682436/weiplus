package com.facebook.yoga.android;

/* loaded from: classes15.dex */
public class YogaLayout extends android.view.ViewGroup {
    private final com.facebook.yoga.YogaNode mYogaNode;
    private final java.util.Map<android.view.View, com.facebook.yoga.YogaNode> mYogaNodes;

    /* loaded from: classes15.dex */
    public static class ViewMeasureFunction implements com.facebook.yoga.YogaMeasureFunction {
        private int viewMeasureSpecFromYogaMeasureMode(com.facebook.yoga.YogaMeasureMode yogaMeasureMode) {
            if (yogaMeasureMode == com.facebook.yoga.YogaMeasureMode.AT_MOST) {
                return Integer.MIN_VALUE;
            }
            return yogaMeasureMode == com.facebook.yoga.YogaMeasureMode.EXACTLY ? 1073741824 : 0;
        }

        @Override // com.facebook.yoga.YogaMeasureFunction
        public long measure(com.facebook.yoga.YogaNode yogaNode, float f17, com.facebook.yoga.YogaMeasureMode yogaMeasureMode, float f18, com.facebook.yoga.YogaMeasureMode yogaMeasureMode2) {
            android.view.View view = (android.view.View) yogaNode.getData();
            if (view == null || (view instanceof com.facebook.yoga.android.YogaLayout)) {
                return com.facebook.yoga.YogaMeasureOutput.make(0, 0);
            }
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec((int) f17, viewMeasureSpecFromYogaMeasureMode(yogaMeasureMode)), android.view.View.MeasureSpec.makeMeasureSpec((int) f18, viewMeasureSpecFromYogaMeasureMode(yogaMeasureMode2)));
            return com.facebook.yoga.YogaMeasureOutput.make(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public YogaLayout(android.content.Context context) {
        this(context, null, 0);
    }

    public static void applyLayoutParams(com.facebook.yoga.android.YogaLayout.LayoutParams layoutParams, com.facebook.yoga.YogaNode yogaNode, android.view.View view) {
        if (view.getResources().getConfiguration().getLayoutDirection() == 1) {
            yogaNode.setDirection(com.facebook.yoga.YogaDirection.RTL);
        }
        android.graphics.drawable.Drawable background = view.getBackground();
        if (background != null) {
            if (background.getPadding(new android.graphics.Rect())) {
                yogaNode.setPadding(com.facebook.yoga.YogaEdge.LEFT, r0.left);
                yogaNode.setPadding(com.facebook.yoga.YogaEdge.TOP, r0.top);
                yogaNode.setPadding(com.facebook.yoga.YogaEdge.RIGHT, r0.right);
                yogaNode.setPadding(com.facebook.yoga.YogaEdge.BOTTOM, r0.bottom);
            }
        }
        for (int i17 = 0; i17 < layoutParams.numericAttributes.size(); i17++) {
            int keyAt = layoutParams.numericAttributes.keyAt(i17);
            float floatValue = layoutParams.numericAttributes.valueAt(i17).floatValue();
            if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_alignContent) {
                yogaNode.setAlignContent(com.facebook.yoga.YogaAlign.fromInt(java.lang.Math.round(floatValue)));
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_alignItems) {
                yogaNode.setAlignItems(com.facebook.yoga.YogaAlign.fromInt(java.lang.Math.round(floatValue)));
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_alignSelf) {
                yogaNode.setAlignSelf(com.facebook.yoga.YogaAlign.fromInt(java.lang.Math.round(floatValue)));
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_aspectRatio) {
                yogaNode.setAspectRatio(floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_borderLeft) {
                yogaNode.setBorder(com.facebook.yoga.YogaEdge.LEFT, floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_borderTop) {
                yogaNode.setBorder(com.facebook.yoga.YogaEdge.TOP, floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_borderRight) {
                yogaNode.setBorder(com.facebook.yoga.YogaEdge.RIGHT, floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_borderBottom) {
                yogaNode.setBorder(com.facebook.yoga.YogaEdge.BOTTOM, floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_borderStart) {
                yogaNode.setBorder(com.facebook.yoga.YogaEdge.START, floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_borderEnd) {
                yogaNode.setBorder(com.facebook.yoga.YogaEdge.END, floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_borderHorizontal) {
                yogaNode.setBorder(com.facebook.yoga.YogaEdge.HORIZONTAL, floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_borderVertical) {
                yogaNode.setBorder(com.facebook.yoga.YogaEdge.VERTICAL, floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_borderAll) {
                yogaNode.setBorder(com.facebook.yoga.YogaEdge.ALL, floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_direction) {
                yogaNode.setDirection(com.facebook.yoga.YogaDirection.fromInt(java.lang.Math.round(floatValue)));
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_display) {
                yogaNode.setDisplay(com.facebook.yoga.YogaDisplay.fromInt(java.lang.Math.round(floatValue)));
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_flex) {
                yogaNode.setFlex(floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_flexBasis) {
                yogaNode.setFlexBasis(floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_flexDirection) {
                yogaNode.setFlexDirection(com.facebook.yoga.YogaFlexDirection.fromInt(java.lang.Math.round(floatValue)));
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_flexGrow) {
                yogaNode.setFlexGrow(floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_flexShrink) {
                yogaNode.setFlexShrink(floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_height) {
                yogaNode.setHeight(floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_marginLeft) {
                yogaNode.setMargin(com.facebook.yoga.YogaEdge.LEFT, floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_justifyContent) {
                yogaNode.setJustifyContent(com.facebook.yoga.YogaJustify.fromInt(java.lang.Math.round(floatValue)));
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_marginTop) {
                yogaNode.setMargin(com.facebook.yoga.YogaEdge.TOP, floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_marginRight) {
                yogaNode.setMargin(com.facebook.yoga.YogaEdge.RIGHT, floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_marginBottom) {
                yogaNode.setMargin(com.facebook.yoga.YogaEdge.BOTTOM, floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_marginStart) {
                yogaNode.setMargin(com.facebook.yoga.YogaEdge.START, floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_marginEnd) {
                yogaNode.setMargin(com.facebook.yoga.YogaEdge.END, floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_marginHorizontal) {
                yogaNode.setMargin(com.facebook.yoga.YogaEdge.HORIZONTAL, floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_marginVertical) {
                yogaNode.setMargin(com.facebook.yoga.YogaEdge.VERTICAL, floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_marginAll) {
                yogaNode.setMargin(com.facebook.yoga.YogaEdge.ALL, floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_maxHeight) {
                yogaNode.setMaxHeight(floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_maxWidth) {
                yogaNode.setMaxWidth(floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_minHeight) {
                yogaNode.setMinHeight(floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_minWidth) {
                yogaNode.setMinWidth(floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_overflow) {
                yogaNode.setOverflow(com.facebook.yoga.YogaOverflow.fromInt(java.lang.Math.round(floatValue)));
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_paddingLeft) {
                yogaNode.setPadding(com.facebook.yoga.YogaEdge.LEFT, floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_paddingTop) {
                yogaNode.setPadding(com.facebook.yoga.YogaEdge.TOP, floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_paddingRight) {
                yogaNode.setPadding(com.facebook.yoga.YogaEdge.RIGHT, floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_paddingBottom) {
                yogaNode.setPadding(com.facebook.yoga.YogaEdge.BOTTOM, floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_paddingStart) {
                yogaNode.setPadding(com.facebook.yoga.YogaEdge.START, floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_paddingEnd) {
                yogaNode.setPadding(com.facebook.yoga.YogaEdge.END, floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_paddingHorizontal) {
                yogaNode.setPadding(com.facebook.yoga.YogaEdge.HORIZONTAL, floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_paddingVertical) {
                yogaNode.setPadding(com.facebook.yoga.YogaEdge.VERTICAL, floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_paddingAll) {
                yogaNode.setPadding(com.facebook.yoga.YogaEdge.ALL, floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_positionLeft) {
                yogaNode.setPosition(com.facebook.yoga.YogaEdge.LEFT, floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_positionTop) {
                yogaNode.setPosition(com.facebook.yoga.YogaEdge.TOP, floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_positionRight) {
                yogaNode.setPosition(com.facebook.yoga.YogaEdge.RIGHT, floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_positionBottom) {
                yogaNode.setPosition(com.facebook.yoga.YogaEdge.BOTTOM, floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_positionStart) {
                yogaNode.setPosition(com.facebook.yoga.YogaEdge.START, floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_positionEnd) {
                yogaNode.setPosition(com.facebook.yoga.YogaEdge.END, floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_positionHorizontal) {
                yogaNode.setPosition(com.facebook.yoga.YogaEdge.HORIZONTAL, floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_positionVertical) {
                yogaNode.setPosition(com.facebook.yoga.YogaEdge.VERTICAL, floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_positionAll) {
                yogaNode.setPosition(com.facebook.yoga.YogaEdge.ALL, floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_positionType) {
                yogaNode.setPositionType(com.facebook.yoga.YogaPositionType.fromInt(java.lang.Math.round(floatValue)));
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_width) {
                yogaNode.setWidth(floatValue);
            } else if (keyAt == com.tencent.kinda.R.styleable.yoga_yg_wrap) {
                yogaNode.setWrap(com.facebook.yoga.YogaWrap.fromInt(java.lang.Math.round(floatValue)));
            }
        }
        for (int i18 = 0; i18 < layoutParams.stringAttributes.size(); i18++) {
            int keyAt2 = layoutParams.stringAttributes.keyAt(i18);
            java.lang.String valueAt = layoutParams.stringAttributes.valueAt(i18);
            if (valueAt.equals("auto")) {
                if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_marginLeft) {
                    yogaNode.setMarginAuto(com.facebook.yoga.YogaEdge.LEFT);
                } else if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_marginTop) {
                    yogaNode.setMarginAuto(com.facebook.yoga.YogaEdge.TOP);
                } else if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_marginRight) {
                    yogaNode.setMarginAuto(com.facebook.yoga.YogaEdge.RIGHT);
                } else if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_marginBottom) {
                    yogaNode.setMarginAuto(com.facebook.yoga.YogaEdge.BOTTOM);
                } else if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_marginStart) {
                    yogaNode.setMarginAuto(com.facebook.yoga.YogaEdge.START);
                } else if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_marginEnd) {
                    yogaNode.setMarginAuto(com.facebook.yoga.YogaEdge.END);
                } else if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_marginHorizontal) {
                    yogaNode.setMarginAuto(com.facebook.yoga.YogaEdge.HORIZONTAL);
                } else if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_marginVertical) {
                    yogaNode.setMarginAuto(com.facebook.yoga.YogaEdge.VERTICAL);
                } else if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_marginAll) {
                    yogaNode.setMarginAuto(com.facebook.yoga.YogaEdge.ALL);
                }
            }
            if (valueAt.endsWith("%")) {
                float parseFloat = java.lang.Float.parseFloat(valueAt.substring(0, valueAt.length() - 1));
                if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_flexBasis) {
                    yogaNode.setFlexBasisPercent(parseFloat);
                } else if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_height) {
                    yogaNode.setHeightPercent(parseFloat);
                } else if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_marginLeft) {
                    yogaNode.setMarginPercent(com.facebook.yoga.YogaEdge.LEFT, parseFloat);
                } else if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_marginTop) {
                    yogaNode.setMarginPercent(com.facebook.yoga.YogaEdge.TOP, parseFloat);
                } else if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_marginRight) {
                    yogaNode.setMarginPercent(com.facebook.yoga.YogaEdge.RIGHT, parseFloat);
                } else if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_marginBottom) {
                    yogaNode.setMarginPercent(com.facebook.yoga.YogaEdge.BOTTOM, parseFloat);
                } else if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_marginStart) {
                    yogaNode.setMarginPercent(com.facebook.yoga.YogaEdge.START, parseFloat);
                } else if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_marginEnd) {
                    yogaNode.setMarginPercent(com.facebook.yoga.YogaEdge.END, parseFloat);
                } else if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_marginHorizontal) {
                    yogaNode.setMarginPercent(com.facebook.yoga.YogaEdge.HORIZONTAL, parseFloat);
                } else if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_marginVertical) {
                    yogaNode.setMarginPercent(com.facebook.yoga.YogaEdge.VERTICAL, parseFloat);
                } else if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_marginAll) {
                    yogaNode.setMarginPercent(com.facebook.yoga.YogaEdge.ALL, parseFloat);
                } else if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_maxHeight) {
                    yogaNode.setMaxHeightPercent(parseFloat);
                } else if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_maxWidth) {
                    yogaNode.setMaxWidthPercent(parseFloat);
                } else if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_minHeight) {
                    yogaNode.setMinHeightPercent(parseFloat);
                } else if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_minWidth) {
                    yogaNode.setMinWidthPercent(parseFloat);
                } else if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_paddingLeft) {
                    yogaNode.setPaddingPercent(com.facebook.yoga.YogaEdge.LEFT, parseFloat);
                } else if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_paddingTop) {
                    yogaNode.setPaddingPercent(com.facebook.yoga.YogaEdge.TOP, parseFloat);
                } else if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_paddingRight) {
                    yogaNode.setPaddingPercent(com.facebook.yoga.YogaEdge.RIGHT, parseFloat);
                } else if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_paddingBottom) {
                    yogaNode.setPaddingPercent(com.facebook.yoga.YogaEdge.BOTTOM, parseFloat);
                } else if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_paddingStart) {
                    yogaNode.setPaddingPercent(com.facebook.yoga.YogaEdge.START, parseFloat);
                } else if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_paddingEnd) {
                    yogaNode.setPaddingPercent(com.facebook.yoga.YogaEdge.END, parseFloat);
                } else if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_paddingHorizontal) {
                    yogaNode.setPaddingPercent(com.facebook.yoga.YogaEdge.HORIZONTAL, parseFloat);
                } else if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_paddingVertical) {
                    yogaNode.setPaddingPercent(com.facebook.yoga.YogaEdge.VERTICAL, parseFloat);
                } else if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_paddingAll) {
                    yogaNode.setPaddingPercent(com.facebook.yoga.YogaEdge.ALL, parseFloat);
                } else if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_positionLeft) {
                    yogaNode.setPositionPercent(com.facebook.yoga.YogaEdge.LEFT, parseFloat);
                } else if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_positionTop) {
                    yogaNode.setPositionPercent(com.facebook.yoga.YogaEdge.TOP, parseFloat);
                } else if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_positionRight) {
                    yogaNode.setPositionPercent(com.facebook.yoga.YogaEdge.RIGHT, parseFloat);
                } else if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_positionBottom) {
                    yogaNode.setPositionPercent(com.facebook.yoga.YogaEdge.BOTTOM, parseFloat);
                } else if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_positionStart) {
                    yogaNode.setPositionPercent(com.facebook.yoga.YogaEdge.START, parseFloat);
                } else if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_positionEnd) {
                    yogaNode.setPositionPercent(com.facebook.yoga.YogaEdge.END, parseFloat);
                } else if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_positionHorizontal) {
                    yogaNode.setPositionPercent(com.facebook.yoga.YogaEdge.HORIZONTAL, parseFloat);
                } else if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_positionVertical) {
                    yogaNode.setPositionPercent(com.facebook.yoga.YogaEdge.VERTICAL, parseFloat);
                } else if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_positionAll) {
                    yogaNode.setPositionPercent(com.facebook.yoga.YogaEdge.ALL, parseFloat);
                } else if (keyAt2 == com.tencent.kinda.R.styleable.yoga_yg_width) {
                    yogaNode.setWidthPercent(parseFloat);
                }
            }
        }
    }

    private void applyLayoutRecursive(com.facebook.yoga.YogaNode yogaNode, float f17, float f18) {
        android.view.View view = (android.view.View) yogaNode.getData();
        if (view != null && view != this) {
            if (view.getVisibility() == 8) {
                return;
            }
            int round = java.lang.Math.round(yogaNode.getLayoutX() + f17);
            int round2 = java.lang.Math.round(yogaNode.getLayoutY() + f18);
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.round(yogaNode.getLayoutWidth()), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.round(yogaNode.getLayoutHeight()), 1073741824));
            view.layout(round, round2, view.getMeasuredWidth() + round, view.getMeasuredHeight() + round2);
        }
        int childCount = yogaNode.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            if (equals(view)) {
                applyLayoutRecursive(yogaNode.getChildAt(i17), f17, f18);
            } else if (!(view instanceof com.facebook.yoga.android.YogaLayout)) {
                applyLayoutRecursive(yogaNode.getChildAt(i17), yogaNode.getLayoutX() + f17, yogaNode.getLayoutY() + f18);
            }
        }
    }

    private void createLayout(int i17, int i18) {
        int size = android.view.View.MeasureSpec.getSize(i17);
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int mode2 = android.view.View.MeasureSpec.getMode(i18);
        if (mode2 == 1073741824) {
            this.mYogaNode.setHeight(size2);
        }
        if (mode == 1073741824) {
            this.mYogaNode.setWidth(size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            this.mYogaNode.setMaxHeight(size2);
        }
        if (mode == Integer.MIN_VALUE) {
            this.mYogaNode.setMaxWidth(size);
        }
        if (mode2 == 0) {
            this.mYogaNode.setHeightAuto();
        }
        this.mYogaNode.calculateLayout(Float.NaN, Float.NaN);
    }

    private void removeViewFromYogaTree(android.view.View view, boolean z17) {
        com.facebook.yoga.YogaNode yogaNode = this.mYogaNodes.get(view);
        if (yogaNode == null) {
            return;
        }
        com.facebook.yoga.YogaNode owner = yogaNode.getOwner();
        int i17 = 0;
        while (true) {
            if (i17 >= owner.getChildCount()) {
                break;
            }
            if (owner.getChildAt(i17).equals(yogaNode)) {
                owner.removeChildAt(i17);
                break;
            }
            i17++;
        }
        yogaNode.setData(null);
        this.mYogaNodes.remove(view);
        if (z17) {
            this.mYogaNode.calculateLayout(Float.NaN, Float.NaN);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        com.facebook.yoga.YogaNode create;
        this.mYogaNode.setMeasureFunction(null);
        if (view instanceof com.facebook.yoga.android.VirtualYogaLayout) {
            com.facebook.yoga.android.VirtualYogaLayout virtualYogaLayout = (com.facebook.yoga.android.VirtualYogaLayout) view;
            virtualYogaLayout.transferChildren(this);
            com.facebook.yoga.YogaNode yogaNode = virtualYogaLayout.getYogaNode();
            com.facebook.yoga.YogaNode yogaNode2 = this.mYogaNode;
            yogaNode2.addChildAt(yogaNode, yogaNode2.getChildCount());
            return;
        }
        super.addView(view, i17, layoutParams);
        if (this.mYogaNodes.containsKey(view)) {
            return;
        }
        if (view instanceof com.facebook.yoga.android.YogaLayout) {
            create = ((com.facebook.yoga.android.YogaLayout) view).getYogaNode();
        } else {
            if (this.mYogaNodes.containsKey(view)) {
                create = this.mYogaNodes.get(view);
            } else {
                create = com.facebook.yoga.YogaNodeFactory.create();
            }
            create.setData(view);
            create.setMeasureFunction(new com.facebook.yoga.android.YogaLayout.ViewMeasureFunction());
        }
        applyLayoutParams((com.facebook.yoga.android.YogaLayout.LayoutParams) view.getLayoutParams(), create, view);
        this.mYogaNodes.put(view, create);
        com.facebook.yoga.YogaNode yogaNode3 = this.mYogaNode;
        yogaNode3.addChildAt(create, yogaNode3.getChildCount());
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof com.facebook.yoga.android.YogaLayout.LayoutParams;
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new com.facebook.yoga.android.YogaLayout.LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new com.facebook.yoga.android.YogaLayout.LayoutParams(getContext(), attributeSet);
    }

    public com.facebook.yoga.YogaNode getYogaNode() {
        return this.mYogaNode;
    }

    public com.facebook.yoga.YogaNode getYogaNodeForView(android.view.View view) {
        return this.mYogaNodes.get(view);
    }

    public void invalidate(android.view.View view) {
        if (this.mYogaNodes.containsKey(view)) {
            this.mYogaNodes.get(view).dirty();
            return;
        }
        int childCount = this.mYogaNode.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            com.facebook.yoga.YogaNode childAt = this.mYogaNode.getChildAt(i17);
            if (childAt.getData() instanceof com.facebook.yoga.android.YogaLayout) {
                ((com.facebook.yoga.android.YogaLayout) childAt.getData()).invalidate(view);
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        if (!(getParent() instanceof com.facebook.yoga.android.YogaLayout)) {
            createLayout(android.view.View.MeasureSpec.makeMeasureSpec(i19 - i17, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(i27 - i18, 1073741824));
        }
        applyLayoutRecursive(this.mYogaNode, 0.0f, 0.0f);
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        if (!(getParent() instanceof com.facebook.yoga.android.YogaLayout)) {
            createLayout(i17, i18);
        }
        setMeasuredDimension(java.lang.Math.round(this.mYogaNode.getLayoutWidth()), java.lang.Math.round(this.mYogaNode.getLayoutHeight()));
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            removeViewFromYogaTree(getChildAt(i17), false);
        }
        super.removeAllViews();
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            removeViewFromYogaTree(getChildAt(i17), true);
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View view) {
        removeViewFromYogaTree(view, false);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i17) {
        removeViewFromYogaTree(getChildAt(i17), false);
        super.removeViewAt(i17);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(android.view.View view) {
        removeViewFromYogaTree(view, true);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i17, int i18) {
        for (int i19 = i17; i19 < i17 + i18; i19++) {
            removeViewFromYogaTree(getChildAt(i19), false);
        }
        super.removeViews(i17, i18);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i17, int i18) {
        for (int i19 = i17; i19 < i17 + i18; i19++) {
            removeViewFromYogaTree(getChildAt(i19), true);
        }
        super.removeViewsInLayout(i17, i18);
    }

    public YogaLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new com.facebook.yoga.android.YogaLayout.LayoutParams(layoutParams);
    }

    public YogaLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        com.facebook.yoga.android.YogaLayout.LayoutParams layoutParams;
        com.facebook.yoga.YogaNode create = com.facebook.yoga.YogaNodeFactory.create();
        this.mYogaNode = create;
        this.mYogaNodes = new java.util.HashMap();
        create.setData(this);
        create.setMeasureFunction(new com.facebook.yoga.android.YogaLayout.ViewMeasureFunction());
        if (attributeSet != null) {
            layoutParams = new com.facebook.yoga.android.YogaLayout.LayoutParams(context, attributeSet);
        } else {
            layoutParams = (com.facebook.yoga.android.YogaLayout.LayoutParams) generateDefaultLayoutParams();
        }
        applyLayoutParams(layoutParams, create, this);
    }

    /* loaded from: classes15.dex */
    public static class LayoutParams extends android.view.ViewGroup.LayoutParams {
        android.util.SparseArray<java.lang.Float> numericAttributes;
        android.util.SparseArray<java.lang.String> stringAttributes;

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            if (layoutParams instanceof com.facebook.yoga.android.YogaLayout.LayoutParams) {
                com.facebook.yoga.android.YogaLayout.LayoutParams layoutParams2 = (com.facebook.yoga.android.YogaLayout.LayoutParams) layoutParams;
                this.numericAttributes = layoutParams2.numericAttributes.clone();
                this.stringAttributes = layoutParams2.stringAttributes.clone();
                return;
            }
            this.numericAttributes = new android.util.SparseArray<>();
            this.stringAttributes = new android.util.SparseArray<>();
            if (layoutParams.width >= 0) {
                this.numericAttributes.put(com.tencent.kinda.R.styleable.yoga_yg_width, java.lang.Float.valueOf(((android.view.ViewGroup.LayoutParams) this).width));
            }
            if (layoutParams.height >= 0) {
                this.numericAttributes.put(com.tencent.kinda.R.styleable.yoga_yg_height, java.lang.Float.valueOf(((android.view.ViewGroup.LayoutParams) this).height));
            }
        }

        public LayoutParams(int i17, int i18) {
            super(i17, i18);
            this.numericAttributes = new android.util.SparseArray<>();
            this.stringAttributes = new android.util.SparseArray<>();
            if (i17 >= 0) {
                this.numericAttributes.put(com.tencent.kinda.R.styleable.yoga_yg_width, java.lang.Float.valueOf(i17));
            }
            if (i18 >= 0) {
                this.numericAttributes.put(com.tencent.kinda.R.styleable.yoga_yg_height, java.lang.Float.valueOf(i18));
            }
        }

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.numericAttributes = new android.util.SparseArray<>();
            this.stringAttributes = new android.util.SparseArray<>();
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.tencent.kinda.R.styleable.yoga);
            int i17 = ((android.view.ViewGroup.LayoutParams) this).width;
            if (i17 >= 0) {
                this.numericAttributes.put(com.tencent.kinda.R.styleable.yoga_yg_width, java.lang.Float.valueOf(i17));
            }
            int i18 = ((android.view.ViewGroup.LayoutParams) this).height;
            if (i18 >= 0) {
                this.numericAttributes.put(com.tencent.kinda.R.styleable.yoga_yg_height, java.lang.Float.valueOf(i18));
            }
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i19 = 0; i19 < indexCount; i19++) {
                int index = obtainStyledAttributes.getIndex(i19);
                android.util.TypedValue typedValue = new android.util.TypedValue();
                obtainStyledAttributes.getValue(index, typedValue);
                int i27 = typedValue.type;
                if (i27 == 5) {
                    this.numericAttributes.put(index, java.lang.Float.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, 0)));
                } else if (i27 == 3) {
                    this.stringAttributes.put(index, obtainStyledAttributes.getString(index));
                } else {
                    this.numericAttributes.put(index, java.lang.Float.valueOf(obtainStyledAttributes.getFloat(index, 0.0f)));
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void addView(android.view.View view, com.facebook.yoga.YogaNode yogaNode) {
        this.mYogaNode.setMeasureFunction(null);
        if (!(view instanceof com.facebook.yoga.android.YogaLayout)) {
            yogaNode.setData(view);
            yogaNode.setMeasureFunction(new com.facebook.yoga.android.YogaLayout.ViewMeasureFunction());
        }
        this.mYogaNodes.put(view, yogaNode);
        com.facebook.yoga.YogaNode yogaNode2 = this.mYogaNode;
        yogaNode2.addChildAt(yogaNode, yogaNode2.getChildCount());
        super.addView(view, getChildCount(), new com.facebook.yoga.android.YogaLayout.LayoutParams(-1, -1));
    }
}
