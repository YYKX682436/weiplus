package dk2;

/* loaded from: classes3.dex */
public final class j5 extends dk2.t4 {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f315172b;

    /* renamed from: c, reason: collision with root package name */
    public r45.yh1 f315173c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f315174d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(r45.ch1 msg) {
        super(msg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        this.f315172b = "FinderLiveComboRewardMsg";
    }

    @Override // dk2.zf
    public java.lang.Object D() {
        if (mo124533xfb85f7b0() != 20013) {
            return null;
        }
        if (!this.f315174d) {
            r45.yh1 yh1Var = new r45.yh1();
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = this.f315634a.m75934xbce7f2f(4);
            yh1Var.mo11468x92b714fd(m75934xbce7f2f != null ? m75934xbce7f2f.g() : null);
            return yh1Var;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderLiveComboRewardMsg is selfSend getPayLoadContent:");
        java.lang.Object obj = this.f315173c;
        if (obj == null) {
            obj = "";
        }
        sb6.append(pm0.b0.g(obj));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f315172b, sb6.toString());
        return this.f315173c;
    }
}
