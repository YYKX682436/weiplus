package com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/ui/feature/api/screenshot/n1;", "Lcom/tencent/mm/ipcinvoker/i;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class n1 implements com.p314xaae8f345.mm.p794xb0fa9b5e.i<android.os.Bundle, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c> {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        java.lang.String string;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle == null || (string = bundle.getString("image_path")) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ShareToBizTask", "imagePath is null");
            if (rVar != null) {
                rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(false));
                return;
            }
            return;
        }
        java.lang.String string2 = bundle.getString("json_params");
        if (string2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ShareToBizTask", "jsonParams is null");
            if (rVar != null) {
                rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(false));
                return;
            }
            return;
        }
        tk.q qVar = (tk.q) i95.n0.c(tk.q.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        ((ox.o) qVar).Di(context, new org.json.JSONObject(string2), kz5.b0.c(new com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23531x767fe49d(string, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65534, null)), new com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.m1(rVar));
    }
}
