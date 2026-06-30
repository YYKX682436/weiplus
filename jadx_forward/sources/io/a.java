package io;

/* loaded from: classes8.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f374697d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v05.b f374698e;

    public a(java.lang.String str, v05.b bVar) {
        this.f374697d = str;
        this.f374698e = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatting/viewfactory/ChattingAppBrandNativeView$onUpdateViewModel$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
        java.lang.String str2 = this.f374697d;
        am.nx nxVar = c6113xa3727625.f136390g;
        nxVar.f88999a = str2;
        v05.b bVar = this.f374698e;
        s05.d dVar = (s05.d) bVar.m75936x14adae67(bVar.f513848e + 39);
        if (dVar == null || (str = dVar.p()) == null) {
            str = "";
        }
        nxVar.f89000b = str;
        c6113xa3727625.e();
        yj0.a.h(this, "com/tencent/mm/chatting/viewfactory/ChattingAppBrandNativeView$onUpdateViewModel$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
