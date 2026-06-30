package yd5;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final yd5.q f542678a = new yd5.q();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f542679b;

    static {
        new java.util.ArrayList();
        f542679b = new java.util.HashMap();
    }

    public final void a(int i17, int i18, float f17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoScaleReporter", "addAction >> " + i17 + ", " + i18 + ", " + f17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i18);
        sb6.append(';');
        sb6.append(f17);
        java.lang.String sb7 = sb6.toString();
        java.util.HashMap hashMap = f542679b;
        java.util.ArrayList arrayList = (java.util.ArrayList) hashMap.get(java.lang.Integer.valueOf(i17));
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        arrayList.add(sb7);
        hashMap.put(java.lang.Integer.valueOf(i17), arrayList);
    }

    public final void b(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoScaleReporter", "report >> " + i17);
        java.util.HashMap hashMap = f542679b;
        if (hashMap.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoScaleReporter", "report >> no action");
            return;
        }
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6703x5892a207 c6703x5892a207 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6703x5892a207();
            c6703x5892a207.f140430e = ((java.lang.Number) entry.getKey()).intValue();
            c6703x5892a207.f140429d = i17;
            java.util.ArrayList arrayList = (java.util.ArrayList) entry.getValue();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int i18 = 0;
            for (java.lang.Object obj : arrayList) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                sb6.append((java.lang.String) obj);
                if (i18 < arrayList.size() - 1) {
                    sb6.append("#");
                }
                i18 = i19;
            }
            c6703x5892a207.f140431f = c6703x5892a207.b("ActionAndScales", sb6.toString(), true);
            c6703x5892a207.k();
        }
        hashMap.clear();
    }
}
