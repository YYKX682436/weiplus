package ir2;

/* loaded from: classes2.dex */
public final class j1 implements p012xc85e97e9.p103xe821e364.p104xd1075a44.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ir2.p1 f375694a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f375695b;

    public j1(ir2.p1 p1Var, int i17) {
        this.f375694a = p1Var;
        this.f375695b = i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.r1
    public void a(int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DataMerger", "handleState: onItemRangeChanged position:" + i17 + " count:" + i18 + " payload:" + obj);
        ym5.m1 m1Var = this.f375694a.f375739a.f375631n;
        if (m1Var != null) {
            m1Var.mo56050xa44dd169(i17, i18, obj);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.r1
    public void b(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DataMerger", "handleState: onItemRangeInserted position:" + i17 + " count:" + i18);
        ym5.m1 m1Var = this.f375694a.f375739a.f375631n;
        if (m1Var != null) {
            m1Var.mo56051xb0566d03(i17, i18);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.r1
    public void c(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DataMerger", "handleState: onItemRangeRemoved position:" + i17 + " count:" + i18);
        ym5.m1 m1Var = this.f375694a.f375739a.f375631n;
        if (m1Var != null) {
            m1Var.mo56053xb9568715(i17, i18);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.r1
    public void d(int i17, int i18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleState: onItemRangeMoved fromPosition:");
        sb6.append(i17);
        sb6.append(" toPosition:");
        sb6.append(i18);
        sb6.append(" count：");
        int i19 = this.f375695b;
        sb6.append(i19);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DataMerger", sb6.toString());
        ym5.m1 m1Var = this.f375694a.f375739a.f375631n;
        if (m1Var != null) {
            m1Var.mo56052x5e3cd6a8(i17, i18, i19);
        }
    }
}
