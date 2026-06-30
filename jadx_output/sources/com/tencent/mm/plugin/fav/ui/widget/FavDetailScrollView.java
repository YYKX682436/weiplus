package com.tencent.mm.plugin.fav.ui.widget;

/* loaded from: classes12.dex */
public class FavDetailScrollView extends com.tencent.mm.ui.widget.MMLoadScrollView {

    /* renamed from: e, reason: collision with root package name */
    public w82.e f101527e;

    public FavDetailScrollView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    @Override // android.view.View
    public void onScrollChanged(int i17, int i18, int i19, int i27) {
        w82.e eVar;
        super.onScrollChanged(i17, i18, i19, i27);
        if (getScrollY() == 0 && (eVar = this.f101527e) != null) {
            ((com.tencent.mm.plugin.fav.ui.detail.b) eVar).f100696a.hideActionbarLine();
            return;
        }
        w82.e eVar2 = this.f101527e;
        if (eVar2 != null) {
            ((com.tencent.mm.plugin.fav.ui.detail.b) eVar2).f100696a.showActionbarLine();
        }
    }

    public void setOnScrollChangeListener(w82.e eVar) {
        this.f101527e = eVar;
    }

    public FavDetailScrollView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
