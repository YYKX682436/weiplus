package c01;

/* loaded from: classes12.dex */
public class n7 implements wu5.h, wu5.d {

    /* renamed from: d, reason: collision with root package name */
    public boolean f37343d = true;

    /* renamed from: e, reason: collision with root package name */
    public c01.q7 f37344e = null;

    /* renamed from: f, reason: collision with root package name */
    public int f37345f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.util.concurrent.Future f37346g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c01.r7 f37347h;

    public n7(c01.r7 r7Var) {
        this.f37347h = r7Var;
    }

    public final boolean a() {
        return this.f37345f == 0;
    }

    public final boolean b(int i17) {
        return this.f37347h.f37416b && this.f37345f < 15 && (i17 == 301 || i17 == 302);
    }

    @Override // wu5.d
    public void f(java.util.concurrent.Future future) {
        this.f37346g = future;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "GetPicService_getPic";
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:7|8|9|(3:11|12|(3:17|18|19))|63|64|(2:266|267)(34:66|67|68|69|(1:265)(3:73|(3:75|(2:77|78)(1:80)|79)|81)|(4:83|84|85|86)(1:264)|87|88|(1:92)|93|(1:97)|98|(1:100)|101|102|(2:104|(5:239|240|241|242|244)(3:106|107|108))(3:247|248|249)|109|110|(1:112)(1:233)|113|(18:115|(4:116|117|118|(3:120|121|122)(1:129))|130|131|132|133|(3:201|202|(18:204|205|206|207|208|209|210|211|136|137|138|139|(3:141|142|(8:144|145|146|147|148|(2:152|153)|156|157))|197|148|(3:150|152|153)|156|157))|135|136|137|138|139|(0)|197|148|(0)|156|157)(1:232)|158|(2:190|191)|160|(1:183)(1:168)|169|(1:173)|(2:179|180)|(1:176)|177|178|54|55|19)|245) */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0385, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0386, code lost:
    
        r25 = r2;
        r7 = null;
        r6 = null;
        r10 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0269 A[Catch: all -> 0x0282, Exception -> 0x0284, TRY_LEAVE, TryCatch #30 {Exception -> 0x0284, all -> 0x0282, blocks: (B:147:0x0241, B:148:0x0258, B:150:0x0269, B:153:0x0270, B:156:0x027b), top: B:146:0x0241 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0406 A[Catch: Exception -> 0x040e, TryCatch #15 {Exception -> 0x040e, blocks: (B:34:0x0401, B:26:0x0406, B:28:0x040b), top: B:33:0x0401 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x040b A[Catch: Exception -> 0x040e, TRY_LEAVE, TryCatch #15 {Exception -> 0x040e, blocks: (B:34:0x0401, B:26:0x0406, B:28:0x040b), top: B:33:0x0401 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0401 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x03bd A[Catch: all -> 0x03fa, TryCatch #10 {all -> 0x03fa, blocks: (B:38:0x03a0, B:40:0x03bd, B:42:0x03c5, B:43:0x03cc, B:45:0x03d0, B:47:0x03d4), top: B:37:0x03a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03d0 A[Catch: all -> 0x03fa, TryCatch #10 {all -> 0x03fa, blocks: (B:38:0x03a0, B:40:0x03bd, B:42:0x03c5, B:43:0x03cc, B:45:0x03d0, B:47:0x03d4), top: B:37:0x03a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03ec A[Catch: Exception -> 0x03f4, TryCatch #4 {Exception -> 0x03f4, blocks: (B:57:0x03e7, B:50:0x03ec, B:52:0x03f1), top: B:56:0x03e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03f1 A[Catch: Exception -> 0x03f4, TRY_LEAVE, TryCatch #4 {Exception -> 0x03f4, blocks: (B:57:0x03e7, B:50:0x03ec, B:52:0x03f1), top: B:56:0x03e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v5, types: [int] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30, types: [com.tencent.mm.network.i2] */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v34, types: [com.tencent.mm.network.j2] */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v38, types: [int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 1040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c01.n7.run():void");
    }
}
