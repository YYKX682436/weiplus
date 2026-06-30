package es5;

/* loaded from: classes13.dex */
public final class c implements tr5.u {

    /* renamed from: a, reason: collision with root package name */
    public final int f337960a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f337961b = java.util.Collections.emptyList();

    /* renamed from: c, reason: collision with root package name */
    public java.util.List f337962c = java.util.Collections.emptyList();

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f337963d = java.util.Collections.emptyList();

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f337964e = java.util.Collections.emptyList();

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f337965f = java.util.Collections.emptyList();

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f337966g = java.util.Collections.emptyList();

    public c(int i17, es5.a aVar) {
        this.f337960a = i17;
    }

    public final java.util.List a(java.util.List list, java.lang.String str) {
        if (java.util.Collections.emptyList() == list) {
            list = new java.util.ArrayList();
        }
        list.add(str);
        return list;
    }

    public final java.lang.String[] b(java.lang.String str) {
        java.util.List list = java.util.Objects.equals(str, "ipv6") ? this.f337966g : this.f337965f;
        java.util.List<java.lang.String> list2 = java.util.Objects.equals(str, "ipv6") ? this.f337962c : this.f337961b;
        java.util.List<java.lang.String> list3 = java.util.Objects.equals(str, "ipv6") ? this.f337964e : this.f337963d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!list.isEmpty()) {
            arrayList.addAll(list);
        }
        if (!list3.isEmpty()) {
            arrayList.addAll(list3);
            if (!list2.isEmpty()) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.String str2 : list3) {
                    if (str2.contains(":")) {
                        java.lang.String str3 = str2.split(":")[0];
                        if (!arrayList2.contains(str3)) {
                            arrayList2.add(str3);
                        }
                    }
                }
                for (java.lang.String str4 : list2) {
                    if (str4.contains(":")) {
                        java.lang.String str5 = str4.split(":")[0];
                        if (!arrayList2.contains(str5)) {
                            or5.b.a("%s's %s result is from localDns", str5, str);
                            arrayList.add(str4);
                        }
                    }
                }
            }
        } else if (!list2.isEmpty()) {
            or5.b.a("%s result all from localDns", str);
            arrayList.addAll(list2);
        }
        return (java.lang.String[]) arrayList.toArray(tr5.c.f502988a);
    }

    public synchronized void c(tr5.r rVar, java.lang.String[] strArr) {
        if (rVar == null) {
            throw new java.lang.IllegalArgumentException("dns".concat(" can not be null"));
        }
        if (strArr == null) {
            throw new java.lang.IllegalArgumentException("ips".concat(" can not be null"));
        }
        if (sr5.a.c(strArr)) {
            return;
        }
        int i17 = 0;
        if ("Local".equals(rVar.mo11135x730bcac6().f503023a)) {
            or5.b.a("sorter put lookup from local: %s", java.util.Arrays.toString(strArr));
            int length = strArr.length;
            while (i17 < length) {
                java.lang.String str = strArr[i17];
                if (sr5.e.a(str)) {
                    this.f337961b = a(this.f337961b, str);
                } else if (sr5.e.b(str)) {
                    this.f337962c = a(this.f337962c, str);
                }
                i17++;
            }
        } else {
            or5.b.a("sorter put lookup from rest(%d): %s", java.lang.Integer.valueOf(rVar.mo11135x730bcac6().f503024b), java.util.Arrays.toString(strArr));
            int length2 = strArr.length;
            while (i17 < length2) {
                java.lang.String str2 = strArr[i17];
                if (sr5.e.a(str2)) {
                    this.f337963d = a(this.f337963d, str2);
                } else if (sr5.e.b(str2)) {
                    this.f337964e = a(this.f337964e, str2);
                }
                i17++;
            }
        }
    }

    public tr5.z d() {
        java.lang.String[] strArr = tr5.c.f502988a;
        int i17 = this.f337960a;
        java.lang.String[] b17 = (i17 & 1) != 0 ? b("ipv4") : strArr;
        if ((i17 & 2) != 0) {
            strArr = b("ipv6");
        }
        return new tr5.z(b17, strArr);
    }
}
