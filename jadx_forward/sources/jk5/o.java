package jk5;

/* loaded from: classes13.dex */
public class o extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 {

    /* renamed from: m, reason: collision with root package name */
    public static final android.widget.FrameLayout.LayoutParams f381714m = new android.widget.FrameLayout.LayoutParams(-1, -1);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f381715d;

    /* renamed from: e, reason: collision with root package name */
    public final jk5.l f381716e;

    /* renamed from: f, reason: collision with root package name */
    public android.app.ProgressDialog f381717f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f381718g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 f381719h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.FrameLayout f381720i;

    public o(android.content.Context context, java.lang.String str, jk5.l lVar) {
        super(context, android.R.style.Theme.Translucent.NoTitleBar);
        this.f381715d = str;
        this.f381716e = lVar;
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.app.ProgressDialog progressDialog = new android.app.ProgressDialog(getContext());
        this.f381717f = progressDialog;
        progressDialog.requestWindowFeature(1);
        this.f381717f.setMessage(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574942k23));
        requestWindowFeature(1);
        this.f381720i = new android.widget.FrameLayout(getContext());
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        this.f381718g = imageView;
        imageView.setOnClickListener(new jk5.k(this));
        this.f381718g.setImageDrawable(getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.bhj));
        this.f381718g.setVisibility(4);
        int intrinsicWidth = this.f381718g.getDrawable().getIntrinsicWidth() / 2;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9 = new com.p314xaae8f345.p3210x3857dc.C27816xac2547f9(getContext(), null);
        this.f381719h = c27816xac2547f9;
        c27816xac2547f9.mo120520x57c53c73(false);
        this.f381719h.mo120519x347eaca1(false);
        this.f381719h.mo74800x23d27c02(new jk5.n(this, null));
        this.f381719h.mo120153xd15cf999().E(true);
        this.f381719h.mo32265x141096a9(this.f381715d);
        this.f381719h.setLayoutParams(f381714m);
        this.f381719h.setVisibility(4);
        linearLayout.setPadding(intrinsicWidth, intrinsicWidth, intrinsicWidth, intrinsicWidth);
        linearLayout.addView(this.f381719h);
        this.f381720i.addView(linearLayout);
        this.f381720i.addView(this.f381718g, new android.view.ViewGroup.LayoutParams(-2, -2));
        addContentView(this.f381720i, new android.view.ViewGroup.LayoutParams(-1, -1));
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        ((jk5.j) this.f381716e).c();
        dismiss();
        return true;
    }
}
