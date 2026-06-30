package com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.p472x58ceaf0;

/* renamed from: com.tencent.maas.instamovie.base.asset.MJAssetInfo */
/* loaded from: classes5.dex */
public class C4094x2bd762a1 {

    /* renamed from: a, reason: collision with root package name */
    public final qg.a f129709a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f129710b;

    /* renamed from: c, reason: collision with root package name */
    public final qg.c f129711c;

    /* renamed from: d, reason: collision with root package name */
    public final qg.b f129712d;

    public C4094x2bd762a1(qg.a aVar, java.lang.String str, qg.c cVar) {
        this.f129709a = aVar;
        this.f129710b = str;
        this.f129711c = cVar;
        this.f129712d = qg.b.Image;
    }

    /* renamed from: getIdentifier */
    public java.lang.String m33753x8dc9649f() {
        return this.f129710b;
    }

    /* renamed from: getIdentifierType */
    public qg.a m33754xb600079() {
        return this.f129709a;
    }

    /* renamed from: getLivePhotoUsage */
    public qg.b m33755xae068191() {
        return this.f129712d;
    }

    /* renamed from: getMJAssetIdentifierType */
    public int m33756xb6b62020() {
        return this.f129709a.f444250d;
    }

    /* renamed from: getMJAssetLivePhotoUsage */
    public int m33757x595ca138() {
        return this.f129712d.f444254d;
    }

    /* renamed from: getMJAssetMediaType */
    public int m33758x5e2c681() {
        return this.f129711c.f444259d;
    }

    /* renamed from: getMediaType */
    public qg.c m33759x7f025288() {
        return this.f129711c;
    }

    /* renamed from: toString */
    public java.lang.String m33760x9616526c() {
        return "MJAssetInfo{identifierType=" + this.f129709a + ", Identifier='" + this.f129710b + "', mediaType=" + this.f129711c + ", livePhotoUsage=" + this.f129712d + '}';
    }

    public C4094x2bd762a1(qg.a aVar, java.lang.String str, qg.c cVar, qg.b bVar) {
        this.f129709a = aVar;
        this.f129710b = str;
        this.f129711c = cVar;
        this.f129712d = bVar;
    }

    public C4094x2bd762a1(int i17, java.lang.String str, int i18) {
        qg.a aVar;
        qg.a[] m159961xcee59d22 = qg.a.m159961xcee59d22();
        int length = m159961xcee59d22.length;
        int i19 = 0;
        while (true) {
            if (i19 < length) {
                aVar = m159961xcee59d22[i19];
                if (aVar.f444250d == i17) {
                    break;
                } else {
                    i19++;
                }
            } else {
                aVar = qg.a.Unknown;
                break;
            }
        }
        this.f129709a = aVar;
        this.f129710b = str;
        this.f129711c = qg.c.a(i18);
        this.f129712d = qg.b.Image;
    }

    public C4094x2bd762a1(int i17, java.lang.String str, int i18, int i19) {
        qg.a aVar;
        qg.b bVar;
        qg.a[] m159961xcee59d22 = qg.a.m159961xcee59d22();
        int length = m159961xcee59d22.length;
        int i27 = 0;
        int i28 = 0;
        while (true) {
            if (i28 < length) {
                aVar = m159961xcee59d22[i28];
                if (aVar.f444250d == i17) {
                    break;
                } else {
                    i28++;
                }
            } else {
                aVar = qg.a.Unknown;
                break;
            }
        }
        this.f129709a = aVar;
        this.f129710b = str;
        this.f129711c = qg.c.a(i18);
        qg.b[] m159964xcee59d22 = qg.b.m159964xcee59d22();
        int length2 = m159964xcee59d22.length;
        while (true) {
            if (i27 < length2) {
                bVar = m159964xcee59d22[i27];
                if (bVar.f444254d == i19) {
                    break;
                } else {
                    i27++;
                }
            } else {
                bVar = qg.b.Image;
                break;
            }
        }
        this.f129712d = bVar;
    }
}
