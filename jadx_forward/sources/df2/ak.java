package df2;

/* loaded from: classes3.dex */
public final class ak implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.pk f311260d;

    public ak(df2.pk pkVar) {
        this.f311260d = pkVar;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageSelected */
    public void mo8333x510f45c9(int i17) {
        df2.pk pkVar = this.f311260d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pkVar.f312606m, "onPageSelected position:" + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p1526x373aa5.p1528x306930.C14278x370c3dac c14278x370c3dac = pkVar.f312617x;
        if (c14278x370c3dac != null) {
            c14278x370c3dac.post(new df2.zj(pkVar, i17));
        }
    }
}
