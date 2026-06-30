package qm2;

/* loaded from: classes3.dex */
public final class e extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public gk2.e f446244d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f446245e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f446246f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.uv f446247g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public final void O6(yz5.a aVar) {
        java.lang.String str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderStartLiveMicTopicUIC", "openMicTopicWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.uv uvVar = this.f446247g;
        boolean z17 = false;
        boolean z18 = true;
        if (uvVar != null && uvVar.q()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderStartLiveMicTopicUIC", "openMicTopicWidget: isShowing");
            return;
        }
        this.f446247g = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.uv(m158354x19263085(), new qm2.b(this, aVar));
        gk2.e eVar = this.f446244d;
        if (eVar != null && ((mm2.g1) eVar.a(mm2.g1.class)).S6()) {
            gk2.e eVar2 = this.f446244d;
            if (eVar2 != null && ((mm2.g1) eVar2.a(mm2.g1.class)).B) {
                z17 = true;
            }
            z18 = z17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.uv uvVar2 = this.f446247g;
        if (uvVar2 != null) {
            gk2.e eVar3 = this.f446244d;
            if (eVar3 == null || (str = ((mm2.g1) eVar3.a(mm2.g1.class)).A) == null) {
                str = "";
            }
            uvVar2.A(str, z18);
        }
    }
}
