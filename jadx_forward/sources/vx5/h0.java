package vx5;

/* loaded from: classes13.dex */
public class h0 extends com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vx5.i0 f522885d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(vx5.i0 i0Var, android.content.Context context) {
        super(context);
        this.f522885d = i0Var;
    }

    @Override // android.view.View
    public void onScrollChanged(int i17, int i18, int i19, int i27) {
        super.onScrollChanged(i17, i18, i19, i27);
        com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9 = this.f522885d.f522886d;
        if (c27816xac2547f9 != null) {
            c27816xac2547f9.A0(i17, i18, i19, i27);
        }
    }
}
