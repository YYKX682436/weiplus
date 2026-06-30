package e14;

/* loaded from: classes12.dex */
public class k extends e14.l implements e14.s, e14.n {

    /* renamed from: __lazy */
    private boolean f69648xa789af54;

    /* renamed from: __parentVisitor */
    private e14.s f69650x62a8d084;

    /* renamed from: __parser */
    private e14.p f69651xf2aadfff;

    /* renamed from: __useLruCache */
    private boolean f69654xd6f38bda;

    /* renamed from: waitingIndex */
    private java.lang.Integer f69656x69a18a85;

    /* renamed from: __serialName */
    private java.lang.String f69652xf819867f = "";

    /* renamed from: __xmlPrefixTag */
    private java.lang.String f69655x8e1a6931 = "";

    /* renamed from: __trim */
    private boolean f69653xa78d9002 = true;

    /* renamed from: __nameMap */
    private java.util.Map<java.lang.String, java.lang.Integer> f69649xf8977af1 = kz5.q0.f395534d;

    /* renamed from: access$tryPauseLazyParse */
    public static final void m126720xe07ec9a4(e14.k kVar, int i17) {
        java.lang.Integer num;
        e14.p pVar;
        if (!kVar.f69648xa789af54 || (num = kVar.f69656x69a18a85) == null || num.intValue() != i17 || (pVar = kVar.f69651xf2aadfff) == null) {
            return;
        }
        pVar.f327970b = true;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.e
    /* renamed from: appendAttrs */
    public int mo75927x8ded05a8(com.p314xaae8f345.mm.p2495xc50a8b8b.k[] attrs) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        int mo75927x8ded05a8 = super.mo75927x8ded05a8(attrs);
        com.p314xaae8f345.mm.p2495xc50a8b8b.j[] m75946x5a04fbef = m75946x5a04fbef();
        java.util.ArrayList arrayList = new java.util.ArrayList(m75946x5a04fbef.length);
        int length = m75946x5a04fbef.length;
        int i17 = 0;
        int i18 = 0;
        while (i17 < length) {
            arrayList.add(new jz5.l(m75946x5a04fbef[i17].f273691a.f273694b, java.lang.Integer.valueOf(i18)));
            i17++;
            i18++;
        }
        this.f69649xf8977af1 = kz5.c1.q(arrayList);
        return mo75927x8ded05a8;
    }

    /* renamed from: cloneFrom */
    public void m126722xdaaf72a7(e14.n other) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        if (!(other instanceof e14.k)) {
            m75931xb5cb93b2(other.mo126745xcc31ba03());
            return;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.j[] m75946x5a04fbef = ((e14.k) other).m126723x256eca81().m75946x5a04fbef();
        int length = m75946x5a04fbef.length;
        int i17 = 0;
        int i18 = 0;
        while (i17 < length) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.j jVar = m75946x5a04fbef[i17];
            int i19 = i18 + 1;
            if (m75946x5a04fbef().length <= i18 || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75946x5a04fbef()[i18].f273691a.f273694b, jVar.f273691a.f273694b)) {
                java.lang.Integer num = this.f69649xf8977af1.get(jVar.f273691a.f273694b);
                if (num != null && num.intValue() >= 0 && num.intValue() < m75946x5a04fbef().length) {
                    m75946x5a04fbef()[num.intValue()].f273692b = jVar.f273692b;
                    m75946x5a04fbef()[num.intValue()].f273691a.f273699g = jVar.f273691a.f273699g;
                }
            } else {
                m75946x5a04fbef()[i18].f273692b = jVar.f273692b;
                m75946x5a04fbef()[i18].f273691a.f273699g = jVar.f273691a.f273699g;
            }
            i17++;
            i18 = i19;
        }
    }

    public final java.lang.Object d(java.lang.String str, int i17) {
        if (i17 == 1) {
            return str;
        }
        if (i17 == 2) {
            return m126773x6e4f0a(str, null);
        }
        if (i17 == 3) {
            return m126774xd5cf2c1(str, null);
        }
        if (i17 == 4) {
            return m126771x1c47aad6(str, null);
        }
        if (i17 == 5) {
            return m126772x9deb7eb7(str, null);
        }
        if (i17 == 7) {
            return m126770x2911dc3(str, null);
        }
        throw new java.lang.Exception("Unknown primary data type " + str);
    }

    /* renamed from: deepCopy */
    public final e14.k m126723x256eca81() {
        int i17 = 0;
        e14.k kVar = (e14.k) getClass().getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        com.p314xaae8f345.mm.p2495xc50a8b8b.j[] m75946x5a04fbef = m75946x5a04fbef();
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(m75946x5a04fbef, m75946x5a04fbef.length);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(copyOf, "copyOf(...)");
        int length = copyOf.length;
        int i18 = 0;
        while (i17 < length) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.j jVar = (com.p314xaae8f345.mm.p2495xc50a8b8b.j) copyOf[i17];
            com.p314xaae8f345.mm.p2495xc50a8b8b.k kVar2 = kVar.m75946x5a04fbef()[i18].f273691a;
            zn4.a aVar = zn4.a.f556025a;
            kVar2.f273699g = aVar.a(jVar.f273691a.f273699g);
            kVar.m75946x5a04fbef()[i18].f273692b = aVar.a(jVar.f273692b);
            i17++;
            i18++;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(kVar);
        return kVar;
    }

    public final void e(java.lang.String str, java.lang.String str2) {
        java.util.Map<java.lang.String, java.lang.String> a17;
        boolean containsKey;
        boolean containsKey2;
        java.lang.String m126755xe50db2d8 = m126755xe50db2d8(this.f69652xf819867f, str2);
        java.lang.String str3 = str + "_" + m126755xe50db2d8;
        if (this.f69654xd6f38bda) {
            zn4.i iVar = zn4.i.f556038a;
            e14.o c17 = iVar.c();
            synchronized (c17) {
                containsKey2 = c17.f327965a.containsKey(str3);
            }
            if (containsKey2) {
                java.lang.Object a18 = iVar.c().a(str3);
                if (a18 instanceof java.util.Map) {
                    a17 = (java.util.Map) a18;
                } else {
                    iVar.c().c(str3);
                    a17 = e14.r.a(str, m126755xe50db2d8);
                }
            } else {
                a17 = e14.r.a(str, m126755xe50db2d8);
            }
        } else {
            a17 = e14.r.a(str, m126755xe50db2d8);
        }
        if (a17 != null) {
            m126733x88c2ee0f(a17, str2);
            if (this.f69654xd6f38bda) {
                zn4.i iVar2 = zn4.i.f556038a;
                e14.o c18 = iVar2.c();
                synchronized (c18) {
                    containsKey = c18.f327965a.containsKey(str3);
                }
                if (containsKey) {
                    return;
                }
                iVar2.c().b(str3, a17);
            }
        }
    }

    @Override // e14.s
    /* renamed from: enterParent */
    public e14.s mo126724xfd3879a2(java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        java.lang.Integer num = this.f69649xf8977af1.get(name);
        if (num == null || num.intValue() < 0 || num.intValue() >= m75946x5a04fbef().length) {
            ho4.g gVar = new ho4.g(this);
            this.f38880x64ce93d8 = true;
            return gVar;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.j jVar = m75946x5a04fbef()[num.intValue()];
        com.p314xaae8f345.mm.p2495xc50a8b8b.k kVar = jVar.f273691a;
        int i17 = kVar.f273696d;
        com.p314xaae8f345.mm.p2495xc50a8b8b.k kVar2 = jVar.f273691a;
        if (i17 != 8) {
            if (!kVar.f273695c || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(kVar.f273701i, "SerializeFieldFlattenItemTagName")) {
                return new ho4.e(this, new e14.f(this, num, jVar));
            }
            m75955x15ab4c7d(num.intValue());
            java.lang.String itemTagName = kVar2.f273701i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemTagName, "itemTagName");
            return new ho4.c(this, itemTagName, new e14.d(this, num, jVar), new e14.e(this, num));
        }
        if (kVar.f273695c && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(kVar.f273701i, "SerializeFieldFlattenItemTagName")) {
            m75955x15ab4c7d(num.intValue());
            java.lang.String itemTagName2 = kVar2.f273701i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemTagName2, "itemTagName");
            return new ho4.f(this, itemTagName2, new e14.b(jVar, this, num), new e14.c(this, num));
        }
        java.lang.Class cls = kVar2.f273697e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cls);
        e14.k kVar3 = (e14.k) cls.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        kVar3.f69650x62a8d084 = this;
        kVar3.f69648xa789af54 = this.f69648xa789af54;
        kVar3.f69651xf2aadfff = this.f69651xf2aadfff;
        i(num.intValue(), jVar, kVar3);
        return kVar3;
    }

    /* renamed from: existTag */
    public boolean m126725x8179e523(java.lang.String tagName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagName, "tagName");
        return this.f69649xf8977af1.containsKey(tagName);
    }

    @Override // e14.s
    /* renamed from: exitParent */
    public e14.s mo126726x2cbdf68() {
        return this.f69650x62a8d084;
    }

    public final void f(java.util.Map map, java.lang.String str, java.lang.String str2) {
        java.lang.reflect.Constructor declaredConstructor;
        java.lang.String str3;
        java.lang.StringBuilder sb6;
        if (!r26.n0.N(str2)) {
            str = str2 + "." + str;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.j[] m75946x5a04fbef = m75946x5a04fbef();
        int length = m75946x5a04fbef.length;
        int i17 = 0;
        int i18 = 0;
        while (i17 < length) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.j jVar = m75946x5a04fbef[i17];
            int i19 = i18 + 1;
            com.p314xaae8f345.mm.p2495xc50a8b8b.k kVar = jVar.f273691a;
            java.lang.Object obj = null;
            if (kVar.f273695c) {
                java.lang.Class cls = kVar.f273697e;
                java.lang.String str4 = str + "." + kVar.f273694b;
                if (cls == null) {
                    java.lang.Class<?> m126759xe0817ff7 = m126759xe0817ff7(kVar.f273696d);
                    if (m126759xe0817ff7 != null) {
                        java.lang.String itemTagName = kVar.f273701i;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemTagName, "itemTagName");
                        java.util.LinkedList g17 = g(m126759xe0817ff7, map, str4, itemTagName);
                        if (!g17.isEmpty()) {
                            m75941xfb821914(i18).addAll(g17);
                        }
                        obj = jz5.f0.f384359a;
                    }
                    if (obj == null) {
                        zn4.f.f556032a.a(new e14.g(jVar, map));
                    }
                } else {
                    java.lang.String itemTagName2 = kVar.f273701i;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemTagName2, "itemTagName");
                    java.util.LinkedList g18 = g(cls, map, str4, itemTagName2);
                    if (!g18.isEmpty()) {
                        m75941xfb821914(i18).addAll(g18);
                    }
                }
            } else if (kVar.f273697e == null) {
                if (kVar.f273700h) {
                    str3 = kVar.f273694b;
                    sb6 = new java.lang.StringBuilder(".");
                    sb6.append(str);
                    sb6.append(".$");
                } else {
                    str3 = kVar.f273694b;
                    sb6 = new java.lang.StringBuilder(".");
                    sb6.append(str);
                    sb6.append(".");
                }
                sb6.append(str3);
                java.lang.String str5 = (java.lang.String) map.get(sb6.toString());
                if (str5 != null) {
                    com.p314xaae8f345.mm.p2495xc50a8b8b.j jVar2 = m75946x5a04fbef()[i18];
                    i(i18, jVar2, d(str5, jVar2.f273691a.f273696d));
                }
            } else {
                if (map.containsKey("." + str + "." + kVar.f273694b)) {
                    java.lang.Class cls2 = kVar.f273697e;
                    if (cls2 != null && (declaredConstructor = cls2.getDeclaredConstructor(new java.lang.Class[0])) != null) {
                        obj = declaredConstructor.newInstance(new java.lang.Object[0]);
                    }
                    if (obj instanceof e14.k) {
                        java.lang.String name = kVar.f273694b;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
                        ((e14.k) obj).f(map, name, str);
                        i(i18, jVar, obj);
                    } else {
                        zn4.f.f556032a.a(new e14.h(jVar, map));
                    }
                }
            }
            i17++;
            i18 = i19;
        }
    }

    /* renamed from: fromJsonStr */
    public void m126727xb579bd1f(java.lang.String jsonStr) {
        boolean containsKey;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonStr, "jsonStr");
        if (this.f69654xd6f38bda) {
            zn4.i iVar = zn4.i.f556038a;
            e14.o b17 = iVar.b();
            synchronized (b17) {
                containsKey = b17.f327965a.containsKey(jsonStr);
            }
            if (containsKey) {
                e14.k kVar = (e14.k) iVar.b().a(jsonStr);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(kVar);
                m126722xdaaf72a7(kVar);
                return;
            }
        }
        m75931xb5cb93b2(new org.json.JSONObject(jsonStr));
        if (this.f69654xd6f38bda) {
            zn4.i.f556038a.b().b(jsonStr, m126723x256eca81());
        }
    }

    /* renamed from: fromXml */
    public void m126729xdc93280d(java.lang.String xml, java.lang.String xmlPrefixTag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xml, "xml");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xmlPrefixTag, "xmlPrefixTag");
        e14.m.a(this, xml, xmlPrefixTag, false, false, 8, null);
    }

    /* renamed from: fromXmlMap */
    public void m126732x88c2ee0f(java.util.Map<java.lang.String, java.lang.String> xmlValueMap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xmlValueMap, "xmlValueMap");
        m126733x88c2ee0f(xmlValueMap, this.f69655x8e1a6931);
    }

    public final java.util.LinkedList g(java.lang.Class cls, java.util.Map map, java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb6;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int i17 = 0;
        while (true) {
            if (m126756xb4eca23a(cls)) {
                java.lang.String str3 = r26.n0.N(str2) ? "item" : str2;
                if (i17 == 0) {
                    sb6 = new java.lang.StringBuilder(".");
                    sb6.append(str);
                    sb6.append(".");
                    sb6.append(str3);
                } else {
                    sb6 = new java.lang.StringBuilder(".");
                    sb6.append(str);
                    sb6.append(".");
                    sb6.append(str3);
                    sb6.append(i17);
                }
                java.lang.String sb7 = sb6.toString();
                if (!map.containsKey(sb7)) {
                    break;
                }
                java.lang.String str4 = (java.lang.String) map.get(sb7);
                if (str4 != null) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls, java.lang.Integer.TYPE)) {
                        linkedList.add(m126773x6e4f0a(str4, 0));
                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls, java.lang.Short.TYPE)) {
                        linkedList.add(m126775x9ea0e0d7(str4, (short) 0));
                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls, java.lang.Long.TYPE)) {
                        linkedList.add(m126774xd5cf2c1(str4, 0L));
                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls, java.lang.Double.TYPE)) {
                        linkedList.add(m126771x1c47aad6(str4, java.lang.Double.valueOf(0.0d)));
                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls, java.lang.Float.TYPE)) {
                        linkedList.add(m126772x9deb7eb7(str4, java.lang.Float.valueOf(0.0f)));
                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls, java.lang.Boolean.TYPE)) {
                        linkedList.add(m126770x2911dc3(str4, java.lang.Boolean.FALSE));
                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls, java.lang.String.class)) {
                        linkedList.add(m126776x36258f16(str4, ""));
                    }
                }
                i17++;
            } else {
                java.lang.Object newInstance = cls.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(newInstance, "null cannot be cast to non-null type com.tencent.mm.plugin.serialize.BaseSerializeClass");
                e14.k kVar = (e14.k) newInstance;
                java.lang.String str5 = r26.n0.N(str2) ? kVar.f69652xf819867f : str2;
                if (i17 != 0) {
                    str5 = str5 + i17;
                }
                if (!map.containsKey("." + str + "." + str5)) {
                    break;
                }
                kVar.f(map, str5, str);
                linkedList.add(kVar);
                i17++;
            }
        }
        return linkedList;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.e
    /* renamed from: getOrDefault */
    public java.lang.Object mo75944x4aabfc28(int i17) {
        if (this.f69648xa789af54 && this.f69651xf2aadfff != null && this.f69656x69a18a85 == null && !m75948xb7047368(i17)) {
            if (this.f69656x69a18a85 != null) {
                return super.mo75944x4aabfc28(i17);
            }
            this.f69656x69a18a85 = java.lang.Integer.valueOf(i17);
            e14.p pVar = this.f69651xf2aadfff;
            if (pVar != null) {
                pVar.b();
            }
            this.f69656x69a18a85 = null;
        }
        return super.mo75944x4aabfc28(i17);
    }

    /* renamed from: getTagValue */
    public java.lang.Object m126734x4dcbcf6d(java.lang.String tagName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagName, "tagName");
        java.lang.Integer num = this.f69649xf8977af1.get(tagName);
        if (num != null) {
            return mo75944x4aabfc28(num.intValue());
        }
        return null;
    }

    /* renamed from: get__parentVisitor */
    public final e14.s m126735x8277ea6e() {
        return this.f69650x62a8d084;
    }

    /* renamed from: get__serialName */
    public final java.lang.String m126736x4f40c4d5() {
        return this.f69652xf819867f;
    }

    /* renamed from: get__trim */
    public final boolean m126737x433fc6d8() {
        return this.f69653xa78d9002;
    }

    /* renamed from: get__useLruCache */
    public final boolean m126738x64b41844() {
        return this.f69654xd6f38bda;
    }

    /* renamed from: get__xmlPrefixTag */
    public final java.lang.String m126739xb86b6a07() {
        return this.f69655x8e1a6931;
    }

    public final void i(int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.j jVar, java.lang.Object obj) {
        java.lang.Integer num;
        e14.p pVar;
        if (jVar.f273691a.f273695c) {
            m75926xea0771b(i17, obj);
            return;
        }
        if (m75948xb7047368(i17)) {
            return;
        }
        set(i17, obj);
        if (!this.f69648xa789af54 || (num = this.f69656x69a18a85) == null || num.intValue() != i17 || (pVar = this.f69651xf2aadfff) == null) {
            return;
        }
        pVar.f327970b = true;
    }

    /* renamed from: set__parentVisitor */
    public final void m126740xb94e83e2(e14.s sVar) {
        this.f69650x62a8d084 = sVar;
    }

    /* renamed from: set__serialName */
    public final void m126741x8589bfe1(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.f69652xf819867f = str;
    }

    /* renamed from: set__trim */
    public final void m126742x3674fae4(boolean z17) {
        this.f69653xa78d9002 = z17;
    }

    /* renamed from: set__useLruCache */
    public final void m126743xf78a7eb8(boolean z17) {
        this.f69654xd6f38bda = z17;
    }

    /* renamed from: set__xmlPrefixTag */
    public final void m126744x8061d213(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.f69655x8e1a6931 = str;
    }

    @Override // e14.n
    /* renamed from: toJson */
    public org.json.JSONObject mo126745xcc31ba03() {
        return m126746xcc31ba03(this.f69653xa78d9002);
    }

    /* renamed from: toXml */
    public java.lang.String m126749x696739c(boolean z17, java.lang.String xmlPrefixTag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xmlPrefixTag, "xmlPrefixTag");
        return m126750x696739c(z17, this.f69652xf819867f, xmlPrefixTag);
    }

    @Override // e14.s
    /* renamed from: writeAttr */
    public void mo126751xac249e70(java.lang.String key, java.lang.String value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        java.lang.Integer num = this.f69649xf8977af1.get(key);
        if (num == null || num.intValue() < 0 || num.intValue() >= m75946x5a04fbef().length || !m75946x5a04fbef()[num.intValue()].f273691a.f273700h) {
            this.f38880x64ce93d8 = true;
            return;
        }
        int intValue = num.intValue();
        com.p314xaae8f345.mm.p2495xc50a8b8b.j jVar = m75946x5a04fbef()[intValue];
        i(intValue, jVar, d(value, jVar.f273691a.f273696d));
    }

    @Override // e14.s
    /* renamed from: writeText */
    public void mo126752xac2d09ac(java.lang.String text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        this.f38880x64ce93d8 = true;
        zn4.f.f556033b.mo146xb9724478(new e14.j(text));
    }

    @Override // e14.n
    /* renamed from: fromXml */
    public void mo126730xdc93280d(java.lang.String xml, java.lang.String xmlPrefixTag, boolean z17, boolean z18) {
        java.lang.String str;
        boolean containsKey;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xml, "xml");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xmlPrefixTag, "xmlPrefixTag");
        m75952xafc665f(new boolean[m75947x4305fe53().length]);
        if (zn4.f.f556035d && !z18) {
            e(xml, xmlPrefixTag);
            return;
        }
        try {
            this.f69648xa789af54 = z17;
            java.lang.String m126755xe50db2d8 = m126755xe50db2d8(this.f69652xf819867f, xmlPrefixTag);
            java.lang.String str2 = xml + "_" + m126755xe50db2d8;
            if (this.f69654xd6f38bda) {
                zn4.i iVar = zn4.i.f556038a;
                e14.o b17 = iVar.b();
                synchronized (b17) {
                    containsKey = b17.f327965a.containsKey(str2);
                }
                if (containsKey) {
                    e14.k kVar = (e14.k) iVar.b().a(str2);
                    if (kVar != null) {
                        m126722xdaaf72a7(kVar);
                        return;
                    }
                    iVar.b().c(str2);
                }
            }
            int L = r26.n0.L(xml, "<" + m126755xe50db2d8, 0, false, 6, null);
            if (L < 0) {
                return;
            }
            if (L > 0) {
                str = xml.substring(L);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "substring(...)");
            } else {
                str = xml;
            }
            e14.p pVar = new e14.p(str, new ho4.b(xmlPrefixTag, this.f69652xf819867f, this));
            this.f69651xf2aadfff = pVar;
            if (this.f69648xa789af54) {
                return;
            }
            pVar.b();
            if (this.f69654xd6f38bda) {
                zn4.i.f556038a.b().b(str2, m126723x256eca81());
            }
        } catch (java.lang.Exception e17) {
            zn4.f.f556032a.a(new e14.i(e17));
            e(xml, xmlPrefixTag);
        }
    }

    /* renamed from: fromXmlMap */
    public void m126733x88c2ee0f(java.util.Map<java.lang.String, java.lang.String> xmlValueMap, java.lang.String xmlPrefixTag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xmlValueMap, "xmlValueMap");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xmlPrefixTag, "xmlPrefixTag");
        f(xmlValueMap, this.f69652xf819867f, xmlPrefixTag);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.e, com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public org.json.JSONObject mo12245xcc313de3() {
        return super.mo12245xcc313de3();
    }

    /* renamed from: toJson */
    public org.json.JSONObject m126746xcc31ba03(boolean z17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.p314xaae8f345.mm.p2495xc50a8b8b.j[] m75946x5a04fbef = m75946x5a04fbef();
        int length = m75946x5a04fbef.length;
        int i17 = 0;
        int i18 = 0;
        while (i17 < length) {
            java.lang.String name = m75946x5a04fbef[i17].f273691a.f273694b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
            m126764x1d8ed9f1(jSONObject, name, mo75944x4aabfc28(i18), z17);
            i17++;
            i18++;
        }
        return jSONObject;
    }

    /* renamed from: toXml */
    public final java.lang.String m126750x696739c(boolean z17, java.lang.String tagName, java.lang.String xmlPrefixTag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagName, "tagName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xmlPrefixTag, "xmlPrefixTag");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("<".concat(tagName));
        com.p314xaae8f345.mm.p2495xc50a8b8b.j[] m75946x5a04fbef = m75946x5a04fbef();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m75946x5a04fbef, "<this>");
        kz5.y yVar = new kz5.y(m75946x5a04fbef);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        kz5.w0 w0Var = new kz5.w0((java.util.Iterator) yVar.mo152xb9724478());
        while (w0Var.hasNext()) {
            java.lang.Object next = w0Var.next();
            if (((com.p314xaae8f345.mm.p2495xc50a8b8b.j) ((kz5.u0) next).f395549b).f273691a.f273700h) {
                arrayList.add(next);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            kz5.u0 u0Var = (kz5.u0) it.next();
            int i17 = u0Var.f395548a;
            com.p314xaae8f345.mm.p2495xc50a8b8b.j jVar = (com.p314xaae8f345.mm.p2495xc50a8b8b.j) u0Var.f395549b;
            java.lang.Object mo75944x4aabfc28 = mo75944x4aabfc28(i17);
            if (mo75944x4aabfc28 != null) {
                java.lang.String name = jVar.f273691a.f273694b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
                m126766x1c2a4609(sb6, name, mo75944x4aabfc28, z17);
            }
        }
        sb6.append(">");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        kz5.w0 w0Var2 = new kz5.w0((java.util.Iterator) yVar.mo152xb9724478());
        while (w0Var2.hasNext()) {
            java.lang.Object next2 = w0Var2.next();
            if (!((com.p314xaae8f345.mm.p2495xc50a8b8b.j) ((kz5.u0) next2).f395549b).f273691a.f273700h) {
                arrayList2.add(next2);
            }
        }
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            kz5.u0 u0Var2 = (kz5.u0) it6.next();
            int i18 = u0Var2.f395548a;
            com.p314xaae8f345.mm.p2495xc50a8b8b.j jVar2 = (com.p314xaae8f345.mm.p2495xc50a8b8b.j) u0Var2.f395549b;
            java.lang.Object mo75944x4aabfc282 = mo75944x4aabfc28(i18);
            if (mo75944x4aabfc282 != null) {
                java.lang.String name2 = jVar2.f273691a.f273694b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name2, "name");
                java.lang.String itemTagName = jVar2.f273691a.f273701i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemTagName, "itemTagName");
                m126768xfc57eb5e(sb6, name2, itemTagName, mo75944x4aabfc282, z17);
            }
        }
        sb6.append("</" + tagName + ">");
        m126769xab29db1f(sb6, xmlPrefixTag);
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }

    /* renamed from: fromXml */
    public void m126731xdc93280d(java.lang.String xml, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xml, "xml");
        e14.m.a(this, xml, this.f69655x8e1a6931, z17, false, 8, null);
    }

    /* renamed from: fromXml */
    public void m126728xdc93280d(java.lang.String xml) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xml, "xml");
        e14.m.a(this, xml, this.f69655x8e1a6931, false, false, 8, null);
    }

    /* renamed from: toXml */
    public java.lang.String m126747x696739c() {
        return m126750x696739c(this.f69653xa78d9002, this.f69652xf819867f, this.f69655x8e1a6931);
    }

    /* renamed from: toXml */
    public java.lang.String m126748x696739c(boolean z17) {
        return m126750x696739c(z17, this.f69652xf819867f, this.f69655x8e1a6931);
    }
}
