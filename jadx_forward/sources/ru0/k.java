package ru0;

/* loaded from: classes5.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f481215d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f481216e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f481217f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f481218g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(long j17, float f17, java.lang.String str, java.util.ArrayList arrayList) {
        super(1);
        this.f481215d = j17;
        this.f481216e = f17;
        this.f481217f = str;
        this.f481218g = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    @Override // yz5.l
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo146xb9724478(java.lang.Object r15) {
        /*
            r14 = this;
            org.json.JSONObject r15 = (org.json.JSONObject) r15
            java.lang.String r0 = "sent"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r15, r0)
            float r7 = r14.f481216e
            java.lang.String r8 = r14.f481217f
            java.lang.String r0 = "$mainLangId"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r8, r0)
            jz5.g r0 = ru0.m.f481222a
            java.lang.String r0 = "text"
            java.lang.String r0 = r15.optString(r0)
            if (r0 == 0) goto L23
            int r0 = r0.length()
            if (r0 != 0) goto L21
            goto L23
        L21:
            r0 = 0
            goto L24
        L23:
            r0 = 1
        L24:
            if (r0 == 0) goto L27
            goto L45
        L27:
            java.lang.String r0 = "ms_end"
            r1 = 0
            long r9 = r15.optLong(r0, r1)
            java.lang.String r0 = "ms_begin"
            long r11 = r15.optLong(r0, r1)
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 > 0) goto L3a
            goto L45
        L3a:
            r0 = r15
            r1 = r8
            r2 = r11
            r4 = r9
            r6 = r7
            java.util.List r0 = ru0.m.d(r0, r1, r2, r4, r6)
            if (r0 != 0) goto L47
        L45:
            r15 = 0
            goto L77
        L47:
            r45.me4 r13 = new r45.me4
            r13.<init>()
            r13.f461947h = r8
            r13.f461949m = r11
            long r1 = r14.f481215d
            long r1 = r1 + r11
            r13.f461943d = r1
            long r1 = r9 - r11
            float r1 = (float) r1
            float r1 = r1 / r7
            long r1 = (long) r1
            r13.f461944e = r1
            java.util.LinkedList r1 = r13.f461945f
            r1.addAll(r0)
            java.lang.String r0 = "translations"
            org.json.JSONArray r15 = r15.optJSONArray(r0)
            if (r15 != 0) goto L6a
            goto L76
        L6a:
            ru0.j r0 = new ru0.j
            r1 = r0
            r2 = r13
            r3 = r11
            r5 = r9
            r1.<init>(r2, r3, r5, r7)
            c75.c.d(r15, r0)
        L76:
            r15 = r13
        L77:
            if (r15 == 0) goto L7e
            java.util.ArrayList r0 = r14.f481218g
            r0.add(r15)
        L7e:
            jz5.f0 r15 = jz5.f0.f384359a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: ru0.k.mo146xb9724478(java.lang.Object):java.lang.Object");
    }
}
