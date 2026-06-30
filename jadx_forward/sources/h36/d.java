package h36;

/* loaded from: classes13.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final h36.h f360111a;

    /* renamed from: b, reason: collision with root package name */
    public final h36.i f360112b;

    /* renamed from: c, reason: collision with root package name */
    public final h36.g f360113c;

    /* renamed from: d, reason: collision with root package name */
    public h36.f f360114d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f360115e;

    /* renamed from: f, reason: collision with root package name */
    public final int f360116f;

    /* renamed from: g, reason: collision with root package name */
    public final int f360117g;

    public d(android.content.Context context, int i17) {
        byte[] bArr;
        int i18;
        byte[] bArr2;
        boolean z17;
        android.content.pm.Signature signature;
        byte[] bArr3 = null;
        h36.h hVar = new h36.h(null);
        this.f360111a = hVar;
        this.f360112b = new h36.i(hVar);
        this.f360113c = new h36.g(hVar);
        this.f360114d = null;
        this.f360116f = 66560;
        this.f360117g = 1404;
        this.f360115e = context;
        hVar.f360137j = context;
        hVar.f360136i = i17;
        hVar.f360153z = new h36.e(context);
        byte[] bArr4 = new byte[16];
        hVar.f360128a.nextBytes(bArr4);
        boolean z18 = false;
        java.lang.System.arraycopy(bArr4, 0, hVar.f360130c, 0, 16);
        synchronized (this) {
            byte[] p17 = p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.p(context);
            if (p17.length <= 0) {
                p17 = p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.j(context);
                if (p17 != null && p17.length > 0) {
                    hVar.f360147t = 1;
                    p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.w(context, p17);
                    hVar.f360146s = 1;
                    hVar.f360148u = 1;
                }
                p17 = new java.lang.String("%4;7t>;28<fc.5*6").getBytes();
                hVar.f360147t = 0;
                p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.w(context, p17);
                hVar.f360146s = 1;
                hVar.f360148u = 1;
            } else {
                hVar.f360147t = 1;
                hVar.f360146s = 0;
                hVar.f360148u = 0;
            }
            g(p17);
            h36.h.A = (byte[]) hVar.f360138k.clone();
            try {
                android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) context.getSystemService("phone");
                bArr = telephonyManager.getSimState() == 5 ? telephonyManager.getSimOperatorName().getBytes() : new byte[0];
            } catch (java.lang.Throwable unused) {
                bArr = new byte[0];
            }
            hVar.f360139l = bArr;
            int i19 = this.f360115e.getSharedPreferences("WLOGIN_SERVER_INFO", 0).getInt(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52918x89383abf, 0);
            h36.h hVar2 = this.f360111a;
            try {
                i18 = ((android.net.ConnectivityManager) this.f360115e.getSystemService("connectivity")).getActiveNetworkInfo().getType();
            } catch (java.lang.Exception unused2) {
                i18 = 0;
            }
            hVar2.f360140m = i18 != 0 ? i18 == 1 ? 2 : 0 : 1;
            if (i19 != this.f360111a.f360140m) {
                android.content.SharedPreferences.Editor edit = this.f360115e.getSharedPreferences("WLOGIN_NET_RETRY_TYPE", 0).edit();
                edit.putInt("type", 0);
                edit.commit();
                android.content.Context context2 = this.f360115e;
                int i27 = this.f360111a.f360140m;
                android.content.SharedPreferences.Editor edit2 = context2.getSharedPreferences("WLOGIN_SERVER_INFO", 0).edit();
                edit2.putInt(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52918x89383abf, i27);
                edit2.commit();
            }
            h36.h hVar3 = this.f360111a;
            java.lang.String str = "wifi";
            try {
                android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) this.f360115e.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo.getType() == 0) {
                    java.lang.String extraInfo = activeNetworkInfo.getExtraInfo();
                    if (extraInfo != null) {
                        str = extraInfo;
                    }
                }
            } catch (java.lang.Exception unused3) {
            }
            hVar3.f360142o = str.getBytes();
            this.f360111a.f360149v = p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.m(this.f360115e);
            this.f360111a.f360141n = this.f360115e.getPackageName().getBytes();
            h36.h hVar4 = this.f360111a;
            try {
                bArr2 = this.f360115e.getPackageManager().getPackageInfo(new java.lang.String(hVar4.f360141n), 0).versionName.getBytes();
            } catch (java.lang.Exception unused4) {
                bArr2 = new byte[0];
            }
            hVar4.f360143p = bArr2;
            h36.h hVar5 = this.f360111a;
            try {
                android.content.pm.Signature[] signatureArr = this.f360115e.getPackageManager().getPackageInfo(new java.lang.String(hVar5.f360141n), 64).signatures;
                if (signatureArr != null && signatureArr.length > 0 && (signature = signatureArr[0]) != null) {
                    bArr3 = k36.d.k(signature.toByteArray());
                }
            } catch (java.lang.Throwable unused5) {
                bArr3 = new byte[0];
            }
            hVar5.f360144q = bArr3;
            java.lang.String str2 = android.os.Build.MODEL;
            if (str2 == null) {
                this.f360111a.f360145r = new byte[0];
            } else {
                this.f360111a.f360145r = str2.getBytes();
            }
            try {
                z17 = new java.io.File("/system/bin/su").exists();
            } catch (java.lang.Exception unused6) {
                z17 = false;
            }
            if (!z17) {
                try {
                    z18 = new java.io.File("/system/xbin/su").exists();
                } catch (java.lang.Exception unused7) {
                }
                if (!z18) {
                    try {
                        new java.io.File("/sbin/su").exists();
                    } catch (java.lang.Exception unused8) {
                    }
                }
            }
            this.f360111a.getClass();
            java.lang.String str3 = android.os.Build.VERSION.RELEASE;
            p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.c("WtloginHelper init ok: curi:" + p17 + "android version:" + (str3 == null ? "" : str3) + " release time:" + new java.lang.String("2026/01/12 19:09"));
        }
    }

    public byte[] a(long j17, byte[] bArr) {
        byte[] g17;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.c("user:" + j17 + " CheckPicture ...");
        synchronized (this) {
            h36.g gVar = this.f360113c;
            this.f360114d = gVar;
            g17 = gVar.g(bArr);
        }
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.c("user:" + j17 + " CheckPicture end");
        return g17;
    }

    public void b(long j17) {
        java.util.TreeMap l17;
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.c("user:" + j17 + " ClearUserSigInfo");
        h36.h hVar = this.f360111a;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        synchronized (hVar) {
            h36.e eVar = hVar.f360153z;
            synchronized (eVar) {
                try {
                    eVar.f360119b.remove(valueOf);
                    android.content.Context context = eVar.f360118a;
                    if (context != null && (l17 = eVar.l(context, "tk_file")) != null) {
                        l17.remove(valueOf);
                        synchronized (eVar) {
                            if ("tk_file" == "tk_file") {
                                eVar.p(l17, "tk_file");
                            }
                        }
                    }
                } finally {
                }
            }
        }
    }

    public byte[] c(long j17, long j18) {
        byte[] bArr;
        p3335x340bc8.p3336x27ae93cd.p3338xd3ab5596.C29273x78a22b4d a17 = this.f360111a.a(j17, j18);
        if (a17 == null || (bArr = a17.f73090xa7df1667) == null || bArr.length <= 0) {
            p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.c("userAccount:" + j17 + " appid:" + j18 + " GetA1ByAccount return: null");
            return null;
        }
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.c("userAccount:" + j17 + " appid:" + j18 + " GetA1ByAccount return: not null");
        return (byte[]) a17.f73090xa7df1667.clone();
    }

    public byte[] d(long j17) {
        int i17;
        byte[] bArr;
        synchronized (this) {
            j36.e eVar = this.f360111a.f360132e;
            i17 = eVar.f379062f;
            bArr = new byte[i17];
            if (i17 > 0) {
                java.lang.System.arraycopy(eVar.f379072d, eVar.f379064h, bArr, 0, i17);
            }
        }
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.c("user:" + j17 + " GetPicture data len:" + i17);
        return bArr;
    }

    public byte[] e(long j17, long j18, int i17, h36.c cVar, java.lang.String str) {
        byte[] bytes;
        byte[] f17;
        byte[] bArr;
        boolean z17;
        int i18;
        byte[] h17;
        java.lang.String str2 = str;
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.c("wtlogin login with GetStWithPasswd:user:" + j17 + " appid:" + j18 + " dwSigMap:" + i17 + " ...");
        if (str2 != null && str.length() > 16) {
            str2 = str2.substring(0, 16);
        }
        synchronized (this) {
            int i19 = h36.b.f360107a[cVar.ordinal()];
            int i27 = 2;
            if (i19 != 1) {
                if (i19 != 2) {
                    if (i19 != 3) {
                        return null;
                    }
                    byte[] c17 = c(j17, j18);
                    if (c17 != null && c17.length >= 16) {
                        bArr = c17;
                        z17 = true;
                    }
                    p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.c("USER_WITH_A1 tmp_pwd null");
                    return null;
                }
                if (str2 == null || str2.length() == 0) {
                    p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.c("USER_WITH_MD5 userPasswd null");
                    return null;
                }
                try {
                    f17 = (byte[]) str2.getBytes(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3125x9fd75533.f11976x3730806a).clone();
                    bArr = f17;
                    z17 = false;
                } catch (java.lang.Exception unused) {
                    return null;
                }
            } else {
                if (str2 == null || str2.length() == 0) {
                    p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.c("USER_WITH_PWD userPasswd null");
                    return null;
                }
                try {
                    bytes = str2.getBytes("ISO8859_1");
                } catch (java.io.UnsupportedEncodingException unused2) {
                    bytes = str2.getBytes();
                }
                f17 = new k36.d().f(bytes);
                bArr = f17;
                z17 = false;
            }
            h36.h hVar = this.f360111a;
            try {
                i18 = ((android.net.ConnectivityManager) this.f360115e.getSystemService("connectivity")).getActiveNetworkInfo().getType();
            } catch (java.lang.Exception unused3) {
                i18 = 0;
            }
            if (i18 == 0) {
                i27 = 1;
            } else if (i18 != 1) {
                i27 = 0;
            }
            hVar.f360140m = i27;
            h36.h hVar2 = this.f360111a;
            java.lang.String str3 = "wifi";
            try {
                android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) this.f360115e.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo.getType() == 0) {
                    java.lang.String extraInfo = activeNetworkInfo.getExtraInfo();
                    if (extraInfo != null) {
                        str3 = extraInfo;
                    }
                }
            } catch (java.lang.Exception unused4) {
            }
            hVar2.f360142o = str3.getBytes();
            h36.h hVar3 = this.f360111a;
            hVar3.f360133f = j17;
            hVar3.f360134g = j18;
            hVar3.f360131d = new j36.d();
            h36.i iVar = this.f360112b;
            this.f360114d = iVar;
            if (z17) {
                h17 = iVar.g(j18, 1, j17, 0, hVar3.f360152y, bArr, this.f360117g, this.f360116f, null, i17, 1L, 1, 0, 1, 102400, 1, hVar3.f360149v);
            } else {
                byte[] bArr2 = new byte[4];
                p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.t(bArr2, 0, java.lang.System.currentTimeMillis() / 1000);
                h36.i iVar2 = this.f360112b;
                h36.h hVar4 = this.f360111a;
                h17 = iVar2.h(j18, 1, j17, 0, hVar4.f360152y, bArr2, 0, bArr, this.f360117g, this.f360116f, null, i17, 1L, 1, 0, 1, 102400, 1, hVar4.f360149v);
            }
            p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.c("wtlogin login with GetStWithPasswd:user:" + j17 + " appid:" + j18 + " dwSigMap:" + i17 + " end");
            return h17;
        }
    }

    public int f(byte[] bArr) {
        int i17;
        if (bArr == null || bArr.length == 0 || this.f360114d == null) {
            return -1017;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("user:");
        h36.h hVar = this.f360111a;
        sb6.append(hVar.f360133f);
        sb6.append(" ResolveSvrData ...");
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.c(sb6.toString());
        h36.f fVar = this.f360114d;
        int length = bArr.length;
        if (length <= 17) {
            fVar.getClass();
            i17 = -1009;
        } else {
            fVar.f360123c = (length - 15) - 2;
            if (length > fVar.f360121a) {
                int i18 = length + 128;
                fVar.f360121a = i18;
                fVar.f360124d = new byte[i18];
            }
            fVar.f360122b = length;
            java.lang.System.arraycopy(bArr, 0, fVar.f360124d, 0, length);
            byte[] a17 = k36.e.a(fVar.f360124d, 16, fVar.f360123c, fVar.f360127g.f360130c);
            if (a17 == null) {
                i17 = com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ErrorCode.f15117xb77c61b3;
            } else {
                fVar.f360123c = a17.length;
                if (a17.length + 15 + 2 > fVar.f360121a) {
                    int length2 = a17.length + 15 + 2;
                    fVar.f360121a = length2;
                    byte[] bArr2 = new byte[length2];
                    java.lang.System.arraycopy(fVar.f360124d, 0, bArr2, 0, fVar.f360122b);
                    fVar.f360124d = bArr2;
                }
                fVar.f360122b = 0;
                java.lang.System.arraycopy(a17, 0, fVar.f360124d, 16, a17.length);
                fVar.f360122b = a17.length + 17 + fVar.f360122b;
                i17 = 0;
            }
            if (i17 >= 0) {
                i17 = fVar.e(fVar.f360124d, 16, fVar.f360123c);
            }
        }
        if (i17 == 1) {
            b(hVar.f360133f);
        }
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.c("user:" + hVar.f360133f + " ResolveSvrData ret=" + i17);
        return i17;
    }

    public final void g(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        h36.h hVar = this.f360111a;
        hVar.f360138k = bArr2;
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        int length = bArr.length + 1;
        byte[] bArr3 = new byte[length];
        bArr3[0] = 35;
        java.lang.System.arraycopy(bArr, 0, bArr3, 1, bArr.length);
        java.security.SecureRandom secureRandom = hVar.f360128a;
        byte[] seed = java.security.SecureRandom.getSeed(16);
        byte[] bArr4 = new byte[seed.length + length];
        java.lang.System.arraycopy(seed, 0, bArr4, 0, seed.length);
        java.lang.System.arraycopy(bArr3, 0, bArr4, seed.length, length);
        hVar.f360129b = k36.d.k(bArr4);
    }
}
