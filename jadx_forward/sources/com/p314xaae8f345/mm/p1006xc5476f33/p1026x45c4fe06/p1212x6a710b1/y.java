package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f172153a = {"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT"};

    public static final p3325xe03a0797.p3326xc267989b.y0 a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lVar, "<this>");
        p012xc85e97e9.p093xedfae76a.y mo50358x95c7fa5f = lVar.mo50358x95c7fa5f();
        return (mo50358x95c7fa5f == null || (mo273xed6858b4 = mo50358x95c7fa5f.mo273xed6858b4()) == null) ? v65.m.f515113a : p012xc85e97e9.p093xedfae76a.w.a(mo273xed6858b4);
    }

    public static final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String permission, int i17, java.lang.String reasonTitle, java.lang.String reasonMsg, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.y3 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permission, "permission");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reasonTitle, "reasonTitle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reasonMsg, "reasonMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (nf.t.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, lVar, permission)) {
            callback.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.i4.f172012e);
            return;
        }
        if (kz5.z.G(f172153a, permission) && fp.h.a(31)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandEnvExt", "requestPermissionAsync, request " + permission + " is blocked");
            callback.a(nf.t.b(lVar.mo50352x76847179(), lVar, permission) ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.i4.f172012e : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.i4.f172011d);
            return;
        }
        android.content.Context mo50352x76847179 = lVar.mo50352x76847179();
        android.app.Activity activity = mo50352x76847179 instanceof android.app.Activity ? (android.app.Activity) mo50352x76847179 : null;
        if (activity == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandEnvExt", "requestPermissionAsync, activity is null");
            callback.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.i4.f172011d);
            return;
        }
        java.lang.String mo48798x74292566 = lVar.mo48798x74292566();
        if (mo48798x74292566 == null) {
            mo48798x74292566 = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v vVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v(i17, mo48798x74292566, permission, callback);
        si1.e1.a(mo48798x74292566, vVar);
        if (nf.t.a(activity, lVar, permission, i17, reasonTitle, reasonMsg)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandEnvExt", "requestPermissionAsync, not need");
            si1.e1.b(mo48798x74292566, vVar);
            callback.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.i4.f172012e);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandEnvExt", "requestPermissionAsync, do request, myRequestCode: " + i17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0064 -> B:11:0x00bf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0069 -> B:11:0x00bf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00a7 -> B:10:0x00b2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l r14, java.lang.String[] r15, int r16, java.lang.String r17, java.lang.String r18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r19) {
        /*
            Method dump skipped, instructions count: 194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.y.c(com.tencent.mm.plugin.appbrand.jsapi.l, java.lang.String[], int, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
