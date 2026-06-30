package ax2;

/* loaded from: classes4.dex */
public final class h0 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15393xd4ca7d1b f96583a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableString f96584b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f96585c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f96586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f96587e;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15393xd4ca7d1b c15393xd4ca7d1b, android.text.SpannableString spannableString, int i17, int i18, android.widget.TextView textView) {
        this.f96583a = c15393xd4ca7d1b;
        this.f96584b = spannableString;
        this.f96585c = i17;
        this.f96586d = i18;
        this.f96587e = textView;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            pm0.v.X(new ax2.g0(this.f96583a, bitmap, this.f96584b, this.f96585c, this.f96586d, this.f96587e));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f96583a.f213362d, "onBindComboLiveRewardMsg resource is null!");
        }
    }
}
