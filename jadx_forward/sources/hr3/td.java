package hr3;

/* loaded from: classes5.dex */
public final class td implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16870x8255eb46 f365560d;

    public td(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16870x8255eb46 activityC16870x8255eb46) {
        this.f365560d = activityC16870x8255eb46;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16870x8255eb46.f235340h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16870x8255eb46 activityC16870x8255eb46 = this.f365560d;
        if (activityC16870x8255eb46.W6().getVisibility() != 0) {
            hr3.pf pfVar = (hr3.pf) activityC16870x8255eb46.m80391xac8f1cfd(hr3.pf.class);
            if (!pfVar.f365432r.equals(pfVar.S6().m79028xfb85ada3().toString())) {
                activityC16870x8255eb46.W6().setVisibility(0);
            }
        }
        if (!activityC16870x8255eb46.U6().isShowAddPhotoLayout || !r26.n0.N(activityC16870x8255eb46.U6().m79028xfb85ada3())) {
            activityC16870x8255eb46.V6().setEnabled(true);
        } else {
            activityC16870x8255eb46.W6().setVisibility(8);
            activityC16870x8255eb46.V6().setEnabled(false);
        }
    }
}
