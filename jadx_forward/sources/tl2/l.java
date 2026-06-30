package tl2;

/* loaded from: classes8.dex */
public final class l implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl2.u f501789d;

    public l(tl2.u uVar) {
        this.f501789d = uVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        tl2.u uVar = this.f501789d;
        android.app.Activity activity = uVar.f501807d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa = activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) activity : null;
        if (abstractActivityC15087xee12defa != null) {
            abstractActivityC15087xee12defa.m78550x87bf02d5(uVar.f501817q);
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).wk(2);
    }
}
