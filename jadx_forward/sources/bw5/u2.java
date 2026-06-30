package bw5;

/* loaded from: classes8.dex */
public enum u2 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    BillServiceStatusIDLE(0),
    BillServiceStatusBillCreating(1),
    BillServiceStatusPendingPay(2),
    BillServiceStatusPaying(3),
    BillServiceStatusVerifying(4),
    BillServiceStatusFinish(5),
    BillServiceStatusCancelled(6),
    BillServiceStatusError(7);


    /* renamed from: d, reason: collision with root package name */
    public final int f115241d;

    u2(int i17) {
        this.f115241d = i17;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f115241d;
    }
}
