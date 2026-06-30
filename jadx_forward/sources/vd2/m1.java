package vd2;

/* loaded from: classes3.dex */
public final class m1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vd2.s1 f517340a;

    public m1(vd2.s1 s1Var) {
        this.f517340a = s1Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f517340a.f517440m, "lxltest onChanged");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void c(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f517340a.f517440m, "lxltest onItemRangeChanged positionStart:" + i17 + ", itemCount:" + i18);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void d(int i17, int i18, java.lang.Object obj) {
        c(i17, i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f517340a.f517440m, "lxltest onItemRangeChanged positionStart:" + i17 + ", itemCount:" + i18 + ", payload:" + obj);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void e(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f517340a.f517440m, "lxltest onItemRangeInserted positionStart:" + i17 + ", itemCount:" + i18);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void f(int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f517340a.f517440m, "lxltest onItemRangeMoved fromPosition:" + i17 + ", toPosition:" + i18 + ", itemCount:" + i19);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void g(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f517340a.f517440m, "lxltest onItemRangeRemoved positionStart:" + i17 + ", itemCount:" + i18);
    }
}
