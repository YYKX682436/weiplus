package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class u extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.AAImagPreviewUI f72818d;

    public u(com.tencent.mm.plugin.aa.ui.AAImagPreviewUI aAImagPreviewUI, com.tencent.mm.plugin.aa.ui.i iVar) {
        this.f72818d = aAImagPreviewUI;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return 1;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.aa.ui.AAImagPreviewUI aAImagPreviewUI = this.f72818d;
        android.view.View inflate = android.view.View.inflate(aAImagPreviewUI.getContext(), com.tencent.mm.R.layout.f487867a4, null);
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = (com.tencent.mm.ui.base.MultiTouchImageView) inflate.findViewById(com.tencent.mm.R.id.h88);
        inflate.setLayoutParams(new android.widget.Gallery.LayoutParams(-1, -1));
        int i18 = aAImagPreviewUI.f72432f;
        if (i18 == 1) {
            android.graphics.Bitmap Bi = ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Bi(aAImagPreviewUI.f72434h);
            if (Bi != null) {
                aAImagPreviewUI.U6(multiTouchImageView, Bi);
            } else {
                aAImagPreviewUI.f72435i = db5.e1.O(aAImagPreviewUI, null, 3, com.tencent.mm.R.style.f494256i6, aAImagPreviewUI.getString(com.tencent.mm.R.string.ggc), true, true, new com.tencent.mm.plugin.aa.ui.o(aAImagPreviewUI));
                ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(aAImagPreviewUI.f72434h, new com.tencent.mm.plugin.aa.ui.q(aAImagPreviewUI, multiTouchImageView));
            }
        } else if (i18 == 2) {
            multiTouchImageView.post(new com.tencent.mm.plugin.aa.ui.r(aAImagPreviewUI, multiTouchImageView));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.PreviewHdHeadImg", "scene(%s) invalid", java.lang.Integer.valueOf(i18));
            aAImagPreviewUI.finish();
        }
        inflate.findViewById(com.tencent.mm.R.id.h9y).setImportantForAccessibility(2);
        return inflate;
    }
}
