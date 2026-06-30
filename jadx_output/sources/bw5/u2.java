package bw5;

/* loaded from: classes8.dex */
public enum u2 implements com.tencent.mm.protobuf.h {
    BillServiceStatusIDLE(0),
    BillServiceStatusBillCreating(1),
    BillServiceStatusPendingPay(2),
    BillServiceStatusPaying(3),
    BillServiceStatusVerifying(4),
    BillServiceStatusFinish(5),
    BillServiceStatusCancelled(6),
    BillServiceStatusError(7);


    /* renamed from: d, reason: collision with root package name */
    public final int f33708d;

    u2(int i17) {
        this.f33708d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f33708d;
    }
}
