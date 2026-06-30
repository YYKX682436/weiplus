package xc2;

/* loaded from: classes2.dex */
public final class d2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f534650d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f534651e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(java.lang.ref.WeakReference weakReference, in5.s0 s0Var) {
        super(0);
        this.f534650d = weakReference;
        this.f534651e = s0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        in5.s0 s0Var = (in5.s0) this.f534650d.get();
        if (s0Var != null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var = s0Var.f374655f;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = f2Var instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) f2Var : null;
            java.lang.Object w07 = c22848x6ddd90cf != null ? c22848x6ddd90cf.w0(s0Var.m8185xcdaf1228()) : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar = w07 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe) w07 : null;
            if (qeVar != null) {
                qeVar.t(this.f534651e);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.JumperUtils", "adjust seekbar layout on highlight drawer close");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.JumperUtils", "holder is null, skip adjust seekbar layout");
        }
        return jz5.f0.f384359a;
    }
}
