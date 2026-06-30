package o;

/* loaded from: classes15.dex */
public class j implements p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o.l f423254d;

    public j(o.l lVar) {
        this.f423254d = lVar;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m1
    public void a(o.r rVar, android.view.MenuItem menuItem) {
        o.l lVar = this.f423254d;
        lVar.f423263m.removeCallbacksAndMessages(null);
        int size = ((java.util.ArrayList) lVar.f423265o).size();
        int i17 = 0;
        while (true) {
            if (i17 >= size) {
                i17 = -1;
                break;
            } else if (rVar == ((o.k) ((java.util.ArrayList) lVar.f423265o).get(i17)).f423256b) {
                break;
            } else {
                i17++;
            }
        }
        if (i17 == -1) {
            return;
        }
        int i18 = i17 + 1;
        lVar.f423263m.postAtTime(new o.i(this, i18 < ((java.util.ArrayList) lVar.f423265o).size() ? (o.k) ((java.util.ArrayList) lVar.f423265o).get(i18) : null, menuItem, rVar), rVar, android.os.SystemClock.uptimeMillis() + 200);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m1
    public void b(o.r rVar, android.view.MenuItem menuItem) {
        this.f423254d.f423263m.removeCallbacksAndMessages(rVar);
    }
}
