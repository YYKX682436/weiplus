package m34;

/* loaded from: classes4.dex */
public class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17691x8fb37d74 f404912d;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17691x8fb37d74 c17691x8fb37d74) {
        this.f404912d = c17691x8fb37d74;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sight/decode/ui/VideoPlayView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17691x8fb37d74 c17691x8fb37d74 = this.f404912d;
        c17691x8fb37d74.f244052s.mo50300x3fa464aa(c17691x8fb37d74.F);
        c17691x8fb37d74.f244052s.mo50297x7c4d7ca2(c17691x8fb37d74.F, 3000L);
        if (c17691x8fb37d74.f244046m.mo69311xc00617a4()) {
            c17691x8fb37d74.f(-1);
            m34.d dVar = c17691x8fb37d74.f244047n;
            if (dVar != null) {
                dVar.mo61296x11f3be80(false);
            }
        } else {
            c17691x8fb37d74.h(false);
            c17691x8fb37d74.f244046m.b(c17691x8fb37d74.f244048o);
            m34.d dVar2 = c17691x8fb37d74.f244047n;
            if (dVar2 != null) {
                dVar2.mo61296x11f3be80(true);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
