package com.p314xaae8f345.p457x3304c6.p461x3a6d265;

/* renamed from: com.tencent.maas.camstudio.MJCamSpatialDesc */
/* loaded from: classes5.dex */
public class C4023x59e5ad63 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e f129436a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p479x4179489f.d f129437b;

    /* renamed from: c, reason: collision with root package name */
    public sg.b f129438c;

    /* renamed from: d, reason: collision with root package name */
    public sg.a f129439d;

    /* renamed from: e, reason: collision with root package name */
    public float f129440e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e f129441f;

    public C4023x59e5ad63(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e, com.p314xaae8f345.p457x3304c6.p479x4179489f.d dVar, sg.b bVar, sg.a aVar, float f17, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e2) {
        this.f129436a = c3974x289f3e;
        this.f129437b = dVar;
        this.f129438c = bVar;
        this.f129439d = aVar;
        this.f129440e = f17;
        this.f129441f = c3974x289f3e2;
    }

    /* renamed from: getFlipMode */
    public sg.a m32753xea2eed26() {
        return this.f129439d;
    }

    /* renamed from: getFlipModeValue */
    public int m32754xf4defbeb() {
        return this.f129439d.f489185d;
    }

    /* renamed from: getPosition */
    public com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e m32755xa86cd69f() {
        return this.f129441f;
    }

    /* renamed from: getRotationMode */
    public sg.b m32756xc48060b7() {
        return this.f129438c;
    }

    /* renamed from: getRotationModeValue */
    public int m32757x19ec1afa() {
        return this.f129438c.f489191d;
    }

    /* renamed from: getScale */
    public float m32758x7520af94() {
        return this.f129440e;
    }

    /* renamed from: getScaleMode */
    public com.p314xaae8f345.p457x3304c6.p479x4179489f.d m32759x8f7b7357() {
        return this.f129437b;
    }

    /* renamed from: getScaleModeValue */
    public int m32760xbc13ac5a() {
        return this.f129437b.f130021d;
    }

    /* renamed from: getViewPointSize */
    public com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e m32761xf6b22cd6() {
        return this.f129436a;
    }

    /* renamed from: toString */
    public java.lang.String m32762x9616526c() {
        return "MJCamSpatialDesc{viewPointSize=" + this.f129436a + ", scaleMode=" + this.f129437b + ", rotationMode=" + this.f129438c + ", flipMode=" + this.f129439d + ", scale=" + this.f129440e + ", position=" + this.f129441f + '}';
    }

    public C4023x59e5ad63(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e, int i17, int i18, int i19, float f17, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e2) {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.d dVar;
        sg.b bVar;
        sg.a aVar;
        this.f129436a = c3974x289f3e;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.d[] m34313xcee59d22 = com.p314xaae8f345.p457x3304c6.p479x4179489f.d.m34313xcee59d22();
        int length = m34313xcee59d22.length;
        int i27 = 0;
        int i28 = 0;
        while (true) {
            if (i28 < length) {
                dVar = m34313xcee59d22[i28];
                if (dVar.f130021d == i17) {
                    break;
                } else {
                    i28++;
                }
            } else {
                dVar = com.p314xaae8f345.p457x3304c6.p479x4179489f.d.None;
                break;
            }
        }
        this.f129437b = dVar;
        sg.b[] m164422xcee59d22 = sg.b.m164422xcee59d22();
        int length2 = m164422xcee59d22.length;
        int i29 = 0;
        while (true) {
            if (i29 < length2) {
                bVar = m164422xcee59d22[i29];
                if (bVar.f489191d == i18) {
                    break;
                } else {
                    i29++;
                }
            } else {
                bVar = sg.b.None;
                break;
            }
        }
        this.f129438c = bVar;
        sg.a[] m164419xcee59d22 = sg.a.m164419xcee59d22();
        int length3 = m164419xcee59d22.length;
        while (true) {
            if (i27 < length3) {
                aVar = m164419xcee59d22[i27];
                if (aVar.f489185d == i19) {
                    break;
                } else {
                    i27++;
                }
            } else {
                aVar = sg.a.None;
                break;
            }
        }
        this.f129439d = aVar;
        this.f129440e = f17;
        this.f129441f = c3974x289f3e2;
    }
}
