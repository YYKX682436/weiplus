package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes8.dex */
public class p4 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.SharedPreferencesC20998x2b0514dd f274451a;

    public p4(com.p314xaae8f345.mm.sdk.p2603x2137b148.SharedPreferencesC20998x2b0514dd sharedPreferencesC20998x2b0514dd) {
        this.f274451a = sharedPreferencesC20998x2b0514dd;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.util.List list;
        java.lang.String stringExtra = intent.getStringExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
        java.util.List list2 = (java.util.List) intent.getSerializableExtra("value");
        if (!this.f274451a.f273950e.equals(stringExtra) || list2 == null) {
            return;
        }
        synchronized (this.f274451a) {
            list = this.f274451a.f273953h;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        for (int size = list2.size() - 1; size >= 0; size--) {
            java.lang.String str = (java.lang.String) list2.get(size);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (android.content.SharedPreferences.OnSharedPreferenceChangeListener) ((java.lang.ref.SoftReference) it.next()).get();
                if (onSharedPreferenceChangeListener != null) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.f274451a, str);
                }
            }
        }
    }
}
