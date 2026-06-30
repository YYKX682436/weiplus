package wq5;

/* loaded from: classes13.dex */
public class a implements java.lang.Iterable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f530232d;

    public a() {
        this.f530232d = new java.util.ArrayList();
    }

    public final void d(java.util.Collection collection, boolean z17) {
        java.util.ArrayList arrayList = this.f530232d;
        arrayList.ensureCapacity(arrayList.size() + collection.size());
        if (z17) {
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                g(wq5.e.j(it.next()));
            }
        } else {
            java.util.Iterator it6 = collection.iterator();
            while (it6.hasNext()) {
                g(it6.next());
            }
        }
    }

    public java.lang.Object e(int i17) {
        if (i17 >= 0) {
            java.util.ArrayList arrayList = this.f530232d;
            if (i17 < arrayList.size()) {
                return arrayList.get(i17);
            }
        }
        return null;
    }

    public wq5.a g(java.lang.Object obj) {
        wq5.e.i(obj);
        this.f530232d.add(obj);
        return this;
    }

    public java.io.Writer h(java.io.Writer writer, int i17, int i18) {
        java.util.ArrayList arrayList = this.f530232d;
        try {
            int size = arrayList.size();
            writer.write(91);
            if (size == 1) {
                try {
                    wq5.e.l(writer, arrayList.get(0), i17, i18);
                    writer.write(93);
                    return writer;
                } catch (java.lang.Exception e17) {
                    throw new wq5.b("Unable to write JSONArray value at index: 0", e17);
                }
            }
            if (size != 0) {
                int i19 = i18 + i17;
                int i27 = 0;
                boolean z17 = false;
                while (i27 < size) {
                    if (z17) {
                        writer.write(44);
                    }
                    if (i17 > 0) {
                        writer.write(10);
                    }
                    java.util.regex.Pattern pattern = wq5.e.f530233b;
                    for (int i28 = 0; i28 < i19; i28++) {
                        writer.write(32);
                    }
                    try {
                        wq5.e.l(writer, arrayList.get(i27), i17, i19);
                        i27++;
                        z17 = true;
                    } catch (java.lang.Exception e18) {
                        throw new wq5.b("Unable to write JSONArray value at index: " + i27, e18);
                    }
                }
                if (i17 > 0) {
                    writer.write(10);
                }
                java.util.regex.Pattern pattern2 = wq5.e.f530233b;
                for (int i29 = 0; i29 < i18; i29++) {
                    writer.write(32);
                }
            }
            writer.write(93);
            return writer;
        } catch (java.io.IOException e19) {
            throw new wq5.b(e19);
        }
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return this.f530232d.iterator();
    }

    /* renamed from: toString */
    public java.lang.String m174323x9616526c() {
        java.lang.String obj;
        try {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            synchronized (stringWriter.getBuffer()) {
                h(stringWriter, 0, 0);
                obj = stringWriter.toString();
            }
            return obj;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public a(java.util.Collection collection) {
        if (collection == null) {
            this.f530232d = new java.util.ArrayList();
        } else {
            this.f530232d = new java.util.ArrayList(collection.size());
            d(collection, true);
        }
    }

    public a(java.lang.Object obj) {
        this();
        if (obj.getClass().isArray()) {
            boolean isArray = obj.getClass().isArray();
            java.util.ArrayList arrayList = this.f530232d;
            if (isArray) {
                int length = java.lang.reflect.Array.getLength(obj);
                arrayList.ensureCapacity(arrayList.size() + length);
                for (int i17 = 0; i17 < length; i17++) {
                    g(wq5.e.j(java.lang.reflect.Array.get(obj, i17)));
                }
                return;
            }
            if (obj instanceof wq5.a) {
                arrayList.addAll(((wq5.a) obj).f530232d);
                return;
            }
            if (obj instanceof java.util.Collection) {
                d((java.util.Collection) obj, true);
                return;
            } else {
                if (obj instanceof java.lang.Iterable) {
                    java.util.Iterator it = ((java.lang.Iterable) obj).iterator();
                    while (it.hasNext()) {
                        g(wq5.e.j(it.next()));
                    }
                    return;
                }
                throw new wq5.b("JSONArray initial value should be a string or collection or array.");
            }
        }
        throw new wq5.b("JSONArray initial value should be a string or collection or array.");
    }
}
