package gx1;

/* loaded from: classes12.dex */
public class d extends gx1.l {
    public final int A;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.ImageView f358828z;

    public d(android.view.View view, nx1.z zVar) {
        super(view, zVar);
        this.A = 0;
        gx1.c cVar = new gx1.c(this);
        this.f358837f.setVisibility(0);
        this.f358845q.setVisibility(8);
        this.f358840i.setVisibility(8);
        this.f358837f.setTag(this);
        this.f358837f.setOnClickListener(cVar);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h_2);
        this.f358828z = imageView;
        imageView.setVisibility(8);
        this.A = nx1.z.f422862f - ((int) android.util.TypedValue.applyDimension(1, 20.0f, nx1.z.f422863g));
    }

    @Override // gx1.a
    public int i() {
        return 2;
    }

    @Override // gx1.l, gx1.a
    public void j(ix1.a aVar, int i17, int i18) {
        ix1.j jVar = (ix1.j) aVar;
        java.lang.String str = jVar.f376862r;
        java.lang.String str2 = jVar.f376855s;
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            str = com.p314xaae8f345.mm.vfs.w6.j(str2) ? str2 : null;
        }
        android.graphics.Bitmap f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? null : com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.u1.f(str, null);
        android.widget.ImageView imageView = this.f358837f;
        imageView.setImageBitmap(null);
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        imageView.setLayoutParams(layoutParams);
        if (f17 != null) {
            imageView.setImageBitmap(f17);
        } else {
            imageView.setImageBitmap(null);
            android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            int i19 = this.A;
            layoutParams2.width = i19;
            layoutParams2.height = i19;
            imageView.setLayoutParams(layoutParams2);
            imageView.setBackgroundColor(android.graphics.Color.parseColor("#f6f6f6"));
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jVar.f376857m.f456971u) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jVar.f376857m.f456967s)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EditorImageItemHolder", "data key or url null!!!");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.f.f178086d.c(new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.c(jVar.f376857m, false, com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.a.TYPE_FILE, i17));
            }
        }
        boolean z17 = aVar.f376851h;
        android.widget.ImageView imageView2 = this.f358828z;
        if (z17) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
        super.j(aVar, i17, i18);
    }
}
