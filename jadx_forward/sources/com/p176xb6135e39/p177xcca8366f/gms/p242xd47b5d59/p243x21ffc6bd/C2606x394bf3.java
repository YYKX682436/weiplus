package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.wearable.internal.zzex */
/* loaded from: classes13.dex */
public final class C2606x394bf3 extends com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.zzn<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> {

    /* renamed from: zzax */
    private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2467x120b0cb3.MessageListener> f7710x394b77;

    /* renamed from: zzba */
    private android.content.IntentFilter[] f7711x394b7f;

    /* renamed from: zzeg */
    private com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2467x120b0cb3.MessageListener f7712x394be2;

    private C2606x394bf3(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2467x120b0cb3.MessageListener messageListener, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2467x120b0cb3.MessageListener> c1781xefedf3a0, android.content.IntentFilter[] intentFilterArr) {
        super(abstractC1748xd28d482c);
        this.f7712x394be2 = (com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2467x120b0cb3.MessageListener) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(messageListener);
        this.f7710x394b77 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c1781xefedf3a0);
        this.f7711x394b7f = (android.content.IntentFilter[]) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(intentFilterArr);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1771x4463523
    /* renamed from: createFailedResult */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d mo17567xe8a1c1d6(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12) {
        this.f7712x394be2 = null;
        this.f7710x394b77 = null;
        this.f7711x394b7f = null;
        return c1763x9432bc12;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ApiMethodImpl
    /* renamed from: doExecute */
    public final /* synthetic */ void mo17568x9ef606a(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2667x394c3f c2667x394c3f) {
        c2667x394c3f.zza(this, this.f7712x394be2, this.f7710x394b77, this.f7711x394b7f);
        this.f7712x394be2 = null;
        this.f7710x394b77 = null;
        this.f7711x394b7f = null;
    }

    public /* synthetic */ C2606x394bf3(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2467x120b0cb3.MessageListener messageListener, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0 c1781xefedf3a0, android.content.IntentFilter[] intentFilterArr, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2604x394bf1 c2604x394bf1) {
        this(abstractC1748xd28d482c, messageListener, c1781xefedf3a0, intentFilterArr);
    }
}
