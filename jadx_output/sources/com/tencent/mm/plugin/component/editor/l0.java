package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class l0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent f96586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96587e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f96588f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f96589g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.EditorImageUI f96590h;

    public l0(com.tencent.mm.plugin.component.editor.EditorImageUI editorImageUI, com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent, java.lang.String str, int i17, int i18) {
        this.f96590h = editorImageUI;
        this.f96586d = recogQBarOfImageFileResultEvent;
        this.f96587e = str;
        this.f96588f = i17;
        this.f96589g = i18;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/EditorImageUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.Editor.EditorImageUI", "request deal QBAR string");
        com.tencent.mm.plugin.component.editor.EditorImageUI editorImageUI = this.f96590h;
        if (editorImageUI.f96485n.i()) {
            editorImageUI.f96485n.u();
        }
        com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent = this.f96586d;
        if (recogQBarOfImageFileResultEvent == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/EditorImageUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.autogen.events.DealQBarStrEvent dealQBarStrEvent = new com.tencent.mm.autogen.events.DealQBarStrEvent();
        am.r3 r3Var = dealQBarStrEvent.f54079g;
        r3Var.f7781b = editorImageUI;
        r3Var.f7780a = this.f96587e;
        r3Var.f7782c = this.f96588f;
        r3Var.f7784e = 8;
        int selectedItemPosition = editorImageUI.f96480f.getSelectedItemPosition();
        if (-1 == selectedItemPosition) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Editor.EditorImageUI", "error position");
        } else {
            r45.gp0 gp0Var = ((ix1.c) editorImageUI.f96481g.getItem(selectedItemPosition)).f295324m;
            if (gp0Var != null) {
                r3Var.f7789j = gp0Var.f375434s;
                r3Var.f7790k = gp0Var.f375438u;
            }
        }
        r3Var.f7783d = this.f96589g;
        r3Var.f7792m = recogQBarOfImageFileResultEvent.f54661g.f6368a;
        r3Var.f7794o = true;
        r3Var.f7796q = com.tencent.mm.pluginsdk.ui.tools.s6.b(recogQBarOfImageFileResultEvent);
        if (editorImageUI.getIntent() != null) {
            r3Var.f7791l = editorImageUI.getIntent().getBundleExtra("_stat_obj");
        }
        dealQBarStrEvent.e();
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/EditorImageUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
