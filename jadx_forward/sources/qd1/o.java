package qd1;

/* loaded from: classes7.dex */
public final class o implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k2 {

    /* renamed from: d, reason: collision with root package name */
    public final fl1.b f443200d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f443201e;

    /* renamed from: f, reason: collision with root package name */
    public int f443202f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f443203g = false;

    /* renamed from: h, reason: collision with root package name */
    public int f443204h = -1;

    public o(fl1.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, qd1.i iVar) {
        this.f443200d = bVar;
        this.f443201e = e9Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k2
    public void a(boolean z17) {
        if (z17 == this.f443203g) {
            return;
        }
        this.f443203g = z17;
        b(z17, this.f443202f);
    }

    public final void b(boolean z17, int i17) {
        fl1.b bVar = this.f443200d;
        if (!z17) {
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) bVar.mo81952xc2a54588().getLayoutParams();
            layoutParams.addRule(14);
            layoutParams.removeRule(12);
            layoutParams.addRule(13);
            layoutParams.bottomMargin = 0;
            bVar.mo81952xc2a54588().setLayoutParams(layoutParams);
            return;
        }
        if (i17 > 0) {
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) bVar.mo81952xc2a54588().getLayoutParams();
            layoutParams2.removeRule(13);
            layoutParams2.addRule(12);
            layoutParams2.addRule(14);
            int i18 = this.f443204h;
            if (i18 <= 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 V0 = this.f443201e.V0();
                if (V0 == null) {
                    i18 = this.f443204h;
                } else {
                    int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f5.a(V0)[1];
                    xi1.e mo51611xad2f8da9 = V0.mo50261xee5260a9().mo51611xad2f8da9();
                    int height = ((((i19 + i17) - V0.r1().getHeight()) - (mo51611xad2f8da9 != null ? mo51611xad2f8da9.f536234a : 0)) - bVar.mo81952xc2a54588().getHeight()) / 2;
                    this.f443204h = height;
                    if (height <= i17) {
                        this.f443204h = i17 + 12;
                    }
                    i18 = this.f443204h;
                }
            }
            layoutParams2.bottomMargin = i18;
            bVar.mo81952xc2a54588().setLayoutParams(layoutParams2);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k2
    public void d(int i17) {
        if (this.f443202f != i17 && this.f443203g) {
            b(true, i17);
        }
        this.f443202f = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k2
    /* renamed from: getHeight */
    public int mo53489x1c4fb41d() {
        return this.f443202f;
    }
}
