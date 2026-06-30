package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1745xadfe2b3.ui;

/* loaded from: classes8.dex */
public abstract class d extends com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1745xadfe2b3.ui.e {
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19265x23988ddd A;
    public m02.u B;
    public android.view.View C;
    public android.view.View D;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f221350y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19258xc2f2ab2b f221351z;

    public d(android.content.Context context, android.os.Bundle bundle) {
        super(context);
        if (!(bundle.getInt("share_report_from_scene", -1) >= 0)) {
            m64564x9c8c0d33(com.p314xaae8f345.mm.R.raw.f78357x4cad4fd4);
        }
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bgv, (android.view.ViewGroup) this.f221353e, false);
        this.C = inflate;
        this.D = inflate.findViewById(com.p314xaae8f345.mm.R.id.piw);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1745xadfe2b3.ui.e
    /* renamed from: getMenuHelp */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.y mo64557x57d7ceb6() {
        if (this.f221361p == null) {
            this.f221361p = new a53.a();
        }
        return this.f221361p;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1745xadfe2b3.ui.e, android.view.View
    public void setAlpha(float f17) {
        super.setAlpha(f17);
        if (f17 == 0.0f) {
            f17 = 1.0f;
        }
        if (f17 < 0.0f || f17 > 1.0f) {
            return;
        }
        int i17 = (int) (f17 * 255.0f);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19258xc2f2ab2b c19258xc2f2ab2b = this.f221351z;
        if (c19258xc2f2ab2b != null) {
            c19258xc2f2ab2b.setImageAlpha(i17);
        }
    }
}
