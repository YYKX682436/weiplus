package e14;

/* loaded from: classes12.dex */
public class l extends e14.a {
    /* renamed from: checkValueSkip */
    public boolean mo126753x40072e68(java.lang.String fieldSerializeName, java.lang.Object obj, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fieldSerializeName, "fieldSerializeName");
        if (z17) {
            if (obj == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, 0) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, 0L) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, java.lang.Float.valueOf(0.0f)) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, java.lang.Double.valueOf(0.0d)) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, "") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r26.n0.u0(obj.toString()).toString(), "") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r26.n0.u0(obj.toString()).toString(), "null")) {
                return true;
            }
        } else if (obj == null) {
            return true;
        }
        return false;
    }

    /* renamed from: getXmlParserPrefixTag */
    public java.lang.String m126754xbfd70328(java.lang.String tagName, java.lang.String xmlPrefixTag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagName, "tagName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xmlPrefixTag, "xmlPrefixTag");
        if (r26.n0.N(xmlPrefixTag)) {
            return tagName;
        }
        return xmlPrefixTag + "." + tagName;
    }

    /* renamed from: getXmlParserRootTag */
    public java.lang.String m126755xe50db2d8(java.lang.String tagName, java.lang.String xmlPrefixTag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagName, "tagName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xmlPrefixTag, "xmlPrefixTag");
        return r26.n0.N(xmlPrefixTag) ? tagName : (java.lang.String) kz5.n0.X(r26.n0.f0(xmlPrefixTag, new java.lang.String[]{"."}, false, 0, 6, null));
    }

    /* renamed from: isPrimaryClassType */
    public final boolean m126756xb4eca23a(java.lang.Class<?> clazz) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(clazz, java.lang.Integer.TYPE) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(clazz, java.lang.Short.TYPE) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(clazz, java.lang.Long.TYPE) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(clazz, java.lang.Double.TYPE) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(clazz, java.lang.Float.TYPE) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(clazz, java.lang.Boolean.TYPE)) {
            return true;
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(clazz, java.lang.String.class);
    }

    /* renamed from: isPrimaryValueType */
    public boolean m126757x87dce5b3(java.lang.Object obj) {
        return (obj instanceof java.lang.String) || (obj instanceof java.lang.Integer) || (obj instanceof java.lang.Long) || (obj instanceof java.lang.Boolean) || (obj instanceof java.lang.Float) || (obj instanceof java.lang.Double) || (obj instanceof java.lang.Short) || (obj instanceof java.lang.Character);
    }

    /* renamed from: isXmlListNeedCountAttr */
    public boolean mo126758xc983189f(java.lang.String tagName, java.lang.String itemTagName, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagName, "tagName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemTagName, "itemTagName");
        return false;
    }

    /* renamed from: primaryPbFieldToClazz */
    public final java.lang.Class<?> m126759xe0817ff7(int i17) {
        if (i17 == 1) {
            return java.lang.String.class;
        }
        if (i17 == 2) {
            return java.lang.Integer.TYPE;
        }
        if (i17 == 3) {
            return java.lang.Long.TYPE;
        }
        if (i17 == 4) {
            return java.lang.Double.TYPE;
        }
        if (i17 == 5) {
            return java.lang.Float.TYPE;
        }
        if (i17 != 7) {
            return null;
        }
        return java.lang.Boolean.TYPE;
    }

    /* renamed from: processXmlEmptySerializeNode */
    public boolean m126760x9849b9fd(java.lang.String valueXml, java.lang.String tagName, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(valueXml, "valueXml");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagName, "tagName");
        if (z17) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueXml, "<" + tagName + "></" + tagName + ">")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: processXmlValue */
    public java.lang.String mo126761x57deeb29(java.lang.Object value, java.lang.String tagName, java.lang.String itemTagName, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagName, "tagName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemTagName, "itemTagName");
        if (!mo9591x1c1437af(value, tagName, itemTagName, z17)) {
            return value instanceof java.lang.String ? zn4.i.f556038a.a((java.lang.String) value) : value.toString();
        }
        if (value instanceof java.lang.Number) {
            return value.toString();
        }
        if (!(value instanceof java.lang.String) || !r26.n0.B((java.lang.CharSequence) value, "]]>", false)) {
            return "<![CDATA[" + value + "]]>";
        }
        return "<![CDATA[" + r26.i0.t((java.lang.String) value, "]]>", "]]]]><![CDATA[>", false) + "]]>";
    }

    /* renamed from: processXmlValueUseCData */
    public boolean mo9591x1c1437af(java.lang.Object value, java.lang.String tagName, java.lang.String itemTagName, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagName, "tagName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemTagName, "itemTagName");
        return false;
    }

    /* renamed from: putFieldValueFromJsonObject */
    public void m126762x6aaf7437(e14.k serializeObj, org.json.JSONObject jsonObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(serializeObj, "serializeObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonObj, "jsonObj");
        serializeObj.m75931xb5cb93b2(jsonObj);
    }

    /* renamed from: putJSONArrayFromList */
    public void m126763xf8035aa(org.json.JSONArray array, java.lang.String key, java.util.List<?> list, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(array, "array");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        for (java.lang.Object obj : list) {
            if (!mo126753x40072e68(key, obj, z17) && obj != null) {
                if (m126757x87dce5b3(obj)) {
                    array.put(obj);
                } else if (obj instanceof e14.k) {
                    array.put(((e14.k) obj).m126746xcc31ba03(z17));
                }
            }
        }
    }

    /* renamed from: putJSONObjectFromValue */
    public void m126764x1d8ed9f1(org.json.JSONObject obj, java.lang.String key, java.lang.Object obj2, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        if (mo126753x40072e68(key, obj2, z17) || obj2 == null) {
            return;
        }
        if (obj2 instanceof java.util.List) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            m126763xf8035aa(jSONArray, "", (java.util.List) obj2, z17);
            obj.put(key, jSONArray);
        } else if (m126757x87dce5b3(obj2)) {
            obj.put(key, obj2);
        } else if (obj2 instanceof e14.k) {
            obj.put(key, ((e14.k) obj2).m126746xcc31ba03(z17));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: putListValueFromJsonArray */
    public <T> void m126765x56f98703(java.util.List<T> list, java.lang.Class<T> itemClazz, org.json.JSONArray jsonArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemClazz, "itemClazz");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonArr, "jsonArr");
        int length = jsonArr.length();
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.Object opt = jsonArr.opt(i17);
            if (opt != null) {
                if (opt instanceof org.json.JSONObject) {
                    java.lang.reflect.Constructor<?>[] constructors = itemClazz.getConstructors();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(constructors, "getConstructors(...)");
                    java.lang.Object newInstance = ((java.lang.reflect.Constructor) kz5.z.L(constructors)).newInstance(new java.lang.Object[0]);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(newInstance, "null cannot be cast to non-null type com.tencent.mm.plugin.serialize.BaseSerializeClass");
                    e14.k kVar = (e14.k) newInstance;
                    kVar.m75931xb5cb93b2((org.json.JSONObject) opt);
                    list.add(kVar);
                } else if (m126757x87dce5b3(opt)) {
                    list.add(opt);
                }
            }
        }
    }

    /* renamed from: putXmlStrFromAttribute */
    public void m126766x1c2a4609(java.lang.StringBuilder xmlBuilder, java.lang.String key, java.lang.Object obj, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xmlBuilder, "xmlBuilder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        if (mo126753x40072e68(key, obj, z17) || !m126757x87dce5b3(obj)) {
            return;
        }
        if (!(obj instanceof java.lang.String)) {
            xmlBuilder.append(" " + key + "=\"" + obj + "\"");
            return;
        }
        xmlBuilder.append(" " + key + "=\"" + zn4.i.f556038a.a((java.lang.String) obj) + "\"");
    }

    /* renamed from: putXmlStrFromList */
    public void m126767x41ede511(java.lang.StringBuilder xmlBuilder, java.util.List<?> list, java.lang.String tagName, java.lang.String itemTagName, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xmlBuilder, "xmlBuilder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagName, "tagName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemTagName, "itemTagName");
        if (!list.isEmpty()) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(itemTagName, "SerializeFieldFlattenItemTagName")) {
                for (java.lang.Object obj : list) {
                    if (!mo126753x40072e68(tagName, obj, z17) && obj != null) {
                        if (obj instanceof e14.k) {
                            xmlBuilder.append(((e14.k) obj).m126750x696739c(z17, r26.n0.N(tagName) ? ((e14.k) obj).m126736x4f40c4d5() : tagName, ""));
                        } else if (m126757x87dce5b3(obj)) {
                            java.lang.String str = r26.n0.N(tagName) ? "item" : tagName;
                            xmlBuilder.append("<" + str + ">");
                            xmlBuilder.append(mo126761x57deeb29(obj, tagName, itemTagName, z17));
                            xmlBuilder.append("</" + str + ">");
                        }
                    }
                }
                return;
            }
            if (mo126758xc983189f(tagName, itemTagName, z17)) {
                xmlBuilder.append("<" + tagName + " count=\"" + list.size() + "\">");
            } else {
                xmlBuilder.append("<" + tagName + ">");
            }
            for (java.lang.Object obj2 : list) {
                if (!mo126753x40072e68(tagName, obj2, z17) && obj2 != null) {
                    if (obj2 instanceof e14.k) {
                        xmlBuilder.append(((e14.k) obj2).m126750x696739c(z17, r26.n0.N(itemTagName) ? ((e14.k) obj2).m126736x4f40c4d5() : itemTagName, ""));
                    } else if (m126757x87dce5b3(obj2)) {
                        java.lang.String str2 = r26.n0.N(itemTagName) ? "item" : itemTagName;
                        xmlBuilder.append("<" + str2 + ">");
                        xmlBuilder.append(mo126761x57deeb29(obj2, tagName, itemTagName, z17));
                        xmlBuilder.append("</" + str2 + ">");
                    }
                }
            }
            xmlBuilder.append("</" + tagName + ">");
        }
    }

    /* renamed from: putXmlStrFromValue */
    public void m126768xfc57eb5e(java.lang.StringBuilder xmlBuilder, java.lang.String tagName, java.lang.String itemTagName, java.lang.Object obj, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xmlBuilder, "xmlBuilder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagName, "tagName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemTagName, "itemTagName");
        if (mo126753x40072e68(tagName, obj, z17) || obj == null) {
            return;
        }
        if (m126757x87dce5b3(obj)) {
            xmlBuilder.append("<" + tagName + ">" + mo126761x57deeb29(obj, tagName, itemTagName, z17) + "</" + tagName + ">");
            return;
        }
        if (obj instanceof java.util.List) {
            m126767x41ede511(xmlBuilder, (java.util.List) obj, tagName, itemTagName, z17);
        } else if (obj instanceof e14.k) {
            java.lang.String m126750x696739c = ((e14.k) obj).m126750x696739c(z17, tagName, "");
            if (m126760x9849b9fd(m126750x696739c, tagName, z17)) {
                return;
            }
            xmlBuilder.append(m126750x696739c);
        }
    }

    /* renamed from: putXmlStrPrefixTag */
    public void m126769xab29db1f(java.lang.StringBuilder xmlBuilder, java.lang.String xmlPrefixTag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xmlBuilder, "xmlBuilder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xmlPrefixTag, "xmlPrefixTag");
        if (!r26.n0.N(xmlPrefixTag)) {
            java.util.List f07 = r26.n0.f0(xmlPrefixTag, new java.lang.String[]{"."}, false, 0, 6, null);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : f07) {
                if (!r26.n0.N((java.lang.String) obj)) {
                    arrayList.add(obj);
                }
            }
            java.lang.String g07 = kz5.n0.g0(arrayList, "><", "<", ">", 0, null, null, 56, null);
            java.lang.String g08 = kz5.n0.g0(kz5.i0.H(arrayList), "></", "</", ">", 0, null, null, 56, null);
            xmlBuilder.insert(0, g07);
            xmlBuilder.append(g08);
        }
    }

    /* renamed from: toSerializeBoolean */
    public java.lang.Boolean m126770x2911dc3(java.lang.String str, java.lang.Boolean bool) {
        if (str == null || r26.n0.N(str)) {
            return bool;
        }
        try {
            return java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(str));
        } catch (java.lang.NumberFormatException unused) {
            return bool;
        }
    }

    /* renamed from: toSerializeDouble */
    public java.lang.Double m126771x1c47aad6(java.lang.String str, java.lang.Double d17) {
        if (str == null || r26.n0.N(str)) {
            return d17;
        }
        try {
            return java.lang.Double.valueOf(java.lang.Double.parseDouble(str));
        } catch (java.lang.NumberFormatException unused) {
            return d17;
        }
    }

    /* renamed from: toSerializeFloat */
    public java.lang.Float m126772x9deb7eb7(java.lang.String str, java.lang.Float f17) {
        if (str == null || r26.n0.N(str)) {
            return f17;
        }
        try {
            return java.lang.Float.valueOf(java.lang.Float.parseFloat(str));
        } catch (java.lang.NumberFormatException unused) {
            return f17;
        }
    }

    /* renamed from: toSerializeInt */
    public java.lang.Integer m126773x6e4f0a(java.lang.String str, java.lang.Integer num) {
        if (str == null || r26.n0.N(str)) {
            return num;
        }
        try {
            return java.lang.Integer.valueOf(java.lang.Integer.parseInt(str));
        } catch (java.lang.NumberFormatException unused) {
            return num;
        }
    }

    /* renamed from: toSerializeLong */
    public java.lang.Long m126774xd5cf2c1(java.lang.String str, java.lang.Long l17) {
        if (str == null || r26.n0.N(str)) {
            return l17;
        }
        try {
            return java.lang.Long.valueOf(java.lang.Long.parseLong(str));
        } catch (java.lang.NumberFormatException unused) {
            return l17;
        }
    }

    /* renamed from: toSerializeShort */
    public java.lang.Short m126775x9ea0e0d7(java.lang.String str, java.lang.Short sh6) {
        if (str == null || r26.n0.N(str)) {
            return sh6;
        }
        try {
            return java.lang.Short.valueOf(java.lang.Short.parseShort(str));
        } catch (java.lang.NumberFormatException unused) {
            return sh6;
        }
    }

    /* renamed from: toSerializeString */
    public java.lang.String m126776x36258f16(java.lang.String str, java.lang.String str2) {
        return str == null || r26.n0.N(str) ? str2 : str;
    }
}
