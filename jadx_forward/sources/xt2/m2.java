package xt2;

/* loaded from: classes3.dex */
public final class m2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f538421d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.z64 f538422e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f538423f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(xt2.e3 e3Var, r45.z64 z64Var, cm2.m0 m0Var) {
        super(0);
        this.f538421d = e3Var;
        this.f538422e = z64Var;
        this.f538423f = m0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.p1634x90ae7bab.C14986x9295a1e4 m175920x944ec71b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.p1634x90ae7bab.C14986x9295a1e4 m175920x944ec71b2;
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        xt2.e3 e3Var = this.f538421d;
        m175920x944ec71b = e3Var.m175920x944ec71b();
        m175920x944ec71b.getLocationInWindow(iArr);
        android.widget.LinearLayout linearLayout = e3Var.f538256z;
        linearLayout.getLocationInWindow(iArr2);
        float f17 = iArr2[0] - iArr[0];
        float height = (iArr2[1] - iArr[1]) + (linearLayout.getHeight() / 2.0f);
        float height2 = linearLayout.getHeight();
        float f18 = height2 < 1.0f ? 1.0f : height2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e3Var.f538239h, "subsidy shrink target leftX=" + f17 + ", centerY=" + height + ", h=" + f18);
        m175920x944ec71b2 = e3Var.m175920x944ec71b();
        r45.z64 z64Var = this.f538422e;
        cm2.m0 m0Var = this.f538423f;
        java.util.LinkedList m75941xfb821914 = m0Var.f124901v.m75941xfb821914(2);
        m175920x944ec71b2.e(z64Var, m75941xfb821914 != null ? (java.lang.String) kz5.n0.Z(m75941xfb821914) : null, f17, height, f18, new xt2.i2(e3Var), new xt2.j2(e3Var), new xt2.k2(e3Var, m0Var), new xt2.l2(e3Var, m0Var));
        return jz5.f0.f384359a;
    }
}
