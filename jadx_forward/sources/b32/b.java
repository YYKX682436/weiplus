package b32;

/* loaded from: classes10.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13397xbda8fd8e f99161d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13397xbda8fd8e c13397xbda8fd8e) {
        this.f99161d = c13397xbda8fd8e;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13397xbda8fd8e c13397xbda8fd8e = this.f99161d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141 c13384x547d8141 = c13397xbda8fd8e.f180228f;
        if (c13384x547d8141 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("reporter");
            throw null;
        }
        long j17 = c13384x547d8141.f180116d;
        if (c13384x547d8141 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("reporter");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141.b(11, j17, 0L, 0L, 0L, 0L, 0L, 0, 0, c13384x547d8141.G);
        android.view.View view2 = c13397xbda8fd8e.f180235p;
        r22.c presenter = c13397xbda8fd8e.getPresenter();
        boolean z17 = false;
        if (presenter != null) {
            w22.v vVar = (w22.v) presenter;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorPresenter", "speedUp " + vVar.f524122j);
            r22.d dVar = vVar.f524114b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.C13390xb12545d7 f180230h = dVar.getF180230h();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.a(f180230h != null ? java.lang.Float.valueOf(f180230h.m54880xebd4cfaa()) : null, 1.0f)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.C13390xb12545d7 f180230h2 = dVar.getF180230h();
                if (f180230h2 != null) {
                    f180230h2.m54883xe68d30b6(2.0f);
                }
                vVar.f524122j = true;
                z17 = true;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.C13390xb12545d7 f180230h3 = dVar.getF180230h();
                if (f180230h3 != null) {
                    f180230h3.m54883xe68d30b6(1.0f);
                }
                vVar.f524122j = false;
            }
        }
        view2.setSelected(z17);
        c13397xbda8fd8e.f180238s.setImageDrawable(c13397xbda8fd8e.f180235p.isSelected() ? c13397xbda8fd8e.f180243x : c13397xbda8fd8e.f180244y);
        yj0.a.h(this, "com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
