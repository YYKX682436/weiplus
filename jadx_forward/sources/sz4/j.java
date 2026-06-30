package sz4;

/* loaded from: classes12.dex */
public class j extends sz4.u {

    /* renamed from: y, reason: collision with root package name */
    public final android.widget.ImageView f495735y;

    /* renamed from: z, reason: collision with root package name */
    public final int f495736z;

    public j(android.view.View view, mz4.j0 j0Var, mz4.d dVar) {
        super(view, j0Var, dVar);
        this.f495736z = 0;
        this.f495764f.setVisibility(0);
        this.f495772q.setVisibility(8);
        this.f495767i.setVisibility(8);
        this.f495764f.setTag(this);
        this.f495764f.setOnClickListener(this.f495777v);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h_2);
        this.f495735y = imageView;
        imageView.setVisibility(8);
        this.f495736z = mz4.j0.f414824w - ((int) android.util.TypedValue.applyDimension(1, 20.0f, mz4.j0.f414825x));
    }

    @Override // sz4.a
    public int i() {
        return 2;
    }

    @Override // sz4.u, sz4.a
    public void j(iz4.c cVar, int i17, int i18) {
        iz4.f fVar = (iz4.f) cVar;
        java.lang.String str = fVar.f377668s;
        java.lang.String str2 = fVar.f377671t;
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            str = com.p314xaae8f345.mm.vfs.w6.j(str2) ? str2 : null;
        }
        if (this.f495715d.f414842q == 3) {
            if (!com.p314xaae8f345.mm.vfs.w6.j(str2)) {
                str2 = str;
            }
            str = str2;
        }
        android.graphics.Bitmap g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? null : qz4.c.g(str, null);
        android.widget.ImageView imageView = this.f495764f;
        imageView.setImageBitmap(null);
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        imageView.setLayoutParams(layoutParams);
        if (g17 != null) {
            imageView.setImageBitmap(g17);
        } else {
            imageView.setImageBitmap(null);
            android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            int i19 = this.f495736z;
            layoutParams2.width = i19;
            layoutParams2.height = i19;
            imageView.setLayoutParams(layoutParams2);
            imageView.setBackgroundColor(android.graphics.Color.parseColor("#f6f6f6"));
        }
        boolean z17 = cVar.f377644i;
        android.widget.ImageView imageView2 = this.f495735y;
        if (z17) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
        super.j(cVar, i17, i18);
    }

    @Override // sz4.u
    public android.view.View l() {
        return this.f495764f;
    }
}
