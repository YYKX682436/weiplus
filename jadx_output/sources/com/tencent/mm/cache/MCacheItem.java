package com.tencent.mm.cache;

/* loaded from: classes12.dex */
public class MCacheItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.cache.MCacheItem> CREATOR = new um.q();

    /* renamed from: d, reason: collision with root package name */
    public l75.f0 f63634d;

    public MCacheItem(android.os.Parcel parcel) {
        l75.f0 f0Var = null;
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(parcel.readString());
            try {
                this.f63634d = (l75.f0) cls.newInstance();
            } catch (java.lang.Exception unused) {
            }
            for (java.lang.reflect.Field field : l75.f0.getValidFields(cls)) {
                java.lang.reflect.Method method = (java.lang.reflect.Method) ((java.util.HashMap) um.r.f428692b).get(field.getType());
                if (method != null) {
                    try {
                        method.invoke(null, parcel, field, this.f63634d);
                    } catch (java.lang.Exception e17) {
                        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        com.tencent.mars.xlog.Log.e("MicroMsg.MCacheItem", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                    }
                }
            }
            f0Var = this.f63634d;
        } catch (java.lang.Exception e18) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.MCacheItem", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e18));
        }
        this.f63634d = f0Var;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f63634d.getClass().getName());
        for (java.lang.reflect.Field field : l75.f0.getValidFields(this.f63634d.getClass())) {
            java.lang.reflect.Method method = (java.lang.reflect.Method) ((java.util.HashMap) um.r.f428691a).get(field.getType());
            if (method != null) {
                try {
                    method.invoke(null, parcel, field, this.f63634d);
                } catch (java.lang.Exception e17) {
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.MCacheItem", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                }
            }
        }
    }

    public MCacheItem(l75.f0 f0Var) {
        this.f63634d = f0Var;
    }
}
