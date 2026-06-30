package u4;

/* loaded from: classes13.dex */
public class q1 implements u4.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroupOverlay f506072a;

    public q1(android.view.ViewGroup viewGroup) {
        this.f506072a = viewGroup.getOverlay();
    }

    @Override // u4.r1
    public void a(android.view.View view) {
        this.f506072a.remove(view);
    }
}
