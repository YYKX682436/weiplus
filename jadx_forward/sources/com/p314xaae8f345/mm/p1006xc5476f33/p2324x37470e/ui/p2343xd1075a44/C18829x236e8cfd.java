package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/widget/MultiEditCropLayout;", "Lcom/tencent/mm/ui/widget/cropview/CropLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.vlog.ui.widget.MultiEditCropLayout */
/* loaded from: classes10.dex */
public class C18829x236e8cfd extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22678xac4e51fa {

    /* renamed from: p1, reason: collision with root package name */
    public boolean f257650p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18829x236e8cfd(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22678xac4e51fa, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.AbstractC22676x7a2993ab, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.ViewOnTouchListenerC22681xee05ddc5
    public void c(android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e1");
        if (!this.f257650p1) {
            super.c(e17);
            return;
        }
        ml5.h onChangeListener = getOnChangeListener();
        ml5.i iVar = onChangeListener instanceof ml5.i ? (ml5.i) onChangeListener : null;
        if (iVar != null) {
            iVar.b();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22678xac4e51fa
    public void q(boolean z17, int i17, int i18, int i19, int i27) {
        if (!this.f257650p1) {
            super.q(z17, i17, i18, i19, i27);
            return;
        }
        android.view.View contentView = getContentView();
        if (contentView == null || !this.isShouldLayout) {
            return;
        }
        m81926x3c3e383f(false);
        getContentBaseRect().set(contentView.getLeft(), contentView.getTop(), contentView.getRight(), contentView.getBottom());
        contentView.setPivotX(getContentBaseRect().exactCenterX());
        contentView.setPivotY(getContentBaseRect().exactCenterY());
        getTmpRectF().set(getContentBaseRect());
        getMainMatrix().mapRect(getTmpRectF());
        getTmpRectF().round(getContentRect());
        getContentRectF().set(getTmpRectF());
        if (((java.lang.Boolean) getInitFinish().mo146xb9724478(getMainMatrix())).booleanValue()) {
            y();
            getContentRectF().round(getContentCenterRect());
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22678xac4e51fa
    public void z(android.graphics.RectF rectF, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rectF, "rectF");
        if (this.f257650p1) {
            getVisibilityRect().set(rectF);
        } else {
            super.z(rectF, z17);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18829x236e8cfd(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
