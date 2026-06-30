package ba;

/* loaded from: classes14.dex */
public class b extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.p244x11d36527.p252x2e944c.C2694x20086c f100171a;

    public b(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p252x2e944c.C2694x20086c c2694x20086c) {
        this.f100171a = c2694x20086c;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        ba.f fVar = this.f100171a.f125999e;
        if (fVar != null) {
            fVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
