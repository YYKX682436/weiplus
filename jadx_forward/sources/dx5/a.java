package dx5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final dx5.a f326035f;

    /* renamed from: g, reason: collision with root package name */
    public static final dx5.a f326036g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ dx5.a[] f326037h;

    /* renamed from: d, reason: collision with root package name */
    public final int f326038d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f326039e;

    static {
        dx5.a aVar = new dx5.a("ON_FAILURE", 0, -1, com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a);
        f326035f = aVar;
        dx5.a aVar2 = new dx5.a("RESPONSE_FAIL", 1, -2, "response is not successful");
        dx5.a aVar3 = new dx5.a("RESPONSE_NO_BODY", 2, -3, "response body is null");
        dx5.a aVar4 = new dx5.a("RESPONSE_EXCEPTION", 3, -4, "handle response failed");
        f326036g = aVar4;
        dx5.a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        f326037h = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, int i18, java.lang.String str2) {
        this.f326038d = i18;
        this.f326039e = str2;
    }

    /* renamed from: valueOf */
    public static dx5.a m126422xdce0328(java.lang.String str) {
        return (dx5.a) java.lang.Enum.valueOf(dx5.a.class, str);
    }

    /* renamed from: values */
    public static dx5.a[] m126423xcee59d22() {
        return (dx5.a[]) f326037h.clone();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r3 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jz5.l a(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = r2.f326038d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r3 == 0) goto L17
            int r1 = r3.length()
            if (r1 <= 0) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            if (r1 == 0) goto L14
            goto L15
        L14:
            r3 = 0
        L15:
            if (r3 != 0) goto L19
        L17:
            java.lang.String r3 = r2.f326039e
        L19:
            jz5.l r1 = new jz5.l
            r1.<init>(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dx5.a.a(java.lang.String):jz5.l");
    }
}
