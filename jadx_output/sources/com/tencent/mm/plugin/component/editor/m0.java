package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class m0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f96595d = new java.util.LinkedList();

    public m0(com.tencent.mm.plugin.component.editor.d0 d0Var) {
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ix1.a getItem(int i17) {
        return (ix1.a) this.f96595d.get(i17);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f96595d.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView;
        android.graphics.Bitmap f17 = com.tencent.mm.plugin.component.editor.u1.f(((ix1.c) getItem(i17)).f295322s, null);
        if (f17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Editor.EditorImageUI", "get image fail");
            if (view == null || (view instanceof com.tencent.mm.ui.base.MultiTouchImageView)) {
                view = android.view.View.inflate(viewGroup.getContext(), com.tencent.mm.R.layout.a5i, null);
            }
            android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.crq);
            imageView.setVisibility(0);
            imageView.setImageResource(com.tencent.mm.R.raw.download_image_icon);
            view.setLayoutParams(new android.widget.Gallery.LayoutParams(-1, -1));
            return view;
        }
        android.content.Context context = viewGroup.getContext();
        if (view == null || !(view instanceof com.tencent.mm.ui.base.MultiTouchImageView)) {
            multiTouchImageView = new com.tencent.mm.ui.base.MultiTouchImageView(context, f17.getWidth(), f17.getHeight());
        } else {
            multiTouchImageView = (com.tencent.mm.ui.base.MultiTouchImageView) view;
            int width = f17.getWidth();
            int height = f17.getHeight();
            multiTouchImageView.f197651o = width;
            multiTouchImageView.f197652p = height;
        }
        multiTouchImageView.setLayoutParams(new android.widget.Gallery.LayoutParams(-1, -1));
        multiTouchImageView.setImageBitmap(f17);
        multiTouchImageView.setMaxZoomDoubleTab(true);
        return multiTouchImageView;
    }
}
