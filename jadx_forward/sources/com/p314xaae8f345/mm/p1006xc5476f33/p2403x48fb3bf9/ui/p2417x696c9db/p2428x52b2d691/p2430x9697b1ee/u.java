package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/u;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/GetGamelifeConversationData;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes8.dex */
final class u implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.database.Cursor mo78085xb5882a6b = ((t53.m0) i95.n0.c(t53.m0.class)).Ui().mo78085xb5882a6b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        mo78085xb5882a6b.moveToFirst();
        while (!mo78085xb5882a6b.isAfterLast()) {
            z53.i iVar = new z53.i();
            iVar.mo9015xbf5d97fd(mo78085xb5882a6b);
            java.lang.String field_sessionId = iVar.f67669xbed8694c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId, "field_sessionId");
            int i17 = iVar.f67671xa35b5abb;
            int i18 = (int) (iVar.f67672xa783a79b / 1000);
            java.lang.String field_editingMsg = iVar.f67666x51f5672e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_editingMsg, "field_editingMsg");
            java.lang.String field_selfUserName = iVar.f67668x5568d387;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_selfUserName, "field_selfUserName");
            java.lang.String field_talker = iVar.f67670x114ef53e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_talker, "field_talker");
            java.lang.String field_digest = iVar.f67663xf66fcca9;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_digest, "field_digest");
            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19466x3fbac4fb(field_sessionId, i17, i18, field_editingMsg, 0, field_selfUserName, field_talker, field_digest));
            mo78085xb5882a6b.moveToNext();
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19466x3fbac4fb) it.next()).f267669d);
        }
        if (!arrayList2.isEmpty()) {
            new w53.b(new java.util.LinkedList(arrayList2)).l().H(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.t(arrayList, rVar));
        } else if (rVar != null) {
            rVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19469xc5d71a31(null, "no conversation", true));
        }
    }
}
