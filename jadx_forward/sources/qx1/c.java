package qx1;

/* loaded from: classes10.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mx1.a f448813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qx1.q f448814e;

    public c(qx1.q qVar, mx1.a aVar) {
        this.f448814e = qVar;
        this.f448813d = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        nx1.d.q().z(-1, false, true);
        boolean b17 = fp.i.b();
        qx1.q qVar = this.f448814e;
        if (!b17) {
            db5.t7.k(qVar.f448841b.getContext(), null);
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_title", qVar.f448841b.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cbw));
        intent.putExtra("key_media_type", 2);
        intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1);
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ni(d85.g0.STORAGE, new qx1.b(this, intent))) {
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        j45.l.v(qVar.f448841b.getContext(), "com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI", intent, 4099);
        this.f448813d.q0(65536L);
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
