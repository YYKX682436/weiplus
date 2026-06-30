package ys0;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final android.hardware.camera2.CaptureResult f546655a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f546656b;

    /* renamed from: c, reason: collision with root package name */
    public final int f546657c;

    public b(android.hardware.camera2.CaptureResult result, java.lang.String mCameraId, java.util.ArrayList arrayList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mCameraId, "mCameraId");
        this.f546655a = result;
        this.f546656b = arrayList;
        this.f546657c = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mCameraId, "0") ? 1 : 2;
    }

    public final android.hardware.camera2.CaptureResult.Key a(java.lang.String key) {
        java.lang.Object obj;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.util.ArrayList arrayList = this.f546656b;
        if (arrayList == null) {
            return null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ys0.a aVar = (ys0.a) obj;
            boolean z17 = false;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar.f546650a, key)) {
                java.lang.Integer num = aVar.f546651b;
                if (!(num != null && (num.intValue() & this.f546657c) == 0)) {
                    z17 = true;
                }
            }
            if (z17) {
                break;
            }
        }
        ys0.a aVar2 = (ys0.a) obj;
        if (aVar2 == null || (str = aVar2.f546654e) == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1808118735:
                if (!str.equals("String")) {
                    return null;
                }
                java.lang.String str2 = aVar2.f546652c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                return ys0.c.a(str2, java.lang.String.class);
            case -672261858:
                if (!str.equals(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26669x527e6c88.f56126xc3426119)) {
                    return null;
                }
                java.lang.String str3 = aVar2.f546652c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
                return ys0.c.a(str3, java.lang.Integer.TYPE);
            case 2086184:
                if (!str.equals("Byte")) {
                    return null;
                }
                java.lang.String str4 = aVar2.f546652c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str4);
                return ys0.c.a(str4, java.lang.Byte.TYPE);
            case 1729365000:
                if (!str.equals("Boolean")) {
                    return null;
                }
                java.lang.String str5 = aVar2.f546652c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str5);
                return ys0.c.a(str5, java.lang.Boolean.TYPE);
            default:
                return null;
        }
    }
}
