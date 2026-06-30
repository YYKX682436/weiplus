package a32;

/* loaded from: classes10.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13392x8bacb7fb f82556d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f82557e;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13392x8bacb7fb c13392x8bacb7fb, android.content.Context context) {
        this.f82556d = c13392x8bacb7fb;
        this.f82557e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.v75 v75Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13392x8bacb7fb c13392x8bacb7fb = this.f82556d;
        r45.p64 p64Var = c13392x8bacb7fb.f180189v;
        if (p64Var != null && (v75Var = p64Var.f464328g) != null) {
            qk.w wVar = new qk.w(v75Var);
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6 p6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6.class);
            if (p6Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(c13392x8bacb7fb.f180174d, "unable to get emoticon liteapp feature service");
            } else {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f4) p6Var).wi(this.f82557e, wVar);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
