package com.tencent.kinda.framework.widget.tools;

/* loaded from: classes15.dex */
public class FlexBoxAttr {
    public static final java.lang.String TAG = "MicroMsg.FlexBoxAttr";
    public static final float UNDEFINED = 1.0E21f;
    protected com.tencent.kinda.gen.Align alignContent;
    protected com.tencent.kinda.gen.Align alignItems;
    protected com.tencent.kinda.gen.Align alignSelf;
    protected float aspectRatio;
    protected float bottom;
    protected float bottomPercent;
    protected float flexBasis;
    protected com.tencent.kinda.gen.FlexDirection flexDirection;
    protected float flexGrow;
    protected float flexShrink;
    protected com.tencent.kinda.gen.Wrap flexWrap;
    protected float heightPercent;
    private com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange;
    protected com.tencent.kinda.gen.Justify justifyContent;
    protected float left;
    protected float leftPercent;
    protected float marginBottom;
    protected float marginBottomPercent;
    protected float marginLeft;
    protected float marginLeftPercent;
    protected float marginRight;
    protected float marginRightPercent;
    protected float marginTop;
    protected float marginTopPercent;
    protected float maxHeight;
    protected float maxWidth;
    protected float minHeight;
    protected float minWidth;
    protected float paddingBottom;
    protected float paddingBottomPercent;
    protected float paddingLeft;
    protected float paddingLeftPercent;
    protected float paddingRight;
    protected float paddingRightPercent;
    protected float paddingTop;
    protected float paddingTopPercent;
    protected com.tencent.kinda.gen.PositionType positionType;
    protected float right;
    protected float rightPercent;
    protected java.lang.String testId;
    protected float top;
    protected float topPercent;
    protected int visibility;
    protected float widthPercent;
    com.facebook.yoga.YogaNode yogaNode = com.facebook.yoga.YogaNodeFactory.create();
    protected float width = 1.0E21f;
    protected float height = 1.0E21f;

    /* loaded from: classes15.dex */
    public interface IFlexBoxChange {
        void onChange();
    }

    public FlexBoxAttr() {
        applyNodeDefaultParam();
    }

    private void applyNodeDefaultParam() {
        com.facebook.yoga.YogaNode create = com.facebook.yoga.YogaNodeFactory.create();
        this.yogaNode = create;
        create.reset();
    }

    public static boolean isUndefined(float f17) {
        return java.lang.Float.compare(f17, 1.0E9f) >= 0 || java.lang.Float.compare(f17, -1.0E9f) <= 0;
    }

    public void autoHeight() {
        node().setHeightAuto();
        com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.onChange();
        }
    }

    public void autoWidth() {
        node().setWidthAuto();
        com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.onChange();
        }
    }

    public com.tencent.kinda.gen.Align getAlignContent() {
        return this.alignContent;
    }

    public com.tencent.kinda.gen.Align getAlignItems() {
        return this.alignItems;
    }

    public com.tencent.kinda.gen.Align getAlignSelf() {
        return this.alignSelf;
    }

    public float getAspectRatio() {
        return this.aspectRatio;
    }

    public float getBottom() {
        return this.bottom;
    }

    public float getBottomPercent() {
        return this.bottomPercent;
    }

    public float getFlexBasis() {
        return this.flexBasis;
    }

    public com.tencent.kinda.gen.FlexDirection getFlexDirection() {
        return this.flexDirection;
    }

    public float getFlexGrow() {
        return this.flexGrow;
    }

    public float getFlexShrink() {
        return this.flexShrink;
    }

    public com.tencent.kinda.gen.Wrap getFlexWrap() {
        return this.flexWrap;
    }

    public float getHeight() {
        return isUndefined(this.height) ? com.tencent.kinda.framework.widget.tools.MMKViewUtil.pxToDp(com.tencent.kinda.framework.widget.tools.KindaContext.get(), this.yogaNode.getLayoutHeight()) : this.height;
    }

    public float getHeightPercent() {
        return this.heightPercent;
    }

    public com.tencent.kinda.gen.Justify getJustifyContent() {
        return this.justifyContent;
    }

    public float getLeft() {
        return this.left;
    }

    public float getLeftPercent() {
        return this.leftPercent;
    }

    public float getMarginBottom() {
        return this.marginBottom;
    }

    public float getMarginBottomPercent() {
        return this.marginBottomPercent;
    }

    public float getMarginLeft() {
        return this.marginLeft;
    }

    public float getMarginLeftPercent() {
        return this.marginLeftPercent;
    }

    public float getMarginRight() {
        return this.marginRight;
    }

    public float getMarginRightPercent() {
        return this.marginRightPercent;
    }

    public float getMarginTop() {
        return this.marginTop;
    }

    public float getMarginTopPercent() {
        return this.marginTopPercent;
    }

    public float getMaxHeight() {
        return this.maxHeight;
    }

    public float getMaxWidth() {
        return this.maxWidth;
    }

    public float getMinHeight() {
        return this.minHeight;
    }

    public float getMinWidth() {
        return this.minWidth;
    }

    public float getPaddingBottom() {
        return this.paddingBottom;
    }

    public float getPaddingBottomPercent() {
        return this.paddingBottomPercent;
    }

    public float getPaddingLeft() {
        return this.paddingLeft;
    }

    public float getPaddingLeftPercent() {
        return this.paddingLeftPercent;
    }

    public float getPaddingRight() {
        return this.paddingRight;
    }

    public float getPaddingRightPercent() {
        return this.paddingRightPercent;
    }

    public float getPaddingTop() {
        return this.paddingTop;
    }

    public float getPaddingTopPercent() {
        return this.paddingTopPercent;
    }

    public com.tencent.kinda.gen.PositionType getPositionType() {
        return this.positionType;
    }

    public float getRight() {
        return this.right;
    }

    public float getRightPercent() {
        return this.rightPercent;
    }

    public java.lang.String getTestId() {
        return this.testId;
    }

    public float getTop() {
        return this.top;
    }

    public float getTopPercent() {
        return this.topPercent;
    }

    public int getVisibility() {
        return this.visibility;
    }

    public float getWidth() {
        return isUndefined(this.width) ? com.tencent.kinda.framework.widget.tools.MMKViewUtil.pxToDp(com.tencent.kinda.framework.widget.tools.KindaContext.get(), this.yogaNode.getLayoutWidth()) : this.width;
    }

    public float getWidthPercent() {
        return this.widthPercent;
    }

    public com.facebook.yoga.YogaNode node() {
        return this.yogaNode;
    }

    public void setAlignContent(com.tencent.kinda.gen.Align align) {
        this.alignContent = align;
        node().setAlignContent(com.tencent.kinda.framework.widget.base.ViewStyleMapper.mapYGAlign(align));
        com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.onChange();
        }
    }

    public void setAlignItems(com.tencent.kinda.gen.Align align) {
        this.alignItems = align;
        node().setAlignItems(com.tencent.kinda.framework.widget.base.ViewStyleMapper.mapYGAlign(align));
        com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.onChange();
        }
    }

    public void setAlignSelf(com.tencent.kinda.gen.Align align) {
        this.alignSelf = align;
        node().setAlignSelf(com.tencent.kinda.framework.widget.base.ViewStyleMapper.mapYGAlign(align));
        com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.onChange();
        }
    }

    public void setAspectRatio(float f17) {
        this.aspectRatio = f17;
        if (f17 > 0.0f) {
            node().setAspectRatio(this.aspectRatio);
            com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
            if (iFlexBoxChange != null) {
                iFlexBoxChange.onChange();
            }
        }
    }

    public void setBottom(float f17) {
        this.bottom = f17;
        node().setPosition(com.facebook.yoga.YogaEdge.BOTTOM, com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(com.tencent.kinda.framework.widget.tools.KindaContext.get(), f17));
        com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.onChange();
        }
    }

    public void setBottomPercent(float f17) {
        this.bottomPercent = f17;
        node().setPositionPercent(com.facebook.yoga.YogaEdge.BOTTOM, f17);
        com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.onChange();
        }
    }

    public void setFlexBasis(float f17) {
        this.flexBasis = f17;
        if (f17 > 0.0f) {
            node().setWidth(com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(com.tencent.kinda.framework.widget.tools.KindaContext.get(), f17));
            com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
            if (iFlexBoxChange != null) {
                iFlexBoxChange.onChange();
            }
        }
    }

    public void setFlexDirection(com.tencent.kinda.gen.FlexDirection flexDirection) {
        this.flexDirection = flexDirection;
        node().setFlexDirection(com.tencent.kinda.framework.widget.base.ViewStyleMapper.mapFlexDirection(flexDirection));
        com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.onChange();
        }
    }

    public void setFlexGrow(float f17) {
        this.flexGrow = f17;
        if (f17 >= 0.0f) {
            node().setFlexGrow(this.flexGrow);
            com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
            if (iFlexBoxChange != null) {
                iFlexBoxChange.onChange();
            }
        }
    }

    public void setFlexShrink(float f17) {
        this.flexShrink = f17;
        if (f17 >= 0.0f) {
            node().setFlexShrink(this.flexShrink);
            com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
            if (iFlexBoxChange != null) {
                iFlexBoxChange.onChange();
            }
        }
    }

    public void setFlexWrap(com.tencent.kinda.gen.Wrap wrap) {
        this.flexWrap = wrap;
        node().setWrap(com.tencent.kinda.framework.widget.base.ViewStyleMapper.mapYGWrap(wrap));
        com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.onChange();
        }
    }

    public void setHeight(float f17) {
        this.height = f17;
        if (f17 > 0.0f) {
            node().setHeight(com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(com.tencent.kinda.framework.widget.tools.KindaContext.get(), f17));
            com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
            if (iFlexBoxChange != null) {
                iFlexBoxChange.onChange();
            }
        }
    }

    public void setHeightPercent(float f17) {
        this.heightPercent = f17;
        if (f17 > 0.0f) {
            node().setHeightPercent(f17);
            com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
            if (iFlexBoxChange != null) {
                iFlexBoxChange.onChange();
            }
        }
    }

    public void setJustifyContent(com.tencent.kinda.gen.Justify justify) {
        this.justifyContent = justify;
        node().setJustifyContent(com.tencent.kinda.framework.widget.base.ViewStyleMapper.mapJustifyContent(justify));
        com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.onChange();
        }
    }

    public void setLeft(float f17) {
        this.left = f17;
        node().setPosition(com.facebook.yoga.YogaEdge.LEFT, com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(com.tencent.kinda.framework.widget.tools.KindaContext.get(), f17));
        com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.onChange();
        }
    }

    public void setLeftPercent(float f17) {
        this.leftPercent = f17;
        node().setPositionPercent(com.facebook.yoga.YogaEdge.LEFT, f17);
        com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.onChange();
        }
    }

    public void setMarginBottom(float f17) {
        this.marginBottom = f17;
        node().setMargin(com.facebook.yoga.YogaEdge.BOTTOM, com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(com.tencent.kinda.framework.widget.tools.KindaContext.get(), f17));
        com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.onChange();
        }
    }

    public void setMarginBottomPercent(float f17) {
        this.marginBottomPercent = f17;
        node().setMarginPercent(com.facebook.yoga.YogaEdge.BOTTOM, f17);
        com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.onChange();
        }
    }

    public void setMarginLeft(float f17) {
        this.marginLeft = f17;
        node().setMargin(com.facebook.yoga.YogaEdge.LEFT, com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(com.tencent.kinda.framework.widget.tools.KindaContext.get(), f17));
        com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.onChange();
        }
    }

    public void setMarginLeftPercent(float f17) {
        this.marginLeftPercent = f17;
        node().setMarginPercent(com.facebook.yoga.YogaEdge.LEFT, f17);
        com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.onChange();
        }
    }

    public void setMarginRight(float f17) {
        this.marginRight = f17;
        node().setMargin(com.facebook.yoga.YogaEdge.RIGHT, com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(com.tencent.kinda.framework.widget.tools.KindaContext.get(), f17));
        com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.onChange();
        }
    }

    public void setMarginRightPercent(float f17) {
        this.marginRightPercent = f17;
        node().setMarginPercent(com.facebook.yoga.YogaEdge.RIGHT, f17);
        com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.onChange();
        }
    }

    public void setMarginTop(float f17) {
        this.marginTop = f17;
        node().setMargin(com.facebook.yoga.YogaEdge.TOP, com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(com.tencent.kinda.framework.widget.tools.KindaContext.get(), f17));
        com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.onChange();
        }
    }

    public void setMarginTopPercent(float f17) {
        this.marginTopPercent = f17;
        node().setMarginPercent(com.facebook.yoga.YogaEdge.TOP, f17);
        com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.onChange();
        }
    }

    public void setMaxHeight(float f17) {
        this.maxHeight = f17;
        if (f17 > 0.0f) {
            node().setMaxHeight(com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(com.tencent.kinda.framework.widget.tools.KindaContext.get(), f17));
            com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
            if (iFlexBoxChange != null) {
                iFlexBoxChange.onChange();
            }
        }
    }

    public void setMaxWidth(float f17) {
        this.maxWidth = f17;
        if (f17 > 0.0f) {
            node().setMaxWidth(com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(com.tencent.kinda.framework.widget.tools.KindaContext.get(), f17));
            com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
            if (iFlexBoxChange != null) {
                iFlexBoxChange.onChange();
            }
        }
    }

    public void setMinHeight(float f17) {
        this.minHeight = f17;
        if (f17 > 0.0f) {
            node().setMinHeight(com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(com.tencent.kinda.framework.widget.tools.KindaContext.get(), f17));
            com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
            if (iFlexBoxChange != null) {
                iFlexBoxChange.onChange();
            }
        }
    }

    public void setMinWidth(float f17) {
        this.minWidth = f17;
        if (f17 > 0.0f) {
            node().setMinWidth(com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(com.tencent.kinda.framework.widget.tools.KindaContext.get(), f17));
            com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
            if (iFlexBoxChange != null) {
                iFlexBoxChange.onChange();
            }
        }
    }

    public void setPaddingBottom(float f17) {
        this.paddingBottom = f17;
        if (f17 >= 0.0f) {
            node().setPadding(com.facebook.yoga.YogaEdge.BOTTOM, com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(com.tencent.kinda.framework.widget.tools.KindaContext.get(), f17));
            com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
            if (iFlexBoxChange != null) {
                iFlexBoxChange.onChange();
            }
        }
    }

    public void setPaddingBottomPercent(float f17) {
        this.paddingBottomPercent = f17;
        if (this.paddingBottom > 0.0f) {
            node().setPadding(com.facebook.yoga.YogaEdge.BOTTOM, f17);
            com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
            if (iFlexBoxChange != null) {
                iFlexBoxChange.onChange();
            }
        }
    }

    public void setPaddingLeft(float f17) {
        this.paddingLeft = f17;
        if (f17 >= 0.0f) {
            node().setPadding(com.facebook.yoga.YogaEdge.LEFT, com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(com.tencent.kinda.framework.widget.tools.KindaContext.get(), f17));
            com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
            if (iFlexBoxChange != null) {
                iFlexBoxChange.onChange();
            }
        }
    }

    public void setPaddingLeftPercent(float f17) {
        this.paddingLeftPercent = f17;
        if (this.paddingLeft > 0.0f) {
            node().setPaddingPercent(com.facebook.yoga.YogaEdge.LEFT, f17);
            com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
            if (iFlexBoxChange != null) {
                iFlexBoxChange.onChange();
            }
        }
    }

    public void setPaddingRight(float f17) {
        this.paddingRight = f17;
        if (f17 >= 0.0f) {
            node().setPadding(com.facebook.yoga.YogaEdge.RIGHT, com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(com.tencent.kinda.framework.widget.tools.KindaContext.get(), f17));
            com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
            if (iFlexBoxChange != null) {
                iFlexBoxChange.onChange();
            }
        }
    }

    public void setPaddingRightPercent(float f17) {
        this.paddingRightPercent = f17;
        if (this.paddingRight > 0.0f) {
            node().setPadding(com.facebook.yoga.YogaEdge.RIGHT, f17);
            com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
            if (iFlexBoxChange != null) {
                iFlexBoxChange.onChange();
            }
        }
    }

    public void setPaddingTop(float f17) {
        this.paddingTop = f17;
        if (f17 >= 0.0f) {
            node().setPadding(com.facebook.yoga.YogaEdge.TOP, com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(com.tencent.kinda.framework.widget.tools.KindaContext.get(), f17));
            com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
            if (iFlexBoxChange != null) {
                iFlexBoxChange.onChange();
            }
        }
    }

    public void setPaddingTopPercent(float f17) {
        this.paddingTopPercent = f17;
        if (this.paddingTop > 0.0f) {
            node().setPaddingPercent(com.facebook.yoga.YogaEdge.TOP, f17);
            com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
            if (iFlexBoxChange != null) {
                iFlexBoxChange.onChange();
            }
        }
    }

    public void setPositionType(com.tencent.kinda.gen.PositionType positionType) {
        this.positionType = positionType;
        node().setPositionType(com.tencent.kinda.framework.widget.base.ViewStyleMapper.mapPositionType(positionType));
        com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.onChange();
        }
    }

    public void setRight(float f17) {
        this.right = f17;
        node().setPosition(com.facebook.yoga.YogaEdge.RIGHT, com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(com.tencent.kinda.framework.widget.tools.KindaContext.get(), f17));
        com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.onChange();
        }
    }

    public void setRightPercent(float f17) {
        this.rightPercent = f17;
        node().setPositionPercent(com.facebook.yoga.YogaEdge.RIGHT, f17);
        com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.onChange();
        }
    }

    public void setTestId(java.lang.String str) {
        this.testId = str;
    }

    public void setTop(float f17) {
        this.top = f17;
        node().setPosition(com.facebook.yoga.YogaEdge.TOP, com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(com.tencent.kinda.framework.widget.tools.KindaContext.get(), f17));
        com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.onChange();
        }
    }

    public void setTopPercent(float f17) {
        this.topPercent = f17;
        node().setPositionPercent(com.facebook.yoga.YogaEdge.TOP, f17);
        com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
        if (iFlexBoxChange != null) {
            iFlexBoxChange.onChange();
        }
    }

    public void setVisibility(int i17) {
        this.visibility = i17;
    }

    public void setWidth(float f17) {
        this.width = f17;
        if (f17 > 0.0f) {
            node().setWidth(com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(com.tencent.kinda.framework.widget.tools.KindaContext.get(), f17));
            com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
            if (iFlexBoxChange != null) {
                iFlexBoxChange.onChange();
            }
        }
    }

    public void setWidthPercent(float f17) {
        this.widthPercent = f17;
        if (f17 > 0.0f) {
            node().setWidthPercent(f17);
            com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange = this.iFlexBoxChange;
            if (iFlexBoxChange != null) {
                iFlexBoxChange.onChange();
            }
        }
    }

    public void setYogaNode(com.facebook.yoga.YogaNode yogaNode) {
        this.yogaNode = yogaNode;
    }

    public FlexBoxAttr(com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange iFlexBoxChange) {
        this.iFlexBoxChange = iFlexBoxChange;
        applyNodeDefaultParam();
    }
}
