package te2;

/* loaded from: classes3.dex */
public final class n0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.p1 f499774d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g8 f499775e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(te2.p1 p1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g8 g8Var) {
        super(0);
        this.f499774d = p1Var;
        this.f499775e = g8Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        te2.k0 k0Var = this.f499774d.f499823h;
        if (k0Var != null) {
            int i17 = this.f499775e.f194178c;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d7 d7Var = ((te2.q1) k0Var).f499883i;
            if (d7Var != null) {
                android.widget.SeekBar seekBar = d7Var.Z;
                if (seekBar != null) {
                    seekBar.setProgress(i17);
                }
                android.widget.TextView textView = d7Var.f199614p0;
                if (textView != null) {
                    textView.setText(java.lang.String.valueOf(i17));
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
