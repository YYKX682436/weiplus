package ba;

/* loaded from: classes14.dex */
public class b extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.chip.Chip f18638a;

    public b(com.google.android.material.chip.Chip chip) {
        this.f18638a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        ba.f fVar = this.f18638a.f44466e;
        if (fVar != null) {
            fVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
