package sc2;

/* loaded from: classes2.dex */
public final class k8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f487559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f487560e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sc2.p8 f487561f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(java.util.ArrayList arrayList, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25, sc2.p8 p8Var) {
        super(1);
        this.f487559d = arrayList;
        this.f487560e = c22849x81a93d25;
        this.f487561f = p8Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.util.Iterator it = this.f487559d.iterator();
        while (it.hasNext()) {
            ((sc2.v8) it.next()).f487851e = intValue;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = this.f487560e.mo7946xf939df19();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
        if (c22848x6ddd90cf != null) {
            c22848x6ddd90cf.m8146xced61ae5();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f487561f.f487685w, "onBindView: getImageColor=" + intValue);
        return jz5.f0.f384359a;
    }
}
