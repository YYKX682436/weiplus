package ba;

/* loaded from: classes13.dex */
public class a extends d3.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.chip.Chip f18637a;

    public a(com.google.android.material.chip.Chip chip) {
        this.f18637a = chip;
    }

    @Override // d3.p
    public void c(int i17) {
    }

    @Override // d3.p
    public void d(android.graphics.Typeface typeface) {
        com.google.android.material.chip.Chip chip = this.f18637a;
        chip.setText(chip.getText());
        chip.requestLayout();
        chip.invalidate();
    }
}
