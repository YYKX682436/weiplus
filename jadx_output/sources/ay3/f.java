package ay3;

/* loaded from: classes3.dex */
public final class f implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.ui.RingtoneHistoryUI f15286d;

    public f(com.tencent.mm.plugin.ringtone.ui.RingtoneHistoryUI ringtoneHistoryUI) {
        this.f15286d = ringtoneHistoryUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.ringtone.ui.RingtoneHistoryUI ringtoneHistoryUI = this.f15286d;
        g4Var.d(1, ringtoneHistoryUI.getContext().getResources().getColor(com.tencent.mm.R.color.f478532ac), ringtoneHistoryUI.getContext().getString(com.tencent.mm.R.string.b7k));
    }
}
