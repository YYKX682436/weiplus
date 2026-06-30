package com.p314xaae8f345.mm.p2495xc50a8b8b;

/* loaded from: classes12.dex */
public abstract class e extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: __cachedMaps */
    private java.lang.Object[] f38870x1dbb0eb9;

    /* renamed from: __fields */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.j[] f38871xe2052299;

    /* renamed from: __hasSetBitSet */
    private boolean[] f38872x18b4fd7d;

    /* renamed from: __hasSetEnabled */
    public boolean f38873xa420cad9;

    /* renamed from: __printBytes */
    public boolean f38874x227b759e;

    public e(com.p314xaae8f345.mm.p2495xc50a8b8b.k... attrs) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        java.util.ArrayList arrayList = new java.util.ArrayList(attrs.length);
        for (com.p314xaae8f345.mm.p2495xc50a8b8b.k kVar : attrs) {
            arrayList.add(new com.p314xaae8f345.mm.p2495xc50a8b8b.j(kVar, null, 2, null));
        }
        this.f38871xe2052299 = (com.p314xaae8f345.mm.p2495xc50a8b8b.j[]) arrayList.toArray(new com.p314xaae8f345.mm.p2495xc50a8b8b.j[0]);
        this.f38872x18b4fd7d = new boolean[attrs.length];
        this.f38870x1dbb0eb9 = new java.lang.Object[attrs.length];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: addElement */
    public final <T> void m75926xea0771b(int i17, T t17) {
        java.util.HashMap hashMap;
        m75941xfb821914(i17).add(t17);
        if (this.f38871xe2052299[i17].f273691a.f273698f && (hashMap = (java.util.HashMap) this.f38870x1dbb0eb9[i17]) != null && (t17 instanceof com.p314xaae8f345.mm.p2495xc50a8b8b.e)) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.e eVar = (com.p314xaae8f345.mm.p2495xc50a8b8b.e) t17;
            java.lang.Object mo75944x4aabfc28 = eVar.mo75944x4aabfc28(0);
            java.lang.Object mo75944x4aabfc282 = eVar.mo75944x4aabfc28(1);
            if (mo75944x4aabfc28 == null || mo75944x4aabfc282 == null) {
                return;
            }
            hashMap.put(mo75944x4aabfc28, mo75944x4aabfc282);
        }
    }

    /* renamed from: appendAttrs */
    public int mo75927x8ded05a8(com.p314xaae8f345.mm.p2495xc50a8b8b.k[] attrs) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        com.p314xaae8f345.mm.p2495xc50a8b8b.j[] jVarArr = this.f38871xe2052299;
        int length = jVarArr.length;
        java.util.ArrayList arrayList = new java.util.ArrayList(attrs.length);
        int length2 = attrs.length;
        int i17 = 0;
        int i18 = 0;
        while (i17 < length2) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.k kVar = attrs[i17];
            int i19 = i18 + 1;
            if (kVar.f273693a == -1) {
                kVar.f273693a = i18 + length + 1;
            }
            arrayList.add(new com.p314xaae8f345.mm.p2495xc50a8b8b.j(kVar, null, 2, null));
            i17++;
            i18 = i19;
        }
        this.f38871xe2052299 = (com.p314xaae8f345.mm.p2495xc50a8b8b.j[]) kz5.v.z(jVarArr, arrayList.toArray(new com.p314xaae8f345.mm.p2495xc50a8b8b.j[0]));
        boolean[] zArr = this.f38872x18b4fd7d;
        int length3 = attrs.length;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(zArr, "<this>");
        int length4 = zArr.length;
        boolean[] copyOf = java.util.Arrays.copyOf(zArr, length4 + length3);
        java.lang.System.arraycopy(new boolean[length3], 0, copyOf, length4, length3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(copyOf);
        this.f38872x18b4fd7d = copyOf;
        this.f38870x1dbb0eb9 = new java.lang.Object[attrs.length];
        return length;
    }

    public final java.lang.Object b(com.p314xaae8f345.mm.p2495xc50a8b8b.k kVar, java.lang.Object obj) {
        java.lang.Object j17;
        java.lang.reflect.Constructor constructor;
        switch (kVar.f273696d) {
            case 2:
                return r26.h0.h(java.lang.String.valueOf(obj));
            case 3:
                if (!(obj instanceof java.lang.Number)) {
                    j17 = r26.h0.j(java.lang.String.valueOf(obj));
                    break;
                } else {
                    j17 = java.lang.Long.valueOf(((java.lang.Number) obj).longValue());
                    break;
                }
            case 4:
                return r26.g0.e(java.lang.String.valueOf(obj));
            case 5:
                return r26.g0.f(java.lang.String.valueOf(obj));
            case 6:
                if (!this.f38874x227b759e) {
                    j17 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.a((java.lang.String) obj, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                    break;
                } else {
                    j17 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(n51.d.a((java.lang.String) obj, 0));
                    break;
                }
            case 7:
                return java.lang.Boolean.valueOf(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.String.valueOf(obj), "true"));
            case 8:
                java.lang.Class cls = kVar.f273697e;
                java.lang.Object newInstance = (cls == null || (constructor = cls.getConstructor(new java.lang.Class[0])) == null) ? null : constructor.newInstance(new java.lang.Object[0]);
                return (newInstance == null || !(newInstance instanceof com.p314xaae8f345.mm.p2495xc50a8b8b.f)) ? obj : ((com.p314xaae8f345.mm.p2495xc50a8b8b.f) newInstance).mo75930xb5cb93b2(java.lang.String.valueOf(obj));
            default:
                return obj;
        }
        return j17;
    }

    public final java.lang.Object c(com.p314xaae8f345.mm.p2495xc50a8b8b.k kVar, c36.a aVar, int i17) {
        java.lang.reflect.Constructor constructor;
        switch (kVar.f273696d) {
            case 1:
                return aVar.k(i17);
            case 2:
                return java.lang.Integer.valueOf(aVar.g(i17));
            case 3:
                return java.lang.Long.valueOf(aVar.i(i17));
            case 4:
                return java.lang.Double.valueOf(aVar.e(i17));
            case 5:
                return java.lang.Float.valueOf(aVar.f(i17));
            case 6:
                return aVar.d(i17);
            case 7:
                return java.lang.Boolean.valueOf(aVar.c(i17));
            case 8:
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.LinkedList j17 = aVar.j(i17);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    java.lang.Object obj = j17.get(i18);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                    byte[] bArr = (byte[]) obj;
                    try {
                        java.lang.Class cls = kVar.f273697e;
                        java.lang.Object newInstance = (cls == null || (constructor = cls.getConstructor(new java.lang.Class[0])) == null) ? null : constructor.newInstance(new java.lang.Object[0]);
                        if (newInstance != null && (newInstance instanceof com.p314xaae8f345.mm.p2495xc50a8b8b.f)) {
                            if (!(bArr.length == 0)) {
                                ((com.p314xaae8f345.mm.p2495xc50a8b8b.f) newInstance).mo11468x92b714fd(bArr);
                            }
                            arrayList.add(newInstance);
                        }
                    } catch (java.lang.Exception unused) {
                    }
                }
                return arrayList;
            default:
                this.f38880x64ce93d8 = true;
                return null;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (!(fVar instanceof com.p314xaae8f345.mm.p2495xc50a8b8b.e)) {
            return false;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.j[] jVarArr = this.f38871xe2052299;
        com.p314xaae8f345.mm.p2495xc50a8b8b.e eVar = (com.p314xaae8f345.mm.p2495xc50a8b8b.e) fVar;
        if (jVarArr.length != eVar.f38871xe2052299.length) {
            return false;
        }
        int length = jVarArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            if (!n51.f.f416647a.a(mo75944x4aabfc28(i17), eVar.mo75944x4aabfc28(i17))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: computeSize */
    public int mo75928xcd1e8d8() {
        int j17;
        try {
            com.p314xaae8f345.mm.p2495xc50a8b8b.j[] jVarArr = this.f38871xe2052299;
            int length = jVarArr.length;
            int i17 = 0;
            for (int i18 = 0; i18 < length; i18++) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.k kVar = jVarArr[i18].f273691a;
                int i19 = kVar.f273693a;
                if (kVar.f273695c) {
                    j17 = b36.f.g(i19, kVar.f273696d, m75940x3e48ce4d(i18));
                } else {
                    if (!this.f38873xa420cad9 || m75948xb7047368(i18)) {
                        switch (kVar.f273696d) {
                            case 1:
                                java.lang.String m75945x2fec8307 = m75945x2fec8307(i18);
                                if (m75945x2fec8307 != null) {
                                    j17 = b36.f.j(i19, m75945x2fec8307);
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                j17 = b36.f.e(i19, m75939xb282bd08(i18));
                                break;
                            case 3:
                                j17 = b36.f.h(i19, m75942xfb822ef2(i18));
                                break;
                            case 4:
                                j17 = b36.f.c(i19, m75937x160e9ec7(i18));
                                break;
                            case 5:
                                j17 = b36.f.d(i19, m75938x746dc8a6(i18));
                                break;
                            case 6:
                                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = m75934xbce7f2f(i18);
                                if (m75934xbce7f2f != null) {
                                    j17 = b36.f.b(i19, m75934xbce7f2f);
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                j17 = b36.f.a(i19, m75933x41a8a7f2(i18));
                                break;
                            case 8:
                                com.p314xaae8f345.mm.p2495xc50a8b8b.f m75936x14adae67 = m75936x14adae67(i18);
                                if (m75936x14adae67 != null) {
                                    j17 = b36.f.i(i19, m75936x14adae67.mo75928xcd1e8d8());
                                    break;
                                } else {
                                    break;
                                }
                            default:
                                continue;
                        }
                    }
                }
                i17 += j17;
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.n.c(this.f38881x23d0e69c, java.lang.Integer.valueOf(i17));
            return i17;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.n.a("computeSize(PB3) error", e17);
            return 0;
        }
    }

    /* renamed from: debugString */
    public final java.lang.String m75929xa3479844() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.j[] jVarArr = this.f38871xe2052299;
        if (jVarArr.length != 2 || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jVarArr[0].f273691a.f273694b, "key") || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f38871xe2052299[1].f273691a.f273694b, "value")) {
            java.lang.String jSONObject = mo12245xcc313de3().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            return jSONObject;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.j[] jVarArr2 = this.f38871xe2052299;
        return jVarArr2[0].f273692b + "=" + jVarArr2[1].f273692b;
    }

    /* renamed from: fromProtobuf */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.f m75932x347fbd55(byte[] bArr) {
        return mo11468x92b714fd(bArr);
    }

    /* renamed from: getBoolean */
    public final boolean m75933x41a8a7f2(int i17) {
        java.lang.Boolean bool = (java.lang.Boolean) mo75944x4aabfc28(i17);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: getByteString */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f(int i17) {
        return (com.p314xaae8f345.mm.p2495xc50a8b8b.g) mo75944x4aabfc28(i17);
    }

    /* renamed from: getCommonList */
    public final <T> java.util.List<T> m75935x34d7191f(int i17) {
        java.lang.Object mo75944x4aabfc28 = mo75944x4aabfc28(i17);
        if (mo75944x4aabfc28 instanceof java.util.List) {
            return (java.util.List) mo75944x4aabfc28;
        }
        return null;
    }

    /* renamed from: getCustom */
    public final <T extends com.p314xaae8f345.mm.p2495xc50a8b8b.f> T m75936x14adae67(int i17) {
        java.lang.Object mo75944x4aabfc28 = mo75944x4aabfc28(i17);
        if (mo75944x4aabfc28 instanceof com.p314xaae8f345.mm.p2495xc50a8b8b.f) {
            return (T) mo75944x4aabfc28;
        }
        return null;
    }

    /* renamed from: getDouble */
    public final double m75937x160e9ec7(int i17) {
        java.lang.Double d17 = (java.lang.Double) mo75944x4aabfc28(i17);
        if (d17 != null) {
            return d17.doubleValue();
        }
        return 0.0d;
    }

    /* renamed from: getFloat */
    public final float m75938x746dc8a6(int i17) {
        java.lang.Float f17 = (java.lang.Float) mo75944x4aabfc28(i17);
        if (f17 != null) {
            return f17.floatValue();
        }
        return 0.0f;
    }

    /* renamed from: getInteger */
    public final int m75939xb282bd08(int i17) {
        java.lang.Integer num = (java.lang.Integer) mo75944x4aabfc28(i17);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: getLinkedList */
    public final <T> java.util.LinkedList<T> m75940x3e48ce4d(int i17) {
        java.lang.Object mo75944x4aabfc28 = mo75944x4aabfc28(i17);
        if (mo75944x4aabfc28 instanceof java.util.LinkedList) {
            return (java.util.LinkedList) mo75944x4aabfc28;
        }
        return null;
    }

    /* renamed from: getList */
    public final <T> java.util.LinkedList<T> m75941xfb821914(int i17) {
        java.util.LinkedList<T> m75940x3e48ce4d = m75940x3e48ce4d(i17);
        if (m75940x3e48ce4d != null) {
            return m75940x3e48ce4d;
        }
        java.util.LinkedList<T> linkedList = new java.util.LinkedList<>();
        set(i17, linkedList);
        return linkedList;
    }

    /* renamed from: getLong */
    public final long m75942xfb822ef2(int i17) {
        java.lang.Long l17 = (java.lang.Long) mo75944x4aabfc28(i17);
        if (l17 != null) {
            return l17.longValue();
        }
        return 0L;
    }

    /* renamed from: getMap */
    public final <K, V> java.util.HashMap<K, V> m75943xb5885626(int i17) {
        java.util.HashMap<K, V> hashMap = (java.util.HashMap) this.f38870x1dbb0eb9[i17];
        if (hashMap != null) {
            return hashMap;
        }
        java.util.LinkedList<com.p314xaae8f345.mm.p2495xc50a8b8b.e> m75941xfb821914 = m75941xfb821914(i17);
        com.p314xaae8f345.mm.p2495xc50a8b8b.m mVar = new com.p314xaae8f345.mm.p2495xc50a8b8b.m(new com.p314xaae8f345.mm.p2495xc50a8b8b.a(m75941xfb821914), new com.p314xaae8f345.mm.p2495xc50a8b8b.b(this.f38871xe2052299[i17].f273691a, m75941xfb821914), new com.p314xaae8f345.mm.p2495xc50a8b8b.c(m75941xfb821914));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.p314xaae8f345.mm.p2495xc50a8b8b.e eVar : m75941xfb821914) {
            java.lang.Object mo75944x4aabfc28 = eVar.mo75944x4aabfc28(0);
            java.lang.Object mo75944x4aabfc282 = eVar.mo75944x4aabfc28(1);
            jz5.l lVar = (mo75944x4aabfc28 == null || mo75944x4aabfc282 == null) ? null : new jz5.l(mo75944x4aabfc28, mo75944x4aabfc282);
            if (lVar != null) {
                arrayList.add(lVar);
            }
        }
        mVar.a(arrayList);
        this.f38870x1dbb0eb9[i17] = mVar;
        return mVar;
    }

    /* renamed from: getOrDefault */
    public java.lang.Object mo75944x4aabfc28(int i17) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.j jVar = this.f38871xe2052299[i17];
        java.lang.Object obj = jVar.f273692b;
        if (obj != null) {
            return obj;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.k kVar = jVar.f273691a;
        if (!kVar.f273695c || (kVar.f273699g instanceof java.util.LinkedList)) {
            return kVar.f273699g;
        }
        return null;
    }

    /* renamed from: getString */
    public final java.lang.String m75945x2fec8307(int i17) {
        return (java.lang.String) mo75944x4aabfc28(i17);
    }

    /* renamed from: get__fields */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.j[] m75946x5a04fbef() {
        return this.f38871xe2052299;
    }

    /* renamed from: get__hasSetBitSet */
    public final boolean[] m75947x4305fe53() {
        return this.f38872x18b4fd7d;
    }

    /* renamed from: hasSet */
    public final boolean m75948xb7047368(int i17) {
        return this.f38872x18b4fd7d[i17];
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        this.f38881x23d0e69c = bArr;
        d36.b unknownTagHandler = com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(unknownTagHandler, "unknownTagHandler");
        c36.a aVar = new c36.a(bArr, unknownTagHandler);
        for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
            if (!mo75949x4476b383(aVar, this, m75958x5767edba)) {
                aVar.b();
            }
        }
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: populateBuilderWithField */
    public boolean mo75949x4476b383(c36.a reader, com.p314xaae8f345.mm.p2495xc50a8b8b.f builder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reader, "reader");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(builder, "builder");
        com.p314xaae8f345.mm.p2495xc50a8b8b.j[] jVarArr = this.f38871xe2052299;
        int length = jVarArr.length;
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                i18 = -1;
                break;
            }
            if (jVarArr[i18].f273691a.f273693a == i17) {
                break;
            }
            i18++;
        }
        if (i18 == -1) {
            this.f38880x64ce93d8 = true;
            return false;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.k kVar = this.f38871xe2052299[i18].f273691a;
        if (kVar.f273695c) {
            java.lang.Object c17 = c(kVar, reader, i17);
            if (c17 instanceof java.util.List) {
                java.util.Iterator it = ((java.lang.Iterable) c17).iterator();
                while (it.hasNext()) {
                    m75926xea0771b(i18, it.next());
                }
            } else {
                m75926xea0771b(i18, c17);
            }
        } else {
            java.lang.Object c18 = c(kVar, reader, i17);
            if (kVar.f273696d == 8 && (c18 instanceof java.util.List)) {
                java.util.Iterator it6 = ((java.lang.Iterable) c18).iterator();
                while (it6.hasNext()) {
                    set(i18, it6.next());
                }
            } else {
                set(i18, c18);
            }
        }
        return true;
    }

    /* renamed from: replaceDefault */
    public final void m75950x7e1708ed(int i17, java.lang.Object[] replaceList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(replaceList, "replaceList");
        int length = replaceList.length;
        for (int i18 = 0; i18 < length; i18++) {
            this.f38871xe2052299[i17 + i18].f273691a.f273699g = replaceList[i18];
        }
    }

    public void set(int i17, java.lang.Object obj) {
        this.f38871xe2052299[i17].f273692b = obj;
        this.f38872x18b4fd7d[i17] = true;
    }

    /* renamed from: set__fields */
    public final void m75951x54bd5cfb(com.p314xaae8f345.mm.p2495xc50a8b8b.j[] jVarArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jVarArr, "<set-?>");
        this.f38871xe2052299 = jVarArr;
    }

    /* renamed from: set__hasSetBitSet */
    public final void m75952xafc665f(boolean[] zArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(zArr, "<set-?>");
        this.f38872x18b4fd7d = zArr;
    }

    /* renamed from: toHexString */
    public final java.lang.String m75953x72b50ad1() {
        byte[] mo14344x5f01b1f6 = mo14344x5f01b1f6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
        return kz5.z.a0(mo14344x5f01b1f6, "", null, null, 0, null, com.p314xaae8f345.mm.p2495xc50a8b8b.d.f273687d, 30, null);
    }

    /* renamed from: toProtobuf */
    public final byte[] m75954xc3d85326() {
        return mo14344x5f01b1f6();
    }

    /* renamed from: touchList */
    public final void m75955x15ab4c7d(int i17) {
        m75941xfb821914(i17);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: writeFields */
    public void mo75956x3d5d1f78(g36.f fVar) {
        if (fVar == null) {
            return;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.j[] jVarArr = this.f38871xe2052299;
        int length = jVarArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.k kVar = jVarArr[i17].f273691a;
            int i18 = kVar.f273693a;
            if (kVar.f273695c) {
                java.util.LinkedList m75940x3e48ce4d = m75940x3e48ce4d(i17);
                if (m75940x3e48ce4d != null) {
                    if (!(!m75940x3e48ce4d.isEmpty())) {
                        m75940x3e48ce4d = null;
                    }
                    if (m75940x3e48ce4d != null) {
                        fVar.g(i18, kVar.f273696d, m75940x3e48ce4d);
                    }
                }
            } else if (!this.f38873xa420cad9 || m75948xb7047368(i17)) {
                switch (kVar.f273696d) {
                    case 1:
                        java.lang.String m75945x2fec8307 = m75945x2fec8307(i17);
                        if (m75945x2fec8307 != null) {
                            fVar.j(i18, m75945x2fec8307);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        fVar.e(i18, m75939xb282bd08(i17));
                        break;
                    case 3:
                        fVar.h(i18, m75942xfb822ef2(i17));
                        break;
                    case 4:
                        fVar.c(i18, m75937x160e9ec7(i17));
                        break;
                    case 5:
                        fVar.d(i18, m75938x746dc8a6(i17));
                        break;
                    case 6:
                        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = m75934xbce7f2f(i17);
                        if (m75934xbce7f2f != null) {
                            fVar.b(i18, m75934xbce7f2f);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        fVar.a(i18, m75933x41a8a7f2(i17));
                        break;
                    case 8:
                        com.p314xaae8f345.mm.p2495xc50a8b8b.f m75936x14adae67 = m75936x14adae67(i17);
                        if (m75936x14adae67 != null) {
                            fVar.i(i18, m75936x14adae67.mo75928xcd1e8d8());
                            m75936x14adae67.mo75956x3d5d1f78(fVar);
                            break;
                        } else {
                            break;
                        }
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: fromJson */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.e mo75930xb5cb93b2(java.lang.String str) {
        if (str == null || r26.n0.N(str)) {
            return this;
        }
        try {
            m75931xb5cb93b2(new org.json.JSONObject(str));
        } catch (java.lang.Exception unused) {
        }
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public org.json.JSONObject mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            com.p314xaae8f345.mm.p2495xc50a8b8b.j[] jVarArr = this.f38871xe2052299;
            int length = jVarArr.length;
            for (int i17 = 0; i17 < length; i17++) {
                java.lang.String str = jVarArr[i17].f273691a.f273694b;
                if (!this.f38873xa420cad9 || m75948xb7047368(i17)) {
                    java.lang.Object mo75944x4aabfc28 = mo75944x4aabfc28(i17);
                    if (str != null) {
                        n51.f.f416647a.d(jSONObject, str, mo75944x4aabfc28, this.f38874x227b759e);
                    }
                }
            }
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: fromJson */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.e m75931xb5cb93b2(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return this;
        }
        try {
            com.p314xaae8f345.mm.p2495xc50a8b8b.j[] jVarArr = this.f38871xe2052299;
            int length = jVarArr.length;
            int i17 = 0;
            int i18 = 0;
            while (i17 < length) {
                int i19 = i18 + 1;
                com.p314xaae8f345.mm.p2495xc50a8b8b.k kVar = jVarArr[i17].f273691a;
                java.lang.Object opt = jSONObject.opt(kVar.f273694b);
                if (opt != null) {
                    if (kVar.f273695c) {
                        if (opt instanceof org.json.JSONArray) {
                            int length2 = ((org.json.JSONArray) opt).length();
                            for (int i27 = 0; i27 < length2; i27++) {
                                m75926xea0771b(i18, b(kVar, ((org.json.JSONArray) opt).get(i27)));
                            }
                        }
                    } else {
                        set(i18, b(kVar, opt));
                    }
                }
                i17++;
                i18 = i19;
            }
        } catch (java.lang.Exception unused) {
        }
        return this;
    }
}
