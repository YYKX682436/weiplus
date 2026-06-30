package tp5;

/* loaded from: classes12.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final tp5.f f502688a = new tp5.C30255x2ca3e0();

    public static void a(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48 c26919x80675a48, android.os.CancellationSignal cancellationSignal) {
        if (cancellationSignal == null) {
            return;
        }
        final com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48.CancellationSignal cancellationSignal2 = new com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48.CancellationSignal();
        cancellationSignal.setOnCancelListener(new android.os.CancellationSignal.OnCancelListener() { // from class: tp5.a$$b
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48.CancellationSignal.this.m106785xae7a2e7a();
            }
        });
        if (cancellationSignal.isCanceled()) {
            cancellationSignal2.m106785xae7a2e7a();
        }
        c26919x80675a48.m106766xe56258b0(cancellationSignal2);
    }

    public static void b(java.lang.Object obj, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae c26924x4cd4bae, java.lang.String[] strArr) {
        java.util.List d17 = d(strArr, c26924x4cd4bae.m107125x3759ea4f().mo107912xefdf857d());
        java.util.Iterator it = d17.iterator();
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8 = null;
        int i17 = 1;
        int i18 = 1;
        while (it.hasNext()) {
            int i19 = i18 + 1;
            com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = ((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da) it.next()).eq(new com.p314xaae8f345.p3121x37984a.p3131x37b015.C26995xf88a53cc(i18));
            c27003xbcd6eb8 = c27003xbcd6eb8 == null ? eq6 : c27003xbcd6eb8.and(eq6);
            i18 = i19;
        }
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27035xac2643da m108672x6bdbce7 = new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27035xac2643da().m108662x692743f5(c26924x4cd4bae.m107275x88e404c3()).m108672x6bdbce7(c27003xbcd6eb8);
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48 mo106671x1c19911e = c26924x4cd4bae.m107204xe6834ef1().mo106671x1c19911e(true);
        try {
            com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 m106780x1b7421d3 = mo106671x1c19911e.m106780x1b7421d3(m108672x6bdbce7);
            java.util.Iterator it6 = d17.iterator();
            while (it6.hasNext()) {
                m106780x1b7421d3.m107042x2d44d1dc(obj, (com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da) it6.next(), i17);
                i17++;
            }
            m106780x1b7421d3.m107085x3606cc();
            m106780x1b7421d3.m107051xf2172ef1();
            mo106671x1c19911e.close();
        } catch (java.lang.Throwable th6) {
            if (mo106671x1c19911e != null) {
                try {
                    mo106671x1c19911e.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    public static tp5.c c(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b c26918x6e83759b, java.lang.Object obj, java.lang.Object[] objArr, android.os.CancellationSignal cancellationSignal, tp5.f fVar) {
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48 c26919x80675a48;
        int i17 = 0;
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 c26923xdf786992 = null;
        try {
            c26919x80675a48 = c26918x6e83759b.mo106671x1c19911e(false);
            try {
                a(c26919x80675a48, cancellationSignal);
                c26923xdf786992 = obj instanceof com.p314xaae8f345.p3121x37984a.p3131x37b015.C27024xfb29494f ? c26919x80675a48.m106778x60978256((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27024xfb29494f) obj) : c26919x80675a48.m106779x60978256(obj.toString());
                if (objArr != null) {
                    while (i17 < objArr.length) {
                        com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 c26901x4e9a151 = new com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151(objArr[i17]);
                        i17++;
                        c26923xdf786992.m107048xc8099b34(c26901x4e9a151, i17);
                    }
                }
                return new tp5.c(c26919x80675a48, c26923xdf786992, fVar);
            } catch (java.lang.Throwable th6) {
                th = th6;
                if (c26923xdf786992 != null) {
                    c26919x80675a48.m106770xec7dd49(c26923xdf786992);
                }
                if (c26919x80675a48 != null) {
                    c26919x80675a48.m106777x92d0313b();
                }
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            c26919x80675a48 = null;
        }
    }

    public static java.util.List d(java.lang.String[] strArr, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] c26981x40bb0daArr) {
        int i17 = 0;
        if (strArr.length == 0) {
            int length = c26981x40bb0daArr.length;
            while (i17 < length) {
                com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = c26981x40bb0daArr[i17];
                if (c26981x40bb0da.m107910x356d3dc7()) {
                    return java.util.Collections.singletonList(c26981x40bb0da);
                }
                i17++;
            }
            throw new java.lang.AssertionError("No primary key defined");
        }
        java.util.List asList = java.util.Arrays.asList(strArr);
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        int length2 = c26981x40bb0daArr.length;
        while (i17 < length2) {
            com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da2 = c26981x40bb0daArr[i17];
            if (asList.contains(c26981x40bb0da2.m107907xfb82e301())) {
                arrayList.add(c26981x40bb0da2);
            }
            i17++;
        }
        return arrayList;
    }

    public static com.p314xaae8f345.mm.p2495xc50a8b8b.f e(byte[] bArr, java.lang.Class cls) {
        try {
            return ((com.p314xaae8f345.mm.p2495xc50a8b8b.f) cls.newInstance()).mo11468x92b714fd(bArr);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WCDBHelper", e17, "Cannot parse protobuf", new java.lang.Object[0]);
            return null;
        }
    }

    public static android.database.Cursor f(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b c26918x6e83759b, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27024xfb29494f c27024xfb29494f, java.lang.Object[] objArr, android.os.CancellationSignal cancellationSignal) {
        return new tp5.b(c(c26918x6e83759b, c27024xfb29494f, objArr, cancellationSignal, f502688a));
    }

    public static android.database.Cursor g(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b c26918x6e83759b, java.lang.String str, java.lang.Object[] objArr, android.os.CancellationSignal cancellationSignal) {
        return new tp5.b(c(c26918x6e83759b, str, objArr, cancellationSignal, f502688a));
    }

    public static byte[] h(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        try {
            return fVar.mo14344x5f01b1f6();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WCDBHelper", e17, "Cannot serialize protobuf", new java.lang.Object[0]);
            return null;
        }
    }

    public static void i(java.lang.Object obj, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae c26924x4cd4bae, java.lang.String[] strArr) {
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] mo107912xefdf857d = c26924x4cd4bae.m107125x3759ea4f().mo107912xefdf857d();
        int length = mo107912xefdf857d.length + 1;
        java.util.List d17 = d(strArr, mo107912xefdf857d);
        java.util.Iterator it = d17.iterator();
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8 = null;
        while (it.hasNext()) {
            int i17 = length + 1;
            com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 eq6 = ((com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da) it.next()).eq(new com.p314xaae8f345.p3121x37984a.p3131x37b015.C26995xf88a53cc(length));
            if (c27003xbcd6eb8 != null) {
                eq6 = c27003xbcd6eb8.and(eq6);
            }
            c27003xbcd6eb8 = eq6;
            length = i17;
        }
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8 m108849x6bdbce7 = new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27048xc9bff6f8().m108848xce0038c9(c26924x4cd4bae.m107275x88e404c3()).m108843x7022909d(mo107912xefdf857d).m108849x6bdbce7(c27003xbcd6eb8);
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48 mo106671x1c19911e = c26924x4cd4bae.m107204xe6834ef1().mo106671x1c19911e(true);
        try {
            com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 m106780x1b7421d3 = mo106671x1c19911e.m106780x1b7421d3(m108849x6bdbce7);
            m106780x1b7421d3.m107044x2d44d1dc((com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992) obj, (com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992>[]) mo107912xefdf857d);
            int length2 = mo107912xefdf857d.length + 1;
            java.util.Iterator it6 = d17.iterator();
            while (it6.hasNext()) {
                m106780x1b7421d3.m107042x2d44d1dc(obj, (com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da) it6.next(), length2);
                length2++;
            }
            m106780x1b7421d3.m107085x3606cc();
            m106780x1b7421d3.m107051xf2172ef1();
            mo106671x1c19911e.close();
        } catch (java.lang.Throwable th6) {
            if (mo106671x1c19911e != null) {
                try {
                    mo106671x1c19911e.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }
}
