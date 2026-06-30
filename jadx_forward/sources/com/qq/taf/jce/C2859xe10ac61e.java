package com.qq.taf.jce;

/* renamed from: com.qq.taf.jce.JceInputStream */
/* loaded from: classes13.dex */
public final class C2859xe10ac61e {

    /* renamed from: bs, reason: collision with root package name */
    private java.nio.ByteBuffer f127351bs;

    /* renamed from: sServerEncoding */
    protected java.lang.String f9750x91fd5509 = "GBK";

    /* renamed from: com.qq.taf.jce.JceInputStream$HeadData */
    /* loaded from: classes13.dex */
    public static class HeadData {
        public int tag;

        /* renamed from: type */
        public byte f9751x368f3a;

        /* renamed from: clear */
        public void m21328x5a5b64d() {
            this.f9751x368f3a = (byte) 0;
            this.tag = 0;
        }
    }

    public C2859xe10ac61e() {
    }

    /* renamed from: main */
    public static void m21286x3305b9(java.lang.String[] strArr) {
    }

    /* renamed from: peakHead */
    private int m21287xfce52b5f(com.qq.taf.jce.C2859xe10ac61e.HeadData headData) {
        return m21289xcc44e096(headData, this.f127351bs.duplicate());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: readArrayImpl */
    private <T> T[] m21288x3945a323(T t17, int i17, boolean z17) {
        if (!m21325x7c3c24e0(i17)) {
            if (z17) {
                throw new com.qq.taf.jce.C2856xe9f52235("require field not exist.");
            }
            return null;
        }
        com.qq.taf.jce.C2859xe10ac61e.HeadData headData = new com.qq.taf.jce.C2859xe10ac61e.HeadData();
        m21318xcc44e096(headData);
        if (headData.f9751x368f3a != 9) {
            throw new com.qq.taf.jce.C2856xe9f52235("type mismatch.");
        }
        int m21299x355996 = m21299x355996(0, 0, true);
        if (m21299x355996 < 0) {
            throw new com.qq.taf.jce.C2856xe9f52235("size invalid: " + m21299x355996);
        }
        T[] tArr = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(t17.getClass(), m21299x355996));
        for (int i18 = 0; i18 < m21299x355996; i18++) {
            tArr[i18] = m21302x355996((com.qq.taf.jce.C2859xe10ac61e) t17, 0, true);
        }
        return tArr;
    }

    /* renamed from: readHead */
    public static int m21289xcc44e096(com.qq.taf.jce.C2859xe10ac61e.HeadData headData, java.nio.ByteBuffer byteBuffer) {
        byte b17 = byteBuffer.get();
        headData.f9751x368f3a = (byte) (b17 & 15);
        int i17 = (b17 & 240) >> 4;
        headData.tag = i17;
        if (i17 != 15) {
            return 1;
        }
        headData.tag = byteBuffer.get() & 255;
        return 2;
    }

    /* renamed from: skip */
    private void m21291x35e57f(int i17) {
        java.nio.ByteBuffer byteBuffer = this.f127351bs;
        byteBuffer.position(byteBuffer.position() + i17);
    }

    /* renamed from: skipField */
    private void m21292x7b7462bb() {
        com.qq.taf.jce.C2859xe10ac61e.HeadData headData = new com.qq.taf.jce.C2859xe10ac61e.HeadData();
        m21318xcc44e096(headData);
        m21293x7b7462bb(headData.f9751x368f3a);
    }

    /* renamed from: directRead */
    public com.qq.taf.jce.AbstractC2861x7aec4921 m21294xd564d1f(com.qq.taf.jce.AbstractC2861x7aec4921 abstractC2861x7aec4921, int i17, boolean z17) {
        if (!m21325x7c3c24e0(i17)) {
            if (z17) {
                throw new com.qq.taf.jce.C2856xe9f52235("require field not exist.");
            }
            return null;
        }
        try {
            com.qq.taf.jce.AbstractC2861x7aec4921 mo21369x6df6b2d0 = abstractC2861x7aec4921.mo21369x6df6b2d0();
            com.qq.taf.jce.C2859xe10ac61e.HeadData headData = new com.qq.taf.jce.C2859xe10ac61e.HeadData();
            m21318xcc44e096(headData);
            if (headData.f9751x368f3a != 10) {
                throw new com.qq.taf.jce.C2856xe9f52235("type mismatch.");
            }
            mo21369x6df6b2d0.mo21234xcc442a60(this);
            m21324x3dab518c();
            return mo21369x6df6b2d0;
        } catch (java.lang.Exception e17) {
            throw new com.qq.taf.jce.C2856xe9f52235(e17.getMessage());
        }
    }

    /* renamed from: getBs */
    public java.nio.ByteBuffer m21295x5db1a47() {
        return this.f127351bs;
    }

    /* renamed from: read */
    public boolean m21305x355996(boolean z17, int i17, boolean z18) {
        return m21296x355996((byte) 0, i17, z18) != 0;
    }

    /* renamed from: readArray */
    public <T> T[] m21316xbbfab663(T[] tArr, int i17, boolean z17) {
        if (tArr != null && tArr.length != 0) {
            return (T[]) m21288x3945a323(tArr[0], i17, z17);
        }
        throw new com.qq.taf.jce.C2856xe9f52235("unable to get type of key and value.");
    }

    /* renamed from: readByteString */
    public java.lang.String m21317x567a796f(java.lang.String str, int i17, boolean z17) {
        if (!m21325x7c3c24e0(i17)) {
            if (z17) {
                throw new com.qq.taf.jce.C2856xe9f52235("require field not exist.");
            }
            return str;
        }
        com.qq.taf.jce.C2859xe10ac61e.HeadData headData = new com.qq.taf.jce.C2859xe10ac61e.HeadData();
        m21318xcc44e096(headData);
        byte b17 = headData.f9751x368f3a;
        if (b17 == 6) {
            int i18 = this.f127351bs.get();
            if (i18 < 0) {
                i18 += 256;
            }
            byte[] bArr = new byte[i18];
            this.f127351bs.get(bArr);
            return com.qq.taf.jce.C2855x93dd899d.m21238x223991d(bArr);
        }
        if (b17 != 7) {
            throw new com.qq.taf.jce.C2856xe9f52235("type mismatch.");
        }
        int i19 = this.f127351bs.getInt();
        if (i19 > 104857600 || i19 < 0) {
            throw new com.qq.taf.jce.C2856xe9f52235("String too long: " + i19);
        }
        byte[] bArr2 = new byte[i19];
        this.f127351bs.get(bArr2);
        return com.qq.taf.jce.C2855x93dd899d.m21238x223991d(bArr2);
    }

    /* renamed from: readList */
    public java.util.List m21319xcc46c354(int i17, boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (m21325x7c3c24e0(i17)) {
            com.qq.taf.jce.C2859xe10ac61e.HeadData headData = new com.qq.taf.jce.C2859xe10ac61e.HeadData();
            m21318xcc44e096(headData);
            if (headData.f9751x368f3a != 9) {
                throw new com.qq.taf.jce.C2856xe9f52235("type mismatch.");
            }
            int m21299x355996 = m21299x355996(0, 0, true);
            if (m21299x355996 < 0) {
                throw new com.qq.taf.jce.C2856xe9f52235("size invalid: " + m21299x355996);
            }
            for (int i18 = 0; i18 < m21299x355996; i18++) {
                com.qq.taf.jce.C2859xe10ac61e.HeadData headData2 = new com.qq.taf.jce.C2859xe10ac61e.HeadData();
                m21318xcc44e096(headData2);
                switch (headData2.f9751x368f3a) {
                    case 0:
                        m21291x35e57f(1);
                        break;
                    case 1:
                        m21291x35e57f(2);
                        break;
                    case 2:
                        m21291x35e57f(4);
                        break;
                    case 3:
                        m21291x35e57f(8);
                        break;
                    case 4:
                        m21291x35e57f(4);
                        break;
                    case 5:
                        m21291x35e57f(8);
                        break;
                    case 6:
                        int i19 = this.f127351bs.get();
                        if (i19 < 0) {
                            i19 += 256;
                        }
                        m21291x35e57f(i19);
                        break;
                    case 7:
                        m21291x35e57f(this.f127351bs.getInt());
                        break;
                    case 8:
                    case 9:
                        break;
                    case 10:
                        try {
                            com.qq.taf.jce.AbstractC2861x7aec4921 abstractC2861x7aec4921 = (com.qq.taf.jce.AbstractC2861x7aec4921) java.lang.Class.forName(com.qq.taf.jce.AbstractC2861x7aec4921.class.getName()).getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                            abstractC2861x7aec4921.mo21234xcc442a60(this);
                            m21324x3dab518c();
                            arrayList.add(abstractC2861x7aec4921);
                            break;
                        } catch (java.lang.Exception e17) {
                            throw new com.qq.taf.jce.C2856xe9f52235("type mismatch." + e17);
                        }
                    case 11:
                    default:
                        throw new com.qq.taf.jce.C2856xe9f52235("type mismatch.");
                    case 12:
                        arrayList.add(new java.lang.Integer(0));
                        break;
                }
            }
        } else if (z17) {
            throw new com.qq.taf.jce.C2856xe9f52235("require field not exist.");
        }
        return arrayList;
    }

    /* renamed from: readMap */
    public <K, V> java.util.HashMap<K, V> m21320x406563e6(java.util.Map<K, V> map, int i17, boolean z17) {
        return (java.util.HashMap) m21290x406563e6(new java.util.HashMap(), map, i17, z17);
    }

    /* renamed from: readString */
    public java.lang.String m21321xe22f9d47(int i17, boolean z17) {
        if (!m21325x7c3c24e0(i17)) {
            if (z17) {
                throw new com.qq.taf.jce.C2856xe9f52235("require field not exist.");
            }
            return null;
        }
        com.qq.taf.jce.C2859xe10ac61e.HeadData headData = new com.qq.taf.jce.C2859xe10ac61e.HeadData();
        m21318xcc44e096(headData);
        byte b17 = headData.f9751x368f3a;
        if (b17 == 6) {
            int i18 = this.f127351bs.get();
            if (i18 < 0) {
                i18 += 256;
            }
            byte[] bArr = new byte[i18];
            this.f127351bs.get(bArr);
            try {
                return new java.lang.String(bArr, this.f9750x91fd5509);
            } catch (java.io.UnsupportedEncodingException unused) {
                return new java.lang.String(bArr);
            }
        }
        if (b17 != 7) {
            throw new com.qq.taf.jce.C2856xe9f52235("type mismatch.");
        }
        int i19 = this.f127351bs.getInt();
        if (i19 > 104857600 || i19 < 0) {
            throw new com.qq.taf.jce.C2856xe9f52235("String too long: " + i19);
        }
        byte[] bArr2 = new byte[i19];
        this.f127351bs.get(bArr2);
        try {
            return new java.lang.String(bArr2, this.f9750x91fd5509);
        } catch (java.io.UnsupportedEncodingException unused2) {
            return new java.lang.String(bArr2);
        }
    }

    /* renamed from: readStringMap */
    public java.util.Map<java.lang.String, java.lang.String> m21322x82f0b695(int i17, boolean z17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (m21325x7c3c24e0(i17)) {
            com.qq.taf.jce.C2859xe10ac61e.HeadData headData = new com.qq.taf.jce.C2859xe10ac61e.HeadData();
            m21318xcc44e096(headData);
            if (headData.f9751x368f3a != 8) {
                throw new com.qq.taf.jce.C2856xe9f52235("type mismatch.");
            }
            int m21299x355996 = m21299x355996(0, 0, true);
            if (m21299x355996 < 0) {
                throw new com.qq.taf.jce.C2856xe9f52235("size invalid: " + m21299x355996);
            }
            for (int i18 = 0; i18 < m21299x355996; i18++) {
                hashMap.put(m21321xe22f9d47(0, true), m21321xe22f9d47(1, true));
            }
        } else if (z17) {
            throw new com.qq.taf.jce.C2856xe9f52235("require field not exist.");
        }
        return hashMap;
    }

    /* renamed from: setServerEncoding */
    public int m21323x26b402b8(java.lang.String str) {
        this.f9750x91fd5509 = str;
        return 0;
    }

    /* renamed from: skipToStructEnd */
    public void m21324x3dab518c() {
        com.qq.taf.jce.C2859xe10ac61e.HeadData headData = new com.qq.taf.jce.C2859xe10ac61e.HeadData();
        do {
            m21318xcc44e096(headData);
            m21293x7b7462bb(headData.f9751x368f3a);
        } while (headData.f9751x368f3a != 11);
    }

    /* renamed from: skipToTag */
    public boolean m21325x7c3c24e0(int i17) {
        int i18;
        try {
            com.qq.taf.jce.C2859xe10ac61e.HeadData headData = new com.qq.taf.jce.C2859xe10ac61e.HeadData();
            while (true) {
                int m21287xfce52b5f = m21287xfce52b5f(headData);
                i18 = headData.tag;
                if (i17 <= i18 || headData.f9751x368f3a == 11) {
                    break;
                }
                m21291x35e57f(m21287xfce52b5f);
                m21293x7b7462bb(headData.f9751x368f3a);
            }
        } catch (com.qq.taf.jce.C2856xe9f52235 | java.nio.BufferUnderflowException unused) {
        }
        return i17 == i18;
    }

    /* renamed from: warp */
    public void m21326x379288(byte[] bArr) {
        m21327x37d04a(bArr);
    }

    /* renamed from: wrap */
    public void m21327x37d04a(byte[] bArr) {
        this.f127351bs = java.nio.ByteBuffer.wrap(bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: readMap */
    private <K, V> java.util.Map<K, V> m21290x406563e6(java.util.Map<K, V> map, java.util.Map<K, V> map2, int i17, boolean z17) {
        if (map2 != null && !map2.isEmpty()) {
            java.util.Map.Entry<K, V> next = map2.entrySet().iterator().next();
            K key = next.getKey();
            V value = next.getValue();
            if (m21325x7c3c24e0(i17)) {
                com.qq.taf.jce.C2859xe10ac61e.HeadData headData = new com.qq.taf.jce.C2859xe10ac61e.HeadData();
                m21318xcc44e096(headData);
                if (headData.f9751x368f3a == 8) {
                    int m21299x355996 = m21299x355996(0, 0, true);
                    if (m21299x355996 < 0) {
                        throw new com.qq.taf.jce.C2856xe9f52235("size invalid: " + m21299x355996);
                    }
                    for (int i18 = 0; i18 < m21299x355996; i18++) {
                        map.put(m21302x355996((com.qq.taf.jce.C2859xe10ac61e) key, 0, true), m21302x355996((com.qq.taf.jce.C2859xe10ac61e) value, 1, true));
                    }
                } else {
                    throw new com.qq.taf.jce.C2856xe9f52235("type mismatch.");
                }
            } else if (z17) {
                throw new com.qq.taf.jce.C2856xe9f52235("require field not exist.");
            }
            return map;
        }
        return new java.util.HashMap();
    }

    /* renamed from: read */
    public byte m21296x355996(byte b17, int i17, boolean z17) {
        if (!m21325x7c3c24e0(i17)) {
            if (z17) {
                throw new com.qq.taf.jce.C2856xe9f52235("require field not exist.");
            }
            return b17;
        }
        com.qq.taf.jce.C2859xe10ac61e.HeadData headData = new com.qq.taf.jce.C2859xe10ac61e.HeadData();
        m21318xcc44e096(headData);
        byte b18 = headData.f9751x368f3a;
        if (b18 == 0) {
            return this.f127351bs.get();
        }
        if (b18 == 12) {
            return (byte) 0;
        }
        throw new com.qq.taf.jce.C2856xe9f52235("type mismatch.");
    }

    public C2859xe10ac61e(java.nio.ByteBuffer byteBuffer) {
        this.f127351bs = byteBuffer;
    }

    /* renamed from: skipField */
    private void m21293x7b7462bb(byte b17) {
        int i17 = 0;
        switch (b17) {
            case 0:
                m21291x35e57f(1);
                return;
            case 1:
                m21291x35e57f(2);
                return;
            case 2:
                m21291x35e57f(4);
                return;
            case 3:
                m21291x35e57f(8);
                return;
            case 4:
                m21291x35e57f(4);
                return;
            case 5:
                m21291x35e57f(8);
                return;
            case 6:
                int i18 = this.f127351bs.get();
                if (i18 < 0) {
                    i18 += 256;
                }
                m21291x35e57f(i18);
                return;
            case 7:
                m21291x35e57f(this.f127351bs.getInt());
                return;
            case 8:
                int m21299x355996 = m21299x355996(0, 0, true);
                while (i17 < m21299x355996 * 2) {
                    m21292x7b7462bb();
                    i17++;
                }
                return;
            case 9:
                int m21299x3559962 = m21299x355996(0, 0, true);
                while (i17 < m21299x3559962) {
                    m21292x7b7462bb();
                    i17++;
                }
                return;
            case 10:
                m21324x3dab518c();
                return;
            case 11:
            case 12:
                return;
            case 13:
                com.qq.taf.jce.C2859xe10ac61e.HeadData headData = new com.qq.taf.jce.C2859xe10ac61e.HeadData();
                m21318xcc44e096(headData);
                if (headData.f9751x368f3a == 0) {
                    m21291x35e57f(m21299x355996(0, 0, true));
                    return;
                }
                throw new com.qq.taf.jce.C2856xe9f52235("skipField with invalid type, type value: " + ((int) b17) + ", " + ((int) headData.f9751x368f3a));
            default:
                throw new com.qq.taf.jce.C2856xe9f52235("invalid type.");
        }
    }

    /* renamed from: readArray */
    public <T> java.util.List<T> m21315xbbfab663(java.util.List<T> list, int i17, boolean z17) {
        if (list != null && !list.isEmpty()) {
            java.lang.Object[] m21288x3945a323 = m21288x3945a323(list.get(0), i17, z17);
            if (m21288x3945a323 == null) {
                return null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : m21288x3945a323) {
                arrayList.add(obj);
            }
            return arrayList;
        }
        return new java.util.ArrayList();
    }

    /* renamed from: readHead */
    public void m21318xcc44e096(com.qq.taf.jce.C2859xe10ac61e.HeadData headData) {
        m21289xcc44e096(headData, this.f127351bs);
    }

    public C2859xe10ac61e(byte[] bArr) {
        this.f127351bs = java.nio.ByteBuffer.wrap(bArr);
    }

    public C2859xe10ac61e(byte[] bArr, int i17) {
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        this.f127351bs = wrap;
        wrap.position(i17);
    }

    /* renamed from: read */
    public short m21304x355996(short s17, int i17, boolean z17) {
        if (!m21325x7c3c24e0(i17)) {
            if (z17) {
                throw new com.qq.taf.jce.C2856xe9f52235("require field not exist.");
            }
            return s17;
        }
        com.qq.taf.jce.C2859xe10ac61e.HeadData headData = new com.qq.taf.jce.C2859xe10ac61e.HeadData();
        m21318xcc44e096(headData);
        byte b17 = headData.f9751x368f3a;
        if (b17 == 0) {
            return this.f127351bs.get();
        }
        if (b17 == 1) {
            return this.f127351bs.getShort();
        }
        if (b17 == 12) {
            return (short) 0;
        }
        throw new com.qq.taf.jce.C2856xe9f52235("type mismatch.");
    }

    /* renamed from: read */
    public int m21299x355996(int i17, int i18, boolean z17) {
        if (!m21325x7c3c24e0(i18)) {
            if (z17) {
                throw new com.qq.taf.jce.C2856xe9f52235("require field not exist.");
            }
            return i17;
        }
        com.qq.taf.jce.C2859xe10ac61e.HeadData headData = new com.qq.taf.jce.C2859xe10ac61e.HeadData();
        m21318xcc44e096(headData);
        byte b17 = headData.f9751x368f3a;
        if (b17 == 0) {
            return this.f127351bs.get();
        }
        if (b17 == 1) {
            return this.f127351bs.getShort();
        }
        if (b17 == 2) {
            return this.f127351bs.getInt();
        }
        if (b17 == 12) {
            return 0;
        }
        throw new com.qq.taf.jce.C2856xe9f52235("type mismatch.");
    }

    /* renamed from: read */
    public long m21300x355996(long j17, int i17, boolean z17) {
        int i18;
        if (!m21325x7c3c24e0(i17)) {
            if (z17) {
                throw new com.qq.taf.jce.C2856xe9f52235("require field not exist.");
            }
            return j17;
        }
        com.qq.taf.jce.C2859xe10ac61e.HeadData headData = new com.qq.taf.jce.C2859xe10ac61e.HeadData();
        m21318xcc44e096(headData);
        byte b17 = headData.f9751x368f3a;
        if (b17 == 0) {
            i18 = this.f127351bs.get();
        } else if (b17 == 1) {
            i18 = this.f127351bs.getShort();
        } else {
            if (b17 != 2) {
                if (b17 == 3) {
                    return this.f127351bs.getLong();
                }
                if (b17 == 12) {
                    return 0L;
                }
                throw new com.qq.taf.jce.C2856xe9f52235("type mismatch.");
            }
            i18 = this.f127351bs.getInt();
        }
        return i18;
    }

    /* renamed from: read */
    public float m21298x355996(float f17, int i17, boolean z17) {
        if (!m21325x7c3c24e0(i17)) {
            if (z17) {
                throw new com.qq.taf.jce.C2856xe9f52235("require field not exist.");
            }
            return f17;
        }
        com.qq.taf.jce.C2859xe10ac61e.HeadData headData = new com.qq.taf.jce.C2859xe10ac61e.HeadData();
        m21318xcc44e096(headData);
        byte b17 = headData.f9751x368f3a;
        if (b17 == 4) {
            return this.f127351bs.getFloat();
        }
        if (b17 == 12) {
            return 0.0f;
        }
        throw new com.qq.taf.jce.C2856xe9f52235("type mismatch.");
    }

    /* renamed from: read */
    public double m21297x355996(double d17, int i17, boolean z17) {
        if (!m21325x7c3c24e0(i17)) {
            if (z17) {
                throw new com.qq.taf.jce.C2856xe9f52235("require field not exist.");
            }
            return d17;
        }
        com.qq.taf.jce.C2859xe10ac61e.HeadData headData = new com.qq.taf.jce.C2859xe10ac61e.HeadData();
        m21318xcc44e096(headData);
        byte b17 = headData.f9751x368f3a;
        if (b17 == 4) {
            return this.f127351bs.getFloat();
        }
        if (b17 == 5) {
            return this.f127351bs.getDouble();
        }
        if (b17 == 12) {
            return 0.0d;
        }
        throw new com.qq.taf.jce.C2856xe9f52235("type mismatch.");
    }

    /* renamed from: read */
    public java.lang.String m21303x355996(java.lang.String str, int i17, boolean z17) {
        java.lang.String str2;
        if (!m21325x7c3c24e0(i17)) {
            if (z17) {
                throw new com.qq.taf.jce.C2856xe9f52235("require field not exist.");
            }
            return str;
        }
        com.qq.taf.jce.C2859xe10ac61e.HeadData headData = new com.qq.taf.jce.C2859xe10ac61e.HeadData();
        m21318xcc44e096(headData);
        byte b17 = headData.f9751x368f3a;
        if (b17 == 6) {
            int i18 = this.f127351bs.get();
            if (i18 < 0) {
                i18 += 256;
            }
            byte[] bArr = new byte[i18];
            this.f127351bs.get(bArr);
            try {
                str2 = new java.lang.String(bArr, this.f9750x91fd5509);
            } catch (java.io.UnsupportedEncodingException unused) {
                str2 = new java.lang.String(bArr);
            }
        } else if (b17 == 7) {
            int i19 = this.f127351bs.getInt();
            if (i19 <= 104857600 && i19 >= 0) {
                byte[] bArr2 = new byte[i19];
                this.f127351bs.get(bArr2);
                try {
                    str2 = new java.lang.String(bArr2, this.f9750x91fd5509);
                } catch (java.io.UnsupportedEncodingException unused2) {
                    str2 = new java.lang.String(bArr2);
                }
            } else {
                throw new com.qq.taf.jce.C2856xe9f52235("String too long: " + i19);
            }
        } else {
            throw new com.qq.taf.jce.C2856xe9f52235("type mismatch.");
        }
        return str2;
    }

    /* renamed from: read */
    public java.lang.String[] m21312x355996(java.lang.String[] strArr, int i17, boolean z17) {
        return (java.lang.String[]) m21316xbbfab663(strArr, i17, z17);
    }

    /* renamed from: read */
    public boolean[] m21314x355996(boolean[] zArr, int i17, boolean z17) {
        if (!m21325x7c3c24e0(i17)) {
            if (z17) {
                throw new com.qq.taf.jce.C2856xe9f52235("require field not exist.");
            }
            return null;
        }
        com.qq.taf.jce.C2859xe10ac61e.HeadData headData = new com.qq.taf.jce.C2859xe10ac61e.HeadData();
        m21318xcc44e096(headData);
        if (headData.f9751x368f3a == 9) {
            int m21299x355996 = m21299x355996(0, 0, true);
            if (m21299x355996 >= 0) {
                boolean[] zArr2 = new boolean[m21299x355996];
                for (int i18 = 0; i18 < m21299x355996; i18++) {
                    zArr2[i18] = m21305x355996(zArr2[0], 0, true);
                }
                return zArr2;
            }
            throw new com.qq.taf.jce.C2856xe9f52235("size invalid: " + m21299x355996);
        }
        throw new com.qq.taf.jce.C2856xe9f52235("type mismatch.");
    }

    /* renamed from: read */
    public byte[] m21306x355996(byte[] bArr, int i17, boolean z17) {
        if (!m21325x7c3c24e0(i17)) {
            if (z17) {
                throw new com.qq.taf.jce.C2856xe9f52235("require field not exist.");
            }
            return null;
        }
        com.qq.taf.jce.C2859xe10ac61e.HeadData headData = new com.qq.taf.jce.C2859xe10ac61e.HeadData();
        m21318xcc44e096(headData);
        byte b17 = headData.f9751x368f3a;
        if (b17 == 9) {
            int m21299x355996 = m21299x355996(0, 0, true);
            if (m21299x355996 >= 0) {
                byte[] bArr2 = new byte[m21299x355996];
                for (int i18 = 0; i18 < m21299x355996; i18++) {
                    bArr2[i18] = m21296x355996(bArr2[0], 0, true);
                }
                return bArr2;
            }
            throw new com.qq.taf.jce.C2856xe9f52235("size invalid: " + m21299x355996);
        }
        if (b17 == 13) {
            com.qq.taf.jce.C2859xe10ac61e.HeadData headData2 = new com.qq.taf.jce.C2859xe10ac61e.HeadData();
            m21318xcc44e096(headData2);
            if (headData2.f9751x368f3a == 0) {
                int m21299x3559962 = m21299x355996(0, 0, true);
                if (m21299x3559962 >= 0) {
                    byte[] bArr3 = new byte[m21299x3559962];
                    this.f127351bs.get(bArr3);
                    return bArr3;
                }
                throw new com.qq.taf.jce.C2856xe9f52235("invalid size, tag: " + i17 + ", type: " + ((int) headData.f9751x368f3a) + ", " + ((int) headData2.f9751x368f3a) + ", size: " + m21299x3559962);
            }
            throw new com.qq.taf.jce.C2856xe9f52235("type mismatch, tag: " + i17 + ", type: " + ((int) headData.f9751x368f3a) + ", " + ((int) headData2.f9751x368f3a));
        }
        throw new com.qq.taf.jce.C2856xe9f52235("type mismatch.");
    }

    /* renamed from: read */
    public short[] m21313x355996(short[] sArr, int i17, boolean z17) {
        if (!m21325x7c3c24e0(i17)) {
            if (z17) {
                throw new com.qq.taf.jce.C2856xe9f52235("require field not exist.");
            }
            return null;
        }
        com.qq.taf.jce.C2859xe10ac61e.HeadData headData = new com.qq.taf.jce.C2859xe10ac61e.HeadData();
        m21318xcc44e096(headData);
        if (headData.f9751x368f3a == 9) {
            int m21299x355996 = m21299x355996(0, 0, true);
            if (m21299x355996 >= 0) {
                short[] sArr2 = new short[m21299x355996];
                for (int i18 = 0; i18 < m21299x355996; i18++) {
                    sArr2[i18] = m21304x355996(sArr2[0], 0, true);
                }
                return sArr2;
            }
            throw new com.qq.taf.jce.C2856xe9f52235("size invalid: " + m21299x355996);
        }
        throw new com.qq.taf.jce.C2856xe9f52235("type mismatch.");
    }

    /* renamed from: read */
    public int[] m21309x355996(int[] iArr, int i17, boolean z17) {
        if (!m21325x7c3c24e0(i17)) {
            if (z17) {
                throw new com.qq.taf.jce.C2856xe9f52235("require field not exist.");
            }
            return null;
        }
        com.qq.taf.jce.C2859xe10ac61e.HeadData headData = new com.qq.taf.jce.C2859xe10ac61e.HeadData();
        m21318xcc44e096(headData);
        if (headData.f9751x368f3a == 9) {
            int m21299x355996 = m21299x355996(0, 0, true);
            if (m21299x355996 >= 0) {
                int[] iArr2 = new int[m21299x355996];
                for (int i18 = 0; i18 < m21299x355996; i18++) {
                    iArr2[i18] = m21299x355996(iArr2[0], 0, true);
                }
                return iArr2;
            }
            throw new com.qq.taf.jce.C2856xe9f52235("size invalid: " + m21299x355996);
        }
        throw new com.qq.taf.jce.C2856xe9f52235("type mismatch.");
    }

    /* renamed from: read */
    public long[] m21310x355996(long[] jArr, int i17, boolean z17) {
        if (!m21325x7c3c24e0(i17)) {
            if (z17) {
                throw new com.qq.taf.jce.C2856xe9f52235("require field not exist.");
            }
            return null;
        }
        com.qq.taf.jce.C2859xe10ac61e.HeadData headData = new com.qq.taf.jce.C2859xe10ac61e.HeadData();
        m21318xcc44e096(headData);
        if (headData.f9751x368f3a == 9) {
            int m21299x355996 = m21299x355996(0, 0, true);
            if (m21299x355996 >= 0) {
                long[] jArr2 = new long[m21299x355996];
                for (int i18 = 0; i18 < m21299x355996; i18++) {
                    jArr2[i18] = m21300x355996(jArr2[0], 0, true);
                }
                return jArr2;
            }
            throw new com.qq.taf.jce.C2856xe9f52235("size invalid: " + m21299x355996);
        }
        throw new com.qq.taf.jce.C2856xe9f52235("type mismatch.");
    }

    /* renamed from: read */
    public float[] m21308x355996(float[] fArr, int i17, boolean z17) {
        if (!m21325x7c3c24e0(i17)) {
            if (z17) {
                throw new com.qq.taf.jce.C2856xe9f52235("require field not exist.");
            }
            return null;
        }
        com.qq.taf.jce.C2859xe10ac61e.HeadData headData = new com.qq.taf.jce.C2859xe10ac61e.HeadData();
        m21318xcc44e096(headData);
        if (headData.f9751x368f3a == 9) {
            int m21299x355996 = m21299x355996(0, 0, true);
            if (m21299x355996 >= 0) {
                float[] fArr2 = new float[m21299x355996];
                for (int i18 = 0; i18 < m21299x355996; i18++) {
                    fArr2[i18] = m21298x355996(fArr2[0], 0, true);
                }
                return fArr2;
            }
            throw new com.qq.taf.jce.C2856xe9f52235("size invalid: " + m21299x355996);
        }
        throw new com.qq.taf.jce.C2856xe9f52235("type mismatch.");
    }

    /* renamed from: read */
    public double[] m21307x355996(double[] dArr, int i17, boolean z17) {
        if (!m21325x7c3c24e0(i17)) {
            if (z17) {
                throw new com.qq.taf.jce.C2856xe9f52235("require field not exist.");
            }
            return null;
        }
        com.qq.taf.jce.C2859xe10ac61e.HeadData headData = new com.qq.taf.jce.C2859xe10ac61e.HeadData();
        m21318xcc44e096(headData);
        if (headData.f9751x368f3a == 9) {
            int m21299x355996 = m21299x355996(0, 0, true);
            if (m21299x355996 >= 0) {
                double[] dArr2 = new double[m21299x355996];
                for (int i18 = 0; i18 < m21299x355996; i18++) {
                    dArr2[i18] = m21297x355996(dArr2[0], 0, true);
                }
                return dArr2;
            }
            throw new com.qq.taf.jce.C2856xe9f52235("size invalid: " + m21299x355996);
        }
        throw new com.qq.taf.jce.C2856xe9f52235("type mismatch.");
    }

    /* renamed from: read */
    public com.qq.taf.jce.AbstractC2861x7aec4921 m21301x355996(com.qq.taf.jce.AbstractC2861x7aec4921 abstractC2861x7aec4921, int i17, boolean z17) {
        if (!m21325x7c3c24e0(i17)) {
            if (z17) {
                throw new com.qq.taf.jce.C2856xe9f52235("require field not exist.");
            }
            return null;
        }
        try {
            com.qq.taf.jce.AbstractC2861x7aec4921 abstractC2861x7aec49212 = (com.qq.taf.jce.AbstractC2861x7aec4921) abstractC2861x7aec4921.getClass().newInstance();
            com.qq.taf.jce.C2859xe10ac61e.HeadData headData = new com.qq.taf.jce.C2859xe10ac61e.HeadData();
            m21318xcc44e096(headData);
            if (headData.f9751x368f3a == 10) {
                abstractC2861x7aec49212.mo21234xcc442a60(this);
                m21324x3dab518c();
                return abstractC2861x7aec49212;
            }
            throw new com.qq.taf.jce.C2856xe9f52235("type mismatch.");
        } catch (java.lang.Exception e17) {
            throw new com.qq.taf.jce.C2856xe9f52235(e17.getMessage());
        }
    }

    /* renamed from: read */
    public com.qq.taf.jce.AbstractC2861x7aec4921[] m21311x355996(com.qq.taf.jce.AbstractC2861x7aec4921[] abstractC2861x7aec4921Arr, int i17, boolean z17) {
        return (com.qq.taf.jce.AbstractC2861x7aec4921[]) m21316xbbfab663(abstractC2861x7aec4921Arr, i17, z17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: read */
    public <T> java.lang.Object m21302x355996(T t17, int i17, boolean z17) {
        if (t17 instanceof java.lang.Byte) {
            return java.lang.Byte.valueOf(m21296x355996((byte) 0, i17, z17));
        }
        if (t17 instanceof java.lang.Boolean) {
            return java.lang.Boolean.valueOf(m21305x355996(false, i17, z17));
        }
        if (t17 instanceof java.lang.Short) {
            return java.lang.Short.valueOf(m21304x355996((short) 0, i17, z17));
        }
        if (t17 instanceof java.lang.Integer) {
            return java.lang.Integer.valueOf(m21299x355996(0, i17, z17));
        }
        if (t17 instanceof java.lang.Long) {
            return java.lang.Long.valueOf(m21300x355996(0L, i17, z17));
        }
        if (t17 instanceof java.lang.Float) {
            return java.lang.Float.valueOf(m21298x355996(0.0f, i17, z17));
        }
        if (t17 instanceof java.lang.Double) {
            return java.lang.Double.valueOf(m21297x355996(0.0d, i17, z17));
        }
        if (t17 instanceof java.lang.String) {
            return m21321xe22f9d47(i17, z17);
        }
        if (t17 instanceof java.util.Map) {
            return m21320x406563e6((java.util.Map) t17, i17, z17);
        }
        if (t17 instanceof java.util.List) {
            return m21315xbbfab663((java.util.List) t17, i17, z17);
        }
        if (t17 instanceof com.qq.taf.jce.AbstractC2861x7aec4921) {
            return m21301x355996((com.qq.taf.jce.AbstractC2861x7aec4921) t17, i17, z17);
        }
        if (t17.getClass().isArray()) {
            if (!(t17 instanceof byte[]) && !(t17 instanceof java.lang.Byte[])) {
                if (t17 instanceof boolean[]) {
                    return m21314x355996((boolean[]) null, i17, z17);
                }
                if (t17 instanceof short[]) {
                    return m21313x355996((short[]) null, i17, z17);
                }
                if (t17 instanceof int[]) {
                    return m21309x355996((int[]) null, i17, z17);
                }
                if (t17 instanceof long[]) {
                    return m21310x355996((long[]) null, i17, z17);
                }
                if (t17 instanceof float[]) {
                    return m21308x355996((float[]) null, i17, z17);
                }
                if (t17 instanceof double[]) {
                    return m21307x355996((double[]) null, i17, z17);
                }
                return m21316xbbfab663((java.lang.Object[]) t17, i17, z17);
            }
            return m21306x355996((byte[]) null, i17, z17);
        }
        throw new com.qq.taf.jce.C2856xe9f52235("read object error: unsupport type.");
    }
}
