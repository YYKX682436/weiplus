package yw;

/* loaded from: classes9.dex */
public final class q2 {

    /* renamed from: a, reason: collision with root package name */
    public static final yw.q2 f547967a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f547968b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f547969c;

    static {
        yw.q2 q2Var = new yw.q2();
        f547967a = q2Var;
        f547968b = q2Var.hashCode();
    }

    public static final com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 a(yw.q2 q2Var, com.p314xaae8f345.p2845xc516c4b6.biz.C23232x91bb1d7a c23232x91bb1d7a) {
        q2Var.getClass();
        java.lang.String m85536xb5887639 = c23232x91bb1d7a.m85536xb5887639();
        if (m85536xb5887639 == null || m85536xb5887639.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizFlutterShareMsgHelper", "convert fail, link is null");
            return null;
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504();
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11300x89dbd7a1 c11300x89dbd7a1 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11300x89dbd7a1();
        c11300x89dbd7a1.f33249xa1713a8c = c23232x91bb1d7a.m85536xb5887639();
        c11286x34a5504.f33122xe4128443 = c11300x89dbd7a1;
        c11286x34a5504.f33130x6942258 = c23232x91bb1d7a.m85535x7531c8a2();
        c11286x34a5504.f33121x993583fc = c23232x91bb1d7a.m85527xfb7e6707();
        return c11286x34a5504;
    }

    public static final void b(yw.q2 q2Var, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504, java.lang.String str, com.p314xaae8f345.p2845xc516c4b6.biz.C23232x91bb1d7a c23232x91bb1d7a, java.lang.String str2) {
        q2Var.getClass();
        android.graphics.Bitmap Bi = ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Bi(c23232x91bb1d7a.m85529x1e741da2());
        if (Bi != null && !Bi.isRecycled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterShareMsgHelper", "thumb image is not null");
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            Bi.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            c11286x34a5504.f33128x4f3b3aa0 = byteArrayOutputStream.toByteArray();
        }
        java.lang.String a17 = c01.n2.a(c23232x91bb1d7a.m85531x74d37ac6());
        c01.l2 c17 = c01.n2.d().c(a17, true);
        java.lang.Long m85530x7235c680 = c23232x91bb1d7a.m85530x7235c680();
        c17.i("_DATA_CENTER_ITEM_SHOW_TYPE", m85530x7235c680 != null ? java.lang.Integer.valueOf((int) m85530x7235c680.longValue()) : null);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5987xfe669c12 c5987xfe669c12 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5987xfe669c12();
        am.jt jtVar = c5987xfe669c12.f136282g;
        jtVar.f88613a = c11286x34a5504;
        jtVar.f88616d = str;
        jtVar.f88617e = 2;
        jtVar.f88629q = a17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c23232x91bb1d7a.m85534xcfc1cda4())) {
            jtVar.f88620h = null;
        } else {
            jtVar.f88618f = c23232x91bb1d7a.m85534xcfc1cda4();
            jtVar.f88619g = c23232x91bb1d7a.m85528x8d4ef582();
        }
        c5987xfe669c12.e();
        if (!(!(str2 == null || str2.length() == 0))) {
            str2 = null;
        }
        if (str2 != null) {
            ((qg5.a) ((ct.p2) i95.n0.c(ct.p2.class))).getClass();
            java.util.HashMap a18 = com.p314xaae8f345.mm.ui.i1.a(str2);
            if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str) || a18 == null) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361 c5990xd50ae361 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361();
                am.mt mtVar = c5990xd50ae361.f136285g;
                mtVar.f88895a = str;
                mtVar.f88896b = str2;
                mtVar.f88897c = c01.e2.C(str);
                mtVar.f88898d = 0;
                c5990xd50ae361.e();
                return;
            }
            if (w11.t1.a(str)) {
                w11.r1 b17 = w11.s1.b(str, null, 2, null);
                b17.e(str2);
                b17.h(c01.e2.C(str));
                b17.f523664f = 1;
                b17.f523666h = a18;
                w11.r1.d(b17, null, 1, null);
                return;
            }
            w11.r1 b18 = w11.s1.b(str, null, 2, null);
            b18.g(str);
            b18.e(str2);
            b18.h(c01.e2.C(str));
            b18.f523664f = 1;
            b18.f523666h = a18;
            b18.f523667i = 5;
            b18.a().a();
        }
    }

    public final void c(java.lang.String str, yz5.l lVar) {
        java.lang.String str2 = null;
        if (!(str != null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterShareMsgHelper", "downloadImage img url is null");
            if (lVar != null) {
                lVar.mo146xb9724478(null);
                return;
            }
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            java.lang.String str3 = f547969c;
            if (str3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("imageCacheDir");
                throw null;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            byte[] bytes = str.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            sb6.append(kk.k.g(bytes));
            str2 = sb6.toString();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizFlutterShareMsgHelper", "downloadImage fullPath=%s", str2);
        ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Ai(str, new yw.p2(str2, lVar));
    }
}
