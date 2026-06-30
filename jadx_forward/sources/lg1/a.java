package lg1;

/* loaded from: classes5.dex */
public class a extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.LinearLayout f400079d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f400080e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f400081f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f400082g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.ViewGroup f400083h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.ViewGroup f400084i;

    public a(android.content.Context context, boolean z17) {
        super(context);
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d3x, this);
        this.f400080e = context;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.cg7);
        this.f400079d = linearLayout;
        linearLayout.setOrientation(!z17 ? 1 : 0);
        this.f400081f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565583cu2);
        this.f400082g = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.h5n);
        this.f400083h = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.m7g);
        this.f400084i = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.gu6);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view) {
        this.f400079d.addView(view);
    }

    /* renamed from: setHasBorder */
    public void m145730x2e3e4924(boolean z17) {
        android.view.ViewGroup viewGroup = this.f400083h;
        if (z17) {
            viewGroup.setBackground(this.f400080e.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.b3p));
        } else {
            viewGroup.setBackground(null);
        }
    }

    /* renamed from: setStep */
    public void m145731x7650364e(lg1.b bVar) {
        android.view.ViewGroup viewGroup = this.f400084i;
        android.widget.ImageView imageView = this.f400082g;
        android.widget.TextView textView = this.f400081f;
        if (bVar == null) {
            textView.setText((java.lang.CharSequence) null);
            imageView.setImageDrawable(null);
            viewGroup.setVisibility(8);
        } else {
            textView.setText(bVar.f400085a);
            int i17 = bVar.f400086b;
            imageView.setImageResource(i17 != -2 ? i17 != 0 ? i17 != 2 ? com.p314xaae8f345.mm.R.C30861xcebc809e.brt : com.p314xaae8f345.mm.R.C30861xcebc809e.brs : com.p314xaae8f345.mm.R.C30861xcebc809e.bru : com.p314xaae8f345.mm.R.C30861xcebc809e.brv);
            viewGroup.setVisibility(0);
        }
    }
}
