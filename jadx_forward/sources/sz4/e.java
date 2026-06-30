package sz4;

/* loaded from: classes12.dex */
public class e extends sz4.u {
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.p2455xc35232d7.C19531x32539689 A;
    public final android.widget.ImageView B;
    public final android.widget.TextView C;
    public final android.widget.TextView D;
    public iz4.l E;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 F;

    /* renamed from: y, reason: collision with root package name */
    public final android.widget.LinearLayout f495723y;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.LinearLayout f495724z;

    public e(android.view.View view, mz4.j0 j0Var, mz4.d dVar, uz4.d dVar2) {
        super(view, j0Var, dVar);
        this.F = new sz4.d(this);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.f567700kf5);
        this.f495723y = linearLayout;
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.kec);
        this.f495724z = linearLayout2;
        this.B = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.kf6);
        this.C = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.kf8);
        this.D = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.kf9);
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.p2455xc35232d7.C19531x32539689 c19531x32539689 = (com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.p2455xc35232d7.C19531x32539689) view.findViewById(com.p314xaae8f345.mm.R.id.keh);
        this.A = c19531x32539689;
        c19531x32539689.m74992x591869be(dVar2);
        this.f495772q.setVisibility(0);
        linearLayout.setVisibility(8);
        linearLayout2.setVisibility(0);
        this.f495764f.setVisibility(8);
        this.f495767i.setVisibility(8);
        this.f495772q.setOnClickListener(new sz4.c(this));
    }

    @Override // sz4.a
    public int i() {
        return 20;
    }

    @Override // sz4.u, sz4.a
    public void j(iz4.c cVar, int i17, int i18) {
        iz4.l lVar = (iz4.l) cVar;
        this.E = lVar;
        boolean z17 = lVar.f377667r;
        android.widget.LinearLayout linearLayout = this.f495723y;
        android.widget.LinearLayout linearLayout2 = this.f495724z;
        android.widget.LinearLayout linearLayout3 = this.f495772q;
        if (z17) {
            linearLayout2.setVisibility(0);
            linearLayout.setVisibility(8);
            linearLayout3.setPadding(0, 0, 0, 0);
            boolean z18 = cVar.f377644i;
            com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.p2455xc35232d7.C19531x32539689 c19531x32539689 = this.A;
            if (z18) {
                c19531x32539689.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bbg);
            } else {
                c19531x32539689.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bbf);
            }
            iz4.l lVar2 = this.E;
            java.lang.String str = lVar2.f377668s;
            int i19 = lVar2.f377695w;
            java.lang.String str2 = lVar2.f377694v;
            c19531x32539689.getClass();
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            c19531x32539689.f269822h = str;
            c19531x32539689.f269823i = i19;
            c19531x32539689.setText(str2);
        } else {
            linearLayout3.setPadding(26, 7, 0, 7);
            linearLayout2.setVisibility(8);
            linearLayout.setVisibility(0);
            android.widget.ImageView imageView = this.B;
            if (imageView.getAnimation() != null) {
                imageView.startAnimation(imageView.getAnimation());
            } else {
                android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(500L);
                alphaAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
                alphaAnimation.setRepeatCount(-1);
                alphaAnimation.setRepeatMode(2);
                imageView.startAnimation(alphaAnimation);
            }
            boolean booleanValue = this.E.f377654y.booleanValue();
            android.widget.TextView textView = this.D;
            android.widget.TextView textView2 = this.C;
            if (booleanValue) {
                this.F.mo50305x3d8a09a2(4096);
                textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ce6);
                textView.setText(" " + ((java.lang.String) c31.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, this.E.f377693u)).toString());
            } else {
                textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572757ce5);
                textView.setText(" " + ((java.lang.String) c31.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (int) c31.a.a(this.E.f377696x))).toString());
            }
        }
        super.j(cVar, i17, i18);
    }
}
