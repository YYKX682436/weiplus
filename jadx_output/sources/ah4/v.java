package ah4;

/* loaded from: classes13.dex */
public class v extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int[] f5025h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f5026i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ah4.y f5027j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ah4.y yVar, long j17, byte[] bArr, int[] iArr, java.lang.String str) {
        super(j17, bArr);
        this.f5027j = yVar;
        this.f5025h = iArr;
        this.f5026i = str;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        com.tencent.mm.pointers.PByteArray pByteArray = new com.tencent.mm.pointers.PByteArray();
        this.f5025h[0] = this.f5027j.f5031e.GetStatis(pByteArray, this.f5026i);
        return pByteArray.value;
    }
}
