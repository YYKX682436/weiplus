package p012xc85e97e9.p100xa8fcbcdb;

/* loaded from: classes13.dex */
public class i implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p100xa8fcbcdb.C1143x7e423733 f93361d;

    public i(p012xc85e97e9.p100xa8fcbcdb.C1143x7e423733 c1143x7e423733) {
        this.f93361d = c1143x7e423733;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        p012xc85e97e9.p100xa8fcbcdb.C1143x7e423733 c1143x7e423733 = this.f93361d;
        c1143x7e423733.f93271o = i17;
        c1143x7e423733.onClick(dialogInterface, -1);
        dialogInterface.dismiss();
    }
}
