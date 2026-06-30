package df2;

/* loaded from: classes3.dex */
public final class b6 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.d6 f311314a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f311315b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f311316c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f311317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f311318e;

    public b6(df2.d6 d6Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8, android.content.Context context, java.util.ArrayList arrayList, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25) {
        this.f311314a = d6Var;
        this.f311315b = viewOnClickListenerC22631x1cc07cc8;
        this.f311316c = context;
        this.f311317d = arrayList;
        this.f311318e = c22849x81a93d25;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public final void mo2289xd6191dc1(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GestureEffectAnchorSettingController", "switchBtn click, " + z17);
        if (z17 != df2.d6.f311477n.c(this.f311314a.getStore().getLiveRoomData())) {
            this.f311315b.setEnabled(false);
            df2.d6 d6Var = this.f311314a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(d6Var, null, null, new df2.a6(this.f311316c, d6Var, z17, this.f311315b, this.f311317d, this.f311318e, null), 3, null);
        }
    }
}
