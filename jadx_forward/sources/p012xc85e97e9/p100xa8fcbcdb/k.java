package p012xc85e97e9.p100xa8fcbcdb;

/* loaded from: classes13.dex */
public class k implements android.content.DialogInterface.OnMultiChoiceClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p100xa8fcbcdb.C1145xc0a22968 f93365a;

    public k(p012xc85e97e9.p100xa8fcbcdb.C1145xc0a22968 c1145xc0a22968) {
        this.f93365a = c1145xc0a22968;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17, boolean z17) {
        p012xc85e97e9.p100xa8fcbcdb.C1145xc0a22968 c1145xc0a22968 = this.f93365a;
        if (z17) {
            c1145xc0a22968.f93276p = ((java.util.HashSet) c1145xc0a22968.f93275o).add(c1145xc0a22968.f93278r[i17].toString()) | c1145xc0a22968.f93276p;
            return;
        }
        c1145xc0a22968.f93276p = ((java.util.HashSet) c1145xc0a22968.f93275o).remove(c1145xc0a22968.f93278r[i17].toString()) | c1145xc0a22968.f93276p;
    }
}
