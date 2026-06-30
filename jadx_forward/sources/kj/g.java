package kj;

/* loaded from: classes12.dex */
public class g implements jj.e {
    @Override // jj.e
    public void a(java.lang.String str, long[] jArr, int[] iArr, int[] iArr2, float f17, float f18, float f19) {
        oj.j.c("AllSceneFrameListener", "[report] FPS:%s %s", java.lang.Float.valueOf(f19), toString());
        try {
            dj.b bVar = (dj.b) ih.d.d().a(dj.b.class);
            if (bVar == null) {
                return;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            for (kj.h hVar : kj.h.m143530xcee59d22()) {
                jSONObject.put(hVar.name(), iArr[hVar.ordinal()]);
                jSONObject2.put(hVar.name(), iArr2[hVar.ordinal()]);
            }
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            oj.d.d(jSONObject3, bVar.f444986e);
            jSONObject3.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, str);
            jSONObject3.put("dropLevel", jSONObject);
            jSONObject3.put("dropSum", jSONObject2);
            jSONObject3.put(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15517x245ebd1, f19);
            for (kj.i iVar : kj.i.m143533xcee59d22()) {
                jSONObject3.put(iVar.name(), jArr[iVar.ordinal()]);
                if (iVar.equals(kj.i.TOTAL_DURATION)) {
                    break;
                }
            }
            if (kj.m.f389774w >= 31) {
                jSONObject3.put("GPU_DURATION", jArr[9]);
            }
            jSONObject3.put("DROP_COUNT", java.lang.Math.round(f17));
            jSONObject3.put("REFRESH_RATE", (int) f18);
            ri.d0 d0Var = new ri.d0();
            d0Var.f477393b = "Trace_FPS";
            d0Var.f477395d = jSONObject3;
            bVar.d(d0Var);
        } catch (org.json.JSONException e17) {
            oj.j.b("AllSceneFrameListener", "json error", e17);
        }
    }

    @Override // jj.e
    public boolean b() {
        return false;
    }

    @Override // jj.e
    public int c() {
        return 10000;
    }

    @Override // jj.e
    public int d() {
        return 0;
    }

    @Override // jj.e
    /* renamed from: getName */
    public java.lang.String mo141031xfb82e301() {
        return null;
    }
}
