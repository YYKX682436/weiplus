package com.tencent.maas.camstudio;

/* loaded from: classes5.dex */
public class MJCamSpatialDesc {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.base.Vec2 f47903a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.maas.moviecomposing.d f47904b;

    /* renamed from: c, reason: collision with root package name */
    public sg.b f47905c;

    /* renamed from: d, reason: collision with root package name */
    public sg.a f47906d;

    /* renamed from: e, reason: collision with root package name */
    public float f47907e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.maas.base.Vec2 f47908f;

    public MJCamSpatialDesc(com.tencent.maas.base.Vec2 vec2, com.tencent.maas.moviecomposing.d dVar, sg.b bVar, sg.a aVar, float f17, com.tencent.maas.base.Vec2 vec22) {
        this.f47903a = vec2;
        this.f47904b = dVar;
        this.f47905c = bVar;
        this.f47906d = aVar;
        this.f47907e = f17;
        this.f47908f = vec22;
    }

    public sg.a getFlipMode() {
        return this.f47906d;
    }

    public int getFlipModeValue() {
        return this.f47906d.f407652d;
    }

    public com.tencent.maas.base.Vec2 getPosition() {
        return this.f47908f;
    }

    public sg.b getRotationMode() {
        return this.f47905c;
    }

    public int getRotationModeValue() {
        return this.f47905c.f407658d;
    }

    public float getScale() {
        return this.f47907e;
    }

    public com.tencent.maas.moviecomposing.d getScaleMode() {
        return this.f47904b;
    }

    public int getScaleModeValue() {
        return this.f47904b.f48488d;
    }

    public com.tencent.maas.base.Vec2 getViewPointSize() {
        return this.f47903a;
    }

    public java.lang.String toString() {
        return "MJCamSpatialDesc{viewPointSize=" + this.f47903a + ", scaleMode=" + this.f47904b + ", rotationMode=" + this.f47905c + ", flipMode=" + this.f47906d + ", scale=" + this.f47907e + ", position=" + this.f47908f + '}';
    }

    public MJCamSpatialDesc(com.tencent.maas.base.Vec2 vec2, int i17, int i18, int i19, float f17, com.tencent.maas.base.Vec2 vec22) {
        com.tencent.maas.moviecomposing.d dVar;
        sg.b bVar;
        sg.a aVar;
        this.f47903a = vec2;
        com.tencent.maas.moviecomposing.d[] values = com.tencent.maas.moviecomposing.d.values();
        int length = values.length;
        int i27 = 0;
        int i28 = 0;
        while (true) {
            if (i28 < length) {
                dVar = values[i28];
                if (dVar.f48488d == i17) {
                    break;
                } else {
                    i28++;
                }
            } else {
                dVar = com.tencent.maas.moviecomposing.d.None;
                break;
            }
        }
        this.f47904b = dVar;
        sg.b[] values2 = sg.b.values();
        int length2 = values2.length;
        int i29 = 0;
        while (true) {
            if (i29 < length2) {
                bVar = values2[i29];
                if (bVar.f407658d == i18) {
                    break;
                } else {
                    i29++;
                }
            } else {
                bVar = sg.b.None;
                break;
            }
        }
        this.f47905c = bVar;
        sg.a[] values3 = sg.a.values();
        int length3 = values3.length;
        while (true) {
            if (i27 < length3) {
                aVar = values3[i27];
                if (aVar.f407652d == i19) {
                    break;
                } else {
                    i27++;
                }
            } else {
                aVar = sg.a.None;
                break;
            }
        }
        this.f47906d = aVar;
        this.f47907e = f17;
        this.f47908f = vec22;
    }
}
