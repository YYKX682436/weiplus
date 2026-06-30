package ju3;

/* loaded from: classes10.dex */
public final class v1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f383560d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17025x1dde6f4e f383561e;

    public v1(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17025x1dde6f4e c17025x1dde6f4e) {
        this.f383560d = context;
        this.f383561e = c17025x1dde6f4e;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/parent/RecordPluginLayout$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f383560d;
        y9.i iVar = new y9.i(context, 0);
        android.view.Window window = iVar.getWindow();
        if (window != null) {
            window.clearFlags(2);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17026x3754ba3c c17026x3754ba3c = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17026x3754ba3c(context, null);
        c17026x3754ba3c.m68035xa4775d6c(this.f383561e.getPreviewPlugin());
        iVar.setContentView(c17026x3754ba3c);
        iVar.show();
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/parent/RecordPluginLayout$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
