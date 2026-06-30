package zn1;

/* loaded from: classes11.dex */
public final class w {
    public w(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.hardware.usb.UsbManager r8, android.hardware.usb.UsbDevice r9, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof zn1.u
            if (r0 == 0) goto L13
            r0 = r10
            zn1.u r0 = (zn1.u) r0
            int r1 = r0.f556011f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f556011f = r1
            goto L18
        L13:
            zn1.u r0 = new zn1.u
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f556009d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f556011f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L85
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r2 = "Request permission before process, device="
            r10.<init>(r2)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            java.lang.String r2 = "UsbBroadcastReceiver"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r10)
            java.util.UUID r10 = java.util.UUID.randomUUID()
            java.lang.String r10 = r10.toString()
            java.lang.String r2 = "toString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r10, r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r4 = "com.tencent.mmaoa.USB_DEVICE_PERMISSION"
            r2.<init>(r4)
            android.content.Context r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            java.lang.String r4 = r4.getPackageName()
            r2.setPackage(r4)
            java.lang.String r4 = "mmaoa.permission_req_uuid"
            r2.putExtra(r4, r10)
            android.content.Context r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            r5 = 0
            r6 = 167772160(0xa000000, float:6.162976E-33)
            android.app.PendingIntent r2 = android.app.PendingIntent.getBroadcast(r4, r5, r2, r6)
            r8.requestPermission(r9, r2)
            kotlinx.coroutines.flow.i2 r8 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1257x6330853.C12843xa53acccc.f174085b
            zn1.v r9 = new zn1.v
            r2 = 0
            r9.<init>(r10, r2)
            r0.f556011f = r3
            java.lang.Object r10 = p3325xe03a0797.p3326xc267989b.p3328x30012e.l.l(r8, r9, r0)
            if (r10 != r1) goto L85
            return r1
        L85:
            boolean r8 = r10 instanceof zn1.k0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zn1.w.a(android.hardware.usb.UsbManager, android.hardware.usb.UsbDevice, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
