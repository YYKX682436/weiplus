package al5;

/* loaded from: classes15.dex */
public class l3 implements com.tencent.mm.ui.tools.k5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ al5.m3 f5946a;

    public l3(al5.m3 m3Var) {
        this.f5946a = m3Var;
    }

    @Override // com.tencent.mm.ui.tools.k5
    public void a() {
        onAnimationEnd();
    }

    @Override // com.tencent.mm.ui.tools.k5
    public void b() {
    }

    @Override // com.tencent.mm.ui.tools.k5
    public void onAnimationEnd() {
        this.f5946a.f5955e.f5968d.f211440u = true;
        com.tencent.mm.sdk.platformtools.u3.h(new al5.k3(this));
    }

    @Override // com.tencent.mm.ui.tools.k5
    public void onAnimationStart() {
    }
}
