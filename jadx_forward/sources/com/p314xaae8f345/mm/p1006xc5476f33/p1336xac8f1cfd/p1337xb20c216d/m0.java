package com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d;

/* loaded from: classes12.dex */
public class m0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f178128d = new java.util.LinkedList();

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.d0 d0Var) {
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ix1.a getItem(int i17) {
        return (ix1.a) this.f178128d.get(i17);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f178128d.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a;
        android.graphics.Bitmap f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.u1.f(((ix1.c) getItem(i17)).f376855s, null);
        if (f17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Editor.EditorImageUI", "get image fail");
            if (view == null || (view instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a)) {
                view = android.view.View.inflate(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.a5i, null);
            }
            android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.crq);
            imageView.setVisibility(0);
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78994x211254f4);
            view.setLayoutParams(new android.widget.Gallery.LayoutParams(-1, -1));
            return view;
        }
        android.content.Context context = viewGroup.getContext();
        if (view == null || !(view instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a)) {
            c21524xecd57b9a = new com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a(context, f17.getWidth(), f17.getHeight());
        } else {
            c21524xecd57b9a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) view;
            int width = f17.getWidth();
            int height = f17.getHeight();
            c21524xecd57b9a.f279184o = width;
            c21524xecd57b9a.f279185p = height;
        }
        c21524xecd57b9a.setLayoutParams(new android.widget.Gallery.LayoutParams(-1, -1));
        c21524xecd57b9a.setImageBitmap(f17);
        c21524xecd57b9a.m79201x4cf4f0ef(true);
        return c21524xecd57b9a;
    }
}
