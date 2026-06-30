package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zao implements java.lang.Runnable {
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zap zaa;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zam zab;

    public zao(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zap zapVar, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zam zamVar) {
        this.zaa = zapVar;
        this.zab = zamVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zaa.zaa) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb zab = this.zab.zab();
            if (zab.m17603xc9b9eee6()) {
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zap zapVar = this.zaa;
                zapVar.f5910xb6d8aaed.m17920x5dc77fb5(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.DialogInterfaceOnCancelListenerC1747xcb82b330.zaa(zapVar.m17907x19263085(), (android.app.PendingIntent) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(zab.m17602x8ee230a2()), this.zab.zaa(), false), 1);
                return;
            }
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zap zapVar2 = this.zaa;
            if (zapVar2.zac.mo17626x91cd42da(zapVar2.m17907x19263085(), zab.m17600x130a215f(), null) != null) {
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zap zapVar3 = this.zaa;
                zapVar3.zac.zag(zapVar3.m17907x19263085(), zapVar3.f5910xb6d8aaed, zab.m17600x130a215f(), 2, this.zaa);
                return;
            }
            if (zab.m17600x130a215f() != 18) {
                this.zaa.zaa(zab, this.zab.zaa());
                return;
            }
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zap zapVar4 = this.zaa;
            android.app.Dialog zab2 = zapVar4.zac.zab(zapVar4.m17907x19263085(), zapVar4);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zap zapVar5 = this.zaa;
            zapVar5.zac.zac(zapVar5.m17907x19263085().getApplicationContext(), new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zan(this, zab2));
        }
    }
}
