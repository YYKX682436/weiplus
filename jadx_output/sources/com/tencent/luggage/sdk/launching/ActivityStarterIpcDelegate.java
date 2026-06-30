package com.tencent.luggage.sdk.launching;

/* loaded from: classes7.dex */
public class ActivityStarterIpcDelegate implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate> CREATOR = new com.tencent.luggage.sdk.launching.a();

    /* renamed from: d, reason: collision with root package name */
    public final android.support.v4.os.ResultReceiver f47591d;

    public ActivityStarterIpcDelegate(final android.app.Activity activity) {
        this.f47591d = com.tencent.mm.plugin.appbrand.ipc.x0.a(new android.support.v4.os.ResultReceiver(this, new android.os.Handler(android.os.Looper.getMainLooper())) { // from class: com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate.1
            @Override // android.support.v4.os.ResultReceiver
            public void a(int i17, android.os.Bundle bundle) {
                if (4660 != i17 || bundle == null) {
                    return;
                }
                bundle.setClassLoader(com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate.class.getClassLoader());
                android.content.Intent intent = (android.content.Intent) bundle.getParcelable("intent");
                if (intent != null) {
                    intent.setExtrasClassLoader(com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate.class.getClassLoader());
                    android.app.Activity activity2 = activity;
                    com.tencent.mars.xlog.Log.i("MicroMsg.ActivityStarterIpcDelegate", "onReceiveResult(MSG_START_ACTIVITY) activity:%s --START", activity2);
                    if (intent.getExtras() != null) {
                        for (java.lang.String str : intent.getExtras().keySet()) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.ActivityStarterIpcDelegate", ">>> key(%s) -> value(%s)", str, intent.getExtras().get(str));
                        }
                    }
                    intent.setFlags(intent.getFlags() & (-268435457));
                    android.app.Activity activity3 = activity;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(activity3, arrayList.toArray(), "com/tencent/luggage/sdk/launching/ActivityStarterIpcDelegate$1", "onReceiveResult", "(ILandroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activity3.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(activity3, "com/tencent/luggage/sdk/launching/ActivityStarterIpcDelegate$1", "onReceiveResult", "(ILandroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    com.tencent.mars.xlog.Log.i("MicroMsg.ActivityStarterIpcDelegate", "onReceiveResult(MSG_START_ACTIVITY) activity:%s --END", activity2);
                }
            }
        }, activity);
    }

    public static com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate a(android.content.Context context) {
        if (context instanceof android.app.Activity) {
            return new com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate((android.app.Activity) context);
        }
        return null;
    }

    public void b(android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle(1);
        bundle.putParcelable("intent", intent);
        this.f47591d.b(4660, bundle);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        this.f47591d.writeToParcel(parcel, i17);
    }

    public ActivityStarterIpcDelegate(android.os.Parcel parcel, com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate.AnonymousClass1 anonymousClass1) {
        this.f47591d = android.support.v4.os.ResultReceiver.CREATOR.createFromParcel(parcel);
    }
}
