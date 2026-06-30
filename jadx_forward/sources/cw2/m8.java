package cw2;

/* loaded from: classes2.dex */
public final class m8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15183xcf23ff21 f305404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f f305405e;

    public m8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15183xcf23ff21 c15183xcf23ff21, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f) {
        this.f305404d = c15183xcf23ff21;
        this.f305405e = c15196x85976f5f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        cw2.h8 playInfo;
        ec2.g m61491xe16f3d0b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/video/FinderVideoLayout$initLongVideoSeekBar$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15183xcf23ff21 c15183xcf23ff21 = this.f305404d;
        boolean z17 = c15183xcf23ff21.f272979z;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.f305405e;
        c15196x85976f5f.b0(!z17);
        c15183xcf23ff21.mo61296x11f3be80(!z17);
        if (z17 && (playInfo = c15196x85976f5f.getPlayInfo()) != null && (m61491xe16f3d0b = c15196x85976f5f.m61491xe16f3d0b()) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88 = playInfo.f305278a;
            long m59124x87980ca = c14989xf862ae88.m59124x87980ca();
            java.lang.String dupFlag = c14989xf862ae88.getDupFlag();
            mn2.g4 g4Var = playInfo.f305280c;
            ((ec2.h) m61491xe16f3d0b).e(m59124x87980ca, dupFlag, g4Var.f411535e, g4Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/video/FinderVideoLayout$initLongVideoSeekBar$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
