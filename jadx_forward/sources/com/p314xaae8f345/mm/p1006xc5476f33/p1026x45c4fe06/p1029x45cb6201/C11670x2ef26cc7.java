package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/appcache/WxaRuntimeModulePluginListMap;", "Landroid/os/Parcelable;", "luggage-wxa-app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap */
/* loaded from: classes7.dex */
public final class C11670x2ef26cc7 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11670x2ef26cc7> f33476x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.jb();

    /* renamed from: d, reason: collision with root package name */
    public final android.util.ArrayMap f156939d;

    /* renamed from: e, reason: collision with root package name */
    public android.util.ArrayMap f156940e;

    public C11670x2ef26cc7(android.os.Parcel p17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p17, "p");
        int readInt = p17.readInt();
        this.f156939d = new android.util.ArrayMap(readInt);
        this.f156940e = new android.util.ArrayMap();
        for (int i17 = 0; i17 < readInt; i17++) {
            java.lang.String readString = p17.readString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(readString);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            int readInt2 = p17.readInt();
            for (int i18 = 0; i18 < readInt2; i18++) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11669x3195c847 createFromParcel = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11669x3195c847.f33467x681a0c0c.createFromParcel(p17);
                android.util.ArrayMap arrayMap = this.f156940e;
                if (arrayMap != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(createFromParcel);
                    a(arrayMap, createFromParcel);
                    linkedList.add(createFromParcel);
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSecondaryMap");
                    throw null;
                }
            }
            this.f156939d.put(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.kb(readString), linkedList);
        }
    }

    public final void a(android.util.ArrayMap arrayMap, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11669x3195c847 c11669x3195c847) {
        java.lang.String provider = c11669x3195c847.f33473xc52405f1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(provider, "provider");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.lb lbVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.lb(provider);
        java.util.LinkedList linkedList = (java.util.LinkedList) arrayMap.get(lbVar);
        if (linkedList == null) {
            linkedList = new java.util.LinkedList();
            arrayMap.put(lbVar, linkedList);
        }
        linkedList.add(c11669x3195c847);
    }

    public final java.util.List b(java.lang.String moduleName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moduleName, "moduleName");
        return (java.util.List) this.f156939d.get(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.kb(moduleName));
    }

    public final java.util.List c() {
        android.util.ArrayMap arrayMap = this.f156940e;
        if (arrayMap == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSecondaryMap");
            throw null;
        }
        if (arrayMap.size() <= 0) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        android.util.ArrayMap arrayMap2 = this.f156940e;
        if (arrayMap2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSecondaryMap");
            throw null;
        }
        java.util.Iterator it = arrayMap2.entrySet().iterator();
        while (it.hasNext()) {
            java.util.LinkedList linkedList2 = (java.util.LinkedList) ((java.util.Map.Entry) it.next()).getValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11669x3195c847 c11669x3195c847 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11669x3195c847) kz5.n0.Z(linkedList2);
            if (c11669x3195c847 != null) {
                linkedList.add(c11669x3195c847);
            }
        }
        return linkedList;
    }

    public final void d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11669x3195c847 updated) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(updated, "updated");
        android.util.ArrayMap arrayMap = this.f156940e;
        if (arrayMap == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSecondaryMap");
            throw null;
        }
        java.lang.String provider = updated.f33473xc52405f1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(provider, "provider");
        java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11669x3195c847> linkedList = (java.util.LinkedList) arrayMap.get(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.lb(provider));
        if (linkedList != null) {
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11669x3195c847 c11669x3195c847 : linkedList) {
                if (updated.m49232xbe910393(c11669x3195c847)) {
                    c11669x3195c847.f33471xe121c411 = updated.f33471xe121c411;
                    c11669x3195c847.f156938md5 = updated.f156938md5;
                    c11669x3195c847.f33474x1a804f87 = updated.f33474x1a804f87;
                    int i17 = updated.f33475x14f51cd8;
                    if (i17 > 0) {
                        c11669x3195c847.f33475x14f51cd8 = i17;
                    }
                }
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void e() {
        if (this.f156940e == null) {
            this.f156940e = new android.util.ArrayMap();
            java.util.Collection<java.util.List> values = this.f156939d.values();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
            for (java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11669x3195c847> list : values) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
                for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11669x3195c847 c11669x3195c847 : list) {
                    android.util.ArrayMap arrayMap = this.f156940e;
                    if (arrayMap == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSecondaryMap");
                        throw null;
                    }
                    a(arrayMap, c11669x3195c847);
                }
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        android.util.ArrayMap arrayMap = this.f156939d;
        dest.writeInt(arrayMap.size());
        for (java.util.Map.Entry entry : arrayMap.entrySet()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.kb kbVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.kb) entry.getKey();
            java.util.List list = (java.util.List) entry.getValue();
            dest.writeString(kbVar.f157171a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
            dest.writeInt(list.size());
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11669x3195c847) it.next()).writeToParcel(dest, 0);
            }
        }
    }

    public C11670x2ef26cc7() {
        this.f156939d = new android.util.ArrayMap();
    }
}
