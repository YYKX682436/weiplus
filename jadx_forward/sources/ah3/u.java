package ah3;

/* loaded from: classes5.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f86493d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f86494e;

    /* renamed from: f, reason: collision with root package name */
    public long f86495f;

    /* renamed from: g, reason: collision with root package name */
    public long f86496g;

    /* renamed from: h, reason: collision with root package name */
    public int f86497h;

    /* renamed from: i, reason: collision with root package name */
    public int f86498i;

    /* renamed from: m, reason: collision with root package name */
    public int f86499m;

    /* renamed from: n, reason: collision with root package name */
    public int f86500n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f86501o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ah3.v f86502p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ yz5.l f86503q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ yz5.l f86504r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ yz5.s f86505s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ah3.v vVar, yz5.l lVar, yz5.l lVar2, yz5.s sVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f86502p = vVar;
        this.f86503q = lVar;
        this.f86504r = lVar2;
        this.f86505s = sVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ah3.u uVar = new ah3.u(this.f86502p, this.f86503q, this.f86504r, this.f86505s, interfaceC29045xdcb5ca57);
        uVar.f86501o = obj;
        return uVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ah3.u) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(20:3|(2:5|(18:7|8|9|10|11|12|13|(1:15)(1:35)|16|(1:18)(1:34)|19|(1:21)(1:33)|22|(1:24)(1:32)|25|(1:27)(1:31)|28|29)(2:89|90))(4:91|92|93|94)|39|40|41|42|43|44|(1:46)(1:62)|47|(1:49)(1:61)|50|51|(1:53)(1:59)|54|(1:56)(1:58)|57|(0)(0)|28|29)(11:126|127|128|129|130|131|132|133|134|135|(1:137)(1:138))|95|96|97|98|99|100|101|102|103|104|105|(1:107)(15:108|11|12|13|(0)(0)|16|(0)(0)|19|(0)(0)|22|(0)(0)|25|(0)(0)|28|29)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0310, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0311, code lost:
    
        r7 = r44;
        r44 = r2;
        r26 = r6;
        r17 = r14;
        r15 = r21;
        r14 = r24;
        r12 = r25;
        r2 = " max:";
        r6 = r32;
        r24 = r8;
        r9 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0327, code lost:
    
        r8 = r30;
        r22 = r3;
        r3 = " curBatchCnt:";
        r38 = r19;
        r19 = r5;
        r5 = r31;
        r11 = r38;
        r10 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0357, code lost:
    
        r1 = r13;
        r23 = r26;
        r16 = r14;
        r38 = r15;
        r15 = r44;
        r44 = r7;
        r7 = r22;
        r22 = r22;
        r13 = r10;
        r21 = r38;
        r17 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0340, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0341, code lost:
    
        r26 = r6;
        r12 = ", contactSize:";
        r17 = r14;
        r15 = r21;
        r14 = r24;
        r6 = r32;
        r7 = r44;
        r44 = r2;
        r24 = r8;
        r9 = r16;
        r2 = " max:";
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x036d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x036e, code lost:
    
        r26 = r6;
        r17 = r14;
        r2 = " max:";
        r6 = r32;
        r12 = ", contactSize:";
        r24 = r8;
        r9 = r16;
        r8 = r30;
        r22 = r3;
        r3 = " curBatchCnt:";
        r38 = r19;
        r19 = r5;
        r5 = r31;
        r11 = r38;
        r10 = r20;
        r44 = r44;
        r1 = r13;
        r7 = r22;
        r22 = r22;
        r16 = r24;
        r13 = r10;
        r21 = " requestResult:";
        r15 = r23;
        r23 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x03ac, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x03ad, code lost:
    
        r22 = r3;
        r26 = r6;
        r24 = r8;
        r17 = r14;
        r9 = r16;
        r3 = " curBatchCnt:";
        r8 = r30;
        r6 = r32;
        r12 = ", contactSize:";
        r11 = r19;
        r19 = r5;
        r5 = r31;
        r10 = "MicroMsg.InitBatchGetContactHelperV3";
        r2 = " max:";
        r44 = r44;
        r21 = " requestResult:";
        r1 = r13;
        r7 = r22;
        r15 = r23;
        r23 = r26;
        r22 = "request Result:";
        r16 = "collectUsernameJob:";
        r13 = r33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x04a0 A[Catch: all -> 0x0594, TryCatch #7 {all -> 0x0594, blocks: (B:44:0x048f, B:46:0x04a0, B:47:0x04ae, B:49:0x04b6, B:50:0x04c0), top: B:43:0x048f }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x04b6 A[Catch: all -> 0x0594, TryCatch #7 {all -> 0x0594, blocks: (B:44:0x048f, B:46:0x04a0, B:47:0x04ae, B:49:0x04b6, B:50:0x04c0), top: B:43:0x048f }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x04ad  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v14 */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r17v17 */
    /* JADX WARN: Type inference failed for: r17v18 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v8 */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r44) {
        /*
            Method dump skipped, instructions count: 1655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ah3.u.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
