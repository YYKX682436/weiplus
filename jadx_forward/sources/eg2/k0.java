package eg2;

/* loaded from: classes3.dex */
public final class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1497x5a753b7.C14215x6ef072f6 f334116d;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1497x5a753b7.C14215x6ef072f6 c14215x6ef072f6) {
        this.f334116d = c14215x6ef072f6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/cover/FinderLiveHDCheckboxView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1497x5a753b7.C14215x6ef072f6.f193179h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1497x5a753b7.C14215x6ef072f6 c14215x6ef072f6 = this.f334116d;
        c14215x6ef072f6.m56824xdd7d58e5(!c14215x6ef072f6.f193180d.isChecked());
        yz5.l lVar = c14215x6ef072f6.onCheckedChangeListener;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.valueOf(c14215x6ef072f6.f193180d.isChecked()));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/cover/FinderLiveHDCheckboxView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
