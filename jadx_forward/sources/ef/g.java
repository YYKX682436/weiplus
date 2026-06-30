package ef;

/* loaded from: classes7.dex */
public final class g implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ef.m f333650d;

    public g(ef.m mVar) {
        this.f333650d = mVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k2
    public void a(boolean z17) {
        ef.m mVar = this.f333650d;
        ef.e a17 = mVar.a(null);
        if (a17 != null) {
            android.widget.EditText editText = mVar.f333660d;
            if (editText != null) {
                if (z17) {
                    a17.h(editText);
                } else {
                    a17.e(editText);
                }
            }
            a17.d(z17 ? mVar.f333663g : 0);
        }
        mVar.e(null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k2
    public void d(int i17) {
        int i18;
        ef.m mVar = this.f333650d;
        boolean z17 = (i17 == 0 || (i18 = mVar.f333663g) == 0 || i17 == i18) ? false : true;
        mVar.f333663g = i17;
        if (z17) {
            mVar.e(null);
        }
        ef.e a17 = mVar.a(null);
        if (a17 != null) {
            a17.d(i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k2
    /* renamed from: getHeight */
    public int mo53489x1c4fb41d() {
        return this.f333650d.f333663g;
    }
}
