package i11;

/* loaded from: classes13.dex */
public abstract class t implements com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4219xb9b728ce {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f368681a;

    public t() {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f368681a = hashMap;
        hashMap.put("gps", 0);
        hashMap.put("network", 1);
    }

    public abstract void a(boolean z17, double d17, double d18, int i17, double d19, double d27, double d28, java.lang.String str, java.lang.String str2, int i18);

    @Override // com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4219xb9b728ce
    /* renamed from: onLocationChanged */
    public void mo34913xcf0f8560(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa interfaceC4218x687499fa, int i17, java.lang.String str) {
        if (interfaceC4218x687499fa == null) {
            a(false, 0.0d, 0.0d, 0, 0.0d, 0.0d, 0.0d, null, null, 0);
            return;
        }
        int e17 = c01.id.e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SLocationListenerWgs84", "lat=%f, lng=%f, accuracy=%f errcode=%d, areastat=%d, speed=%f, bearing=%f, reason=%s, provider=%s,changeTime=%s", java.lang.Double.valueOf(interfaceC4218x687499fa.m34899x2605e9e2()), java.lang.Double.valueOf(interfaceC4218x687499fa.m34900x79d7af9()), java.lang.Float.valueOf(interfaceC4218x687499fa.m34883xfccaf66f()), java.lang.Integer.valueOf(i17), interfaceC4218x687499fa.m34886x188a79f7(), java.lang.Float.valueOf(interfaceC4218x687499fa.m34906x7526a691()), java.lang.Float.valueOf(interfaceC4218x687499fa.m34887x2fd5b378()), str, interfaceC4218x687499fa.m34904x40fe4367(), java.lang.Integer.valueOf(e17));
        java.util.Map map = this.f368681a;
        if (i17 != 0) {
            a(false, interfaceC4218x687499fa.m34899x2605e9e2(), interfaceC4218x687499fa.m34900x79d7af9(), ((java.lang.Integer) ((java.util.HashMap) map).get(interfaceC4218x687499fa.m34904x40fe4367())).intValue(), interfaceC4218x687499fa.m34906x7526a691(), interfaceC4218x687499fa.m34883xfccaf66f(), interfaceC4218x687499fa.m34885xf53d8818(), interfaceC4218x687499fa.m34897x6d970d18(), interfaceC4218x687499fa.m34896x1cd7c6ef(), interfaceC4218x687499fa.m34898x9b22a878());
            return;
        }
        if (gm0.j1.b().m()) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append((int) interfaceC4218x687499fa.m34883xfccaf66f());
            stringBuffer.append(",");
            stringBuffer.append(((java.util.HashMap) map).get(interfaceC4218x687499fa.m34904x40fe4367()));
            stringBuffer.append(",");
            stringBuffer.append(interfaceC4218x687499fa.m34899x2605e9e2());
            stringBuffer.append(",");
            stringBuffer.append(interfaceC4218x687499fa.m34900x79d7af9());
            stringBuffer.append(",");
            stringBuffer.append(e17);
            gm0.j1.u().c().w(68109, stringBuffer.toString());
        }
        a(true, interfaceC4218x687499fa.m34899x2605e9e2(), interfaceC4218x687499fa.m34900x79d7af9(), ((java.lang.Integer) ((java.util.HashMap) map).get(interfaceC4218x687499fa.m34904x40fe4367())).intValue(), interfaceC4218x687499fa.m34906x7526a691(), interfaceC4218x687499fa.m34883xfccaf66f(), interfaceC4218x687499fa.m34885xf53d8818(), interfaceC4218x687499fa.m34897x6d970d18(), interfaceC4218x687499fa.m34896x1cd7c6ef(), interfaceC4218x687499fa.m34898x9b22a878());
    }

    @Override // com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4219xb9b728ce
    /* renamed from: onStatusUpdate */
    public void mo34914xf54242da(java.lang.String str, int i17, java.lang.String str2) {
    }
}
