package bw5;

/* loaded from: classes3.dex */
public enum l implements com.tencent.mm.protobuf.h {
    AIGenerationProjectStatusIdle(0),
    AIGenerationProjectStatusBillCreating(1),
    AIGenerationProjectStatusPendingPay(2),
    AIGenerationProjectStatusGenerating(3),
    AIGenerationProjectStatusFinish(4),
    AIGenerationProjectStatusError(5),
    AIGenerationProjectStatusCancelled(6);


    /* renamed from: d, reason: collision with root package name */
    public final int f29590d;

    l(int i17) {
        this.f29590d = i17;
    }

    public static bw5.l a(int i17) {
        switch (i17) {
            case 0:
                return AIGenerationProjectStatusIdle;
            case 1:
                return AIGenerationProjectStatusBillCreating;
            case 2:
                return AIGenerationProjectStatusPendingPay;
            case 3:
                return AIGenerationProjectStatusGenerating;
            case 4:
                return AIGenerationProjectStatusFinish;
            case 5:
                return AIGenerationProjectStatusError;
            case 6:
                return AIGenerationProjectStatusCancelled;
            default:
                return null;
        }
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f29590d;
    }
}
