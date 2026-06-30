package zn1;

/* loaded from: classes11.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f556003d;

    /* renamed from: e, reason: collision with root package name */
    public int f556004e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f556005f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1257x6330853.ActivityC12842xb0ce2219 f556006g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(android.content.Intent intent, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1257x6330853.ActivityC12842xb0ce2219 activityC12842xb0ce2219, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f556005f = intent;
        this.f556006g = activityC12842xb0ce2219;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zn1.s(this.f556005f, this.f556006g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((zn1.s) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r12) {
        /*
            r11 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r11.f556004e
            android.content.Intent r2 = r11.f556005f
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            com.tencent.mm.plugin.backup.mmaoa.UsbAttachIntentUI r7 = r11.f556006g
            r8 = 0
            if (r1 == 0) goto L30
            if (r1 == r6) goto L28
            if (r1 == r5) goto L24
            if (r1 == r4) goto L24
            if (r1 != r3) goto L1c
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            goto Lc2
        L1c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L24:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            goto L98
        L28:
            java.lang.Object r1 = r11.f556003d
            com.tencent.mm.plugin.backup.mmaoa.UsbAttachIntentUI r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1257x6330853.ActivityC12842xb0ce2219) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            goto L5e
        L30:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            java.lang.String r12 = "accessory"
            android.os.Parcelable r12 = r2.getParcelableExtra(r12)
            android.hardware.usb.UsbAccessory r12 = (android.hardware.usb.UsbAccessory) r12
            if (r12 == 0) goto L98
            java.lang.String r1 = r7.f174083d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Find an usbAccessory="
            r9.<init>(r10)
            r9.append(r12)
            java.lang.String r9 = r9.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r9)
            zn1.p r1 = zn1.p.f555997a
            r11.f556003d = r7
            r11.f556004e = r6
            java.lang.Object r12 = r1.b(r12, r11)
            if (r12 != r0) goto L5d
            return r0
        L5d:
            r1 = r7
        L5e:
            zn1.f r12 = (zn1.f) r12
            zn1.e r6 = zn1.e.f555965a
            boolean r6 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r12, r6)
            if (r6 == 0) goto L7c
            kotlinx.coroutines.p0 r12 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r12 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            zn1.q r4 = new zn1.q
            r4.<init>(r1, r8)
            r11.f556003d = r8
            r11.f556004e = r5
            java.lang.Object r12 = p3325xe03a0797.p3326xc267989b.l.g(r12, r4, r11)
            if (r12 != r0) goto L98
            return r0
        L7c:
            zn1.d r5 = zn1.d.f555958a
            boolean r12 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r12, r5)
            if (r12 == 0) goto L98
            kotlinx.coroutines.p0 r12 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r12 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            zn1.r r5 = new zn1.r
            r5.<init>(r1, r8)
            r11.f556003d = r8
            r11.f556004e = r4
            java.lang.Object r12 = p3325xe03a0797.p3326xc267989b.l.g(r12, r5, r11)
            if (r12 != r0) goto L98
            return r0
        L98:
            java.lang.String r12 = "device"
            android.os.Parcelable r12 = r2.getParcelableExtra(r12)
            android.hardware.usb.UsbDevice r12 = (android.hardware.usb.UsbDevice) r12
            if (r12 == 0) goto Lc4
            java.lang.String r1 = r7.f174083d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Find an usbDevice="
            r2.<init>(r4)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2)
            zn1.i0 r1 = zn1.i0.f555980a
            r11.f556003d = r8
            r11.f556004e = r3
            java.lang.Object r12 = r1.d(r12, r11)
            if (r12 != r0) goto Lc2
            return r0
        Lc2:
            zn1.m r12 = (zn1.m) r12
        Lc4:
            java.lang.String r12 = r7.f174083d
            java.lang.String r0 = "Device not found"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r12, r0)
            jz5.f0 r12 = jz5.f0.f384359a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: zn1.s.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
