package zs4;

/* loaded from: classes9.dex */
public class g implements com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.a4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f556821a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f556822b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f556823c;

    public g(zs4.q qVar, int i17, java.lang.String str, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        this.f556821a = i17;
        this.f556822b = str;
        this.f556823c = abstractActivityC21394xb3d2c0cf;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.a4
    /* renamed from: onClick */
    public void mo73850xaf6b9ae9(android.view.View view) {
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.r0(3, 1, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1(), this.f556821a);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f556822b);
        intent.putExtra("showShare", false);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(this.f556823c, intent);
    }
}
