package e23;

/* loaded from: classes12.dex */
public class x extends u13.g {

    /* renamed from: q, reason: collision with root package name */
    public java.lang.CharSequence f328517q;

    /* renamed from: r, reason: collision with root package name */
    public final e23.w f328518r;

    /* renamed from: s, reason: collision with root package name */
    public final e23.v f328519s;

    public x(int i17) {
        super(10, i17);
        this.f328518r = new e23.w(this, null);
        this.f328519s = new e23.v(this, null);
    }

    @Override // u13.g
    public void a(android.content.Context context, u13.e eVar, java.lang.Object... objArr) {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        for (java.lang.String str : this.f505295e.f432664c) {
            android.text.SpannableString spannableString = new android.text.SpannableString(str);
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.c.f219556a), 0, str.length(), 33);
            spannableStringBuilder.append((java.lang.CharSequence) spannableString);
            spannableStringBuilder.append((java.lang.CharSequence) "、");
        }
        this.f328517q = android.text.TextUtils.concat(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.igc), spannableStringBuilder.subSequence(0, spannableStringBuilder.length() - 1), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.igb));
    }

    @Override // u13.g
    public u13.f k() {
        return this.f328518r;
    }
}
