package ba;

/* loaded from: classes13.dex */
public class h implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.chip.ChipGroup f18670a;

    public h(com.google.android.material.chip.ChipGroup chipGroup, ba.g gVar) {
        this.f18670a = chipGroup;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        com.google.android.material.chip.ChipGroup chipGroup = this.f18670a;
        if (chipGroup.f44485p) {
            return;
        }
        int id6 = compoundButton.getId();
        if (!z17) {
            if (chipGroup.f44484o == id6) {
                chipGroup.setCheckedId(-1);
            }
        } else {
            int i17 = chipGroup.f44484o;
            if (i17 != -1 && i17 != id6 && chipGroup.f44481i) {
                chipGroup.b(i17, false);
            }
            chipGroup.setCheckedId(id6);
        }
    }
}
