package cw1;

/* loaded from: classes12.dex */
public class d5 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.n2 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac f304406e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac activityC13118x73d350ac, java.lang.String[] strArr, int i17) {
        super(strArr, i17);
        this.f304406e = activityC13118x73d350ac;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p2
    public boolean d(int i17) {
        this.f304406e.f177290y = true;
        this.f304406e.f177287v = i17;
        ku5.u0 u0Var = ku5.t0.f394148d;
        final com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac activityC13118x73d350ac = this.f304406e;
        ((ku5.t0) u0Var).b(new java.lang.Runnable() { // from class: cw1.d5$$a
            @Override // java.lang.Runnable
            public final void run() {
                long[] jArr = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac.B;
                com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac.this.W6();
            }
        }, "CleanChattingLoad");
        super.d(i17);
        return true;
    }
}
