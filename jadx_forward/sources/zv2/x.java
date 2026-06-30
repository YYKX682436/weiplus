package zv2;

/* loaded from: classes2.dex */
public final class x implements zy2.sa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zv2.a0 f557959a;

    public x(zv2.a0 a0Var) {
        this.f557959a = a0Var;
    }

    @Override // zy2.sa
    public boolean a(long j17, long j18, java.lang.String str, java.lang.Object obj, int i17) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "FinderPostCollectionJumpInfo")) {
            zv2.a0 a0Var = this.f557959a;
            a0Var.getClass();
            if (obj instanceof org.json.JSONObject) {
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostCollectionWidget", "[postChooseCollectionAction] data:" + obj);
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
                    c19786x6a1e2862.m76527x75c48317(((org.json.JSONObject) obj).optInt("business_type"));
                    c19786x6a1e2862.m76550x2592a27b(((org.json.JSONObject) obj).optInt("jumpinfo_type"));
                    c19786x6a1e2862.m76544x4a9beb2b(((org.json.JSONObject) obj).optString("icon_url"));
                    c19786x6a1e2862.m76570xc2385d6(((org.json.JSONObject) obj).optString("wording"));
                    c19786x6a1e2862.m76560xa32537ab(((org.json.JSONObject) obj).optInt("show_position"));
                    java.util.LinkedList<r45.wf6> m76521x7528c3fb = c19786x6a1e2862.m76521x7528c3fb();
                    r45.wf6 wf6Var = new r45.wf6();
                    wf6Var.set(1, java.lang.Integer.valueOf(c19786x6a1e2862.m76513xa86cd69f()));
                    wf6Var.set(0, java.lang.Integer.valueOf(((org.json.JSONObject) obj).optInt("show_screen")));
                    m76521x7528c3fb.add(wf6Var);
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 c19801x2fd32185 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185();
                    c19801x2fd32185.m77229xd89c28a0(((org.json.JSONObject) obj).optInt("native_type"));
                    c19801x2fd32185.m77230x8be9d4f8(((org.json.JSONObject) obj).optString("native_necessary_params"));
                    c19786x6a1e2862.m76553xd896fe14(c19801x2fd32185);
                    a0Var.f557930f = c19786x6a1e2862;
                    a0Var.i(c19786x6a1e2862);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderPostCollectionWidget", "postChooseCollectionAction error: " + e17.getMessage());
                }
            }
        }
        return false;
    }
}
