package bw5;

/* loaded from: classes3.dex */
public enum l implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    AIGenerationProjectStatusIdle(0),
    AIGenerationProjectStatusBillCreating(1),
    AIGenerationProjectStatusPendingPay(2),
    AIGenerationProjectStatusGenerating(3),
    AIGenerationProjectStatusFinish(4),
    AIGenerationProjectStatusError(5),
    AIGenerationProjectStatusCancelled(6);


    /* renamed from: d, reason: collision with root package name */
    public final int f111123d;

    l(int i17) {
        this.f111123d = i17;
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

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f111123d;
    }
}
