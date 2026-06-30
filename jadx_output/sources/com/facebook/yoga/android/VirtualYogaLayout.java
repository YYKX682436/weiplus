package com.facebook.yoga.android;

/* loaded from: classes15.dex */
public class VirtualYogaLayout extends android.view.ViewGroup {
    private final java.util.List<android.view.View> mChildren;
    private final com.facebook.yoga.YogaNode mYogaNode;
    private final java.util.Map<android.view.View, com.facebook.yoga.YogaNode> mYogaNodes;

    public VirtualYogaLayout(android.content.Context context) {
        super(context);
        this.mChildren = new java.util.LinkedList();
        this.mYogaNodes = new java.util.HashMap();
        this.mYogaNode = com.facebook.yoga.YogaNodeFactory.create();
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        if (view instanceof com.facebook.yoga.android.VirtualYogaLayout) {
            com.facebook.yoga.android.VirtualYogaLayout virtualYogaLayout = (com.facebook.yoga.android.VirtualYogaLayout) view;
            virtualYogaLayout.transferChildren(this);
            com.facebook.yoga.YogaNode yogaNode = virtualYogaLayout.getYogaNode();
            com.facebook.yoga.YogaNode yogaNode2 = this.mYogaNode;
            yogaNode2.addChildAt(yogaNode, yogaNode2.getChildCount());
            return;
        }
        com.facebook.yoga.YogaNode create = com.facebook.yoga.YogaNodeFactory.create();
        com.facebook.yoga.android.YogaLayout.applyLayoutParams(new com.facebook.yoga.android.YogaLayout.LayoutParams(layoutParams), create, view);
        create.setData(view);
        create.setMeasureFunction(new com.facebook.yoga.android.YogaLayout.ViewMeasureFunction());
        com.facebook.yoga.YogaNode yogaNode3 = this.mYogaNode;
        yogaNode3.addChildAt(create, yogaNode3.getChildCount());
        addView(view, create);
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

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        throw new java.lang.RuntimeException("Attempting to layout a VirtualYogaLayout");
    }

    public void transferChildren(android.view.ViewGroup viewGroup) {
        if (viewGroup instanceof com.facebook.yoga.android.VirtualYogaLayout) {
            for (android.view.View view : this.mChildren) {
                ((com.facebook.yoga.android.VirtualYogaLayout) viewGroup).addView(view, this.mYogaNodes.get(view));
            }
        } else {
            if (!(viewGroup instanceof com.facebook.yoga.android.YogaLayout)) {
                throw new java.lang.RuntimeException("VirtualYogaLayout cannot transfer children to ViewGroup of type " + viewGroup.getClass().getCanonicalName() + ".  Must either be a VirtualYogaLayout or a YogaLayout.");
            }
            for (android.view.View view2 : this.mChildren) {
                ((com.facebook.yoga.android.YogaLayout) viewGroup).addView(view2, this.mYogaNodes.get(view2));
            }
        }
        this.mChildren.clear();
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new com.facebook.yoga.android.YogaLayout.LayoutParams(layoutParams);
    }

    public VirtualYogaLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VirtualYogaLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.mChildren = new java.util.LinkedList();
        this.mYogaNodes = new java.util.HashMap();
        com.facebook.yoga.YogaNode create = com.facebook.yoga.YogaNodeFactory.create();
        this.mYogaNode = create;
        com.facebook.yoga.android.YogaLayout.applyLayoutParams(new com.facebook.yoga.android.YogaLayout.LayoutParams(context, attributeSet), create, this);
    }

    public void addView(android.view.View view, com.facebook.yoga.YogaNode yogaNode) {
        this.mChildren.add(view);
        this.mYogaNodes.put(view, yogaNode);
    }
}
