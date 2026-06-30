package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes8.dex */
public class g3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.j3 f224369d;

    public g3(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.j3 j3Var) {
        this.f224369d = j3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        s83.c cVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallRecentRecordAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() instanceof java.lang.Integer) {
            int intValue = ((java.lang.Integer) view.getTag()).intValue();
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.j3 j3Var = this.f224369d;
            if (!t83.f.c(j3Var.f294141e)) {
                yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallRecentRecordAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            s83.l lVar = (s83.l) j3Var.f224413q.get(intValue);
            long j17 = lVar.f68172xcebea32a;
            if (j17 > 0) {
                java.util.HashMap hashMap = j3Var.f224412p;
                cVar = hashMap.containsKey(java.lang.Long.valueOf(j17)) ? (s83.c) hashMap.get(java.lang.Long.valueOf(lVar.f68172xcebea32a)) : com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.wi().J0(lVar.f68172xcebea32a);
                if (cVar != null) {
                    hashMap.put(java.lang.Long.valueOf(lVar.f68172xcebea32a), cVar);
                }
            } else {
                cVar = null;
            }
            if (cVar != null) {
                android.content.Intent intent = new android.content.Intent(j3Var.f294141e, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16150x8f474cc5.class);
                intent.putExtra("IPCallTalkUI_phoneNumber", lVar.f68176x5b3f2672);
                intent.putExtra("IPCallTalkUI_contactId", cVar.f67827x821cd056);
                intent.putExtra("IPCallTalkUI_nickname", cVar.f67829x5c31173f);
                intent.putExtra("IPCallTalkUI_toWechatUsername", cVar.f67830xf13c6c01);
                intent.putExtra("IPCallTalkUI_dialScene", 3);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12059, 0, 0, 0, 0, 3);
                ((p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) j3Var.f294141e).startActivityForResult(intent, 1001);
            } else {
                android.content.Intent intent2 = new android.content.Intent(j3Var.f294141e, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16150x8f474cc5.class);
                intent2.putExtra("IPCallTalkUI_phoneNumber", lVar.f68176x5b3f2672);
                intent2.putExtra("IPCallTalkUI_dialScene", 3);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12059, 0, 0, 0, 0, 3);
                ((p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) j3Var.f294141e).startActivityForResult(intent2, 1001);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallRecentRecordAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
