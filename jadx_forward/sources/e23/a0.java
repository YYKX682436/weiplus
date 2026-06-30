package e23;

/* loaded from: classes12.dex */
public class a0 extends u13.g {

    /* renamed from: q, reason: collision with root package name */
    public boolean f328304q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f328305r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.CharSequence f328306s;

    /* renamed from: t, reason: collision with root package name */
    public final e23.z f328307t;

    public a0(int i17) {
        super(12, i17);
        this.f328307t = new e23.z(this);
        this.f505294d = false;
    }

    @Override // u13.g
    public void a(android.content.Context context, u13.e eVar, java.lang.Object... objArr) {
        java.lang.String str = this.f505295e.f432665d[0];
        android.text.TextPaint textPaint = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.d.f219569e;
        java.lang.CharSequence ellipsize = android.text.TextUtils.ellipsize(str, textPaint, 200.0f, android.text.TextUtils.TruncateAt.MIDDLE);
        java.lang.CharSequence ellipsize2 = android.text.TextUtils.ellipsize(this.f505295e.f432665d[1], textPaint, 400.0f, android.text.TextUtils.TruncateAt.MIDDLE);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f328305r)) {
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.idy);
            java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.idz);
            java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574480ie0);
            int length = string.length();
            int length2 = string.length() + ellipsize.length() + string2.length();
            this.f328306s = o13.q.l(o13.q.l(string + ((java.lang.Object) ellipsize) + string2 + ((java.lang.Object) ellipsize2) + string3, length, ellipsize.length() + length), length2, ellipsize2.length() + length2);
            return;
        }
        java.lang.String string4 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574481ie1);
        java.lang.String string5 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.idz);
        java.lang.String string6 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574480ie0);
        int length3 = string4.length();
        int length4 = string4.length() + ellipsize.length() + string5.length();
        this.f328306s = o13.q.l(o13.q.l(string4 + ((java.lang.Object) ellipsize) + string5 + ((java.lang.Object) ellipsize2) + string6, length3, ellipsize.length() + length3), length4, ellipsize2.length() + length4);
    }

    @Override // u13.g
    public u13.f k() {
        return this.f328307t;
    }
}
