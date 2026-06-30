package com.tencent.mm.plugin.clean;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/tencent/mm/plugin/clean/CleanService$SelectedItems", "Landroid/os/Parcelable;", "CREATOR", "yv1/o0", "yv1/p0", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class CleanService$SelectedItems implements android.os.Parcelable {
    public static final yv1.o0 CREATOR = new yv1.o0(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f95641d = new java.util.HashMap();

    public final int a() {
        java.util.Collection values = this.f95641d.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            i17 += ((yv1.p0) it.next()).f466134b.size();
        }
        return i17;
    }

    public final long b() {
        java.util.Collection values = this.f95641d.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        long j17 = 0;
        while (it.hasNext()) {
            j17 += ((yv1.p0) it.next()).f466133a;
        }
        return j17;
    }

    public final java.util.Set c(java.lang.String username) {
        java.util.HashSet hashSet;
        kotlin.jvm.internal.o.g(username, "username");
        yv1.p0 p0Var = (yv1.p0) this.f95641d.get(username);
        return (p0Var == null || (hashSet = p0Var.f466134b) == null) ? kz5.r0.f314002d : hashSet;
    }

    public final com.tencent.mm.plugin.clean.CleanService$SelectedItems d(com.tencent.mm.plugin.clean.CleanService$SelectedItems cleanService$SelectedItems) {
        if (cleanService$SelectedItems == null) {
            return this;
        }
        for (java.util.Map.Entry entry : cleanService$SelectedItems.f95641d.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            yv1.p0 p0Var = (yv1.p0) entry.getValue();
            java.util.HashMap hashMap = this.f95641d;
            yv1.p0 p0Var2 = (yv1.p0) hashMap.get(str);
            if (p0Var2 == null) {
                hashMap.put(str, p0Var);
            } else {
                p0Var2.f466133a += p0Var.f466133a;
                p0Var2.f466134b.addAll(p0Var.f466134b);
            }
        }
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void e(java.lang.String username, long j17, long j18) {
        kotlin.jvm.internal.o.g(username, "username");
        java.util.HashMap hashMap = this.f95641d;
        yv1.p0 p0Var = (yv1.p0) hashMap.get(username);
        if (p0Var == null) {
            p0Var = new yv1.p0();
            hashMap.put(username, p0Var);
        }
        if (p0Var.f466134b.add(java.lang.Long.valueOf(j17))) {
            p0Var.f466133a += j18;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        java.util.HashMap hashMap = this.f95641d;
        dest.writeInt(hashMap.size());
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            yv1.p0 p0Var = (yv1.p0) entry.getValue();
            java.util.HashSet hashSet = p0Var.f466134b;
            if (!hashSet.isEmpty()) {
                dest.writeString(str);
                dest.writeLong(p0Var.f466133a);
                dest.writeInt(hashSet.size());
                java.util.Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    java.lang.Long l17 = (java.lang.Long) it.next();
                    kotlin.jvm.internal.o.d(l17);
                    dest.writeLong(l17.longValue());
                }
            }
        }
    }
}
