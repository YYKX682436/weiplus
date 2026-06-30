package com.tencent.mm.plugin.card.ui;

/* loaded from: classes12.dex */
public class d1 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardGiftImageUI f94975d;

    public d1(com.tencent.mm.plugin.card.ui.CardGiftImageUI cardGiftImageUI, com.tencent.mm.plugin.card.ui.u0 u0Var) {
        this.f94975d = cardGiftImageUI;
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
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView;
        android.graphics.Bitmap Ai = ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).Ai(this.f94975d.f94804e);
        if (Ai == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CardGiftImageUI", "get image fail");
            if (view != null && !(view instanceof com.tencent.mm.ui.base.MultiTouchImageView)) {
                return view;
            }
            android.view.View inflate = android.view.View.inflate(viewGroup.getContext(), com.tencent.mm.R.layout.q_, null);
            ((android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.h9o)).setImageResource(com.tencent.mm.R.raw.download_image_icon);
            inflate.setLayoutParams(new android.widget.Gallery.LayoutParams(-1, -1));
            return inflate;
        }
        android.content.Context context = viewGroup.getContext();
        if (view == null || !(view instanceof com.tencent.mm.ui.base.MultiTouchImageView)) {
            multiTouchImageView = new com.tencent.mm.ui.base.MultiTouchImageView(context, Ai.getWidth(), Ai.getHeight());
        } else {
            multiTouchImageView = (com.tencent.mm.ui.base.MultiTouchImageView) view;
            int width = Ai.getWidth();
            int height = Ai.getHeight();
            multiTouchImageView.f197651o = width;
            multiTouchImageView.f197652p = height;
        }
        multiTouchImageView.setLayoutParams(new android.widget.Gallery.LayoutParams(-1, -1));
        multiTouchImageView.setImageBitmap(Ai);
        multiTouchImageView.setMaxZoomDoubleTab(true);
        return multiTouchImageView;
    }
}
