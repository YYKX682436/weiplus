package ox1;

/* loaded from: classes12.dex */
public class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ox1.s f431146d;

    public r(ox1.s sVar) {
        this.f431146d = sVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Editor.EditorSelectManager", "select all");
        ox1.s sVar = this.f431146d;
        sVar.p();
        if (!ox1.s.K) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Editor.EditorSelectManager", "select all: not init");
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int n17 = nx1.d.q().n();
        int p17 = nx1.d.q().p();
        ix1.a l17 = nx1.d.q().l(n17);
        ix1.a l18 = nx1.d.q().l(p17);
        if (l17 == null || l18 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Editor.EditorSelectManager", "select all: item is null");
            sVar.r();
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (l18.b() == 1) {
            android.text.Spanned a17 = lx1.a.a(((ix1.l) l18).f376871s);
            if (a17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Editor.EditorSelectManager", "select all: spanned is null");
                sVar.r();
                yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            i17 = a17.length();
        } else {
            i17 = 1;
        }
        sVar.b();
        sVar.v(n17, 0, p17, i17);
        sVar.n();
        sVar.p();
        sVar.E(true, 300L);
        sVar.x(false);
        sVar.A.mo50297x7c4d7ca2(new ox1.k(sVar, false), 50L);
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
