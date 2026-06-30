package com.tencent.maas.instamovie.base.asset;

/* loaded from: classes5.dex */
public class MJAssetInfo {

    /* renamed from: a, reason: collision with root package name */
    public final qg.a f48176a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f48177b;

    /* renamed from: c, reason: collision with root package name */
    public final qg.c f48178c;

    /* renamed from: d, reason: collision with root package name */
    public final qg.b f48179d;

    public MJAssetInfo(qg.a aVar, java.lang.String str, qg.c cVar) {
        this.f48176a = aVar;
        this.f48177b = str;
        this.f48178c = cVar;
        this.f48179d = qg.b.Image;
    }

    public java.lang.String getIdentifier() {
        return this.f48177b;
    }

    public qg.a getIdentifierType() {
        return this.f48176a;
    }

    public qg.b getLivePhotoUsage() {
        return this.f48179d;
    }

    public int getMJAssetIdentifierType() {
        return this.f48176a.f362717d;
    }

    public int getMJAssetLivePhotoUsage() {
        return this.f48179d.f362721d;
    }

    public int getMJAssetMediaType() {
        return this.f48178c.f362726d;
    }

    public qg.c getMediaType() {
        return this.f48178c;
    }

    public java.lang.String toString() {
        return "MJAssetInfo{identifierType=" + this.f48176a + ", Identifier='" + this.f48177b + "', mediaType=" + this.f48178c + ", livePhotoUsage=" + this.f48179d + '}';
    }

    public MJAssetInfo(qg.a aVar, java.lang.String str, qg.c cVar, qg.b bVar) {
        this.f48176a = aVar;
        this.f48177b = str;
        this.f48178c = cVar;
        this.f48179d = bVar;
    }

    public MJAssetInfo(int i17, java.lang.String str, int i18) {
        qg.a aVar;
        qg.a[] values = qg.a.values();
        int length = values.length;
        int i19 = 0;
        while (true) {
            if (i19 < length) {
                aVar = values[i19];
                if (aVar.f362717d == i17) {
                    break;
                } else {
                    i19++;
                }
            } else {
                aVar = qg.a.Unknown;
                break;
            }
        }
        this.f48176a = aVar;
        this.f48177b = str;
        this.f48178c = qg.c.a(i18);
        this.f48179d = qg.b.Image;
    }

    public MJAssetInfo(int i17, java.lang.String str, int i18, int i19) {
        qg.a aVar;
        qg.b bVar;
        qg.a[] values = qg.a.values();
        int length = values.length;
        int i27 = 0;
        int i28 = 0;
        while (true) {
            if (i28 < length) {
                aVar = values[i28];
                if (aVar.f362717d == i17) {
                    break;
                } else {
                    i28++;
                }
            } else {
                aVar = qg.a.Unknown;
                break;
            }
        }
        this.f48176a = aVar;
        this.f48177b = str;
        this.f48178c = qg.c.a(i18);
        qg.b[] values2 = qg.b.values();
        int length2 = values2.length;
        while (true) {
            if (i27 < length2) {
                bVar = values2[i27];
                if (bVar.f362721d == i19) {
                    break;
                } else {
                    i27++;
                }
            } else {
                bVar = qg.b.Image;
                break;
            }
        }
        this.f48179d = bVar;
    }
}
