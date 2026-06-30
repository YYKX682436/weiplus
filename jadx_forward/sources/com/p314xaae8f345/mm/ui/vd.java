package com.p314xaae8f345.mm.ui;

/* loaded from: classes10.dex */
public class vd implements qk.y7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21406xeafe92f0 f292686a;

    public vd(com.p314xaae8f345.mm.ui.ActivityC21406xeafe92f0 activityC21406xeafe92f0) {
        this.f292686a = activityC21406xeafe92f0;
    }

    @Override // qk.y7
    public void a(qk.g6 g6Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNewPhotoEditUI", "[onSelectedFeature] features:%s", g6Var.name());
    }

    @Override // qk.y7
    public void b(qk.g6 g6Var, int i17, java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNewPhotoEditUI", "[onSelectedDetailFeature] features:%s index:%s", g6Var.name(), java.lang.Integer.valueOf(i17));
    }

    @Override // qk.y7
    public void c(boolean z17) {
        com.p314xaae8f345.mm.ui.ActivityC21406xeafe92f0 activityC21406xeafe92f0 = this.f292686a;
        if (z17) {
            activityC21406xeafe92f0.mo26063x7b383410();
        } else {
            activityC21406xeafe92f0.mo53060x36654fab(activityC21406xeafe92f0.m78513xc2a54588());
        }
    }
}
