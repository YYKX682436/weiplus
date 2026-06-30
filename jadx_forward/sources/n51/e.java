package n51;

/* loaded from: classes8.dex */
public final class e {
    public e(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final boolean a(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj.getClass(), obj2.getClass())) {
            return false;
        }
        return ((obj instanceof java.util.List) && (obj2 instanceof java.util.List)) ? b((java.util.List) obj, (java.util.List) obj2) : ((obj instanceof com.p314xaae8f345.mm.p2495xc50a8b8b.f) && (obj2 instanceof com.p314xaae8f345.mm.p2495xc50a8b8b.f)) ? ((com.p314xaae8f345.mm.p2495xc50a8b8b.f) obj).mo516x5c5a33d4((com.p314xaae8f345.mm.p2495xc50a8b8b.f) obj2) : ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? java.util.Arrays.equals((byte[]) obj, (byte[]) obj2) : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, obj2);
    }

    public final boolean b(java.util.List thisField, java.util.List otherField) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thisField, "thisField");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(otherField, "otherField");
        if (thisField.size() != otherField.size()) {
            return false;
        }
        int size = thisField.size();
        for (int i17 = 0; i17 < size; i17++) {
            if (!a(thisField.get(i17), otherField.get(i17))) {
                return false;
            }
        }
        return true;
    }

    public final boolean c(java.lang.Object obj) {
        if ((obj instanceof java.lang.String) || (obj instanceof java.lang.Integer) || (obj instanceof java.lang.Long) || (obj instanceof java.lang.Boolean) || (obj instanceof java.lang.Float) || (obj instanceof java.lang.Double) || (obj instanceof java.lang.Short)) {
            return true;
        }
        return obj instanceof java.lang.Character;
    }

    public final void d(org.json.JSONObject obj, java.lang.String key, java.lang.Object obj2, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        if (obj2 == null) {
            obj.remove(key);
            return;
        }
        if (obj2 instanceof java.util.LinkedList) {
            obj.put(key, e((java.util.LinkedList) obj2, z17));
            return;
        }
        if (obj2 instanceof com.p314xaae8f345.mm.p2495xc50a8b8b.f) {
            obj.put(key, ((com.p314xaae8f345.mm.p2495xc50a8b8b.f) obj2).mo12245xcc313de3());
            return;
        }
        try {
            if (obj2 instanceof com.p314xaae8f345.mm.p2495xc50a8b8b.g) {
                if (z17) {
                    obj.put(key, n51.d.c(((com.p314xaae8f345.mm.p2495xc50a8b8b.g) obj2).f273689a, 0));
                } else {
                    obj.put(key, ((com.p314xaae8f345.mm.p2495xc50a8b8b.g) obj2).i());
                }
            } else if (!(obj2 instanceof byte[])) {
                if (c(obj2)) {
                    obj.put(key, obj2);
                }
            } else {
                obj.put(key, "ByteArray[" + ((byte[]) obj2).length + "]");
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public final org.json.JSONArray e(java.util.LinkedList linkedList, boolean z17) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (next instanceof java.util.LinkedList) {
                    jSONArray.put(e((java.util.LinkedList) next, z17));
                } else if (next instanceof com.p314xaae8f345.mm.p2495xc50a8b8b.f) {
                    jSONArray.put(((com.p314xaae8f345.mm.p2495xc50a8b8b.f) next).mo12245xcc313de3());
                } else if (!(next instanceof com.p314xaae8f345.mm.p2495xc50a8b8b.g)) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next);
                    if (c(next)) {
                        jSONArray.put(next);
                    }
                } else if (z17) {
                    try {
                        jSONArray.put(n51.d.c(((com.p314xaae8f345.mm.p2495xc50a8b8b.g) next).f273689a, 0));
                    } catch (java.lang.Exception unused) {
                    }
                } else {
                    jSONArray.put(((com.p314xaae8f345.mm.p2495xc50a8b8b.g) next).i());
                }
            }
        }
        return jSONArray;
    }
}
