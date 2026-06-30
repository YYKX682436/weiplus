package zv2;

/* loaded from: classes2.dex */
public final class m0 implements zy2.sa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zv2.p0 f557954a;

    public m0(zv2.p0 p0Var) {
        this.f557954a = p0Var;
    }

    @Override // zy2.sa
    public boolean a(long j17, long j18, java.lang.String str, java.lang.Object obj, int i17) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "FinderPostWeComJumpInfo")) {
            zv2.p0 p0Var = this.f557954a;
            p0Var.getClass();
            if (obj instanceof org.json.JSONObject) {
                try {
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderWeComWidget", "[weComDidSelect] data:" + obj);
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
                    c19786x6a1e2862.m76544x4a9beb2b(((org.json.JSONObject) obj).optString("icon_url"));
                    c19786x6a1e2862.m76570xc2385d6(((org.json.JSONObject) obj).optString("wording"));
                    c19786x6a1e2862.m76560xa32537ab(((org.json.JSONObject) obj).optInt("position"));
                    c19786x6a1e2862.m76527x75c48317(((org.json.JSONObject) obj).optInt("business_type"));
                    c19786x6a1e2862.m76550x2592a27b(((org.json.JSONObject) obj).optInt("jump_type"));
                    java.util.LinkedList<r45.wf6> m76521x7528c3fb = c19786x6a1e2862.m76521x7528c3fb();
                    r45.wf6 wf6Var = new r45.wf6();
                    wf6Var.set(1, java.lang.Integer.valueOf(c19786x6a1e2862.m76513xa86cd69f()));
                    wf6Var.set(0, java.lang.Integer.valueOf(((org.json.JSONObject) obj).optInt("screen_type")));
                    m76521x7528c3fb.add(wf6Var);
                    c19786x6a1e2862.m76536x9b35e8e(((org.json.JSONObject) obj).optString("ext_info"));
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 c19801x2fd32185 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185();
                    c19801x2fd32185.m77229xd89c28a0(((org.json.JSONObject) obj).optInt("native_type"));
                    c19801x2fd32185.m77230x8be9d4f8(((org.json.JSONObject) obj).optString("native_necessaryParams"));
                    c19786x6a1e2862.m76553xd896fe14(c19801x2fd32185);
                    p0Var.f557930f = c19786x6a1e2862;
                    p0Var.i(c19786x6a1e2862);
                    p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
                } catch (java.lang.Throwable th6) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                }
            }
        }
        return false;
    }
}
