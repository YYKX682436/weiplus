package bo0;

/* loaded from: classes13.dex */
public class c implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p830xd1075a44.C10839x2f31b3d1 f104505a;

    public c(com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p830xd1075a44.C10839x2f31b3d1 c10839x2f31b3d1, bo0.a aVar) {
        this.f104505a = c10839x2f31b3d1;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        android.view.View findViewById;
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p830xd1075a44.C10839x2f31b3d1 c10839x2f31b3d1 = this.f104505a;
        if (c10839x2f31b3d1.f150102f) {
            return;
        }
        c10839x2f31b3d1.f150102f = true;
        int i17 = c10839x2f31b3d1.f150100d;
        if (i17 != -1 && (findViewById = c10839x2f31b3d1.findViewById(i17)) != null && (findViewById instanceof android.widget.RadioButton)) {
            ((android.widget.RadioButton) findViewById).setChecked(false);
        }
        c10839x2f31b3d1.f150102f = false;
        c10839x2f31b3d1.m46505x738abce0(compoundButton.getId());
    }
}
