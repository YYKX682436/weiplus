package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class wb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.ac f76035d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb(com.tencent.mm.plugin.appbrand.appcache.ac acVar) {
        super(0);
        this.f76035d = acVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.util.Map.Entry entry : this.f76035d.f75447f.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            if (((com.tencent.mm.plugin.appbrand.appcache.x3) entry.getValue()).f76045f != null) {
                linkedList.add(str);
            }
        }
        return linkedList;
    }
}
