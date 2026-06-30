package com.tencent.mm.modelavatar;

/* loaded from: classes11.dex */
public class y extends java.util.concurrent.ConcurrentHashMap {
    public y(com.tencent.mm.modelavatar.s sVar) {
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
        if (((java.lang.String) obj).equals("service_officialaccounts")) {
            if (((ox.g) ((tk.o) i95.n0.c(tk.o.class))).wi()) {
                ((java.util.concurrent.ConcurrentHashMap) com.tencent.mm.modelavatar.z.f70576c).put("service_officialaccounts", java.lang.Integer.valueOf(com.tencent.mm.R.raw.photo_accounts_icon));
            } else {
                ((java.util.concurrent.ConcurrentHashMap) com.tencent.mm.modelavatar.z.f70576c).put("service_officialaccounts", java.lang.Integer.valueOf(com.tencent.mm.R.raw.default_servicebrand_contact));
            }
        }
        return (java.lang.Integer) super.get(obj);
    }
}
