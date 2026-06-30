package ph1;

/* loaded from: classes7.dex */
public class t implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ph1.v f435882d;

    public t(ph1.v vVar) {
        this.f435882d = vVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        ph1.v vVar = this.f435882d;
        ph1.g0.h(vVar.f435888h, ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e) vVar.f435885e.f373357a).f33454x337a8b, ph1.g.CANCEL);
    }
}
