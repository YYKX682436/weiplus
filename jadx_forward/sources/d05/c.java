package d05;

/* loaded from: classes9.dex */
public class c extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: d, reason: collision with root package name */
    public double f307119d = 0.0d;

    public c(java.util.List list, java.lang.String str, java.lang.String str2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("session_key", str);
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            d05.l lVar = (d05.l) it.next();
            hashMap.put("qt_id_" + i17, lVar.f307143b);
            hashMap.put("ans_cont_" + i17, lVar.f307144c);
            hashMap.put("level_" + i17, lVar.f307148g + "");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("parent_id_");
            sb6.append(i17);
            hashMap.put(sb6.toString(), lVar.f307145d);
            i17++;
            if (lVar.f307149h != null && "Y".equals(lVar.f307144c)) {
                hashMap.put("qt_id_" + i17, lVar.f307149h.f307143b);
                hashMap.put("ans_cont_" + i17, lVar.f307149h.f307144c);
                hashMap.put("level_" + i17, lVar.f307149h.f307148g + "");
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("parent_id_");
                sb7.append(i17);
                hashMap.put(sb7.toString(), lVar.f307149h.f307145d);
                i17++;
            }
        }
        hashMap.put("total_num", i17 + "");
        m83032xb4c13117(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 60;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (i17 != 0) {
            return;
        }
        try {
            this.f307119d = jSONObject.getInt("credit_amount") / 100.0d;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Micromsg.NetSceneTenpayCheckPwd", e17, "", new java.lang.Object[0]);
        }
    }
}
