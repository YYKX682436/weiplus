package ox1;

/* loaded from: classes12.dex */
public class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ox1.s f431145d;

    public q(ox1.s sVar) {
        this.f431145d = sVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Editor.EditorSelectManager", "select");
        ox1.s sVar = this.f431145d;
        sVar.p();
        if (!ox1.s.K) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Editor.EditorSelectManager", "select: not init");
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (sVar.m() != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Editor.EditorSelectManager", "select: not insert");
            sVar.r();
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (nx1.d.q().l(sVar.f431170w.f431128a) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Editor.EditorSelectManager", "select: item is null");
            sVar.r();
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 i17 = sVar.i();
        if (i17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Editor.EditorSelectManager", "select: recyclerView is null");
            sVar.r();
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        ox1.d a17 = ox1.t.a(ox1.t.b(i17, sVar.f431170w.f431128a));
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Editor.EditorSelectManager", "select: rteInfo is null");
            sVar.r();
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c13158x154ec45a = a17.f431125a;
        if (c13158x154ec45a != null) {
            android.text.Editable text = c13158x154ec45a.getText();
            if (text == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Editor.EditorSelectManager", "select: text is null");
                sVar.r();
                yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (text.length() > 0) {
                c13158x154ec45a.z(sVar.f431170w.f431129b, true);
            } else {
                ix1.a l17 = nx1.d.q().l(sVar.f431170w.f431128a - 1);
                if (l17 != null && l17.b() == -3) {
                    l17 = null;
                }
                ix1.a l18 = nx1.d.q().l(sVar.f431170w.f431128a + 1);
                ix1.a aVar = (l18 == null || l18.b() != -2) ? l18 : null;
                if (l17 != null) {
                    if (l17.b() == 1) {
                        android.text.Spanned a18 = lx1.a.a(((ix1.l) l17).f376871s);
                        if (a18 == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Editor.EditorSelectManager", "select: spanned is null");
                            sVar.r();
                            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                            return;
                        }
                        sVar.v(sVar.f431170w.f431128a - 1, a18.length(), sVar.f431170w.f431128a, 0);
                    } else {
                        int i18 = sVar.f431170w.f431128a;
                        sVar.v(i18 - 1, 0, i18, 0);
                    }
                } else if (aVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Editor.EditorSelectManager", "select: no neighbor");
                    sVar.r();
                    yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                } else if (aVar.b() == 1) {
                    int i19 = sVar.f431170w.f431128a;
                    sVar.v(i19, 0, i19 + 1, 0);
                } else {
                    int i27 = sVar.f431170w.f431128a;
                    sVar.v(i27, 0, i27 + 1, 1);
                }
                sVar.b();
                sVar.A(true, true, 50L);
            }
        } else if (a17.f431126b == null || a17.f431127c == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Editor.EditorSelectManager", "select: rteInfo invalid");
            sVar.r();
        } else {
            sVar.b();
            int i28 = sVar.f431170w.f431128a;
            sVar.v(i28, 0, i28, 1);
            sVar.A(true, true, 50L);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
