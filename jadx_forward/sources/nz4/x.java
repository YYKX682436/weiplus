package nz4;

/* loaded from: classes12.dex */
public class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nz4.y f423174d;

    public x(nz4.y yVar) {
        this.f423174d = yVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NoteSelectManager", "select all");
        nz4.y yVar = this.f423174d;
        yVar.p();
        if (!nz4.y.M) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("NoteSelectManager", "select all: not init");
            yj0.a.h(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int o17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) yVar.f423197v).J1.o();
        int q17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) yVar.f423197v).J1.q();
        iz4.c l17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) yVar.f423197v).J1.l(o17);
        iz4.c l18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) yVar.f423197v).J1.l(q17);
        if (l17 == null || l18 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("NoteSelectManager", "select all: item is null");
            yVar.s();
            yj0.a.h(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (l18.d() == 1) {
            android.text.Spanned a17 = kz4.a.a(((iz4.i) l18).f377688t);
            if (a17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("NoteSelectManager", "select all: spanned is null");
                yVar.s();
                yj0.a.h(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            i17 = a17.length();
        } else {
            i17 = 1;
        }
        yVar.b();
        yVar.y(o17, 0, q17, i17);
        yVar.n();
        yVar.p();
        yVar.I(true, 300L);
        yVar.A(false);
        yVar.A.mo50297x7c4d7ca2(new nz4.q(yVar, false), 50L);
        yj0.a.h(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
