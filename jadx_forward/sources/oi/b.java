package oi;

/* loaded from: classes12.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public int f427065a;

    /* renamed from: b, reason: collision with root package name */
    public int f427066b;

    /* renamed from: c, reason: collision with root package name */
    public int f427067c;

    /* renamed from: d, reason: collision with root package name */
    public int f427068d;

    /* renamed from: e, reason: collision with root package name */
    public int f427069e;

    /* renamed from: f, reason: collision with root package name */
    public long f427070f;

    /* renamed from: g, reason: collision with root package name */
    public int f427071g;

    /* renamed from: h, reason: collision with root package name */
    public pi.e f427072h;

    /* renamed from: i, reason: collision with root package name */
    public long f427073i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final oi.d f427074j;

    /* renamed from: k, reason: collision with root package name */
    public long f427075k;

    /* renamed from: l, reason: collision with root package name */
    public final oi.a[] f427076l;

    public b(oi.d dVar) {
        this.f427074j = dVar;
        if (dVar == oi.d.TEXTURE) {
            this.f427076l = new oi.a[6];
        }
    }

    public java.lang.String a() {
        long j17 = this.f427073i;
        return j17 != 0 ? com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p578x30f523.C4700x74d81a92.m41158xab5661d(j17) : "";
    }

    public long b() {
        if (this.f427074j != oi.d.TEXTURE) {
            return this.f427075k;
        }
        long j17 = 0;
        for (oi.a aVar : this.f427076l) {
            if (aVar != null) {
                j17 += aVar.f427053a;
            }
        }
        return j17;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15, int r16, int r17, long r18, long r20, pi.e r22, long r23) {
        /*
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = 3553(0xde1, float:4.979E-42)
            r3 = -1
            r4 = 0
            if (r1 == r2) goto L21
            r2 = 32879(0x806f, float:4.6073E-41)
            if (r1 == r2) goto L21
            r2 = 35866(0x8c1a, float:5.0259E-41)
            if (r1 == r2) goto L21
            switch(r1) {
                case 34069: goto L21;
                case 34070: goto L1f;
                case 34071: goto L1d;
                case 34072: goto L1b;
                case 34073: goto L19;
                case 34074: goto L17;
                default: goto L15;
            }
        L15:
            r2 = r3
            goto L22
        L17:
            r2 = 5
            goto L22
        L19:
            r2 = 4
            goto L22
        L1b:
            r2 = 3
            goto L22
        L1d:
            r2 = 2
            goto L22
        L1f:
            r2 = 1
            goto L22
        L21:
            r2 = r4
        L22:
            if (r2 != r3) goto L3b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "setTexturesInfo faceId = -1, target = "
            r2.<init>(r3)
            r2.append(r8)
            java.lang.String r1 = r2.toString()
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r3 = "MicroMsg.OpenGLHook"
            oj.j.b(r3, r1, r2)
            return
        L3b:
            long r3 = r0.f427073i
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L46
            com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p578x30f523.C4700x74d81a92.m41200xb27602fe(r3)
        L46:
            pi.e r3 = r0.f427072h
            if (r3 == 0) goto L4d
            r22.a()
        L4d:
            r3 = r22
            r0.f427072h = r3
            r3 = r23
            r0.f427073i = r3
            oi.a[] r3 = r0.f427076l
            r4 = r3[r2]
            if (r4 != 0) goto L60
            oi.a r4 = new oi.a
            r4.<init>()
        L60:
            r4.f427054b = r1
            r1 = r17
            r4.f427055c = r1
            r5 = r18
            r4.f427056d = r5
            r1 = r9
            r4.f427057e = r1
            r1 = r10
            r4.f427058f = r1
            r1 = r11
            r4.f427059g = r1
            r1 = r12
            r4.f427060h = r1
            r1 = r13
            r4.f427061i = r1
            r1 = r14
            r4.f427062j = r1
            r1 = r15
            r4.f427063k = r1
            r1 = r16
            r4.f427064l = r1
            r5 = r20
            r4.f427053a = r5
            r3[r2] = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.b.c(int, int, int, int, int, int, int, int, int, int, long, long, pi.e, long):void");
    }

    /* renamed from: toString */
    public java.lang.String m151419x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MemoryInfo{target=");
        sb6.append(this.f427065a);
        sb6.append(", internalFormat=");
        sb6.append(this.f427066b);
        sb6.append(", width=");
        sb6.append(this.f427067c);
        sb6.append(", height=");
        sb6.append(this.f427068d);
        sb6.append(", id=");
        sb6.append(this.f427069e);
        sb6.append(", eglContextId=");
        sb6.append(this.f427070f);
        sb6.append(", usage=");
        sb6.append(this.f427071g);
        sb6.append(", javaStack='");
        pi.e eVar = this.f427072h;
        sb6.append(eVar == null ? "" : eVar.f436031a);
        sb6.append("', nativeStack='");
        sb6.append(a());
        sb6.append("', resType=");
        sb6.append(this.f427074j);
        sb6.append(", size=");
        sb6.append(b());
        sb6.append(", faces=");
        sb6.append(java.util.Arrays.toString(this.f427076l));
        sb6.append('}');
        return sb6.toString();
    }
}
