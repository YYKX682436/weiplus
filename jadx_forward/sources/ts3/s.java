package ts3;

/* loaded from: classes9.dex */
public class s implements db5.o5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1977xbdf5c67e.ui.ActivityC16956x7944e152 f503231d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1977xbdf5c67e.ui.ActivityC16956x7944e152 activityC16956x7944e152) {
        this.f503231d = activityC16956x7944e152;
    }

    @Override // db5.o5
    public boolean a() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1977xbdf5c67e.ui.ActivityC16956x7944e152 activityC16956x7944e152 = this.f503231d;
        ts3.a aVar = activityC16956x7944e152.f236592g;
        ts3.d0 d0Var = (ts3.d0) aVar;
        if (d0Var.f503184p >= d0Var.f503185q) {
            activityC16956x7944e152.f236589d.mo75771x46dba6a1(0, activityC16956x7944e152.f236590e.m79077xde699c26());
            return true;
        }
        int count = aVar.getCount();
        ts3.a aVar2 = activityC16956x7944e152.f236592g;
        ts3.d0 d0Var2 = (ts3.d0) aVar2;
        int i18 = d0Var2.f503184p;
        int i19 = d0Var2.f503185q;
        if (i18 >= i19) {
            i17 = 0;
        } else {
            i17 = 3;
            int i27 = i18 + 3;
            d0Var2.f503184p = i27;
            if (i27 > i19) {
                d0Var2.f503184p = i19;
                i17 = i19 % 3;
            }
        }
        aVar2.f();
        if (activityC16956x7944e152.f236592g.getCount() > count) {
            int i28 = i17 + 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReaderAppUI", "pullDownView nowCount > preCount on set position %d, set pullDownView.getTopHeight() %d", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(activityC16956x7944e152.f236590e.m79077xde699c26()));
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f7.b(activityC16956x7944e152.f236589d, i28, activityC16956x7944e152.f236590e.m79077xde699c26(), false, false);
        }
        return true;
    }
}
