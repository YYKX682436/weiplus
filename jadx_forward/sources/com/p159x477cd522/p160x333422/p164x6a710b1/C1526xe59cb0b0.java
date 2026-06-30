package com.p159x477cd522.p160x333422.p164x6a710b1;

/* renamed from: com.eclipsesource.mmv8.utils.V8ObjectUtils */
/* loaded from: classes7.dex */
public class C1526xe59cb0b0 {

    /* renamed from: IGNORE */
    private static final java.lang.Object f5059x809ef1d2 = new java.lang.Object();

    /* renamed from: DEFAULT_TYPE_ADAPTER */
    private static final com.p159x477cd522.p160x333422.p164x6a710b1.InterfaceC1523x4a2d9e95 f5058x6cdfc888 = new com.p159x477cd522.p160x333422.p164x6a710b1.C1526xe59cb0b0.DefaultTypeAdapter();

    /* renamed from: com.eclipsesource.mmv8.utils.V8ObjectUtils$DefaultTypeAdapter */
    /* loaded from: classes7.dex */
    public static class DefaultTypeAdapter implements com.p159x477cd522.p160x333422.p164x6a710b1.InterfaceC1523x4a2d9e95 {
        @Override // com.p159x477cd522.p160x333422.p164x6a710b1.InterfaceC1523x4a2d9e95
        /* renamed from: adapt */
        public java.lang.Object mo16646x585d722(int i17, java.lang.Object obj) {
            return com.p159x477cd522.p160x333422.p164x6a710b1.InterfaceC1523x4a2d9e95.f5045x86df6221;
        }
    }

    /* renamed from: com.eclipsesource.mmv8.utils.V8ObjectUtils$ListWrapper */
    /* loaded from: classes7.dex */
    public static class ListWrapper {

        /* renamed from: list */
        private java.util.List<? extends java.lang.Object> f5060x32b09e;

        public ListWrapper(java.util.List<? extends java.lang.Object> list) {
            this.f5060x32b09e = list;
        }

        /* renamed from: equals */
        public boolean m16699xb2c87fbf(java.lang.Object obj) {
            return (obj instanceof com.p159x477cd522.p160x333422.p164x6a710b1.C1526xe59cb0b0.ListWrapper) && ((com.p159x477cd522.p160x333422.p164x6a710b1.C1526xe59cb0b0.ListWrapper) obj).f5060x32b09e == this.f5060x32b09e;
        }

        /* renamed from: hashCode */
        public int m16700x8cdac1b() {
            return java.lang.System.identityHashCode(this.f5060x32b09e);
        }
    }

    private C1526xe59cb0b0() {
    }

    /* renamed from: getTypedArray */
    public static java.lang.Object m16662xb3a79405(com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7, int i17, java.lang.Object obj) {
        int mo16304xbe0e3ae6 = c1469x28b0ccd7.mo16304xbe0e3ae6();
        if (i17 == 1) {
            int[] iArr = (int[]) obj;
            if (iArr == null || iArr.length < mo16304xbe0e3ae6) {
                iArr = new int[mo16304xbe0e3ae6];
            }
            c1469x28b0ccd7.mo16295x9dd4e46b(0, mo16304xbe0e3ae6, iArr);
            return iArr;
        }
        if (i17 == 2) {
            double[] dArr = (double[]) obj;
            if (dArr == null || dArr.length < mo16304xbe0e3ae6) {
                dArr = new double[mo16304xbe0e3ae6];
            }
            c1469x28b0ccd7.mo16292xabc53a8c(0, mo16304xbe0e3ae6, dArr);
            return dArr;
        }
        if (i17 == 3) {
            boolean[] zArr = (boolean[]) obj;
            if (zArr == null || zArr.length < mo16304xbe0e3ae6) {
                zArr = new boolean[mo16304xbe0e3ae6];
            }
            c1469x28b0ccd7.mo16286xf36c56c1(0, mo16304xbe0e3ae6, zArr);
            return zArr;
        }
        if (i17 == 4) {
            java.lang.String[] strArr = (java.lang.String[]) obj;
            if (strArr == null || strArr.length < mo16304xbe0e3ae6) {
                strArr = new java.lang.String[mo16304xbe0e3ae6];
            }
            c1469x28b0ccd7.mo16299xcda3de4c(0, mo16304xbe0e3ae6, strArr);
            return strArr;
        }
        if (i17 == 9) {
            byte[] bArr = (byte[]) obj;
            if (bArr == null || bArr.length < mo16304xbe0e3ae6) {
                bArr = new byte[mo16304xbe0e3ae6];
            }
            c1469x28b0ccd7.mo16289x743b66b5(0, mo16304xbe0e3ae6, bArr);
            return bArr;
        }
        throw new java.lang.RuntimeException("Unsupported bulk load type: " + i17);
    }

    /* renamed from: getV8Result */
    public static java.lang.Object m16663x81b496b5(com.p159x477cd522.p160x333422.V8 v86, java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        java.util.Hashtable hashtable = new java.util.Hashtable();
        try {
            java.lang.Object m16664x81b496b5 = m16664x81b496b5(v86, obj, hashtable);
            if (m16664x81b496b5 instanceof com.p159x477cd522.p160x333422.C1477x4679881) {
                return ((com.p159x477cd522.p160x333422.C1477x4679881) m16664x81b496b5).mo16314x3686e8();
            }
            java.util.Iterator it = hashtable.values().iterator();
            while (it.hasNext()) {
                ((com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) it.next()).mo15825x41012807();
            }
            return m16664x81b496b5;
        } finally {
            java.util.Iterator it6 = hashtable.values().iterator();
            while (it6.hasNext()) {
                ((com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) it6.next()).mo15825x41012807();
            }
        }
    }

    /* renamed from: getValue */
    public static java.lang.Object m16671x754a37bb(java.lang.Object obj) {
        return m16673x754a37bb(obj, f5058x6cdfc888);
    }

    /* renamed from: pushValue */
    public static void m16674xd1a85277(com.p159x477cd522.p160x333422.V8 v86, com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7, java.lang.Object obj) {
        java.util.Hashtable hashtable = new java.util.Hashtable();
        try {
            m16675xd1a85277(v86, c1469x28b0ccd7, obj, hashtable);
        } finally {
            java.util.Iterator it = hashtable.values().iterator();
            while (it.hasNext()) {
                ((com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) it.next()).mo15825x41012807();
            }
        }
    }

    /* renamed from: setValue */
    private static void m16678x53d8522f(com.p159x477cd522.p160x333422.V8 v86, com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881, java.lang.String str, java.lang.Object obj, java.util.Map<java.lang.Object, com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef> map) {
        if (obj == null) {
            c1477x4679881.mo16315xb9e72daf(str);
            return;
        }
        if (obj instanceof java.lang.Integer) {
            c1477x4679881.add(str, ((java.lang.Integer) obj).intValue());
            return;
        }
        if (obj instanceof java.lang.Long) {
            c1477x4679881.add(str, ((java.lang.Long) obj).longValue());
            return;
        }
        if (obj instanceof java.lang.Double) {
            c1477x4679881.add(str, ((java.lang.Double) obj).doubleValue());
            return;
        }
        if (obj instanceof java.lang.Float) {
            c1477x4679881.add(str, ((java.lang.Float) obj).floatValue());
            return;
        }
        if (obj instanceof java.lang.String) {
            c1477x4679881.add(str, (java.lang.String) obj);
            return;
        }
        if (obj instanceof java.lang.Boolean) {
            c1477x4679881.add(str, ((java.lang.Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof com.p159x477cd522.p160x333422.C1477x4679881) {
            c1477x4679881.add(str, (com.p159x477cd522.p160x333422.C1477x4679881) obj);
            return;
        }
        if (obj instanceof com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.AbstractC1536x3c38b82f) {
            c1477x4679881.add(str, m16697x273c8e4c(v86, (com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.AbstractC1536x3c38b82f) obj, map));
            return;
        }
        if (obj instanceof com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.C1530x71a3b3d9) {
            c1477x4679881.add(str, m16691xe71aa15c(v86, (com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.C1530x71a3b3d9) obj, map));
            return;
        }
        if (obj instanceof java.util.Map) {
            c1477x4679881.add(str, m16694xff5afbfc(v86, (java.util.Map<java.lang.String, ? extends java.lang.Object>) obj, map));
        } else if (obj instanceof java.util.List) {
            c1477x4679881.add(str, m16688x62558dfc(v86, (java.util.List<? extends java.lang.Object>) obj, map));
        } else {
            throw new java.lang.IllegalStateException("Unsupported Object of type: " + obj.getClass());
        }
    }

    /* renamed from: toList */
    public static java.util.List<? super java.lang.Object> m16680xcc327db9(com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7) {
        return m16681xcc327db9(c1469x28b0ccd7, f5058x6cdfc888);
    }

    /* renamed from: toMap */
    public static java.util.Map<java.lang.String, ? super java.lang.Object> m16683x69648e1(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881) {
        return m16684x69648e1(c1477x4679881, f5058x6cdfc888);
    }

    /* renamed from: toTypedArray */
    private static java.lang.Object m16686x47e128ea(com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7) {
        int mo16301xfb85f7b0 = c1469x28b0ccd7.mo16301xfb85f7b0();
        java.nio.ByteBuffer m16464xeed4b35e = ((com.p159x477cd522.p160x333422.C1487x63ed6051) c1469x28b0ccd7).m16464xeed4b35e();
        if (mo16301xfb85f7b0 == 1) {
            return new com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.C1534x535ae88b(m16464xeed4b35e);
        }
        if (mo16301xfb85f7b0 == 2) {
            return new com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.C1532x9bf3147f(m16464xeed4b35e);
        }
        if (mo16301xfb85f7b0 == 9) {
            return new com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.C1535x45f0ad90(m16464xeed4b35e);
        }
        switch (mo16301xfb85f7b0) {
            case 11:
                return new com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.C1539x62533cdb(m16464xeed4b35e);
            case 12:
                return new com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.C1540xc1275f1d(m16464xeed4b35e);
            case 13:
                return new com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.C1533xf061d485(m16464xeed4b35e);
            case 14:
                return new com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.C1537x60512e9a(m16464xeed4b35e);
            case 15:
                return new com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.C1538xc34a42a0(m16464xeed4b35e);
            case 16:
                return new com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.C1531xf9d6b17e(m16464xeed4b35e);
            default:
                throw new java.lang.IllegalStateException("Known Typed Array type: " + com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef.m16470x3b924fb4(mo16301xfb85f7b0));
        }
    }

    /* renamed from: toV8Array */
    public static com.p159x477cd522.p160x333422.C1469x28b0ccd7 m16687x62558dfc(com.p159x477cd522.p160x333422.V8 v86, java.util.List<? extends java.lang.Object> list) {
        java.util.Hashtable hashtable = new java.util.Hashtable();
        try {
            return m16688x62558dfc(v86, list, hashtable).mo16314x3686e8();
        } finally {
            java.util.Iterator it = hashtable.values().iterator();
            while (it.hasNext()) {
                ((com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) it.next()).mo15825x41012807();
            }
        }
    }

    /* renamed from: toV8ArrayBuffer */
    private static com.p159x477cd522.p160x333422.C1470x40840ff7 m16691xe71aa15c(com.p159x477cd522.p160x333422.V8 v86, com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.C1530x71a3b3d9 c1530x71a3b3d9, java.util.Map<java.lang.Object, com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef> map) {
        if (map.containsKey(c1530x71a3b3d9)) {
            return (com.p159x477cd522.p160x333422.C1470x40840ff7) map.get(c1530x71a3b3d9);
        }
        com.p159x477cd522.p160x333422.C1470x40840ff7 c1470x40840ff7 = new com.p159x477cd522.p160x333422.C1470x40840ff7(v86, c1530x71a3b3d9.m16703xeed4b35e());
        map.put(c1530x71a3b3d9, c1470x40840ff7);
        return c1470x40840ff7;
    }

    /* renamed from: toV8Object */
    public static com.p159x477cd522.p160x333422.C1477x4679881 m16693xff5afbfc(com.p159x477cd522.p160x333422.V8 v86, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        java.util.Hashtable hashtable = new java.util.Hashtable();
        try {
            return m16694xff5afbfc(v86, map, hashtable).mo16314x3686e8();
        } finally {
            java.util.Iterator it = hashtable.values().iterator();
            while (it.hasNext()) {
                ((com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) it.next()).mo15825x41012807();
            }
        }
    }

    /* renamed from: toV8TypedArray */
    private static com.p159x477cd522.p160x333422.C1487x63ed6051 m16697x273c8e4c(com.p159x477cd522.p160x333422.V8 v86, com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.AbstractC1536x3c38b82f abstractC1536x3c38b82f, java.util.Map<java.lang.Object, com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef> map) {
        if (map.containsKey(abstractC1536x3c38b82f)) {
            return (com.p159x477cd522.p160x333422.C1487x63ed6051) map.get(abstractC1536x3c38b82f);
        }
        com.p159x477cd522.p160x333422.C1470x40840ff7 c1470x40840ff7 = new com.p159x477cd522.p160x333422.C1470x40840ff7(v86, abstractC1536x3c38b82f.m16709xeed4b35e());
        try {
            com.p159x477cd522.p160x333422.C1487x63ed6051 c1487x63ed6051 = new com.p159x477cd522.p160x333422.C1487x63ed6051(v86, c1470x40840ff7, abstractC1536x3c38b82f.mo16707xfb85f7b0(), 0, abstractC1536x3c38b82f.mo16708xbe0e3ae6());
            map.put(abstractC1536x3c38b82f, c1487x63ed6051);
            return c1487x63ed6051;
        } finally {
            c1470x40840ff7.mo15825x41012807();
        }
    }

    /* renamed from: getValue */
    public static java.lang.Object m16673x754a37bb(java.lang.Object obj, com.p159x477cd522.p160x333422.p164x6a710b1.InterfaceC1523x4a2d9e95 interfaceC1523x4a2d9e95) {
        com.p159x477cd522.p160x333422.p164x6a710b1.C1525x4d6875a c1525x4d6875a = new com.p159x477cd522.p160x333422.p164x6a710b1.C1525x4d6875a();
        try {
            return obj instanceof com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef ? m16672x754a37bb(obj, ((com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) obj).m16474x31b023d2(), c1525x4d6875a, interfaceC1523x4a2d9e95) : obj;
        } finally {
            c1525x4d6875a.mo15825x41012807();
        }
    }

    /* renamed from: toList */
    public static java.util.List<? super java.lang.Object> m16681xcc327db9(com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7, com.p159x477cd522.p160x333422.p164x6a710b1.InterfaceC1523x4a2d9e95 interfaceC1523x4a2d9e95) {
        com.p159x477cd522.p160x333422.p164x6a710b1.C1525x4d6875a c1525x4d6875a = new com.p159x477cd522.p160x333422.p164x6a710b1.C1525x4d6875a();
        try {
            return m16682xcc327db9(c1469x28b0ccd7, c1525x4d6875a, interfaceC1523x4a2d9e95);
        } finally {
            c1525x4d6875a.mo15825x41012807();
        }
    }

    /* renamed from: toMap */
    public static java.util.Map<java.lang.String, ? super java.lang.Object> m16684x69648e1(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881, com.p159x477cd522.p160x333422.p164x6a710b1.InterfaceC1523x4a2d9e95 interfaceC1523x4a2d9e95) {
        com.p159x477cd522.p160x333422.p164x6a710b1.C1525x4d6875a c1525x4d6875a = new com.p159x477cd522.p160x333422.p164x6a710b1.C1525x4d6875a();
        try {
            return m16685x69648e1(c1477x4679881, c1525x4d6875a, interfaceC1523x4a2d9e95);
        } finally {
            c1525x4d6875a.mo15825x41012807();
        }
    }

    /* renamed from: toV8ArrayBuffer */
    private static com.p159x477cd522.p160x333422.C1470x40840ff7 m16692xe71aa15c(com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad interfaceC1471x242ee8ad, com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.C1530x71a3b3d9 c1530x71a3b3d9, java.util.Map<java.lang.Object, com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef> map) {
        if (map.containsKey(c1530x71a3b3d9)) {
            return (com.p159x477cd522.p160x333422.C1470x40840ff7) map.get(c1530x71a3b3d9);
        }
        com.p159x477cd522.p160x333422.C1470x40840ff7 mo16398x9edb0a57 = interfaceC1471x242ee8ad.mo16398x9edb0a57(c1530x71a3b3d9.m16703xeed4b35e());
        map.put(c1530x71a3b3d9, mo16398x9edb0a57);
        return mo16398x9edb0a57;
    }

    /* renamed from: toList */
    private static java.util.List<? super java.lang.Object> m16682xcc327db9(com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7, com.p159x477cd522.p160x333422.p164x6a710b1.C1525x4d6875a<java.lang.Object> c1525x4d6875a, com.p159x477cd522.p160x333422.p164x6a710b1.InterfaceC1523x4a2d9e95 interfaceC1523x4a2d9e95) {
        java.lang.Object obj;
        if (c1469x28b0ccd7 == null) {
            return java.util.Collections.emptyList();
        }
        if (c1525x4d6875a.containsKey(c1469x28b0ccd7)) {
            return (java.util.List) c1525x4d6875a.get(c1469x28b0ccd7);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        c1525x4d6875a.put2((com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) c1469x28b0ccd7, (com.p159x477cd522.p160x333422.C1469x28b0ccd7) arrayList);
        for (int i17 = 0; i17 < c1469x28b0ccd7.mo16304xbe0e3ae6(); i17++) {
            try {
                obj = c1469x28b0ccd7.get(i17);
                try {
                    java.lang.Object m16672x754a37bb = m16672x754a37bb(obj, c1469x28b0ccd7.mo16302xfb85f7b0(i17), c1525x4d6875a, interfaceC1523x4a2d9e95);
                    if (m16672x754a37bb != f5059x809ef1d2) {
                        arrayList.add(m16672x754a37bb);
                    }
                    if (obj instanceof com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98) {
                        ((com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98) obj).mo15825x41012807();
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    if (obj instanceof com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98) {
                        ((com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98) obj).mo15825x41012807();
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                obj = null;
            }
        }
        return arrayList;
    }

    /* renamed from: toMap */
    private static java.util.Map<java.lang.String, ? super java.lang.Object> m16685x69648e1(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881, com.p159x477cd522.p160x333422.p164x6a710b1.C1525x4d6875a<java.lang.Object> c1525x4d6875a, com.p159x477cd522.p160x333422.p164x6a710b1.InterfaceC1523x4a2d9e95 interfaceC1523x4a2d9e95) {
        java.lang.Object obj;
        if (c1477x4679881 == null) {
            return java.util.Collections.emptyMap();
        }
        if (c1525x4d6875a.containsKey(c1477x4679881)) {
            return (java.util.Map) c1525x4d6875a.get(c1477x4679881);
        }
        com.p159x477cd522.p160x333422.p164x6a710b1.C1527x83350745 c1527x83350745 = new com.p159x477cd522.p160x333422.p164x6a710b1.C1527x83350745();
        c1525x4d6875a.put2((com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) c1477x4679881, (com.p159x477cd522.p160x333422.C1477x4679881) c1527x83350745);
        for (java.lang.String str : c1477x4679881.mo16329xfb81966a()) {
            try {
                obj = c1477x4679881.get(str);
                try {
                    java.lang.Object m16672x754a37bb = m16672x754a37bb(obj, c1477x4679881.mo16333xfb85f7b0(str), c1525x4d6875a, interfaceC1523x4a2d9e95);
                    if (m16672x754a37bb != f5059x809ef1d2) {
                        c1527x83350745.put((com.p159x477cd522.p160x333422.p164x6a710b1.C1527x83350745) str, (java.lang.String) m16672x754a37bb);
                    }
                    if (obj instanceof com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98) {
                        ((com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98) obj).mo15825x41012807();
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    if (obj instanceof com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98) {
                        ((com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98) obj).mo15825x41012807();
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                obj = null;
            }
        }
        return c1527x83350745;
    }

    /* renamed from: getValue */
    public static java.lang.Object m16667x754a37bb(com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7, int i17) {
        java.lang.Object obj;
        com.p159x477cd522.p160x333422.p164x6a710b1.C1525x4d6875a c1525x4d6875a = new com.p159x477cd522.p160x333422.p164x6a710b1.C1525x4d6875a();
        try {
            obj = c1469x28b0ccd7.get(i17);
            try {
                java.lang.Object m16672x754a37bb = m16672x754a37bb(obj, c1469x28b0ccd7.mo16302xfb85f7b0(i17), c1525x4d6875a, f5058x6cdfc888);
                if (obj instanceof com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98) {
                    ((com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98) obj).mo15825x41012807();
                }
                c1525x4d6875a.mo15825x41012807();
                return m16672x754a37bb;
            } catch (java.lang.Throwable th6) {
                th = th6;
                if (obj instanceof com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98) {
                    ((com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98) obj).mo15825x41012807();
                }
                c1525x4d6875a.mo15825x41012807();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            obj = null;
        }
    }

    /* renamed from: pushValue */
    public static void m16676xd1a85277(com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad interfaceC1471x242ee8ad, com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7, java.lang.Object obj) {
        java.util.Hashtable hashtable = new java.util.Hashtable();
        try {
            m16677xd1a85277(interfaceC1471x242ee8ad, c1469x28b0ccd7, obj, hashtable);
        } finally {
            java.util.Iterator it = hashtable.values().iterator();
            while (it.hasNext()) {
                ((com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) it.next()).mo15825x41012807();
            }
        }
    }

    /* renamed from: toV8Array */
    public static com.p159x477cd522.p160x333422.C1469x28b0ccd7 m16689x62558dfc(com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad interfaceC1471x242ee8ad, java.util.List<? extends java.lang.Object> list) {
        java.util.Hashtable hashtable = new java.util.Hashtable();
        try {
            return m16690x62558dfc(interfaceC1471x242ee8ad, list, hashtable).mo16314x3686e8();
        } finally {
            java.util.Iterator it = hashtable.values().iterator();
            while (it.hasNext()) {
                ((com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) it.next()).mo15825x41012807();
            }
        }
    }

    /* renamed from: toV8Object */
    public static com.p159x477cd522.p160x333422.C1477x4679881 m16695xff5afbfc(com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad interfaceC1471x242ee8ad, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        java.util.Hashtable hashtable = new java.util.Hashtable();
        try {
            return m16696xff5afbfc(interfaceC1471x242ee8ad, map, hashtable).mo16314x3686e8();
        } finally {
            java.util.Iterator it = hashtable.values().iterator();
            while (it.hasNext()) {
                ((com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) it.next()).mo15825x41012807();
            }
        }
    }

    /* renamed from: toV8TypedArray */
    private static com.p159x477cd522.p160x333422.C1487x63ed6051 m16698x273c8e4c(com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad interfaceC1471x242ee8ad, com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.AbstractC1536x3c38b82f abstractC1536x3c38b82f, java.util.Map<java.lang.Object, com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef> map) {
        if (map.containsKey(abstractC1536x3c38b82f)) {
            return (com.p159x477cd522.p160x333422.C1487x63ed6051) map.get(abstractC1536x3c38b82f);
        }
        com.p159x477cd522.p160x333422.C1470x40840ff7 mo16398x9edb0a57 = interfaceC1471x242ee8ad.mo16398x9edb0a57(abstractC1536x3c38b82f.m16709xeed4b35e());
        try {
            com.p159x477cd522.p160x333422.C1487x63ed6051 mo16401xfb9d99f1 = interfaceC1471x242ee8ad.mo16401xfb9d99f1(mo16398x9edb0a57, abstractC1536x3c38b82f.mo16707xfb85f7b0(), 0, abstractC1536x3c38b82f.mo16708xbe0e3ae6());
            map.put(abstractC1536x3c38b82f, mo16401xfb9d99f1);
            return mo16401xfb9d99f1;
        } finally {
            mo16398x9edb0a57.mo15825x41012807();
        }
    }

    /* renamed from: getV8Result */
    public static java.lang.Object m16665x81b496b5(com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad interfaceC1471x242ee8ad, java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        java.util.Hashtable hashtable = new java.util.Hashtable();
        try {
            java.lang.Object m16666x81b496b5 = m16666x81b496b5(interfaceC1471x242ee8ad, obj, hashtable);
            if (m16666x81b496b5 instanceof com.p159x477cd522.p160x333422.C1477x4679881) {
                return ((com.p159x477cd522.p160x333422.C1477x4679881) m16666x81b496b5).mo16314x3686e8();
            }
            java.util.Iterator it = hashtable.values().iterator();
            while (it.hasNext()) {
                ((com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) it.next()).mo15825x41012807();
            }
            return m16666x81b496b5;
        } finally {
            java.util.Iterator it6 = hashtable.values().iterator();
            while (it6.hasNext()) {
                ((com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) it6.next()).mo15825x41012807();
            }
        }
    }

    /* renamed from: pushValue */
    private static void m16675xd1a85277(com.p159x477cd522.p160x333422.V8 v86, com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7, java.lang.Object obj, java.util.Map<java.lang.Object, com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef> map) {
        if (obj == null) {
            c1469x28b0ccd7.mo16312x37a72f56();
            return;
        }
        if (obj instanceof java.lang.Integer) {
            c1469x28b0ccd7.m16308x34af1a(obj);
            return;
        }
        if (obj instanceof java.lang.Long) {
            c1469x28b0ccd7.m16308x34af1a(new java.lang.Double(((java.lang.Long) obj).longValue()));
            return;
        }
        if (obj instanceof java.lang.Double) {
            c1469x28b0ccd7.m16308x34af1a(obj);
            return;
        }
        if (obj instanceof java.lang.Float) {
            c1469x28b0ccd7.m16308x34af1a(obj);
            return;
        }
        if (obj instanceof java.lang.String) {
            c1469x28b0ccd7.mo16309x34af1a((java.lang.String) obj);
            return;
        }
        if (obj instanceof java.lang.Boolean) {
            c1469x28b0ccd7.m16308x34af1a(obj);
            return;
        }
        if (obj instanceof com.p159x477cd522.p160x333422.C1477x4679881) {
            c1469x28b0ccd7.mo16307x34af1a((com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) obj);
            return;
        }
        if (obj instanceof com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.AbstractC1536x3c38b82f) {
            c1469x28b0ccd7.mo16307x34af1a((com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) m16697x273c8e4c(v86, (com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.AbstractC1536x3c38b82f) obj, map));
            return;
        }
        if (obj instanceof com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.C1530x71a3b3d9) {
            c1469x28b0ccd7.mo16307x34af1a((com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) m16691xe71aa15c(v86, (com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.C1530x71a3b3d9) obj, map));
            return;
        }
        if (obj instanceof java.util.Map) {
            c1469x28b0ccd7.mo16307x34af1a((com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) m16694xff5afbfc(v86, (java.util.Map<java.lang.String, ? extends java.lang.Object>) obj, map));
        } else if (obj instanceof java.util.List) {
            c1469x28b0ccd7.mo16307x34af1a((com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) m16688x62558dfc(v86, (java.util.List<? extends java.lang.Object>) obj, map));
        } else {
            throw new java.lang.IllegalStateException("Unsupported Object of type: " + obj.getClass());
        }
    }

    /* renamed from: toV8Array */
    private static com.p159x477cd522.p160x333422.C1469x28b0ccd7 m16688x62558dfc(com.p159x477cd522.p160x333422.V8 v86, java.util.List<? extends java.lang.Object> list, java.util.Map<java.lang.Object, com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef> map) {
        if (map.containsKey(new com.p159x477cd522.p160x333422.p164x6a710b1.C1526xe59cb0b0.ListWrapper(list))) {
            return (com.p159x477cd522.p160x333422.C1469x28b0ccd7) map.get(new com.p159x477cd522.p160x333422.p164x6a710b1.C1526xe59cb0b0.ListWrapper(list));
        }
        com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7 = new com.p159x477cd522.p160x333422.C1469x28b0ccd7(v86);
        map.put(new com.p159x477cd522.p160x333422.p164x6a710b1.C1526xe59cb0b0.ListWrapper(list), c1469x28b0ccd7);
        for (int i17 = 0; i17 < list.size(); i17++) {
            try {
                m16675xd1a85277(v86, c1469x28b0ccd7, list.get(i17), map);
            } catch (java.lang.IllegalStateException e17) {
                c1469x28b0ccd7.mo15825x41012807();
                throw e17;
            }
        }
        return c1469x28b0ccd7;
    }

    /* renamed from: toV8Object */
    private static com.p159x477cd522.p160x333422.C1477x4679881 m16694xff5afbfc(com.p159x477cd522.p160x333422.V8 v86, java.util.Map<java.lang.String, ? extends java.lang.Object> map, java.util.Map<java.lang.Object, com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef> map2) {
        if (map2.containsKey(map)) {
            return (com.p159x477cd522.p160x333422.C1477x4679881) map2.get(map);
        }
        com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881 = new com.p159x477cd522.p160x333422.C1477x4679881(v86);
        map2.put(map, c1477x4679881);
        try {
            for (java.util.Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map.entrySet()) {
                m16678x53d8522f(v86, c1477x4679881, entry.getKey(), entry.getValue(), map2);
            }
            return c1477x4679881;
        } catch (java.lang.IllegalStateException e17) {
            c1477x4679881.mo15825x41012807();
            throw e17;
        }
    }

    /* renamed from: getValue */
    public static java.lang.Object m16668x754a37bb(com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7, int i17, com.p159x477cd522.p160x333422.p164x6a710b1.InterfaceC1523x4a2d9e95 interfaceC1523x4a2d9e95) {
        java.lang.Object obj;
        com.p159x477cd522.p160x333422.p164x6a710b1.C1525x4d6875a c1525x4d6875a = new com.p159x477cd522.p160x333422.p164x6a710b1.C1525x4d6875a();
        try {
            obj = c1469x28b0ccd7.get(i17);
        } catch (java.lang.Throwable th6) {
            th = th6;
            obj = null;
        }
        try {
            java.lang.Object m16672x754a37bb = m16672x754a37bb(obj, c1469x28b0ccd7.mo16302xfb85f7b0(i17), c1525x4d6875a, interfaceC1523x4a2d9e95);
            if (obj instanceof com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98) {
                ((com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98) obj).mo15825x41012807();
            }
            c1525x4d6875a.mo15825x41012807();
            return m16672x754a37bb;
        } catch (java.lang.Throwable th7) {
            th = th7;
            if (obj instanceof com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98) {
                ((com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98) obj).mo15825x41012807();
            }
            c1525x4d6875a.mo15825x41012807();
            throw th;
        }
    }

    /* renamed from: getTypedArray */
    public static java.lang.Object m16661xb3a79405(com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7, int i17) {
        int mo16304xbe0e3ae6 = c1469x28b0ccd7.mo16304xbe0e3ae6();
        if (i17 == 1) {
            return c1469x28b0ccd7.mo16296x9dd4e46b(0, mo16304xbe0e3ae6);
        }
        if (i17 == 2) {
            return c1469x28b0ccd7.mo16293xabc53a8c(0, mo16304xbe0e3ae6);
        }
        if (i17 == 3) {
            return c1469x28b0ccd7.mo16287xf36c56c1(0, mo16304xbe0e3ae6);
        }
        if (i17 == 4) {
            return c1469x28b0ccd7.mo16300xcda3de4c(0, mo16304xbe0e3ae6);
        }
        throw new java.lang.RuntimeException("Unsupported bulk load type: " + i17);
    }

    /* renamed from: getV8Result */
    private static java.lang.Object m16664x81b496b5(com.p159x477cd522.p160x333422.V8 v86, java.lang.Object obj, java.util.Map<java.lang.Object, com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef> map) {
        if (map.containsKey(obj)) {
            return map.get(obj);
        }
        if (obj instanceof java.util.Map) {
            return m16694xff5afbfc(v86, (java.util.Map<java.lang.String, ? extends java.lang.Object>) obj, map);
        }
        if (obj instanceof java.util.List) {
            return m16688x62558dfc(v86, (java.util.List<? extends java.lang.Object>) obj, map);
        }
        if (obj instanceof com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.AbstractC1536x3c38b82f) {
            return m16697x273c8e4c(v86, (com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.AbstractC1536x3c38b82f) obj, map);
        }
        return obj instanceof com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.C1530x71a3b3d9 ? m16691xe71aa15c(v86, (com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.C1530x71a3b3d9) obj, map) : obj;
    }

    /* renamed from: toV8Object */
    private static com.p159x477cd522.p160x333422.C1477x4679881 m16696xff5afbfc(com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad interfaceC1471x242ee8ad, java.util.Map<java.lang.String, ? extends java.lang.Object> map, java.util.Map<java.lang.Object, com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef> map2) {
        if (map2.containsKey(map)) {
            return (com.p159x477cd522.p160x333422.C1477x4679881) map2.get(map);
        }
        com.p159x477cd522.p160x333422.C1477x4679881 mo16400x4b75a221 = interfaceC1471x242ee8ad.mo16400x4b75a221();
        map2.put(map, mo16400x4b75a221);
        try {
            for (java.util.Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map.entrySet()) {
                m16679x53d8522f(interfaceC1471x242ee8ad, mo16400x4b75a221, entry.getKey(), entry.getValue(), map2);
            }
            return mo16400x4b75a221;
        } catch (java.lang.IllegalStateException e17) {
            mo16400x4b75a221.mo15825x41012807();
            throw e17;
        }
    }

    /* renamed from: toV8Array */
    private static com.p159x477cd522.p160x333422.C1469x28b0ccd7 m16690x62558dfc(com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad interfaceC1471x242ee8ad, java.util.List<? extends java.lang.Object> list, java.util.Map<java.lang.Object, com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef> map) {
        if (map.containsKey(new com.p159x477cd522.p160x333422.p164x6a710b1.C1526xe59cb0b0.ListWrapper(list))) {
            return (com.p159x477cd522.p160x333422.C1469x28b0ccd7) map.get(new com.p159x477cd522.p160x333422.p164x6a710b1.C1526xe59cb0b0.ListWrapper(list));
        }
        com.p159x477cd522.p160x333422.C1469x28b0ccd7 mo16396xe8eb0f37 = interfaceC1471x242ee8ad.mo16396xe8eb0f37();
        map.put(new com.p159x477cd522.p160x333422.p164x6a710b1.C1526xe59cb0b0.ListWrapper(list), mo16396xe8eb0f37);
        for (int i17 = 0; i17 < list.size(); i17++) {
            try {
                m16677xd1a85277(interfaceC1471x242ee8ad, mo16396xe8eb0f37, list.get(i17), map);
            } catch (java.lang.IllegalStateException e17) {
                mo16396xe8eb0f37.mo15825x41012807();
                throw e17;
            }
        }
        return mo16396xe8eb0f37;
    }

    /* renamed from: setValue */
    private static void m16679x53d8522f(com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad interfaceC1471x242ee8ad, com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881, java.lang.String str, java.lang.Object obj, java.util.Map<java.lang.Object, com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef> map) {
        if (obj == null) {
            c1477x4679881.mo16315xb9e72daf(str);
            return;
        }
        if (obj instanceof java.lang.Integer) {
            c1477x4679881.add(str, ((java.lang.Integer) obj).intValue());
            return;
        }
        if (obj instanceof java.lang.Long) {
            c1477x4679881.add(str, ((java.lang.Long) obj).longValue());
            return;
        }
        if (obj instanceof java.lang.Double) {
            c1477x4679881.add(str, ((java.lang.Double) obj).doubleValue());
            return;
        }
        if (obj instanceof java.lang.Float) {
            c1477x4679881.add(str, ((java.lang.Float) obj).floatValue());
            return;
        }
        if (obj instanceof java.lang.String) {
            c1477x4679881.add(str, (java.lang.String) obj);
            return;
        }
        if (obj instanceof java.lang.Boolean) {
            c1477x4679881.add(str, ((java.lang.Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof com.p159x477cd522.p160x333422.C1477x4679881) {
            c1477x4679881.add(str, (com.p159x477cd522.p160x333422.C1477x4679881) obj);
            return;
        }
        if (obj instanceof com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.AbstractC1536x3c38b82f) {
            c1477x4679881.add(str, m16698x273c8e4c(interfaceC1471x242ee8ad, (com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.AbstractC1536x3c38b82f) obj, map));
            return;
        }
        if (obj instanceof com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.C1530x71a3b3d9) {
            c1477x4679881.add(str, m16692xe71aa15c(interfaceC1471x242ee8ad, (com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.C1530x71a3b3d9) obj, map));
            return;
        }
        if (obj instanceof java.util.Map) {
            c1477x4679881.add(str, m16696xff5afbfc(interfaceC1471x242ee8ad, (java.util.Map<java.lang.String, ? extends java.lang.Object>) obj, map));
        } else if (obj instanceof java.util.List) {
            c1477x4679881.add(str, m16690x62558dfc(interfaceC1471x242ee8ad, (java.util.List<? extends java.lang.Object>) obj, map));
        } else {
            throw new java.lang.IllegalStateException("Unsupported Object of type: " + obj.getClass());
        }
    }

    /* renamed from: getValue */
    public static java.lang.Object m16669x754a37bb(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881, java.lang.String str) {
        return m16670x754a37bb(c1477x4679881, str, f5058x6cdfc888);
    }

    /* renamed from: getValue */
    public static java.lang.Object m16670x754a37bb(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881, java.lang.String str, com.p159x477cd522.p160x333422.p164x6a710b1.InterfaceC1523x4a2d9e95 interfaceC1523x4a2d9e95) {
        java.lang.Object obj;
        com.p159x477cd522.p160x333422.p164x6a710b1.C1525x4d6875a c1525x4d6875a = new com.p159x477cd522.p160x333422.p164x6a710b1.C1525x4d6875a();
        try {
            obj = c1477x4679881.get(str);
        } catch (java.lang.Throwable th6) {
            th = th6;
            obj = null;
        }
        try {
            java.lang.Object m16672x754a37bb = m16672x754a37bb(obj, c1477x4679881.mo16333xfb85f7b0(str), c1525x4d6875a, interfaceC1523x4a2d9e95);
            if (obj instanceof com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98) {
                ((com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98) obj).mo15825x41012807();
            }
            c1525x4d6875a.mo15825x41012807();
            return m16672x754a37bb;
        } catch (java.lang.Throwable th7) {
            th = th7;
            if (obj instanceof com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98) {
                ((com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98) obj).mo15825x41012807();
            }
            c1525x4d6875a.mo15825x41012807();
            throw th;
        }
    }

    /* renamed from: getV8Result */
    private static java.lang.Object m16666x81b496b5(com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad interfaceC1471x242ee8ad, java.lang.Object obj, java.util.Map<java.lang.Object, com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef> map) {
        if (map.containsKey(obj)) {
            return map.get(obj);
        }
        if (obj instanceof java.util.Map) {
            return m16696xff5afbfc(interfaceC1471x242ee8ad, (java.util.Map<java.lang.String, ? extends java.lang.Object>) obj, map);
        }
        if (obj instanceof java.util.List) {
            return m16690x62558dfc(interfaceC1471x242ee8ad, (java.util.List<? extends java.lang.Object>) obj, map);
        }
        if (obj instanceof com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.AbstractC1536x3c38b82f) {
            return m16698x273c8e4c(interfaceC1471x242ee8ad, (com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.AbstractC1536x3c38b82f) obj, map);
        }
        return obj instanceof com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.C1530x71a3b3d9 ? m16692xe71aa15c(interfaceC1471x242ee8ad, (com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.C1530x71a3b3d9) obj, map) : obj;
    }

    /* renamed from: getValue */
    private static java.lang.Object m16672x754a37bb(java.lang.Object obj, int i17, com.p159x477cd522.p160x333422.p164x6a710b1.C1525x4d6875a<java.lang.Object> c1525x4d6875a, com.p159x477cd522.p160x333422.p164x6a710b1.InterfaceC1523x4a2d9e95 interfaceC1523x4a2d9e95) {
        java.lang.Object mo16646x585d722 = interfaceC1523x4a2d9e95.mo16646x585d722(i17, obj);
        if (com.p159x477cd522.p160x333422.p164x6a710b1.InterfaceC1523x4a2d9e95.f5045x86df6221 != mo16646x585d722) {
            return mo16646x585d722;
        }
        if (i17 == 10) {
            return new com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.C1530x71a3b3d9(((com.p159x477cd522.p160x333422.C1470x40840ff7) obj).m16341x3970ce7c());
        }
        if (i17 != 99) {
            switch (i17) {
                case 0:
                    return null;
                case 1:
                case 2:
                case 3:
                case 4:
                    return obj;
                case 5:
                    return m16682xcc327db9((com.p159x477cd522.p160x333422.C1469x28b0ccd7) obj, c1525x4d6875a, interfaceC1523x4a2d9e95);
                case 6:
                    return m16685x69648e1((com.p159x477cd522.p160x333422.C1477x4679881) obj, c1525x4d6875a, interfaceC1523x4a2d9e95);
                case 7:
                    return f5059x809ef1d2;
                case 8:
                    return m16686x47e128ea((com.p159x477cd522.p160x333422.C1469x28b0ccd7) obj);
                default:
                    throw new java.lang.IllegalStateException("Cannot convert type " + com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef.m16470x3b924fb4(i17));
            }
        }
        return com.p159x477cd522.p160x333422.V8.m16073xc18cd29a();
    }

    /* renamed from: pushValue */
    private static void m16677xd1a85277(com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad interfaceC1471x242ee8ad, com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7, java.lang.Object obj, java.util.Map<java.lang.Object, com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef> map) {
        if (obj == null) {
            c1469x28b0ccd7.mo16312x37a72f56();
            return;
        }
        if (obj instanceof java.lang.Integer) {
            c1469x28b0ccd7.m16308x34af1a(obj);
            return;
        }
        if (obj instanceof java.lang.Long) {
            c1469x28b0ccd7.m16308x34af1a(new java.lang.Double(((java.lang.Long) obj).longValue()));
            return;
        }
        if (obj instanceof java.lang.Double) {
            c1469x28b0ccd7.m16308x34af1a(obj);
            return;
        }
        if (obj instanceof java.lang.Float) {
            c1469x28b0ccd7.m16308x34af1a(obj);
            return;
        }
        if (obj instanceof java.lang.String) {
            c1469x28b0ccd7.mo16309x34af1a((java.lang.String) obj);
            return;
        }
        if (obj instanceof java.lang.Boolean) {
            c1469x28b0ccd7.m16308x34af1a(obj);
            return;
        }
        if (obj instanceof com.p159x477cd522.p160x333422.C1477x4679881) {
            c1469x28b0ccd7.mo16307x34af1a((com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) obj);
            return;
        }
        if (obj instanceof com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.AbstractC1536x3c38b82f) {
            c1469x28b0ccd7.mo16307x34af1a((com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) m16698x273c8e4c(interfaceC1471x242ee8ad, (com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.AbstractC1536x3c38b82f) obj, map));
            return;
        }
        if (obj instanceof com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.C1530x71a3b3d9) {
            c1469x28b0ccd7.mo16307x34af1a((com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) m16692xe71aa15c(interfaceC1471x242ee8ad, (com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.C1530x71a3b3d9) obj, map));
            return;
        }
        if (obj instanceof java.util.Map) {
            c1469x28b0ccd7.mo16307x34af1a((com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) m16696xff5afbfc(interfaceC1471x242ee8ad, (java.util.Map<java.lang.String, ? extends java.lang.Object>) obj, map));
        } else if (obj instanceof java.util.List) {
            c1469x28b0ccd7.mo16307x34af1a((com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) m16690x62558dfc(interfaceC1471x242ee8ad, (java.util.List<? extends java.lang.Object>) obj, map));
        } else {
            throw new java.lang.IllegalStateException("Unsupported Object of type: " + obj.getClass());
        }
    }
}
