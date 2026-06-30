package com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f;

/* renamed from: com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate */
/* loaded from: classes7.dex */
public class C3933x11320b41 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3933x11320b41> f15702x681a0c0c = new com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.a();

    /* renamed from: d, reason: collision with root package name */
    public final p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c f129124d;

    public C3933x11320b41(final android.app.Activity activity) {
        this.f129124d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.x0.a(new p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c(this, new android.os.Handler(android.os.Looper.getMainLooper())) { // from class: com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate.1
            @Override // p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c
            public void a(int i17, android.os.Bundle bundle) {
                if (4660 != i17 || bundle == null) {
                    return;
                }
                bundle.setClassLoader(com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3933x11320b41.class.getClassLoader());
                android.content.Intent intent = (android.content.Intent) bundle.getParcelable("intent");
                if (intent != null) {
                    intent.setExtrasClassLoader(com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3933x11320b41.class.getClassLoader());
                    android.app.Activity activity2 = activity;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActivityStarterIpcDelegate", "onReceiveResult(MSG_START_ACTIVITY) activity:%s --START", activity2);
                    if (intent.getExtras() != null) {
                        for (java.lang.String str : intent.getExtras().keySet()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActivityStarterIpcDelegate", ">>> key(%s) -> value(%s)", str, intent.getExtras().get(str));
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
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActivityStarterIpcDelegate", "onReceiveResult(MSG_START_ACTIVITY) activity:%s --END", activity2);
                }
            }
        }, activity);
    }

    public static com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3933x11320b41 a(android.content.Context context) {
        if (context instanceof android.app.Activity) {
            return new com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3933x11320b41((android.app.Activity) context);
        }
        return null;
    }

    public void b(android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle(1);
        bundle.putParcelable("intent", intent);
        this.f129124d.b(4660, bundle);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        this.f129124d.writeToParcel(parcel, i17);
    }

    public C3933x11320b41(android.os.Parcel parcel, com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3933x11320b41.AnonymousClass1 anonymousClass1) {
        this.f129124d = p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c.f74x681a0c0c.createFromParcel(parcel);
    }
}
