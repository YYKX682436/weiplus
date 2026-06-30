package zw1;

/* loaded from: classes8.dex */
public class l5 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ln f558247d;

    public l5(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3, r45.ln lnVar) {
        this.f558247d = lnVar;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        java.lang.String str;
        java.util.Iterator it = this.f558247d.f461181e.iterator();
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
