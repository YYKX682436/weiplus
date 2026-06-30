package a32;

/* loaded from: classes8.dex */
public final class q0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13395xf82efecd f82571d;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13395xf82efecd c13395xf82efecd) {
        this.f82571d = c13395xf82efecd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emojicapture/ui/capture/MoreStickerView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.a closeCallback = this.f82571d.getCloseCallback();
        if (closeCallback != null) {
            closeCallback.mo152xb9724478();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emojicapture/ui/capture/MoreStickerView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
