package com.p314xaae8f345.mm.p2829xfa87f9de;

/* loaded from: classes13.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f296380d;

    public k(java.lang.String str) {
        this.f296380d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/xwebutil/XWebAudioPlayerLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XFilesAudioPlayerLogic", "playBtn pause or start error: " + th6.getMessage());
            com.p314xaae8f345.mm.p2829xfa87f9de.q.d("playBtn pause or start error ", th6);
        }
        if (!com.p314xaae8f345.mm.p2829xfa87f9de.q.b(this.f296380d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XFilesAudioPlayerLogic", "playBtn onClick, sCurrentParams invalid");
            yj0.a.h(this, "com/tencent/mm/xwebutil/XWebAudioPlayerLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = com.p314xaae8f345.mm.p2829xfa87f9de.q.f296401a.f296410h;
        if (interfaceC26164x73fc6bc6 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XFilesAudioPlayerLogic", "playBtn onClick, tpPlayer invalid");
            yj0.a.h(this, "com/tencent/mm/xwebutil/XWebAudioPlayerLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (interfaceC26164x73fc6bc6.mo100916xb7d72d0e() == 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XFilesAudioPlayerLogic", "playBtn onClick, try pause");
            interfaceC26164x73fc6bc6.mo100930x65825f6();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XFilesAudioPlayerLogic", "playBtn onClick, try start");
            com.p314xaae8f345.mm.p2829xfa87f9de.r rVar = com.p314xaae8f345.mm.p2829xfa87f9de.q.f296401a;
            com.p314xaae8f345.mm.p2829xfa87f9de.q.e(interfaceC26164x73fc6bc6, rVar.f296406d, rVar.f296407e, rVar.f296411i, rVar.f296409g, -1);
        }
        yj0.a.h(this, "com/tencent/mm/xwebutil/XWebAudioPlayerLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
