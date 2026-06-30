package gz3;

/* loaded from: classes15.dex */
public class e implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f359284a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2040x373fe494.ui.ActivityC17273xa70a65ea f359285b;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2040x373fe494.ui.ActivityC17273xa70a65ea activityC17273xa70a65ea, int i17) {
        this.f359285b = activityC17273xa70a65ea;
        this.f359284a = i17;
    }

    @Override // db5.c1
    public void e(int i17) {
        if (i17 != 0) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2040x373fe494.ui.ActivityC17273xa70a65ea activityC17273xa70a65ea = this.f359285b;
        fz3.a aVar = (fz3.a) activityC17273xa70a65ea.f240270f.getItem(this.f359284a);
        if (aVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.m1.Ai().Bi().mo9951xb06685ab(aVar, new java.lang.String[0]);
            activityC17273xa70a65ea.T6();
            activityC17273xa70a65ea.f240270f.f();
        }
    }
}
