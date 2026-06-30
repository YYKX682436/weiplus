package com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/tencent/mm/plugin/clean/CleanService$SelectedItems", "Landroid/os/Parcelable;", "CREATOR", "yv1/o0", "yv1/p0", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.clean.CleanService$SelectedItems */
/* loaded from: classes12.dex */
public final class C13100x4dbf8b6d implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final yv1.o0 f35401x681a0c0c = new yv1.o0(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f177174d = new java.util.HashMap();

    public final int a() {
        java.util.Collection values = this.f177174d.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            i17 += ((yv1.p0) it.next()).f547667b.size();
        }
        return i17;
    }

    public final long b() {
        java.util.Collection values = this.f177174d.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        long j17 = 0;
        while (it.hasNext()) {
            j17 += ((yv1.p0) it.next()).f547666a;
        }
        return j17;
    }

    public final java.util.Set c(java.lang.String username) {
        java.util.HashSet hashSet;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        yv1.p0 p0Var = (yv1.p0) this.f177174d.get(username);
        return (p0Var == null || (hashSet = p0Var.f547667b) == null) ? kz5.r0.f395535d : hashSet;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.C13100x4dbf8b6d d(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.C13100x4dbf8b6d c13100x4dbf8b6d) {
        if (c13100x4dbf8b6d == null) {
            return this;
        }
        for (java.util.Map.Entry entry : c13100x4dbf8b6d.f177174d.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            yv1.p0 p0Var = (yv1.p0) entry.getValue();
            java.util.HashMap hashMap = this.f177174d;
            yv1.p0 p0Var2 = (yv1.p0) hashMap.get(str);
            if (p0Var2 == null) {
                hashMap.put(str, p0Var);
            } else {
                p0Var2.f547666a += p0Var.f547666a;
                p0Var2.f547667b.addAll(p0Var.f547667b);
            }
        }
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void e(java.lang.String username, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        java.util.HashMap hashMap = this.f177174d;
        yv1.p0 p0Var = (yv1.p0) hashMap.get(username);
        if (p0Var == null) {
            p0Var = new yv1.p0();
            hashMap.put(username, p0Var);
        }
        if (p0Var.f547667b.add(java.lang.Long.valueOf(j17))) {
            p0Var.f547666a += j18;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        java.util.HashMap hashMap = this.f177174d;
        dest.writeInt(hashMap.size());
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            yv1.p0 p0Var = (yv1.p0) entry.getValue();
            java.util.HashSet hashSet = p0Var.f547667b;
            if (!hashSet.isEmpty()) {
                dest.writeString(str);
                dest.writeLong(p0Var.f547666a);
                dest.writeInt(hashSet.size());
                java.util.Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    java.lang.Long l17 = (java.lang.Long) it.next();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
                    dest.writeLong(l17.longValue());
                }
            }
        }
    }
}
