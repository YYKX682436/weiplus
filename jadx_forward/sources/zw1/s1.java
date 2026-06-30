package zw1;

/* loaded from: classes8.dex */
public class s1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ln f558319d;

    public s1(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 activityC13144xce1cfbb7, r45.ln lnVar) {
        this.f558319d = lnVar;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        java.lang.String str;
        java.util.Iterator it = this.f558319d.f461181e.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            r45.wf5 wf5Var = (r45.wf5) it.next();
            if (wf5Var != null && (str = wf5Var.f470668d) != null) {
                g4Var.f(i17, str);
                i17++;
            }
        }
    }
}
