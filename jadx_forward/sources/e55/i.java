package e55;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le55/i;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-ai_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class i implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        i55.b bVar;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle != null) {
            java.lang.String string = bundle.getString("page_name");
            int i17 = bundle.getInt("page_hash_code");
            long j17 = bundle.getLong("event_time");
            int i18 = bundle.getInt("tab_index");
            boolean z17 = bundle.getBoolean("is_fragment");
            java.lang.String string2 = bundle.getString("page_event");
            int i19 = bundle.getInt("page_id");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedDotReporter", "other process call: pageEvent = [" + string2 + "] pageName [" + string + "] pageHash [" + i17 + "] eventTime [" + j17 + "] tabIndex [" + i18 + "] isFragment = [" + z17 + ']');
            if (string2 != null) {
                switch (string2.hashCode()) {
                    case -1411074045:
                        if (string2.equals("app_in")) {
                            e55.m mVar = e55.m.f331214a;
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 g17 = mVar.g();
                            android.os.Message mo50288x733c63a2 = mVar.g().mo50288x733c63a2();
                            mo50288x733c63a2.what = 1007;
                            mo50288x733c63a2.obj = nm5.j.d(string, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
                            g17.mo50308x2936bf5f(mo50288x733c63a2);
                            return;
                        }
                        return;
                    case -1057016867:
                        if (string2.equals("page_resume")) {
                            if (z17 && (bVar = (i55.b) i55.u.f370422a.b().get(java.lang.Integer.valueOf(i18))) != null) {
                                bVar.c(j17);
                            }
                            e55.m mVar2 = e55.m.f331214a;
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 g18 = mVar2.g();
                            android.os.Message mo50288x733c63a22 = mVar2.g().mo50288x733c63a2();
                            mo50288x733c63a22.what = 1000;
                            mo50288x733c63a22.obj = nm5.j.g(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i19), string, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i18));
                            g18.mo50308x2936bf5f(mo50288x733c63a22);
                            return;
                        }
                        return;
                    case -793616336:
                        if (string2.equals("app_out")) {
                            e55.m mVar3 = e55.m.f331214a;
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 g19 = mVar3.g();
                            android.os.Message mo50288x733c63a23 = mVar3.g().mo50288x733c63a2();
                            mo50288x733c63a23.what = 1008;
                            mo50288x733c63a23.obj = nm5.j.d(string, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
                            g19.mo50308x2936bf5f(mo50288x733c63a23);
                            return;
                        }
                        return;
                    case 1626506310:
                        if (string2.equals("page_pause")) {
                            if (z17) {
                                i55.u.f370422a.c(i18, j17);
                            }
                            e55.m mVar4 = e55.m.f331214a;
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 g27 = mVar4.g();
                            android.os.Message mo50288x733c63a24 = mVar4.g().mo50288x733c63a2();
                            mo50288x733c63a24.what = 1001;
                            mo50288x733c63a24.obj = nm5.j.g(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i19), string, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i18));
                            g27.mo50308x2936bf5f(mo50288x733c63a24);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }
    }
}
