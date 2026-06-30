package rg1;

/* loaded from: classes7.dex */
public final class d implements km5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f476741a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ km5.b f476742b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f476743c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f476744d;

    public d(java.util.HashSet hashSet, km5.b bVar, java.lang.String str, java.lang.String str2) {
        this.f476741a = hashSet;
        this.f476742b = bVar;
        this.f476743c = str;
        this.f476744d = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043 A[Catch: Exception -> 0x013c, TryCatch #0 {Exception -> 0x013c, blocks: (B:3:0x0004, B:4:0x0013, B:6:0x0019, B:9:0x002a, B:11:0x0030, B:14:0x0037, B:19:0x0043, B:20:0x0062, B:33:0x007f, B:34:0x00ba, B:36:0x00c0, B:39:0x00dd, B:40:0x00e6, B:42:0x00f0, B:45:0x00f6, B:46:0x0108, B:48:0x0112, B:49:0x0121, B:51:0x012b, B:52:0x012d, B:57:0x00fb, B:59:0x0101, B:60:0x0106, B:61:0x00cf, B:63:0x0084, B:65:0x009d, B:69:0x0052, B:71:0x0056, B:78:0x0134), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0 A[Catch: Exception -> 0x013c, TryCatch #0 {Exception -> 0x013c, blocks: (B:3:0x0004, B:4:0x0013, B:6:0x0019, B:9:0x002a, B:11:0x0030, B:14:0x0037, B:19:0x0043, B:20:0x0062, B:33:0x007f, B:34:0x00ba, B:36:0x00c0, B:39:0x00dd, B:40:0x00e6, B:42:0x00f0, B:45:0x00f6, B:46:0x0108, B:48:0x0112, B:49:0x0121, B:51:0x012b, B:52:0x012d, B:57:0x00fb, B:59:0x0101, B:60:0x0106, B:61:0x00cf, B:63:0x0084, B:65:0x009d, B:69:0x0052, B:71:0x0056, B:78:0x0134), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0 A[Catch: Exception -> 0x013c, TryCatch #0 {Exception -> 0x013c, blocks: (B:3:0x0004, B:4:0x0013, B:6:0x0019, B:9:0x002a, B:11:0x0030, B:14:0x0037, B:19:0x0043, B:20:0x0062, B:33:0x007f, B:34:0x00ba, B:36:0x00c0, B:39:0x00dd, B:40:0x00e6, B:42:0x00f0, B:45:0x00f6, B:46:0x0108, B:48:0x0112, B:49:0x0121, B:51:0x012b, B:52:0x012d, B:57:0x00fb, B:59:0x0101, B:60:0x0106, B:61:0x00cf, B:63:0x0084, B:65:0x009d, B:69:0x0052, B:71:0x0056, B:78:0x0134), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0112 A[Catch: Exception -> 0x013c, TryCatch #0 {Exception -> 0x013c, blocks: (B:3:0x0004, B:4:0x0013, B:6:0x0019, B:9:0x002a, B:11:0x0030, B:14:0x0037, B:19:0x0043, B:20:0x0062, B:33:0x007f, B:34:0x00ba, B:36:0x00c0, B:39:0x00dd, B:40:0x00e6, B:42:0x00f0, B:45:0x00f6, B:46:0x0108, B:48:0x0112, B:49:0x0121, B:51:0x012b, B:52:0x012d, B:57:0x00fb, B:59:0x0101, B:60:0x0106, B:61:0x00cf, B:63:0x0084, B:65:0x009d, B:69:0x0052, B:71:0x0056, B:78:0x0134), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012b A[Catch: Exception -> 0x013c, TryCatch #0 {Exception -> 0x013c, blocks: (B:3:0x0004, B:4:0x0013, B:6:0x0019, B:9:0x002a, B:11:0x0030, B:14:0x0037, B:19:0x0043, B:20:0x0062, B:33:0x007f, B:34:0x00ba, B:36:0x00c0, B:39:0x00dd, B:40:0x00e6, B:42:0x00f0, B:45:0x00f6, B:46:0x0108, B:48:0x0112, B:49:0x0121, B:51:0x012b, B:52:0x012d, B:57:0x00fb, B:59:0x0101, B:60:0x0106, B:61:0x00cf, B:63:0x0084, B:65:0x009d, B:69:0x0052, B:71:0x0056, B:78:0x0134), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0052 A[Catch: Exception -> 0x013c, TryCatch #0 {Exception -> 0x013c, blocks: (B:3:0x0004, B:4:0x0013, B:6:0x0019, B:9:0x002a, B:11:0x0030, B:14:0x0037, B:19:0x0043, B:20:0x0062, B:33:0x007f, B:34:0x00ba, B:36:0x00c0, B:39:0x00dd, B:40:0x00e6, B:42:0x00f0, B:45:0x00f6, B:46:0x0108, B:48:0x0112, B:49:0x0121, B:51:0x012b, B:52:0x012d, B:57:0x00fb, B:59:0x0101, B:60:0x0106, B:61:0x00cf, B:63:0x0084, B:65:0x009d, B:69:0x0052, B:71:0x0056, B:78:0x0134), top: B:2:0x0004 }] */
    @Override // km5.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rg1.d.a(java.lang.Object):void");
    }
}
