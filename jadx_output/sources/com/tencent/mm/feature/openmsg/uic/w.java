package com.tencent.mm.feature.openmsg.uic;

/* loaded from: classes8.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.openmsg.uic.z f67379d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f67380e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f67381f;

    public w(com.tencent.mm.feature.openmsg.uic.z zVar, java.lang.String str, java.lang.String str2) {
        this.f67379d = zVar;
        this.f67380e = str;
        this.f67381f = str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/openmsg/uic/OpenMsgByOtherAppUIC$onCreate$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.feature.openmsg.uic.z zVar = this.f67379d;
        zh1.w0 w0Var = zVar.f67385e;
        if (w0Var != null) {
            ((di1.f) w0Var).h(3L, null, null, 0L);
        }
        jt.v vVar = (jt.v) i95.n0.c(jt.v.class);
        androidx.appcompat.app.AppCompatActivity activity = zVar.getActivity();
        java.lang.String str = this.f67380e;
        java.lang.String str2 = this.f67381f;
        ((ht.a) vVar).getClass();
        com.tencent.mm.pluginsdk.ui.tools.f.l(activity, str, null, str2, 17, -1);
        yj0.a.h(this, "com/tencent/mm/feature/openmsg/uic/OpenMsgByOtherAppUIC$onCreate$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
