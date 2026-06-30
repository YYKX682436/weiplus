package tk4;

/* loaded from: classes5.dex */
public final class n implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2285xb446ff0.C18711x7115b73a f501532a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f501533b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bw5.d2 f501534c;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2285xb446ff0.C18711x7115b73a c18711x7115b73a, boolean z17, bw5.d2 d2Var) {
        this.f501532a = c18711x7115b73a;
        this.f501533b = z17;
        this.f501534c = d2Var;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap bitmap2;
        java.lang.Integer num = null;
        byte[] bArr = bVar != null ? bVar.f441066c : null;
        boolean z17 = this.f501533b;
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2285xb446ff0.C18711x7115b73a c18711x7115b73a = this.f501532a;
        if (bArr != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18711x7115b73a.f256172a, "ImageLoader net download finish: url = %s outdoor " + z17, str);
        }
        java.lang.String str2 = c18711x7115b73a.f256172a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ImageLoader getImage finish: url = ");
        sb6.append(str);
        sb6.append(", width = ");
        sb6.append((bVar == null || (bitmap2 = bVar.f441067d) == null) ? null : java.lang.Integer.valueOf(bitmap2.getWidth()));
        sb6.append(", height = ");
        if (bVar != null && (bitmap = bVar.f441067d) != null) {
            num = java.lang.Integer.valueOf(bitmap.getHeight());
        }
        sb6.append(num);
        sb6.append(" outdoor ");
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
        pm0.v.X(new tk4.m(c18711x7115b73a, this.f501534c, bVar));
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        return null;
    }
}
