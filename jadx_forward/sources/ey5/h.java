package ey5;

/* loaded from: classes13.dex */
public class h implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25943x166a66f {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25959x166a66f f339184a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7 f339185b;

    public h(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7 interfaceC25961x718093f7) {
        this.f339184a = interfaceC25961x718093f7.mo37464x78d58245();
        this.f339185b = interfaceC25961x718093f7;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25943x166a66f
    /* renamed from: distanceBetween */
    public double mo98923x69db0a53(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d262) {
        double m37196x79d7af9 = c4406x873d1d26.m37196x79d7af9();
        double m37195x2605e9e2 = c4406x873d1d26.m37195x2605e9e2();
        double d17 = m37196x79d7af9 * 0.01745329251994329d;
        double d18 = m37195x2605e9e2 * 0.01745329251994329d;
        double m37196x79d7af92 = c4406x873d1d262.m37196x79d7af9() * 0.01745329251994329d;
        double m37195x2605e9e22 = c4406x873d1d262.m37195x2605e9e2() * 0.01745329251994329d;
        double sin = java.lang.Math.sin(d17);
        double sin2 = java.lang.Math.sin(d18);
        double cos = java.lang.Math.cos(d17);
        double cos2 = java.lang.Math.cos(d18);
        double sin3 = java.lang.Math.sin(m37196x79d7af92);
        double sin4 = java.lang.Math.sin(m37195x2605e9e22);
        double cos3 = java.lang.Math.cos(m37196x79d7af92);
        double cos4 = java.lang.Math.cos(m37195x2605e9e22);
        double d19 = (cos * cos2) - (cos3 * cos4);
        double d27 = (cos2 * sin) - (cos4 * sin3);
        double d28 = sin2 - sin4;
        return java.lang.Math.asin(java.lang.Math.sqrt(((d19 * d19) + (d27 * d27)) + (d28 * d28)) / 2.0d) * 1.27420015798544E7d;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25943x166a66f
    /* renamed from: fromScreenLocation */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 mo98924x7ce5ca8b(android.graphics.Point point) {
        return ey5.x.a(this.f339184a.mo37072x7ce5ca8b(point));
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25943x166a66f
    /* renamed from: getLatitudeSpan */
    public double mo98925x7b81944c() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26100x627095e6 mo37073xf0312250 = this.f339184a.mo37073xf0312250();
        if (mo37073xf0312250 == null) {
            return -1.0d;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b c26042xcb530b7b = mo37073xf0312250.f49843xc187b75b;
        return c26042xcb530b7b.f49514x9e7cbcfc.f49501xaa2bac6c - c26042xcb530b7b.f49513x1a6ba282.f49501xaa2bac6c;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25943x166a66f
    /* renamed from: getLongitudeSpan */
    public double mo98926xb62cc1e3() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26100x627095e6 mo37073xf0312250 = this.f339184a.mo37073xf0312250();
        if (mo37073xf0312250 == null) {
            return -1.0d;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b c26042xcb530b7b = mo37073xf0312250.f49843xc187b75b;
        return c26042xcb530b7b.f49514x9e7cbcfc.f49502x83009af - c26042xcb530b7b.f49513x1a6ba282.f49502x83009af;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25943x166a66f
    /* renamed from: getScalePerPixel */
    public float mo98927xf0e69b1d() {
        return (float) this.f339184a.mo36717xffa0db93(this.f339185b.mo37451xd2ef9864().f49413xcb7e7191.f49501xaa2bac6c);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25943x166a66f
    /* renamed from: getVisibleRegion */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4421x627095e6 mo98928xf0312250() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26100x627095e6 mo37073xf0312250 = this.f339184a.mo37073xf0312250();
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4407xcb530b7b c4407xcb530b7b = null;
        if (mo37073xf0312250 == null) {
            return null;
        }
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 a17 = ey5.x.a(mo37073xf0312250.f49844x2d87484f);
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 a18 = ey5.x.a(mo37073xf0312250.f49845x83b822d4);
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 a19 = ey5.x.a(mo37073xf0312250.f49841xbfac3bbe);
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 a27 = ey5.x.a(mo37073xf0312250.f49842x36319d45);
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b c26042xcb530b7b = mo37073xf0312250.f49843xc187b75b;
        if (c26042xcb530b7b != null && c26042xcb530b7b.f49513x1a6ba282 != null && c26042xcb530b7b.f49514x9e7cbcfc != null) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26 = c26042xcb530b7b.f49514x9e7cbcfc;
            com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26 = new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26(c26041x873d1d26.f49501xaa2bac6c, c26041x873d1d26.f49502x83009af);
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d262 = c26042xcb530b7b.f49513x1a6ba282;
            c4407xcb530b7b = new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4407xcb530b7b(c4406x873d1d26, new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26(c26041x873d1d262.f49501xaa2bac6c, c26041x873d1d262.f49502x83009af));
        }
        return new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4421x627095e6(a17, a18, a19, a27, c4407xcb530b7b);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25943x166a66f
    /* renamed from: metersToEquatorPixels */
    public float mo98929xcbd44b87(float f17) {
        return mo98930x7785f132(0.0d, f17);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25943x166a66f
    /* renamed from: metersToPixels */
    public float mo98930x7785f132(double d17, double d18) {
        return (float) (d18 / this.f339184a.mo36717xffa0db93(d17));
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25943x166a66f
    /* renamed from: toPixels */
    public android.graphics.Point mo98931x905f7108(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4399x704e24df c4399x704e24df, android.graphics.Point point) {
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 g2l = com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4399x704e24df.g2l(c4399x704e24df);
        if (g2l == null) {
            return null;
        }
        return mo98932x5ab0ff9c(g2l);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25943x166a66f
    /* renamed from: toScreenLocation */
    public android.graphics.Point mo98932x5ab0ff9c(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26) {
        return this.f339184a.mo37079x5ab0ff9c(ey5.x.f(c4406x873d1d26));
    }
}
