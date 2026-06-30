package com.p314xaae8f345.p457x3304c6.p469xb845a2f1;

/* renamed from: com.tencent.maas.imagestudio.MJImageCropDesc */
/* loaded from: classes5.dex */
public class C4055x5079551f {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p469xb845a2f1.a f129586a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p479x4179489f.C4132xa482ea73 f129587b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p479x4179489f.C4132xa482ea73 f129588c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae f129589d;

    public C4055x5079551f(com.p314xaae8f345.p457x3304c6.p469xb845a2f1.a aVar, com.p314xaae8f345.p457x3304c6.p479x4179489f.C4132xa482ea73 c4132xa482ea73, com.p314xaae8f345.p457x3304c6.p479x4179489f.C4132xa482ea73 c4132xa482ea732, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae c3972x4b2f2ae) {
        this.f129586a = aVar;
        this.f129587b = c4132xa482ea73;
        this.f129588c = c4132xa482ea732;
        this.f129589d = c3972x4b2f2ae;
    }

    /* renamed from: getAspectRatio */
    public com.p314xaae8f345.p457x3304c6.p479x4179489f.C4132xa482ea73 m33010x1aef895d() {
        return this.f129587b;
    }

    /* renamed from: getCropAspectRatioType */
    public int m33011x8efd2c87() {
        return this.f129586a.f129613d;
    }

    /* renamed from: getCropRegion */
    public com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae m33012x2e2a599a() {
        return this.f129589d;
    }

    /* renamed from: getOriginalAspectRatio */
    public com.p314xaae8f345.p457x3304c6.p479x4179489f.C4132xa482ea73 m33013x10c8a0cc() {
        return this.f129588c;
    }

    public C4055x5079551f(int i17, com.p314xaae8f345.p457x3304c6.p479x4179489f.C4132xa482ea73 c4132xa482ea73, com.p314xaae8f345.p457x3304c6.p479x4179489f.C4132xa482ea73 c4132xa482ea732, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae c3972x4b2f2ae) {
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.a aVar = com.p314xaae8f345.p457x3304c6.p469xb845a2f1.a.Original;
        if (i17 != 0) {
            if (i17 == 1) {
                aVar = com.p314xaae8f345.p457x3304c6.p469xb845a2f1.a.Freeform;
            } else if (i17 == 2) {
                aVar = com.p314xaae8f345.p457x3304c6.p469xb845a2f1.a.Standard;
            }
        }
        this.f129586a = aVar;
        this.f129587b = c4132xa482ea73;
        this.f129588c = c4132xa482ea732;
        this.f129589d = c3972x4b2f2ae;
    }
}
