package sz4;

/* loaded from: classes12.dex */
public class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz4.u f495781d;

    public y(sz4.u uVar) {
        this.f495781d = uVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteOtherItemHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sz4.u uVar = this.f495781d;
        mz4.j0 j0Var = uVar.f495715d;
        if (j0Var.f414842q == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) j0Var.f414833h;
            activityC19519x7af4daf3.getClass();
            activityC19519x7af4daf3.C7(false);
            uVar.f495715d.a();
        }
        int m8183xf806b362 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) view.getTag()).m8183xf806b362();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5773x64e6b625 c5773x64e6b625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5773x64e6b625();
        mz4.d dVar = uVar.f495716e;
        if (dVar.l(m8183xf806b362) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Micromsg.NoteOtherItemHolder", "click not response, null == NoteDataManager.getMgr().get(position),position is %d,datalist size = %d", java.lang.Integer.valueOf(m8183xf806b362), java.lang.Integer.valueOf(dVar.D()));
            yj0.a.h(this, "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteOtherItemHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (((hz4.f) hz4.f.wi()).f367940d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Micromsg.NoteOtherItemHolder", "getWnNoteBase is null");
            yj0.a.h(this, "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteOtherItemHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.NoteOtherItemHolder", "click item, type is %d", java.lang.Integer.valueOf(dVar.l(m8183xf806b362).d()));
        c5773x64e6b625.f136087g.f90112b = ((iz4.o) dVar.l(m8183xf806b362)).f377664o;
        c5773x64e6b625.f136087g.f90114d = view.getContext();
        c5773x64e6b625.f136087g.f90111a = 1;
        ((hz4.f) hz4.f.wi()).f367940d.p(c5773x64e6b625);
        yj0.a.h(this, "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteOtherItemHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
