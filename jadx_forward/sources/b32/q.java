package b32;

/* loaded from: classes10.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13398x3b5ffc2f f99180d;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13398x3b5ffc2f c13398x3b5ffc2f) {
        this.f99180d = c13398x3b5ffc2f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13398x3b5ffc2f c13398x3b5ffc2f = this.f99180d;
        android.text.Editable text = c13398x3b5ffc2f.f180248q.getText();
        b32.u callback = c13398x3b5ffc2f.getCallback();
        if (callback != null) {
            int i17 = c13398x3b5ffc2f.f180251t;
            b32.g gVar = (b32.g) callback;
            java.lang.String obj = text != null ? text.toString() : null;
            if (obj != null && obj.length() > 50) {
                obj = obj.substring(0, 50);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "substring(...)");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13397xbda8fd8e c13397xbda8fd8e = gVar.f99170a;
            r22.c presenter = c13397xbda8fd8e.getPresenter();
            if (presenter != null) {
                ((w22.v) presenter).j(obj, i17, true);
            }
            c13397xbda8fd8e.f180232m.m54941x76500a7f(false);
        }
        c13398x3b5ffc2f.f180248q.clearFocus();
        if (c13398x3b5ffc2f.getTextChanged()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141.b(16, c13398x3b5ffc2f.m54936x62662257().f180116d, 0L, 0L, 0L, 0L, 0L, 0, 0, c13398x3b5ffc2f.m54936x62662257().G);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141.b(15, c13398x3b5ffc2f.m54936x62662257().f180116d, 0L, 0L, 0L, 0L, 0L, 0, 0, c13398x3b5ffc2f.m54936x62662257().G);
        yj0.a.h(this, "com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
