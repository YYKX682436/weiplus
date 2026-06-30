package bw5;

/* loaded from: classes16.dex */
public class fa extends com.tencent.mm.protobuf.f {

    /* renamed from: g, reason: collision with root package name */
    public static final bw5.fa f27197g = new bw5.fa();

    /* renamed from: d, reason: collision with root package name */
    public boolean f27198d = false;

    /* renamed from: e, reason: collision with root package name */
    public bw5.t f27199e = bw5.t.AddEmoticonFailedReason_UnDefined;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f27200f = "";

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fa)) {
            return false;
        }
        bw5.fa faVar = (bw5.fa) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f27198d), java.lang.Boolean.valueOf(faVar.f27198d)) && n51.f.a(this.f27199e, faVar.f27199e) && n51.f.a(this.f27200f, faVar.f27200f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.fa();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        bw5.t tVar;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f27198d);
            bw5.t tVar2 = this.f27199e;
            if (tVar2 != null) {
                fVar.e(2, tVar2.f33201d);
            }
            java.lang.String str = this.f27200f;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f27198d) + 0;
            bw5.t tVar3 = this.f27199e;
            if (tVar3 != null) {
                a17 += b36.f.e(2, tVar3.f33201d);
            }
            java.lang.String str2 = this.f27200f;
            return str2 != null ? a17 + b36.f.j(3, str2) : a17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.f27198d = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f27200f = aVar2.k(intValue);
            return 0;
        }
        switch (aVar2.g(intValue)) {
            case 0:
                tVar = bw5.t.AddEmoticonFailedReason_UnDefined;
                break;
            case 1:
                tVar = bw5.t.AddEmoticonFailedReason_InfoInvalid;
                break;
            case 2:
                tVar = bw5.t.AddEmoticonFailedReason_DataCorrupt;
                break;
            case 3:
                tVar = bw5.t.AddEmoticonFailedReason_LogicBusy;
                break;
            case 4:
                tVar = bw5.t.AddEmoticonFailedReason_FileSizeLimit;
                break;
            case 5:
                tVar = bw5.t.AddEmoticonFailedReason_CountLimit;
                break;
            case 6:
                tVar = bw5.t.AddEmoticonFailedReason_AlreadyInList;
                break;
            case 7:
                tVar = bw5.t.AddEmoticonFailedReason_Exchange_NetworkError;
                break;
            case 8:
                tVar = bw5.t.AddEmoticonFailedReason_Exchange_NotPaid;
                break;
            case 9:
                tVar = bw5.t.AddEmoticonFailedReason_Exchange_InvalidArea;
                break;
            case 10:
                tVar = bw5.t.AddEmoticonFailedReason_Exchange_Expired;
                break;
            case 11:
                tVar = bw5.t.AddEmoticonFailedReason_Exchange_NoProduct;
                break;
            case 12:
                tVar = bw5.t.AddEmoticonFailedReason_Upload_DefaultFailure;
                break;
            case 13:
                tVar = bw5.t.AddEmoticonFailedReason_Upload_AllBufferUploadedButIncomplete;
                break;
            case 14:
                tVar = bw5.t.AddEmoticonFailedReason_Upload_AntiSpam;
                break;
            case 15:
                tVar = bw5.t.AddEmoticonFailedReason_Upload_ConnectionFailed;
                break;
            case 16:
                tVar = bw5.t.AddEmoticonFailedReason_Upload_ExceedRetryLimit;
                break;
            case 17:
                tVar = bw5.t.AddEmoticonFailedReason_Upload_CdnFailure;
                break;
            case 18:
                tVar = bw5.t.AddEmoticonFailedReason_Upload_CdnNoMd5;
                break;
            case 19:
                tVar = bw5.t.AddEmoticonFailedReason_Upload_CdnOKButStillNeedUpload;
                break;
            case 20:
                tVar = bw5.t.AddEmoticonFailedReason_Others;
                break;
            default:
                tVar = null;
                break;
        }
        this.f27199e = tVar;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.fa) super.parseFrom(bArr);
    }
}
