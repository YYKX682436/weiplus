package u80;

/* loaded from: classes4.dex */
public class a implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double[] f506923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double[] f506924e;

    public a(u80.b bVar, double[] dArr, double[] dArr2) {
        this.f506923d = dArr;
        this.f506924e = dArr2;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        this.f506923d[0] = f18;
        this.f506924e[0] = f17;
        return false;
    }
}
