package c23;

/* loaded from: classes8.dex */
public final class g0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f38035d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f38036e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f38035d = "";
        this.f38036e = "";
    }

    public final void T6(int i17) {
        ((s50.r0) ((u50.y) i95.n0.c(u50.y.class))).wi(this.f38035d, java.lang.String.valueOf(o13.p.f342250c), "", "", 3, this.f38036e, 0L, 4L, "", i17);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        T6(1);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onFinished() {
        T6(2);
    }
}
