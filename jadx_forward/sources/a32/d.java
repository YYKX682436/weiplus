package a32;

/* loaded from: classes10.dex */
public final class d implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f82541d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13392x8bacb7fb f82542e;

    public d(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13392x8bacb7fb c13392x8bacb7fb) {
        this.f82541d = context;
        this.f82542e = c13392x8bacb7fb;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer$10", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        android.content.Context context = this.f82541d;
        y9.i iVar = new y9.i(context, 0);
        android.view.Window window = iVar.getWindow();
        if (window != null) {
            window.clearFlags(2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2467x5de743e6.C19569xe327f12f c19569xe327f12f = new com.p314xaae8f345.mm.p1006xc5476f33.p2467x5de743e6.C19569xe327f12f(context);
        c19569xe327f12f.m75027xa4775d6c(this.f82542e.f180176f);
        iVar.setContentView(c19569xe327f12f);
        iVar.show();
        yj0.a.i(true, this, "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer$10", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
