package com.tencent.mm.plugin.appbrand.appcache;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/appcache/WxaRuntimeModulePluginListMap;", "Landroid/os/Parcelable;", "luggage-wxa-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class WxaRuntimeModulePluginListMap implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap> CREATOR = new com.tencent.mm.plugin.appbrand.appcache.jb();

    /* renamed from: d, reason: collision with root package name */
    public final android.util.ArrayMap f75406d;

    /* renamed from: e, reason: collision with root package name */
    public android.util.ArrayMap f75407e;

    public WxaRuntimeModulePluginListMap(android.os.Parcel p17) {
        kotlin.jvm.internal.o.g(p17, "p");
        int readInt = p17.readInt();
        this.f75406d = new android.util.ArrayMap(readInt);
        this.f75407e = new android.util.ArrayMap();
        for (int i17 = 0; i17 < readInt; i17++) {
            java.lang.String readString = p17.readString();
            kotlin.jvm.internal.o.d(readString);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            int readInt2 = p17.readInt();
            for (int i18 = 0; i18 < readInt2; i18++) {
                com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo createFromParcel = com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo.CREATOR.createFromParcel(p17);
                android.util.ArrayMap arrayMap = this.f75407e;
                if (arrayMap != null) {
                    kotlin.jvm.internal.o.d(createFromParcel);
                    a(arrayMap, createFromParcel);
                    linkedList.add(createFromParcel);
                } else {
                    kotlin.jvm.internal.o.o("mSecondaryMap");
                    throw null;
                }
            }
            this.f75406d.put(new com.tencent.mm.plugin.appbrand.appcache.kb(readString), linkedList);
        }
    }

    public final void a(android.util.ArrayMap arrayMap, com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo wxaPluginPkgInfo) {
        java.lang.String provider = wxaPluginPkgInfo.provider;
        kotlin.jvm.internal.o.f(provider, "provider");
        com.tencent.mm.plugin.appbrand.appcache.lb lbVar = new com.tencent.mm.plugin.appbrand.appcache.lb(provider);
        java.util.LinkedList linkedList = (java.util.LinkedList) arrayMap.get(lbVar);
        if (linkedList == null) {
            linkedList = new java.util.LinkedList();
            arrayMap.put(lbVar, linkedList);
        }
        linkedList.add(wxaPluginPkgInfo);
    }

    public final java.util.List b(java.lang.String moduleName) {
        kotlin.jvm.internal.o.g(moduleName, "moduleName");
        return (java.util.List) this.f75406d.get(new com.tencent.mm.plugin.appbrand.appcache.kb(moduleName));
    }

    public final java.util.List c() {
        android.util.ArrayMap arrayMap = this.f75407e;
        if (arrayMap == null) {
            kotlin.jvm.internal.o.o("mSecondaryMap");
            throw null;
        }
        if (arrayMap.size() <= 0) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        android.util.ArrayMap arrayMap2 = this.f75407e;
        if (arrayMap2 == null) {
            kotlin.jvm.internal.o.o("mSecondaryMap");
            throw null;
        }
        java.util.Iterator it = arrayMap2.entrySet().iterator();
        while (it.hasNext()) {
            java.util.LinkedList linkedList2 = (java.util.LinkedList) ((java.util.Map.Entry) it.next()).getValue();
            kotlin.jvm.internal.o.d(linkedList2);
            com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo wxaPluginPkgInfo = (com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo) kz5.n0.Z(linkedList2);
            if (wxaPluginPkgInfo != null) {
                linkedList.add(wxaPluginPkgInfo);
            }
        }
        return linkedList;
    }

    public final void d(com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo updated) {
        kotlin.jvm.internal.o.g(updated, "updated");
        android.util.ArrayMap arrayMap = this.f75407e;
        if (arrayMap == null) {
            kotlin.jvm.internal.o.o("mSecondaryMap");
            throw null;
        }
        java.lang.String provider = updated.provider;
        kotlin.jvm.internal.o.f(provider, "provider");
        java.util.LinkedList<com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo> linkedList = (java.util.LinkedList) arrayMap.get(new com.tencent.mm.plugin.appbrand.appcache.lb(provider));
        if (linkedList != null) {
            for (com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo wxaPluginPkgInfo : linkedList) {
                if (updated.isAssignable(wxaPluginPkgInfo)) {
                    wxaPluginPkgInfo.pkgPath = updated.pkgPath;
                    wxaPluginPkgInfo.f75405md5 = updated.f75405md5;
                    wxaPluginPkgInfo.stringVersion = updated.stringVersion;
                    int i17 = updated.version;
                    if (i17 > 0) {
                        wxaPluginPkgInfo.version = i17;
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
        if (this.f75407e == null) {
            this.f75407e = new android.util.ArrayMap();
            java.util.Collection<java.util.List> values = this.f75406d.values();
            kotlin.jvm.internal.o.f(values, "<get-values>(...)");
            for (java.util.List<com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo> list : values) {
                kotlin.jvm.internal.o.d(list);
                for (com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo wxaPluginPkgInfo : list) {
                    android.util.ArrayMap arrayMap = this.f75407e;
                    if (arrayMap == null) {
                        kotlin.jvm.internal.o.o("mSecondaryMap");
                        throw null;
                    }
                    a(arrayMap, wxaPluginPkgInfo);
                }
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        android.util.ArrayMap arrayMap = this.f75406d;
        dest.writeInt(arrayMap.size());
        for (java.util.Map.Entry entry : arrayMap.entrySet()) {
            com.tencent.mm.plugin.appbrand.appcache.kb kbVar = (com.tencent.mm.plugin.appbrand.appcache.kb) entry.getKey();
            java.util.List list = (java.util.List) entry.getValue();
            dest.writeString(kbVar.f75638a);
            kotlin.jvm.internal.o.d(list);
            dest.writeInt(list.size());
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo) it.next()).writeToParcel(dest, 0);
            }
        }
    }

    public WxaRuntimeModulePluginListMap() {
        this.f75406d = new android.util.ArrayMap();
    }
}
