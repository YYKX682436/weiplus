package com.p314xaae8f345.mm.p647x5a0af82;

/* renamed from: com.tencent.mm.cache.MCacheItem */
/* loaded from: classes12.dex */
public class C10323xd08533e8 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p647x5a0af82.C10323xd08533e8> f27779x681a0c0c = new um.q();

    /* renamed from: d, reason: collision with root package name */
    public l75.f0 f145167d;

    public C10323xd08533e8(android.os.Parcel parcel) {
        l75.f0 f0Var = null;
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(parcel.readString());
            try {
                this.f145167d = (l75.f0) cls.newInstance();
            } catch (java.lang.Exception unused) {
            }
            for (java.lang.reflect.Field field : l75.f0.m145245x5aa8549f(cls)) {
                java.lang.reflect.Method method = (java.lang.reflect.Method) ((java.util.HashMap) um.r.f510225b).get(field.getType());
                if (method != null) {
                    try {
                        method.invoke(null, parcel, field, this.f145167d);
                    } catch (java.lang.Exception e17) {
                        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MCacheItem", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                    }
                }
            }
            f0Var = this.f145167d;
        } catch (java.lang.Exception e18) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MCacheItem", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e18));
        }
        this.f145167d = f0Var;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f145167d.getClass().getName());
        for (java.lang.reflect.Field field : l75.f0.m145245x5aa8549f(this.f145167d.getClass())) {
            java.lang.reflect.Method method = (java.lang.reflect.Method) ((java.util.HashMap) um.r.f510224a).get(field.getType());
            if (method != null) {
                try {
                    method.invoke(null, parcel, field, this.f145167d);
                } catch (java.lang.Exception e17) {
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MCacheItem", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                }
            }
        }
    }

    public C10323xd08533e8(l75.f0 f0Var) {
        this.f145167d = f0Var;
    }
}
