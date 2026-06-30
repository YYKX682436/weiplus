package py2;

/* loaded from: classes.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f440598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f440599e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f440600f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f440601g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.util.LinkedList linkedList, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(1);
        this.f440598d = linkedList;
        this.f440599e = f0Var;
        this.f440600f = i17;
        this.f440601g = h0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(41:1|2|3|(1:5)(1:78)|(36:7|8|9|10|(1:12)(1:73)|(30:14|15|16|17|(1:19)(1:68)|(24:21|22|23|24|(1:26)(1:63)|(18:28|29|30|31|(1:33)(1:58)|(1:35)|37|38|39|(1:41)(1:55)|(7:43|44|(1:46)|47|(1:49)|50|51)|54|44|(0)|47|(0)|50|51)|62|29|30|31|(0)(0)|(0)|37|38|39|(0)(0)|(0)|54|44|(0)|47|(0)|50|51)|67|22|23|24|(0)(0)|(0)|62|29|30|31|(0)(0)|(0)|37|38|39|(0)(0)|(0)|54|44|(0)|47|(0)|50|51)|72|15|16|17|(0)(0)|(0)|67|22|23|24|(0)(0)|(0)|62|29|30|31|(0)(0)|(0)|37|38|39|(0)(0)|(0)|54|44|(0)|47|(0)|50|51)|77|8|9|10|(0)(0)|(0)|72|15|16|17|(0)(0)|(0)|67|22|23|24|(0)(0)|(0)|62|29|30|31|(0)(0)|(0)|37|38|39|(0)(0)|(0)|54|44|(0)|47|(0)|50|51) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a6, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a7, code lost:
    
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeGetInt", "", r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x008c, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x008d, code lost:
    
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeGetString", "", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0071, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0072, code lost:
    
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeGetString", "", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0056, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0057, code lost:
    
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeGetString", "", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x003b, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x003c, code lost:
    
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeGetString", "", r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036 A[Catch: Exception -> 0x003b, TRY_LEAVE, TryCatch #2 {Exception -> 0x003b, blocks: (B:10:0x002b, B:14:0x0036), top: B:9:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051 A[Catch: Exception -> 0x0056, TRY_LEAVE, TryCatch #4 {Exception -> 0x0056, blocks: (B:17:0x0046, B:21:0x0051), top: B:16:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c A[Catch: Exception -> 0x0071, TRY_LEAVE, TryCatch #5 {Exception -> 0x0071, blocks: (B:24:0x0061, B:28:0x006c), top: B:23:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087 A[Catch: Exception -> 0x008c, TRY_LEAVE, TryCatch #1 {Exception -> 0x008c, blocks: (B:31:0x007c, B:35:0x0087), top: B:30:0x007c }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1 A[Catch: Exception -> 0x00a6, TRY_LEAVE, TryCatch #3 {Exception -> 0x00a6, blocks: (B:39:0x0096, B:43:0x00a1), top: B:38:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0033  */
    @Override // yz5.l
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo146xb9724478(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: py2.e.mo146xb9724478(java.lang.Object):java.lang.Object");
    }
}
