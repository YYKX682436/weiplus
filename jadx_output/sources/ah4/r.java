package ah4;

/* loaded from: classes13.dex */
public class r extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5012h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ah4.y f5013i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ah4.y yVar, long j17, java.lang.Integer num, int i17) {
        super(j17, num);
        this.f5013i = yVar;
        this.f5012h = i17;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        return java.lang.Integer.valueOf(this.f5013i.f5031e.SetCurrentMicId(this.f5012h));
    }
}
