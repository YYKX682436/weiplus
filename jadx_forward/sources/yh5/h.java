package yh5;

/* loaded from: classes12.dex */
public final class h implements mf3.k, zh5.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final bw1.l f543969a;

    public h(bw1.l analyseItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(analyseItem, "analyseItem");
        this.f543969a = analyseItem;
    }

    @Override // mf3.k
    public gg3.c a() {
        java.lang.String mo2110x5db1b11 = mo2110x5db1b11();
        bw1.l lVar = this.f543969a;
        java.lang.String str = lVar.f106344c;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = lVar.f106345d;
        java.lang.String str3 = str2 != null ? str2 : "";
        int i17 = lVar.f106352k;
        return new gg3.c(mo2110x5db1b11, str, str3, null, i17 < 0 ? 0L : i17 * 1000, false, 40, null);
    }

    @Override // zh5.j0
    public java.lang.String b() {
        return null;
    }

    @Override // mf3.k
    public eg3.i c() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if ((r0.length() > 0) != false) goto L13;
     */
    @Override // mf3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public sf3.g e() {
        /*
            r11 = this;
            bw1.l r0 = r11.f543969a
            int r1 = r0.f106343b
            r2 = 3
            if (r1 != r2) goto L3c
            java.lang.String r0 = r0.f106344c
            r1 = 0
            if (r0 == 0) goto L18
            int r2 = r0.length()
            if (r2 <= 0) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            if (r2 == 0) goto L18
            goto L19
        L18:
            r0 = r1
        L19:
            if (r0 != 0) goto L1c
            return r1
        L1c:
            java.lang.String r4 = r11.mo2110x5db1b11()
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            sf3.m r1 = sf3.m.f488939h
            r3.put(r1, r0)
            sf3.g r0 = new sf3.g
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 60
            r10 = 0
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            sf3.g r0 = r0.a(r1)
            return r0
        L3c:
            java.lang.String r3 = r11.mo2110x5db1b11()
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            sf3.m r10 = sf3.m.f488937f
            java.lang.String r0 = r0.f106345d
            java.lang.String r1 = "filePath"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
            r2.put(r10, r0)
            sf3.g r0 = new sf3.g
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 60
            r9 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            sf3.g r0 = r0.a(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yh5.h.e():sf3.g");
    }

    @Override // mf3.k
    public java.lang.String g() {
        java.lang.String filePath = this.f543969a.f106345d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(filePath, "filePath");
        return filePath;
    }

    @Override // mf3.k
    /* renamed from: getId */
    public java.lang.String mo2110x5db1b11() {
        java.lang.String filePath = this.f543969a.f106345d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(filePath, "filePath");
        return filePath;
    }

    @Override // mf3.k
    /* renamed from: getType */
    public mf3.u mo2109xfb85f7b0() {
        int i17 = this.f543969a.f106343b;
        return i17 == 3 ? mf3.u.f407657f : i17 == 1 ? mf3.u.f407656e : mf3.u.f407655d;
    }
}
