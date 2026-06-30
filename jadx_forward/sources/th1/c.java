package th1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: g, reason: collision with root package name */
    public static final th1.b f500842g;

    /* renamed from: h, reason: collision with root package name */
    public static final th1.c f500843h;

    /* renamed from: i, reason: collision with root package name */
    public static final th1.c f500844i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ th1.c[] f500845m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ rz5.a f500846n;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f500847d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f500848e;

    /* renamed from: f, reason: collision with root package name */
    public final int f500849f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
    static {
        /*
            th1.c r6 = new th1.c
            java.lang.String r1 = "Default"
            r2 = 0
            java.lang.String r3 = ""
            java.lang.String r4 = "/cgi-bin/mmbiz-bin/js-operatewxdata"
            r5 = 1133(0x46d, float:1.588E-42)
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            th1.c.f500843h = r6
            th1.c r0 = new th1.c
            java.lang.String r8 = "Important"
            r9 = 1
            java.lang.String r10 = "isImportant"
            java.lang.String r11 = "/cgi-bin/mmbiz-bin/js-operatewxdata-vip"
            r12 = 1912(0x778, float:2.679E-42)
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12)
            th1.c r1 = new th1.c
            java.lang.String r14 = "KeepAlive"
            r15 = 2
            java.lang.String r16 = "keepAlive"
            java.lang.String r17 = "/cgi-bin/mmbiz-bin/js-operatewxdata-keepalive"
            r18 = 4602(0x11fa, float:6.449E-42)
            r13 = r1
            r13.<init>(r14, r15, r16, r17, r18)
            th1.c.f500844i = r1
            th1.c r2 = new th1.c
            java.lang.String r8 = "Quic"
            r9 = 3
            java.lang.String r10 = "useQuic"
            java.lang.String r11 = "/cgi-bin/mmbiz-bin/js-operatewxdata-quic"
            r12 = 26843(0x68db, float:3.7615E-41)
            r7 = r2
            r7.<init>(r8, r9, r10, r11, r12)
            th1.c[] r0 = new th1.c[]{r6, r0, r1, r2}
            th1.c.f500845m = r0
            rz5.a r0 = rz5.b.a(r0)
            th1.c.f500846n = r0
            th1.b r1 = new th1.b
            r2 = 0
            r1.<init>(r2)
            th1.c.f500842g = r1
            kz5.h r0 = (kz5.h) r0
            kz5.e r1 = new kz5.e
            r1.<init>(r0)
        L5c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L99
            java.lang.Object r0 = r1.next()
            th1.c r0 = (th1.c) r0
            th1.c r3 = th1.c.f500843h
            r4 = 0
            r5 = 1
            if (r0 == r3) goto L7e
            java.lang.String r3 = r0.f500847d
            int r3 = r3.length()
            if (r3 <= 0) goto L78
            r3 = r5
            goto L79
        L78:
            r3 = r4
        L79:
            if (r3 == 0) goto L7c
            goto L7e
        L7c:
            r3 = r4
            goto L7f
        L7e:
            r3 = r5
        L7f:
            iz5.a.g(r2, r3)
            java.lang.String r3 = r0.f500848e
            int r3 = r3.length()
            if (r3 <= 0) goto L8c
            r3 = r5
            goto L8d
        L8c:
            r3 = r4
        L8d:
            iz5.a.g(r2, r3)
            int r0 = r0.f500849f
            if (r0 <= 0) goto L95
            r4 = r5
        L95:
            iz5.a.g(r2, r4)
            goto L5c
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th1.c.m166578x8c160ea9():void");
    }

    public c(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18) {
        this.f500847d = str2;
        this.f500848e = str3;
        this.f500849f = i18;
    }

    public static final th1.c a(org.json.JSONObject jSONObject) {
        f500842g.getClass();
        th1.c cVar = f500843h;
        if (jSONObject == null) {
            return cVar;
        }
        java.util.Iterator it = ((kz5.l1) kz5.i0.H(f500846n)).iterator();
        while (it.hasNext()) {
            th1.c cVar2 = (th1.c) it.next();
            if (cVar2 == cVar || jSONObject.optBoolean(cVar2.f500847d, false)) {
                return cVar2;
            }
        }
        return cVar;
    }

    /* renamed from: valueOf */
    public static th1.c m166579xdce0328(java.lang.String str) {
        return (th1.c) java.lang.Enum.valueOf(th1.c.class, str);
    }

    /* renamed from: values */
    public static th1.c[] m166580xcee59d22() {
        return (th1.c[]) f500845m.clone();
    }
}
