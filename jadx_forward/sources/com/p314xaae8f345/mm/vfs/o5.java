package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public final class o5 {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Comparator f294642g = new com.p314xaae8f345.mm.vfs.n5();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f294643a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f294644b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f294645c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.SortedMap f294646d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f294647e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.vfs.t5 f294648f;

    public o5() {
        this.f294643a = new java.util.LinkedHashMap();
        this.f294644b = new java.util.LinkedHashMap();
        this.f294645c = new java.util.LinkedHashMap();
        this.f294646d = new java.util.TreeMap(f294642g);
        this.f294647e = new java.util.LinkedHashMap();
        this.f294648f = null;
    }

    public static com.p314xaae8f345.mm.vfs.o5 b(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.vfs.o5 o5Var = new com.p314xaae8f345.mm.vfs.o5();
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList("sl");
        android.os.Bundle bundle2 = bundle.getBundle("sm");
        if (parcelableArrayList != null && bundle2 != null) {
            for (java.lang.String str : bundle2.keySet()) {
                int i17 = bundle2.getInt(str);
                if (i17 >= 0 && i17 < parcelableArrayList.size()) {
                    o5Var.f294643a.put(str, new com.p314xaae8f345.mm.vfs.t5((com.p314xaae8f345.mm.vfs.InterfaceC22765xc7c0aceb) parcelableArrayList.get(i17)));
                }
            }
        }
        android.os.Bundle bundle3 = bundle.getBundle("fs");
        if (bundle3 != null) {
            bundle3.setClassLoader(bundle.getClassLoader());
            for (java.lang.String str2 : bundle3.keySet()) {
                o5Var.f294644b.put(str2, new com.p314xaae8f345.mm.vfs.t5((com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb) bundle3.getParcelable(str2)));
            }
        }
        android.os.Bundle bundle4 = bundle.getBundle("mfs");
        if (bundle4 != null) {
            bundle4.setClassLoader(bundle.getClassLoader());
            for (java.lang.String str3 : bundle4.keySet()) {
                o5Var.f294645c.put(str3, new com.p314xaae8f345.mm.vfs.t5((com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb) bundle4.getParcelable(str3)));
            }
        }
        android.os.Bundle bundle5 = bundle.getBundle("mp");
        if (bundle5 != null) {
            bundle5.setClassLoader(bundle.getClassLoader());
            for (java.lang.String str4 : bundle5.keySet()) {
                ((java.util.TreeMap) o5Var.f294646d).put(new com.p314xaae8f345.mm.vfs.f1(str4), bundle5.getString(str4));
            }
        }
        android.os.Bundle bundle6 = bundle.getBundle("env");
        java.util.Map map = o5Var.f294647e;
        if (bundle6 != null) {
            for (java.lang.String str5 : bundle6.keySet()) {
                java.lang.String[] stringArray = bundle6.getStringArray(str5);
                if (stringArray != null && stringArray.length != 0) {
                    if (stringArray.length == 1) {
                        map.put(str5, stringArray[0]);
                    } else {
                        map.put(str5, stringArray);
                    }
                }
            }
        }
        com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb interfaceC22750xe27c22eb = (com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb) bundle.getParcelable("root");
        o5Var.f294648f = interfaceC22750xe27c22eb == null ? null : new com.p314xaae8f345.mm.vfs.t5(interfaceC22750xe27c22eb);
        return o5Var;
    }

    public static void c(java.util.Map map, java.util.Map map2) {
        for (java.util.Map.Entry entry : map2.entrySet()) {
            if (entry.getValue() == null) {
                map.remove(entry.getKey());
            } else {
                map.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public static void e(android.util.Printer printer, java.util.Map map) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(256);
        for (java.util.Map.Entry entry : map.entrySet()) {
            sb6.setLength(0);
            sb6.append("  ");
            sb6.append(entry.getKey());
            sb6.append(" => ");
            java.lang.Object value = entry.getValue();
            if (value == null) {
                sb6.append("(deleted)\n");
            } else if (value.getClass().isArray()) {
                sb6.append(java.util.Arrays.toString((java.lang.Object[]) value));
            } else {
                sb6.append(entry.getValue());
            }
            printer.println(sb6.toString());
        }
    }

    public static void g(java.util.Map map) {
        for (java.util.Map.Entry entry : map.entrySet()) {
            entry.setValue(new com.p314xaae8f345.mm.vfs.t5((com.p314xaae8f345.mm.vfs.t5) entry.getValue()));
        }
    }

    public com.p314xaae8f345.mm.vfs.o5 a(com.p314xaae8f345.mm.vfs.o5 o5Var) {
        c(this.f294643a, o5Var.f294643a);
        c(this.f294644b, o5Var.f294644b);
        c(this.f294645c, o5Var.f294645c);
        c(this.f294646d, o5Var.f294646d);
        c(this.f294647e, o5Var.f294647e);
        com.p314xaae8f345.mm.vfs.t5 t5Var = o5Var.f294648f;
        if (t5Var != null) {
            this.f294648f = t5Var;
        }
        return this;
    }

    public void d(android.util.Printer printer) {
        java.util.Map map = this.f294643a;
        if (!map.isEmpty()) {
            printer.println("[Scheme]");
            e(printer, map);
        }
        java.util.Map map2 = this.f294644b;
        if (!map2.isEmpty()) {
            printer.println("[FileSystems]");
            e(printer, map2);
        }
        java.util.Map map3 = this.f294645c;
        if (!map3.isEmpty()) {
            printer.println("[Maintenance-only]");
            e(printer, map3);
        }
        java.util.SortedMap sortedMap = this.f294646d;
        if (!sortedMap.isEmpty()) {
            printer.println("[Mount points]");
            e(printer, sortedMap);
        }
        java.util.Map map4 = this.f294647e;
        if (!map4.isEmpty()) {
            printer.println("[Environment]");
            e(printer, map4);
        }
        if (this.f294648f != null) {
            printer.println("[Root] " + this.f294648f);
        }
    }

    /* renamed from: equals */
    public boolean m82449xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p314xaae8f345.mm.vfs.o5)) {
            return false;
        }
        com.p314xaae8f345.mm.vfs.o5 o5Var = (com.p314xaae8f345.mm.vfs.o5) obj;
        return this.f294643a.equals(o5Var.f294643a) && this.f294644b.equals(o5Var.f294644b) && this.f294645c.equals(o5Var.f294645c) && this.f294646d.equals(o5Var.f294646d) && this.f294647e.equals(o5Var.f294647e) && com.p314xaae8f345.mm.vfs.e8.f(this.f294648f, o5Var.f294648f);
    }

    public com.p314xaae8f345.mm.vfs.o5 f() {
        com.p314xaae8f345.mm.vfs.o5 o5Var = new com.p314xaae8f345.mm.vfs.o5(this);
        g(o5Var.f294643a);
        g(o5Var.f294644b);
        g(o5Var.f294645c);
        return o5Var;
    }

    public android.os.Bundle h() {
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Map map = this.f294643a;
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>(map.size());
        android.os.Bundle bundle2 = new android.os.Bundle();
        for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) map).entrySet()) {
            com.p314xaae8f345.mm.vfs.InterfaceC22765xc7c0aceb interfaceC22765xc7c0aceb = (com.p314xaae8f345.mm.vfs.InterfaceC22765xc7c0aceb) ((com.p314xaae8f345.mm.vfs.t5) entry.getValue()).f294720a;
            java.lang.Integer num = (java.lang.Integer) hashMap.get(interfaceC22765xc7c0aceb);
            if (num == null) {
                num = java.lang.Integer.valueOf(arrayList.size());
                arrayList.add(interfaceC22765xc7c0aceb);
                hashMap.put(interfaceC22765xc7c0aceb, num);
            }
            bundle2.putInt((java.lang.String) entry.getKey(), num.intValue());
        }
        bundle.putParcelableArrayList("sl", arrayList);
        bundle.putBundle("sm", bundle2);
        android.os.Bundle bundle3 = new android.os.Bundle();
        for (java.util.Map.Entry entry2 : ((java.util.LinkedHashMap) this.f294644b).entrySet()) {
            bundle3.putParcelable((java.lang.String) entry2.getKey(), (android.os.Parcelable) ((com.p314xaae8f345.mm.vfs.t5) entry2.getValue()).f294720a);
        }
        bundle.putBundle("fs", bundle3);
        android.os.Bundle bundle4 = new android.os.Bundle();
        for (java.util.Map.Entry entry3 : ((java.util.LinkedHashMap) this.f294645c).entrySet()) {
            bundle4.putParcelable((java.lang.String) entry3.getKey(), (android.os.Parcelable) ((com.p314xaae8f345.mm.vfs.t5) entry3.getValue()).f294720a);
        }
        bundle.putBundle("mfs", bundle4);
        android.os.Bundle bundle5 = new android.os.Bundle();
        for (java.util.Map.Entry entry4 : ((java.util.TreeMap) this.f294646d).entrySet()) {
            bundle5.putString(((com.p314xaae8f345.mm.vfs.f1) entry4.getKey()).f294454a, (java.lang.String) entry4.getValue());
        }
        bundle.putBundle("mp", bundle5);
        android.os.Bundle bundle6 = new android.os.Bundle();
        for (java.util.Map.Entry entry5 : ((java.util.LinkedHashMap) this.f294647e).entrySet()) {
            java.lang.Object value = entry5.getValue();
            if (value instanceof java.lang.String) {
                bundle6.putStringArray((java.lang.String) entry5.getKey(), new java.lang.String[]{(java.lang.String) value});
            } else if (value instanceof java.lang.String[]) {
                bundle6.putStringArray((java.lang.String) entry5.getKey(), (java.lang.String[]) value);
            }
        }
        bundle.putBundle("env", bundle6);
        com.p314xaae8f345.mm.vfs.t5 t5Var = this.f294648f;
        bundle.putParcelable("root", t5Var == null ? null : (android.os.Parcelable) t5Var.f294720a);
        return bundle;
    }

    /* renamed from: hashCode */
    public int m82450x8cdac1b() {
        java.lang.Object[] objArr = {this.f294643a, this.f294644b, this.f294645c, this.f294646d, this.f294647e, this.f294648f};
        java.util.regex.Pattern pattern = com.p314xaae8f345.mm.vfs.e8.f294450a;
        return java.util.Arrays.deepHashCode(objArr);
    }

    public o5(com.p314xaae8f345.mm.vfs.o5 o5Var) {
        this.f294643a = new java.util.LinkedHashMap(o5Var.f294643a);
        this.f294644b = new java.util.LinkedHashMap(o5Var.f294644b);
        this.f294645c = new java.util.LinkedHashMap(o5Var.f294645c);
        this.f294646d = new java.util.TreeMap(o5Var.f294646d);
        this.f294647e = new java.util.LinkedHashMap(o5Var.f294647e);
        this.f294648f = o5Var.f294648f;
    }
}
