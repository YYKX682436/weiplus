package gl;

/* loaded from: classes14.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f354307d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f354308e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gl.y f354309f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.media.AudioDeviceInfo f354310g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(gl.y yVar, android.media.AudioDeviceInfo audioDeviceInfo, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f354309f = yVar;
        this.f354310g = audioDeviceInfo;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        gl.u uVar = new gl.u(this.f354309f, this.f354310g, interfaceC29045xdcb5ca57);
        uVar.f354308e = obj;
        return uVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gl.u) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0062 A[Catch: CancellationException -> 0x01d8, TryCatch #0 {CancellationException -> 0x01d8, blocks: (B:6:0x001c, B:7:0x0056, B:8:0x005c, B:10:0x0062, B:13:0x0066, B:15:0x006d, B:16:0x0078, B:18:0x0084, B:19:0x008f, B:21:0x00a6, B:24:0x00b0, B:41:0x00d0, B:43:0x00dc, B:45:0x00e2, B:51:0x00ed, B:52:0x00ff, B:54:0x011f, B:55:0x012c, B:57:0x0130, B:60:0x0138, B:61:0x00f2, B:62:0x013f, B:64:0x014d, B:66:0x0153, B:72:0x015e, B:73:0x0170, B:75:0x0185, B:76:0x0163, B:77:0x0197, B:79:0x019b, B:80:0x01b1, B:82:0x01b5, B:83:0x01cf, B:90:0x002f, B:92:0x0035, B:94:0x0039, B:96:0x0043), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066 A[Catch: CancellationException -> 0x01d8, TryCatch #0 {CancellationException -> 0x01d8, blocks: (B:6:0x001c, B:7:0x0056, B:8:0x005c, B:10:0x0062, B:13:0x0066, B:15:0x006d, B:16:0x0078, B:18:0x0084, B:19:0x008f, B:21:0x00a6, B:24:0x00b0, B:41:0x00d0, B:43:0x00dc, B:45:0x00e2, B:51:0x00ed, B:52:0x00ff, B:54:0x011f, B:55:0x012c, B:57:0x0130, B:60:0x0138, B:61:0x00f2, B:62:0x013f, B:64:0x014d, B:66:0x0153, B:72:0x015e, B:73:0x0170, B:75:0x0185, B:76:0x0163, B:77:0x0197, B:79:0x019b, B:80:0x01b1, B:82:0x01b5, B:83:0x01cf, B:90:0x002f, B:92:0x0035, B:94:0x0039, B:96:0x0043), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011f A[Catch: CancellationException -> 0x01d8, TryCatch #0 {CancellationException -> 0x01d8, blocks: (B:6:0x001c, B:7:0x0056, B:8:0x005c, B:10:0x0062, B:13:0x0066, B:15:0x006d, B:16:0x0078, B:18:0x0084, B:19:0x008f, B:21:0x00a6, B:24:0x00b0, B:41:0x00d0, B:43:0x00dc, B:45:0x00e2, B:51:0x00ed, B:52:0x00ff, B:54:0x011f, B:55:0x012c, B:57:0x0130, B:60:0x0138, B:61:0x00f2, B:62:0x013f, B:64:0x014d, B:66:0x0153, B:72:0x015e, B:73:0x0170, B:75:0x0185, B:76:0x0163, B:77:0x0197, B:79:0x019b, B:80:0x01b1, B:82:0x01b5, B:83:0x01cf, B:90:0x002f, B:92:0x0035, B:94:0x0039, B:96:0x0043), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0130 A[Catch: CancellationException -> 0x01d8, TryCatch #0 {CancellationException -> 0x01d8, blocks: (B:6:0x001c, B:7:0x0056, B:8:0x005c, B:10:0x0062, B:13:0x0066, B:15:0x006d, B:16:0x0078, B:18:0x0084, B:19:0x008f, B:21:0x00a6, B:24:0x00b0, B:41:0x00d0, B:43:0x00dc, B:45:0x00e2, B:51:0x00ed, B:52:0x00ff, B:54:0x011f, B:55:0x012c, B:57:0x0130, B:60:0x0138, B:61:0x00f2, B:62:0x013f, B:64:0x014d, B:66:0x0153, B:72:0x015e, B:73:0x0170, B:75:0x0185, B:76:0x0163, B:77:0x0197, B:79:0x019b, B:80:0x01b1, B:82:0x01b5, B:83:0x01cf, B:90:0x002f, B:92:0x0035, B:94:0x0039, B:96:0x0043), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0185 A[Catch: CancellationException -> 0x01d8, TryCatch #0 {CancellationException -> 0x01d8, blocks: (B:6:0x001c, B:7:0x0056, B:8:0x005c, B:10:0x0062, B:13:0x0066, B:15:0x006d, B:16:0x0078, B:18:0x0084, B:19:0x008f, B:21:0x00a6, B:24:0x00b0, B:41:0x00d0, B:43:0x00dc, B:45:0x00e2, B:51:0x00ed, B:52:0x00ff, B:54:0x011f, B:55:0x012c, B:57:0x0130, B:60:0x0138, B:61:0x00f2, B:62:0x013f, B:64:0x014d, B:66:0x0153, B:72:0x015e, B:73:0x0170, B:75:0x0185, B:76:0x0163, B:77:0x0197, B:79:0x019b, B:80:0x01b1, B:82:0x01b5, B:83:0x01cf, B:90:0x002f, B:92:0x0035, B:94:0x0039, B:96:0x0043), top: B:2:0x0014 }] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gl.u.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
