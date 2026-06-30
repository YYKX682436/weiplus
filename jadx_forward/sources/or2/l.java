package or2;

/* loaded from: classes10.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f429192d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(java.util.ArrayList arrayList) {
        super(0);
        this.f429192d = arrayList;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        or2.o oVar = or2.o.f429197a;
        java.util.HashMap hashMap = new java.util.HashMap();
        for (or2.h hVar : this.f429192d) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(hVar.f429161a);
            sb6.append('#');
            int i17 = hVar.f429162b;
            sb6.append(i17);
            java.lang.String sb7 = sb6.toString();
            java.lang.Object obj = hashMap.get(sb7);
            if (obj == null) {
                obj = new or2.h(hVar.f429161a, i17);
                hashMap.put(sb7, obj);
            }
            or2.h hVar2 = (or2.h) obj;
            hVar2.f429173m += hVar.b();
            hVar2.f429172l += hVar.f429172l;
            hVar2.f429171k.addAll(hVar.f429171k);
        }
        java.util.Collection<or2.h> values = hashMap.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        for (or2.h hVar3 : values) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, hVar3.f429161a);
            jSONObject.put(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15517x245ebd1, hVar3.a());
            int[] iArr = new int[5];
            int[] iArr2 = new int[5];
            java.util.Iterator it = hVar3.f429171k.iterator();
            while (it.hasNext()) {
                int intValue = ((java.lang.Number) it.next()).intValue();
                if (intValue >= 42) {
                    iArr[4] = iArr[4] + 1;
                    iArr2[4] = iArr2[4] + intValue;
                } else if (intValue >= 24) {
                    iArr[3] = iArr[3] + 1;
                    iArr2[3] = iArr2[3] + intValue;
                } else if (intValue >= 9) {
                    iArr[2] = iArr[2] + 1;
                    iArr2[2] = iArr2[2] + intValue;
                } else if (intValue >= 2) {
                    iArr[1] = iArr[1] + 1;
                    iArr2[1] = iArr2[1] + intValue;
                } else {
                    iArr[0] = iArr[0] + 1;
                    int i18 = iArr2[0];
                    if (intValue < 0) {
                        intValue = 0;
                    }
                    iArr2[0] = i18 + intValue;
                }
            }
            int i19 = iArr2[1];
            int i27 = iArr2[2];
            int i28 = iArr2[3];
            int i29 = iArr2[4];
            int i37 = i19 + i27 + i28 + i29;
            float f17 = i37 <= 0 ? 0.0f : (i29 * 80.0f) / i37;
            float f18 = i37 <= 0 ? 0.0f : (i28 * 60.0f) / i37;
            float f19 = i37 <= 0 ? 0.0f : (i27 * 40.0f) / i37;
            float f27 = i37 <= 0 ? 0.0f : (i19 * 20.0f) / i37;
            int i38 = iArr[4] + iArr[3] + iArr[2] + iArr[1] + iArr[0];
            float f28 = f17 + f18 + f19 + f27;
            int i39 = hVar3.f429162b;
            float b17 = 1.0f - (hVar3.f429172l / (((float) hVar3.b()) / (1000.0f / i39)));
            jSONObject.put(ya.b.f77498x4b14672, a06.d.b(f28));
            java.lang.String format = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(b17)}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            jSONObject.put("dropRate", format);
            jSONObject.put("frameCnt", hVar3.f429172l);
            jSONObject.put("durationMS", hVar3.b());
            jSONObject.put("indexCnt", i38);
            jSONObject.put("frozenIndexCnt", iArr[4]);
            jSONObject.put("highIndexCnt", iArr[3]);
            jSONObject.put("middleIndexCnt", iArr[2]);
            jSONObject.put("normalIndexCnt", iArr[1]);
            jSONObject.put("bestIndexCnt", iArr[0]);
            jSONObject.put("refreshRate", i39);
            jSONObject.put("deviceLevel", or2.o.f429198b);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("batteryPercentage", com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.aa.f215290e);
            jSONObject2.put("isPowerSaveMode", com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.aa.f215291f);
            jSONObject2.put("isLowBattery", com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.aa.f215292g);
            jSONObject.put("battery", jSONObject2);
            jSONObject.put("isBatteryEnough", (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.aa.f215292g || com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.aa.f215291f || com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.aa.f215290e < 30) ? false : true);
            or2.o.f429197a.a(hVar3.f429161a, jSONObject);
        }
        return jz5.f0.f384359a;
    }
}
