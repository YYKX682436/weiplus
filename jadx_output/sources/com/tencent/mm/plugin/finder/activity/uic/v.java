package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes2.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f101957d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f101958e;

    public v(android.app.Activity activity, com.tencent.mm.plugin.finder.view.e3 e3Var) {
        this.f101957d = activity;
        this.f101958e = e3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/uic/FinderActivityParticipateUIC$showAccountBottomSheet$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.app.Activity a17 = q75.a.a(this.f101957d);
        if (a17 != null) {
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, a17, intent, 0L, null, 0, 0, false, 0, null, 384, null);
            intent.putExtra("key_create_scene", 11);
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).rj(a17, intent, com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL);
        }
        this.f101958e.h();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/uic/FinderActivityParticipateUIC$showAccountBottomSheet$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
