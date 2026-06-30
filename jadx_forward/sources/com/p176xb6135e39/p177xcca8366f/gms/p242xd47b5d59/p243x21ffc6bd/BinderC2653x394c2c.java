package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* renamed from: com.google.android.gms.wearable.internal.zzgs */
/* loaded from: classes13.dex */
final class BinderC2653x394c2c extends com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.BinderC2647x394c26<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2453x8f4414e3.GetInputStreamResult> {

    /* renamed from: zzeu */
    private final com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.BinderC2522x394b90 f7764x394bf0;

    public BinderC2653x394c2c(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ResultHolder<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2453x8f4414e3.GetInputStreamResult> resultHolder, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.BinderC2522x394b90 binderC2522x394b90) {
        super(resultHolder);
        this.f7764x394bf0 = (com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.BinderC2522x394b90) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(binderC2522x394b90);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.zza, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.InterfaceC2593x394be6
    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2569x394bc9 c2569x394bc9) {
        com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2514x394b88 c2514x394b88;
        if (c2569x394bc9.f7669x394bce != null) {
            c2514x394b88 = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2514x394b88(new android.os.ParcelFileDescriptor.AutoCloseInputStream(c2569x394bc9.f7669x394bce));
            this.f7764x394bf0.zza(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2515x394b89(c2514x394b88));
        } else {
            c2514x394b88 = null;
        }
        zza((com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.BinderC2653x394c2c) new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2511x394b85(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12(c2569x394bc9.f7668xec0a8ff), c2514x394b88));
    }
}
