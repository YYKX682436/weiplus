package kc2;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final int f387859e;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f387860a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f387861b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f387862c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f387863d;

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0 aj0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.f207973a;
        f387859e = ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f209965a, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a, "发现页红点AI模型行为序列阈值", e42.c0.clicfg_finder_reddot_mode_action_seq_threshold, 10, false, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.zg0.f209987d, 8, null)).intValue();
    }

    public c(java.util.ArrayList actionInfoSeq) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionInfoSeq, "actionInfoSeq");
        this.f387860a = actionInfoSeq;
        this.f387861b = "FinderKaraInfoManager.ActionSeq";
        this.f387862c = jz5.h.b(kc2.b.f387856d);
    }

    public final void a(kc2.a actionInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionInfo, "actionInfo");
        synchronized (this.f387860a) {
            this.f387860a.add(actionInfo);
            int size = this.f387860a.size();
            int i17 = f387859e;
            if (size > i17) {
                int size2 = this.f387860a.size() - i17;
                if (((java.lang.Boolean) ((jz5.n) this.f387862c).mo141623x754a37bb()).booleanValue()) {
                    java.lang.String str = this.f387861b;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append("before drop action seq=");
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    java.util.Iterator it = this.f387860a.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(((kc2.a) it.next()).a());
                    }
                    sb6.append(kc2.l1.d(jSONArray));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, sb6.toString());
                }
                for (int i18 = 0; i18 < size2; i18++) {
                    this.f387860a.remove(i18);
                }
                if (((java.lang.Boolean) ((jz5.n) this.f387862c).mo141623x754a37bb()).booleanValue()) {
                    java.lang.String str2 = this.f387861b;
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append("after drop action seq=");
                    org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                    java.util.Iterator it6 = this.f387860a.iterator();
                    while (it6.hasNext()) {
                        jSONArray2.put(((kc2.a) it6.next()).a());
                    }
                    sb7.append(kc2.l1.d(jSONArray2));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, sb7.toString());
                }
            }
            this.f387863d = kz5.n0.L0(this.f387860a, f387859e);
        }
    }
}
