package kw4;

/* loaded from: classes8.dex */
public class w extends com.p314xaae8f345.mm.sdk.p2603x2137b148.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f394731h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f394732i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f394733j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float[] f394734k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f394735l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kw4.c0 f394736m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(kw4.c0 c0Var, long j17, java.lang.Boolean bool, android.view.View view, int i17, int i18, float[] fArr, int i19) {
        super(j17, bool);
        this.f394736m = c0Var;
        this.f394731h = view;
        this.f394732i = i17;
        this.f394733j = i18;
        this.f394734k = fArr;
        this.f394735l = i19;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.d8
    public java.lang.Object b() {
        return java.lang.Boolean.valueOf(this.f394736m.a(this.f394731h, this.f394732i, this.f394733j, this.f394734k, this.f394735l));
    }
}
