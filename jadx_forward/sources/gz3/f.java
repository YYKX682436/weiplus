package gz3;

/* loaded from: classes15.dex */
public class f implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2040x373fe494.ui.ActivityC17273xa70a65ea f359286d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2040x373fe494.ui.ActivityC17273xa70a65ea activityC17273xa70a65ea) {
        this.f359286d = activityC17273xa70a65ea;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.m1.Ai().Bi().f559239d.A("ScanHistoryItem", "delete from ScanHistoryItem");
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2040x373fe494.ui.ActivityC17273xa70a65ea.f240267i;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2040x373fe494.ui.ActivityC17273xa70a65ea activityC17273xa70a65ea = this.f359286d;
        activityC17273xa70a65ea.T6();
        activityC17273xa70a65ea.f240270f.f();
    }
}
