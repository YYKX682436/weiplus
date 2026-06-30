package kw4;

/* loaded from: classes8.dex */
public class y extends com.p314xaae8f345.mm.sdk.p2603x2137b148.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f394739h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float[] f394740i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f394741j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kw4.c0 f394742k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(kw4.c0 c0Var, long j17, java.lang.Boolean bool, int i17, float[] fArr, int i18) {
        super(j17, bool);
        this.f394742k = c0Var;
        this.f394739h = i17;
        this.f394740i = fArr;
        this.f394741j = i18;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.d8
    public java.lang.Object b() {
        return java.lang.Boolean.valueOf(this.f394742k.f(this.f394739h, this.f394740i, this.f394741j));
    }
}
