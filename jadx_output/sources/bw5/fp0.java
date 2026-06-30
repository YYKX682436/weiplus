package bw5;

/* loaded from: classes11.dex */
public enum fp0 implements com.tencent.mm.protobuf.h {
    ConsumeSuccess(0),
    ConsumeCancel(99991),
    ConsumeDefaultError(99992),
    ConsumeNoMoney(99993),
    ConsumeIntercept(99994);


    /* renamed from: d, reason: collision with root package name */
    public final int f27435d;

    fp0(int i17) {
        this.f27435d = i17;
    }

    public static bw5.fp0 a(int i17) {
        if (i17 == 0) {
            return ConsumeSuccess;
        }
        switch (i17) {
            case 99991:
                return ConsumeCancel;
            case 99992:
                return ConsumeDefaultError;
            case 99993:
                return ConsumeNoMoney;
            case 99994:
                return ConsumeIntercept;
            default:
                return null;
        }
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f27435d;
    }
}
