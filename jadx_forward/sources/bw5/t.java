package bw5;

/* loaded from: classes16.dex */
public enum t implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    AddEmoticonFailedReason_UnDefined(0),
    AddEmoticonFailedReason_InfoInvalid(1),
    AddEmoticonFailedReason_DataCorrupt(2),
    AddEmoticonFailedReason_LogicBusy(3),
    AddEmoticonFailedReason_FileSizeLimit(4),
    AddEmoticonFailedReason_CountLimit(5),
    AddEmoticonFailedReason_AlreadyInList(6),
    AddEmoticonFailedReason_Exchange_NetworkError(7),
    AddEmoticonFailedReason_Exchange_NotPaid(8),
    AddEmoticonFailedReason_Exchange_InvalidArea(9),
    AddEmoticonFailedReason_Exchange_Expired(10),
    AddEmoticonFailedReason_Exchange_NoProduct(11),
    AddEmoticonFailedReason_Upload_DefaultFailure(12),
    AddEmoticonFailedReason_Upload_AllBufferUploadedButIncomplete(13),
    AddEmoticonFailedReason_Upload_AntiSpam(14),
    AddEmoticonFailedReason_Upload_ConnectionFailed(15),
    AddEmoticonFailedReason_Upload_ExceedRetryLimit(16),
    AddEmoticonFailedReason_Upload_CdnFailure(17),
    AddEmoticonFailedReason_Upload_CdnNoMd5(18),
    AddEmoticonFailedReason_Upload_CdnOKButStillNeedUpload(19),
    AddEmoticonFailedReason_Others(20);


    /* renamed from: d, reason: collision with root package name */
    public final int f114734d;

    t(int i17) {
        this.f114734d = i17;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f114734d;
    }
}
