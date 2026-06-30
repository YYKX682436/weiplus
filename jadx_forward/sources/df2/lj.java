package df2;

/* loaded from: classes3.dex */
public final class lj implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.oj f312203d;

    public lj(df2.oj ojVar) {
        this.f312203d = ojVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        df2.oj ojVar = this.f312203d;
        df2.pv pvVar = (df2.pv) ojVar.m56789x25fe639c(df2.pv.class);
        java.lang.Object obj2 = pvVar != null ? pvVar.f312648p : null;
        boolean z17 = (obj2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60) obj2 : null) != null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        if (bool.booleanValue() && !z17) {
            ojVar.d7();
            return;
        }
        android.view.View f76 = ojVar.f7();
        if (f76 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(f76, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveGameTeamUpController$onViewMount$2", "onChanged", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f76.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(f76, "com/tencent/mm/plugin/finder/live/controller/LiveGameTeamUpController$onViewMount$2", "onChanged", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (z17) {
            ((mm2.c1) ojVar.m56788xbba4bfc0(mm2.c1.class)).P8(false);
        }
    }
}
