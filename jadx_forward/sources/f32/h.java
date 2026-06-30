package f32;

/* loaded from: classes5.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f340828d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1384xed08e3c8.C13407x91e79130 f340829e;

    public h(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1384xed08e3c8.C13407x91e79130 c13407x91e79130) {
        this.f340828d = context;
        this.f340829e = c13407x91e79130;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emojicapture/ui/preview/StickerPreviewView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f340828d;
        y9.i iVar = new y9.i(context, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1384xed08e3c8.C13406x1f846bbe c13406x1f846bbe = new com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1384xed08e3c8.C13406x1f846bbe(context, null);
        c13406x1f846bbe.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f77973xd16c52d4);
        c13406x1f846bbe.m54966x382dfddf(new f32.g(this.f340829e, iVar));
        iVar.setContentView(c13406x1f846bbe);
        iVar.show();
        yj0.a.h(this, "com/tencent/mm/plugin/emojicapture/ui/preview/StickerPreviewView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
