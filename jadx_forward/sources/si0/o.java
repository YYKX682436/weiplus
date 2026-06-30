package si0;

/* loaded from: classes13.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f489673d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ si0.v f489674e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f489675f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f489676g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f489677h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f489678i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(si0.v vVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var3, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f489674e = vVar;
        this.f489675f = h0Var;
        this.f489676g = h0Var2;
        this.f489677h = h0Var3;
        this.f489678i = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new si0.o(this.f489674e, this.f489675f, this.f489676g, this.f489677h, this.f489678i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((si0.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.rfx.C20946xbc52e31f[] m77364x7d62d1da;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f489673d;
        si0.v vVar = this.f489674e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.r2 r2Var = vVar.f489732v;
            if (r2Var != null) {
                this.f489673d = 1;
                if (((p3325xe03a0797.p3326xc267989b.c3) r2Var).C(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        io.p3284xd2ae381c.Log.i(vVar.f489714d, vVar + ", flush");
        java.util.Iterator it = ((java.lang.Iterable) this.f489675f.f391656d).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            jz5.l lVar = (jz5.l) it.next();
            com.p314xaae8f345.mm.rfx.C20942x379cf5ee c20942x379cf5ee = vVar.f489717g;
            if (c20942x379cf5ee != null && (m77364x7d62d1da = c20942x379cf5ee.m77364x7d62d1da((java.lang.String) lVar.f384366d)) != null) {
                for (com.p314xaae8f345.mm.rfx.C20946xbc52e31f c20946xbc52e31f : m77364x7d62d1da) {
                    if (c20946xbc52e31f instanceof com.p314xaae8f345.mm.rfx.C20950xfb4c1458) {
                        ((com.p314xaae8f345.mm.rfx.C20950xfb4c1458) c20946xbc52e31f).m77503x5705117a(((java.lang.Number) lVar.f384367e).intValue());
                    }
                }
            }
        }
        for (jz5.l lVar2 : (java.lang.Iterable) this.f489676g.f391656d) {
            com.p314xaae8f345.mm.rfx.C20942x379cf5ee c20942x379cf5ee2 = vVar.f489717g;
            if (c20942x379cf5ee2 != null) {
                int intValue = ((java.lang.Number) lVar2.f384366d).intValue();
                java.lang.String filePath = (java.lang.String) lVar2.f384367e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
                android.util.LruCache lruCache = vVar.f489715e;
                android.graphics.Bitmap bitmap = (android.graphics.Bitmap) lruCache.get(filePath);
                if (bitmap == null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(filePath);
                    java.lang.Object obj2 = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/flutter/plugin/FlutterPAGViewController", "getBitmap", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
                    bitmap = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0));
                    yj0.a.e(obj2, bitmap, "com/tencent/mm/flutter/plugin/FlutterPAGViewController", "getBitmap", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
                    if (bitmap != null) {
                        lruCache.put(filePath, bitmap);
                    }
                }
                c20942x379cf5ee2.m77407x1a429707(intValue, com.p314xaae8f345.mm.rfx.C20945xbc2db729.m77439xd9d5e999(bitmap));
            }
        }
        for (jz5.l lVar3 : (java.lang.Iterable) this.f489677h.f391656d) {
            com.p314xaae8f345.mm.rfx.C20942x379cf5ee c20942x379cf5ee3 = vVar.f489717g;
            com.p314xaae8f345.mm.rfx.C20952x37a3459f m77401x400087ed = c20942x379cf5ee3 != null ? c20942x379cf5ee3.m77401x400087ed(((java.lang.Number) lVar3.f384366d).intValue()) : null;
            if (m77401x400087ed != null) {
                m77401x400087ed.f39122x36452d = ((com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.C24031xcb383f47) lVar3.f384367e).m88920xfb85ada3();
                com.p314xaae8f345.mm.rfx.C20942x379cf5ee c20942x379cf5ee4 = vVar.f489717g;
                if (c20942x379cf5ee4 != null) {
                    c20942x379cf5ee4.m77408x19a3f201(((java.lang.Number) lVar3.f384366d).intValue(), m77401x400087ed);
                }
            }
        }
        if (!vVar.f489725o.isRunning()) {
            com.p314xaae8f345.mm.rfx.C20948xd56d46d3 c20948xd56d46d3 = vVar.f489716f;
            if (c20948xd56d46d3 != null) {
                c20948xd56d46d3.m77497x3ae760af(vVar.f489723m);
            }
            com.p314xaae8f345.mm.rfx.C20948xd56d46d3 c20948xd56d46d32 = vVar.f489716f;
            if (c20948xd56d46d32 != null) {
                c20948xd56d46d32.m77483x5d03b04();
            }
        }
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer = vVar.f489720j;
        this.f489678i.mo146xb9724478(new java.lang.Long(surfaceProducer != null ? surfaceProducer.id() : 0L));
        io.p3284xd2ae381c.Log.i(vVar.f489714d, vVar + ", flush end");
        return jz5.f0.f384359a;
    }
}
