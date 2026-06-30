package ch2;

/* loaded from: classes10.dex */
public final class e2 extends qz5.l implements yz5.p {
    public final /* synthetic */ com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole A;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f41323d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f41324e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f41325f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f41326g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f41327h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f41328i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f41329m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f41330n;

    /* renamed from: o, reason: collision with root package name */
    public long f41331o;

    /* renamed from: p, reason: collision with root package name */
    public int f41332p;

    /* renamed from: q, reason: collision with root package name */
    public int f41333q;

    /* renamed from: r, reason: collision with root package name */
    public int f41334r;

    /* renamed from: s, reason: collision with root package name */
    public int f41335s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f41336t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r45.yx1 f41337u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f41338v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f41339w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f41340x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.f1 f41341y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ yz5.p f41342z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(r45.yx1 yx1Var, boolean z17, ch2.o2 o2Var, kotlin.jvm.internal.h0 h0Var, kotlinx.coroutines.f1 f1Var, yz5.p pVar, com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole tXChorusRole, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f41337u = yx1Var;
        this.f41338v = z17;
        this.f41339w = o2Var;
        this.f41340x = h0Var;
        this.f41341y = f1Var;
        this.f41342z = pVar;
        this.A = tXChorusRole;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ch2.e2 e2Var = new ch2.e2(this.f41337u, this.f41338v, this.f41339w, this.f41340x, this.f41341y, this.f41342z, this.A, continuation);
        e2Var.f41336t = obj;
        return e2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ch2.e2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02e7 A[Catch: all -> 0x0637, TryCatch #0 {all -> 0x0637, blocks: (B:15:0x004f, B:17:0x044d, B:19:0x0451, B:22:0x045c, B:24:0x0460, B:29:0x04c6, B:33:0x04d5, B:34:0x04dd, B:38:0x0505, B:46:0x051a, B:47:0x0522, B:48:0x051d, B:49:0x0520, B:51:0x058a, B:67:0x04d8, B:68:0x04db, B:72:0x048a, B:76:0x007c, B:78:0x03a0, B:80:0x03a8, B:82:0x03db, B:84:0x03df, B:85:0x03ec, B:87:0x03f4, B:90:0x03fb, B:93:0x0400, B:95:0x0402, B:96:0x0413, B:102:0x00b8, B:104:0x02c1, B:105:0x02e3, B:107:0x02e7, B:109:0x02ed, B:111:0x0341, B:112:0x0345, B:114:0x0351, B:116:0x0355, B:123:0x0539, B:129:0x0552, B:132:0x00f5, B:134:0x01be, B:137:0x01cb, B:139:0x0180, B:143:0x0207, B:145:0x0211, B:147:0x0238, B:148:0x023c, B:150:0x0252, B:152:0x0256, B:153:0x0261, B:155:0x026d, B:157:0x0273, B:162:0x027f, B:166:0x02cf, B:173:0x0572, B:176:0x012a), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ed A[Catch: all -> 0x0637, TryCatch #0 {all -> 0x0637, blocks: (B:15:0x004f, B:17:0x044d, B:19:0x0451, B:22:0x045c, B:24:0x0460, B:29:0x04c6, B:33:0x04d5, B:34:0x04dd, B:38:0x0505, B:46:0x051a, B:47:0x0522, B:48:0x051d, B:49:0x0520, B:51:0x058a, B:67:0x04d8, B:68:0x04db, B:72:0x048a, B:76:0x007c, B:78:0x03a0, B:80:0x03a8, B:82:0x03db, B:84:0x03df, B:85:0x03ec, B:87:0x03f4, B:90:0x03fb, B:93:0x0400, B:95:0x0402, B:96:0x0413, B:102:0x00b8, B:104:0x02c1, B:105:0x02e3, B:107:0x02e7, B:109:0x02ed, B:111:0x0341, B:112:0x0345, B:114:0x0351, B:116:0x0355, B:123:0x0539, B:129:0x0552, B:132:0x00f5, B:134:0x01be, B:137:0x01cb, B:139:0x0180, B:143:0x0207, B:145:0x0211, B:147:0x0238, B:148:0x023c, B:150:0x0252, B:152:0x0256, B:153:0x0261, B:155:0x026d, B:157:0x0273, B:162:0x027f, B:166:0x02cf, B:173:0x0572, B:176:0x012a), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0211 A[Catch: all -> 0x0637, TryCatch #0 {all -> 0x0637, blocks: (B:15:0x004f, B:17:0x044d, B:19:0x0451, B:22:0x045c, B:24:0x0460, B:29:0x04c6, B:33:0x04d5, B:34:0x04dd, B:38:0x0505, B:46:0x051a, B:47:0x0522, B:48:0x051d, B:49:0x0520, B:51:0x058a, B:67:0x04d8, B:68:0x04db, B:72:0x048a, B:76:0x007c, B:78:0x03a0, B:80:0x03a8, B:82:0x03db, B:84:0x03df, B:85:0x03ec, B:87:0x03f4, B:90:0x03fb, B:93:0x0400, B:95:0x0402, B:96:0x0413, B:102:0x00b8, B:104:0x02c1, B:105:0x02e3, B:107:0x02e7, B:109:0x02ed, B:111:0x0341, B:112:0x0345, B:114:0x0351, B:116:0x0355, B:123:0x0539, B:129:0x0552, B:132:0x00f5, B:134:0x01be, B:137:0x01cb, B:139:0x0180, B:143:0x0207, B:145:0x0211, B:147:0x0238, B:148:0x023c, B:150:0x0252, B:152:0x0256, B:153:0x0261, B:155:0x026d, B:157:0x0273, B:162:0x027f, B:166:0x02cf, B:173:0x0572, B:176:0x012a), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x027f A[Catch: all -> 0x0637, TryCatch #0 {all -> 0x0637, blocks: (B:15:0x004f, B:17:0x044d, B:19:0x0451, B:22:0x045c, B:24:0x0460, B:29:0x04c6, B:33:0x04d5, B:34:0x04dd, B:38:0x0505, B:46:0x051a, B:47:0x0522, B:48:0x051d, B:49:0x0520, B:51:0x058a, B:67:0x04d8, B:68:0x04db, B:72:0x048a, B:76:0x007c, B:78:0x03a0, B:80:0x03a8, B:82:0x03db, B:84:0x03df, B:85:0x03ec, B:87:0x03f4, B:90:0x03fb, B:93:0x0400, B:95:0x0402, B:96:0x0413, B:102:0x00b8, B:104:0x02c1, B:105:0x02e3, B:107:0x02e7, B:109:0x02ed, B:111:0x0341, B:112:0x0345, B:114:0x0351, B:116:0x0355, B:123:0x0539, B:129:0x0552, B:132:0x00f5, B:134:0x01be, B:137:0x01cb, B:139:0x0180, B:143:0x0207, B:145:0x0211, B:147:0x0238, B:148:0x023c, B:150:0x0252, B:152:0x0256, B:153:0x0261, B:155:0x026d, B:157:0x0273, B:162:0x027f, B:166:0x02cf, B:173:0x0572, B:176:0x012a), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02cf A[Catch: all -> 0x0637, TryCatch #0 {all -> 0x0637, blocks: (B:15:0x004f, B:17:0x044d, B:19:0x0451, B:22:0x045c, B:24:0x0460, B:29:0x04c6, B:33:0x04d5, B:34:0x04dd, B:38:0x0505, B:46:0x051a, B:47:0x0522, B:48:0x051d, B:49:0x0520, B:51:0x058a, B:67:0x04d8, B:68:0x04db, B:72:0x048a, B:76:0x007c, B:78:0x03a0, B:80:0x03a8, B:82:0x03db, B:84:0x03df, B:85:0x03ec, B:87:0x03f4, B:90:0x03fb, B:93:0x0400, B:95:0x0402, B:96:0x0413, B:102:0x00b8, B:104:0x02c1, B:105:0x02e3, B:107:0x02e7, B:109:0x02ed, B:111:0x0341, B:112:0x0345, B:114:0x0351, B:116:0x0355, B:123:0x0539, B:129:0x0552, B:132:0x00f5, B:134:0x01be, B:137:0x01cb, B:139:0x0180, B:143:0x0207, B:145:0x0211, B:147:0x0238, B:148:0x023c, B:150:0x0252, B:152:0x0256, B:153:0x0261, B:155:0x026d, B:157:0x0273, B:162:0x027f, B:166:0x02cf, B:173:0x0572, B:176:0x012a), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0451 A[Catch: all -> 0x0637, TryCatch #0 {all -> 0x0637, blocks: (B:15:0x004f, B:17:0x044d, B:19:0x0451, B:22:0x045c, B:24:0x0460, B:29:0x04c6, B:33:0x04d5, B:34:0x04dd, B:38:0x0505, B:46:0x051a, B:47:0x0522, B:48:0x051d, B:49:0x0520, B:51:0x058a, B:67:0x04d8, B:68:0x04db, B:72:0x048a, B:76:0x007c, B:78:0x03a0, B:80:0x03a8, B:82:0x03db, B:84:0x03df, B:85:0x03ec, B:87:0x03f4, B:90:0x03fb, B:93:0x0400, B:95:0x0402, B:96:0x0413, B:102:0x00b8, B:104:0x02c1, B:105:0x02e3, B:107:0x02e7, B:109:0x02ed, B:111:0x0341, B:112:0x0345, B:114:0x0351, B:116:0x0355, B:123:0x0539, B:129:0x0552, B:132:0x00f5, B:134:0x01be, B:137:0x01cb, B:139:0x0180, B:143:0x0207, B:145:0x0211, B:147:0x0238, B:148:0x023c, B:150:0x0252, B:152:0x0256, B:153:0x0261, B:155:0x026d, B:157:0x0273, B:162:0x027f, B:166:0x02cf, B:173:0x0572, B:176:0x012a), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0460 A[Catch: all -> 0x0637, TryCatch #0 {all -> 0x0637, blocks: (B:15:0x004f, B:17:0x044d, B:19:0x0451, B:22:0x045c, B:24:0x0460, B:29:0x04c6, B:33:0x04d5, B:34:0x04dd, B:38:0x0505, B:46:0x051a, B:47:0x0522, B:48:0x051d, B:49:0x0520, B:51:0x058a, B:67:0x04d8, B:68:0x04db, B:72:0x048a, B:76:0x007c, B:78:0x03a0, B:80:0x03a8, B:82:0x03db, B:84:0x03df, B:85:0x03ec, B:87:0x03f4, B:90:0x03fb, B:93:0x0400, B:95:0x0402, B:96:0x0413, B:102:0x00b8, B:104:0x02c1, B:105:0x02e3, B:107:0x02e7, B:109:0x02ed, B:111:0x0341, B:112:0x0345, B:114:0x0351, B:116:0x0355, B:123:0x0539, B:129:0x0552, B:132:0x00f5, B:134:0x01be, B:137:0x01cb, B:139:0x0180, B:143:0x0207, B:145:0x0211, B:147:0x0238, B:148:0x023c, B:150:0x0252, B:152:0x0256, B:153:0x0261, B:155:0x026d, B:157:0x0273, B:162:0x027f, B:166:0x02cf, B:173:0x0572, B:176:0x012a), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x04c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0503 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03a8 A[Catch: all -> 0x0637, TryCatch #0 {all -> 0x0637, blocks: (B:15:0x004f, B:17:0x044d, B:19:0x0451, B:22:0x045c, B:24:0x0460, B:29:0x04c6, B:33:0x04d5, B:34:0x04dd, B:38:0x0505, B:46:0x051a, B:47:0x0522, B:48:0x051d, B:49:0x0520, B:51:0x058a, B:67:0x04d8, B:68:0x04db, B:72:0x048a, B:76:0x007c, B:78:0x03a0, B:80:0x03a8, B:82:0x03db, B:84:0x03df, B:85:0x03ec, B:87:0x03f4, B:90:0x03fb, B:93:0x0400, B:95:0x0402, B:96:0x0413, B:102:0x00b8, B:104:0x02c1, B:105:0x02e3, B:107:0x02e7, B:109:0x02ed, B:111:0x0341, B:112:0x0345, B:114:0x0351, B:116:0x0355, B:123:0x0539, B:129:0x0552, B:132:0x00f5, B:134:0x01be, B:137:0x01cb, B:139:0x0180, B:143:0x0207, B:145:0x0211, B:147:0x0238, B:148:0x023c, B:150:0x0252, B:152:0x0256, B:153:0x0261, B:155:0x026d, B:157:0x0273, B:162:0x027f, B:166:0x02cf, B:173:0x0572, B:176:0x012a), top: B:2:0x0016 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:141:0x01a6 -> B:133:0x01be). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 1596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ch2.e2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
