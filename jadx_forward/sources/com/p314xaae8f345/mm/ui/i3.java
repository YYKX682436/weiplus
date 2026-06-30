package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class i3 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f290430g = 0;

    /* renamed from: a, reason: collision with root package name */
    public long f290431a;

    /* renamed from: b, reason: collision with root package name */
    public long f290432b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f290433c;

    /* renamed from: d, reason: collision with root package name */
    public final int f290434d;

    /* renamed from: e, reason: collision with root package name */
    public final int f290435e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.j3 f290436f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(com.p314xaae8f345.mm.ui.j3 j3Var, android.os.Looper looper) {
        super(looper);
        this.f290436f = j3Var;
        this.f290434d = hashCode() | 1910;
        this.f290435e = hashCode() | 1914;
        j3Var.f290526c = new java.util.ArrayList(32);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        int i17 = message.what;
        int i18 = this.f290435e;
        com.p314xaae8f345.mm.ui.j3 j3Var = this.f290436f;
        int i19 = this.f290434d;
        if (i17 != i18) {
            if (i17 == i19) {
                com.p314xaae8f345.mm.ui.j3.a(j3Var);
                return;
            }
            return;
        }
        mo50303x856b99f0(i19);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f290433c = true;
        java.lang.Object obj = message.obj;
        if (obj instanceof java.lang.Boolean) {
            this.f290433c = ((java.lang.Boolean) obj).booleanValue();
        }
        long j17 = this.f290432b;
        long j18 = currentTimeMillis - j17;
        int i27 = j3Var.f290528e.f290556m;
        if (j18 <= i27 && currentTimeMillis - j17 >= 0) {
            long j19 = this.f290431a;
            if ((j19 == 0 || currentTimeMillis - j19 <= r14.f290557n) && currentTimeMillis - j19 >= 0 && this.f290433c) {
                mo50307xb9e94560(i19, i27);
                this.f290432b = currentTimeMillis;
            }
        }
        com.p314xaae8f345.mm.ui.j3.a(j3Var);
        this.f290432b = currentTimeMillis;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(com.p314xaae8f345.mm.ui.j3 j3Var, java.lang.String str) {
        super(str);
        this.f290436f = j3Var;
        this.f290434d = hashCode() | 1910;
        this.f290435e = hashCode() | 1914;
        j3Var.f290526c = new java.util.ArrayList(32);
    }
}
