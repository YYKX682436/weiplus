package yx0;

/* loaded from: classes5.dex */
public final class l3 implements com.p314xaae8f345.p457x3304c6.p461x3a6d265.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f548965a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f548966b;

    public l3(yx0.b8 b8Var, java.lang.String str) {
        this.f548965a = b8Var;
        this.f548966b = str;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p461x3a6d265.u
    /* renamed from: onProgress */
    public final void mo32928x696ee52c(float f17) {
        yz5.p pVar = this.f548965a.f548720p;
        if (pVar != null) {
            pVar.mo149xb9724478(this.f548966b, java.lang.Float.valueOf(f17));
        }
    }
}
