package iw3;

/* loaded from: classes8.dex */
public final class e extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final iw3.e f376769d = new iw3.e();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        int hashCode = env.f422393a.hashCode();
        java.lang.String str = (java.lang.String) msg.f422323a.get("content");
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = (java.lang.String) msg.f422323a.get("selectedStartIndex");
        if (str2 == null) {
            str2 = "0";
        }
        java.lang.String str3 = (java.lang.String) msg.f422323a.get("selectedEndIndex");
        java.lang.String str4 = str3 != null ? str3 : "0";
        int parseInt = java.lang.Integer.parseInt(str2);
        int parseInt2 = java.lang.Integer.parseInt(str4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSelectedTextChanged", "JsApi-Call: key:" + hashCode + " select content:" + str + ", selectedStartIndex:" + str2 + ", selectedEndIndex:" + str4);
        uc0.v vVar = (uc0.v) ((java.util.concurrent.ConcurrentHashMap) hw3.a.f367116a).get(java.lang.Integer.valueOf(hashCode));
        if (vVar != null) {
            vVar.f507818e = str;
            vVar.f507819f = parseInt;
            vVar.f507820g = parseInt2;
            android.widget.Button button = vVar.f507823j;
            if (button != null) {
                button.setEnabled(!android.text.TextUtils.isEmpty(str));
            }
            uc0.m mVar = vVar.f507825l;
            if (mVar != null) {
                zv2.m mVar2 = ((zv2.d) mVar).f557933a;
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = mVar2.f557930f;
                if (c19786x6a1e2862 != null) {
                    c19786x6a1e2862.m76570xc2385d6(str);
                }
                zv2.m.m(mVar2);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622 = mVar2.f557930f;
                if (c19786x6a1e28622 != null) {
                    c19786x6a1e28622.m76570xc2385d6(mVar2.f557945h);
                }
            }
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54055x82c2d261;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "selectedTextChanged";
    }
}
