package com.google.firebase.messaging;

/* loaded from: classes13.dex */
public final class RemoteMessage extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.firebase.messaging.RemoteMessage> CREATOR = new eb.e();

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Bundle f44664d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Map f44665e;

    public RemoteMessage(android.os.Bundle bundle) {
        this.f44664d = bundle;
    }

    public final java.util.Map D() {
        if (this.f44665e == null) {
            this.f44665e = new x.b();
            android.os.Bundle bundle = this.f44664d;
            for (java.lang.String str : bundle.keySet()) {
                java.lang.Object obj = bundle.get(str);
                if (obj instanceof java.lang.String) {
                    java.lang.String str2 = (java.lang.String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        this.f44665e.put(str, str2);
                    }
                }
            }
        }
        return this.f44665e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 2, this.f44664d, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
