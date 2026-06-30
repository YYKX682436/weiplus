package ju3;

/* loaded from: classes10.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17012x9e3c2e f383542d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17012x9e3c2e c17012x9e3c2e) {
        this.f383542d = c17012x9e3c2e;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/parent/CameraKitPluginLayout$updateRecordTipByAudioPermission$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraKitPluginLayout", "updateRecordTipByAudioPermission: recordPlugin click event invoke");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17012x9e3c2e c17012x9e3c2e = this.f383542d;
        c17012x9e3c2e.m68022x9562f79f(true);
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = c17012x9e3c2e.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        ((sb0.f) jVar).getClass();
        j35.u.g((android.app.Activity) context);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/parent/CameraKitPluginLayout$updateRecordTipByAudioPermission$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
