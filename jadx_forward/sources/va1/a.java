package va1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lva1/a;", "Lcom/tencent/mm/ipcinvoker/k0;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class a implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle != null ? bundle.getString("audits_instanceid") : null;
        if (bundle != null) {
            bundle.getString("audits_appid");
        }
        long j17 = bundle != null ? bundle.getLong("audits_app_start_time") : 0L;
        android.os.Bundle bundle2 = new android.os.Bundle();
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.l> list = (java.util.List) va1.b.f515763b.get(string);
        if (list != null) {
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.l lVar : list) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAuditsUtil", "event is : " + lVar);
                java.lang.String str = lVar.f168892d + "," + lVar.f168890b + "," + lVar.f168891c + "," + (lVar.f168893e - j17) + "," + (lVar.f168894f - j17) + "," + lVar.f168895g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toString(...)");
                arrayList.add(str);
            }
        }
        if (arrayList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandAuditsUtil", "get empty event from audits extra data");
        } else {
            bundle2.putStringArrayList("audits_trace_event_list", arrayList);
            va1.b.f515763b.remove(string);
        }
        return bundle2;
    }
}
