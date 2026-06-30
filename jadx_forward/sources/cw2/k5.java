package cw2;

/* loaded from: classes3.dex */
public final class k5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15186x26928e14 f305337d;

    public k5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15186x26928e14 c15186x26928e14) {
        this.f305337d = c15186x26928e14;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/video/FinderRecordPluginLayout$updateRecordTipByAudioPermission$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15186x26928e14 c15186x26928e14 = this.f305337d;
        c15186x26928e14.H = true;
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = c15186x26928e14.getContext();
        ((sb0.f) jVar).getClass();
        j35.u.g(context);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/video/FinderRecordPluginLayout$updateRecordTipByAudioPermission$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
