package ah4;

/* loaded from: classes13.dex */
public class w extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ah4.h f5028h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ah4.y f5029i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(ah4.y yVar, long j17, ah4.n nVar, ah4.h hVar) {
        super(j17, nVar);
        this.f5029i = yVar;
        this.f5028h = hVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        return new ah4.a0(this.f5029i.f5031e, this.f5028h);
    }
}
