package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public final class r5 implements com.p314xaae8f345.mm.vfs.m5 {

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.vfs.t5 f294692g = new com.p314xaae8f345.mm.vfs.t5(new com.p314xaae8f345.mm.vfs.C22758x1f6ac662(""));

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.o5 f294693a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f294694b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.t5 f294695c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.Map f294696d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Map f294697e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f294698f = null;

    /* JADX WARN: Removed duplicated region for block: B:31:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r5(com.p314xaae8f345.mm.vfs.o5 r14) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.vfs.r5.<init>(com.tencent.mm.vfs.o5):void");
    }

    public java.util.Map a() {
        if (this.f294697e == null) {
            this.f294697e = java.util.Collections.unmodifiableMap(this.f294693a.f294647e);
        }
        return this.f294697e;
    }

    public com.p314xaae8f345.mm.vfs.q2 b(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.t5 t5Var = (com.p314xaae8f345.mm.vfs.t5) ((java.util.LinkedHashMap) this.f294693a.f294644b).get(str);
        if (t5Var == null) {
            return null;
        }
        return (com.p314xaae8f345.mm.vfs.q2) t5Var.a(a(), str);
    }

    public java.util.Map c() {
        if (this.f294696d == null) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) this.f294693a.f294644b).entrySet()) {
                linkedHashMap.put((java.lang.String) entry.getKey(), (com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb) ((com.p314xaae8f345.mm.vfs.t5) entry.getValue()).f294720a);
            }
            this.f294696d = java.util.Collections.unmodifiableMap(linkedHashMap);
        }
        return this.f294696d;
    }

    public com.p314xaae8f345.mm.vfs.q2 d(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.t5 t5Var = (com.p314xaae8f345.mm.vfs.t5) ((java.util.LinkedHashMap) this.f294693a.f294645c).get(str);
        if (t5Var == null) {
            return null;
        }
        return (com.p314xaae8f345.mm.vfs.q2) t5Var.a(a(), str);
    }

    public android.util.Pair e(java.lang.String str, java.lang.String[] strArr) {
        com.p314xaae8f345.mm.vfs.q5 q5Var;
        java.lang.String str2;
        com.p314xaae8f345.mm.vfs.q5 q5Var2;
        com.p314xaae8f345.mm.vfs.q2 q2Var;
        java.lang.String str3 = null;
        if (str == null || str.isEmpty()) {
            return null;
        }
        java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, true, false);
        java.lang.String replace = l17.replace('/', (char) 0);
        java.util.List list = this.f294694b;
        int binarySearch = java.util.Collections.binarySearch(list, replace);
        if (binarySearch >= 0) {
            q5Var2 = (com.p314xaae8f345.mm.vfs.q5) list.get(binarySearch);
            str2 = "";
        } else {
            int i17 = (-binarySearch) - 2;
            while (true) {
                if (i17 >= 0) {
                    q5Var = (com.p314xaae8f345.mm.vfs.q5) list.get(i17);
                    if (replace.startsWith(q5Var.f294600d) && replace.charAt(q5Var.f294600d.length()) == 0) {
                        break;
                    }
                    i17 = q5Var.f294671f;
                } else {
                    q5Var = null;
                    break;
                }
            }
            if (i17 >= 0) {
                l17 = l17.substring(q5Var.f294600d.length() + 1);
            } else if (!l17.isEmpty() && l17.charAt(0) == 0) {
                l17 = l17.substring(1);
            }
            str2 = l17;
            q5Var2 = q5Var;
        }
        if (q5Var2 == null) {
            q2Var = (com.p314xaae8f345.mm.vfs.q2) this.f294695c.a(a(), "(root)");
        } else {
            com.p314xaae8f345.mm.vfs.q2 q2Var2 = q5Var2.f294672g;
            java.lang.String str4 = q5Var2.f294601e;
            if (q2Var2 == null) {
                q5Var2.f294672g = b(str4);
            }
            q2Var = q5Var2.f294672g;
            str3 = str4;
        }
        if (strArr != null) {
            strArr[0] = str3;
        }
        return new android.util.Pair(q2Var, str2);
    }

    public com.p314xaae8f345.mm.vfs.s5 f(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.t5 t5Var = (com.p314xaae8f345.mm.vfs.t5) ((java.util.LinkedHashMap) this.f294693a.f294643a).get(str);
        if (t5Var == null) {
            return null;
        }
        return (com.p314xaae8f345.mm.vfs.s5) t5Var.a(a(), str);
    }

    /* renamed from: toString */
    public java.lang.String m82465x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("schemes: ");
        com.p314xaae8f345.mm.vfs.o5 o5Var = this.f294693a;
        sb6.append(o5Var.f294643a.size());
        sb6.append(", fileSystems: ");
        sb6.append(o5Var.f294644b.size());
        sb6.append(", mountPoints: ");
        sb6.append(((java.util.TreeMap) o5Var.f294646d).size());
        sb6.append(" (");
        sb6.append(this.f294694b);
        sb6.append(" active), envVars: ");
        sb6.append(o5Var.f294647e.size());
        return sb6.toString();
    }
}
