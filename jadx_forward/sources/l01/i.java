package l01;

/* loaded from: classes7.dex */
public class i implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396307d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l01.t f396308e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l01.b f396309f;

    public i(l01.b bVar, java.lang.String str, l01.t tVar) {
        this.f396309f = bVar;
        this.f396307d = str;
        this.f396308e = tVar;
    }

    @Override // l01.u
    public void b() {
        l01.t tVar = this.f396308e;
        if (tVar != null) {
            tVar.a(null);
        }
    }

    @Override // l01.u
    public void d() {
    }

    @Override // l01.i0
    public java.lang.String key() {
        return "BytesLoadTarget";
    }

    @Override // l01.u
    /* renamed from: onBitmapLoaded */
    public void mo1040x5481b993(android.graphics.Bitmap bitmap) {
        ik1.h0.a().m77784x795fa299(new l01.h(this));
    }
}
