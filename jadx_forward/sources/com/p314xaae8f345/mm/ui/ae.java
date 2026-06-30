package com.p314xaae8f345.mm.ui;

/* loaded from: classes10.dex */
public class ae implements qk.p7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f278664a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21406xeafe92f0 f278665b;

    public ae(com.p314xaae8f345.mm.ui.ActivityC21406xeafe92f0 activityC21406xeafe92f0, int i17) {
        this.f278665b = activityC21406xeafe92f0;
        this.f278664a = i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0107, code lost:
    
        com.p314xaae8f345.mm.ui.ActivityC21406xeafe92f0.T6(r0, r2);
        r0.W6(false);
        com.p314xaae8f345.mm.ui.ActivityC21406xeafe92f0.U6(r0, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return;
     */
    @Override // qk.p7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.graphics.Bitmap r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.ae.a(android.graphics.Bitmap, boolean):void");
    }

    @Override // qk.p7
    /* renamed from: onError */
    public void mo9160xaf8aa769(java.lang.Exception exc) {
        int i17 = com.p314xaae8f345.mm.ui.ActivityC21406xeafe92f0.f278432t;
        com.p314xaae8f345.mm.ui.ActivityC21406xeafe92f0 activityC21406xeafe92f0 = this.f278665b;
        activityC21406xeafe92f0.W6(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMNewPhotoEditUI", "[onRefreshed] %s", exc);
        dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, activityC21406xeafe92f0.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c1s), 1).show();
        activityC21406xeafe92f0.setResult(0);
        activityC21406xeafe92f0.finish();
    }
}
