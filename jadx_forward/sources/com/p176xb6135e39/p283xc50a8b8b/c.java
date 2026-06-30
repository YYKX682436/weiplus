package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public abstract class c extends com.p176xb6135e39.p283xc50a8b8b.f implements com.p176xb6135e39.p283xc50a8b8b.k8 {

    /* renamed from: memoizedSize */
    protected int f7867xd4e4d8eb = -1;

    public static boolean b(java.lang.Object obj, java.lang.Object obj2) {
        com.p176xb6135e39.p283xc50a8b8b.y yVar;
        com.p176xb6135e39.p283xc50a8b8b.y yVar2;
        boolean z17 = obj instanceof byte[];
        if (z17 && (obj2 instanceof byte[])) {
            return java.util.Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        if (z17) {
            byte[] bArr = (byte[]) obj;
            com.p176xb6135e39.p283xc50a8b8b.y yVar3 = com.p176xb6135e39.p283xc50a8b8b.y.f127245e;
            yVar = com.p176xb6135e39.p283xc50a8b8b.y.g(bArr, 0, bArr.length);
        } else {
            yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        if (obj2 instanceof byte[]) {
            byte[] bArr2 = (byte[]) obj2;
            com.p176xb6135e39.p283xc50a8b8b.y yVar4 = com.p176xb6135e39.p283xc50a8b8b.y.f127245e;
            yVar2 = com.p176xb6135e39.p283xc50a8b8b.y.g(bArr2, 0, bArr2.length);
        } else {
            yVar2 = (com.p176xb6135e39.p283xc50a8b8b.y) obj2;
        }
        return yVar.mo20935xb2c87fbf(yVar2);
    }

    public static java.util.Map c(java.util.List list) {
        if (list.isEmpty()) {
            return java.util.Collections.emptyMap();
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = list.iterator();
        com.p176xb6135e39.p283xc50a8b8b.k8 k8Var = (com.p176xb6135e39.p283xc50a8b8b.k8) it.next();
        com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e = k8Var.mo20560x84bb647e();
        com.p176xb6135e39.p283xc50a8b8b.b4 l17 = mo20560x84bb647e.l("key");
        com.p176xb6135e39.p283xc50a8b8b.b4 l18 = mo20560x84bb647e.l("value");
        java.lang.Object mo20728x746c4744 = k8Var.mo20728x746c4744(l18);
        if (mo20728x746c4744 instanceof com.p176xb6135e39.p283xc50a8b8b.y3) {
            mo20728x746c4744 = java.lang.Integer.valueOf(((com.p176xb6135e39.p283xc50a8b8b.y3) mo20728x746c4744).f127260e.f126753f);
        }
        hashMap.put(k8Var.mo20728x746c4744(l17), mo20728x746c4744);
        while (it.hasNext()) {
            com.p176xb6135e39.p283xc50a8b8b.k8 k8Var2 = (com.p176xb6135e39.p283xc50a8b8b.k8) it.next();
            java.lang.Object mo20728x746c47442 = k8Var2.mo20728x746c4744(l18);
            if (mo20728x746c47442 instanceof com.p176xb6135e39.p283xc50a8b8b.y3) {
                mo20728x746c47442 = java.lang.Integer.valueOf(((com.p176xb6135e39.p283xc50a8b8b.y3) mo20728x746c47442).f127260e.f126753f);
            }
            hashMap.put(k8Var2.mo20728x746c4744(l17), mo20728x746c47442);
        }
        return hashMap;
    }

    /* renamed from: compareFields */
    public static boolean m20577xa4a7a7fe(java.util.Map<com.p176xb6135e39.p283xc50a8b8b.b4, java.lang.Object> map, java.util.Map<com.p176xb6135e39.p283xc50a8b8b.b4, java.lang.Object> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (com.p176xb6135e39.p283xc50a8b8b.b4 b4Var : map.keySet()) {
            if (!map2.containsKey(b4Var)) {
                return false;
            }
            java.lang.Object obj = map.get(b4Var);
            java.lang.Object obj2 = map2.get(b4Var);
            if (b4Var.f126447m == com.p176xb6135e39.p283xc50a8b8b.a4.f126389h) {
                if (b4Var.d1()) {
                    java.util.List list = (java.util.List) obj;
                    java.util.List list2 = (java.util.List) obj2;
                    if (list.size() != list2.size()) {
                        return false;
                    }
                    for (int i17 = 0; i17 < list.size(); i17++) {
                        if (!b(list.get(i17), list2.get(i17))) {
                            return false;
                        }
                    }
                } else if (!b(obj, obj2)) {
                    return false;
                }
            } else if (b4Var.p()) {
                if (!com.p176xb6135e39.p283xc50a8b8b.e8.e(c((java.util.List) obj), c((java.util.List) obj2))) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    @java.lang.Deprecated
    /* renamed from: hashBoolean */
    public static int m20578x4208973a(boolean z17) {
        return z17 ? 1231 : 1237;
    }

    @java.lang.Deprecated
    /* renamed from: hashEnum */
    public static int m20579x8ce932f(com.p176xb6135e39.p283xc50a8b8b.p6 p6Var) {
        return p6Var.mo20656x276ffe3f();
    }

    @java.lang.Deprecated
    /* renamed from: hashEnumList */
    public static int m20580xc07886d(java.util.List<? extends com.p176xb6135e39.p283xc50a8b8b.p6> list) {
        java.util.Iterator<? extends com.p176xb6135e39.p283xc50a8b8b.p6> it = list.iterator();
        int i17 = 1;
        while (it.hasNext()) {
            i17 = (i17 * 31) + m20579x8ce932f(it.next());
        }
        return i17;
    }

    /* renamed from: hashFields */
    public static int m20581x10dda967(int i17, java.util.Map<com.p176xb6135e39.p283xc50a8b8b.b4, java.lang.Object> map) {
        int i18;
        int a17;
        for (java.util.Map.Entry<com.p176xb6135e39.p283xc50a8b8b.b4, java.lang.Object> entry : map.entrySet()) {
            com.p176xb6135e39.p283xc50a8b8b.b4 key = entry.getKey();
            java.lang.Object value = entry.getValue();
            int i19 = (i17 * 37) + key.f126442e.f127096f;
            if (key.p()) {
                i18 = i19 * 53;
                a17 = com.p176xb6135e39.p283xc50a8b8b.e8.a(c((java.util.List) value));
            } else if (key.f126447m != com.p176xb6135e39.p283xc50a8b8b.a4.f126390i) {
                i18 = i19 * 53;
                a17 = value.hashCode();
            } else if (key.d1()) {
                int i27 = i19 * 53;
                java.util.Iterator it = ((java.util.List) value).iterator();
                int i28 = 1;
                while (it.hasNext()) {
                    i28 = (i28 * 31) + ((com.p176xb6135e39.p283xc50a8b8b.p6) it.next()).mo20656x276ffe3f();
                }
                i17 = i27 + i28;
            } else {
                i18 = i19 * 53;
                a17 = ((com.p176xb6135e39.p283xc50a8b8b.p6) value).mo20656x276ffe3f();
            }
            i17 = i18 + a17;
        }
        return i17;
    }

    @java.lang.Deprecated
    /* renamed from: hashLong */
    public static int m20582x8d1c4aa(long j17) {
        return (int) (j17 ^ (j17 >>> 32));
    }

    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p283xc50a8b8b.k8)) {
            return false;
        }
        com.p176xb6135e39.p283xc50a8b8b.k8 k8Var = (com.p176xb6135e39.p283xc50a8b8b.k8) obj;
        if (mo20560x84bb647e() != k8Var.mo20560x84bb647e()) {
            return false;
        }
        return m20577xa4a7a7fe(mo20727xcee5d904(), k8Var.mo20727xcee5d904()) && mo20594xc6bf3ed().m20941xb2c87fbf(k8Var.mo20594xc6bf3ed());
    }

    /* renamed from: findInitializationErrors */
    public java.util.List<java.lang.String> m20584xb010ef84() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p176xb6135e39.p283xc50a8b8b.w8.b(this, "", arrayList);
        return arrayList;
    }

    /* renamed from: getInitializationErrorString */
    public java.lang.String m20585x23ada0c3() {
        return com.p176xb6135e39.p283xc50a8b8b.w8.a(m20584xb010ef84());
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.f
    /* renamed from: getMemoizedSerializedSize */
    public int mo20586x12373b05() {
        return this.f7867xd4e4d8eb;
    }

    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int m20581x10dda967 = (m20581x10dda967(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de + mo20560x84bb647e().hashCode(), mo20727xcee5d904()) * 29) + mo20594xc6bf3ed().m20942x8cdac1b();
        this.f7868x8a222005 = m20581x10dda967;
        return m20581x10dda967;
    }

    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20588xab31548(com.p176xb6135e39.p283xc50a8b8b.b bVar) {
        throw new java.lang.UnsupportedOperationException("Nested builder is not supported for this type.");
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.f
    /* renamed from: newUninitializedMessageException */
    public com.p176xb6135e39.p283xc50a8b8b.pa mo20589xb3590f03() {
        return com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) this);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.f
    /* renamed from: setMemoizedSerializedSize */
    public void mo20590x447ad711(int i17) {
        this.f7867xd4e4d8eb = i17;
    }

    /* renamed from: toString */
    public final java.lang.String m20591x9616526c() {
        java.util.logging.Logger logger = com.p176xb6135e39.p283xc50a8b8b.ia.f126734a;
        com.p176xb6135e39.p283xc50a8b8b.ga gaVar = com.p176xb6135e39.p283xc50a8b8b.ga.f126676b;
        gaVar.getClass();
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            gaVar.a(this, new com.p176xb6135e39.p283xc50a8b8b.ha(sb6, false, null));
            return sb6.toString();
        } catch (java.io.IOException e17) {
            throw new java.lang.IllegalStateException(e17);
        }
    }
}
