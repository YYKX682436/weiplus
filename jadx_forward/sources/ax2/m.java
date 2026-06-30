package ax2;

/* loaded from: classes4.dex */
public final class m implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15391xf2263481 f96602a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f96603b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableString f96604c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f96605d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f96606e;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15391xf2263481 c15391xf2263481, android.widget.TextView textView, android.text.SpannableString spannableString, int i17, int i18) {
        this.f96602a = c15391xf2263481;
        this.f96603b = textView;
        this.f96604c = spannableString;
        this.f96605d = i17;
        this.f96606e = i18;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            pm0.v.X(new ax2.l(this.f96603b, bitmap, this.f96602a, this.f96604c, this.f96605d, this.f96606e));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f96602a.f213340d, "resource is null!");
        }
    }
}
