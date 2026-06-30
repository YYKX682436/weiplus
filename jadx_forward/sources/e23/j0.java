package e23;

/* loaded from: classes12.dex */
public class j0 extends u13.g {

    /* renamed from: q, reason: collision with root package name */
    public java.lang.CharSequence f328409q;

    /* renamed from: r, reason: collision with root package name */
    public final u13.f f328410r;

    /* renamed from: s, reason: collision with root package name */
    public final u13.e f328411s;

    public j0(int i17) {
        super(11, i17);
        this.f328410r = new e23.i0(this);
        this.f328411s = new e23.h0(this);
    }

    @Override // u13.g
    public void a(android.content.Context context, u13.e eVar, java.lang.Object... objArr) {
        this.f328409q = o13.q.m(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.icq), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.icp), android.text.TextUtils.ellipsize(i(), com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.d.f219569e, 400.0f, android.text.TextUtils.TruncateAt.MIDDLE).toString());
    }

    @Override // u13.g
    public u13.f k() {
        return this.f328410r;
    }
}
