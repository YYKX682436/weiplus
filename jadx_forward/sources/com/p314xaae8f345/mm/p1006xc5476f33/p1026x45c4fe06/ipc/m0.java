package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc;

/* loaded from: classes7.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f159954a = new java.util.HashMap();

    public static void a(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.C11895xe75b4e54 c11895xe75b4e54;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMToClientEventCenter", "notify unread:%d", java.lang.Integer.valueOf(i17));
        java.util.HashMap hashMap = f159954a;
        synchronized (hashMap) {
            c11895xe75b4e54 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.C11895xe75b4e54) hashMap.get(str);
        }
        if (c11895xe75b4e54 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMToClientEventCenter", "notify fail!!! The MMToClientEvent isn't exist!!!");
            return;
        }
        synchronized (c11895xe75b4e54) {
            c11895xe75b4e54.f159914f = 4;
            c11895xe75b4e54.f159919n = i17;
            c11895xe75b4e54.c();
        }
    }

    public static void b(java.lang.String str, android.os.Parcelable parcelable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.C11895xe75b4e54 c11895xe75b4e54;
        java.util.HashMap hashMap = f159954a;
        synchronized (hashMap) {
            c11895xe75b4e54 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.C11895xe75b4e54) hashMap.get(str);
        }
        if (c11895xe75b4e54 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMToClientEventCenter", "notify failed, appId[%s] data[%s]", str, parcelable);
            return;
        }
        if (c11895xe75b4e54 == null || parcelable == null) {
            return;
        }
        if (parcelable == null) {
            c11895xe75b4e54.getClass();
            return;
        }
        synchronized (c11895xe75b4e54) {
            c11895xe75b4e54.f159914f = 5;
            c11895xe75b4e54.f159920o = parcelable.getClass().getName();
            c11895xe75b4e54.f159921p = parcelable;
            c11895xe75b4e54.c();
        }
    }
}
