package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes12.dex */
public class d1 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13050xc93b9c8f f176508d;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13050xc93b9c8f activityC13050xc93b9c8f, com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.u0 u0Var) {
        this.f176508d = activityC13050xc93b9c8f;
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
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a;
        android.graphics.Bitmap Ai = ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).Ai(this.f176508d.f176337e);
        if (Ai == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CardGiftImageUI", "get image fail");
            if (view != null && !(view instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a)) {
                return view;
            }
            android.view.View inflate = android.view.View.inflate(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.q_, null);
            ((android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.h9o)).setImageResource(com.p314xaae8f345.mm.R.raw.f78994x211254f4);
            inflate.setLayoutParams(new android.widget.Gallery.LayoutParams(-1, -1));
            return inflate;
        }
        android.content.Context context = viewGroup.getContext();
        if (view == null || !(view instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a)) {
            c21524xecd57b9a = new com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a(context, Ai.getWidth(), Ai.getHeight());
        } else {
            c21524xecd57b9a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) view;
            int width = Ai.getWidth();
            int height = Ai.getHeight();
            c21524xecd57b9a.f279184o = width;
            c21524xecd57b9a.f279185p = height;
        }
        c21524xecd57b9a.setLayoutParams(new android.widget.Gallery.LayoutParams(-1, -1));
        c21524xecd57b9a.setImageBitmap(Ai);
        c21524xecd57b9a.m79201x4cf4f0ef(true);
        return c21524xecd57b9a;
    }
}
