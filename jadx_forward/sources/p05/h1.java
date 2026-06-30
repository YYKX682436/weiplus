package p05;

/* loaded from: classes14.dex */
public final class h1 extends p05.g1 {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f432065g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f432066h;

    /* renamed from: i, reason: collision with root package name */
    public double f432067i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.Map f432068j = new java.util.LinkedHashMap();

    @Override // p05.g1
    public void c(java.lang.String str, java.lang.String str2) {
        ((java.util.LinkedHashMap) this.f432068j).clear();
        this.f432065g = str;
        this.f432066h = str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MakeUpSuitEffect", "#change makeupRes=" + str + " filterRes=" + str2);
        if (!this.f432057a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MakeUpSuitEffect", "This effect is not attached!");
        }
        if (this.f432057a) {
            this.f432060d = 0;
            java.util.ArrayList arrayList = this.f432061e;
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                jz5.l lVar = (jz5.l) it.next();
                com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83740xed30d0c0(this.f432059c, ((java.lang.Number) lVar.f384366d).longValue());
                com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.a(this.f432059c, ((java.lang.Number) lVar.f384366d).longValue(), null);
            }
            arrayList.clear();
            com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83739x3c6d5caa(this.f432059c, this.f432062f);
            this.f432062f = 0L;
            if (str != null) {
                if (!(str.length() == 0)) {
                    long[] m83718x62437256 = com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83718x62437256(this.f432059c, str);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#change after nAddEffectMaterialsFolder ptr.size=");
                    sb6.append(m83718x62437256 != null ? java.lang.Integer.valueOf(m83718x62437256.length) : null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MakeUpSuitEffect", sb6.toString());
                    if (m83718x62437256 != null) {
                        if (!(m83718x62437256.length == 0)) {
                            for (long j17 : m83718x62437256) {
                                int m83731xfb49b090 = com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83731xfb49b090(this.f432059c, j17);
                                arrayList.add(new jz5.l(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(m83731xfb49b090)));
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MakeUpSuitEffect", "#change objId=" + j17 + " objectType=" + m83731xfb49b090);
                            }
                            p05.z3 z3Var = p05.l4.R;
                            this.f432060d = 47232;
                        }
                    }
                }
            }
            if (str2 != null) {
                if (str2.length() > 0) {
                    this.f432062f = com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83721x1ef986a(this.f432059c, str2);
                }
            }
        }
    }

    public void d(int i17, double d17) {
        java.lang.Object obj;
        this.f432068j.put(java.lang.Integer.valueOf(i17), java.lang.Double.valueOf(d17));
        if (!this.f432057a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MakeUpSuitEffect", "This effect is not attached!");
        }
        if (this.f432057a) {
            float f17 = (float) d17;
            java.util.Iterator it = this.f432061e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((java.lang.Number) ((jz5.l) obj).f384367e).intValue() == i17) {
                        break;
                    }
                }
            }
            jz5.l lVar = (jz5.l) obj;
            if (lVar != null) {
                jz5.l lVar2 = ((java.lang.Number) lVar.f384367e).intValue() >= 0 ? lVar : null;
                if (lVar2 != null) {
                    com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83756xdc67401(this.f432059c, ((java.lang.Number) lVar2.f384366d).longValue(), f17);
                }
            }
        }
    }
}
