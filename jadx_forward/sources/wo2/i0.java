package wo2;

/* loaded from: classes2.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f529611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wo2.m0 f529612e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(java.lang.String str, wo2.m0 m0Var) {
        super(0);
        this.f529611d = str;
        this.f529612e = m0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        wo2.q qVar;
        oa.i k17;
        java.lang.String str = this.f529611d;
        if (!android.text.TextUtils.isEmpty(str)) {
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff R6 = this.f529612e.R6();
            if (R6 == null || (k17 = R6.k(1)) == null) {
                qVar = null;
            } else {
                java.lang.Object obj = k17.f425311a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.NearbyActionBarUIC.NearbyTab");
                qVar = (wo2.q) obj;
            }
            android.widget.TextView textView = qVar != null ? qVar.f529650c : null;
            if (textView != null) {
                textView.setText(str);
            }
        }
        return jz5.f0.f384359a;
    }
}
