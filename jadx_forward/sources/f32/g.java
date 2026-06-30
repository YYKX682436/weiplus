package f32;

/* loaded from: classes10.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1384xed08e3c8.C13407x91e79130 f340826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y9.i f340827e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1384xed08e3c8.C13407x91e79130 c13407x91e79130, y9.i iVar) {
        super(1);
        this.f340826d = c13407x91e79130;
        this.f340827e = iVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1384xed08e3c8.C13407x91e79130 c13407x91e79130 = this.f340826d;
        android.view.ViewGroup.LayoutParams layoutParams = c13407x91e79130.f180326w.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams2 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams;
        android.view.ViewGroup.LayoutParams layoutParams3 = c13407x91e79130.C.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams4 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams3;
        android.graphics.Rect rect = c13407x91e79130.H;
        if (intValue == 0) {
            int i17 = c13407x91e79130.F;
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).width = i17;
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).height = i17;
            int i18 = c13407x91e79130.G;
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin = i18;
            int width = (c13407x91e79130.getWidth() - i17) / 2;
            rect.set(width, i18, width + i17, i17 + i18);
            layoutParams4.f92432k = 0;
            layoutParams4.f92428i = -1;
        } else if (intValue == 1) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).width = -1;
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).height = -1;
            if (c13407x91e79130.getWidth() * 16 > c13407x91e79130.getHeight() * 9) {
                int width2 = (c13407x91e79130.getWidth() - ((c13407x91e79130.getHeight() * 9) / 16)) / 2;
                rect.set(width2, 0, c13407x91e79130.getWidth() - width2, c13407x91e79130.getHeight());
            } else {
                int height = (c13407x91e79130.getHeight() - ((c13407x91e79130.getWidth() * 16) / 9)) / 2;
                rect.set(0, height, c13407x91e79130.getWidth(), c13407x91e79130.getHeight() - height);
            }
            layoutParams4.f92432k = -1;
            layoutParams4.f92428i = com.p314xaae8f345.mm.R.id.nj8;
        } else if (intValue == 2) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).width = -1;
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).height = -1;
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin = 0;
            rect.set(0, 0, c13407x91e79130.getWidth(), c13407x91e79130.getHeight());
            layoutParams4.f92432k = -1;
            layoutParams4.f92428i = com.p314xaae8f345.mm.R.id.nj8;
        }
        c13407x91e79130.f180327x.l(new f32.f(c13407x91e79130, intValue));
        this.f340827e.dismiss();
        return jz5.f0.f384359a;
    }
}
