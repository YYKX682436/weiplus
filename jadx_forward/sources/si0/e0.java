package si0;

/* loaded from: classes13.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f489593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ si0.l0 f489594e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f489595f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f489596g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f489597h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f489598i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(si0.l0 l0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var3, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f489594e = l0Var;
        this.f489595f = h0Var;
        this.f489596g = h0Var2;
        this.f489597h = h0Var3;
        this.f489598i = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new si0.e0(this.f489594e, this.f489595f, this.f489596g, this.f489597h, this.f489598i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((si0.e0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        org.p3363xbe4143f1.C29697x62580a7b[] m154678x7d62d1da;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f489593d;
        si0.l0 l0Var = this.f489594e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.r2 r2Var = l0Var.f489652v;
            if (r2Var != null) {
                this.f489593d = 1;
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
        io.p3284xd2ae381c.Log.i(l0Var.f489634d, l0Var + ", flush");
        java.util.Iterator it = ((java.lang.Iterable) this.f489595f.f391656d).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            jz5.l lVar = (jz5.l) it.next();
            org.p3363xbe4143f1.C29690xfae77312 c29690xfae77312 = l0Var.f489637g;
            if (c29690xfae77312 != null && (m154678x7d62d1da = c29690xfae77312.m154678x7d62d1da((java.lang.String) lVar.f384366d)) != null) {
                for (org.p3363xbe4143f1.C29697x62580a7b c29697x62580a7b : m154678x7d62d1da) {
                    if (c29697x62580a7b instanceof org.p3363xbe4143f1.C29702x7a65267c) {
                        ((org.p3363xbe4143f1.C29702x7a65267c) c29697x62580a7b).m154907x5705117a(((java.lang.Number) lVar.f384367e).intValue());
                    }
                }
            }
        }
        for (jz5.l lVar2 : (java.lang.Iterable) this.f489596g.f391656d) {
            org.p3363xbe4143f1.C29690xfae77312 c29690xfae773122 = l0Var.f489637g;
            if (c29690xfae773122 != null) {
                int intValue = ((java.lang.Number) lVar2.f384366d).intValue();
                java.lang.String filePath = (java.lang.String) lVar2.f384367e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
                android.util.LruCache lruCache = l0Var.f489635e;
                android.graphics.Bitmap bitmap = (android.graphics.Bitmap) lruCache.get(filePath);
                if (bitmap == null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(filePath);
                    java.lang.Object obj2 = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/flutter/plugin/FlutterPAGViewControllerOrigin", "getBitmap", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
                    bitmap = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0));
                    yj0.a.e(obj2, bitmap, "com/tencent/mm/flutter/plugin/FlutterPAGViewControllerOrigin", "getBitmap", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
                    if (bitmap != null) {
                        lruCache.put(filePath, bitmap);
                    }
                }
                c29690xfae773122.m154734x1a429707(intValue, org.p3363xbe4143f1.C29693x6232de85.m154757xd9d5e999(bitmap));
            }
        }
        for (jz5.l lVar3 : (java.lang.Iterable) this.f489597h.f391656d) {
            org.p3363xbe4143f1.C29690xfae77312 c29690xfae773123 = l0Var.f489637g;
            org.p3363xbe4143f1.C29704xfaedc2c3 m154727x400087ed = c29690xfae773123 != null ? c29690xfae773123.m154727x400087ed(((java.lang.Number) lVar3.f384366d).intValue()) : null;
            if (m154727x400087ed != null) {
                m154727x400087ed.f75052x36452d = ((com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.C24031xcb383f47) lVar3.f384367e).m88920xfb85ada3();
                org.p3363xbe4143f1.C29690xfae77312 c29690xfae773124 = l0Var.f489637g;
                if (c29690xfae773124 != null) {
                    c29690xfae773124.m154736x19a3f201(((java.lang.Number) lVar3.f384366d).intValue(), m154727x400087ed);
                }
            }
        }
        if (!l0Var.f489645o.isRunning()) {
            org.p3363xbe4143f1.C29699xf00d0af7 c29699xf00d0af7 = l0Var.f489636f;
            if (c29699xf00d0af7 != null) {
                c29699xf00d0af7.m154895x3ae760af(l0Var.f489643m);
            }
            org.p3363xbe4143f1.C29699xf00d0af7 c29699xf00d0af72 = l0Var.f489636f;
            if (c29699xf00d0af72 != null) {
                c29699xf00d0af72.m154877x5d03b04();
            }
        }
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer = l0Var.f489640j;
        this.f489598i.mo146xb9724478(new java.lang.Long(surfaceProducer != null ? surfaceProducer.id() : 0L));
        io.p3284xd2ae381c.Log.i(l0Var.f489634d, l0Var + ", flush end");
        return jz5.f0.f384359a;
    }
}
