package com.tencent.kinda.framework.widget.base;

/* loaded from: classes15.dex */
public class ViewBase {
    protected com.tencent.kinda.framework.widget.tools.FlexBoxAttr flexAttr = new com.tencent.kinda.framework.widget.tools.FlexBoxAttr(new com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange() { // from class: com.tencent.kinda.framework.widget.base.ViewBase.1
        @Override // com.tencent.kinda.framework.widget.tools.FlexBoxAttr.IFlexBoxChange
        public void onChange() {
            com.tencent.kinda.framework.widget.base.ViewBase.this.onFlexAttribute();
        }
    });

    public com.facebook.yoga.YogaNode node() {
        return this.flexAttr.node();
    }

    public void onFlexAttribute() {
    }
}
