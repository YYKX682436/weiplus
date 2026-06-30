package gx1;

/* loaded from: classes12.dex */
public class y extends gx1.l {
    public final android.widget.ImageView A;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.e B;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 C;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.ImageView f358866z;

    public y(android.view.View view, nx1.z zVar) {
        super(view, zVar);
        gx1.x xVar = new gx1.x(this);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.nhn);
        this.f358866z = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.p0l);
        imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f81043x73ab7191);
        android.widget.ImageView imageView2 = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.ozf);
        this.A = imageView2;
        this.f358845q.setVisibility(8);
        this.f358840i.setVisibility(8);
        imageView2.setVisibility(8);
        this.f358844p.setTag(this);
        this.f358844p.setOnClickListener(xVar);
    }

    @Override // gx1.a
    public int i() {
        return 6;
    }

    @Override // gx1.l, gx1.a
    public void j(ix1.a aVar, int i17, int i18) {
        ix1.m mVar = (ix1.m) aVar;
        android.graphics.Bitmap f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.u1.f(mVar.f376879s, null);
        if (f17 == null && com.p314xaae8f345.mm.vfs.w6.j(mVar.f376862r) && (f17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u1.b(mVar.f376862r)) != null) {
            try {
                if (com.p314xaae8f345.mm.vfs.w6.j(mVar.f376879s)) {
                    com.p314xaae8f345.mm.vfs.w6.h(mVar.f376879s);
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(f17, 60, android.graphics.Bitmap.CompressFormat.JPEG, mVar.f376879s, false);
            } catch (java.lang.Exception unused) {
            }
        }
        android.widget.ImageView imageView = this.f358866z;
        if (f17 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            imageView.setLayoutParams(layoutParams);
            imageView.setImageBitmap(f17);
            imageView.setBackground(null);
        } else {
            android.util.DisplayMetrics displayMetrics = imageView.getResources().getDisplayMetrics();
            float f18 = (displayMetrics.density * 40.0f) + 0.5f;
            android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            int i19 = displayMetrics.widthPixels - ((int) f18);
            layoutParams2.width = i19;
            layoutParams2.height = (i19 * 52) / 68;
            imageView.setLayoutParams(layoutParams2);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f376857m.f456953m) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f376857m.f456945h)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EditorVideoItemHolder", "data key or url null!!!");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.f.f178086d.c(new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.c(mVar.f376857m, false, com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.a.TYPE_THUMB, i17));
            }
        }
        boolean z17 = aVar.f376851h;
        android.widget.ImageView imageView2 = this.A;
        if (z17) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
        super.j(aVar, i17, i18);
    }
}
