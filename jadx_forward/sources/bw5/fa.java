package bw5;

/* loaded from: classes16.dex */
public class fa extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: g, reason: collision with root package name */
    public static final bw5.fa f108730g = new bw5.fa();

    /* renamed from: d, reason: collision with root package name */
    public boolean f108731d = false;

    /* renamed from: e, reason: collision with root package name */
    public bw5.t f108732e = bw5.t.AddEmoticonFailedReason_UnDefined;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f108733f = "";

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fa)) {
            return false;
        }
        bw5.fa faVar = (bw5.fa) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f108731d), java.lang.Boolean.valueOf(faVar.f108731d)) && n51.f.a(this.f108732e, faVar.f108732e) && n51.f.a(this.f108733f, faVar.f108733f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.fa();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        bw5.t tVar;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f108731d);
            bw5.t tVar2 = this.f108732e;
            if (tVar2 != null) {
                fVar.e(2, tVar2.f114734d);
            }
            java.lang.String str = this.f108733f;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f108731d) + 0;
            bw5.t tVar3 = this.f108732e;
            if (tVar3 != null) {
                a17 += b36.f.e(2, tVar3.f114734d);
            }
            java.lang.String str2 = this.f108733f;
            return str2 != null ? a17 + b36.f.j(3, str2) : a17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
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
            this.f108731d = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f108733f = aVar2.k(intValue);
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
        this.f108732e = tVar;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.fa) super.mo11468x92b714fd(bArr);
    }
}
