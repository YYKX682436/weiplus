package sz4;

/* loaded from: classes12.dex */
public class h0 extends sz4.u {

    /* renamed from: y, reason: collision with root package name */
    public final android.widget.ImageView f495729y;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.ImageView f495730z;

    public h0(android.view.View view, mz4.j0 j0Var, mz4.d dVar) {
        super(view, j0Var, dVar);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.nhn);
        android.widget.ImageView imageView2 = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.p0l);
        this.f495729y = imageView2;
        imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f81043x73ab7191);
        android.widget.ImageView imageView3 = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.ozf);
        this.f495730z = imageView3;
        this.f495772q.setVisibility(8);
        this.f495767i.setVisibility(8);
        imageView3.setVisibility(8);
        imageView2.setTag(this);
        imageView2.setOnClickListener(this.f495777v);
    }

    @Override // sz4.a
    public int i() {
        return 6;
    }

    @Override // sz4.u, sz4.a
    public void j(iz4.c cVar, int i17, int i18) {
        iz4.k kVar = (iz4.k) cVar;
        android.graphics.Bitmap g17 = qz4.c.g(kVar.f377650t, null);
        if (g17 == null && com.p314xaae8f345.mm.vfs.w6.j(kVar.f377668s) && (g17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u1.b(kVar.f377668s)) != null) {
            try {
                if (com.p314xaae8f345.mm.vfs.w6.j(kVar.f377650t)) {
                    com.p314xaae8f345.mm.vfs.w6.h(kVar.f377650t);
                }
                q35.g.a(g17, 60, android.graphics.Bitmap.CompressFormat.JPEG, kVar.f377650t, false);
            } catch (java.lang.Exception unused) {
            }
        }
        android.widget.ImageView imageView = this.f495729y;
        if (g17 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            imageView.setLayoutParams(layoutParams);
            imageView.setImageBitmap(g17);
            imageView.setBackground(null);
        } else {
            android.util.DisplayMetrics displayMetrics = imageView.getResources().getDisplayMetrics();
            float f17 = (displayMetrics.density * 40.0f) + 0.5f;
            android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            int i19 = displayMetrics.widthPixels - ((int) f17);
            layoutParams2.width = i19;
            layoutParams2.height = (i19 * 52) / 68;
            imageView.setLayoutParams(layoutParams2);
        }
        boolean z17 = cVar.f377644i;
        android.widget.ImageView imageView2 = this.f495730z;
        if (z17) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
        super.j(cVar, i17, i18);
    }

    @Override // sz4.u
    public android.view.View l() {
        return this.f495771p;
    }
}
