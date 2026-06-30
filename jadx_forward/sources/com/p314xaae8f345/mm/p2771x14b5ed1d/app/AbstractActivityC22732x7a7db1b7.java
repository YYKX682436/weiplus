package com.p314xaae8f345.mm.p2771x14b5ed1d.app;

/* renamed from: com.tencent.mm.vending.app.PresenterActivity */
/* loaded from: classes9.dex */
public abstract class AbstractActivityC22732x7a7db1b7 extends com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c implements im5.b {

    /* renamed from: d, reason: collision with root package name */
    public final em5.i f294176d = new em5.i();

    @Override // im5.b
    /* renamed from: keep */
    public void mo46316x322b85(im5.a aVar) {
        this.f294176d.mo46316x322b85(aVar);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f294176d.c(getIntent(), this);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        em5.i iVar = this.f294176d;
        iVar.f336765g.mo10668x2efc64();
        iVar.e(4);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        this.f294176d.e(3);
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f294176d.e(2);
    }
}
