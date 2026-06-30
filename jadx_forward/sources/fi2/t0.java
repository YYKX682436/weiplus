package fi2;

/* loaded from: classes10.dex */
public final class t0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fi2.x0 f344438d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344439e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(fi2.x0 x0Var, java.lang.String str) {
        super(0);
        this.f344438d = x0Var;
        this.f344439e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fi2.x0 x0Var = this.f344438d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x0Var.f344335b, "updateVideoWidgetCover userId:" + this.f344439e);
        com.p314xaae8f345.mm.p2776x373aa5.p2785x674500b.C22840x82866af5 c22840x82866af5 = x0Var.f344462g;
        int childCount = c22840x82866af5.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = c22840x82866af5.getChildAt(i17);
            if (childAt != null && (childAt instanceof wj2.c0)) {
                ((wj2.c0) childAt).i0();
            }
        }
        return jz5.f0.f384359a;
    }
}
