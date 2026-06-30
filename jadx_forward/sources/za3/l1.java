package za3;

/* loaded from: classes13.dex */
public class l1 implements za3.c {

    /* renamed from: d, reason: collision with root package name */
    public boolean f552514d = true;

    /* renamed from: e, reason: collision with root package name */
    public double f552515e = 1000000.0d;

    /* renamed from: f, reason: collision with root package name */
    public double f552516f = 1000000.0d;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f552517g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ProgressBar f552518h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f552519i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.FrameLayout f552520m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f552521n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f552522o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.C16319x94a0c128 f552523p;

    public l1(ab3.h hVar, android.content.Context context, boolean z17) {
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        this.f552519i = imageView;
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        this.f552520m = (android.widget.FrameLayout) android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.bwy, null);
        if (z17) {
            imageView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563514ap3);
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c8i);
        } else {
            imageView.setImageResource(j65.e.b() ? com.p314xaae8f345.mm.R.C30861xcebc809e.c8k : com.p314xaae8f345.mm.R.C30861xcebc809e.c8j);
        }
        this.f552523p = (com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.C16319x94a0c128) hVar.mo1007xb0d6012();
    }

    public void a(float f17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ZItemOverlay", "setArrowIvAlpha:%s", java.lang.Float.valueOf(f17));
        android.widget.ImageView imageView = this.f552519i;
        imageView.getDrawable().setAlpha((int) (255.0f * f17));
        imageView.setAlpha(f17);
        this.f552523p.m66009xf5f903a8(imageView);
    }

    @Override // za3.c
    /* renamed from: getPreText */
    public java.lang.String mo65930x2ac69e3a() {
        return "";
    }

    @Override // za3.c
    /* renamed from: setText */
    public void mo65933x765074af(java.lang.String str) {
        android.widget.FrameLayout frameLayout = this.f552520m;
        this.f552517g = (android.widget.TextView) frameLayout.findViewById(com.p314xaae8f345.mm.R.id.inx);
        this.f552518h = (android.widget.ProgressBar) frameLayout.findViewById(com.p314xaae8f345.mm.R.id.ine);
        this.f552521n = (android.widget.TextView) frameLayout.findViewById(com.p314xaae8f345.mm.R.id.inp);
        if (str == null || str.equals("")) {
            this.f552518h.setVisibility(0);
        } else {
            this.f552518h.setVisibility(8);
            this.f552517g.setVisibility(0);
            this.f552517g.setText(str);
        }
        java.lang.String str2 = this.f552522o;
        if (str2 == null || str2.equals("")) {
            this.f552521n.setText("");
            this.f552521n.setVisibility(8);
        } else {
            this.f552521n.setVisibility(0);
            this.f552521n.setText(this.f552522o);
        }
        if (this.f552514d) {
            this.f552523p.m66011x37843fd8(this.f552519i, this.f552515e, this.f552516f, false);
        }
    }
}
